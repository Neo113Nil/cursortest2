package defpackage;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class tx9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
        a = iArr;
        try {
            iArr[InMobiAdRequestStatus.StatusCode.NO_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            a[InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
    }
}
