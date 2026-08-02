package defpackage;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.results.event.details.view.promotion.PromotionBannerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eef extends u {
    public final rvk b;
    public final /* synthetic */ jne c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eef(jne jneVar, rvk rvkVar) {
        super(rvkVar.b);
        this.c = jneVar;
        this.b = rvkVar;
        PromotionBannerView promotionBannerView = (PromotionBannerView) rvkVar.c;
        promotionBannerView.setNewLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        promotionBannerView.setVisibility(0);
    }
}
