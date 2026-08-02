package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f16367b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16368a;

    public e3(b6 b6Var) {
        this.f16368a = b6Var;
    }

    public final Date a(File file) {
        b6 b6Var = this.f16368a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f16367b));
            try {
                String readLine = bufferedReader.readLine();
                b6Var.getLogger().h(b5.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date p10 = com.google.android.play.core.appupdate.b.p(readLine);
                bufferedReader.close();
                return p10;
            } finally {
            }
        } catch (IOException e7) {
            b6Var.getLogger().e(b5.ERROR, "Error reading the crash marker file.", e7);
            return null;
        } catch (IllegalArgumentException e9) {
            b6Var.getLogger().b(b5.ERROR, e9, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6 b6Var = this.f16368a;
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            b6Var.getLogger().h(b5.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!b6Var.isEnableAutoSessionTracking()) {
            b6Var.getLogger().h(b5.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = b6Var.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).f()) {
            b6Var.getLogger().h(b5.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.f16240i;
        File file = new File(cacheDirPath, "previous_session.json");
        g1 serializer = b6Var.getSerializer();
        if (file.exists()) {
            b6Var.getLogger().h(b5.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f16367b));
                try {
                    l6 l6Var = (l6) serializer.c(bufferedReader, l6.class);
                    if (l6Var == null) {
                        b6Var.getLogger().h(b5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(b6Var.getCacheDirPath(), ".sentry-native/last_crash");
                        k6 k6Var = l6Var.f16616g;
                        k6 k6Var2 = k6.Crashed;
                        if (k6Var == k6Var2) {
                            j4 j4Var = j4.f16563c;
                            r a7 = j4Var.f16565b.a();
                            try {
                                j4Var.f16564a = false;
                                a7.close();
                                j4Var.a();
                            } finally {
                            }
                        } else if (file2.exists()) {
                            b6Var.getLogger().h(b5.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date a10 = a(file2);
                            l6Var.d(k6Var2, null, true, null);
                            l6Var.b(a10);
                        } else if (l6Var.f16622n == null) {
                            l6Var.b(com.google.android.play.core.appupdate.b.n());
                        }
                        if (file2.exists() && !file2.delete()) {
                            b6Var.getLogger().h(b5.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        d4.d().l(new l1.a((io.sentry.protocol.v) null, b6Var.getSdkVersion(), r4.d(serializer, l6Var)), new h0());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                b6Var.getLogger().e(b5.ERROR, "Error processing previous session.", th2);
            }
            if (file.delete()) {
                return;
            }
            b6Var.getLogger().h(b5.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
