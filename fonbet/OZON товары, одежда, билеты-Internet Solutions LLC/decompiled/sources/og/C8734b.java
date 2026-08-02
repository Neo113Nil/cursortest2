package og;

import kotlin.jvm.internal.Intrinsics;
import og.AbstractC8733a;
import org.jetbrains.annotations.NotNull;
import v6.C10262f;

/* renamed from: og.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8734b {

    /* renamed from: og.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78331a;

        static {
            int[] iArr = new int[C10262f.a.values().length];
            try {
                iArr[C10262f.a.ERROR_MIRPAY_ACCESS_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_APP_NEED_TO_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_INTERNAL_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_MERCHANT_TOKEN_VALIDATION_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_NO_AVAILABLE_PAYMENT_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_SDK_NEED_TO_UPDATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_SDK_WRONG_VERSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_SECURITY_ISSUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C10262f.a.ERROR_MIRPAY_SETUP_NOT_COMPLETE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f78331a = iArr;
        }
    }

    public static final void a(@NotNull C10262f.a resultType) throws AbstractC8733a {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Throwable th2 = null;
        switch (a.f78331a[resultType.ordinal()]) {
            case 1:
                int i11 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.C1328a.f78320b;
                break;
            case 2:
                int i12 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.c.f78322b;
                break;
            case 3:
                int i13 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.h.f78327b;
                break;
            case 4:
                int i14 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.d.a(3, null);
                break;
            case 5:
                int i15 = AbstractC8733a.f78319a;
                th2 = new AbstractC8733a.f();
                break;
            case 6:
                int i16 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.g.f78326b;
                break;
            case 7:
                int i17 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.i.f78328b;
                break;
            case 8:
                int i18 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.k.f78330b;
                break;
            case 9:
                int i19 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.j.f78329b;
                break;
            case 10:
                int i21 = AbstractC8733a.f78319a;
                th2 = AbstractC8733a.b.f78321b;
                break;
        }
        if (th2 != null) {
            throw th2;
        }
    }
}
