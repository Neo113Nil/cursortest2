package io.sentry;

import io.sentry.h3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC7147g1 implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f67920c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W2 f67921a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A1 f67922b;

    RunnableC7147g1(@NotNull A1 a12, @NotNull W2 w22) {
        this.f67921a = w22;
        this.f67922b = a12;
    }

    private Date a(@NotNull File file) {
        W2 w22 = this.f67921a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f67920c));
            try {
                String readLine = bufferedReader.readLine();
                w22.getLogger().c(I2.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date d11 = C7165l.d(readLine);
                bufferedReader.close();
                return d11;
            } finally {
            }
        } catch (IOException e11) {
            w22.getLogger().a(I2.ERROR, "Error reading the crash marker file.", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            w22.getLogger().b(I2.ERROR, e12, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        W2 w22 = this.f67921a;
        String cacheDirPath = w22.getCacheDirPath();
        if (cacheDirPath == null) {
            w22.getLogger().c(I2.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = w22.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).k()) {
            w22.getLogger().c(I2.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        int i11 = io.sentry.cache.f.f67785j;
        File file = new File(cacheDirPath, "previous_session.json");
        InterfaceC7126b0 serializer = w22.getSerializer();
        if (file.exists()) {
            w22.getLogger().c(I2.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f67920c));
                try {
                    h3 h3Var = (h3) serializer.c(bufferedReader, h3.class);
                    if (h3Var == null) {
                        w22.getLogger().c(I2.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(w22.getCacheDirPath(), ".sentry-native/last_crash");
                        h3.b i12 = h3Var.i();
                        h3.b bVar = h3.b.Crashed;
                        if (i12 == bVar) {
                            S1 a11 = S1.a();
                            a11.b();
                            a11.c();
                        } else if (file2.exists()) {
                            w22.getLogger().c(I2.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date a12 = a(file2);
                            h3Var.m(bVar, null, true, null);
                            h3Var.b(a12);
                        } else if (h3Var.d() == null) {
                            h3Var.b(C7165l.b());
                        }
                        if (file2.exists() && !file2.delete()) {
                            w22.getLogger().c(I2.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        this.f67922b.k(new V1(null, w22.getSdkVersion(), C7222x2.m(serializer, h3Var)), new E());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                w22.getLogger().a(I2.ERROR, "Error processing previous session.", th2);
            }
            if (file.delete()) {
                return;
            }
            w22.getLogger().c(I2.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
