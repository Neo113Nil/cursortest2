package n70;

import B0.A0;
import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8449a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC8449a[] $VALUES;
    public static final EnumC8449a COMMON_ERROR;
    public static final EnumC8449a CONFIRM_FACE;
    public static final EnumC8449a CONNECTED_SMS_STATUS;
    public static final EnumC8449a DONE_TRANSFER_NO_SMS;
    public static final EnumC8449a DONE_TRANSFER_WITH_SMS;
    public static final EnumC8449a NOT_TRANSFER;
    public static final EnumC8449a STATUS_TRANSFER_PREMIUM;
    public static final EnumC8449a TARIFF_AND_LIMITS;
    public static final EnumC8449a TRANSFER_DISABLE_IN_SETTINGS;
    public static final EnumC8449a TRANSFER_WITHOUT_INTERNET;
    public static final EnumC8449a WHATS_AVAILABLE_OFFLINE;

    @NotNull
    private final String fileName;
    private final List<EnumC1291a> placeholders;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: n70.a$a, reason: collision with other inner class name */
    public static final class EnumC1291a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1291a[] $VALUES;
        public static final EnumC1291a AFTER_SUM_KEY;
        public static final EnumC1291a AMOUNT_KEY;
        public static final EnumC1291a BEFORE_SUM_KEY;
        public static final EnumC1291a DATE_KEY;
        public static final EnumC1291a MAX_LIMIT_KEY;
        public static final EnumC1291a MIN_LIMIT_KEY;
        public static final EnumC1291a SMS_AMOUNT_KEY;
        public static final EnumC1291a SMS_RECIPIENT_KEY;
        public static final EnumC1291a SMS_YOU_KEY;

        static {
            EnumC1291a enumC1291a = new EnumC1291a("DATE_KEY", 0);
            DATE_KEY = enumC1291a;
            EnumC1291a enumC1291a2 = new EnumC1291a("MIN_LIMIT_KEY", 1);
            MIN_LIMIT_KEY = enumC1291a2;
            EnumC1291a enumC1291a3 = new EnumC1291a("MAX_LIMIT_KEY", 2);
            MAX_LIMIT_KEY = enumC1291a3;
            EnumC1291a enumC1291a4 = new EnumC1291a("SMS_YOU_KEY", 3);
            SMS_YOU_KEY = enumC1291a4;
            EnumC1291a enumC1291a5 = new EnumC1291a("SMS_RECIPIENT_KEY", 4);
            SMS_RECIPIENT_KEY = enumC1291a5;
            EnumC1291a enumC1291a6 = new EnumC1291a("AMOUNT_KEY", 5);
            AMOUNT_KEY = enumC1291a6;
            EnumC1291a enumC1291a7 = new EnumC1291a("SMS_AMOUNT_KEY", 6);
            SMS_AMOUNT_KEY = enumC1291a7;
            EnumC1291a enumC1291a8 = new EnumC1291a("AFTER_SUM_KEY", 7);
            AFTER_SUM_KEY = enumC1291a8;
            EnumC1291a enumC1291a9 = new EnumC1291a("BEFORE_SUM_KEY", 8);
            BEFORE_SUM_KEY = enumC1291a9;
            EnumC1291a[] enumC1291aArr = {enumC1291a, enumC1291a2, enumC1291a3, enumC1291a4, enumC1291a5, enumC1291a6, enumC1291a7, enumC1291a8, enumC1291a9};
            $VALUES = enumC1291aArr;
            $ENTRIES = Xc.b.a(enumC1291aArr);
        }

        private EnumC1291a() {
            throw null;
        }

        public static EnumC1291a valueOf(String str) {
            return (EnumC1291a) Enum.valueOf(EnumC1291a.class, str);
        }

        public static EnumC1291a[] values() {
            return (EnumC1291a[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        @NotNull
        public final String toString() {
            return A0.b("<", name(), ">");
        }
    }

    static {
        EnumC8449a enumC8449a = new EnumC8449a(0, null, "CONNECTED_SMS_STATUS", "cbottom_offline_connected_sms_status_from_transfer.json");
        CONNECTED_SMS_STATUS = enumC8449a;
        EnumC1291a enumC1291a = EnumC1291a.SMS_AMOUNT_KEY;
        EnumC1291a enumC1291a2 = EnumC1291a.AMOUNT_KEY;
        EnumC8449a enumC8449a2 = new EnumC8449a(1, C7714v.b0(enumC1291a, enumC1291a2), "DONE_TRANSFER_WITH_SMS", "cbottom_offline_done_transfer_with_sms.json");
        DONE_TRANSFER_WITH_SMS = enumC8449a2;
        EnumC8449a enumC8449a3 = new EnumC8449a(2, C7714v.a0(enumC1291a2), "DONE_TRANSFER_NO_SMS", "cbottom_offline_done_transfer_no_sms.json");
        DONE_TRANSFER_NO_SMS = enumC8449a3;
        EnumC8449a enumC8449a4 = new EnumC8449a(3, null, "NOT_TRANSFER", "cbottom_offline_not_transfer.json");
        NOT_TRANSFER = enumC8449a4;
        EnumC8449a enumC8449a5 = new EnumC8449a(4, C7714v.b0(EnumC1291a.BEFORE_SUM_KEY, EnumC1291a.AFTER_SUM_KEY), "STATUS_TRANSFER_PREMIUM", "cbottom_offline_status_transfer_premium.json");
        STATUS_TRANSFER_PREMIUM = enumC8449a5;
        EnumC8449a enumC8449a6 = new EnumC8449a(5, C7714v.b0(EnumC1291a.DATE_KEY, EnumC1291a.MIN_LIMIT_KEY, EnumC1291a.MAX_LIMIT_KEY, EnumC1291a.SMS_YOU_KEY, EnumC1291a.SMS_RECIPIENT_KEY), "TARIFF_AND_LIMITS", "cbottom_offline_tariff_and_limits.json");
        TARIFF_AND_LIMITS = enumC8449a6;
        EnumC8449a enumC8449a7 = new EnumC8449a(6, null, "TRANSFER_WITHOUT_INTERNET", "cbottom_offline_transfer_money_without_internet.json");
        TRANSFER_WITHOUT_INTERNET = enumC8449a7;
        EnumC8449a enumC8449a8 = new EnumC8449a(7, null, "WHATS_AVAILABLE_OFFLINE", "cbottom_whats_available_offline.json");
        WHATS_AVAILABLE_OFFLINE = enumC8449a8;
        EnumC8449a enumC8449a9 = new EnumC8449a(8, null, "CONFIRM_FACE", "cbottom_offline_confirm_face.json");
        CONFIRM_FACE = enumC8449a9;
        EnumC8449a enumC8449a10 = new EnumC8449a(9, null, "TRANSFER_DISABLE_IN_SETTINGS", "cbottom_offline_transfer_disable_in_settings.json");
        TRANSFER_DISABLE_IN_SETTINGS = enumC8449a10;
        EnumC8449a enumC8449a11 = new EnumC8449a(10, null, "COMMON_ERROR", "cbottom_offline_common_error.json");
        COMMON_ERROR = enumC8449a11;
        EnumC8449a[] enumC8449aArr = {enumC8449a, enumC8449a2, enumC8449a3, enumC8449a4, enumC8449a5, enumC8449a6, enumC8449a7, enumC8449a8, enumC8449a9, enumC8449a10, enumC8449a11};
        $VALUES = enumC8449aArr;
        $ENTRIES = Xc.b.a(enumC8449aArr);
    }

    private EnumC8449a(int i11, List list, String str, String str2) {
        this.fileName = str2;
        this.placeholders = list;
    }

    @NotNull
    public static Xc.a<EnumC8449a> a() {
        return $ENTRIES;
    }

    public static EnumC8449a valueOf(String str) {
        return (EnumC8449a) Enum.valueOf(EnumC8449a.class, str);
    }

    public static EnumC8449a[] values() {
        return (EnumC8449a[]) $VALUES.clone();
    }

    @NotNull
    public final String b() {
        return this.fileName;
    }

    public final List<EnumC1291a> d() {
        return this.placeholders;
    }
}
