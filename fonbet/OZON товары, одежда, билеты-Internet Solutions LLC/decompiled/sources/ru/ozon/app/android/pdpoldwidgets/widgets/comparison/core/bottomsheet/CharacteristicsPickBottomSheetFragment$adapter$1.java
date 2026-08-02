package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import WZ.i;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class CharacteristicsPickBottomSheetFragment$adapter$1 extends C7735q implements Function2<t, i, Unit> {
    CharacteristicsPickBottomSheetFragment$adapter$1(Object obj) {
        super(2, obj, CharacteristicsPickBottomSheetFragment.class, "sendAnalytics", "sendAnalytics(Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/Filter;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(t tVar, i iVar) {
        invoke2(tVar, iVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar, i p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((CharacteristicsPickBottomSheetFragment) this.receiver).sendAnalytics(tVar, p12);
    }
}
