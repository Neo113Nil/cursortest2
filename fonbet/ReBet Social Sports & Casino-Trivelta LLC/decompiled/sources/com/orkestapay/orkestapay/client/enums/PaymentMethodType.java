package com.orkestapay.orkestapay.client.enums;

import com.orkestapay.orkestapay.core.clicktopay.WebviewActivity;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "", "(Ljava/lang/String;I)V", "CARD", "APPLE_PAY", WebviewActivity.CLICK_TO_PAY, "GOOGLE_PAY", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentMethodType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentMethodType[] $VALUES;
    public static final PaymentMethodType CARD = new PaymentMethodType("CARD", 0);
    public static final PaymentMethodType APPLE_PAY = new PaymentMethodType("APPLE_PAY", 1);
    public static final PaymentMethodType CLICK_TO_PAY = new PaymentMethodType(WebviewActivity.CLICK_TO_PAY, 2);
    public static final PaymentMethodType GOOGLE_PAY = new PaymentMethodType("GOOGLE_PAY", 3);

    private static final /* synthetic */ PaymentMethodType[] $values() {
        return new PaymentMethodType[]{CARD, APPLE_PAY, CLICK_TO_PAY, GOOGLE_PAY};
    }

    static {
        PaymentMethodType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PaymentMethodType(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<PaymentMethodType> getEntries() {
        return $ENTRIES;
    }

    public static PaymentMethodType valueOf(String str) {
        return (PaymentMethodType) Enum.valueOf(PaymentMethodType.class, str);
    }

    public static PaymentMethodType[] values() {
        return (PaymentMethodType[]) $VALUES.clone();
    }
}
