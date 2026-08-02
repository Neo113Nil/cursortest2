package gl;

import hi.InterfaceC6958a;
import k20.C7475g;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2$Companion$create$1$1;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.vm.AccessoriesViewModelV2;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

/* renamed from: gl.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C6751a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f64574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6958a f64575c;

    public /* synthetic */ C6751a(C7475g c7475g, InterfaceC6958a interfaceC6958a, int i11) {
        this.f64573a = i11;
        this.f64574b = c7475g;
        this.f64575c = interfaceC6958a;
    }

    @Override // Pc.a
    public final Object get() {
        CreateAndPayViewModel createAndPayViewModelProvider$lambda$0;
        AccessoriesViewModelV2 accessoriesViewModelProvider$lambda$0;
        switch (this.f64573a) {
            case 0:
                createAndPayViewModelProvider$lambda$0 = ShipmentWidgetV2ComponentV2$Companion$create$1$1.createAndPayViewModelProvider$lambda$0(this.f64574b, (ShipmentWidgetV2ComponentV2$Companion$create$1$1) this.f64575c);
                return createAndPayViewModelProvider$lambda$0;
            default:
                accessoriesViewModelProvider$lambda$0 = CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1.accessoriesViewModelProvider$lambda$0(this.f64574b, (CartSplitV2AccessoriesWidgetComponent$Companion$create$1$1) this.f64575c);
                return accessoriesViewModelProvider$lambda$0;
        }
    }
}
