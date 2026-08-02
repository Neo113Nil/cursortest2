package ru.ozon.fintech.features.operations.ui.operationinfo;

import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f96095a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f96096b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f96097c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f96098d;

    /* renamed from: e, reason: collision with root package name */
    private final String f96099e;

    /* renamed from: f, reason: collision with root package name */
    private final String f96100f;

    /* renamed from: g, reason: collision with root package name */
    private final Integer f96101g;

    /* renamed from: h, reason: collision with root package name */
    private final String f96102h;

    /* renamed from: i, reason: collision with root package name */
    private final C2066a f96103i;

    /* renamed from: j, reason: collision with root package name */
    private final String f96104j;

    /* renamed from: k, reason: collision with root package name */
    private final int f96105k;

    /* renamed from: ru.ozon.fintech.features.operations.ui.operationinfo.a$a, reason: collision with other inner class name */
    public static final class C2066a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC2067a f96106a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f96107b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: ru.ozon.fintech.features.operations.ui.operationinfo.a$a$a, reason: collision with other inner class name */
        public static final class EnumC2067a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ EnumC2067a[] $VALUES;
            public static final EnumC2067a CURRENCY;
            public static final EnumC2067a PREMIUM;

            static {
                EnumC2067a enumC2067a = new EnumC2067a("PREMIUM", 0);
                PREMIUM = enumC2067a;
                EnumC2067a enumC2067a2 = new EnumC2067a("CURRENCY", 1);
                CURRENCY = enumC2067a2;
                EnumC2067a[] enumC2067aArr = {enumC2067a, enumC2067a2};
                $VALUES = enumC2067aArr;
                $ENTRIES = Xc.b.a(enumC2067aArr);
            }

            private EnumC2067a() {
                throw null;
            }

            public static EnumC2067a valueOf(String str) {
                return (EnumC2067a) Enum.valueOf(EnumC2067a.class, str);
            }

            public static EnumC2067a[] values() {
                return (EnumC2067a[]) $VALUES.clone();
            }
        }

        public C2066a(@NotNull EnumC2067a type, @NotNull String count) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(count, "count");
            this.f96106a = type;
            this.f96107b = count;
        }

        @NotNull
        public final String a() {
            return this.f96107b;
        }

        @NotNull
        public final EnumC2067a b() {
            return this.f96106a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2066a)) {
                return false;
            }
            C2066a c2066a = (C2066a) obj;
            return this.f96106a == c2066a.f96106a && Intrinsics.d(this.f96107b, c2066a.f96107b);
        }

        public final int hashCode() {
            return this.f96107b.hashCode() + (this.f96106a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CacheBack(type=" + this.f96106a + ", count=" + this.f96107b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ERROR;
        public static final b PROCESS;
        public static final b SUCCESS;
        private final int cardIcon;
        private final int textColor;

        static {
            b bVar = new b("SUCCESS", 0, R.drawable.fintech_operations_ic_confirmed_16, R.color.fintech_operations_success_status_color);
            SUCCESS = bVar;
            b bVar2 = new b("ERROR", 1, R.drawable.fintech_operations_ic_error_16, R.color.fintech_operations_error_status_color);
            ERROR = bVar2;
            b bVar3 = new b("PROCESS", 2, R.drawable.fintech_operations_ic_process_16, R.color.fintech_operations_process_status_color);
            PROCESS = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b(String str, int i11, int i12, int i13) {
            this.cardIcon = i12;
            this.textColor = i13;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int a() {
            return this.cardIcon;
        }

        public final int b() {
            return this.textColor;
        }
    }

    public a() {
        throw null;
    }

    public a(b statusType, String operationStatusTitle, String price, String infoFrom, String str, String str2, Integer num, String str3, C2066a c2066a, String str4, int i11) {
        num = (i11 & 64) != 0 ? null : num;
        c2066a = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : c2066a;
        str4 = (i11 & 2048) != 0 ? null : str4;
        Intrinsics.checkNotNullParameter(statusType, "statusType");
        Intrinsics.checkNotNullParameter(operationStatusTitle, "operationStatusTitle");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(infoFrom, "infoFrom");
        this.f96095a = statusType;
        this.f96096b = operationStatusTitle;
        this.f96097c = price;
        this.f96098d = infoFrom;
        this.f96099e = str;
        this.f96100f = str2;
        this.f96101g = num;
        this.f96102h = str3;
        this.f96103i = c2066a;
        this.f96104j = str4;
        this.f96105k = R.drawable.fintech_operations_ic_info_24;
    }

    public final C2066a a() {
        return this.f96103i;
    }

    public final Integer b() {
        return this.f96101g;
    }

    public final String c() {
        return this.f96102h;
    }

    public final String d() {
        return this.f96104j;
    }

    public final String e() {
        return this.f96100f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96095a == aVar.f96095a && Intrinsics.d(this.f96096b, aVar.f96096b) && Intrinsics.d(this.f96097c, aVar.f96097c) && Intrinsics.d(this.f96098d, aVar.f96098d) && Intrinsics.d(this.f96099e, aVar.f96099e) && Intrinsics.d(this.f96100f, aVar.f96100f) && Intrinsics.d(this.f96101g, aVar.f96101g) && Intrinsics.d(this.f96102h, aVar.f96102h) && Intrinsics.d(this.f96103i, aVar.f96103i) && Intrinsics.d(this.f96104j, aVar.f96104j) && this.f96105k == aVar.f96105k;
    }

    @NotNull
    public final String f() {
        return this.f96098d;
    }

    public final String g() {
        return this.f96099e;
    }

    @NotNull
    public final String h() {
        return this.f96096b;
    }

    public final int hashCode() {
        int a11 = g.a(g.a(g.a(this.f96095a.hashCode() * 31, 31, this.f96096b), 31, this.f96097c), 31, this.f96098d);
        String str = this.f96099e;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f96100f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f96101g;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f96102h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 961;
        C2066a c2066a = this.f96103i;
        int hashCode5 = (hashCode4 + (c2066a == null ? 0 : c2066a.hashCode())) * 961;
        String str4 = this.f96104j;
        return Integer.hashCode(this.f96105k) + ((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 961);
    }

    @NotNull
    public final String i() {
        return this.f96097c;
    }

    @NotNull
    public final b j() {
        return this.f96095a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperationInfoCard(statusType=");
        sb2.append(this.f96095a);
        sb2.append(", operationStatusTitle=");
        sb2.append(this.f96096b);
        sb2.append(", price=");
        sb2.append(this.f96097c);
        sb2.append(", infoFrom=");
        sb2.append(this.f96098d);
        sb2.append(", infoTo=");
        sb2.append(this.f96099e);
        sb2.append(", description=");
        sb2.append(this.f96100f);
        sb2.append(", cardIcon=");
        sb2.append(this.f96101g);
        sb2.append(", cardIconUrl=");
        sb2.append(this.f96102h);
        sb2.append(", oldPrice=null, cacheBack=");
        sb2.append(this.f96103i);
        sb2.append(", discountInfo=null, commission=");
        sb2.append(this.f96104j);
        sb2.append(", onCardClick=null, discountInfoIcon=");
        return K00.b.e(this.f96105k, ")", sb2);
    }
}
