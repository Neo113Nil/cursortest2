package com.unity3d.ads.core.data.model;

import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.xh50;
import xsna.yvj;
import xsna.zcl;
import xsna.zno;

/* compiled from: AdObject.kt */
/* loaded from: classes14.dex */
public final class AdObject {
    private WeakReference<Activity> activity;
    private final AdPlayer adPlayer;
    private final yvj adScope;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private LoadConfiguration loadConfiguration;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private ShowConfiguration showConfiguration;
    private xh50<AdObjectState> state;
    private ByteString trackingToken;
    private xh50<zno> ttl;
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    public AdObject(yvj yvjVar, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, xh50<zno> xh50Var, xh50<AdObjectState> xh50Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.adScope = yvjVar;
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
        this.adPlayer = adPlayer;
        this.playerServerId = str3;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z2;
        this.adType = diagnosticAdType;
        this.ttl = xh50Var;
        this.state = xh50Var2;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, yvj yvjVar, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, xh50 xh50Var, xh50 xh50Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i, Object obj) {
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        WeakReference weakReference2;
        yvj yvjVar2;
        AdObject adObject2;
        ShowConfiguration showConfiguration2;
        ByteString byteString3;
        String str4;
        ByteString byteString4;
        boolean z3;
        String str5;
        AdPlayer adPlayer2;
        String str6;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        xh50 xh50Var3;
        xh50 xh50Var4;
        LoadConfiguration loadConfiguration2;
        yvj yvjVar3 = (i & 1) != 0 ? adObject.adScope : yvjVar;
        ByteString byteString5 = (i & 2) != 0 ? adObject.opportunityId : byteString;
        String str7 = (i & 4) != 0 ? adObject.placementId : str;
        ByteString byteString6 = (i & 8) != 0 ? adObject.trackingToken : byteString2;
        boolean z5 = (i & 16) != 0 ? adObject.isOfferwallAd : z;
        String str8 = (i & 32) != 0 ? adObject.offerwallPlacementName : str2;
        AdPlayer adPlayer3 = (i & 64) != 0 ? adObject.adPlayer : adPlayer;
        String str9 = (i & 128) != 0 ? adObject.playerServerId : str3;
        UnityAdsLoadOptions unityAdsLoadOptions3 = (i & 256) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z6 = (i & 512) != 0 ? adObject.isHeaderBidding : z2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3 = (i & 1024) != 0 ? adObject.adType : diagnosticAdType;
        xh50 xh50Var5 = (i & 2048) != 0 ? adObject.ttl : xh50Var;
        xh50 xh50Var6 = (i & 4096) != 0 ? adObject.state : xh50Var2;
        LoadConfiguration loadConfiguration3 = (i & 8192) != 0 ? adObject.loadConfiguration : loadConfiguration;
        yvj yvjVar4 = yvjVar3;
        ShowConfiguration showConfiguration3 = (i & 16384) != 0 ? adObject.showConfiguration : showConfiguration;
        WeakReference weakReference3 = (i & 32768) != 0 ? adObject.activity : weakReference;
        if ((i & 65536) != 0) {
            weakReference2 = weakReference3;
            webViewLessLoadingRequiredData2 = adObject.webViewLessLoadingRequiredData;
            showConfiguration2 = showConfiguration3;
            byteString3 = byteString5;
            str4 = str7;
            byteString4 = byteString6;
            z3 = z5;
            str5 = str8;
            adPlayer2 = adPlayer3;
            str6 = str9;
            unityAdsLoadOptions2 = unityAdsLoadOptions3;
            z4 = z6;
            diagnosticAdType2 = diagnosticAdType3;
            xh50Var3 = xh50Var5;
            xh50Var4 = xh50Var6;
            loadConfiguration2 = loadConfiguration3;
            yvjVar2 = yvjVar4;
            adObject2 = adObject;
        } else {
            webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
            weakReference2 = weakReference3;
            yvjVar2 = yvjVar4;
            adObject2 = adObject;
            showConfiguration2 = showConfiguration3;
            byteString3 = byteString5;
            str4 = str7;
            byteString4 = byteString6;
            z3 = z5;
            str5 = str8;
            adPlayer2 = adPlayer3;
            str6 = str9;
            unityAdsLoadOptions2 = unityAdsLoadOptions3;
            z4 = z6;
            diagnosticAdType2 = diagnosticAdType3;
            xh50Var3 = xh50Var5;
            xh50Var4 = xh50Var6;
            loadConfiguration2 = loadConfiguration3;
        }
        return adObject2.copy(yvjVar2, byteString3, str4, byteString4, z3, str5, adPlayer2, str6, unityAdsLoadOptions2, z4, diagnosticAdType2, xh50Var3, xh50Var4, loadConfiguration2, showConfiguration2, weakReference2, webViewLessLoadingRequiredData2);
    }

    public final yvj component1() {
        return this.adScope;
    }

    public final boolean component10() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType component11() {
        return this.adType;
    }

    public final xh50<zno> component12() {
        return this.ttl;
    }

    public final xh50<AdObjectState> component13() {
        return this.state;
    }

    public final LoadConfiguration component14() {
        return this.loadConfiguration;
    }

    public final ShowConfiguration component15() {
        return this.showConfiguration;
    }

    public final WeakReference<Activity> component16() {
        return this.activity;
    }

    public final WebViewLessLoadingRequiredData component17() {
        return this.webViewLessLoadingRequiredData;
    }

    public final ByteString component2() {
        return this.opportunityId;
    }

    public final String component3() {
        return this.placementId;
    }

    public final ByteString component4() {
        return this.trackingToken;
    }

    public final boolean component5() {
        return this.isOfferwallAd;
    }

    public final String component6() {
        return this.offerwallPlacementName;
    }

    public final AdPlayer component7() {
        return this.adPlayer;
    }

    public final String component8() {
        return this.playerServerId;
    }

    public final UnityAdsLoadOptions component9() {
        return this.loadOptions;
    }

    public final AdObject copy(yvj yvjVar, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, xh50<zno> xh50Var, xh50<AdObjectState> xh50Var2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        return new AdObject(yvjVar, byteString, str, byteString2, z, str2, adPlayer, str3, unityAdsLoadOptions, z2, diagnosticAdType, xh50Var, xh50Var2, loadConfiguration, showConfiguration, weakReference, webViewLessLoadingRequiredData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) obj;
        return epx.f(this.adScope, adObject.adScope) && epx.f(this.opportunityId, adObject.opportunityId) && epx.f(this.placementId, adObject.placementId) && epx.f(this.trackingToken, adObject.trackingToken) && this.isOfferwallAd == adObject.isOfferwallAd && epx.f(this.offerwallPlacementName, adObject.offerwallPlacementName) && epx.f(this.adPlayer, adObject.adPlayer) && epx.f(this.playerServerId, adObject.playerServerId) && epx.f(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && epx.f(this.ttl, adObject.ttl) && epx.f(this.state, adObject.state) && epx.f(this.loadConfiguration, adObject.loadConfiguration) && epx.f(this.showConfiguration, adObject.showConfiguration) && epx.f(this.activity, adObject.activity) && epx.f(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData);
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final yvj getAdScope() {
        return this.adScope;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final xh50<AdObjectState> getState() {
        return this.state;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final xh50<zno> getTtl() {
        return this.ttl;
    }

    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    public int hashCode() {
        int b = qoy.b((this.trackingToken.hashCode() + urd0.a((this.opportunityId.hashCode() + (this.adScope.hashCode() * 31)) * 31, 31, this.placementId)) * 31, 31, this.isOfferwallAd);
        String str = this.offerwallPlacementName;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int hashCode2 = (hashCode + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str2 = this.playerServerId;
        int hashCode3 = (this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + qoy.b((this.loadOptions.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.isHeaderBidding)) * 31)) * 31)) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int hashCode4 = (hashCode3 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int hashCode5 = (hashCode4 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        int hashCode6 = (hashCode5 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        return hashCode6 + (webViewLessLoadingRequiredData != null ? webViewLessLoadingRequiredData.hashCode() : 0);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setActivity(WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final void setShowConfiguration(ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setState(xh50<AdObjectState> xh50Var) {
        this.state = xh50Var;
    }

    public final void setTrackingToken(ByteString byteString) {
        this.trackingToken = byteString;
    }

    public final void setTtl(xh50<zno> xh50Var) {
        this.ttl = xh50Var;
    }

    public final void setWebViewLessLoadingRequiredData(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    public String toString() {
        return "AdObject(adScope=" + this.adScope + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ", webViewLessLoadingRequiredData=" + this.webViewLessLoadingRequiredData + ')';
    }

    /* compiled from: AdObject.kt */
    public static final class WebViewLessLoadingRequiredData {
        private AdRefreshState adRefreshState;
        private AdResponseOuterClass.AdResponse adResponse;
        private final String webviewUrl;

        public WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            this.webviewUrl = str;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        public final String component1() {
            return this.webviewUrl;
        }

        public final AdResponseOuterClass.AdResponse component2() {
            return this.adResponse;
        }

        public final AdRefreshState component3() {
            return this.adRefreshState;
        }

        public final WebViewLessLoadingRequiredData copy(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState) {
            return new WebViewLessLoadingRequiredData(str, adResponse, adRefreshState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) obj;
            return epx.f(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && epx.f(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState;
        }

        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public int hashCode() {
            int hashCode = (this.adResponse.hashCode() + (this.webviewUrl.hashCode() * 31)) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            return hashCode + (adRefreshState == null ? 0 : adRefreshState.hashCode());
        }

        public final void setAdRefreshState(AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }

        public final void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
            this.adResponse = adResponse;
        }

        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, zcl zclVar) {
            this(str, adResponse, (i & 4) != 0 ? null : adRefreshState);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AdObject(xsna.yvj r21, com.google.protobuf.ByteString r22, java.lang.String r23, com.google.protobuf.ByteString r24, boolean r25, java.lang.String r26, com.unity3d.ads.adplayer.AdPlayer r27, java.lang.String r28, com.unity3d.ads.UnityAdsLoadOptions r29, boolean r30, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r31, xsna.xh50 r32, xsna.xh50 r33, com.unity3d.ads.LoadConfiguration r34, com.unity3d.ads.ShowConfiguration r35, java.lang.ref.WeakReference r36, com.unity3d.ads.core.data.model.AdObject.WebViewLessLoadingRequiredData r37, int r38, xsna.zcl r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r25
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r26
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r9 = r2
            goto L1c
        L1a:
            r9 = r27
        L1c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L22
            r10 = r2
            goto L24
        L22:
            r10 = r28
        L24:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2e
            xsna.utk0 r1 = xsna.vtk0.a(r2)
            r14 = r1
            goto L30
        L2e:
            r14 = r32
        L30:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L3c
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.INIT
            xsna.utk0 r1 = xsna.vtk0.a(r1)
            r15 = r1
            goto L3e
        L3c:
            r15 = r33
        L3e:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L45
            r16 = r2
            goto L47
        L45:
            r16 = r34
        L47:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L4e
            r17 = r2
            goto L50
        L4e:
            r17 = r35
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L59
            r18 = r2
            goto L5b
        L59:
            r18 = r36
        L5b:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L73
            r19 = r2
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r11 = r29
            r12 = r30
            r13 = r31
            r2 = r20
            goto L85
        L73:
            r19 = r37
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r11 = r29
            r12 = r30
            r13 = r31
        L85:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.AdObject.<init>(xsna.yvj, com.google.protobuf.ByteString, java.lang.String, com.google.protobuf.ByteString, boolean, java.lang.String, com.unity3d.ads.adplayer.AdPlayer, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, xsna.xh50, xsna.xh50, com.unity3d.ads.LoadConfiguration, com.unity3d.ads.ShowConfiguration, java.lang.ref.WeakReference, com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData, int, xsna.zcl):void");
    }
}
