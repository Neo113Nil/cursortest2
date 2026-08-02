package t6;

import v6.C10262f;

/* renamed from: t6.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9772g extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final b f99217a;

    /* renamed from: t6.g$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99218a;

        static {
            int[] iArr = new int[C10262f.a.values().length];
            f99218a = iArr;
            try {
                iArr[C10262f.a.ERROR_MIRPAY_SETUP_NOT_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_APP_NEED_TO_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_SECURITY_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_SDK_NEED_TO_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_SDK_WRONG_VERSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_ACCESS_DENIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99218a[C10262f.a.ERROR_MIRPAY_DISCONNECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: t6.g$b */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ACCESS_DENIED;
        public static final b APP_UPDATE_REQUIRED;
        public static final b CARD_EXPIRED;
        public static final b CONFLICT_DATA;
        public static final b DISCONNECTED;
        public static final b INTERNAL_ERROR;
        public static final b INVALID_DATA;
        public static final b NOT_SUPPORTED_CARD;
        public static final b REJECTED_BY_ISSUER;
        public static final b SDK_UPDATE_REQUIRED;
        public static final b SDK_WRONG_VERSION;
        public static final b SECURITY_ISSUE;
        public static final b SETUP_NOT_COMPLETE;

        static {
            b bVar = new b("SETUP_NOT_COMPLETE", 0);
            SETUP_NOT_COMPLETE = bVar;
            b bVar2 = new b("APP_UPDATE_REQUIRED", 1);
            APP_UPDATE_REQUIRED = bVar2;
            b bVar3 = new b("SDK_UPDATE_REQUIRED", 2);
            SDK_UPDATE_REQUIRED = bVar3;
            b bVar4 = new b("SDK_WRONG_VERSION", 3);
            SDK_WRONG_VERSION = bVar4;
            b bVar5 = new b("SECURITY_ISSUE", 4);
            SECURITY_ISSUE = bVar5;
            b bVar6 = new b("ACCESS_DENIED", 5);
            ACCESS_DENIED = bVar6;
            b bVar7 = new b("INTERNAL_ERROR", 6);
            INTERNAL_ERROR = bVar7;
            b bVar8 = new b("INVALID_DATA", 7);
            INVALID_DATA = bVar8;
            b bVar9 = new b("CONFLICT_DATA", 8);
            CONFLICT_DATA = bVar9;
            b bVar10 = new b("CARD_EXPIRED", 9);
            CARD_EXPIRED = bVar10;
            b bVar11 = new b("NOT_SUPPORTED_CARD", 10);
            NOT_SUPPORTED_CARD = bVar11;
            b bVar12 = new b("REJECTED_BY_ISSUER", 11);
            REJECTED_BY_ISSUER = bVar12;
            b bVar13 = new b("DISCONNECTED", 12);
            DISCONNECTED = bVar13;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13};
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

    public C9772g(String str, b bVar, Exception exc) {
        super("[" + bVar + "]" + str, exc);
        this.f99217a = bVar;
    }

    public final b a() {
        return this.f99217a;
    }

    public C9772g(String str, b bVar) {
        super("[" + bVar + "]" + str);
        this.f99217a = bVar;
    }
}
