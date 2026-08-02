package net.time4j;

import java.util.Iterator;
import kotlin.time.DurationKt;
import li.AbstractC5469c;
import li.AbstractC5470d;
import li.InterfaceC5471e;
import qi.C6183d;
import qi.EnumC6185f;
import qi.InterfaceC6184e;

/* loaded from: classes5.dex */
public final class P implements InterfaceC5471e {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC6184e f57649c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f57650d;

    /* renamed from: e, reason: collision with root package name */
    public static final P f57651e;

    /* renamed from: f, reason: collision with root package name */
    public static final P f57652f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57653a;

    /* renamed from: b, reason: collision with root package name */
    public final long f57654b;

    public static class b implements InterfaceC6184e {
        public b() {
        }

        @Override // qi.InterfaceC6184e
        public String a() {
            return "";
        }

        @Override // qi.InterfaceC6184e
        public long getNanos() {
            return System.nanoTime();
        }
    }

    static {
        InterfaceC6184e interfaceC6184e;
        String property = System.getProperty("java.vm.name");
        Iterator it = AbstractC5470d.c().g(InterfaceC6184e.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC6184e = null;
                break;
            } else {
                interfaceC6184e = (InterfaceC6184e) it.next();
                if (property.equals(interfaceC6184e.a())) {
                    break;
                }
            }
        }
        if (interfaceC6184e == null) {
            interfaceC6184e = new b();
        }
        f57649c = interfaceC6184e;
        f57650d = Boolean.getBoolean("net.time4j.systemclock.nanoTime");
        f57651e = new P(false, a());
        f57652f = new P(true, a());
    }

    public P(boolean z10, long j10) {
        this.f57653a = z10;
        this.f57654b = j10;
    }

    public static long a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = 0;
        int i10 = 0;
        while (i10 < 10) {
            j10 = f57650d ? System.nanoTime() : f57649c.getNanos();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis == currentTimeMillis2) {
                break;
            }
            i10++;
            currentTimeMillis = currentTimeMillis2;
        }
        return AbstractC5469c.m(AbstractC5469c.i(C6183d.q().h(AbstractC5469c.b(currentTimeMillis, 1000)), 1000000000L) + (AbstractC5469c.d(currentTimeMillis, 1000) * DurationKt.NANOS_IN_MILLIS), j10);
    }

    public static A b() {
        return f57651e.c();
    }

    public A c() {
        if ((this.f57653a || f57650d) && C6183d.q().u()) {
            long d10 = d();
            return A.f0(AbstractC5469c.b(d10, 1000000000), AbstractC5469c.d(d10, 1000000000), EnumC6185f.UTC);
        }
        long currentTimeMillis = System.currentTimeMillis();
        return A.f0(AbstractC5469c.b(currentTimeMillis, 1000), AbstractC5469c.d(currentTimeMillis, 1000) * DurationKt.NANOS_IN_MILLIS, EnumC6185f.POSIX);
    }

    public final long d() {
        return AbstractC5469c.f(f57650d ? System.nanoTime() : f57649c.getNanos(), this.f57654b);
    }
}
