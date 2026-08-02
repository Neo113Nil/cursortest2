package v6;

import android.content.Intent;

/* renamed from: v6.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10262f {

    /* renamed from: a, reason: collision with root package name */
    private final a f102438a;

    /* renamed from: b, reason: collision with root package name */
    private final String f102439b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f102440c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: v6.f$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR_MIRPAY_ACCESS_DENIED;
        public static final a ERROR_MIRPAY_APP_NEED_TO_UPDATE;
        public static final a ERROR_MIRPAY_DISCONNECTED;
        public static final a ERROR_MIRPAY_INTERNAL_ERROR;
        public static final a ERROR_MIRPAY_MERCHANT_TOKEN_VALIDATION_FAILED;
        public static final a ERROR_MIRPAY_NO_AVAILABLE_PAYMENT_CARD;
        public static final a ERROR_MIRPAY_SDK_NEED_TO_UPDATE;
        public static final a ERROR_MIRPAY_SDK_WRONG_VERSION;
        public static final a ERROR_MIRPAY_SECURITY_ISSUE;
        public static final a ERROR_MIRPAY_SETUP_NOT_COMPLETE;
        public static final a SUCCESS_WITH_DATA;
        public static final a SUCCESS_WITH_INTENT;

        static {
            a aVar = new a("SUCCESS_WITH_DATA", 0);
            SUCCESS_WITH_DATA = aVar;
            a aVar2 = new a("SUCCESS_WITH_INTENT", 1);
            SUCCESS_WITH_INTENT = aVar2;
            a aVar3 = new a("ERROR_MIRPAY_SETUP_NOT_COMPLETE", 2);
            ERROR_MIRPAY_SETUP_NOT_COMPLETE = aVar3;
            a aVar4 = new a("ERROR_MIRPAY_APP_NEED_TO_UPDATE", 3);
            ERROR_MIRPAY_APP_NEED_TO_UPDATE = aVar4;
            a aVar5 = new a("ERROR_MIRPAY_SECURITY_ISSUE", 4);
            ERROR_MIRPAY_SECURITY_ISSUE = aVar5;
            a aVar6 = new a("ERROR_MIRPAY_SDK_NEED_TO_UPDATE", 5);
            ERROR_MIRPAY_SDK_NEED_TO_UPDATE = aVar6;
            a aVar7 = new a("ERROR_MIRPAY_SDK_WRONG_VERSION", 6);
            ERROR_MIRPAY_SDK_WRONG_VERSION = aVar7;
            a aVar8 = new a("ERROR_MIRPAY_ACCESS_DENIED", 7);
            ERROR_MIRPAY_ACCESS_DENIED = aVar8;
            a aVar9 = new a("ERROR_MIRPAY_INTERNAL_ERROR", 8);
            ERROR_MIRPAY_INTERNAL_ERROR = aVar9;
            a aVar10 = new a("ERROR_MIRPAY_MERCHANT_TOKEN_VALIDATION_FAILED", 9);
            ERROR_MIRPAY_MERCHANT_TOKEN_VALIDATION_FAILED = aVar10;
            a aVar11 = new a("ERROR_MIRPAY_NO_AVAILABLE_PAYMENT_CARD", 10);
            ERROR_MIRPAY_NO_AVAILABLE_PAYMENT_CARD = aVar11;
            a aVar12 = new a("ERROR_MIRPAY_DISCONNECTED", 11);
            ERROR_MIRPAY_DISCONNECTED = aVar12;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
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

    C10262f(a aVar, String str, Intent intent) {
        boolean z11 = false;
        if (aVar == a.SUCCESS_WITH_DATA && str == null) {
            throw new IllegalArgumentException("Cannot create SUCCESS_WITH_DATA without data");
        }
        if (aVar == a.SUCCESS_WITH_INTENT && intent == null) {
            z11 = true;
        }
        if (z11) {
            throw new IllegalArgumentException("Cannot create SUCCESS_WITH_INTENT without intent");
        }
        this.f102438a = aVar;
        this.f102439b = str;
        this.f102440c = intent;
    }

    public final String a() {
        return this.f102439b;
    }

    public final Intent b() {
        return this.f102440c;
    }

    public final a c() {
        return this.f102438a;
    }

    public final boolean d() {
        a aVar = a.SUCCESS_WITH_DATA;
        a aVar2 = this.f102438a;
        return (aVar2 == aVar || aVar2 == a.SUCCESS_WITH_INTENT) ? false : true;
    }
}
