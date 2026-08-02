package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import WZ.t;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$onComposerCreated$5$4 extends C7735q implements InterfaceC6511n<Boolean, AtomAction, t, Unit> {
    AviaSearchResultFragment$onComposerCreated$5$4(Object obj) {
        super(3, obj, AviaSearchResultFragment.class, "changeBonusStateAndTrackAnalytics", "changeBonusStateAndTrackAnalytics(ZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, AtomAction atomAction, t tVar) {
        invoke(bool.booleanValue(), atomAction, tVar);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, AtomAction atomAction, t tVar) {
        ((AviaSearchResultFragment) this.receiver).changeBonusStateAndTrackAnalytics(z11, atomAction, tVar);
    }
}
