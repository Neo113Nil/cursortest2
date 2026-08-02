package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$onComposerCreated$5$6 extends C7735q implements Function2<AtomAction, Integer, Unit> {
    AviaSearchResultFragment$onComposerCreated$5$6(Object obj) {
        super(2, obj, AviaSearchResultFragment.class, "processBannerClick", "processBannerClick(Lru/ozon/uni/atoms/af/AtomAction;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, Integer num) {
        invoke(atomAction, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(AtomAction p02, int i11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AviaSearchResultFragment) this.receiver).processBannerClick(p02, i11);
    }
}
