package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.strategy;

import Sc.InterfaceC4003e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder.TileGrid2ViewStateBinder;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TileGrid2MultiFrameBindStrategy$bindCountButtonStep$1 implements BindStep, InterfaceC7732n {
    final /* synthetic */ TileGrid2ViewStateBinder $tmp0;

    TileGrid2MultiFrameBindStrategy$bindCountButtonStep$1(TileGrid2ViewStateBinder tileGrid2ViewStateBinder) {
        this.$tmp0 = tileGrid2ViewStateBinder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof BindStep) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(0, this.$tmp0, TileGrid2ViewStateBinder.class, "bindCountButton", "bindCountButton()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$tmp0.bindCountButton();
    }
}
