package t6;

import java.util.HashMap;
import java.util.Map;
import t6.C9772g;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC9766a {
    MIRPAY_SUCCESS("MIRPAY_SUCCESS"),
    MIRPAY_CANCELLED("MIRPAY_CANCELLED"),
    ERROR_MIRPAY_INVALID_DATA("ERROR_MIRPAY_INVALID_DATA"),
    ERROR_MIRPAY_CONFLICT_DATA("ERROR_MIRPAY_CONFLICT_DATA"),
    ERROR_MIRPAY_CARD_EXPIRED("ERROR_MIRPAY_CARD_EXPIRED"),
    ERROR_MIRPAY_NOT_SUPPORTED_CARD("ERROR_MIRPAY_NOT_SUPPORTED_CARD"),
    ERROR_MIRPAY_REJECTED_BY_ISSUER("ERROR_MIRPAY_REJECTED_BY_ISSUER"),
    ERROR_MIRPAY_ACCESS_DENIED("ERROR_MIRPAY_ACCESS_DENIED"),
    ERROR_MIRPAY_INTERNAL_ERROR("ERROR_MIRPAY_INTERNAL_ERROR");

    private static final Map<String, EnumC9766a> sValues = new HashMap();
    private final String mKey;

    static {
        for (EnumC9766a enumC9766a : values()) {
            sValues.put(enumC9766a.mKey, enumC9766a);
        }
    }

    EnumC9766a(String str) {
        this.mKey = str;
    }

    public static EnumC9766a a(String str) throws C9772g {
        EnumC9766a enumC9766a = sValues.get(str);
        if (enumC9766a != null) {
            return enumC9766a;
        }
        throw new C9772g("Failed to match result type key: ".concat(str), C9772g.b.INTERNAL_ERROR);
    }
}
