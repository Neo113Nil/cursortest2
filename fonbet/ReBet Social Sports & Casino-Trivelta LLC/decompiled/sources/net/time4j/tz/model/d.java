package net.time4j.tz.model;

import li.InterfaceC5467a;
import net.time4j.C5717j;
import net.time4j.EnumC5714g;
import net.time4j.F;
import net.time4j.G;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final transient long f58382a;

    /* renamed from: b, reason: collision with root package name */
    public final transient G f58383b;

    /* renamed from: c, reason: collision with root package name */
    public final transient i f58384c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f58385d;

    public d(int i10, i iVar, int i11) {
        if (iVar == null) {
            throw new NullPointerException("Missing offset indicator.");
        }
        if (i11 != Integer.MAX_VALUE && (i11 < -64800 || i11 > 64800)) {
            throw new IllegalArgumentException("DST out of range: " + i11);
        }
        if (i10 == 86400) {
            this.f58382a = 0L;
            this.f58383b = G.y0();
        } else {
            C5717j J02 = G.z0().J0(i10, EnumC5714g.f58145c);
            this.f58382a = J02.a();
            this.f58383b = J02.b();
        }
        this.f58384c = iVar;
        this.f58385d = i11 == Integer.MAX_VALUE ? 0 : i11;
    }

    public abstract String a();

    public abstract F b(int i10);

    public final long c() {
        return this.f58382a;
    }

    public final i d() {
        return this.f58384c;
    }

    public final int e() {
        return this.f58385d;
    }

    public final G f() {
        return this.f58383b;
    }

    public abstract int g();

    public abstract int h(long j10);

    public abstract int i(InterfaceC5467a interfaceC5467a);
}
