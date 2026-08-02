package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TileView$bind$2$1 extends C7719a implements Function1<t, Unit> {
    TileView$bind$2$1(Object obj) {
        super(1, obj, m.class, "processClickEvents", "processClickEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        m.a((l) this.receiver, p02, null);
    }
}
