package ru.ozon.app.android.cart.ui.tab;

import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.delegate.ResolveCartTabNavigationActionUseCase;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/common/domain/delegate/ResolveCartTabNavigationActionUseCase;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CartTabUiControllerFactory$resolveCartTabNavigationUseCase$2 extends AbstractC7737t implements Function0<ResolveCartTabNavigationActionUseCase> {
    final /* synthetic */ Application $application;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTabUiControllerFactory$resolveCartTabNavigationUseCase$2(Application application) {
        super(0);
        this.$application = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ResolveCartTabNavigationActionUseCase invoke() {
        Application application = this.$application;
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, CartServiceApi.class).getDependencyStorage();
        if (CartServiceApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartServiceApi is not DiComponent");
        }
        return ((CartServiceApi) dependencyStorage.b(CartServiceApi.class)).getResolveCartTabNavigationActionUseCase();
    }
}
