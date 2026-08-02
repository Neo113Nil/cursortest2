package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.vungle.ads.internal.ui.view.n;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tii implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tii(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SharedPreferences d;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cji cjiVar = (cji) obj;
                String str = cjiVar.g0;
                Drawable drawable = cjiVar.e0;
                String str2 = cjiVar.f0;
                Drawable drawable2 = cjiVar.d0;
                if (cjiVar.i0 == null) {
                    return;
                }
                boolean z = cjiVar.j0;
                cjiVar.j0 = !z;
                ImageView imageView = cjiVar.x;
                if (imageView != null) {
                    if (z) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                    } else {
                        imageView.setImageDrawable(drawable2);
                        imageView.setContentDescription(str2);
                    }
                }
                ImageView imageView2 = cjiVar.y;
                boolean z2 = cjiVar.j0;
                if (imageView2 == null) {
                    return;
                }
                if (z2) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                    return;
                } else {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                    return;
                }
            case 1:
                cji cjiVar2 = ((uii) obj).e;
                zke zkeVar = cjiVar2.h0;
                if (zkeVar == null) {
                    return;
                }
                vt4 q = ((ug6) zkeVar).q();
                zke zkeVar2 = cjiVar2.h0;
                int i2 = lik.a;
                q.getClass();
                tt4 tt4Var = new tt4(q);
                tt4Var.a(1);
                tt4Var.e(1);
                ((ug6) zkeVar2).L(new vt4(tt4Var));
                ((String[]) cjiVar2.f.c)[1] = cjiVar2.getResources().getString(R.string.exo_track_selection_auto);
                cjiVar2.k.dismiss();
                return;
            case 2:
                yii yiiVar = (yii) obj;
                cji cjiVar3 = yiiVar.e;
                int adapterPosition = yiiVar.getAdapterPosition();
                float[] fArr = cji.x0;
                View view2 = cjiVar3.z;
                if (adapterPosition == 0) {
                    gne gneVar = cjiVar3.g;
                    view2.getClass();
                    cjiVar3.c(gneVar, view2);
                    return;
                } else {
                    if (adapterPosition != 1) {
                        cjiVar3.k.dismiss();
                        return;
                    }
                    uii uiiVar = cjiVar3.i;
                    view2.getClass();
                    cjiVar3.c(uiiVar, view2);
                    return;
                }
            case 3:
                cji cjiVar4 = ((uii) obj).e;
                zke zkeVar3 = cjiVar4.h0;
                if (zkeVar3 != null) {
                    vt4 q2 = ((ug6) zkeVar3).q();
                    zke zkeVar4 = cjiVar4.h0;
                    q2.getClass();
                    tt4 tt4Var2 = new tt4(q2);
                    tt4Var2.a(3);
                    tt4Var2.u = -3;
                    ((ug6) zkeVar4).L(new vt4(tt4Var2));
                    cjiVar4.k.dismiss();
                    return;
                }
                return;
            case 4:
                hji hjiVar = (hji) obj;
                hjiVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    hjiVar.q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        hjiVar.r.start();
                        return;
                    }
                    return;
                }
            case 5:
                gri griVar = (gri) obj;
                ct8 ct8Var = griVar.i;
                if (ct8Var != null) {
                    view.getClass();
                    ct8Var.invoke(view, Integer.valueOf(griVar.getAbsoluteAdapterPosition()), griVar.d());
                    return;
                }
                return;
            case 6:
                dvj dvjVar = (dvj) obj;
                kr9 kr9Var = dvjVar.e;
                kr9Var.getClass();
                TransferFilterModal transferFilterModal = new TransferFilterModal();
                transferFilterModal.B = kr9Var;
                transferFilterModal.p(dvjVar.d.k(), transferFilterModal.getTag());
                return;
            case 7:
                Context context = ((WeeklyLeaderboardFragment) obj).getContext();
                if (context != null) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "PREF_SHOW_WEEKLY_STREAK_TOOLTIP", false);
                    Unit unit = Unit.a;
                    i3.apply();
                }
                view.getClass();
                view.setVisibility(8);
                return;
            default:
                n.a((n) obj, view);
                return;
        }
    }
}
