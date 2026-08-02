package io.sentry;

import io.sentry.V3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* renamed from: io.sentry.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4865x1 implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f52879c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final F3 f52880a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4740e0 f52881b;

    public RunnableC4865x1(F3 f32, InterfaceC4740e0 interfaceC4740e0) {
        this.f52880a = f32;
        this.f52881b = interfaceC4740e0;
    }

    public final Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f52879c));
            try {
                String readLine = bufferedReader.readLine();
                this.f52880a.getLogger().c(EnumC4788n3.DEBUG, "Crash marker file has %s timestamp.", readLine);
                Date e10 = AbstractC4779m.e(readLine);
                bufferedReader.close();
                return e10;
            } finally {
            }
        } catch (IOException e11) {
            this.f52880a.getLogger().b(EnumC4788n3.ERROR, "Error reading the crash marker file.", e11);
            return null;
        } catch (IllegalArgumentException e12) {
            this.f52880a.getLogger().a(EnumC4788n3.ERROR, e12, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f52880a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f52880a.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f52880a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).A()) {
            this.f52880a.getLogger().c(EnumC4788n3.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File v10 = io.sentry.cache.f.v(cacheDirPath);
        InterfaceC4770k0 serializer = this.f52880a.getSerializer();
        if (v10.exists()) {
            this.f52880a.getLogger().c(EnumC4788n3.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(v10), f52879c));
                try {
                    V3 v32 = (V3) serializer.c(bufferedReader, V3.class);
                    if (v32 == null) {
                        this.f52880a.getLogger().c(EnumC4788n3.ERROR, "Stream from path %s resulted in a null envelope.", v10.getAbsolutePath());
                    } else {
                        File file = new File(this.f52880a.getCacheDirPath(), ".sentry-native/last_crash");
                        V3.b l10 = v32.l();
                        V3.b bVar = V3.b.Crashed;
                        if (l10 == bVar) {
                            C4841u2 a10 = C4841u2.a();
                            a10.c();
                            a10.d(true);
                        } else if (file.exists()) {
                            this.f52880a.getLogger().c(EnumC4788n3.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date a11 = a(file);
                            v32.p(bVar, null, true);
                            v32.d(a11);
                        } else if (v32.f() == null) {
                            v32.c();
                        }
                        if (file.exists() && !file.delete()) {
                            this.f52880a.getLogger().c(EnumC4788n3.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                        }
                        this.f52881b.s(C4866x2.a(serializer, v32, this.f52880a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                this.f52880a.getLogger().b(EnumC4788n3.ERROR, "Error processing previous session.", th2);
            }
            if (v10.delete()) {
                return;
            }
            this.f52880a.getLogger().c(EnumC4788n3.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
