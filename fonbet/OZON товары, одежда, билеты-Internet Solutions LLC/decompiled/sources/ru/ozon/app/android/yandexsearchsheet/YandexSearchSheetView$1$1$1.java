package ru.ozon.app.android.yandexsearchsheet;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.map.databinding.FragmentSearchSheetBinding;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "suggestInfo", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YandexSearchSheetView$1$1$1 extends AbstractC7737t implements Function2<SuggestVO.Suggest.SuggestInfo, Integer, Unit> {
    final /* synthetic */ FragmentSearchSheetBinding $this_apply;
    final /* synthetic */ YandexSearchSheetView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YandexSearchSheetView$1$1$1(YandexSearchSheetView yandexSearchSheetView, FragmentSearchSheetBinding fragmentSearchSheetBinding) {
        super(2);
        this.this$0 = yandexSearchSheetView;
        this.$this_apply = fragmentSearchSheetBinding;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SuggestVO.Suggest.SuggestInfo suggestInfo, Integer num) {
        invoke(suggestInfo, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(SuggestVO.Suggest.SuggestInfo suggestInfo, int i11) {
        Intrinsics.checkNotNullParameter(suggestInfo, "suggestInfo");
        InterfaceC6511n<SuggestVO.Suggest.SuggestInfo, Integer, String, Unit> onSuggestItemClicked = this.this$0.getOnSuggestItemClicked();
        if (onSuggestItemClicked != null) {
            onSuggestItemClicked.invoke(suggestInfo, Integer.valueOf(i11), String.valueOf(this.$this_apply.fieldEt.getText()));
        }
    }
}
