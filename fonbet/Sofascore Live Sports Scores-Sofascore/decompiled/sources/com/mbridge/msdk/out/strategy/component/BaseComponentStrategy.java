package com.mbridge.msdk.out.strategy.component;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.cul;
import defpackage.ljg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class BaseComponentStrategy {
    protected static final long DEFAULT_TIMEOUT_MS = 3000;
    protected static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    protected static final String TAG = "BaseComponentStrategy";
    protected int adType;
    protected String bidToken;
    protected String extraData;
    protected com.mbridge.msdk.config.manager.callback.b mComponentCallbackListener;
    protected NewInterstitialListener newInterstitialListener;
    protected String placementId;
    protected g rewardVideoListener;
    protected String unitId;
    protected String userId;
    protected boolean isReady = true;
    protected boolean isRewardPlusOpen = false;
    protected int isSilent = 0;
    protected Map<String, Object> developerSettingMap = new HashMap();
    protected volatile boolean isQuerying = false;
    protected volatile Looper triggerThreadLooper = null;

    public BaseComponentStrategy(String str, String str2, int i) {
        this.placementId = str;
        this.unitId = str2;
        this.adType = i;
        String str3 = i == 94 ? "rv_init" : i == 287 ? "iv_init" : "";
        if (!TextUtils.isEmpty(str3)) {
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), str3, null);
        }
        recordTriggerThread();
    }

    private com.mbridge.msdk.config.manager.callback.b createInterstitialVideoListener() {
        return new AnonymousClass2();
    }

    private com.mbridge.msdk.config.manager.callback.b createRewardVideoListener() {
        return new AnonymousClass1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:2:0x0000, B:15:0x0047, B:17:0x004d, B:19:0x0054, B:20:0x005a, B:23:0x0064, B:25:0x0076, B:26:0x007b, B:36:0x0016, B:39:0x0020, B:42:0x002a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendApiEndMetrics(MBridgeIds mBridgeIds, String str, int i, String str2) {
        char c;
        String str3;
        try {
            int hashCode = str.hashCode();
            if (hashCode == -1178337387) {
                if (str.equals("adClose")) {
                    c = 2;
                    String str4 = "";
                    if (c == 0) {
                    }
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                c = 65535;
                String str42 = "";
                if (c == 0) {
                }
                if (TextUtils.isEmpty(str3)) {
                }
            } else if (hashCode != 336615957) {
                if (hashCode == 740662650 && str.equals("showResult")) {
                    c = 1;
                    String str422 = "";
                    str3 = c == 0 ? c != 1 ? c != 2 ? "" : "m_pipe_show_close" : "m_pipe_show_result" : "m_pipe_load_end";
                    if (TextUtils.isEmpty(str3)) {
                        HashMap hashMap = new HashMap();
                        String contextId = mBridgeIds != null ? mBridgeIds.getContextId() : "";
                        if (!TextUtils.isEmpty(contextId)) {
                            str422 = contextId;
                        }
                        hashMap.put("context_id", str422);
                        hashMap.put("result", Integer.valueOf(i));
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("reason", str2);
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
                        hashMap2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
                        hashMap2.put("ad_type", Integer.valueOf(this.adType));
                        hashMap.put(U3.i.X, hashMap2);
                        com.mbridge.msdk.config.component.common.metrics.b.a(str3, hashMap);
                        return;
                    }
                    return;
                }
                c = 65535;
                String str4222 = "";
                if (c == 0) {
                }
                if (TextUtils.isEmpty(str3)) {
                }
            } else {
                if (str.equals("loadEnd")) {
                    c = 0;
                    String str42222 = "";
                    if (c == 0) {
                    }
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                c = 65535;
                String str422222 = "";
                if (c == 0) {
                }
                if (TextUtils.isEmpty(str3)) {
                }
            }
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
        q0.b(TAG, th.getMessage());
    }

    private void sendApiStartMetrics(String str, String str2, Map<String, Object> map) {
        try {
            if (!str2.equals("c1") && !str2.equals("c2") && !str2.equals("c3")) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("context_id", str);
            HashMap hashMap2 = new HashMap(map);
            hashMap2.remove("sdk_context");
            hashMap.put(U3.i.X, hashMap2);
            com.mbridge.msdk.config.component.common.metrics.b.a(str2.equals("c1") ? "m_pipe_load_start" : str2.equals("c2") ? "m_pipe_show_start" : "m_pipe_isready_start", hashMap);
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
    }

    private void sendReadyEndMetrics(String str, Object obj, long j) {
        try {
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            hashMap.put("context_id", str);
            hashMap.put("result", Integer.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false ? 1 : 2));
            hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
            hashMap2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            hashMap2.put("ad_type", Integer.valueOf(this.adType));
            hashMap.put(U3.i.X, hashMap2);
            com.mbridge.msdk.config.component.common.metrics.b.a("m_pipe_isready_end", hashMap);
        } catch (Throwable th) {
            q0.b(TAG, th.getMessage());
        }
    }

    public void clearBitmapCache() {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a();
    }

    public void clearVideoCache() {
        o0.b();
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c20", null);
    }

    public String getCreativeIdWithUnitId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c18", null);
        if (com.mbridge.msdk.config.manager.a.c().b().b((Object) "creativeId") == null) {
            return "";
        }
        Object b = com.mbridge.msdk.config.manager.a.c().b().b((Object) "creativeId");
        if (!(b instanceof Map)) {
            return "";
        }
        Object obj = ((Map) b).get(this.unitId);
        return obj instanceof String ? (String) obj : "";
    }

    public String getRequestId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c17", null);
        if (com.mbridge.msdk.config.manager.a.c().b().b((Object) "requestId") == null) {
            return "";
        }
        Object b = com.mbridge.msdk.config.manager.a.c().b().b((Object) "requestId");
        return b instanceof String ? (String) b : "";
    }

    public synchronized boolean isReadyWithSyncWait(boolean z) {
        try {
            if (this.isQuerying) {
                return false;
            }
            try {
                this.isQuerying = true;
                long currentTimeMillis = System.currentTimeMillis();
                com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
                cul culVar = new cul(aVar);
                HashMap hashMap = new HashMap();
                hashMap.put("callback", culVar);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("bid_token", TextUtils.isEmpty(this.bidToken) ? "" : this.bidToken);
                hashMap2.put("is_hb", Integer.valueOf(z ? 1 : 0));
                hashMap2.put("sdk_context", hashMap);
                String a = com.mbridge.msdk.config.component.common.util.c.a();
                sendApiCallEvent(a, "c3", hashMap2);
                Map map = (Map) aVar.a(com.mbridge.msdk.config.manager.a.p);
                this.isQuerying = false;
                if (map != null) {
                    Object obj = map.get("ready_state");
                    sendReadyEndMetrics(a, obj, System.currentTimeMillis() - currentTimeMillis);
                    if (obj instanceof Boolean) {
                        return ((Boolean) obj).booleanValue();
                    }
                }
                return false;
            } catch (InterruptedException e) {
                q0.b(TAG, "isReadyWithSyncWait interrupted: " + e.getMessage(), e);
                return false;
            } catch (Exception e2) {
                q0.b(TAG, "isReadyWithSyncWait error: " + e2.getMessage(), e2);
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void playVideoMute(int i) {
        this.isSilent = i;
        this.developerSettingMap.put("mute_state", Integer.valueOf(i));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c13", null);
    }

    public void recordTriggerThread() {
        this.triggerThreadLooper = Looper.myLooper();
    }

    public void sendApiCallEvent(String str, String str2, Map<String, Object> map) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.placementId);
            hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            hashMap.put("ad_type", Integer.valueOf(this.adType));
            hashMap.putAll(this.developerSettingMap);
            if (map != null && !map.isEmpty()) {
                hashMap.putAll(map);
            }
            if (!hashMap.containsKey("sdk_context")) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("callback", this.mComponentCallbackListener);
                hashMap.put("sdk_context", hashMap2);
            }
            com.mbridge.msdk.config.manager.a.c().a(str, str2, hashMap);
            sendApiStartMetrics(str, str2, hashMap);
        } catch (Exception e) {
            q0.b(TAG, "sendComponentEvent error: " + e.getMessage(), e);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("title", str);
            hashMap.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, str2);
            hashMap.put("confirm", str3);
            hashMap.put("cancel", str4);
            this.developerSettingMap.put("dialog_config", hashMap);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c14", hashMap);
        } catch (Exception e) {
            q0.b(TAG, "BaseComponentStrategy setAlertDialogText error: " + e.getMessage(), e);
        }
    }

    public void setExtraInfo(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extra_info", jSONObject);
        this.developerSettingMap.put("extra_info", jSONObject);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c16", hashMap);
    }

    public void setIVRewardEnable(int i, double d) {
        int i2 = i == com.mbridge.msdk.foundation.same.a.H ? 1 : i;
        if (i == com.mbridge.msdk.foundation.same.a.I) {
            i2 = 3;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ivReward_type", Integer.valueOf(i2));
        hashMap.put("ivReward_value", Double.valueOf(d));
        this.developerSettingMap.put("iv_reward", hashMap);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c19", hashMap);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void setRewardPlus(boolean z) {
        this.isRewardPlusOpen = z;
        this.developerSettingMap.put("reward_plus_open", Boolean.valueOf(z));
        HashMap hashMap = new HashMap();
        hashMap.put("reward_plus_open", Boolean.valueOf(z));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c15", hashMap);
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void threadConsistentCallback(Runnable runnable) {
        if (this.triggerThreadLooper == Looper.getMainLooper()) {
            MAIN_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void setRewardVideoListener(g gVar) {
        this.rewardVideoListener = gVar;
        this.mComponentCallbackListener = createRewardVideoListener();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1, reason: invalid class name */
    public class AnonymousClass1 implements com.mbridge.msdk.config.manager.callback.b {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClose$1(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShow$0(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEndCardShow$5(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onEndcardShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadSuccess$8(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onLoadSuccess(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShowFail$2(MBridgeIds mBridgeIds, String str) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onShowFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoAdClicked$3(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoAdClicked(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoComplete$4(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoComplete(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadFail$6(MBridgeIds mBridgeIds, String str) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadSuccess$7(MBridgeIds mBridgeIds) {
            g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new c(this, mBridgeIds, rewardInfo, 0));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0, "");
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new a(this, mBridgeIds, 0));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 1, "");
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new a(this, mBridgeIds, 1));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new a(this, mBridgeIds, 4));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new b(this, mBridgeIds, str, 1));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new a(this, mBridgeIds, 3));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new a(this, mBridgeIds, 2));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new b(this, mBridgeIds, str, 0));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new a(this, mBridgeIds, 5));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1, "");
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2, reason: invalid class name */
    public class AnonymousClass2 implements com.mbridge.msdk.config.manager.callback.b {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClose$1(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShow$0(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEndCardShow$5(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onEndcardShow(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLoadSuccess$8(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShowFail$2(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onShowFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoAdClicked$3(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClicked(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoComplete$4(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onVideoComplete(mBridgeIds);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadFail$6(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoLoadSuccess$7(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new c(this, mBridgeIds, rewardInfo, 1));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0, "");
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new d(this, mBridgeIds, 2));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 1, "");
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new d(this, mBridgeIds, 1));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new d(this, mBridgeIds, 3));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new e(this, mBridgeIds, str, 0));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new d(this, mBridgeIds, 0));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new d(this, mBridgeIds, 4));
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new e(this, mBridgeIds, str, 1));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2, str);
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new d(this, mBridgeIds, 5));
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1, "");
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        int i3 = i == com.mbridge.msdk.foundation.same.a.H ? 2 : i;
        if (i == com.mbridge.msdk.foundation.same.a.I) {
            i3 = 4;
        }
        HashMap hashMap = new HashMap();
        ljg.s(i3, i2, "ivReward_type", "ivReward_value", hashMap);
        this.developerSettingMap.put("iv_reward", hashMap);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "c19", hashMap);
    }
}
