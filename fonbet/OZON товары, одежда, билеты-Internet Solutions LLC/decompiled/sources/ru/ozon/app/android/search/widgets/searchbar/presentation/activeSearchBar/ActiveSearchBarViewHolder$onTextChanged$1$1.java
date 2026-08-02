package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "request", "Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ActiveSearchBarViewHolder$onTextChanged$1$1 extends AbstractC7737t implements Function1<TapTagsRequestDTO, Unit> {
    final /* synthetic */ ActiveSearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewHolder$onTextChanged$1$1(ActiveSearchBarViewHolder activeSearchBarViewHolder) {
        super(1);
        this.this$0 = activeSearchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TapTagsRequestDTO tapTagsRequestDTO) {
        invoke2(tapTagsRequestDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TapTagsRequestDTO request) {
        ActiveSearchBarViewModel activeSearchBarViewModel;
        TapTagsV2ViewModel tapTagsV2ViewModel;
        Intrinsics.checkNotNullParameter(request, "request");
        activeSearchBarViewModel = this.this$0.activeSearchBarViewModel;
        if (activeSearchBarViewModel.isDialogSearch()) {
            return;
        }
        tapTagsV2ViewModel = this.this$0.tapTagsV2ViewModel;
        tapTagsV2ViewModel.updateTapTags(request);
    }
}
