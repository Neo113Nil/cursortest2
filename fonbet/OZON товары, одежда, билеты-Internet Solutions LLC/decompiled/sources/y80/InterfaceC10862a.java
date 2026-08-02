package y80;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* renamed from: y80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10862a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: y80.a$a, reason: collision with other inner class name */
    public static final class EnumC2293a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC2293a[] $VALUES;
        public static final EnumC2293a INTEGRATION;
        public static final EnumC2293a OZON_BROWSER;
        public static final EnumC2293a OZON_ID_RECOVERY;
        public static final EnumC2293a OZON_OTHERS;
        public static final EnumC2293a OZON_PAYMENT;
        public static final EnumC2293a OZON_WEB;
        public static final EnumC2293a OZON_WEB_AUTH;
        public static final EnumC2293a OZON_WEB_AUTH_NEW_ARCH;
        public static final EnumC2293a SYSTEM;

        static {
            EnumC2293a enumC2293a = new EnumC2293a("OZON_ID_RECOVERY", 0);
            OZON_ID_RECOVERY = enumC2293a;
            EnumC2293a enumC2293a2 = new EnumC2293a("OZON_WEB_AUTH", 1);
            OZON_WEB_AUTH = enumC2293a2;
            EnumC2293a enumC2293a3 = new EnumC2293a("OZON_WEB_AUTH_NEW_ARCH", 2);
            OZON_WEB_AUTH_NEW_ARCH = enumC2293a3;
            EnumC2293a enumC2293a4 = new EnumC2293a("OZON_PAYMENT", 3);
            OZON_PAYMENT = enumC2293a4;
            EnumC2293a enumC2293a5 = new EnumC2293a("OZON_WEB", 4);
            OZON_WEB = enumC2293a5;
            EnumC2293a enumC2293a6 = new EnumC2293a("OZON_BROWSER", 5);
            OZON_BROWSER = enumC2293a6;
            EnumC2293a enumC2293a7 = new EnumC2293a("OZON_OTHERS", 6);
            OZON_OTHERS = enumC2293a7;
            EnumC2293a enumC2293a8 = new EnumC2293a("INTEGRATION", 7);
            INTEGRATION = enumC2293a8;
            EnumC2293a enumC2293a9 = new EnumC2293a("SYSTEM", 8);
            SYSTEM = enumC2293a9;
            EnumC2293a[] enumC2293aArr = {enumC2293a, enumC2293a2, enumC2293a3, enumC2293a4, enumC2293a5, enumC2293a6, enumC2293a7, enumC2293a8, enumC2293a9};
            $VALUES = enumC2293aArr;
            $ENTRIES = Xc.b.a(enumC2293aArr);
        }

        private EnumC2293a() {
            throw null;
        }

        @NotNull
        public static Xc.a<EnumC2293a> a() {
            return $ENTRIES;
        }

        public static EnumC2293a valueOf(String str) {
            return (EnumC2293a) Enum.valueOf(EnumC2293a.class, str);
        }

        public static EnumC2293a[] values() {
            return (EnumC2293a[]) $VALUES.clone();
        }
    }

    boolean a(@NotNull String str, @NotNull Uri uri, @NotNull Uri uri2);

    void b(@NotNull String str, @NotNull Uri uri, @NotNull Uri uri2);

    boolean c();

    @NotNull
    EnumC2293a getType();
}
