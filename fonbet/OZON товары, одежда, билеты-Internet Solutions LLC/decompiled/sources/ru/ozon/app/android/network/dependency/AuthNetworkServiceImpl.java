package ru.ozon.app.android.network.dependency;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.orders.OrdersCountStorage;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.domain.cache.ComposerResponseStorage;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.RouterExtKt;
import ru.ozon.app.android.network.auth.AuthNetworkService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/network/dependency/AuthNetworkServiceImpl;", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "clearUserDataOnLogout", "", "clearBackStack", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthNetworkServiceImpl implements AuthNetworkService {

    @NotNull
    private final Context context;

    public AuthNetworkServiceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // ru.ozon.app.android.network.auth.AuthNetworkService
    public void clearUserDataOnLogout(boolean clearBackStack) {
        Context context = this.context;
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        OrdersCountStorage orderCountsStorage = ((AccountComponentApi) dependencyStorage.b(AccountComponentApi.class)).getOrderCountsStorage();
        Context context2 = this.context;
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context2, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerResponseStorage composerResponseStorage = ((ComposerComponentApi) dependencyStorage2.b(ComposerComponentApi.class)).getComposerResponseStorage();
        orderCountsStorage.clearOrdersAndNotificationsCount();
        composerResponseStorage.clearCache();
        if (clearBackStack) {
            Context context3 = this.context;
            if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
            }
            C6740b dependencyStorage3 = C6739a.a(context3, NavigationComponentApi.class).getDependencyStorage();
            if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
            }
            RouterExtKt.clearBackStack(((NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class)).getOzonRouter());
        }
    }
}
