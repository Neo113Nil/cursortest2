package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.IPlayerItemButtonStyle;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(PromotionBannerView promotionBannerView, String str, String str2, bef befVar) {
        this.a = 3;
        this.b = promotionBannerView;
        this.e = str;
        this.c = str2;
        this.d = befVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                t2.l((t2) obj4, (djf) obj3, (Function1) obj2, (String) obj);
                break;
            case 1:
                mne mneVar = (mne) obj4;
                ale aleVar = (ale) obj3;
                osj osjVar = (osj) obj2;
                lne lneVar = (lne) obj;
                if (aleVar.k(29)) {
                    aleVar.f(aleVar.o().a().e(new zsj(osjVar, hv9.z(Integer.valueOf(lneVar.b)))).i(lneVar.a.b.c, false).a());
                    mneVar.s(lneVar.c);
                    ((one) mneVar.c).r.dismiss();
                    break;
                }
                break;
            case 2:
                cpe cpeVar = (cpe) obj3;
                gpe gpeVar = (gpe) obj2;
                gpe gpeVar2 = (gpe) obj;
                ((zbe) obj4).invoke();
                cpeVar.l = true;
                yt7 yt7Var = cpeVar.d;
                ConstraintLayout constraintLayout = (ConstraintLayout) yt7Var.t;
                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) yt7Var.A;
                SofascoreSmallRatingView sofascoreSmallRatingView2 = (SofascoreSmallRatingView) yt7Var.r;
                constraintLayout.setVisibility(8);
                yt7Var.e.setVisibility(0);
                if (sofascoreSmallRatingView2.getVisibility() != 0 && cpeVar.j) {
                    sofascoreSmallRatingView2.setVisibility(0);
                    SofascoreSmallRatingView.k(sofascoreSmallRatingView2, Double.valueOf(0.0d), 6);
                }
                yt7Var.x.setVisibility(0);
                ((ConstraintLayout) yt7Var.y).setVisibility(0);
                ImageView imageView = yt7Var.m;
                Integer valueOf = Integer.valueOf(R.drawable.player_photo_placeholder);
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = valueOf;
                fc6.w(ht9Var, imageView, a);
                if (cpeVar.j) {
                    sofascoreSmallRatingView.setVisibility(0);
                    SofascoreSmallRatingView.k(sofascoreSmallRatingView, null, 6);
                }
                yt7Var.i.setContent(new tc3(640610911, new gme(2, cpeVar, gpeVar), true));
                yt7Var.n.setContent(new tc3(-117991082, new gme(3, cpeVar, gpeVar2), true));
                break;
            case 3:
                int i2 = PromotionBannerView.t;
                Context context = ((PromotionBannerView) obj4).getContext();
                context.getClass();
                f7a.w(context, (String) obj, (String) obj3, ((bef) obj2).b, null);
                break;
            case 4:
                ImageView imageView2 = (ImageView) obj4;
                nm5 nm5Var = (nm5) obj3;
                gjf gjfVar = (gjf) obj2;
                z3f z3fVar = (z3f) obj;
                imageView2.setSelected(!imageView2.isSelected());
                imageView2.setImageResource(imageView2.isSelected() ? R.drawable.ic_done : R.drawable.ic_edit);
                nm5Var.F(gjfVar.i(imageView2.isSelected()));
                ((LinearLayout) z3fVar.c).setVisibility(nm5Var.getItemCount() == 0 ? 0 : 8);
                break;
            case 5:
                mne mneVar2 = (mne) obj4;
                aji ajiVar = (aji) obj;
                ug6 ug6Var = (ug6) ((zke) obj3);
                vt4 q = ug6Var.q();
                q.getClass();
                tt4 tt4Var = new tt4(q);
                ysj ysjVar = new ysj((nsj) obj2, hv9.z(Integer.valueOf(ajiVar.b)));
                nsj nsjVar = ysjVar.a;
                tt4Var.a(nsjVar.c);
                tt4Var.y.put(nsjVar, ysjVar);
                tt4Var.e(ajiVar.a.b.c);
                ug6Var.L(new vt4(tt4Var));
                mneVar2.s(ajiVar.c);
                ((cji) mneVar2.c).k.dismiss();
                break;
            case 6:
                ImageView imageView3 = (ImageView) obj4;
                old oldVar = (old) obj;
                Context context2 = imageView3.getContext();
                context2.getClass();
                nv.b0(context2, "Full time", ((yld) obj3).c, "featured", Integer.valueOf(((xmd) obj2).c.a), vmd.WEEKLY_CHALLENGE, "provider_logo", oldVar.f);
                Context context3 = imageView3.getContext();
                context3.getClass();
                bea.G(context3, oldVar.b);
                break;
            default:
                ytm ytmVar = (ytm) obj4;
                ImageView imageView4 = (ImageView) obj3;
                IPlayerItemButtonStyle iPlayerItemButtonStyle = (IPlayerItemButtonStyle) obj2;
                e0n e0nVar = (e0n) obj;
                boolean z = e0n.n;
                view.getClass();
                evl.animateAndVibrate$default(view, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 15, null);
                ytmVar.a(!ytmVar.getV());
                if (ytmVar.getV()) {
                    ytmVar.a(ytmVar.getW() + 1);
                } else {
                    ytmVar.a(ytmVar.getW() - 1);
                }
                imageView4.setSelected(ytmVar.getV());
                ctl.b(imageView4, iPlayerItemButtonStyle.getCustomImage());
                a aVar = (a) e0nVar.c;
                aVar.getClass();
                try {
                    if (ytmVar instanceof VideoModel) {
                        ((w3m) aVar.getViewModel()).f0((VideoModel) ytmVar);
                        break;
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                break;
        }
    }

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
