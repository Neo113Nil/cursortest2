package rB;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentApi;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.dl.OrderShipmentComponentFactoryModule;

/* renamed from: rB.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C9226a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        OrderShipmentComponentApi provideFactory$lambda$0;
        provideFactory$lambda$0 = OrderShipmentComponentFactoryModule.provideFactory$lambda$0(c6740b);
        return provideFactory$lambda$0;
    }
}
