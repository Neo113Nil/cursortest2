package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qw8 implements uah {
    public final ud3 a;

    public qw8(ud3 ud3Var) {
        this.a = ud3Var;
    }

    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        b20 a = e20.a();
        this.a.invoke(a, new njh(j), emaVar);
        a.d();
        return new cxd(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        qw8 qw8Var = obj instanceof qw8 ? (qw8) obj : null;
        return (qw8Var != null ? qw8Var.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
