package defpackage;

import android.view.View;
import com.sofascore.results.view.branding.BrandingHeaderView;
import com.sofascore.results.view.branding.BrandingLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yla implements krk {
    public final BrandingLayout a;
    public final BrandingHeaderView b;

    public yla(BrandingLayout brandingLayout, BrandingHeaderView brandingHeaderView) {
        this.a = brandingLayout;
        this.b = brandingHeaderView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
