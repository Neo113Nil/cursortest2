package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import ru.ozon.composer.ui.widget.k;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class RecShelfViewHolder$addSkuScroll$1$2 extends C7735q implements Function0<Unit> {
    RecShelfViewHolder$addSkuScroll$1$2(Object obj) {
        super(0, obj, k.class, "onRecycle", "onRecycle()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((k) this.receiver).onRecycle();
    }
}
