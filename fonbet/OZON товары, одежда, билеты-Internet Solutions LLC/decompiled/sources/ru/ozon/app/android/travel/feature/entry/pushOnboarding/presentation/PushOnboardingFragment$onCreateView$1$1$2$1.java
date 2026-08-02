package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingPageData;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PushOnboardingFragment$onCreateView$1$1$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ PushOnboardingPageData $data;
    final /* synthetic */ PushOnboardingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushOnboardingFragment$onCreateView$1$1$2$1(PushOnboardingFragment pushOnboardingFragment, PushOnboardingPageData pushOnboardingPageData) {
        super(1);
        this.this$0 = pushOnboardingFragment;
        this.$data = pushOnboardingPageData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        PushOnboardingViewModel viewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel = this.this$0.getViewModel();
        CommonControlSettings common = this.$data.getConfirmButtonDTO().getCommon();
        viewModel.onboardingConfirm(common != null ? common.toAtomAction() : null);
    }
}
