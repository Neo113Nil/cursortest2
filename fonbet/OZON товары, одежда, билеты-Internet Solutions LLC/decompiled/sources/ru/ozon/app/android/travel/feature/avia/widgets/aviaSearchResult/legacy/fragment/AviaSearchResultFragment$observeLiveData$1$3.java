package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$ItemUpdateResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$ItemUpdateResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultFragment$observeLiveData$1$3 extends AbstractC7737t implements Function1<AviaSearchResultViewModel.ItemUpdateResult, Unit> {
    final /* synthetic */ AviaSearchResultFragment this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "it", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$observeLiveData$1$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AviaSearchResultVO.AviaSearchResultItemVO, AviaSearchResultVO.AviaSearchResultItemVO> {
        final /* synthetic */ AviaSearchResultViewModel.ItemUpdateResult $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaSearchResultViewModel.ItemUpdateResult itemUpdateResult) {
            super(1);
            this.$result = itemUpdateResult;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AviaSearchResultVO.AviaSearchResultItemVO invoke(AviaSearchResultVO.AviaSearchResultItemVO it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.$result.getNewItem();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultFragment$observeLiveData$1$3(AviaSearchResultFragment aviaSearchResultFragment) {
        super(1);
        this.this$0 = aviaSearchResultFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AviaSearchResultViewModel.ItemUpdateResult itemUpdateResult) {
        invoke2(itemUpdateResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AviaSearchResultViewModel.ItemUpdateResult itemUpdateResult) {
        AviaSearchResultAdapter aviaSearchResultAdapter;
        aviaSearchResultAdapter = this.this$0.searchResultAdapter;
        if (aviaSearchResultAdapter != null) {
            aviaSearchResultAdapter.updateItem(itemUpdateResult.getPosition(), new AnonymousClass1(itemUpdateResult), "AviaSearchResultV3Payload.LuggageChanged");
        }
        if (itemUpdateResult.getShouldShowError()) {
            this.this$0.showFlashBarError();
        }
    }
}
