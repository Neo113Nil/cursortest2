package n9;

import android.app.job.JobInfo;
import d9.EnumC4042e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n9.C5678c;
import q9.InterfaceC6129a;

/* renamed from: n9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5681f {

    /* renamed from: n9.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC6129a f57095a;

        /* renamed from: b, reason: collision with root package name */
        public Map f57096b = new HashMap();

        public a a(EnumC4042e enumC4042e, b bVar) {
            this.f57096b.put(enumC4042e, bVar);
            return this;
        }

        public AbstractC5681f b() {
            if (this.f57095a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f57096b.keySet().size() < EnumC4042e.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f57096b;
            this.f57096b = new HashMap();
            return AbstractC5681f.d(this.f57095a, map);
        }

        public a c(InterfaceC6129a interfaceC6129a) {
            this.f57095a = interfaceC6129a;
            return this;
        }
    }

    /* renamed from: n9.f$b */
    public static abstract class b {

        /* renamed from: n9.f$b$a */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new C5678c.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    /* renamed from: n9.f$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static AbstractC5681f d(InterfaceC6129a interfaceC6129a, Map map) {
        return new C5677b(interfaceC6129a, map);
    }

    public static AbstractC5681f f(InterfaceC6129a interfaceC6129a) {
        return b().a(EnumC4042e.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(EnumC4042e.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC4042e.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC6129a).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r7)));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC4042e enumC4042e, long j10, int i10) {
        builder.setMinimumLatency(g(enumC4042e, j10, i10));
        j(builder, ((b) h().get(enumC4042e)).c());
        return builder;
    }

    public abstract InterfaceC6129a e();

    public long g(EnumC4042e enumC4042e, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = (b) h().get(enumC4042e);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
