package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$onComposerCreated$5$5 extends C7735q implements Function1<t, Unit> {
    AviaSearchResultFragment$onComposerCreated$5$5(Object obj) {
        super(1, obj, AviaSearchResultFragment.class, "processViewEvent", "processViewEvent(Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        ((AviaSearchResultFragment) this.receiver).processViewEvent(tVar);
    }
}
