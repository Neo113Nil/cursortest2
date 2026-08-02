package defpackage;

import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tc4 extends FeaturedOddsView {
    public vmd q;

    @Override // com.sofascore.results.event.details.view.odds.FeaturedOddsView
    @NotNull
    public vmd getLocation() {
        return this.q;
    }

    @Override // com.sofascore.results.event.details.view.odds.FeaturedOddsView
    public final void l() {
        getBinding().b.setContent(new tc3(546169116, new fv2(this, 6), true));
    }

    @Override // com.sofascore.results.event.details.view.odds.FeaturedOddsView
    public void setLocation(@NotNull vmd vmdVar) {
        vmdVar.getClass();
        this.q = vmdVar;
    }
}
