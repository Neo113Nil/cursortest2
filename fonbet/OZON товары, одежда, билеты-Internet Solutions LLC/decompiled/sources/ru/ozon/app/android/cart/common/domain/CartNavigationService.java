package ru.ozon.app.android.cart.common.domain;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rH&J\u001e\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011H&J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0014\u001a\u00020\u000fH&J\b\u0010\u0015\u001a\u00020\u000fH&J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/common/domain/CartNavigationService;", "", "pendingTab", "", "getPendingTab", "()Ljava/lang/String;", "currentTab", "getCurrentTab", "resolveDeeplink", "Landroid/net/Uri;", "deeplink", "fallbackDeeplink", "decorateDeeplink", "Lkotlin/Function1;", "onResponseAddToCart", "", "params", "", "onMasterUpdated", "onRefreshed", "onNavigateToCartByTab", "onTeenModeChanged", "onLogosActionTriggered", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartNavigationService {
    String getCurrentTab();

    String getPendingTab();

    void onLogosActionTriggered(@NotNull AtomAction it);

    void onMasterUpdated(String deeplink);

    void onNavigateToCartByTab();

    void onRefreshed(String deeplink);

    void onResponseAddToCart(Map<String, String> params);

    void onTeenModeChanged();

    @NotNull
    Uri resolveDeeplink(@NotNull Uri deeplink, @NotNull Uri fallbackDeeplink, @NotNull Function1<? super Uri, ? extends Uri> decorateDeeplink);
}
