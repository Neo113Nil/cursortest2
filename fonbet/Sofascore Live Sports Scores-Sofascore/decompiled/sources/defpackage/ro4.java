package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ro4 implements ic5 {
    public final cc5 a;
    public xb5 b;
    public boolean c;
    public final /* synthetic */ so4 d;

    public ro4(so4 so4Var, cc5 cc5Var) {
        this.d = so4Var;
        this.a = cc5Var;
    }

    @Override // defpackage.ic5
    public final void release() {
        Handler handler = this.d.t;
        handler.getClass();
        nik.X(handler, new wb3(this, 8));
    }
}
