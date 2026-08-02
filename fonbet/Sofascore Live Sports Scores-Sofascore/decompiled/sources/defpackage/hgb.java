package defpackage;

import com.google.android.gms.auth.api.signin.internal.zbc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class hgb extends ltk {
    public static final uu4 d = new uu4(2);
    public final zwh b = new zwh(0);
    public boolean c = false;

    @Override // defpackage.ltk
    public final void e() {
        zwh zwhVar = this.b;
        int e = zwhVar.e();
        for (int i = 0; i < e; i++) {
            fgb fgbVar = (fgb) zwhVar.f(i);
            zbc zbcVar = fgbVar.l;
            zbcVar.b();
            zbcVar.d = true;
            ggb ggbVar = fgbVar.n;
            if (ggbVar != null) {
                fgbVar.i(ggbVar);
            }
            fgb fgbVar2 = zbcVar.a;
            if (fgbVar2 == null) {
                a70.r("No listener register");
                return;
            }
            if (fgbVar2 != fgbVar) {
                a70.p("Attempting to unregister the wrong listener");
                return;
            }
            zbcVar.a = null;
            if (ggbVar != null) {
                boolean z = ggbVar.b;
            }
            zbcVar.e = true;
            zbcVar.c = false;
            zbcVar.d = false;
            zbcVar.f = false;
        }
        int i2 = zwhVar.d;
        Object[] objArr = zwhVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        zwhVar.d = 0;
        zwhVar.a = false;
    }
}
