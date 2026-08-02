package v6;

/* renamed from: v6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10260d {

    /* renamed from: a, reason: collision with root package name */
    private final a f102435a;

    /* renamed from: b, reason: collision with root package name */
    private final String f102436b;

    /* renamed from: c, reason: collision with root package name */
    private final String f102437c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: v6.d$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADD_CARD;
        public static final a APP_STORES;
        public static final a CARD_DETAILS;
        public static final a CARD_LIST;
        public static final a CREATE_ADD_PAYMENT_CARD_INTENT;
        public static final a CREATE_PAYMENT_INTENT;
        public static final a INIT;
        public static final a INIT_PAYMENT_CLIENT;

        static {
            a aVar = new a("ADD_CARD", 0);
            ADD_CARD = aVar;
            a aVar2 = new a("APP_STORES", 1);
            APP_STORES = aVar2;
            a aVar3 = new a("INIT", 2);
            INIT = aVar3;
            a aVar4 = new a("INIT_PAYMENT_CLIENT", 3);
            INIT_PAYMENT_CLIENT = aVar4;
            a aVar5 = new a("CARD_DETAILS", 4);
            CARD_DETAILS = aVar5;
            a aVar6 = new a("CARD_LIST", 5);
            CARD_LIST = aVar6;
            a aVar7 = new a("CREATE_ADD_PAYMENT_CARD_INTENT", 6);
            CREATE_ADD_PAYMENT_CARD_INTENT = aVar7;
            a aVar8 = new a("CREATE_PAYMENT_INTENT", 7);
            CREATE_PAYMENT_INTENT = aVar8;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    C10260d(a aVar, String str, String str2) {
        this.f102435a = aVar;
        this.f102436b = str;
        this.f102437c = str2;
    }

    public static C10260d a(String str, String str2) {
        return new C10260d(a.ADD_CARD, str, str2);
    }

    public static C10260d b(String str) {
        return new C10260d(a.CARD_LIST, str, null);
    }

    public static C10260d f(String str) {
        return new C10260d(a.INIT, null, str);
    }

    public final a c() {
        return this.f102435a;
    }

    public final String d() {
        return this.f102437c;
    }

    public final String e() {
        return this.f102436b;
    }
}
