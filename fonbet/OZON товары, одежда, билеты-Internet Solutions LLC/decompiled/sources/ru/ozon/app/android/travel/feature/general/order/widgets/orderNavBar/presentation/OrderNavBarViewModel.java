package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LAe/B0;", "", "alphaUpdate", "()LAe/B0;", "alpha", "", "sendAlphaUpdate", "(F)V", "", "verticalOffset", "I", "getVerticalOffset", "()I", "setVerticalOffset", "(I)V", "collapsedAppBarHeight", "getCollapsedAppBarHeight", "setCollapsedAppBarHeight", "previousFirstVisiblePos", "Ljava/lang/Integer;", "getPreviousFirstVisiblePos", "()Ljava/lang/Integer;", "setPreviousFirstVisiblePos", "(Ljava/lang/Integer;)V", "LAe/w0;", "LAe/w0;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavBarViewModel extends w0 {

    @NotNull
    private final Ae.w0<Float> alphaUpdate = E0.b(0, 0, null, 7);
    private int collapsedAppBarHeight;
    private Integer previousFirstVisiblePos;
    private int verticalOffset;

    @NotNull
    public final B0<Float> alphaUpdate() {
        return C2399j.a(this.alphaUpdate);
    }

    public final int getCollapsedAppBarHeight() {
        return this.collapsedAppBarHeight;
    }

    public final Integer getPreviousFirstVisiblePos() {
        return this.previousFirstVisiblePos;
    }

    public final int getVerticalOffset() {
        return this.verticalOffset;
    }

    public final void sendAlphaUpdate(float alpha) {
        C10727i.c(x0.a(this), null, null, new OrderNavBarViewModel$sendAlphaUpdate$1(this, alpha, null), 3);
    }

    public final void setCollapsedAppBarHeight(int i11) {
        this.collapsedAppBarHeight = i11;
    }

    public final void setPreviousFirstVisiblePos(Integer num) {
        this.previousFirstVisiblePos = num;
    }

    public final void setVerticalOffset(int i11) {
        this.verticalOffset = i11;
    }
}
