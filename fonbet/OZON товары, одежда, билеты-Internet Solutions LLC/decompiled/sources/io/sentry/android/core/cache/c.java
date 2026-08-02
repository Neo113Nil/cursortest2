package io.sentry.android.core.cache;

import B0.A0;
import android.os.SystemClock;
import io.sentry.E;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.performance.j;
import io.sentry.android.core.performance.l;
import io.sentry.cache.f;
import io.sentry.util.g;
import io.sentry.util.h;
import io.sentry.util.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: l, reason: collision with root package name */
    private static final List<a<?>> f67078l = Arrays.asList(new a(AnrV2Integration.a.class, "ANR", "last_anr_report", new io.sentry.android.core.cache.a()), new a(TombstoneIntegration.a.class, "Tombstone", "last_tombstone_report", new b()));

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f67079m = 0;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.b f67080k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<T> f67081a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f67082b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f67083c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC1102a<T> f67084d;

        /* renamed from: io.sentry.android.core.cache.c$a$a, reason: collision with other inner class name */
        interface InterfaceC1102a<T> {
            @NotNull
            Long a(T t2);
        }

        a(@NotNull Class<T> cls, @NotNull String str, @NotNull String str2, @NotNull InterfaceC1102a<T> interfaceC1102a) {
            this.f67081a = cls;
            this.f67082b = str;
            this.f67083c = str2;
            this.f67084d = interfaceC1102a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void a(@NotNull c cVar, @NotNull E e11, @NotNull SentryAndroidOptions sentryAndroidOptions) {
            Object d11 = e11.d("sentry:typeCheckHint");
            if (!this.f67081a.isInstance(e11.d("sentry:typeCheckHint")) || d11 == null) {
                return;
            }
            Long a11 = this.f67084d.a(d11);
            ILogger logger = sentryAndroidOptions.getLogger();
            I2 i22 = I2.DEBUG;
            String str = this.f67082b;
            logger.c(i22, "Writing last reported %s marker with timestamp %d", str, a11);
            c.m(cVar, a11, this.f67083c, str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        super(sentryAndroidOptions, r1, sentryAndroidOptions.getMaxCacheItems());
        io.sentry.android.core.internal.util.b a11 = io.sentry.android.core.internal.util.b.a();
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        p.b(cacheDirPath, "cacheDirPath must not be null");
        this.f67080k = a11;
    }

    static void m(c cVar, Long l11, String str, String str2) {
        W2 w22 = cVar.f67780a;
        String cacheDirPath = w22.getCacheDirPath();
        if (cacheDirPath == null) {
            w22.getLogger().c(I2.DEBUG, A0.b("Cache dir path is null, the ", str2, " marker will not be written"), new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l11).getBytes(f67779e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            w22.getLogger().a(I2.ERROR, A0.b("Error writing the ", str2, " marker to the disk"), th2);
        }
    }

    public static Long n(@NotNull W2 w22) {
        return o(w22, "last_anr_report", "ANR");
    }

    private static Long o(@NotNull W2 w22, @NotNull String str, @NotNull String str2) {
        String cacheDirPath = w22.getCacheDirPath();
        p.b(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String c11 = g.c(file);
            if (c11 != null && !c11.equals("null")) {
                return Long.valueOf(Long.parseLong(c11.trim()));
            }
            return null;
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                w22.getLogger().c(I2.DEBUG, A0.b("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            w22.getLogger().a(I2.ERROR, A0.b("Error reading last ", str2, " marker"), th2);
            return null;
        }
    }

    public static Long q(@NotNull W2 w22) {
        return o(w22, "last_tombstone_report", "Tombstone");
    }

    private boolean r(@NotNull V1 v12, @NotNull E e11) {
        boolean L12 = super.L1(v12, e11);
        W2 w22 = this.f67780a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w22;
        l n11 = j.m().n();
        if (h.b(e11, UncaughtExceptionHandlerIntegration.a.class) && n11.j()) {
            this.f67080k.getClass();
            long uptimeMillis = SystemClock.uptimeMillis() - n11.g();
            if (uptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                I2 i22 = I2.DEBUG;
                logger.c(i22, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(uptimeMillis));
                String outboxPath = w22.getOutboxPath();
                if (outboxPath == null) {
                    w22.getLogger().c(i22, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th2) {
                        w22.getLogger().a(I2.ERROR, "Error writing the startup crash marker file to the disk", th2);
                    }
                }
            }
        }
        Iterator<a<?>> it = f67078l.iterator();
        while (it.hasNext()) {
            it.next().a(this, e11, sentryAndroidOptions);
        }
        return L12;
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public final void E1(@NotNull V1 v12, @NotNull E e11) {
        r(v12, e11);
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public final boolean L1(@NotNull V1 v12, @NotNull E e11) {
        return r(v12, e11);
    }
}
