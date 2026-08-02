package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "request", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchBarViewDelegate$onTextChanged$1$1 extends AbstractC7737t implements Function1<TapTagsRequestDTO, Unit> {
    final /* synthetic */ boolean $fromBind;
    final /* synthetic */ SearchBarViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewDelegate$onTextChanged$1$1(SearchBarViewDelegate searchBarViewDelegate, boolean z11) {
        super(1);
        this.this$0 = searchBarViewDelegate;
        this.$fromBind = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TapTagsRequestDTO tapTagsRequestDTO) {
        invoke2(tapTagsRequestDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TapTagsRequestDTO request) {
        boolean isDialogSearchFeature;
        TapTagsV2ViewModel tapTagsV2ViewModel;
        TapTagsV3ViewModel tapTagsV3ViewModel;
        Intrinsics.checkNotNullParameter(request, "request");
        isDialogSearchFeature = this.this$0.isDialogSearchFeature();
        if (isDialogSearchFeature) {
            tapTagsV3ViewModel = this.this$0.tapTagsV3ViewModel;
            tapTagsV3ViewModel.updateTapTags(request);
        } else if (!this.$fromBind || request.getQuery().length() == 0) {
            tapTagsV2ViewModel = this.this$0.tapTagsV2ViewModel;
            tapTagsV2ViewModel.updateTapTags(request);
        }
    }
}
