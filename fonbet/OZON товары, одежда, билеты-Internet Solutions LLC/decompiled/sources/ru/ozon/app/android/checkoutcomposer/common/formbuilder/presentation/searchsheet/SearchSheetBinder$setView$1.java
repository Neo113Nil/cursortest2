package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SearchSheetBinder$setView$1 extends C7735q implements Function1<SuggestVO, Unit> {
    SearchSheetBinder$setView$1(Object obj) {
        super(1, obj, SearchSheetViewModel.class, "suggestClicked", "suggestClicked(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SuggestVO suggestVO) {
        invoke2(suggestVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SuggestVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SearchSheetViewModel) this.receiver).suggestClicked(p02);
    }
}
