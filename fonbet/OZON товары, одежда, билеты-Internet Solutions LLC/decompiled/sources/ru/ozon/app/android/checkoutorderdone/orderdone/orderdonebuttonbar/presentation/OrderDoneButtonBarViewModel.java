package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Ae.M0;
import W10.c;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation.OrderDoneButtonBarViewModelImpl;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModel;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LW10/c;", "trackingData", "", "handleAction", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "", "id", "reorder", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarViewModelImpl$Action;", "getActions", "()Landroidx/lifecycle/P;", "actions", "LAe/M0;", "", "getLoaderState", "()LAe/M0;", "loaderState", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OrderDoneButtonBarViewModel {
    @NotNull
    P<OrderDoneButtonBarViewModelImpl.Action> getActions();

    @NotNull
    M0<Boolean> getLoaderState();

    void handleAction(@NotNull AtomAction action, @NotNull c trackingData);

    void reorder(@NotNull AtomAction.Click action, Long id2);
}
