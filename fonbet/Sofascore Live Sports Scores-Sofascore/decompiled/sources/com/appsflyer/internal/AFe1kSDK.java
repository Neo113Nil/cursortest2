package com.appsflyer.internal;

import com.appsflyer.sdk_base.util.JsonUtils;
import com.appsflyer.share.AFPurchaseDetails;
import com.appsflyer.share.AFPurchaseType;
import com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.share.network.http.ResponseNetwork;
import defpackage.lm5;
import defpackage.p2g;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.zzl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001(BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u000f2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001a\u00020\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0016J9\u0010\u0010\u001a\u000e\u0012\b\u0012\u0006*\u00020\u00070\u0007\u0018\u00010\u00172\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/appsflyer/internal/AFe1kSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "Lcom/appsflyer/internal/AFc1aSDK;", "p0", "Lcom/appsflyer/share/AFPurchaseDetails;", "p1", "", "", "p2", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "p3", "Lcom/appsflyer/internal/AFi1bSDK;", "p4", "<init>", "(Lcom/appsflyer/internal/AFc1aSDK;Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFi1bSDK;)V", "", "AFLogger", "()V", "", "", "AFKeystoreWrapper", "(Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/util/Map;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1qSDK;", "(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1qSDK;", "", "d", "(Ljava/lang/String;I)V", com.mbridge.msdk.setting.i.a, "Lcom/appsflyer/internal/AFc1aSDK;", "e", "Lcom/appsflyer/share/AFPurchaseDetails;", "AFLoggerLogLevel", "Ljava/util/Map;", "registerClient", "afDebugLog", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "unregisterClient", "afErrorLog", "Lcom/appsflyer/internal/AFi1bSDK;", "AFa1ySDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1kSDK extends AFe1rSDK {

    /* renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> registerClient;

    /* renamed from: afDebugLog, reason: from kotlin metadata */
    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback unregisterClient;

    /* renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final AFi1bSDK d;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails AFLogger;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AFc1aSDK AFKeystoreWrapper;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] unregisterClient;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            unregisterClient = iArr;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class AFa1ySDK extends RuntimeException {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFe1kSDK(@NotNull AFc1aSDK aFc1aSDK, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFi1bSDK aFi1bSDK) {
        super(r1, r2, aFc1aSDK, null, r5);
        aFc1aSDK.getClass();
        aFPurchaseDetails.getClass();
        aFi1bSDK.getClass();
        AFd1aSDK aFd1aSDK = AFd1aSDK.AFLoggerLogLevel;
        AFe1zSDK[] aFe1zSDKArr = {AFd1aSDK.registerClient, AFd1aSDK.AFKeystoreWrapper};
        lm5 lm5Var = lm5.a;
        lm5Var.getClass();
        this.AFKeystoreWrapper = aFc1aSDK;
        this.AFLogger = aFPurchaseDetails;
        this.registerClient = map;
        this.unregisterClient = appsFlyerInAppPurchaseValidationCallback;
        this.d = aFi1bSDK;
        this.AFLogger.add(AFd1aSDK.unregisterClient);
    }

    private final void d(String p0, int p1) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.unregisterClient;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(tub.h(new Pair("error_code", Integer.valueOf(p1)), new Pair("error_message", p0)));
        }
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> p0, @Nullable String p1) {
        Object obj;
        p0.getClass();
        super.AFKeystoreWrapper(p0, p1);
        List j = kotlin.collections.b.j(this.AFLogger.getPurchaseToken(), this.AFLogger.getProductId());
        if (j == null || !j.isEmpty()) {
            Iterator it = j.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1ySDK();
                }
            }
        }
        p0.put("purchase_token", this.AFLogger.getPurchaseToken());
        p0.put("product_id", this.AFLogger.getProductId());
        p0.put("purchase_type", this.AFLogger.getPurchaseType().getValue());
        Map<String, String> map = this.registerClient;
        if (map != null && !map.isEmpty()) {
            p0.put("purchase_additional_details", this.registerClient);
        }
        String str = this.AFKeystoreWrapper.setImeiData().values;
        if (str == null || str.length() == 0) {
            obj = lm5.a;
            obj.getClass();
        } else {
            obj = JsonUtils.toMap(new JSONObject(str));
        }
        p0.put("custom_data", obj);
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        Object u2gVar;
        super.AFLogger();
        Throwable force = force();
        if (force != null && !(force instanceof AFe1qSDK)) {
            if (force instanceof AFe1uSDK) {
                d("No dev key", -1);
            } else if (force instanceof AFa1ySDK) {
                d("One or more of provided arguments is empty", -1);
            } else {
                d("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1oSDK) this).w;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.unregisterClient;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(tub.h(new Pair("error_code", Integer.valueOf(responseNetwork.getStatusCode())), new Pair("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                p2g p2gVar = w2g.b;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.unregisterClient;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(JsonUtils.toMap(new JSONObject((String) responseNetwork.getBody())));
                    u2gVar = Unit.a;
                } else {
                    u2gVar = null;
                }
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (w2g.a(u2gVar) != null) {
                d("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
        }
    }

    public /* synthetic */ AFe1kSDK(AFc1aSDK aFc1aSDK, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFi1bSDK aFi1bSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1aSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 16) != 0 ? new AFj1vSDK() : aFi1bSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1kSDK(@NotNull AFc1aSDK aFc1aSDK, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFc1aSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 16, null);
        aFc1aSDK.getClass();
        aFPurchaseDetails.getClass();
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    @Nullable
    public final AFd1qSDK<String> AFLogger(@NotNull Map<String, Object> p0, @NotNull String p1) {
        p0.getClass();
        p1.getClass();
        int i = AFa1tSDK.unregisterClient[this.AFLogger.getPurchaseType().ordinal()];
        if (i == 1) {
            return ((AFe1oSDK) this).registerClient.AFLogger(p0, p1);
        }
        if (i == 2) {
            return ((AFe1oSDK) this).registerClient.registerClient(p0, p1);
        }
        zzl.b();
        return null;
    }

    @Override // com.appsflyer.internal.AFe1rSDK
    @NotNull
    public final String AFKeystoreWrapper(@NotNull Map<String, Object> p0) {
        p0.getClass();
        return this.d.AFKeystoreWrapper();
    }
}
