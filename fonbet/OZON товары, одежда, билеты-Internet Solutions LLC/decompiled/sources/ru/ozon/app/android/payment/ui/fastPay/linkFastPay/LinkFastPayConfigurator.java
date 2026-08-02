package ru.ozon.app.android.payment.ui.fastPay.linkFastPay;

import Ae.C2399j;
import Ae.C2408n0;
import An.C2439a;
import Pc.a;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/payment/ui/fastPay/linkFastPay/LinkFastPayViewModel;", "pViewModel", "<init>", "(LPc/a;)V", "", "isShow", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "setLoaderState", "(ZLl10/b;)V", "onComposerInitialized", "()V", "LPc/a;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkFastPayConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<LinkFastPayViewModel> pViewModel;

    public LinkFastPayConfigurator(@NotNull a<LinkFastPayViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoaderState(boolean isShow, InterfaceC7851b controller) {
        if (isShow) {
            C2439a.b(0L, null, 3, controller);
        } else {
            controller.hideLoader();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        LinkFastPayViewModel linkFastPayViewModel = (LinkFastPayViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.fastPay.linkFastPay.LinkFastPayConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = LinkFastPayConfigurator.this.pViewModel;
                LinkFastPayViewModel linkFastPayViewModel2 = (LinkFastPayViewModel) aVar.get();
                Intrinsics.g(linkFastPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return linkFastPayViewModel2;
            }
        }).a(LinkFastPayViewModel.class);
        C2399j.C(new C2408n0(linkFastPayViewModel.getEventsFlow(), new LinkFastPayConfigurator$onComposerInitialized$1(new LinkFastPayDelegate(references), null)), K.a(getOwner()));
        C2399j.C(new C2408n0(linkFastPayViewModel.isLoading(), new LinkFastPayConfigurator$onComposerInitialized$2(this, references, null)), K.a(getOwner()));
    }
}
