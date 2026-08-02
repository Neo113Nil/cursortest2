package defpackage;

import com.google.android.gms.auth.api.signin.internal.zbc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fgb extends yzc {
    public final zbc l;
    public u6b m;
    public ggb n;

    public fgb(zbc zbcVar) {
        this.l = zbcVar;
        if (zbcVar.a == null) {
            zbcVar.a = this;
        } else {
            a70.r("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.keb
    public final void g() {
        zbc zbcVar = this.l;
        zbcVar.c = true;
        zbcVar.e = false;
        zbcVar.d = false;
        zbcVar.j.drainPermits();
        zbcVar.c();
    }

    @Override // defpackage.keb
    public final void h() {
        this.l.c = false;
    }

    @Override // defpackage.keb
    public final void i(skd skdVar) {
        super.i(skdVar);
        this.m = null;
        this.n = null;
    }

    public final void l() {
        u6b u6bVar = this.m;
        ggb ggbVar = this.n;
        if (u6bVar == null || ggbVar == null) {
            return;
        }
        super.i(ggbVar);
        e(u6bVar, ggbVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
