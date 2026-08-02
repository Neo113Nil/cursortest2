package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.feed.MediaExternalVideoDialog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t61 extends y8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t61(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y8, defpackage.ynl
    public void b(snl snlVar, String str) {
        switch (this.a) {
            case 0:
                snlVar.getClass();
                str.getClass();
                u61 u61Var = (u61) this.b;
                ((ImageView) u61Var.c.f).setOnClickListener(new cn(5, str, u61Var));
                break;
            default:
                super.b(snlVar, str);
                break;
        }
    }

    @Override // defpackage.y8, defpackage.ynl
    public final void f(snl snlVar, bne bneVar) {
        snl snlVar2;
        snl snlVar3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                snlVar.getClass();
                u61 u61Var = (u61) obj;
                boolean z = u61Var.e;
                bv1 bv1Var = u61Var.c;
                int ordinal = bneVar.ordinal();
                if (ordinal == 2) {
                    u61Var.d = false;
                } else if (ordinal == 3) {
                    u61Var.d = true;
                } else if (ordinal == 4) {
                    u61Var.d = false;
                }
                u61Var.b(!u61Var.d);
                bne bneVar2 = bne.d;
                if (bneVar != bneVar2 && bneVar != bne.e && bneVar != bne.g) {
                    u61Var.b(false);
                    if (bneVar == bne.f) {
                        u61Var.a();
                        View view = (View) bv1Var.g;
                        view.setBackgroundColor(view.getContext().getColor(R.color.transparent));
                        ((ImageView) bv1Var.e).setVisibility(z ? 4 : 0);
                    }
                    if (bneVar == bne.b) {
                        ((ProgressBar) bv1Var.h).setVisibility(8);
                        ((ImageView) bv1Var.e).setVisibility(z ? 0 : 8);
                        break;
                    }
                } else {
                    View view2 = (View) bv1Var.g;
                    view2.setBackgroundColor(view2.getContext().getColor(R.color.transparent));
                    ((ProgressBar) bv1Var.h).setVisibility(8);
                    if (z) {
                        ((ImageView) bv1Var.e).setVisibility(0);
                    }
                    u61Var.b(bneVar == bneVar2);
                    break;
                }
                break;
            default:
                fye fyeVar = ((MediaExternalVideoDialog) obj).w;
                snlVar.getClass();
                int ordinal2 = bneVar.ordinal();
                if (ordinal2 == 3) {
                    if (fyeVar != null && (snlVar2 = fyeVar.a) != null) {
                        xnl xnlVar = (xnl) snlVar2;
                        xnlVar.b(xnlVar.a, "unMute", new Object[0]);
                        break;
                    }
                } else if (ordinal2 == 4 && fyeVar != null && (snlVar3 = fyeVar.a) != null) {
                    xnl xnlVar2 = (xnl) snlVar3;
                    xnlVar2.b(xnlVar2.a, CampaignEx.JSON_NATIVE_VIDEO_MUTE, new Object[0]);
                    break;
                }
                break;
        }
    }
}
