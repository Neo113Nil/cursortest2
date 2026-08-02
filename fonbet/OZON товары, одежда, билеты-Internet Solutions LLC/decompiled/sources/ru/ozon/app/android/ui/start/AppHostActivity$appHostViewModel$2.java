package ru.ozon.app.android.ui.start;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ui/start/AppHostViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/ui/start/AppHostViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AppHostActivity$appHostViewModel$2 extends AbstractC7737t implements Function0<AppHostViewModel> {
    final /* synthetic */ AppHostActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppHostActivity$appHostViewModel$2(AppHostActivity appHostActivity) {
        super(0);
        this.this$0 = appHostActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AppHostViewModel invoke() {
        final AppHostActivity appHostActivity = this.this$0;
        return (AppHostViewModel) new z0(appHostActivity, new z0.c() { // from class: ru.ozon.app.android.ui.start.AppHostActivity$appHostViewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AppHostViewModel appHostViewModel = AppHostActivity.this.getPViewModel$main_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(appHostViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return appHostViewModel;
            }
        }).a(AppHostViewModel.class);
    }
}
