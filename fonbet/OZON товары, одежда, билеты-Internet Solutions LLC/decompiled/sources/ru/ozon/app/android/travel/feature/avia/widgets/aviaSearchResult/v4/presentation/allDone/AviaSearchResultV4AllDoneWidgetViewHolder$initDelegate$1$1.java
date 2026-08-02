package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShown", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4AllDoneWidgetViewHolder$initDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ AviaSearchResultV4AllDoneWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4AllDoneWidgetViewHolder$initDelegate$1$1(AviaSearchResultV4AllDoneWidgetViewHolder aviaSearchResultV4AllDoneWidgetViewHolder) {
        super(1);
        this.this$0 = aviaSearchResultV4AllDoneWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r2 = r1.this$0.onBoardingDelegate;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z11) {
        AviaSearchResultV4AllDoneViewModel aviaSearchResultV4AllDoneViewModel;
        OnBoardingDelegate onBoardingDelegate;
        aviaSearchResultV4AllDoneViewModel = this.this$0.viewModel;
        aviaSearchResultV4AllDoneViewModel.onOnboardingShown(z11);
        if (!z11 || onBoardingDelegate == null) {
            return;
        }
        onBoardingDelegate.unbind();
    }
}
