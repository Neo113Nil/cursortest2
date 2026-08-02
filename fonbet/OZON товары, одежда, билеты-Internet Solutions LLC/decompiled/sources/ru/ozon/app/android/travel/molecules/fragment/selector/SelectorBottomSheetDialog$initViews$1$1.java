package ru.ozon.app.android.travel.molecules.fragment.selector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SelectorBottomSheetDialog$initViews$1$1 extends C7735q implements Function1<SelectorItem, Unit> {
    SelectorBottomSheetDialog$initViews$1$1(Object obj) {
        super(1, obj, SelectorBottomSheetDialog.class, "sendResult", "sendResult(Lru/ozon/app/android/travel/molecules/fragment/selector/SelectorItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SelectorItem selectorItem) {
        invoke2(selectorItem);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SelectorItem p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SelectorBottomSheetDialog) this.receiver).sendResult(p02);
    }
}
