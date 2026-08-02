package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SearchSheetView$1$1$1 extends AbstractC7737t implements Function1<SuggestVO, Unit> {
    final /* synthetic */ SearchSheetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSheetView$1$1$1(SearchSheetView searchSheetView) {
        super(1);
        this.this$0 = searchSheetView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SuggestVO suggestVO) {
        invoke2(suggestVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SuggestVO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<SuggestVO, Unit> onSuggestClicked = this.this$0.getOnSuggestClicked();
        if (onSuggestClicked != null) {
            onSuggestClicked.invoke(it);
        }
    }
}
