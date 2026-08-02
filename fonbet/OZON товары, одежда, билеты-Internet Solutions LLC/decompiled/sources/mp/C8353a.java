package mp;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentFactoryModule;

/* renamed from: mp.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8353a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        CheckoutPaymentComponentApi provideFactory$lambda$0;
        provideFactory$lambda$0 = CheckoutPaymentComponentFactoryModule.provideFactory$lambda$0(c6740b);
        return provideFactory$lambda$0;
    }
}
