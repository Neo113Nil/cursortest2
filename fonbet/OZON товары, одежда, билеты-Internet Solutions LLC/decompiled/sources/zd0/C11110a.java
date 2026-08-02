package zd0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11110a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f108853a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC2347a f108854b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zd0.a$a, reason: collision with other inner class name */
    public static final class EnumC2347a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC2347a[] $VALUES;
        public static final EnumC2347a BANK;
        public static final EnumC2347a BANK_SME;
        public static final EnumC2347a BENEFIT;

        /* renamed from: BX, reason: collision with root package name */
        public static final EnumC2347a f108855BX;

        /* renamed from: CA, reason: collision with root package name */
        public static final EnumC2347a f108856CA;
        public static final EnumC2347a FC;
        public static final EnumC2347a FRESH;
        public static final EnumC2347a FT;

        /* renamed from: FX, reason: collision with root package name */
        public static final EnumC2347a f108857FX;
        public static final EnumC2347a HIRE;
        public static final EnumC2347a MPX;
        public static final EnumC2347a PROFIT;
        public static final EnumC2347a PVZ;
        public static final EnumC2347a PushSDKDemo;
        public static final EnumC2347a SELECT;
        public static final EnumC2347a SX;
        public static final EnumC2347a SX_CY;
        public static final EnumC2347a TRAVEL;

        static {
            EnumC2347a enumC2347a = new EnumC2347a("BX", 0);
            f108855BX = enumC2347a;
            EnumC2347a enumC2347a2 = new EnumC2347a("BANK", 1);
            BANK = enumC2347a2;
            EnumC2347a enumC2347a3 = new EnumC2347a("BANK_SME", 2);
            BANK_SME = enumC2347a3;
            EnumC2347a enumC2347a4 = new EnumC2347a("SX", 3);
            SX = enumC2347a4;
            EnumC2347a enumC2347a5 = new EnumC2347a("CA", 4);
            f108856CA = enumC2347a5;
            EnumC2347a enumC2347a6 = new EnumC2347a("FC", 5);
            FC = enumC2347a6;
            EnumC2347a enumC2347a7 = new EnumC2347a("FX", 6);
            f108857FX = enumC2347a7;
            EnumC2347a enumC2347a8 = new EnumC2347a("FT", 7);
            FT = enumC2347a8;
            EnumC2347a enumC2347a9 = new EnumC2347a("PushSDKDemo", 8);
            PushSDKDemo = enumC2347a9;
            EnumC2347a enumC2347a10 = new EnumC2347a("HIRE", 9);
            HIRE = enumC2347a10;
            EnumC2347a enumC2347a11 = new EnumC2347a("TRAVEL", 10);
            TRAVEL = enumC2347a11;
            EnumC2347a enumC2347a12 = new EnumC2347a("SELECT", 11);
            SELECT = enumC2347a12;
            EnumC2347a enumC2347a13 = new EnumC2347a("FRESH", 12);
            FRESH = enumC2347a13;
            EnumC2347a enumC2347a14 = new EnumC2347a("PVZ", 13);
            PVZ = enumC2347a14;
            EnumC2347a enumC2347a15 = new EnumC2347a("BENEFIT", 14);
            BENEFIT = enumC2347a15;
            EnumC2347a enumC2347a16 = new EnumC2347a("MPX", 15);
            MPX = enumC2347a16;
            EnumC2347a enumC2347a17 = new EnumC2347a("SX_CY", 16);
            SX_CY = enumC2347a17;
            EnumC2347a enumC2347a18 = new EnumC2347a("PROFIT", 17);
            PROFIT = enumC2347a18;
            EnumC2347a[] enumC2347aArr = {enumC2347a, enumC2347a2, enumC2347a3, enumC2347a4, enumC2347a5, enumC2347a6, enumC2347a7, enumC2347a8, enumC2347a9, enumC2347a10, enumC2347a11, enumC2347a12, enumC2347a13, enumC2347a14, enumC2347a15, enumC2347a16, enumC2347a17, enumC2347a18};
            $VALUES = enumC2347aArr;
            $ENTRIES = Xc.b.a(enumC2347aArr);
        }

        private EnumC2347a() {
            throw null;
        }

        public static EnumC2347a valueOf(String str) {
            return (EnumC2347a) Enum.valueOf(EnumC2347a.class, str);
        }

        public static EnumC2347a[] values() {
            return (EnumC2347a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zd0.a$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b BETA;
        public static final b DEBUG;
        public static final b ENTERPRISE;
        public static final b PROD;
        public static final b PROD_DEBUG;
        public static final b PROD_RELEASE;

        /* renamed from: QA, reason: collision with root package name */
        public static final b f108858QA;
        public static final b QA_DEBUG;
        public static final b QA_RELEASE;
        public static final b RELEASE;

        static {
            b bVar = new b("PROD", 0);
            PROD = bVar;
            b bVar2 = new b("PROD_RELEASE", 1);
            PROD_RELEASE = bVar2;
            b bVar3 = new b("PROD_DEBUG", 2);
            PROD_DEBUG = bVar3;
            b bVar4 = new b("QA_RELEASE", 3);
            QA_RELEASE = bVar4;
            b bVar5 = new b("QA_DEBUG", 4);
            QA_DEBUG = bVar5;
            b bVar6 = new b("QA", 5);
            f108858QA = bVar6;
            b bVar7 = new b("RELEASE", 6);
            RELEASE = bVar7;
            b bVar8 = new b("ENTERPRISE", 7);
            ENTERPRISE = bVar8;
            b bVar9 = new b("DEBUG", 8);
            DEBUG = bVar9;
            b bVar10 = new b("BETA", 9);
            BETA = bVar10;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* renamed from: zd0.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f108859a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final EnumC2347a f108860b;

        public c(@NotNull b buildType, @NotNull EnumC2347a applicationName) {
            Intrinsics.checkNotNullParameter(buildType, "buildType");
            Intrinsics.checkNotNullParameter(applicationName, "applicationName");
            this.f108859a = buildType;
            this.f108860b = applicationName;
        }

        @NotNull
        public final C11110a a() {
            return new C11110a(this.f108859a, this.f108860b);
        }
    }

    public C11110a(b bVar, EnumC2347a enumC2347a) {
        this.f108853a = bVar;
        this.f108854b = enumC2347a;
    }

    @NotNull
    public final EnumC2347a a() {
        return this.f108854b;
    }

    @NotNull
    public final b b() {
        return this.f108853a;
    }
}
