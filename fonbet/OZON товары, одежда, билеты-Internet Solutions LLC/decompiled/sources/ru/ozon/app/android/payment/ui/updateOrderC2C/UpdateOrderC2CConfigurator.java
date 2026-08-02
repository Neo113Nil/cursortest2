package ru.ozon.app.android.payment.ui.updateOrderC2C;

import GZ.g;
import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CViewModel;", "pViewModel", "LGZ/g;", "router", "<init>", "(LPc/a;LGZ/g;)V", "", "onComposerInitialized", "()V", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CDelegate;", "updateOrderC2CDelegate", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderC2CDelegate;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdateOrderC2CConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<UpdateOrderC2CViewModel> pViewModel;

    @NotNull
    private final g router;
    private UpdateOrderC2CDelegate updateOrderC2CDelegate;

    public UpdateOrderC2CConfigurator(@NotNull a<UpdateOrderC2CViewModel> pViewModel, @NotNull g router) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        this.pViewModel = pViewModel;
        this.router = router;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        UpdateOrderC2CViewModel updateOrderC2CViewModel = (UpdateOrderC2CViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderC2CConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = UpdateOrderC2CConfigurator.this.pViewModel;
                UpdateOrderC2CViewModel updateOrderC2CViewModel2 = (UpdateOrderC2CViewModel) aVar.get();
                Intrinsics.g(updateOrderC2CViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return updateOrderC2CViewModel2;
            }
        }).a(UpdateOrderC2CViewModel.class);
        this.updateOrderC2CDelegate = new UpdateOrderC2CDelegate(this.router, new UpdateOrderC2CConfigurator$onComposerInitialized$1(references), references.getController());
        updateOrderC2CViewModel.getEvents().observe(getOwner(), new UpdateOrderC2CConfigurator$sam$androidx_lifecycle_Observer$0(new UpdateOrderC2CConfigurator$onComposerInitialized$2(this, references)));
    }
}
