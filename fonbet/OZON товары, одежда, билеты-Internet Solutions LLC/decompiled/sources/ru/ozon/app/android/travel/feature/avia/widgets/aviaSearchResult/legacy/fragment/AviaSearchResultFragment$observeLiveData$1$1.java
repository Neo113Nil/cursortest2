package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$Result;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$Result;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultFragment$observeLiveData$1$1 extends AbstractC7737t implements Function1<AviaSearchResultViewModel.Result, Unit> {
    final /* synthetic */ AviaSearchResultFragment this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$observeLiveData$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AviaSearchResultViewModel.Result $result;
        final /* synthetic */ AviaSearchResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaSearchResultFragment aviaSearchResultFragment, AviaSearchResultViewModel.Result result) {
            super(0);
            this.this$0 = aviaSearchResultFragment;
            this.$result = result;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            boolean z11;
            z11 = this.this$0.isComposerRecreated;
            if (z11) {
                this.this$0.isComposerRecreated = false;
                this.this$0.restoreLayoutManagerState();
            }
            Function0<Unit> postAction = this.$result.getPostAction();
            if (postAction != null) {
                postAction.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultFragment$observeLiveData$1$1(AviaSearchResultFragment aviaSearchResultFragment) {
        super(1);
        this.this$0 = aviaSearchResultFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AviaSearchResultViewModel.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AviaSearchResultViewModel.Result result) {
        AviaSearchResultAdapter aviaSearchResultAdapter;
        aviaSearchResultAdapter = this.this$0.searchResultAdapter;
        if (aviaSearchResultAdapter != null) {
            J viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            aviaSearchResultAdapter.submitList(K.a(viewLifecycleOwner), result.getResultItems(), new AnonymousClass1(this.this$0, result));
        }
    }
}
