package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001*BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u0017\u001a\u000e\u0012\b\u0012\u0006*\u00020\t0\t\u0018\u00010\u00162\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\t2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0015¢\u0006\u0004\b\u0017\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0017\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u001dR\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFf1oSDK;", "Lcom/appsflyer/internal/AFf1vSDK;", "Lcom/appsflyer/internal/AFd1kSDK;", "p0", "Lcom/appsflyer/AppsFlyerProperties;", "p1", "Lcom/appsflyer/AFPurchaseDetails;", "p2", "", "", "p3", "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "p4", "Lcom/appsflyer/internal/AFj1nSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFd1kSDK;Lcom/appsflyer/AppsFlyerProperties;Lcom/appsflyer/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1nSDK;)V", "", "", "", "AFAdRevenueData", "(Ljava/util/Map;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFe1rSDK;", "getCurrencyIso4217Code", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFe1rSDK;", "(Ljava/util/Map;)Ljava/lang/String;", "", "getMediationNetwork", "(Ljava/lang/String;I)V", "()V", "copydefault", "Ljava/util/Map;", "equals", "Lcom/appsflyer/internal/AFj1nSDK;", "getRevenue", InAppPurchaseConstants.METHOD_TO_STRING, "Lcom/appsflyer/AppsFlyerInAppPurchaseValidationCallback;", "getMonetizationNetwork", "component3", "Lcom/appsflyer/AppsFlyerProperties;", "copy", "Lcom/appsflyer/AFPurchaseDetails;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFf1oSDK extends AFf1vSDK {

    /* renamed from: component3, reason: from kotlin metadata */
    private final AppsFlyerProperties getMediationNetwork;

    /* renamed from: copy, reason: from kotlin metadata */
    private final AFPurchaseDetails AFAdRevenueData;

    /* renamed from: copydefault, reason: from kotlin metadata */
    private final Map<String, String> getCurrencyIso4217Code;

    /* renamed from: equals, reason: from kotlin metadata */
    private final AFj1nSDK getRevenue;

    /* renamed from: toString, reason: from kotlin metadata */
    private final AppsFlyerInAppPurchaseValidationCallback getMonetizationNetwork;

    public static final class AFa1vSDK extends RuntimeException {
    }

    public /* synthetic */ AFf1oSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1hSDK aFj1hSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i & 32) != 0 ? new AFj1hSDK() : aFj1hSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1oSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1nSDK aFj1nSDK) {
        super(AFf1wSDK.MANUAL_PURCHASE_VALIDATION, new AFf1wSDK[]{AFf1wSDK.RC_CDN, AFf1wSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, null, MapsKt.emptyMap());
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1nSDK, "");
        this.getMediationNetwork = appsFlyerProperties;
        this.AFAdRevenueData = aFPurchaseDetails;
        this.getCurrencyIso4217Code = map;
        this.getMonetizationNetwork = appsFlyerInAppPurchaseValidationCallback;
        this.getRevenue = aFj1nSDK;
        this.AFAdRevenueData.add(AFf1wSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        Object m13470constructorimpl;
        Unit unit;
        super.getCurrencyIso4217Code();
        Throwable component4 = component4();
        if (component4 != null && !(component4 instanceof AFf1xSDK)) {
            if (!(component4 instanceof AFe1aSDK)) {
                if (component4 instanceof AFa1vSDK) {
                    getMediationNetwork("One or more of provided arguments is empty", -1);
                } else {
                    getMediationNetwork("Error while sending request to server", -1);
                }
            } else {
                getMediationNetwork("No dev key", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFf1pSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() == 200) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AFf1oSDK aFf1oSDK = this;
                    AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMonetizationNetwork;
                    if (appsFlyerInAppPurchaseValidationCallback != null) {
                        appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationFinished(AFj1gSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    m13470constructorimpl = Result.m13470constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m13473exceptionOrNullimpl(m13470constructorimpl) != null) {
                    getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
                }
                Result.m13469boximpl(m13470constructorimpl);
                return;
            }
            AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.getMonetizationNetwork;
            if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.to("error_code", Integer.valueOf(responseNetwork.getStatusCode())), TuplesKt.to("error_message", responseNetwork.getBody())));
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final void AFAdRevenueData(Map<String, Object> p0, String p1) {
        Map<String, Object> emptyMap;
        Intrinsics.checkNotNullParameter(p0, "");
        super.AFAdRevenueData(p0, p1);
        List listOf = CollectionsKt.listOf((Object[]) new String[]{this.AFAdRevenueData.getPurchaseToken(), this.AFAdRevenueData.getProductId(), this.AFAdRevenueData.getPrice(), this.AFAdRevenueData.getCurrency()});
        if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1vSDK();
                }
            }
        }
        p0.put("purchase_token", this.AFAdRevenueData.getPurchaseToken());
        p0.put("product_id", this.AFAdRevenueData.getProductId());
        p0.put("revenue", this.AFAdRevenueData.getPrice());
        p0.put("currency", this.AFAdRevenueData.getCurrency());
        p0.put("purchase_type", this.AFAdRevenueData.getPurchaseType().getValue());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null && !map.isEmpty()) {
            p0.put("extra_event_values", this.getCurrencyIso4217Code);
        }
        String string = this.getMediationNetwork.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        String str = string;
        if (str == null || str.length() == 0) {
            emptyMap = MapsKt.emptyMap();
        } else {
            emptyMap = AFj1gSDK.getMonetizationNetwork(new JSONObject(string));
        }
        p0.put("custom_data", emptyMap);
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    protected final String getCurrencyIso4217Code(Map<String, Object> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.getRevenue.getCurrencyIso4217Code();
    }

    @Override // com.appsflyer.internal.AFf1vSDK
    public final AFe1rSDK<String> getCurrencyIso4217Code(Map<String, Object> p0, String p1, String p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        AFe1qSDK aFe1qSDK = this.component2;
        return (AFe1rSDK) AFe1qSDK.getMediationNetwork(new Object[]{aFe1qSDK, p0, p1}, -1279437846, 1279437846, System.identityHashCode(aFe1qSDK));
    }

    private final void getMediationNetwork(String p0, int p1) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.getMonetizationNetwork;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.to("error_code", Integer.valueOf(p1)), TuplesKt.to("error_message", p0)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1oSDK(AFd1kSDK aFd1kSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1kSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }
}
