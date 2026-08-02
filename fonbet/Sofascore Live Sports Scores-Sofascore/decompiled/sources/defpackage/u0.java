package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.sofascore.results.ads.iml.banner.AdBannerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u0 extends p8 {
    public final t54 c;
    public int d;
    public final /* synthetic */ w0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, t54 t54Var) {
        super(t54Var.b);
        this.e = w0Var;
        this.c = t54Var;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        AdBannerView adBannerView = (AdBannerView) obj;
        adBannerView.getClass();
        this.d++;
        t54 t54Var = this.c;
        FrameLayout frameLayout = t54Var.b;
        if (frameLayout.getChildCount() == 0) {
            if (adBannerView.getParent() != null) {
                ViewParent parent = adBannerView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
            }
            frameLayout.addView(adBannerView);
            adBannerView.c(adBannerView.adType);
        } else if (this.d > 10) {
            adBannerView.c(adBannerView.adType);
            this.d = 0;
        }
        this.e.G(t54Var, i, i2, adBannerView);
    }
}
