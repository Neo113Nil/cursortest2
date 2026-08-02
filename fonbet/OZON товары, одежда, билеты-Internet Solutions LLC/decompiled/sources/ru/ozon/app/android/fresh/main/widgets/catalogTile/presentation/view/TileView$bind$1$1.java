package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TileView$bind$1$1 extends C7719a implements Function0<Unit> {
    TileView$bind$1$1(Object obj) {
        super(0, obj, TileView.class, "performClick", "performClick()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TileView) this.receiver).performClick();
    }
}
