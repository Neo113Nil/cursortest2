package ru.ozon.app.android.error.summary.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ErrorSummaryFragment$screenViewModel$2 extends AbstractC7737t implements Function0<ErrorSummaryViewModel> {
    final /* synthetic */ ErrorSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorSummaryFragment$screenViewModel$2(ErrorSummaryFragment errorSummaryFragment) {
        super(0);
        this.this$0 = errorSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ErrorSummaryViewModel invoke() {
        final ErrorSummaryFragment errorSummaryFragment = this.this$0;
        return (ErrorSummaryViewModel) new z0(errorSummaryFragment, new z0.c() { // from class: ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment$screenViewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ErrorSummaryViewModel errorSummaryViewModel = ErrorSummaryFragment.this.getViewModelProvider().get();
                Intrinsics.g(errorSummaryViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return errorSummaryViewModel;
            }
        }).a(ErrorSummaryViewModel.class);
    }
}
