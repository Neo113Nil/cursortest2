package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import WZ.t;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$onComposerCreated$5$1 extends C7735q implements InterfaceC6512o<Long, AtomActionDTO, t, String, Unit> {
    AviaSearchResultFragment$onComposerCreated$5$1(Object obj) {
        super(4, obj, AviaSearchResultFragment.class, "selectLuggageAndTrackAnalytics", "selectLuggageAndTrackAnalytics(JLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Ljava/lang/String;)V", 0);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(Long l11, AtomActionDTO atomActionDTO, t tVar, String str) {
        invoke(l11.longValue(), atomActionDTO, tVar, str);
        return Unit.f71690a;
    }

    public final void invoke(long j11, AtomActionDTO atomActionDTO, t tVar, String str) {
        ((AviaSearchResultFragment) this.receiver).selectLuggageAndTrackAnalytics(j11, atomActionDTO, tVar, str);
    }
}
