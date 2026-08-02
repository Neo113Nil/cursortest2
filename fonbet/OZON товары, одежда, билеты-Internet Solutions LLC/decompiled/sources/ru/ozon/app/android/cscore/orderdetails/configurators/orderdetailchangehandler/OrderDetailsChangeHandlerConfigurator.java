package ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Pc.a;
import a00.h;
import android.view.ViewGroup;
import androidx.lifecycle.B0;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailChangeHandlerViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailsChangeHandlerConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/cscore/orderdetails/configurators/orderdetailchangehandler/OrderDetailChangeHandlerViewModel;", "provider", "<init>", "(LPc/a;)V", "", "message", "", "iconId", "", "showSnackBar", "(Ljava/lang/String;Ljava/lang/Integer;)V", "onComposerInitialized", "()V", "LPc/a;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDetailsChangeHandlerConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<OrderDetailChangeHandlerViewModel> provider;

    public OrderDetailsChangeHandlerConfigurator(@NotNull a<OrderDetailChangeHandlerViewModel> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSnackBar(String message, Integer iconId) {
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        String token = UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken();
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, iconId, null, token, null, null, null, null, null, 3000L, null, null, getContainer().g(), 57178, null).show();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        M0<List<OrderDetailChangeHandlerViewModel.Action>> action;
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = getReferences();
        OrderDetailChangeHandlerViewModel orderDetailChangeHandlerViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) ? null : (OrderDetailChangeHandlerViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.cscore.orderdetails.configurators.orderdetailchangehandler.OrderDetailsChangeHandlerConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = OrderDetailsChangeHandlerConfigurator.this.provider;
                OrderDetailChangeHandlerViewModel orderDetailChangeHandlerViewModel2 = (OrderDetailChangeHandlerViewModel) aVar.get();
                Intrinsics.g(orderDetailChangeHandlerViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderDetailChangeHandlerViewModel2;
            }
        }).a(OrderDetailChangeHandlerViewModel.class);
        if (orderDetailChangeHandlerViewModel == null || (action = orderDetailChangeHandlerViewModel.getAction()) == null) {
            return;
        }
        C2399j.C(new C2408n0(action, new OrderDetailsChangeHandlerConfigurator$onComposerInitialized$1(this, null)), K.a(getOwner()));
    }
}
