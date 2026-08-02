package defpackage;

import android.widget.ImageView;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wkm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dlm b;

    public /* synthetic */ wkm(dlm dlmVar, int i) {
        this.a = i;
        this.b = dlmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gim gimVar;
        int i = this.a;
        Object[] objArr = 0;
        dlm dlmVar = this.b;
        switch (i) {
            case 0:
                sqm sqmVar = (sqm) ((syl) dlmVar.c).getViewModel();
                sqmVar.getClass();
                n4m D = sqmVar.D();
                gimVar = D != null ? D.b : null;
                if (gimVar instanceof gim.b) {
                    ysm.d(sqmVar, EventActionName.DESCRIPTION_EXPANDED, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                }
                break;
            case 1:
                sqm sqmVar2 = (sqm) ((syl) dlmVar.c).getViewModel();
                sqmVar2.getClass();
                n4m D2 = sqmVar2.D();
                gimVar = D2 != null ? D2.b : null;
                if (gimVar instanceof gim.b) {
                    ysm.d(sqmVar2, EventActionName.DESCRIPTION_COLLAPSED, ysm.createMomentsPlayerProps$default(sqmVar2, (gim.b) gimVar, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 1048574, null));
                }
                break;
            case 2:
                if (dlmVar.h && dlmVar.k && dlmVar.l) {
                    ImageView imageView = dlmVar.b.u;
                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    imageView.setVisibility(0);
                    imageView.animate().alpha(1.0f).setDuration(200L).start();
                    sqm sqmVar3 = (sqm) ((syl) dlmVar.c).getViewModel();
                    fqm fqmVar = (fqm) sqmVar3.G.d();
                    if ((fqmVar != null ? fqmVar.a : false) && !sqmVar3.v0) {
                        sqmVar3.v0 = true;
                        sqmVar3.w0 = sqmVar3.G();
                        sqmVar3.x0 = 2.0f;
                        fam famVar = sqmVar3.e;
                        if (famVar != null) {
                            famVar.a(2.0f);
                        }
                    }
                }
                break;
            default:
                if (dlmVar.k) {
                    ImageView imageView2 = dlmVar.b.u;
                    imageView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).withEndAction(new ykm(imageView2, objArr == true ? 1 : 0)).start();
                    ((sqm) ((syl) dlmVar.c).getViewModel()).i0();
                }
                break;
        }
        return Unit.a;
    }
}
