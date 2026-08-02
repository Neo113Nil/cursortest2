package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hb9 extends p8 {
    public final hcb c;
    public final AdType.Banner d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hb9(hcb hcbVar, boolean z, AdType.Banner banner) {
        super(r0);
        banner.getClass();
        AdBannerView adBannerView = (AdBannerView) hcbVar.b;
        this.c = hcbVar;
        this.d = banner;
        adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL)));
        if (!z) {
            adBannerView.setBackground(null);
            ViewGroup.LayoutParams layoutParams = adBannerView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                throw null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = adBannerView.getContext();
            context.getClass();
            marginLayoutParams.topMargin = ao2.s(4, context);
            Context context2 = adBannerView.getContext();
            context2.getClass();
            marginLayoutParams.bottomMargin = ao2.s(4, context2);
            adBannerView.setLayoutParams(marginLayoutParams);
            return;
        }
        adBannerView.setBackground(adBannerView.getContext().getDrawable(R.drawable.rounded_surface_level_1));
        ViewGroup.LayoutParams layoutParams2 = adBannerView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        Context context3 = adBannerView.getContext();
        context3.getClass();
        int s = ao2.s(8, context3);
        Context context4 = adBannerView.getContext();
        context4.getClass();
        int s2 = ao2.s(4, context4);
        marginLayoutParams2.setMarginStart(s);
        marginLayoutParams2.topMargin = s2;
        marginLayoutParams2.setMarginEnd(s);
        marginLayoutParams2.bottomMargin = s2;
        adBannerView.setLayoutParams(marginLayoutParams2);
        Context context5 = adBannerView.getContext();
        context5.getClass();
        int s3 = ao2.s(16, context5);
        adBannerView.setPadding(s3, s3, s3, s3);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        ((pb9) obj).getClass();
        ((AdBannerView) this.c.b).c(this.d);
    }
}
