package defpackage;

import android.os.Handler;
import android.view.View;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class hn6 implements ynl {
    public final View a;
    public boolean b;
    public boolean c;
    public boolean d = true;
    public final wb3 e = new wb3(this, 25);

    public hn6(View view) {
        this.a = view;
    }

    @Override // defpackage.ynl
    public final void a(snl snlVar, ane aneVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void b(snl snlVar, String str) {
        snlVar.getClass();
        str.getClass();
    }

    @Override // defpackage.ynl
    public final void c(snl snlVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void d(snl snlVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void e(snl snlVar, float f) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void f(snl snlVar, bne bneVar) {
        snlVar.getClass();
        int ordinal = bneVar.ordinal();
        if (ordinal == 2) {
            this.b = false;
        } else if (ordinal == 3) {
            this.b = true;
        } else if (ordinal == 4) {
            this.b = false;
        }
        switch (bneVar.ordinal()) {
            case 0:
                k(1.0f);
                break;
            case 1:
            case 5:
                k(1.0f);
                this.c = false;
                break;
            case 2:
                k(1.0f);
                break;
            case 3:
            case 4:
            case 6:
                this.c = true;
                bne bneVar2 = bne.d;
                wb3 wb3Var = this.e;
                View view = this.a;
                if (bneVar != bneVar2) {
                    Handler handler = view.getHandler();
                    if (handler != null) {
                        handler.removeCallbacks(wb3Var);
                        break;
                    }
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.postDelayed(wb3Var, Ua.C);
                        break;
                    }
                }
                break;
            default:
                zzl.b();
                break;
        }
    }

    @Override // defpackage.ynl
    public final void g(snl snlVar, zme zmeVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void h(snl snlVar, float f) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void i(snl snlVar, yme ymeVar) {
        snlVar.getClass();
    }

    @Override // defpackage.ynl
    public final void j(snl snlVar, float f) {
        snlVar.getClass();
    }

    public final void k(float f) {
        if (this.c) {
            this.d = !(f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            wb3 wb3Var = this.e;
            View view = this.a;
            if (f == 1.0f && this.b) {
                Handler handler = view.getHandler();
                if (handler != null) {
                    handler.postDelayed(wb3Var, Ua.C);
                }
            } else {
                Handler handler2 = view.getHandler();
                if (handler2 != null) {
                    handler2.removeCallbacks(wb3Var);
                }
            }
            view.animate().alpha(f).setDuration(300L).setListener(new gn6(f, this)).start();
        }
    }
}
