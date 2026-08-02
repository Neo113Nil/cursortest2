package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class qb4 {
    public static final AdError a(InneractiveErrorCode inneractiveErrorCode) {
        int i = 399;
        switch (inneractiveErrorCode == null ? -1 : pb4.b[inneractiveErrorCode.ordinal()]) {
            case 1:
                i = 300;
                break;
            case 2:
                i = Sdk.SDKError.Reason.MRAID_ERROR_VALUE;
                break;
            case 3:
                i = Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE;
                break;
            case 4:
                i = 303;
                break;
            case 5:
                i = Sdk.SDKError.Reason.AD_EXPIRED_VALUE;
                break;
            case 6:
                i = Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
                break;
            case 7:
                i = 306;
                break;
            case 8:
                i = Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE;
                break;
            case 9:
                i = Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE;
                break;
            case 10:
                i = Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE;
                break;
            case 11:
                i = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE;
                break;
            case 12:
                i = Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE;
                break;
            case 13:
                i = Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
                break;
            case 14:
                i = Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE;
                break;
            case 15:
                i = Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE;
                break;
            case 16:
                i = Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE;
                break;
            case 17:
                i = Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE;
                break;
            case 18:
                i = Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE;
                break;
        }
        return new AdError(i, "DT Exchange failed to request ad with reason: " + inneractiveErrorCode, "com.google.ads.mediation.dtexchange");
    }

    public static final AdError b(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        fyberInitStatus.getClass();
        int i = pb4.a[fyberInitStatus.ordinal()];
        return new AdError(i != 1 ? i != 2 ? i != 3 ? i != 4 ? 299 : 203 : 202 : 201 : 200, "DT Exchange failed to initialize with reason: " + fyberInitStatus, "com.google.ads.mediation.dtexchange");
    }
}
