package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import Hj.C3143a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"deleteAllExceptNumbers", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecipientViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteAllExceptNumbers(String str) {
        return C3143a.g("[^0-9]", str, "");
    }
}
