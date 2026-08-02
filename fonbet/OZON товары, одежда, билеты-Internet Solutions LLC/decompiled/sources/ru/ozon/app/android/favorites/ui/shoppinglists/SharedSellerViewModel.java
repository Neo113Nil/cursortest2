package ru.ozon.app.android.favorites.ui.shoppinglists;

import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "actionSellerId", "", "sendStateChangeEvent", "(Ljava/lang/String;)V", "clear", "", "Lru/ozon/app/android/favorites/ui/shoppinglists/Action;", "list", "Ljava/util/List;", "LAe/x0;", "", "shouldForceUnFavStateFlow", "LAe/x0;", "getShouldForceUnFavStateFlow", "()LAe/x0;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SharedSellerViewModel extends w0 {

    @NotNull
    private final List<Action> list = new ArrayList();

    @NotNull
    private final x0<List<Action>> shouldForceUnFavStateFlow = O0.a(K.f71697a);

    public final void clear() {
        this.list.clear();
    }

    @NotNull
    public final x0<List<Action>> getShouldForceUnFavStateFlow() {
        return this.shouldForceUnFavStateFlow;
    }

    public final void sendStateChangeEvent(@NotNull String actionSellerId) {
        Intrinsics.checkNotNullParameter(actionSellerId, "actionSellerId");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new SharedSellerViewModel$sendStateChangeEvent$1(this, actionSellerId, null), 3);
    }
}
