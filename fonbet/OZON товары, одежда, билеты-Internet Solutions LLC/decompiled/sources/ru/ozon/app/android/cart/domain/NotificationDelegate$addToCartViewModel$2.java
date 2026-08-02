package ru.ozon.app.android.cart.domain;

import Pc.a;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/cart/common/presentation/addToCart/AddToCartViewModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class NotificationDelegate$addToCartViewModel$2 extends AbstractC7737t implements Function0<AddToCartViewModel> {
    final /* synthetic */ NotificationDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationDelegate$addToCartViewModel$2(NotificationDelegate notificationDelegate) {
        super(0);
        this.this$0 = notificationDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddToCartViewModel invoke() {
        ConfiguratorReferences configuratorReferences;
        configuratorReferences = this.this$0.references;
        B0 b11 = configuratorReferences.getViewModelOwnerProvider().b();
        final NotificationDelegate notificationDelegate = this.this$0;
        return (AddToCartViewModel) new z0(b11, new z0.c() { // from class: ru.ozon.app.android.cart.domain.NotificationDelegate$addToCartViewModel$2$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = NotificationDelegate.this.addToCartProvider;
                AddToCartViewModel addToCartViewModel = (AddToCartViewModel) aVar.get();
                Intrinsics.g(addToCartViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addToCartViewModel;
            }
        }).a(AddToCartViewModel.class);
    }
}
