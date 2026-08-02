package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class UgcCountersRvBinder$ugcRecyclerAdapter$2 extends C7735q implements Function1<t, Unit> {
    UgcCountersRvBinder$ugcRecyclerAdapter$2(Object obj) {
        super(1, obj, UgcCountersRvBinder.class, "onBlockInVisibleBounds", "onBlockInVisibleBounds(Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        ((UgcCountersRvBinder) this.receiver).onBlockInVisibleBounds(tVar);
    }
}
