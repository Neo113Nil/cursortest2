package ru.ozon.app.android.account.orders.recipientWidget.data;

import kotlin.Metadata;
import kotlin.text.h;
import ru.ozon.app.android.account.orders.recipientWidget.data.ChangeRecipientException;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.ChangeRecipientModel;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0002\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"toChangeRecipientException", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientException;", "", "toRegularRequest", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/ChangeRecipientModel;", "toOrderRequest", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeOrderRecipientRequest;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeRecipientRepositoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeRecipientException toChangeRecipientException(String str) {
        return new ChangeRecipientException(str, new ChangeRecipientException.ErrorData(str, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeOrderRecipientRequest toOrderRequest(ChangeRecipientModel changeRecipientModel) {
        String orderNumber = changeRecipientModel.getOrderNumber();
        if (orderNumber != null) {
            return new ChangeOrderRecipientRequest(orderNumber, changeRecipientModel.getFirstName(), changeRecipientModel.getLastName(), changeRecipientModel.getPhone());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeRegularRecipientRequest toRegularRequest(ChangeRecipientModel changeRecipientModel) {
        Long y02;
        String regularId = changeRecipientModel.getRegularId();
        if (regularId == null || (y02 = h.y0(regularId)) == null) {
            return null;
        }
        return new ChangeRegularRecipientRequest(y02.longValue(), changeRecipientModel.getFirstName(), changeRecipientModel.getLastName(), changeRecipientModel.getPhone());
    }
}
