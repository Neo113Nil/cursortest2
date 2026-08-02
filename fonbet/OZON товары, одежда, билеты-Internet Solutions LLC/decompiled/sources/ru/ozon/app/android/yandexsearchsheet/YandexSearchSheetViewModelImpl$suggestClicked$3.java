package ru.ozon.app.android.yandexsearchsheet;

import Nc.C3669c;
import U7.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "details", "Lru/ozon/app/android/yandexsearchsheet/DetailsSuggest;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/yandexsearchsheet/DetailsSuggest;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YandexSearchSheetViewModelImpl$suggestClicked$3 extends AbstractC7737t implements Function1<DetailsSuggest, Unit> {
    final /* synthetic */ SuggestVO.Suggest.SuggestInfo $suggest;
    final /* synthetic */ YandexSearchSheetViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YandexSearchSheetViewModelImpl$suggestClicked$3(YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl, SuggestVO.Suggest.SuggestInfo suggestInfo) {
        super(1);
        this.this$0 = yandexSearchSheetViewModelImpl;
        this.$suggest = suggestInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DetailsSuggest detailsSuggest) {
        invoke2(detailsSuggest);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DetailsSuggest detailsSuggest) {
        boolean dismissOnSecondClick;
        C3669c c3669c;
        YandexSearchSheetFragment.Data data;
        if (!detailsSuggest.isAvailable()) {
            YandexSearchSheetViewModel.ScreenUI value = this.this$0.getScreenUI().getValue();
            if (value != null) {
                YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl = this.this$0;
                SuggestVO suggests = value.getSuggests();
                data = yandexSearchSheetViewModelImpl.data;
                if (data == null) {
                    Intrinsics.n("data");
                    throw null;
                }
                List<AtomDTO> unavailableAddressState = data.getSearchOptions().getUnavailableAddressState();
                yandexSearchSheetViewModelImpl.getScreenUI().postValue(YandexSearchSheetViewModel.ScreenUI.copy$default(value, null, null, null, ModelsKt.addWarning(suggests, unavailableAddressState.isEmpty() ? null : unavailableAddressState), 7, null));
                return;
            }
            return;
        }
        if (detailsSuggest.isExact()) {
            AtomActionDTO action = detailsSuggest.getAction();
            if ((action != null ? action.getLink() : null) != null) {
                this.this$0.dismiss(SuggestVO.Suggest.SuggestInfo.copy$default(this.$suggest, null, null, null, null, detailsSuggest.getAction().getLink(), null, null, false, null, 495, null));
                return;
            }
        }
        dismissOnSecondClick = this.this$0.dismissOnSecondClick(this.$suggest);
        if (dismissOnSecondClick) {
            return;
        }
        this.this$0.getAction().setValue(new YandexSearchSheetViewModel.Action.ChangeQuery(d.e(this.$suggest.getDisplayFullAddress(), " ")));
        c3669c = this.this$0.querySubject;
        c3669c.onNext(this.$suggest.getSearchText());
        YandexSearchSheetViewModelImpl yandexSearchSheetViewModelImpl2 = this.this$0;
        SuggestVO.Suggest.SuggestInfo suggestInfo = this.$suggest;
        AtomActionDTO action2 = detailsSuggest.getAction();
        yandexSearchSheetViewModelImpl2.previousSuggest = SuggestVO.Suggest.SuggestInfo.copy$default(suggestInfo, null, null, null, null, action2 != null ? action2.getLink() : null, null, null, false, null, 495, null);
    }
}
