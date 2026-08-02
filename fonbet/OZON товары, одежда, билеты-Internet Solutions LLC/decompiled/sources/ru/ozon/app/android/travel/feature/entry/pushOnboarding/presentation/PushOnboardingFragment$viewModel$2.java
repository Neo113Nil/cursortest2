package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import wZ.C10464f;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PushOnboardingFragment$viewModel$2 extends AbstractC7737t implements Function0<PushOnboardingViewModel> {
    final /* synthetic */ PushOnboardingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushOnboardingFragment$viewModel$2(PushOnboardingFragment pushOnboardingFragment) {
        super(0);
        this.this$0 = pushOnboardingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PushOnboardingViewModel invoke() {
        B0 a11 = C10464f.a(this.this$0);
        final PushOnboardingFragment pushOnboardingFragment = this.this$0;
        return (PushOnboardingViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.PushOnboardingFragment$viewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PushOnboardingViewModel pushOnboardingViewModel = PushOnboardingFragment.this.getViewModelProvider().get();
                Intrinsics.g(pushOnboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pushOnboardingViewModel;
            }
        }).a(PushOnboardingViewModel.class);
    }
}
