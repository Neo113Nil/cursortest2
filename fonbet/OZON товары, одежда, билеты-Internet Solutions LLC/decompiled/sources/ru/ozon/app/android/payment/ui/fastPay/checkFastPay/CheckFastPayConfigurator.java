package ru.ozon.app.android.payment.ui.fastPay.checkFastPay;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/payment/ui/fastPay/checkFastPay/CheckFastPayViewModel;", "pViewModel", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "LPc/a;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckFastPayConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<CheckFastPayViewModel> pViewModel;

    public CheckFastPayConfigurator(@NotNull a<CheckFastPayViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        CheckFastPayViewModel checkFastPayViewModel = (CheckFastPayViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.fastPay.checkFastPay.CheckFastPayConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = CheckFastPayConfigurator.this.pViewModel;
                CheckFastPayViewModel checkFastPayViewModel2 = (CheckFastPayViewModel) aVar.get();
                Intrinsics.g(checkFastPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return checkFastPayViewModel2;
            }
        }).a(CheckFastPayViewModel.class);
        Intrinsics.f(checkFastPayViewModel);
        C2399j.C(new C2408n0(checkFastPayViewModel.getEventsFlow(), new CheckFastPayConfigurator$onComposerInitialized$1(new CheckFastPayDelegate(references, checkFastPayViewModel), null)), K.a(getOwner()));
    }
}
