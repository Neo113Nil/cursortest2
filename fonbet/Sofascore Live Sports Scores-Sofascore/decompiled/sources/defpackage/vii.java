package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vii implements vke, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ cji a;

    public vii(cji cjiVar) {
        this.a = cjiVar;
    }

    @Override // defpackage.vke
    public final void m(tke tkeVar) {
        i78 i78Var = tkeVar.a;
        boolean a = tkeVar.a(4, 5);
        cji cjiVar = this.a;
        if (a) {
            cjiVar.k();
        }
        if (tkeVar.a(4, 5, 7)) {
            cjiVar.m();
        }
        if (i78Var.a.get(8)) {
            cjiVar.n();
        }
        if (i78Var.a.get(9)) {
            cjiVar.p();
        }
        if (tkeVar.a(8, 9, 11, 0, 16, 17, 13)) {
            cjiVar.j();
        }
        if (tkeVar.a(11, 0)) {
            cjiVar.q();
        }
        if (i78Var.a.get(12)) {
            cjiVar.l();
        }
        if (i78Var.a.get(2)) {
            cjiVar.r();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cji cjiVar = this.a;
        ImageView imageView = cjiVar.w;
        View view2 = cjiVar.B;
        View view3 = cjiVar.A;
        View view4 = cjiVar.z;
        hji hjiVar = cjiVar.a;
        zke zkeVar = cjiVar.h0;
        if (zkeVar == null) {
            return;
        }
        hjiVar.g();
        if (cjiVar.n == view) {
            ((ug6) zkeVar).D();
            return;
        }
        if (cjiVar.m == view) {
            ((ug6) zkeVar).E();
            return;
        }
        int i = 0;
        if (cjiVar.p == view) {
            ug6 ug6Var = (ug6) zkeVar;
            if (ug6Var.o() != 4) {
                ug6Var.T();
                long h = ug6Var.h() + ug6Var.v;
                long m = ug6Var.m();
                if (m != C.TIME_UNSET) {
                    h = Math.min(h, m);
                }
                long max = Math.max(h, 0L);
                int g = ug6Var.g();
                ug6Var.T();
                ug6Var.C(max, g, false);
                return;
            }
            return;
        }
        if (cjiVar.q == view) {
            ug6 ug6Var2 = (ug6) zkeVar;
            ug6Var2.T();
            long h2 = ug6Var2.h() + (-ug6Var2.u);
            long m2 = ug6Var2.m();
            if (m2 != C.TIME_UNSET) {
                h2 = Math.min(h2, m2);
            }
            long max2 = Math.max(h2, 0L);
            int g2 = ug6Var2.g();
            ug6Var2.T();
            ug6Var2.C(max2, g2, false);
            return;
        }
        if (cjiVar.o == view) {
            ug6 ug6Var3 = (ug6) zkeVar;
            int o = ug6Var3.o();
            if (o != 1 && o != 4 && ug6Var3.n()) {
                ug6Var3.J(false);
                return;
            }
            int o2 = ug6Var3.o();
            if (o2 == 1) {
                ug6Var3.y();
            } else if (o2 == 4) {
                int g3 = ug6Var3.g();
                ug6Var3.T();
                ug6Var3.C(C.TIME_UNSET, g3, false);
            }
            ug6Var3.J(true);
            return;
        }
        if (cjiVar.t == view) {
            ug6 ug6Var4 = (ug6) zkeVar;
            ug6Var4.T();
            int i2 = ug6Var4.F;
            int i3 = cjiVar.q0;
            for (int i4 = 1; i4 <= 2; i4++) {
                int i5 = (i2 + i4) % 3;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2 && (i3 & 2) != 0) {
                        }
                    } else if ((i3 & 1) == 0) {
                    }
                }
                i2 = i5;
            }
            ug6Var4.K(i2);
            return;
        }
        if (cjiVar.u == view) {
            ug6 ug6Var5 = (ug6) zkeVar;
            ug6Var5.T();
            boolean z = !ug6Var5.G;
            rd4 rd4Var = ug6Var5.l;
            ug6Var5.T();
            if (ug6Var5.G != z) {
                ug6Var5.G = z;
                yqi yqiVar = ug6Var5.k.h;
                yqiVar.getClass();
                wqi b = yqi.b();
                b.a = yqiVar.a.obtainMessage(12, z ? 1 : 0, 0);
                b.b();
                rd4Var.j(9, new fg6(z, i));
                ug6Var5.P();
                rd4Var.h();
                return;
            }
            return;
        }
        if (view4 == view) {
            hjiVar.f();
            cjiVar.c(cjiVar.f, view4);
            return;
        }
        if (view3 == view) {
            hjiVar.f();
            cjiVar.c(cjiVar.g, view3);
        } else if (view2 == view) {
            hjiVar.f();
            cjiVar.c(cjiVar.i, view2);
        } else if (imageView == view) {
            hjiVar.f();
            cjiVar.c(cjiVar.h, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        cji cjiVar = this.a;
        if (cjiVar.w0) {
            cjiVar.a.g();
        }
    }
}
