package ru.ozon.app.android.yandexsearchsheet;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "suggest", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "position", "", "inputQuery", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YandexSearchSheetBinder$setView$1 extends AbstractC7737t implements InterfaceC6511n<SuggestVO.Suggest.SuggestInfo, Integer, String, Unit> {
    final /* synthetic */ YandexSearchSheetBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YandexSearchSheetBinder$setView$1(YandexSearchSheetBinder yandexSearchSheetBinder) {
        super(3);
        this.this$0 = yandexSearchSheetBinder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(SuggestVO.Suggest.SuggestInfo suggestInfo, Integer num, String str) {
        invoke(suggestInfo, num.intValue(), str);
        return Unit.f71690a;
    }

    public final void invoke(SuggestVO.Suggest.SuggestInfo suggest, int i11, String inputQuery) {
        YandexSearchSheetViewModel yandexSearchSheetViewModel;
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        Intrinsics.checkNotNullParameter(inputQuery, "inputQuery");
        yandexSearchSheetViewModel = this.this$0.viewModel;
        yandexSearchSheetViewModel.suggestClicked(suggest, i11, inputQuery);
    }
}
