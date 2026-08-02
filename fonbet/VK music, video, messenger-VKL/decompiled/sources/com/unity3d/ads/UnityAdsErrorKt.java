package com.unity3d.ads;

import gatewayprotocol.v1.ErrorOuterClass;
import xsna.zr;

/* compiled from: UnityAdsError.kt */
/* loaded from: classes14.dex */
public final class UnityAdsErrorKt {
    private static final String BOLD_LOAD_FAIL_MSG_PREF = "Unity Ads SDK ad load failed:";
    public static final String MSG_BOLD_LOAD_FAIL_INSUFFICIENT_STORAGE = "Unity Ads SDK ad load failed: Insufficient storage space on the device. Free up space and try again.";
    public static final String MSG_BOLD_LOAD_FAIL_NETWORK_ERROR = "Unity Ads SDK ad load failed: Network error occurred. Check your network connection and try again later.";
    public static final String MSG_BOLD_LOAD_FAIL_NO_FILL = "Unity Ads SDK ad load failed: No ad fill available for the requested placement.";
    public static final String MSG_BOLD_LOAD_FAIL_PARSING_ERROR = "Unity Ads SDK ad load failed: Internal error occurred while parsing ad response.";
    public static final String MSG_BOLD_LOAD_FAIL_PLACEMENT_NOT_FOUND = "Unity Ads SDK ad load failed: Placement not found. Use the correct placement ID from your Unity Ads Monetization dashboard.";
    public static final String MSG_BOLD_LOAD_FAIL_PROTO_ERROR = "Unity Ads SDK ad load failed: Internal protocol error occurred. Try again later.";
    public static final String MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED = "Unity Ads SDK ad load failed: The Unity Ads SDK is not initialized. Initialize the SDK before loading ads.";
    public static final String MSG_BOLD_LOAD_FAIL_TIME_OUT = "Unity Ads SDK ad load failed: Request timed out. Check your network connection and try again later.\n";
    public static final String MSG_BOLD_LOAD_FAIL_UNSUPPORTED_PLACEMENT = "Unity Ads SDK ad load failed: The placement ID doesn’t match the ad format or the placement type. Check your placement settings in the Monetization dashboard.";
    public static final String MSG_BOLD_SHOW_FAIL_AD_OBJECT_EXPIRED = "Unity Ads SDK ad show failed: The ad has expired. Load a new ad.";
    public static final String MSG_BOLD_SHOW_FAIL_ALREADY_SHOWING = "Unity Ads SDK ad show failed: An ad is already being shown. Wait until the current ad finishes before showing a new one.";
    public static final String MSG_BOLD_SHOW_FAIL_INTERNAL_ERROR = "Unity Ads SDK ad show failed: Internal error occurred.";
    public static final String MSG_BOLD_SHOW_FAIL_TIMEOUT = "Unity Ads SDK ad show failed: Request timed out. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_GAME_NOT_FOUND = "Invalid Game ID: %s. Verify the Game ID in your Unity Ads Monetization dashboard.";
    public static final String MSG_INIT_FAIL_INSUFFICIENT_STORAGE = "Unity Ads SDK initialization failed: Insufficient storage space on the device. Free up space and try again.";
    public static final String MSG_INIT_FAIL_NETWORK_ERROR = "Unity Ads SDK initialization failed: Network error occurred. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_PARSING_ERROR = "Unity Ads SDK initialization failed: Internal protocol error occurred.Try again later.";
    public static final String MSG_INIT_FAIL_SYSTEM_ERROR = "Unity Ads SDK initialization failed: System error occurred. Try again later.";
    public static final String MSG_INIT_FAIL_TIMEOUT = "Unity Ads SDK initialization failed: Request timed out. Check your network connection and try again later.";
    public static final String MSG_INIT_FAIL_UNKNOWN_ERROR = "Unity Ads SDK initialization failed: Unknown error occurred.";
    public static final String MSG_INIT_FAIL_WRONG_PLATFORM = "Unity Ads SDK initialization failed: Game ID mismatch. Use the correct Game ID for the target platform from your Unity Ads Monetization dashboard.";

    /* compiled from: UnityAdsError.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorOuterClass.PublicErrorCode.values().length];
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_PLACEMENT_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_PROTO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_UNSUPPORTED_PLACEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_FILE_SYSTEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_ADVIEWER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NOT_FOUND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_MISMATCHED_PLATFORM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_INTERNAL_SYSTEM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_NETWORK.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_FILE_SYSTEM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getInitErrorMsg(ErrorOuterClass.PublicErrorCode publicErrorCode, String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[publicErrorCode.ordinal()];
        if (i == 1) {
            return MSG_INIT_FAIL_TIMEOUT;
        }
        switch (i) {
            case 10:
                return MSG_INIT_FAIL_UNKNOWN_ERROR;
            case 11:
                return zr.a("Invalid Game ID: ", str, ". Verify the Game ID in your Unity Ads Monetization dashboard.");
            case 12:
                return MSG_INIT_FAIL_WRONG_PLATFORM;
            case 13:
                return MSG_INIT_FAIL_PARSING_ERROR;
            case 14:
                return MSG_INIT_FAIL_SYSTEM_ERROR;
            case 15:
                return MSG_INIT_FAIL_NETWORK_ERROR;
            case 16:
                return MSG_INIT_FAIL_INSUFFICIENT_STORAGE;
            default:
                return null;
        }
    }

    public static /* synthetic */ String getInitErrorMsg$default(ErrorOuterClass.PublicErrorCode publicErrorCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getInitErrorMsg(publicErrorCode, str);
    }

    public static final String getLoadErrorMsg(ErrorOuterClass.PublicErrorCode publicErrorCode) {
        switch (WhenMappings.$EnumSwitchMapping$0[publicErrorCode.ordinal()]) {
            case 1:
                return MSG_BOLD_LOAD_FAIL_TIME_OUT;
            case 2:
                return MSG_BOLD_LOAD_FAIL_NO_FILL;
            case 3:
                return MSG_BOLD_LOAD_FAIL_SDK_NOT_INITIALIZED;
            case 4:
                return MSG_BOLD_LOAD_FAIL_PLACEMENT_NOT_FOUND;
            case 5:
                return MSG_BOLD_LOAD_FAIL_PROTO_ERROR;
            case 6:
                return MSG_BOLD_LOAD_FAIL_UNSUPPORTED_PLACEMENT;
            case 7:
                return MSG_BOLD_LOAD_FAIL_NETWORK_ERROR;
            case 8:
                return MSG_BOLD_LOAD_FAIL_INSUFFICIENT_STORAGE;
            case 9:
                return MSG_BOLD_LOAD_FAIL_PARSING_ERROR;
            default:
                return null;
        }
    }

    public static final String getShowErrorMsg(ErrorOuterClass.PublicErrorCode publicErrorCode) {
        int i = WhenMappings.$EnumSwitchMapping$0[publicErrorCode.ordinal()];
        return i != 1 ? i != 17 ? i != 18 ? MSG_BOLD_SHOW_FAIL_INTERNAL_ERROR : MSG_BOLD_SHOW_FAIL_ALREADY_SHOWING : MSG_BOLD_SHOW_FAIL_AD_OBJECT_EXPIRED : MSG_BOLD_SHOW_FAIL_TIMEOUT;
    }
}
