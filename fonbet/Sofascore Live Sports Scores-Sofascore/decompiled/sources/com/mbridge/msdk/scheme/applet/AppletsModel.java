package com.mbridge.msdk.scheme.applet;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.same.net.exception.a;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import defpackage.fc6;
import defpackage.w1l;
import defpackage.wt3;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(aVar);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(e<JSONObject> eVar) {
            super.onSuccess(eVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (eVar == null || eVar.c == null) {
                this.appletsModel.handlerRequestNetworkError();
                return;
            }
            try {
                this.appletsModel.handlerSchemeRequestResult(eVar);
            } catch (SchemeRequestException e) {
                this.appletsModel.handlerSchemeRequestFailed(-2, e.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z) {
        this.isRequesting = z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:11|(6:12|13|(3:15|(2:42|43)(10:19|20|21|22|(2:33|34)|26|27|(1:29)|30|31)|32)(1:44)|94|95|(1:97))|45|(2:46|47)|(3:(14:88|50|51|52|(9:82|55|56|57|(4:76|60|61|62)|59|60|61|62)|54|55|56|57|(0)|59|60|61|62)|61|62)|49|50|51|52|(0)|54|55|56|57|(0)|59|60) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:11|(6:12|13|(3:15|(2:42|43)(10:19|20|21|22|(2:33|34)|26|27|(1:29)|30|31)|32)(1:44)|94|95|(1:97))|45|(2:46|47)|(14:88|50|51|52|(9:82|55|56|57|(4:76|60|61|62)|59|60|61|62)|54|55|56|57|(0)|59|60|61|62)|49|50|51|52|(0)|54|55|56|57|(0)|59|60|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011e, code lost:
    
        if (r0 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r8.put(r18, r0);
        r8.put(r17, "0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.a(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "query: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
    
        r19.reBuildClickUrl = reCreateClickUrl("app" + com.ironsource.U3.j.b + r1 + com.ironsource.U3.j.c + "path" + com.ironsource.U3.j.b + r2 + com.ironsource.U3.j.c + r18 + com.ironsource.U3.j.b + r0 + com.ironsource.U3.j.c + com.mbridge.msdk.MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID + com.ironsource.U3.j.b + r3 + com.ironsource.U3.j.c + r17 + com.ironsource.U3.j.b + "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0108, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010b, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010d, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f2, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f4, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b(com.mbridge.msdk.scheme.applet.AppletsModel.TAG, "create wechat app request param failed ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> getAppletsParamsAndBuildRequest(CampaignEx campaignEx) {
        Uri parse;
        String str;
        String str2;
        String str3;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String str4;
        String str5;
        String str6 = MBridgeConstans.DYNAMIC_VIEW_WX_IS_REDIRECT;
        String str7 = MBridgeConstans.DYNAMIC_VIEW_WX_QUERY;
        HashMap hashMap = new HashMap();
        if (campaignEx != null) {
            try {
                parse = Uri.parse(campaignEx.getClickURL());
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                }
            }
            if (parse != null && parse.getQueryParameterNames() != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                int i = 0;
                while (true) {
                    String str8 = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    Iterator<String> it2 = it;
                    String next = it.next();
                    if (TextUtils.isEmpty(next) || TextUtils.equals(next, "wx_miniprogram")) {
                        str4 = str6;
                        str5 = str7;
                    } else {
                        try {
                            str8 = parse.getQueryParameter(next);
                        } catch (Exception unused) {
                        }
                        String str9 = str8;
                        if (TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK) || TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK)) {
                            try {
                                str9 = URLEncoder.encode(str9, "UTF-8");
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    String str10 = TAG;
                                    str4 = str6;
                                    StringBuilder sb2 = new StringBuilder();
                                    str5 = str7;
                                    sb2.append("encode url for ");
                                    sb2.append(str9);
                                    sb2.append(" failed");
                                    q0.b(str10, sb2.toString(), e2);
                                }
                            }
                        }
                        str4 = str6;
                        str5 = str7;
                        sb.append(next);
                        sb.append(U3.j.b);
                        sb.append(str9);
                        if (i < parse.getQueryParameterNames().size()) {
                            sb.append(U3.j.c);
                        }
                        i++;
                    }
                    it = it2;
                    str6 = str4;
                    str7 = str5;
                    if (MBridgeConstans.DEBUG) {
                        q0.b(TAG, "create wechat app request param failed ", e);
                    }
                }
                String str11 = str6;
                String str12 = str7;
                try {
                    queryParameter3 = parse.getQueryParameter("app");
                } catch (Exception e3) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(TAG, "create wechat app request param failed ", e3);
                    }
                }
                try {
                    if (queryParameter3 != null) {
                        str = queryParameter3;
                        hashMap.put("app", str);
                        queryParameter2 = parse.getQueryParameter("path");
                        if (queryParameter2 != null) {
                            str2 = queryParameter2;
                            hashMap.put("path", str2);
                            queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                            if (queryParameter != null) {
                                str3 = queryParameter;
                                hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                                String str13 = URLEncoder.encode(sb.toString(), "UTF-8");
                            }
                            str3 = "";
                            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                            String str132 = URLEncoder.encode(sb.toString(), "UTF-8");
                        }
                        str2 = "";
                        hashMap.put("path", str2);
                        queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                        if (queryParameter != null) {
                        }
                        str3 = "";
                        hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                        String str1322 = URLEncoder.encode(sb.toString(), "UTF-8");
                    }
                    String str13222 = URLEncoder.encode(sb.toString(), "UTF-8");
                } catch (UnsupportedEncodingException e4) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b(TAG, "create wechat app request param failed ", e4);
                    }
                }
                str = "";
                hashMap.put("app", str);
                queryParameter2 = parse.getQueryParameter("path");
                if (queryParameter2 != null) {
                }
                str2 = "";
                hashMap.put("path", str2);
                queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                if (queryParameter != null) {
                }
                str3 = "";
                hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler request network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestFailed network error by code " + String.valueOf(i) + " and " + str);
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i, str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme failed exception  ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), fc6.n("network error by code ", String.valueOf(i), " and ", str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i;
        String str;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i = aVar.a;
            str = aVar.getMessage();
            if (i == 10) {
                str = "request timeout";
            }
        } else {
            i = -1;
            str = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            q0.a(TAG, "handlerSchemeRequestNetworkError network error by code " + String.valueOf(i) + " and " + str);
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i, "network error: " + str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), fc6.n("network error by code ", String.valueOf(i), " and ", str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(e<JSONObject> eVar) throws SchemeRequestException {
        JSONObject jSONObject = eVar.c;
        if (MBridgeConstans.DEBUG) {
            q0.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String optString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(optString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(optString);
            return;
        }
        int optInt = jSONObject.optInt("error_code", -1);
        String optString2 = jSONObject.optString("error_msg", "");
        if (optInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(optInt, optString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme start exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            w1l.x("handlerSchemeRequestSuccess: ", str, TAG);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "handler wx scheme success exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(c1.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "query wx_miniprogram from click url exception ", e);
            }
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.j())) {
                return TextUtils.equals(c1.a(rewardTemplateMode.j(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, "query reqwxurl from template url exception ", e);
            }
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return wt3.m(d.h().b, "?", new StringBuilder(), str);
    }

    public boolean can(int i) {
        if (isRequesting() || !canRequestWxScheme(i)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i2 = this.lastRequestType;
        return (i2 == 0 && i == 1) || (i2 == 1 && i == 1 && this.isUserClick);
    }

    public boolean canRequestWxScheme(int i) {
        if (isSupportWxScheme()) {
            return i != 0 ? i == 1 : isCanRequestByTemplateUrl("2");
        }
        return false;
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        boolean z = this.isSupportWxScheme;
        if (!z) {
            z = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
            this.isSupportWxScheme = z;
        }
        return z;
    }

    public void requestWxAppletsScheme(int i, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            q0.b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.n().d());
        Map<String, String> map = this.params;
        if (map == null) {
            map = getAppletsParamsAndBuildRequest(this.campaignEx);
            this.params = map;
        }
        if (map == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i;
            appletSchemeRequest.get(1, d.h().b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z) {
        this.isUserClick = z;
    }
}
