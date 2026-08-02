package io.sentry.android.core.cache;

import io.sentry.C4866x2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.J;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.cache.d;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.performance.m;
import io.sentry.android.core.performance.n;
import io.sentry.cache.f;
import io.sentry.transport.o;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.l;
import io.sentry.util.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: k, reason: collision with root package name */
    public static final List f50939k = Arrays.asList(new a(AnrV2Integration.a.class, "ANR", "last_anr_report", new a.InterfaceC0746a() { // from class: io.sentry.android.core.cache.a
        @Override // io.sentry.android.core.cache.d.a.InterfaceC0746a
        public final Long extract(Object obj) {
            Long a10;
            a10 = ((AnrV2Integration.a) obj).a();
            return a10;
        }
    }), new a(TombstoneIntegration.a.class, "Tombstone", "last_tombstone_report", new a.InterfaceC0746a() { // from class: io.sentry.android.core.cache.b
        @Override // io.sentry.android.core.cache.d.a.InterfaceC0746a
        public final Long extract(Object obj) {
            Long a10;
            a10 = ((TombstoneIntegration.a) obj).a();
            return a10;
        }
    }));

    /* renamed from: j, reason: collision with root package name */
    public final o f50940j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f50941a;

        /* renamed from: b, reason: collision with root package name */
        public final String f50942b;

        /* renamed from: c, reason: collision with root package name */
        public final String f50943c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC0746a f50944d;

        /* renamed from: io.sentry.android.core.cache.d$a$a, reason: collision with other inner class name */
        public interface InterfaceC0746a {
            Long extract(Object obj);
        }

        public a(Class cls, String str, String str2, InterfaceC0746a interfaceC0746a) {
            this.f50941a = cls;
            this.f50942b = str;
            this.f50943c = str2;
            this.f50944d = interfaceC0746a;
        }

        public static /* synthetic */ void a(a aVar, SentryAndroidOptions sentryAndroidOptions, d dVar, Object obj) {
            Long extract = aVar.f50944d.extract(obj);
            sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "Writing last reported %s marker with timestamp %d", aVar.f50942b, extract);
            dVar.N(extract, aVar.f50943c, aVar.f50942b);
        }

        public void b(final d dVar, J j10, final SentryAndroidOptions sentryAndroidOptions) {
            l.h(j10, this.f50941a, new l.a() { // from class: io.sentry.android.core.cache.c
                @Override // io.sentry.util.l.a
                public final void accept(Object obj) {
                    d.a.a(d.a.this, sentryAndroidOptions, dVar, obj);
                }
            });
        }
    }

    public d(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, h.b());
    }

    public static boolean H(F3 f32) {
        String outboxPath = f32.getOutboxPath();
        if (outboxPath == null) {
            f32.getLogger().c(EnumC4788n3.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean exists = file.exists();
            if (!exists || file.delete()) {
                return exists;
            }
            f32.getLogger().c(EnumC4788n3.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return exists;
        } catch (Throwable th2) {
            f32.getLogger().b(EnumC4788n3.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            return false;
        }
    }

    public static Long I(F3 f32) {
        return K(f32, "last_anr_report", "ANR");
    }

    public static Long K(F3 f32, String str, String str2) {
        File file = new File((String) w.c(f32.getCacheDirPath(), "Cache dir path should be set for getting " + str2 + "s reported"), str);
        try {
            String c10 = AbstractC4851i.c(file);
            if (c10 != null && !c10.equals("null")) {
                return Long.valueOf(Long.parseLong(c10.trim()));
            }
            return null;
        } catch (Throwable th2) {
            if (th2 instanceof FileNotFoundException) {
                f32.getLogger().c(EnumC4788n3.DEBUG, "Last " + str2 + " marker does not exist. %s.", file.getAbsolutePath());
            } else {
                f32.getLogger().b(EnumC4788n3.ERROR, "Error reading last " + str2 + " marker", th2);
            }
            return null;
        }
    }

    public static Long L(F3 f32) {
        return K(f32, "last_tombstone_report", "Tombstone");
    }

    public final boolean M(C4866x2 c4866x2, J j10) {
        boolean w02 = super.w0(c4866x2, j10);
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f51923a;
        n w10 = m.v().w();
        if (l.f(j10, UncaughtExceptionHandlerIntegration.a.class) && w10.m()) {
            long a10 = this.f50940j.a() - w10.j();
            if (a10 <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(a10));
                O();
            }
        }
        Iterator it = f50939k.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this, j10, sentryAndroidOptions);
        }
        return w02;
    }

    public final void N(Long l10, String str, String str2) {
        String cacheDirPath = this.f51923a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Cache dir path is null, the " + str2 + " marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(io.sentry.cache.c.f51922e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Error writing the " + str2 + " marker to the disk", th2);
        }
    }

    public final void O() {
        String outboxPath = this.f51923a.getOutboxPath();
        if (outboxPath == null) {
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Error writing the startup crash marker file to the disk", th2);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean w0(C4866x2 c4866x2, J j10) {
        return M(c4866x2, j10);
    }

    public d(SentryAndroidOptions sentryAndroidOptions, o oVar) {
        super(sentryAndroidOptions, (String) w.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f50940j = oVar;
    }
}
