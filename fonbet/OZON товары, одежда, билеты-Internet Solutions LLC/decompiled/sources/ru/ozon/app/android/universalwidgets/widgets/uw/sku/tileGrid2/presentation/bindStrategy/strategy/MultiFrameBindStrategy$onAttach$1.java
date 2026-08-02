package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.ViewHolderLifecycle;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class MultiFrameBindStrategy$onAttach$1 extends C7735q implements Function0<Unit> {
    MultiFrameBindStrategy$onAttach$1(Object obj) {
        super(0, obj, ViewHolderLifecycle.class, "onAttach", "onAttach()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ViewHolderLifecycle) this.receiver).onAttach();
    }
}
