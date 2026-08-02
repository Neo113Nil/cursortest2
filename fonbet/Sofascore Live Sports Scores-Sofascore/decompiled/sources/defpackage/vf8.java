package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vf8 implements sf8 {
    public final u00 a;
    public final v00 b;
    public final y3g c;
    public final zf8 d;
    public final yia e;
    public final yx7 f;

    public vf8(u00 u00Var, v00 v00Var) {
        y3g y3gVar = wf8.a;
        zf8 zf8Var = new zf8(wf8.b);
        yia yiaVar = new yia((byte) 0, 10);
        this.a = u00Var;
        this.b = v00Var;
        this.c = y3gVar;
        this.d = zf8Var;
        this.e = yiaVar;
        this.f = new yx7(this, 11);
    }

    public final i6k b(f6k f6kVar) {
        y3g y3gVar = this.c;
        uf8 uf8Var = new uf8(0, this, f6kVar);
        synchronized (((ubf) y3gVar.b)) {
            i6k i6kVar = (i6k) ((zmb) y3gVar.c).c(f6kVar);
            if (i6kVar != null) {
                if (i6kVar.a()) {
                    return i6kVar;
                }
            }
            try {
                i6k i6kVar2 = (i6k) uf8Var.invoke(new mwj(10, y3gVar, f6kVar));
                synchronized (((ubf) y3gVar.b)) {
                    try {
                        if (((zmb) y3gVar.c).c(f6kVar) == null && i6kVar2.a()) {
                            ((zmb) y3gVar.c).d(f6kVar, i6kVar2);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return i6kVar2;
            } catch (Exception e) {
                sw9.m("Could not load font", e);
                return null;
            }
        }
    }

    public final i6k c(tf8 tf8Var, wg8 wg8Var, int i, int i2) {
        int i3 = this.b.a;
        return b(new f6k(tf8Var, (i3 == 0 || i3 == Integer.MAX_VALUE) ? wg8Var : new wg8(llf.c(wg8Var.a + i3, 1, 1000)), i, i2, null));
    }
}
