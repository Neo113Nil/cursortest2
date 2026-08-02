package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0012\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1gSDK;", "Lcom/appsflyer/internal/AFe1oSDK;", "", "Lcom/appsflyer/internal/AFi1wSDK;", "p0", "Lcom/appsflyer/internal/AFc1hSDK;", "p1", "Lcom/appsflyer/internal/AFc1aSDK;", "p2", "Lcom/appsflyer/internal/AFf1bSDK;", "p3", "Lcom/appsflyer/internal/AFc1cSDK;", "p4", "Lcom/appsflyer/internal/AFh1pSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFi1wSDK;Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFc1aSDK;Lcom/appsflyer/internal/AFf1bSDK;Lcom/appsflyer/internal/AFc1cSDK;Lcom/appsflyer/internal/AFh1pSDK;)V", "", "d", "()Z", "afInfoLog", "", "registerClient", "()J", "Lcom/appsflyer/internal/AFd1qSDK;", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1qSDK;", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "AFLoggerLogLevel", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "e", "Lcom/appsflyer/internal/AFi1wSDK;", "afWarnLog", "Lcom/appsflyer/internal/AFc1hSDK;", "AFKeystoreWrapper", "afErrorLog", "Lcom/appsflyer/internal/AFf1bSDK;", "AFLogger", "afDebugLog", "Lcom/appsflyer/internal/AFc1cSDK;", "unregisterClient", com.mbridge.msdk.setting.i.a, "Lcom/appsflyer/internal/AFh1pSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1gSDK extends AFe1oSDK<String> {

    /* renamed from: afDebugLog, reason: from kotlin metadata */
    @NotNull
    private final AFc1cSDK unregisterClient;

    /* renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final AFf1bSDK AFLogger;

    /* renamed from: afWarnLog, reason: from kotlin metadata */
    @NotNull
    private final AFc1hSDK AFKeystoreWrapper;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFi1wSDK d;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    public AFh1pSDK registerClient;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFe1gSDK(@NotNull AFi1wSDK aFi1wSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1aSDK aFc1aSDK, @NotNull AFf1bSDK aFf1bSDK, @NotNull AFc1cSDK aFc1cSDK, @NotNull AFh1pSDK aFh1pSDK) {
        super(r0, new AFd1aSDK[]{r1}, aFc1aSDK, "PIA");
        aFi1wSDK.getClass();
        aFc1hSDK.getClass();
        aFc1aSDK.getClass();
        aFf1bSDK.getClass();
        aFc1cSDK.getClass();
        aFh1pSDK.getClass();
        AFd1aSDK aFd1aSDK = AFd1aSDK.w;
        AFd1aSDK aFd1aSDK2 = AFd1aSDK.unregisterClient;
        this.d = aFi1wSDK;
        this.AFKeystoreWrapper = aFc1hSDK;
        this.AFLogger = aFf1bSDK;
        this.unregisterClient = aFc1cSDK;
        this.registerClient = aFh1pSDK;
        this.unregisterClient.add(aFd1aSDK2);
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AFd1qSDK<String> d(@NotNull String p0) {
        AFd1lSDK aFd1lSDK;
        String str;
        LinkedHashMap linkedHashMap;
        p0.getClass();
        AFh1pSDK aFh1pSDK = this.registerClient;
        Map<String, Object> map = aFh1pSDK.AFKeystoreWrapper;
        map.getClass();
        map.put(MBridgeConstans.APP_ID, this.AFKeystoreWrapper.registerClient.d.getPackageName());
        map.put("sdk_version", AFc1hSDK.d());
        map.put("app_version_name", this.AFKeystoreWrapper.r_().versionName);
        this.AFLogger.AFKeystoreWrapper(map);
        try {
            AFh1aSDK registerClient = this.d.registerClient();
            if (registerClient != null) {
                linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("pia_timestamp", Long.valueOf(registerClient.d));
                linkedHashMap2.put("ttr_millis", Long.valueOf(registerClient.unregisterClient));
                String str2 = registerClient.AFLogger;
                if (str2 != null) {
                    linkedHashMap2.put("pia_token", str2);
                }
                String str3 = registerClient.registerClient;
                if (str3 != null) {
                    linkedHashMap2.put("error_code", str3);
                }
                linkedHashMap.put("pia", linkedHashMap2);
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                aFh1pSDK.AFLogger(linkedHashMap);
            }
            if (!this.d.AFKeystoreWrapper()) {
                Map<String, Object> map2 = aFh1pSDK.AFKeystoreWrapper;
                map2.getClass();
                AFj1tSDK.d(map2).put("pia_disabled", Boolean.TRUE);
            }
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
        AFd1tSDK aFd1tSDK = ((AFe1oSDK) this).registerClient;
        AFh1pSDK aFh1pSDK2 = this.registerClient;
        AFf1oSDK aFf1oSDK = this.force;
        AFd1qSDK<String> AFLogger = aFd1tSDK.AFLogger(aFh1pSDK2, (String) AFf1oSDK.AFLogger(new Object[]{aFf1oSDK}, 343398987, -343398985, System.identityHashCode(aFf1oSDK)), this.unregisterClient);
        Map<String, Object> map3 = this.registerClient.AFKeystoreWrapper;
        map3.getClass();
        if (AFLogger != null && (aFd1lSDK = AFLogger.unregisterClient) != null && (str = aFd1lSDK.registerClient) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFg1kSDK.unregisterClient(jSONObject2.getString("pia_token")));
                }
            }
            AFg1kSDK.AFKeystoreWrapper(this + ": preparing data: ", jSONObject);
            AFd1ySDK aFd1ySDK = ((AFe1oSDK) this).v;
            String jSONObject3 = jSONObject.toString();
            jSONObject3.getClass();
            aFd1ySDK.unregisterClient(str, jSONObject3);
        }
        return AFLogger;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    }

    public /* synthetic */ AFe1gSDK(AFi1wSDK aFi1wSDK, AFc1hSDK aFc1hSDK, AFc1aSDK aFc1aSDK, AFf1bSDK aFf1bSDK, AFc1cSDK aFc1cSDK, AFh1pSDK aFh1pSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1wSDK, aFc1hSDK, aFc1aSDK, aFf1bSDK, aFc1cSDK, (i & 32) != 0 ? new AFh1pSDK() : aFh1pSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(@NotNull AFi1wSDK aFi1wSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1aSDK aFc1aSDK, @NotNull AFf1bSDK aFf1bSDK, @NotNull AFc1cSDK aFc1cSDK) {
        this(aFi1wSDK, aFc1hSDK, aFc1aSDK, aFf1bSDK, aFc1cSDK, null, 32, null);
        aFi1wSDK.getClass();
        aFc1hSDK.getClass();
        aFc1aSDK.getClass();
        aFf1bSDK.getClass();
        aFc1cSDK.getClass();
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }
}
