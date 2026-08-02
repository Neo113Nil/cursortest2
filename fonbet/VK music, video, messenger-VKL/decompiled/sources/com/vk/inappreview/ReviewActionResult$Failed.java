package com.vk.inappreview;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* compiled from: ReviewActionResult.kt */
/* loaded from: classes2.dex */
public final class ReviewActionResult$Failed extends Exception {
    private final ErrorReason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReviewActionResult.kt */
    public static final class ErrorReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorReason[] $VALUES;
        public static final ErrorReason CANCELLED;
        public static final ErrorReason INTERNAL_ERROR;
        public static final ErrorReason INVALID_REQUEST;
        public static final ErrorReason STORE_NOT_FOUND;
        public static final ErrorReason UNKNOWN;

        static {
            ErrorReason errorReason = new ErrorReason("INTERNAL_ERROR", 0);
            INTERNAL_ERROR = errorReason;
            ErrorReason errorReason2 = new ErrorReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
            UNKNOWN = errorReason2;
            ErrorReason errorReason3 = new ErrorReason("STORE_NOT_FOUND", 2);
            STORE_NOT_FOUND = errorReason3;
            ErrorReason errorReason4 = new ErrorReason("INVALID_REQUEST", 3);
            INVALID_REQUEST = errorReason4;
            ErrorReason errorReason5 = new ErrorReason("CANCELLED", 4);
            CANCELLED = errorReason5;
            ErrorReason[] errorReasonArr = {errorReason, errorReason2, errorReason3, errorReason4, errorReason5};
            $VALUES = errorReasonArr;
            $ENTRIES = new asp(errorReasonArr);
        }

        public ErrorReason() {
            throw null;
        }

        public static ErrorReason valueOf(String str) {
            return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
        }

        public static ErrorReason[] values() {
            return (ErrorReason[]) $VALUES.clone();
        }
    }

    public ReviewActionResult$Failed(ErrorReason errorReason) {
        this.reason = errorReason;
    }
}
