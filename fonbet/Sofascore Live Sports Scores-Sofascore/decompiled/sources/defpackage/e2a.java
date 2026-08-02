package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e2a implements c80 {
    public final yd5 a;
    public final bzf b;
    public final long c;

    public e2a(yd5 yd5Var, bzf bzfVar, long j) {
        this.a = yd5Var;
        this.b = bzfVar;
        this.c = j;
        if (yd5Var instanceof i4k) {
            i4k i4kVar = (i4k) yd5Var;
            if (i4kVar.a != 0 || i4kVar.b != 0) {
                return;
            }
        } else if (yd5Var instanceof mnh) {
            if (((mnh) yd5Var).a != 0) {
                return;
            }
        } else if (!(yd5Var instanceof tja) || ((tja) yd5Var).a.a != 0) {
            return;
        }
        a70.p("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.c80
    public final nmk a(q4k q4kVar) {
        return new c78(this.a.a(q4kVar), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e2a) {
            e2a e2aVar = (e2a) obj;
            if (e2aVar.a.equals(this.a) && e2aVar.b == this.b && e2aVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
