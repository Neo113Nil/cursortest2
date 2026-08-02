package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.amplitude.api.Constants;
import com.android.billingclient.api.BillingClient;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFd1cSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;
import com.appsflyer.internal.AFg1tSDK;
import com.appsflyer.internal.AFj1qSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import io.sentry.Session;
import j$.util.DesugarTimeZone;
import java.net.URI;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFb1rSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static final String AFAdRevenueData;
    private static int AFInAppEventType = 0;
    private static char[] AFKeystoreWrapper = null;
    private static int AFLogger = 1;
    private static AFb1rSDK areAllFieldsValid;
    private static int d;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    static AppsFlyerInAppPurchaseValidatorListener getMonetizationNetwork;
    private static boolean valueOf;
    private static boolean values;
    private AFf1bSDK AFInAppEventParameterName;
    Application component3;
    private boolean copy;
    private final AFd1mSDK copydefault;
    private SharedPreferences equals;
    private Map<Long, String> toString;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component4 = -1;
    long component1 = -1;
    private long hashCode = TimeUnit.SECONDS.toMillis(5);
    boolean component2 = false;

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (i * 522) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * 521);
        int i6 = ~i;
        switch (i5 + (((~(i | i4 | i2)) | (~(i3 | i6)) | (~((~i2) | i6))) * 521)) {
            case 1:
                break;
            case 2:
                AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
                String str = (String) objArr[1];
                int i7 = 2 % 2;
                int i8 = d + 113;
                AFLogger = i8 % 128;
                if (i8 % 2 == 0) {
                    AFb1aSDK equals = aFb1rSDK.getCurrencyIso4217Code().equals();
                    String[] strArr = new String[0];
                    strArr[1] = str;
                    equals.getMediationNetwork("setAndroidIdData", strArr);
                } else {
                    aFb1rSDK.getCurrencyIso4217Code().equals().getMediationNetwork("setAndroidIdData", str);
                }
                aFb1rSDK.getCurrencyIso4217Code().e().getMediationNetwork = str;
                int i9 = d + 95;
                AFLogger = i9 % 128;
                int i10 = i9 % 2;
                break;
            case 3:
                break;
            case 4:
                AFd1pSDK aFd1pSDK = (AFd1pSDK) objArr[0];
                String str2 = (String) objArr[1];
                int i11 = 2 % 2;
                String AFAdRevenueData2 = aFd1pSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
                if (AFAdRevenueData2 == null) {
                    aFd1pSDK.getMonetizationNetwork("CACHED_CHANNEL", str2);
                    int i12 = AFLogger + 113;
                    d = i12 % 128;
                    int i13 = i12 % 2;
                    break;
                } else {
                    int i14 = AFLogger + 75;
                    d = i14 % 128;
                    int i15 = i14 % 2;
                    break;
                }
            case 5:
                AFb1rSDK aFb1rSDK2 = (AFb1rSDK) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                int i16 = 2 % 2;
                int i17 = AFLogger + 31;
                d = i17 % 128;
                if (i17 % 2 != 0) {
                    aFb1rSDK2.getCurrencyIso4217Code().equals().getMediationNetwork("setCollectOaid", String.valueOf(booleanValue));
                } else {
                    aFb1rSDK2.getCurrencyIso4217Code().equals().getMediationNetwork("setCollectOaid", String.valueOf(booleanValue));
                }
                getRevenue(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(booleanValue));
                int i18 = AFLogger + 103;
                d = i18 % 128;
                int i19 = i18 % 2;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i20 = 2 % 2;
                int i21 = AFLogger + 111;
                d = i21 % 128;
                int i22 = i21 % 2;
                AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(booleanValue2)));
                getRevenue(AppsFlyerProperties.DISABLE_NETWORK_DATA, booleanValue2);
                int i23 = d + 59;
                AFLogger = i23 % 128;
                int i24 = i23 % 2;
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                AFb1rSDK aFb1rSDK3 = (AFb1rSDK) objArr[0];
                Context context = (Context) objArr[1];
                String str3 = (String) objArr[2];
                Map map = (Map) objArr[3];
                AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[4];
                HashMap hashMap = map == null ? null : new HashMap(map);
                aFb1rSDK3.getRevenue(context);
                AFh1fSDK aFh1fSDK = new AFh1fSDK();
                aFh1fSDK.component3 = str3;
                aFh1fSDK.getMediationNetwork = appsFlyerRequestListener;
                if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
                    HashMap hashMap2 = new HashMap();
                    Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
                    if (obj instanceof MotionEvent) {
                        MotionEvent motionEvent = (MotionEvent) obj;
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                        hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                        hashMap2.put("loc", hashMap3);
                        hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                        hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
                    } else {
                        hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                        AFLogger.INSTANCE.w(AFh1xSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
                    }
                    Map<String, ?> singletonMap = Collections.singletonMap("tch_data", hashMap2);
                    hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
                    aFh1fSDK.getRevenue(singletonMap);
                }
                aFh1fSDK.getCurrencyIso4217Code = hashMap;
                aFb1rSDK3.getCurrencyIso4217Code().equals().getMediationNetwork("logEvent", str3, new JSONObject(aFh1fSDK.getCurrencyIso4217Code == null ? new HashMap() : aFh1fSDK.getCurrencyIso4217Code).toString());
                if (str3 == null) {
                    aFb1rSDK3.getMediationNetwork(context, AFh1rSDK.logEvent);
                }
                getRevenue(new Object[]{aFb1rSDK3, aFh1fSDK, aFb1rSDK3.component1(context)}, 1333283554, -1333283541, System.identityHashCode(aFb1rSDK3));
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                AFb1rSDK aFb1rSDK4 = (AFb1rSDK) objArr[0];
                Context context2 = (Context) objArr[1];
                int i25 = 2 % 2;
                int i26 = d + 31;
                AFLogger = i26 % 128;
                int i27 = i26 % 2;
                aFb1rSDK4.start(context2, null);
                int i28 = AFLogger + 89;
                d = i28 % 128;
                int i29 = i28 % 2;
                break;
            default:
                AFb1rSDK aFb1rSDK5 = (AFb1rSDK) objArr[0];
                DeepLinkListener deepLinkListener = (DeepLinkListener) objArr[1];
                long longValue = ((Number) objArr[2]).longValue();
                int i30 = 2 % 2;
                int i31 = d + 65;
                AFLogger = i31 % 128;
                int i32 = i31 % 2;
                aFb1rSDK5.getCurrencyIso4217Code().d().getCurrencyIso4217Code = deepLinkListener;
                aFb1rSDK5.getCurrencyIso4217Code().d().component4 = longValue;
                int i33 = d + 119;
                AFLogger = i33 % 128;
                int i34 = i33 % 2;
                break;
        }
        return null;
    }

    static {
        component4();
        AFAdRevenueData = "298";
        getCurrencyIso4217Code = "6.15";
        StringBuilder sb = new StringBuilder();
        sb.append("6.15");
        sb.append("/androidevent?buildnumber=6.15.1&app_id=");
        getMediationNetwork = sb.toString();
        getMonetizationNetwork = null;
        areAllFieldsValid = new AFb1rSDK();
        int i = AFLogger + 13;
        d = i % 128;
        int i2 = i % 2;
    }

    public final AFd1kSDK getCurrencyIso4217Code() {
        AFd1mSDK aFd1mSDK;
        int i = 2 % 2;
        int i2 = d + 17;
        int i3 = i2 % 128;
        AFLogger = i3;
        if (i2 % 2 == 0) {
            aFd1mSDK = this.copydefault;
            int i4 = 13 / 0;
        } else {
            aFd1mSDK = this.copydefault;
        }
        int i5 = i3 + 7;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return aFd1mSDK;
    }

    public final void getRevenue(Context context) {
        int i = 2 % 2;
        int i2 = d + 65;
        int i3 = i2 % 128;
        AFLogger = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            AFd1mSDK aFd1mSDK = this.copydefault;
            if (context != null) {
                int i4 = i3 + 87;
                d = i4 % 128;
                if (i4 % 2 == 0) {
                    AFd1lSDK aFd1lSDK = aFd1mSDK.getMonetizationNetwork;
                    if (context != null) {
                        aFd1lSDK.getCurrencyIso4217Code = context.getApplicationContext();
                    }
                } else {
                    AFd1lSDK aFd1lSDK2 = aFd1mSDK.getMonetizationNetwork;
                    obj.hashCode();
                    throw null;
                }
            }
            int i5 = d + 31;
            AFLogger = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    private static void a(String str, String str2, int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $10 + 27;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = str2;
        if (str2 != null) {
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1uSDK aFk1uSDK = new AFk1uSDK();
        char[] cArr3 = AFKeystoreWrapper;
        if (cArr3 != null) {
            int i5 = $11 + 113;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = $11 + 101;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[i7] = (char) (cArr3[i7] ^ (-6776211671728551741L));
            }
            cArr3 = cArr4;
        }
        int i10 = (int) ((-6776211671728551741L) ^ AFInAppEventType);
        if (valueOf) {
            aFk1uSDK.getRevenue = bArr2.length;
            char[] cArr5 = new char[aFk1uSDK.getRevenue];
            aFk1uSDK.getMonetizationNetwork = 0;
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                cArr5[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[bArr2[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] + i] - i10);
                aFk1uSDK.getMonetizationNetwork++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (values) {
            aFk1uSDK.getRevenue = cArr2.length;
            char[] cArr6 = new char[aFk1uSDK.getRevenue];
            aFk1uSDK.getMonetizationNetwork = 0;
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                cArr6[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[cArr2[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] - i] - i10);
                aFk1uSDK.getMonetizationNetwork++;
                int i11 = $10 + 49;
                $11 = i11 % 128;
                int i12 = i11 % 2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFk1uSDK.getRevenue = iArr.length;
        char[] cArr7 = new char[aFk1uSDK.getRevenue];
        while (true) {
            aFk1uSDK.getMonetizationNetwork = 0;
            while (aFk1uSDK.getMonetizationNetwork < aFk1uSDK.getRevenue) {
                int i13 = $11 + 83;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    break;
                }
                cArr7[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[iArr[(aFk1uSDK.getRevenue - 1) - aFk1uSDK.getMonetizationNetwork] - i] - i10);
                aFk1uSDK.getMonetizationNetwork++;
            }
            objArr[0] = new String(cArr7);
            return;
            cArr7[aFk1uSDK.getMonetizationNetwork] = (char) (cArr3[iArr[aFk1uSDK.getRevenue >>> aFk1uSDK.getMonetizationNetwork] * i] >> i10);
            int i14 = aFk1uSDK.getMonetizationNetwork;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1.afWarnLog().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r5 == com.appsflyer.internal.AFf1aSDK.SUCCESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r5 == com.appsflyer.internal.AFf1aSDK.SUCCESS) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getRevenue(AFf1aSDK aFf1aSDK) {
        AFd1kSDK currencyIso4217Code;
        int i = 2 % 2;
        int i2 = d + 19;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            currencyIso4217Code = getCurrencyIso4217Code();
            int i3 = 6 / 0;
        } else {
            currencyIso4217Code = getCurrencyIso4217Code();
        }
        if (!currencyIso4217Code.equals().getRevenue()) {
            currencyIso4217Code.w().AFAdRevenueData();
            return;
        }
        currencyIso4217Code.w().getMediationNetwork();
        int i4 = AFLogger + 93;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    final synchronized AFf1bSDK getMonetizationNetwork() {
        AFf1bSDK aFf1bSDK;
        int i = 2 % 2;
        int i2 = AFLogger + 49;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFf1bSDK() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda1
                @Override // com.appsflyer.internal.AFf1bSDK
                public final void onRemoteConfigUpdateFinished(AFf1aSDK aFf1aSDK) {
                    AFb1rSDK.this.getRevenue(aFf1aSDK);
                }
            };
        }
        aFf1bSDK = this.AFInAppEventParameterName;
        int i3 = d + 23;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        return aFf1bSDK;
    }

    public AFb1rSDK() {
        AFVersionDeclaration.init();
        this.copydefault = new AFd1mSDK();
        getCurrencyIso4217Code().w().getMediationNetwork();
        getCurrencyIso4217Code().w().getMonetizationNetwork();
        AFf1zSDK copydefault = getCurrencyIso4217Code().copydefault();
        copydefault.getMediationNetwork.add(new AFa1vSDK());
    }

    public static AFb1rSDK getRevenue() {
        int i = 2 % 2;
        int i2 = d + 91;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        AFb1rSDK aFb1rSDK = areAllFieldsValid;
        int i5 = i3 + 9;
        d = i5 % 128;
        int i6 = i5 % 2;
        return aFb1rSDK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r5 = getCurrencyIso4217Code().d();
        r0 = new java.lang.StringBuilder("Context is \"");
        r0.append(r4);
        r0.append("\"");
        r5.getCurrencyIso4217Code(r0.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        getRevenue(r4);
        getCurrencyIso4217Code().d().o_(com.appsflyer.internal.AFc1pSDK.getCurrencyIso4217Code(getCurrencyIso4217Code().force()), android.net.Uri.parse(r5.toString()));
        r4 = com.appsflyer.internal.AFb1rSDK.d + 73;
        com.appsflyer.internal.AFb1rSDK.AFLogger = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if ((r4 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0017, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r5.toString().isEmpty() == false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = 2 % 2;
        int i2 = AFLogger + 77;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        AFc1kSDK d2 = getCurrencyIso4217Code().d();
        StringBuilder sb = new StringBuilder("Link is \"");
        sb.append(uri);
        sb.append("\"");
        d2.getCurrencyIso4217Code(sb.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 75;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            setSharingFilterForPartners(strArr);
            int i3 = d + 73;
            AFLogger = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 62 / 0;
                return;
            }
            return;
        }
        setSharingFilterForPartners(strArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = 2 % 2;
        int i2 = AFLogger + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        setSharingFilterForPartners("all");
        int i4 = d + 15;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i = 2 % 2;
        aFb1rSDK.getCurrencyIso4217Code().e().getMonetizationNetwork = new AFc1aSDK(strArr);
        int i2 = AFLogger + 5;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler component3;
        int i = 2 % 2;
        int i2 = AFLogger + 119;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getRevenue(context);
            component3 = getCurrencyIso4217Code().component3();
            String[] strArr = new String[0];
            strArr[0] = BillingClient.FeatureType.SUBSCRIPTIONS;
            if (!component3.getMediationNetwork(map, purchaseValidationCallback, strArr)) {
                return;
            }
        } else {
            getRevenue(context);
            component3 = getCurrencyIso4217Code().component3();
            if (!component3.getMediationNetwork(map, purchaseValidationCallback, BillingClient.FeatureType.SUBSCRIPTIONS)) {
                return;
            }
        }
        AFf1rSDK aFf1rSDK = new AFf1rSDK(map, purchaseValidationCallback, component3.getMediationNetwork);
        AFf1zSDK aFf1zSDK = component3.AFAdRevenueData;
        aFf1zSDK.getRevenue.execute(aFf1zSDK.new AnonymousClass3(aFf1rSDK));
        int i3 = d + 39;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r1 = new com.appsflyer.internal.AFf1nSDK(r6, r7, r5.getMediationNetwork);
        r5 = r5.AFAdRevenueData;
        r5.getRevenue.execute(new com.appsflyer.internal.AFf1zSDK.AnonymousClass3(r5, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5.getMediationNetwork(r6, r7, "purchases") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r5.getMediationNetwork(r6, r7, r3) != false) goto L9;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler component3;
        int i = 2 % 2;
        int i2 = d + 117;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            getRevenue(context);
            component3 = getCurrencyIso4217Code().component3();
            String[] strArr = new String[0];
            strArr[0] = "purchases";
        } else {
            getRevenue(context);
            component3 = getCurrencyIso4217Code().component3();
        }
        int i3 = AFLogger + 85;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = 2 % 2;
        int i2 = AFLogger + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFc1kSDK d2 = getCurrencyIso4217Code().d();
        d2.AFAdRevenueData = str;
        d2.getMediationNetwork = map;
        int i4 = AFLogger + 3;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i = 2 % 2;
        int i2 = d + 67;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            int i3 = AFLogger + 125;
            d = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        r2 = r2 + 55;
        com.appsflyer.internal.AFb1rSDK.AFLogger = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if ((r2 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r1.getCurrencyIso4217Code("No direct deep link", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r1.getCurrencyIso4217Code("No direct deep link", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r4 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void i_(Context context, Intent intent) {
        int i = 2 % 2;
        getRevenue(context);
        AFc1kSDK d2 = getCurrencyIso4217Code().d();
        AFd1pSDK mediationNetwork = getCurrencyIso4217Code().getMediationNetwork();
        Uri data = (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
        boolean z = (data == null || data.toString().isEmpty()) ? false : true;
        if (mediationNetwork.AFAdRevenueData("ddl_sent")) {
            int i2 = d;
            int i3 = i2 + 93;
            AFLogger = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 59 / 0;
            }
        }
        d2.n_(AFc1pSDK.getCurrencyIso4217Code(d2.areAllFieldsValid.force()), intent, context);
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        final AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        final Intent intent = (Intent) objArr[1];
        Context context = (Context) objArr[2];
        int i = 2 % 2;
        int i2 = AFLogger + 39;
        int i3 = i2 % 128;
        d = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (intent == null) {
            int i4 = i3 + 99;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                aFb1rSDK.getCurrencyIso4217Code().d().getCurrencyIso4217Code("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
                int i5 = 60 / 0;
                return null;
            }
            aFb1rSDK.getCurrencyIso4217Code().d().getCurrencyIso4217Code("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return null;
        }
        if (context == null) {
            aFb1rSDK.getCurrencyIso4217Code().d().getCurrencyIso4217Code("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            int i6 = d + 41;
            AFLogger = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        aFb1rSDK.getRevenue(applicationContext);
        aFb1rSDK.getCurrencyIso4217Code().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFb1rSDK.this.i_(applicationContext, intent);
            }
        });
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = 2 % 2;
        int i2 = d + 121;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = getCurrencyIso4217Code().d().getMonetizationNetwork;
        if (!list.contains(asList)) {
            int i4 = d + 63;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                list.add(asList);
                int i5 = 78 / 0;
            } else {
                list.add(asList);
            }
        }
        int i6 = d + 119;
        AFLogger = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        String concat;
        int i = 2 % 2;
        AFd1tSDK e = getCurrencyIso4217Code().e();
        if (e.AFAdRevenueData == null) {
            e.AFAdRevenueData = new AFc1cSDK();
        }
        AFc1cSDK aFc1cSDK = e.AFAdRevenueData;
        if (str != null) {
            int i2 = AFLogger + 3;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (!str.isEmpty()) {
                if (map == null || map.isEmpty()) {
                    if (aFc1cSDK.getMediationNetwork.remove(str) == null) {
                        int i4 = d + 119;
                        AFLogger = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        concat = "Partner data is missing or `null`";
                    } else {
                        concat = "Cleared partner data for ".concat(String.valueOf(str));
                        int i5 = d + 31;
                        AFLogger = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    AFLogger.afWarnLog(concat);
                    return;
                }
                StringBuilder sb = new StringBuilder("Setting partner data for ");
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.afDebugLog(sb.toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFc1cSDK.getMediationNetwork.put(str, map);
                    aFc1cSDK.getRevenue.remove(str);
                    return;
                } else {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    aFc1cSDK.getRevenue.put(str, hashMap);
                    return;
                }
            }
        }
        AFLogger.afWarnLog("Partner ID is missing or `null`");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = AFLogger + 79;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if (z) {
            int i4 = AFLogger + 21;
            d = i4 % 128;
            int i5 = i4 % 2;
            z2 = false;
        } else {
            z2 = true;
            int i6 = AFLogger + 1;
            d = i6 % 128;
            int i7 = i6 % 2;
        }
        AFb1uSDK.getCurrencyIso4217Code = Boolean.valueOf(z2);
        AFd1kSDK currencyIso4217Code = getCurrencyIso4217Code();
        currencyIso4217Code.e().component1 = z;
        if (!z) {
            AFf1zSDK copydefault = currencyIso4217Code.copydefault();
            copydefault.getRevenue.execute(copydefault.new AnonymousClass3(new AFf1mSDK(getCurrencyIso4217Code())));
            int i8 = d + 97;
            AFLogger = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        currencyIso4217Code.e().areAllFieldsValid = null;
    }

    public final void g_(Context context, Intent intent) {
        int i = 2 % 2;
        AFj1pSDK aFj1pSDK = new AFj1pSDK(intent);
        if (aFj1pSDK.getRevenue("appsflyer_preinstall") != null) {
            int i2 = d + 87;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                getMediationNetwork(aFj1pSDK.getRevenue("appsflyer_preinstall"));
                int i3 = 89 / 0;
            } else {
                getMediationNetwork(aFj1pSDK.getRevenue("appsflyer_preinstall"));
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String revenue = aFj1pSDK.getRevenue("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(revenue)));
        if (revenue != null) {
            getCurrencyIso4217Code(context).getMonetizationNetwork("referrer", revenue);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", revenue);
            appsFlyerProperties.getRevenue = revenue;
            if (AppsFlyerProperties.getInstance().getMediationNetwork()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getMediationNetwork(context, AFh1rSDK.onReceive);
                getRevenue(revenue);
            }
        }
        int i4 = d + 99;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    int i3 = d + 79;
                    AFLogger = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList.add(Long.valueOf(jSONArray.getLong(i2)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext()) {
                int i5 = AFLogger + 119;
                d = i5 % 128;
                int i6 = i5 % 2;
                if (str != null) {
                    break loop2;
                }
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i7 = 0;
                    while (i7 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i7) != ((Long) arrayList.get(0)).longValue()) {
                            int i8 = d + 89;
                            AFLogger = i8 % 128;
                            int i9 = i8 % 2;
                            if (jSONArray2.getLong(i7) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i7) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                i7++;
                                str = next;
                            }
                        }
                        int i10 = AFLogger + 103;
                        d = i10 % 128;
                        int i11 = i10 % 2;
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
            break loop2;
        }
        if (str != null) {
            jSONObject.remove(str);
            int i12 = AFLogger + 87;
            d = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = d + 39;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        Object obj = null;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String AFAdRevenueData2 = aFb1rSDK.getCurrencyIso4217Code(context).AFAdRevenueData("extraReferrers", (String) null);
            if (AFAdRevenueData2 == null) {
                jSONObject = new JSONObject();
                jSONArray2 = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(AFAdRevenueData2);
                if (jSONObject2.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray = new JSONArray();
                    int i4 = d + 35;
                    AFLogger = i4 % 128;
                    int i5 = i4 % 2;
                }
                jSONArray2 = jSONArray;
                jSONObject = jSONObject2;
            }
            if (jSONArray2.length() < 5) {
                int i6 = d + 39;
                AFLogger = i6 % 128;
                if (i6 % 2 == 0) {
                    jSONArray2.put(currentTimeMillis);
                    int i7 = 24 / 0;
                } else {
                    jSONArray2.put(currentTimeMillis);
                }
            }
            if (jSONObject.length() >= 4) {
                int i8 = d + 107;
                AFLogger = i8 % 128;
                if (i8 % 2 != 0) {
                    getMediationNetwork(jSONObject);
                } else {
                    getMediationNetwork(jSONObject);
                    obj.hashCode();
                    throw null;
                }
            }
            jSONObject.put(str, jSONArray2.toString());
            aFb1rSDK.getCurrencyIso4217Code(context).getMonetizationNetwork("extraReferrers", jSONObject.toString());
            return null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
            return null;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(AFd1kSDK aFd1kSDK) {
        int i = 2 % 2;
        int i2 = d + 73;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        aFd1kSDK.AFKeystoreWrapper().getCurrencyIso4217Code();
        int i4 = AFLogger + 77;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        aFb1rSDK.getRevenue((Context) objArr[2]);
        final AFd1kSDK currencyIso4217Code = aFb1rSDK.getCurrencyIso4217Code();
        currencyIso4217Code.AFInAppEventType().component3 = booleanValue;
        currencyIso4217Code.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFb1rSDK.getCurrencyIso4217Code(AFd1kSDK.this);
            }
        });
        if (booleanValue) {
            int i2 = d + 21;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            currencyIso4217Code.getMediationNetwork().getMediationNetwork("is_stop_tracking_used", true);
        }
        int i4 = d + 91;
        AFLogger = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i = 2 % 2;
        int i2 = AFLogger + 107;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("getSdkVersion", new String[0]);
        String component2 = AFd1rSDK.component2();
        int i4 = d + 1;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            return component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        getRevenue(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z));
        int i4 = AFLogger + 25;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().afInfoLog().getMediationNetwork();
        int i4 = d + 105;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getRevenue(context);
        AFg1lSDK aFg1lSDK = new AFg1lSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFh1xSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFh1xSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFg1mSDK AFAdRevenueData2 = aFg1lSDK.AFAdRevenueData();
        if (AFAdRevenueData2 == null || !str.equals(AFAdRevenueData2.getRevenue)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = AFAdRevenueData2 == null || currentTimeMillis - AFAdRevenueData2.AFAdRevenueData > TimeUnit.SECONDS.toMillis(2L);
            AFg1mSDK aFg1mSDK = new AFg1mSDK(str, currentTimeMillis, !z);
            aFg1lSDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken", aFg1mSDK.getRevenue);
            aFg1lSDK.AFAdRevenueData.AFAdRevenueData("afUninstallToken_received_time", aFg1mSDK.AFAdRevenueData);
            aFg1lSDK.AFAdRevenueData.getMediationNetwork("afUninstallToken_queued", aFg1mSDK.getMonetizationNetwork());
            if (z) {
                AFg1lSDK.getCurrencyIso4217Code(str);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = 2 % 2;
        int i2 = d + 37;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + 77;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                logLevel = AFLogger.LogLevel.DEBUG;
                int i6 = 0 / 0;
            } else {
                logLevel = AFLogger.LogLevel.DEBUG;
            }
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = AFLogger + 31;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            aFb1rSDK.getCurrencyIso4217Code().equals().getMediationNetwork("setImeiData", str);
        } else {
            aFb1rSDK.getCurrencyIso4217Code().equals().getMediationNetwork("setImeiData", str);
        }
        aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().areAllFieldsValid = str;
        int i3 = d + 121;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = AFLogger + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.getCurrencyIso4217Code().equals().getMediationNetwork("setOaidData", str);
        AFb1uSDK.getMonetizationNetwork = str;
        int i4 = d + 103;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void getRevenue(String str, String str2) {
        int i = 2 % 2;
        int i2 = d + 121;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties.getInstance().set(str, str2);
        int i4 = d + 1;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void getRevenue(String str, boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 55;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, z);
            int i3 = AFLogger + 3;
            d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 34 / 0;
                return;
            }
            return;
        }
        AppsFlyerProperties.getInstance().set(str, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static String getMonetizationNetwork(String str) {
        int i = 2 % 2;
        int i2 = d + 123;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (i3 != 0) {
            return appsFlyerProperties.getString(str);
        }
        appsFlyerProperties.getString(str);
        throw null;
    }

    private static boolean AFAdRevenueData(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 21;
        d = i2 % 128;
        boolean z = i2 % 2 != 0 ? AppsFlyerProperties.getInstance().getBoolean(str, true) : AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i3 = d + 103;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return z;
    }

    public final boolean AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = AFLogger + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (!AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID) || ((String) getRevenue(new Object[0], 510568030, -510568022, (int) System.currentTimeMillis())) != null) {
            return false;
        }
        int i4 = AFLogger + 105;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        int i = 2 % 2;
        int i2 = d + 43;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (context != null) {
            if (AFAdRevenueData()) {
                setCustomerUserId(str);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(getCurrencyIso4217Code().getMediationNetwork());
                getMediationNetwork(context, AFh1rSDK.setCustomerIdAndLogSession);
                String str2 = getCurrencyIso4217Code().AFInAppEventType().component2;
                if (referrer == null) {
                    int i3 = AFLogger + 5;
                    d = i3 % 128;
                    int i4 = i3 % 2;
                    referrer = "";
                }
                if (context instanceof Activity) {
                    ((Activity) context).getIntent();
                }
                AFAdRevenueData(context, referrer);
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = AFLogger + 113;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            int i3 = 27 / 0;
            if (string != null) {
                return string;
            }
        } else {
            String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
            if (string2 != null) {
                return string2;
            }
        }
        String monetizationNetwork = aFb1rSDK.getMonetizationNetwork(context, "AF_STORE");
        if (monetizationNetwork != null) {
            int i4 = AFLogger + 109;
            d = i4 % 128;
            int i5 = i4 % 2;
            return monetizationNetwork;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = d + 37;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            int i3 = d + 39;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (r5.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) == false) goto L11;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setAppInviteOneLink(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 39;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            int i4 = AFLogger + 79;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID));
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        getRevenue(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = d + 67;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (map != null) {
            getCurrencyIso4217Code().equals().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            int i3 = AFLogger + 17;
            d = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a3  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendPushNotificationData(Activity activity) {
        int i;
        long j;
        long j2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i2 = 2;
        int i3 = 2 % 2;
        if (activity != null && activity.getIntent() != null) {
            AFb1aSDK equals = getCurrencyIso4217Code().equals();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            equals.getMediationNetwork("sendPushNotificationData", localClassName, sb.toString());
        } else if (activity == null) {
            getCurrencyIso4217Code().equals().getMediationNetwork("sendPushNotificationData", "activity_null");
            int i4 = AFLogger + 81;
            d = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = AFLogger + 23;
            d = i6 % 128;
            int i7 = i6 % 2;
            getCurrencyIso4217Code().equals().getMediationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
            int i8 = AFLogger + 125;
            d = i8 % 128;
            int i9 = i8 % 2;
        }
        AFd1tSDK e = getCurrencyIso4217Code().e();
        e.getCurrencyIso4217Code = getMonetizationNetwork(activity);
        if (e.getCurrencyIso4217Code != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.toString == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.toString = new ConcurrentHashMap();
                i = 2;
                j2 = currentTimeMillis;
                j = j2;
            } else {
                try {
                    long j3 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", Constants.SESSION_TIMEOUT_MILLIS);
                    j2 = currentTimeMillis;
                    for (Long l : this.toString.keySet()) {
                        try {
                            jSONObject = new JSONObject(e.getCurrencyIso4217Code);
                            i = i2;
                            try {
                                jSONObject2 = new JSONObject(this.toString.get(l));
                                j = currentTimeMillis;
                            } catch (Throwable th) {
                                th = th;
                                j = currentTimeMillis;
                                StringBuilder sb2 = new StringBuilder("Error while handling push notification measurement: ");
                                sb2.append(th.getClass().getSimpleName());
                                AFLogger.afErrorLog(sb2.toString(), th);
                                if (this.toString.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                                }
                                this.toString.put(Long.valueOf(j), e.getCurrencyIso4217Code);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i = i2;
                        }
                        try {
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                StringBuilder sb3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                sb3.append(jSONObject2);
                                sb3.append(", new: ");
                                sb3.append(jSONObject);
                                sb3.append(")");
                                AFLogger.afInfoLog(sb3.toString());
                                e.getCurrencyIso4217Code = null;
                                return;
                            }
                            if (j - l.longValue() > j3) {
                                int i10 = AFLogger + 21;
                                d = i10 % 128;
                                if (i10 % 2 == 0) {
                                    this.toString.remove(l);
                                } else {
                                    this.toString.remove(l);
                                    throw null;
                                }
                            }
                            if (l.longValue() <= j2) {
                                j2 = l.longValue();
                            }
                            i2 = i;
                            currentTimeMillis = j;
                        } catch (Throwable th3) {
                            th = th3;
                            StringBuilder sb22 = new StringBuilder("Error while handling push notification measurement: ");
                            sb22.append(th.getClass().getSimpleName());
                            AFLogger.afErrorLog(sb22.toString(), th);
                            if (this.toString.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                            }
                            this.toString.put(Long.valueOf(j), e.getCurrencyIso4217Code);
                            start(activity);
                        }
                    }
                    i = i2;
                    j = currentTimeMillis;
                } catch (Throwable th4) {
                    th = th4;
                    i = 2;
                    j = currentTimeMillis;
                    j2 = j;
                }
            }
            if (this.toString.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i)) {
                StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb4.append(j2);
                sb4.append(")");
                AFLogger.afInfoLog(sb4.toString());
                this.toString.remove(Long.valueOf(j2));
            }
            this.toString.put(Long.valueOf(j), e.getCurrencyIso4217Code);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 65;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getCurrencyIso4217Code().equals().getMediationNetwork("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i3 = 29 / 0;
        } else {
            getCurrencyIso4217Code().equals().getMediationNetwork("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
    }

    /* renamed from: com.appsflyer.internal.AFb1rSDK$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getMonetizationNetwork;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getMonetizationNetwork = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getMonetizationNetwork[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getCurrencyIso4217Code().equals().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        String str = null;
        while (i2 < length) {
            int i3 = d + 13;
            AFLogger = i3 % 128;
            if (i3 % 2 != 0) {
                String str2 = strArr[i2];
                if (AnonymousClass1.getMonetizationNetwork[emailsCryptType.ordinal()] != 2) {
                    arrayList2.add(AFb1kSDK.getMonetizationNetwork(str2));
                    str = "sha256_el_arr";
                } else {
                    arrayList2.add(str2);
                    str = "plain_el_arr";
                }
                i2++;
                int i4 = AFLogger + 51;
                d = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 2;
                }
            } else {
                String str3 = strArr[i2];
                int i6 = AnonymousClass1.getMonetizationNetwork[emailsCryptType.ordinal()];
                throw null;
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        int i = 2 % 2;
        int i2 = d + 107;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            AFb1aSDK equals = getCurrencyIso4217Code().equals();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z);
            equals.getMediationNetwork("setCollectAndroidID", strArr);
        } else {
            getCurrencyIso4217Code().equals().getMediationNetwork("setCollectAndroidID", String.valueOf(z));
        }
        getRevenue(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        getRevenue(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i3 = d + 3;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        int i = 2 % 2;
        int i2 = d + 123;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        getRevenue(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        getRevenue(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
        int i4 = d + 91;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 47;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFc1kSDK d2 = getCurrencyIso4217Code().d();
        d2.component3.clear();
        d2.component3.addAll(Arrays.asList(strArr));
        int i4 = d + 15;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i = 2 % 2;
        int i2 = d + 43;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        getCurrencyIso4217Code().d().component1 = strArr;
        int i4 = d + 67;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 117;
        d = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            getCurrencyIso4217Code().w().getRevenue();
            int i4 = AFLogger + 83;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        getCurrencyIso4217Code().w().getCurrencyIso4217Code();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        int i = 2 % 2;
        getMediationNetwork(new AFh1mSDK());
        int i2 = AFLogger + 57;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        AFi1qSDK aFi1qSDK;
        long j;
        int i = 2 % 2;
        if (!this.copy) {
            this.copy = true;
            getCurrencyIso4217Code().AFInAppEventType().component2 = str;
            if (context != null) {
                getRevenue(context);
                Application f_ = AFb1qSDK.f_(context);
                if (f_ != null) {
                    this.component3 = f_;
                    getCurrencyIso4217Code().AFKeystoreWrapper().getRevenue();
                    getCurrencyIso4217Code().component4().getMediationNetwork = System.currentTimeMillis();
                    AFf1zSDK copydefault = getCurrencyIso4217Code().copydefault();
                    copydefault.getRevenue.execute(copydefault.new AnonymousClass3(new AFf1mSDK(getCurrencyIso4217Code())));
                    AFi1sSDK registerClient = getCurrencyIso4217Code().registerClient();
                    if (Build.VERSION.SDK_INT >= 31) {
                        aFi1qSDK = new AFi1tSDK(registerClient.getCurrencyIso4217Code);
                        int i2 = d + 77;
                        AFLogger = i2 % 128;
                        int i3 = i2 % 2;
                    } else {
                        aFi1qSDK = new AFi1qSDK(registerClient.getCurrencyIso4217Code);
                    }
                    registerClient.getMonetizationNetwork = aFi1qSDK;
                    getCurrencyIso4217Code().afWarnLog().getCurrencyIso4217Code(new AFd1cSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda2
                        @Override // com.appsflyer.internal.AFd1cSDK.AFa1zSDK
                        public final void onConfigurationChanged(boolean z) {
                            AFb1rSDK.this.getCurrencyIso4217Code(z);
                        }
                    });
                    getCurrencyIso4217Code().component1().AFAdRevenueData(getMonetizationNetwork());
                    AFj1sSDK copy = getCurrencyIso4217Code().copy();
                    Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            AFb1rSDK.this.equals();
                        }
                    };
                    AFi1eSDK AFAdRevenueData2 = copy.AFAdRevenueData(runnable);
                    Runnable mediationNetwork = copy.getMediationNetwork(AFAdRevenueData2, runnable);
                    copy.getMonetizationNetwork(AFAdRevenueData2);
                    copy.getMonetizationNetwork(new AFj1rSDK(copy.getCurrencyIso4217Code.getCurrencyIso4217Code(), mediationNetwork));
                    copy.getMonetizationNetwork(new AFj1wSDK(mediationNetwork, copy.getCurrencyIso4217Code, new AFi1dSDK()));
                    copy.getMonetizationNetwork(new AFj1uSDK(mediationNetwork, copy.getCurrencyIso4217Code));
                    if (copy.getCurrencyIso4217Code.afVerboseLog().getCurrencyIso4217Code(AFg1gSDK.IS_SAMSUNG_PRELOAD_REFERRER_COLLECTION_ENABLED)) {
                        copy.getMonetizationNetwork(new AFj1tSDK(copy.getCurrencyIso4217Code.getMonetizationNetwork(), copy.getCurrencyIso4217Code.getCurrencyIso4217Code(), mediationNetwork));
                    }
                    copy.getCurrencyIso4217Code(mediationNetwork);
                    if (!copy.getCurrencyIso4217Code()) {
                        Context context2 = copy.getCurrencyIso4217Code.AFInAppEventParameterName().getCurrencyIso4217Code;
                        AFd1kSDK aFd1kSDK = copy.getCurrencyIso4217Code;
                        List<ResolveInfo> queryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                            int i4 = AFLogger + 51;
                            d = i4 % 128;
                            int i5 = i4 % 2;
                            while (it.hasNext()) {
                                ProviderInfo providerInfo = it.next().providerInfo;
                                if (providerInfo != null) {
                                    arrayList.add(new AFj1xSDK(providerInfo, mediationNetwork, aFd1kSDK));
                                } else {
                                    AFLogger.INSTANCE.w(AFh1xSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                copy.getMediationNetwork.addAll(arrayList);
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFh1xSDK aFh1xSDK = AFh1xSDK.PREINSTALL;
                                StringBuilder sb = new StringBuilder("Detected ");
                                sb.append(arrayList.size());
                                sb.append(" valid preinstall provider(s)");
                                aFLogger.d(aFh1xSDK, sb.toString());
                            }
                        }
                    }
                    AFj1qSDK[] AFAdRevenueData3 = copy.AFAdRevenueData();
                    int length = AFAdRevenueData3.length;
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = AFLogger + 33;
                        d = i7 % 128;
                        if (i7 % 2 != 0) {
                            AFAdRevenueData3[i6].getMonetizationNetwork(copy.getCurrencyIso4217Code.AFInAppEventParameterName().getCurrencyIso4217Code);
                            i6 += 14;
                        } else {
                            AFAdRevenueData3[i6].getMonetizationNetwork(copy.getCurrencyIso4217Code.AFInAppEventParameterName().getCurrencyIso4217Code);
                            i6++;
                        }
                    }
                    AFi1jSDK i8 = getCurrencyIso4217Code().i();
                    if (i8 != null) {
                        int i9 = AFLogger + 121;
                        d = i9 % 128;
                        int i10 = i9 % 2;
                        if (i8.getMediationNetwork()) {
                            AFf1zSDK copydefault2 = getCurrencyIso4217Code().copydefault();
                            copydefault2.getRevenue.execute(copydefault2.new AnonymousClass3(new AFf1lSDK(i8)));
                        }
                    }
                    final AFg1uSDK AFInAppEventType2 = this.copydefault.AFInAppEventType();
                    AFd1rSDK currencyIso4217Code = getCurrencyIso4217Code().getCurrencyIso4217Code();
                    AFInAppEventType2.getMonetizationNetwork = System.currentTimeMillis();
                    AFg1tSDK aFg1tSDK = AFInAppEventType2.getRevenue;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AFb1mSDK.getMediationNetwork(currencyIso4217Code.getMonetizationNetwork, currencyIso4217Code.getRevenue));
                    sb2.append(AFInAppEventType2.getMonetizationNetwork);
                    byte[] revenue = AFb1kSDK.getRevenue(sb2.toString());
                    if (revenue == null || revenue.length <= 0) {
                        j = -1;
                    } else {
                        if (revenue.length > 8) {
                            revenue = Arrays.copyOfRange(revenue, 0, 8);
                        }
                        ByteBuffer allocate = ByteBuffer.allocate(8);
                        allocate.put(revenue);
                        allocate.flip();
                        j = allocate.getLong();
                    }
                    AFInAppEventType2.AFAdRevenueData = aFg1tSDK.AFAdRevenueData(j, AFInAppEventType2.getCurrencyIso4217Code.getCurrencyIso4217Code, new AFg1tSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFg1uSDK.3
                        @Override // com.appsflyer.internal.AFg1tSDK.AFa1vSDK
                        public final void getMonetizationNetwork(String str2, String str3) {
                            AFg1uSDK.this.getMediationNetwork = new ConcurrentHashMap();
                            AFg1uSDK.this.getMediationNetwork.put("signedData", str2);
                            AFg1uSDK.this.getMediationNetwork.put("signature", str3);
                            AFg1uSDK.this.AFAdRevenueData();
                            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                        }

                        @Override // com.appsflyer.internal.AFg1tSDK.AFa1vSDK
                        public final void getMediationNetwork(String str2, Exception exc) {
                            AFg1uSDK.this.getMediationNetwork = new ConcurrentHashMap();
                            String message = exc.getMessage();
                            if (message == null) {
                                message = "unknown";
                            }
                            AFg1uSDK.this.AFAdRevenueData();
                            AFg1uSDK.this.getMediationNetwork.put("error", message);
                            AFLogger.afErrorLog(str2, exc, true, true, false);
                        }
                    });
                }
            } else {
                AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            }
            getCurrencyIso4217Code().equals().getMediationNetwork(Session.JsonKeys.INIT, str, appsFlyerConversionListener == null ? AbstractJsonLexerKt.NULL : "conversionDataListener");
            AFLogger.INSTANCE.force(AFh1xSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.15.1", AFAdRevenueData));
            this.getRevenue = appsFlyerConversionListener;
            return this;
        }
        return this;
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = AFLogger + 37;
        d = i2 % 128;
        int i3 = i2 % 2;
        aFb1rSDK.getCurrencyIso4217Code().AFLogger().getMonetizationNetwork(booleanValue);
        int i4 = d + 11;
        AFLogger = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 99;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            start(context, str, null);
        } else {
            start(context, str, null);
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
        int i = 2 % 2;
        int i2 = d + 97;
        AFLogger = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            aFb1rSDK.getCurrencyIso4217Code().afInfoLog().getCurrencyIso4217Code();
            obj.hashCode();
            throw null;
        }
        if (aFb1rSDK.getCurrencyIso4217Code().afInfoLog().getCurrencyIso4217Code()) {
            return null;
        }
        if (!aFb1rSDK.copy) {
            int i3 = d + 69;
            AFLogger = i3 % 128;
            int i4 = i3 % 2;
            getCurrencyIso4217Code("start");
            if (str == null) {
                int i5 = d + 95;
                AFLogger = i5 % 128;
                int i6 = i5 % 2;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
        }
        aFb1rSDK.getRevenue(context);
        final AFh1sSDK component4 = aFb1rSDK.getCurrencyIso4217Code().component4();
        component4.AFAdRevenueData(AFa1oSDK.getCurrencyIso4217Code(context));
        if (aFb1rSDK.component3 == null) {
            Application f_ = AFb1qSDK.f_(context);
            if (f_ == null) {
                int i7 = AFLogger + 45;
                d = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 7 / 0;
                }
                return null;
            }
            aFb1rSDK.component3 = f_;
        }
        aFb1rSDK.getCurrencyIso4217Code().equals().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1xSDK aFh1xSDK = AFh1xSDK.GENERAL;
        String str2 = AFAdRevenueData;
        aFLogger.i(aFh1xSDK, String.format("Starting AppsFlyer: (v%s.%s)", "6.15.1", str2));
        AFLogger aFLogger2 = AFLogger.INSTANCE;
        AFh1xSDK aFh1xSDK2 = AFh1xSDK.GENERAL;
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger2.i(aFh1xSDK2, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(aFb1rSDK.getCurrencyIso4217Code().getMediationNetwork());
        if (!TextUtils.isEmpty(str)) {
            aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().component2 = str;
            int i9 = d + 13;
            AFLogger = i9 % 128;
            int i10 = i9 % 2;
        } else if (TextUtils.isEmpty(aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().component2)) {
            int i11 = d + 115;
            AFLogger = i11 % 128;
            int i12 = i11 % 2;
            component1();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            return null;
        }
        aFb1rSDK.getCurrencyIso4217Code().component1().AFAdRevenueData(aFb1rSDK.getMonetizationNetwork());
        aFb1rSDK.component3();
        getRevenue(new Object[]{aFb1rSDK.component3.getBaseContext()}, 1305505597, -1305505583, (int) System.currentTimeMillis());
        aFb1rSDK.getCurrencyIso4217Code().AFLogger().getCurrencyIso4217Code();
        aFb1rSDK.copydefault.afInfoLog().getRevenue(context, new AFd1vSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFb1rSDK.2
            @Override // com.appsflyer.internal.AFd1vSDK.AFa1uSDK
            public final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) {
                component4.AFAdRevenueData();
                AFd1kSDK currencyIso4217Code = AFb1rSDK.this.getCurrencyIso4217Code();
                currencyIso4217Code.component1().AFAdRevenueData(AFb1rSDK.this.getMonetizationNetwork());
                AFb1rSDK.this.component3();
                int AFAdRevenueData2 = currencyIso4217Code.getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (AFAdRevenueData2 < 2) {
                    AFb1rSDK.this.getCurrencyIso4217Code().areAllFieldsValid().getMonetizationNetwork();
                }
                AFh1gSDK aFh1gSDK = new AFh1gSDK();
                if (aFh1jSDK != null) {
                    AFb1rSDK.this.getCurrencyIso4217Code().d().n_(AFc1pSDK.getMonetizationNetwork(aFh1gSDK), aFh1jSDK.getMediationNetwork, currencyIso4217Code.AFInAppEventParameterName().getCurrencyIso4217Code);
                }
                AFb1rSDK aFb1rSDK2 = AFb1rSDK.this;
                aFh1gSDK.getMediationNetwork = appsFlyerRequestListener;
                AFb1rSDK.getRevenue(new Object[]{aFb1rSDK2, aFh1gSDK, aFh1jSDK}, 1333283554, -1333283541, System.identityHashCode(aFb1rSDK2));
            }

            @Override // com.appsflyer.internal.AFd1vSDK.AFa1uSDK
            public final void getRevenue() {
                Context context2 = AFb1rSDK.this.getCurrencyIso4217Code().AFInAppEventParameterName().getCurrencyIso4217Code;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1sSDK aFh1sSDK = component4;
                long currentTimeMillis = System.currentTimeMillis();
                if (aFh1sSDK.component2 != 0) {
                    long j = currentTimeMillis - aFh1sSDK.component2;
                    if (j > 0 && j < 1000) {
                        j = 1000;
                    }
                    aFh1sSDK.hashCode = TimeUnit.MILLISECONDS.toSeconds(j);
                    aFh1sSDK.getMonetizationNetwork.AFAdRevenueData("prev_session_dur", aFh1sSDK.hashCode);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFb1rSDK.this.getCurrencyIso4217Code().afWarnLog().AFAdRevenueData();
                AFb1aSDK equals = AFb1rSDK.this.getCurrencyIso4217Code().equals();
                if (equals.component2()) {
                    equals.getMonetizationNetwork();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        equals.k_(context2.getPackageName(), context2.getPackageManager());
                    }
                    equals.getCurrencyIso4217Code();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFb1rSDK.this.getCurrencyIso4217Code().areAllFieldsValid().getRevenue();
                AFb1rSDK.this.getCurrencyIso4217Code().force().AFAdRevenueData();
            }
        });
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i = 2 % 2;
        int i2 = d + 25;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                        AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return null;
                    }
                    int i4 = AFLogger + 7;
                    d = i4 % 128;
                    int i5 = i4 % 2;
                    AFLogger.INSTANCE.i(AFh1xSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                    int i6 = d + 31;
                    AFLogger = i6 % 128;
                    int i7 = i6 % 2;
                    return null;
                }
                if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                    AFLogger.INSTANCE.i(AFh1xSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    return null;
                }
                AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
            }
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "Exception while checking BackupRules: ", th);
            return null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AFLogger + 77;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String monetizationNetwork = getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        int i3 = d + 23;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 35;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getRevenue(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        int i4 = d + 99;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = d + 83;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().e().getRevenue = AFb1kSDK.getMonetizationNetwork(str);
        int i4 = d + 71;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 105;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("setAppId", str);
        getRevenue(AppsFlyerProperties.APP_ID, str);
        int i4 = AFLogger + 13;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 11;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            AFb1aSDK equals = getCurrencyIso4217Code().equals();
            String[] strArr = new String[0];
            strArr[1] = str;
            equals.getMediationNetwork("setExtension", strArr);
        } else {
            getCurrencyIso4217Code().equals().getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i3 = d + 77;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = 2 % 2;
        int i2 = d + 19;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i4 = AFLogger + 101;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 29;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        int i4 = d + 31;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) {
        int i = 2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d3));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        getRevenue(new Object[]{this, context, AFInAppEventType.LOCATION_COORDINATES, hashMap}, 792609668, -792609665, System.identityHashCode(this));
        int i2 = d + 55;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 45;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("logSession", new String[0]);
        getCurrencyIso4217Code().equals().getMediationNetwork();
        getMediationNetwork(context, AFh1rSDK.logSession);
        getRevenue(new Object[]{this, context, null, null}, 792609668, -792609665, System.identityHashCode(this));
        int i4 = d + 105;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
    }

    private void getMediationNetwork(Context context, AFh1rSDK aFh1rSDK) {
        int i = 2 % 2;
        int i2 = d + 55;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            getRevenue(context);
            AFh1sSDK component4 = getCurrencyIso4217Code().component4();
            AFh1qSDK currencyIso4217Code = AFa1oSDK.getCurrencyIso4217Code(context);
            if (component4.getMediationNetwork()) {
                int i3 = AFLogger + 117;
                d = i3 % 128;
                if (i3 % 2 != 0) {
                    component4.AFAdRevenueData.put("api_name", aFh1rSDK.toString());
                    component4.AFAdRevenueData(currencyIso4217Code);
                    int i4 = 32 / 0;
                } else {
                    component4.AFAdRevenueData.put("api_name", aFh1rSDK.toString());
                    component4.AFAdRevenueData(currencyIso4217Code);
                }
            }
            component4.AFAdRevenueData();
            int i5 = d + 25;
            AFLogger = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        getRevenue(context);
        AFh1sSDK component42 = getCurrencyIso4217Code().component4();
        AFa1oSDK.getCurrencyIso4217Code(context);
        component42.getMediationNetwork();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) objArr[1];
        Map map = (Map) objArr[2];
        int i = 2 % 2;
        if (aFb1rSDK.copy) {
            if (!aFAdRevenueData.areAllFieldsValid()) {
                AFLogger.INSTANCE.w(AFh1xSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                return null;
            }
            if (aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().getRevenue()) {
                AFLogger.INSTANCE.w(AFh1xSDK.AD_REVENUE, "SDK is stopped");
                return null;
            }
            if (AFc1rSDK.getMediationNetwork(aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().component2)) {
                component1();
                int i2 = d + 9;
                AFLogger = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            aFb1rSDK.AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
            return null;
        }
        int i3 = d + 81;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            getCurrencyIso4217Code("logAdRevenue");
            int i4 = 57 / 0;
            return null;
        }
        getCurrencyIso4217Code("logAdRevenue");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = AFLogger + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        logEvent(context, str, map, null);
        int i4 = AFLogger + 27;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    private AFh1jSDK component1(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger;
        int i3 = i2 + 81;
        d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            if (context instanceof Activity) {
                AFh1jSDK aFh1jSDK = new AFh1jSDK((Activity) context, getCurrencyIso4217Code().unregisterClient());
                int i4 = d + 15;
                AFLogger = i4 % 128;
                int i5 = i4 % 2;
                return aFh1jSDK;
            }
            int i6 = i2 + 17;
            d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 76 / 0;
            }
            return null;
        }
        boolean z = context instanceof Activity;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        int i = 2 % 2;
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.component3 = str;
        aFh1fSDK.getCurrencyIso4217Code = map;
        getRevenue(new Object[]{aFb1rSDK, aFh1fSDK, aFb1rSDK.component1(context)}, 1333283554, -1333283541, System.identityHashCode(aFb1rSDK));
        int i2 = d + 25;
        AFLogger = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        AFa1mSDK aFa1mSDK = (AFa1mSDK) objArr[1];
        AFh1jSDK aFh1jSDK = (AFh1jSDK) objArr[2];
        int i = 2 % 2;
        int i2 = AFLogger + 67;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getCurrencyIso4217Code(aFa1mSDK, aFh1jSDK);
            if (aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().component2 == null) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1mSDK.getMediationNetwork;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
            String referrer = AppsFlyerProperties.getInstance().getReferrer(aFb1rSDK.getCurrencyIso4217Code().getMediationNetwork());
            if (referrer == null) {
                int i3 = AFLogger + 51;
                d = i3 % 128;
                if (i3 % 2 == 0) {
                    referrer = "";
                } else {
                    obj.hashCode();
                    throw null;
                }
            }
            aFa1mSDK.areAllFieldsValid = referrer;
            aFb1rSDK.AFAdRevenueData(aFa1mSDK);
            return null;
        }
        getCurrencyIso4217Code(aFa1mSDK, aFh1jSDK);
        String str = aFb1rSDK.getCurrencyIso4217Code().AFInAppEventType().component2;
        obj.hashCode();
        throw null;
    }

    private static void getCurrencyIso4217Code(AFa1mSDK aFa1mSDK, AFh1jSDK aFh1jSDK) {
        int i = 2 % 2;
        int i2 = AFLogger;
        int i3 = i2 + 85;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (aFh1jSDK != null) {
            int i5 = i2 + 39;
            d = i5 % 128;
            int i6 = i5 % 2;
            aFa1mSDK.getMonetizationNetwork = aFh1jSDK.getRevenue;
            aFa1mSDK.component2 = aFh1jSDK.AFAdRevenueData;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        int i4 = AFLogger + 53;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = d + 107;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            getCurrencyIso4217Code().equals().getMediationNetwork("registerConversionListener", new String[0]);
        } else {
            getCurrencyIso4217Code().equals().getMediationNetwork("registerConversionListener", new String[0]);
        }
        getRevenue(appsFlyerConversionListener);
        int i3 = d + 59;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = 2 % 2;
        int i2 = d + 21;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        if (appsFlyerConversionListener != null) {
            this.getRevenue = appsFlyerConversionListener;
            return;
        }
        int i5 = i3 + 19;
        d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i = 2 % 2;
        int i2 = AFLogger + 89;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getCurrencyIso4217Code().equals().getMediationNetwork("unregisterConversionListener", new String[0]);
        } else {
            getCurrencyIso4217Code().equals().getMediationNetwork("unregisterConversionListener", new String[0]);
        }
        this.getRevenue = null;
        int i3 = d + 53;
        AFLogger = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        int i = 2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            getMonetizationNetwork = appsFlyerInAppPurchaseValidatorListener;
            int i2 = AFLogger + 7;
            d = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = AFLogger + 83;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            throw null;
        }
    }

    public static String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, long j) {
        int i = 2 % 2;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i2 = d + 25;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return format;
    }

    private void AFAdRevenueData(Context context, String str) {
        int i = 2 % 2;
        AFh1gSDK aFh1gSDK = new AFh1gSDK();
        getRevenue(context);
        aFh1gSDK.component3 = null;
        aFh1gSDK.getCurrencyIso4217Code = null;
        aFh1gSDK.areAllFieldsValid = str;
        aFh1gSDK.getMonetizationNetwork = null;
        AFAdRevenueData(aFh1gSDK);
        int i2 = AFLogger + 33;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AFAdRevenueData(AFa1mSDK aFa1mSDK) {
        boolean z;
        int i = 2 % 2;
        if (aFa1mSDK.component3 == null) {
            int i2 = AFLogger + 61;
            d = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (AFAdRevenueData()) {
            int i4 = d + 107;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", false);
                return;
            } else {
                AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
                return;
            }
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else {
                int i5 = d + 21;
                AFLogger = i5 % 128;
                if (i5 % 2 != 0) {
                    if (component2()) {
                        AppsFlyerRequestListener appsFlyerRequestListener = aFa1mSDK.getMediationNetwork;
                        if (appsFlyerRequestListener != null) {
                            appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                            int i6 = AFLogger + 11;
                            d = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 3 / 3;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    component2();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            this.component4 = System.currentTimeMillis();
        }
        AFj1jSDK.getRevenue(getCurrencyIso4217Code().getRevenue(), new AFa1zSDK(aFa1mSDK), 0L, TimeUnit.MILLISECONDS);
    }

    private boolean component2() {
        int i = 2 % 2;
        int i2 = d + 123;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        if (this.component4 <= 0) {
            if (isStopped()) {
                return false;
            }
            int i4 = AFLogger + 21;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                AFLogger.afInfoLog("Sending first launch for this session!");
                return false;
            }
            AFLogger.afInfoLog("Sending first launch for this session!");
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.component4;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
        String currencyIso4217Code = getCurrencyIso4217Code(simpleDateFormat, this.component4);
        String currencyIso4217Code2 = getCurrencyIso4217Code(simpleDateFormat, this.component1);
        if (currentTimeMillis < this.hashCode && !isStopped()) {
            AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", currencyIso4217Code, currencyIso4217Code2, Long.valueOf(currentTimeMillis), Long.valueOf(this.hashCode)));
            return true;
        }
        if (isStopped()) {
            return false;
        }
        int i5 = AFLogger + 51;
        d = i5 % 128;
        int i6 = i5 % 2;
        AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", currencyIso4217Code, currencyIso4217Code2, Long.valueOf(currentTimeMillis)));
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        if (getCurrencyIso4217Code().copy().getMediationNetwork(r1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (getCurrencyIso4217Code().copy().getMediationNetwork(r1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        com.appsflyer.internal.AFj1jSDK.getRevenue(getCurrencyIso4217Code().getRevenue(), new com.appsflyer.internal.AFb1rSDK.AFa1zSDK(r5, r1), 5, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getRevenue(String str) {
        int i = 2 % 2;
        AFa1mSDK mediationNetwork = new AFh1kSDK().getMediationNetwork(getCurrencyIso4217Code().getCurrencyIso4217Code().getRevenue.AFAdRevenueData("appsFlyerCount", 0));
        mediationNetwork.areAllFieldsValid = str;
        if (str != null && str.length() > 5) {
            int i2 = d + 77;
            AFLogger = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
        }
        int i4 = d + 81;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    final void getMediationNetwork(AFa1mSDK aFa1mSDK) {
        String mediationNetwork;
        long j;
        AFj1qSDK[] areAllFieldsValid2;
        int length;
        int i = 2 % 2;
        Context context = getCurrencyIso4217Code().AFInAppEventParameterName().getCurrencyIso4217Code;
        if (context != null) {
            String str = getCurrencyIso4217Code().AFInAppEventType().component2;
            AppsFlyerRequestListener appsFlyerRequestListener = aFa1mSDK.getMediationNetwork;
            if (str != null) {
                int i2 = d + 105;
                AFLogger = i2 % 128;
                int i3 = i2 % 2;
                if (str.length() != 0) {
                    AFd1pSDK currencyIso4217Code = getCurrencyIso4217Code(context);
                    AppsFlyerProperties.getInstance().saveProperties(currencyIso4217Code);
                    if (!getCurrencyIso4217Code().AFInAppEventType().getRevenue()) {
                        StringBuilder sb = new StringBuilder("sendWithEvent from activity: ");
                        sb.append(context.getClass().getName());
                        AFLogger.afInfoLog(sb.toString());
                    }
                    boolean currencyIso4217Code2 = aFa1mSDK.getCurrencyIso4217Code();
                    Map<String, ?> currencyIso4217Code3 = getCurrencyIso4217Code(aFa1mSDK);
                    if (!isStopped()) {
                        AFLogger.afInfoLog("AppsFlyerLib.sendWithEvent");
                    }
                    int i4 = 0;
                    int revenue = getRevenue(currencyIso4217Code, false);
                    AFj1iSDK aFj1iSDK = new AFj1iSDK(getCurrencyIso4217Code().getCurrencyIso4217Code());
                    Intrinsics.checkNotNullParameter(aFa1mSDK, "");
                    boolean currencyIso4217Code4 = aFa1mSDK.getCurrencyIso4217Code();
                    boolean z = aFa1mSDK instanceof AFh1lSDK;
                    boolean z2 = aFa1mSDK instanceof AFh1kSDK;
                    if ((aFa1mSDK instanceof AFh1mSDK) || z2) {
                        mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.getCurrencyIso4217Code);
                    } else if (z) {
                        mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.getRevenue);
                    } else if (currencyIso4217Code4) {
                        if (aFj1iSDK.AFAdRevenueData.getRevenue.AFAdRevenueData("appsFlyerCount", 0) < 2) {
                            int i5 = AFLogger + 113;
                            d = i5 % 128;
                            if (i5 % 2 != 0) {
                                mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.getMediationNetwork);
                                int i6 = 95 / 0;
                            } else {
                                mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.getMediationNetwork);
                            }
                        } else {
                            mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.component3);
                        }
                    } else {
                        mediationNetwork = aFj1iSDK.getMediationNetwork.getMediationNetwork(AFj1iSDK.component2);
                    }
                    String monetizationNetwork = aFj1iSDK.getMonetizationNetwork(AFj1iSDK.AFAdRevenueData(aFj1iSDK.getCurrencyIso4217Code(mediationNetwork), z));
                    getMonetizationNetwork(currencyIso4217Code3);
                    AFc1sSDK aFc1sSDK = new AFc1sSDK(getCurrencyIso4217Code(), aFa1mSDK.getMonetizationNetwork(monetizationNetwork).getRevenue(currencyIso4217Code3).getMediationNetwork(revenue), getCurrencyIso4217Code().AFLogger().AFAdRevenueData());
                    if (currencyIso4217Code2) {
                        int i7 = AFLogger + 107;
                        d = i7 % 128;
                        if (i7 % 2 != 0) {
                            areAllFieldsValid2 = areAllFieldsValid();
                            length = areAllFieldsValid2.length;
                        } else {
                            areAllFieldsValid2 = areAllFieldsValid();
                            length = areAllFieldsValid2.length;
                        }
                        int i8 = 0;
                        while (i4 < length) {
                            AFj1qSDK aFj1qSDK = areAllFieldsValid2[i4];
                            if (aFj1qSDK.component2 == AFj1qSDK.AFa1vSDK.STARTED) {
                                StringBuilder sb2 = new StringBuilder("Failed to get ");
                                sb2.append(aFj1qSDK.component3);
                                sb2.append(" referrer, wait ...");
                                AFLogger.afDebugLog(sb2.toString());
                                int i9 = d + 93;
                                AFLogger = i9 % 128;
                                int i10 = i9 % 2;
                                i8 = 1;
                            }
                            i4++;
                        }
                        if (getCurrencyIso4217Code().AFLogger().getMonetizationNetwork()) {
                            AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                            i4 = 1;
                        } else {
                            i4 = i8;
                        }
                        if (getCurrencyIso4217Code().AFInAppEventType().getMediationNetwork()) {
                            i4 = 1;
                        }
                    }
                    ScheduledExecutorService revenue2 = getCurrencyIso4217Code().getRevenue();
                    if (i4 != 0) {
                        int i11 = d + 9;
                        AFLogger = i11 % 128;
                        int i12 = i11 % 2;
                        j = 500;
                    } else {
                        j = 0;
                    }
                    AFj1jSDK.getRevenue(revenue2, aFc1sSDK, j, TimeUnit.MILLISECONDS);
                    return;
                }
            }
            AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
            AFLogger.afInfoLog("AppsFlyer will not track this event.");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        int i13 = AFLogger + 7;
        d = i13 % 128;
        if (i13 % 2 == 0) {
            AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
            return;
        }
        AFLogger.afDebugLog("sendWithEvent - got null context. skipping event/launch.");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void getMonetizationNetwork(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = d + 35;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, true)) {
                return;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return;
        }
        int i3 = AFLogger + 75;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (map.get("advertiserId") != null) {
            try {
                if (AFc1rSDK.getMediationNetwork(getCurrencyIso4217Code().e().getMediationNetwork) && map.remove("android_id") != null) {
                    int i5 = d + 115;
                    AFLogger = i5 % 128;
                    int i6 = i5 % 2;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (!AFc1rSDK.getMediationNetwork(getCurrencyIso4217Code().AFInAppEventType().areAllFieldsValid) || map.remove("imei") == null) {
                    return;
                }
                int i7 = AFLogger + 87;
                d = i7 % 128;
                int i8 = i7 % 2;
                AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
            } catch (Exception e) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String component2(Context context) {
        int i = 2 % 2;
        int i2 = d + 35;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        String attributionId = getAttributionId(context);
        int i4 = d + 79;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
        return attributionId;
    }

    final Map<String, Object> getCurrencyIso4217Code(AFa1mSDK aFa1mSDK) {
        int i = 2 % 2;
        final Context context = getCurrencyIso4217Code().AFInAppEventParameterName().getCurrencyIso4217Code;
        AFd1pSDK currencyIso4217Code = getCurrencyIso4217Code(context);
        AFg1iSDK component2 = getCurrencyIso4217Code().component2();
        boolean currencyIso4217Code2 = aFa1mSDK.getCurrencyIso4217Code();
        Map<String, Object> map = aFa1mSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, 128 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        boolean z = false;
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (isStopped()) {
                AFLogger.afInfoLog("Reporting has been stopped");
                int i2 = d + 117;
                AFLogger = i2 % 128;
                int i3 = i2 % 2;
            } else {
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                sb.append(currencyIso4217Code2 ? "Launch" : aFa1mSDK.component3);
                AFLogger.afInfoLog(sb.toString());
            }
            areAllFieldsValid(context);
            component2.getMonetizationNetwork(map, isPreInstalledApp(context), new Function0() { // from class: com.appsflyer.internal.AFb1rSDK$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String component22;
                    component22 = AFb1rSDK.this.component2(context);
                    return component22;
                }
            });
            int revenue = getRevenue(currencyIso4217Code, currencyIso4217Code2);
            if (aFa1mSDK.component3 != null) {
                int i4 = d + 75;
                AFLogger = i4 % 128;
                if (i4 % 2 != 0) {
                    z = true;
                }
            }
            int AFAdRevenueData2 = AFAdRevenueData(currencyIso4217Code, z);
            if (currencyIso4217Code2 && revenue == 1) {
                int i5 = d + 7;
                AFLogger = i5 % 128;
                int i6 = i5 % 2;
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            component2.getRevenue(map, revenue, AFAdRevenueData2);
            return map;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getLocalizedMessage(), th, true);
            return map;
        }
    }

    private static void areAllFieldsValid(Context context) {
        int i = 2 % 2;
        try {
            List asList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!asList.contains("android.permission.INTERNET")) {
                int i2 = d + 35;
                AFLogger = i2 % 128;
                int i3 = i2 % 2;
                AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                int i4 = d + 43;
                AFLogger = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!asList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                int i6 = AFLogger + 105;
                d = i6 % 128;
                int i7 = i6 % 2;
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i8 = d + 67;
                AFLogger = i8 % 128;
                int i9 = i8 % 2;
                if (asList.contains("com.google.android.gms.permission.AD_ID")) {
                    return;
                }
                int i10 = d + 33;
                AFLogger = i10 % 128;
                if (i10 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                } else {
                    AFLogger.INSTANCE.w(AFh1xSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    throw null;
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    public static Map<String, Object> getRevenue(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = d + 47;
        AFLogger = i2 % 128;
        int i3 = i2 % 2;
        if (map.containsKey("meta")) {
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        int i4 = AFLogger + 103;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 % 4;
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r5 = r4.getString("af");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r6 = com.appsflyer.internal.AFb1rSDK.d + 43;
        com.appsflyer.internal.AFb1rSDK.AFLogger = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if ((r6 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1xSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(java.lang.String.valueOf(r5)));
        r4.remove("af");
        r9.setIntent(r3.putExtras(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.w(com.appsflyer.internal.AFh1xSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(java.lang.String.valueOf(r5)));
        r4.remove("af");
        r9.setIntent(r3.putExtras(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.e(com.appsflyer.internal.AFh1xSDK.ENGAGEMENT, r9.getMessage(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r3 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r3 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r4 = r3.getExtras();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r4 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMonetizationNetwork(Activity activity) {
        Intent intent;
        int i = 2 % 2;
        int i2 = d + 35;
        int i3 = i2 % 128;
        AFLogger = i3;
        int i4 = i2 % 2;
        String str = null;
        if (activity != null) {
            int i5 = i3 + 111;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                intent = activity.getIntent();
                int i6 = 64 / 0;
            } else {
                intent = activity.getIntent();
            }
        }
        return str;
    }

    public static boolean AFAdRevenueData(Context context) {
        int i = 2 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i2 = AFLogger;
                int i3 = i2 + 113;
                d = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 41;
                d = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFh1xSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        getRevenue(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        return getCurrencyIso4217Code().getCurrencyIso4217Code().getMonetizationNetwork(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 75;
        com.appsflyer.internal.AFb1rSDK.AFLogger = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getMonetizationNetwork(Context context, String str) {
        int i = 2 % 2;
        int i2 = AFLogger + 75;
        int i3 = i2 % 128;
        d = i3;
        if (i2 % 2 != 0) {
            int i4 = 95 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        int i = 2 % 2;
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            int i2 = AFLogger + 47;
            d = i2 % 128;
            int i3 = i2 % 2;
            jSONObject.put("c", str2);
        }
        if (str3 != null) {
            int i4 = d + 17;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                jSONObject.put("af_siteid", str3);
                int i5 = 5 / 0;
            } else {
                jSONObject.put("af_siteid", str3);
            }
        }
        if (jSONObject.has("pid")) {
            getRevenue("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        int i6 = d + 79;
        AFLogger = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
    }

    private static void getMediationNetwork(String str) {
        int i = 2 % 2;
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                return;
            }
            int i2 = d + 21;
            AFLogger = i2 % 128;
            int i3 = i2 % 2;
            getRevenue("preInstallName", str);
            int i4 = d + 63;
            AFLogger = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    final void component3() {
        int i = 2 % 2;
        int i2 = AFLogger + 59;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            AFf1qSDK.component1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (AFf1qSDK.component1()) {
            return;
        }
        AFd1kSDK currencyIso4217Code = getCurrencyIso4217Code();
        AFf1zSDK copydefault = currencyIso4217Code.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(new AFf1qSDK(currencyIso4217Code)));
        int i3 = d + 43;
        AFLogger = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 93;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
            return true;
        }
        int i4 = AFLogger + 39;
        d = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i = 2 % 2;
        try {
            String revenue = new AFb1lSDK(context, getCurrencyIso4217Code()).getRevenue();
            int i2 = AFLogger + 123;
            d = i2 % 128;
            int i3 = i2 % 2;
            return revenue;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.os.StrictMode$ThreadPolicy] */
    public static synchronized SharedPreferences h_(Context context) {
        SharedPreferences sharedPreferences;
        AFb1rSDK revenue;
        SharedPreferences sharedPreferences2;
        synchronized (AFb1rSDK.class) {
            int i = 2 % 2;
            if (getRevenue().equals == null) {
                int i2 = AFLogger + 7;
                d = i2 % 128;
                StrictMode.ThreadPolicy threadPolicy = i2 % 2;
                try {
                    if (threadPolicy != 0) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        revenue = getRevenue();
                        sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads;
                    } else {
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        revenue = getRevenue();
                        sharedPreferences2 = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                        threadPolicy = allowThreadDiskReads2;
                    }
                    revenue.equals = sharedPreferences2;
                    StrictMode.setThreadPolicy(threadPolicy);
                    int i3 = AFLogger + 17;
                    d = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
            }
            sharedPreferences = getRevenue().equals;
        }
        return sharedPreferences;
    }

    public final AFd1pSDK getCurrencyIso4217Code(Context context) {
        int i = 2 % 2;
        int i2 = d + 11;
        AFLogger = i2 % 128;
        if (i2 % 2 != 0) {
            getRevenue(context);
            return getCurrencyIso4217Code().getMediationNetwork();
        }
        getRevenue(context);
        getCurrencyIso4217Code().getMediationNetwork();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int getRevenue(AFd1pSDK aFd1pSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 125;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            AFAdRevenueData(aFd1pSDK, "appsFlyerCount", z);
            throw null;
        }
        int AFAdRevenueData2 = AFAdRevenueData(aFd1pSDK, "appsFlyerCount", z);
        int i3 = AFLogger + 33;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return AFAdRevenueData2;
        }
        throw null;
    }

    private static int AFAdRevenueData(AFd1pSDK aFd1pSDK, boolean z) {
        int i = 2 % 2;
        int i2 = AFLogger + 99;
        d = i2 % 128;
        int i3 = i2 % 2;
        int AFAdRevenueData2 = AFAdRevenueData(aFd1pSDK, "appsFlyerInAppEventCount", z);
        int i4 = AFLogger + 49;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            return AFAdRevenueData2;
        }
        throw null;
    }

    private static int AFAdRevenueData(AFd1pSDK aFd1pSDK, String str, boolean z) {
        int i = 2 % 2;
        int AFAdRevenueData2 = aFd1pSDK.AFAdRevenueData(str, 0);
        if (z) {
            int i2 = AFLogger + 15;
            d = i2 % 128;
            int i3 = i2 % 2;
            AFAdRevenueData2++;
            aFd1pSDK.getRevenue(str, AFAdRevenueData2);
        }
        int i4 = d + 109;
        AFLogger = i4 % 128;
        int i5 = i4 % 2;
        return AFAdRevenueData2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        int i = 2 % 2;
        int i2 = AFLogger + 19;
        d = i2 % 128;
        int i3 = i2 % 2;
        getCurrencyIso4217Code().equals().getMediationNetwork("getAppsFlyerUID", new String[0]);
        if (context != null) {
            getRevenue(context);
            AFd1rSDK currencyIso4217Code = getCurrencyIso4217Code().getCurrencyIso4217Code();
            return AFb1mSDK.getMediationNetwork(currencyIso4217Code.getMonetizationNetwork, currencyIso4217Code.getRevenue);
        }
        int i4 = AFLogger + 91;
        d = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r18 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r18 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        r4 = r18.toString();
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AFb1aSDK equals;
        String[] strArr;
        String str6;
        int i = 2 % 2;
        int i2 = AFLogger + 119;
        d = i2 % 128;
        char c = 5;
        if (i2 % 2 != 0) {
            equals = getCurrencyIso4217Code().equals();
            strArr = new String[26];
            strArr[0] = str;
            strArr[0] = str2;
            strArr[5] = str3;
            strArr[5] = str4;
            strArr[3] = str5;
            c = 2;
        } else {
            equals = getCurrencyIso4217Code().equals();
            strArr = new String[6];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = str3;
            strArr[3] = str4;
            strArr[4] = str5;
        }
        strArr[c] = str6;
        equals.getMediationNetwork("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1xSDK aFh1xSDK = AFh1xSDK.PURCHASE_VALIDATION;
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            aFLogger.i(aFh1xSDK, sb.toString());
            int i3 = d + 39;
            AFLogger = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 3;
            }
        }
        if (str != null) {
            int i5 = AFLogger + 55;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (str4 != null && str2 != null && str5 != null && str3 != null) {
                new Thread(new AFb1ySDK(context.getApplicationContext(), getCurrencyIso4217Code().AFInAppEventType().component2, getCurrencyIso4217Code().getCurrencyIso4217Code(), str, str2, str3, str4, str5, map)).start();
                return;
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getMonetizationNetwork;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i6 = AFLogger + 115;
            d = i6 % 128;
            int i7 = i6 % 2;
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        int i = 2 % 2;
        int i2 = AFLogger + 45;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getCurrencyIso4217Code().AFInAppEventType().getRevenue();
            throw null;
        }
        boolean revenue = getCurrencyIso4217Code().AFInAppEventType().getRevenue();
        int i3 = AFLogger + 45;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            return revenue;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        int i = 2 % 2;
        int i2 = AFLogger + 7;
        d = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
            getCurrencyIso4217Code().equals().getMediationNetwork("log", String.valueOf(z));
            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
            if (!z) {
                int i3 = AFLogger + 115;
                d = i3 % 128;
                if (i3 % 2 == 0) {
                    getCurrencyIso4217Code().w().getMonetizationNetwork();
                    return;
                } else {
                    getCurrencyIso4217Code().w().getMonetizationNetwork();
                    obj.hashCode();
                    throw null;
                }
            }
            getCurrencyIso4217Code().w().component2();
            return;
        }
        logLevel.getLevel();
        AFLogger.LogLevel.NONE.getLevel();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String str3;
        int i = 2 % 2;
        if (AFc1rSDK.getMonetizationNetwork(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i2 = d;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        AFLogger = i4;
        int i5 = i3 % 2;
        if (str != null) {
            int i6 = i4 + 125;
            d = i6 % 128;
            int i7 = i6 % 2;
            str3 = str.trim();
        } else {
            int i8 = i2 + 29;
            AFLogger = i8 % 128;
            int i9 = i8 % 2;
            str3 = "";
        }
        AFe1gSDK.getRevenue(new AFe1jSDK(str3, str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i = 2 % 2;
        int i2 = AFLogger + 125;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFe1gSDK values2 = getCurrencyIso4217Code().values();
        if (i3 == 0) {
            return values2.getCurrencyIso4217Code();
        }
        values2.getCurrencyIso4217Code();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i = 2 % 2;
        int i2 = AFLogger + 1;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            getCurrencyIso4217Code().values().getMonetizationNetwork();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String monetizationNetwork = getCurrencyIso4217Code().values().getMonetizationNetwork();
        int i3 = AFLogger + 91;
        d = i3 % 128;
        int i4 = i3 % 2;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = 2 % 2;
        int i3 = AFLogger + 15;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            this.hashCode = TimeUnit.SECONDS.toMillis(i);
        } else {
            this.hashCode = TimeUnit.SECONDS.toMillis(i);
            throw null;
        }
    }

    private AFj1qSDK[] areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = AFLogger + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFj1qSDK[] AFAdRevenueData2 = getCurrencyIso4217Code().copy().AFAdRevenueData();
        int i4 = AFLogger + 81;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return AFAdRevenueData2;
    }

    class AFa1zSDK implements Runnable {
        private final AFa1mSDK AFAdRevenueData;

        AFa1zSDK(AFa1mSDK aFa1mSDK) {
            this.AFAdRevenueData = aFa1mSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFb1rSDK.this.getMediationNetwork(this.AFAdRevenueData);
        }
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFb1rSDK aFb1rSDK = (AFb1rSDK) objArr[0];
        PluginInfo pluginInfo = (PluginInfo) objArr[1];
        int i = 2 % 2;
        int i2 = AFLogger + 27;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(pluginInfo);
            aFb1rSDK.getCurrencyIso4217Code().valueOf().AFAdRevenueData(pluginInfo);
            int i3 = 89 / 0;
            return null;
        }
        Objects.requireNonNull(pluginInfo);
        aFb1rSDK.getCurrencyIso4217Code().valueOf().AFAdRevenueData(pluginInfo);
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i = 2 % 2;
        int i2 = d + 117;
        AFLogger = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getCurrencyIso4217Code().e().component2 = appsFlyerConsent;
            int i3 = d + 107;
            AFLogger = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        Objects.requireNonNull(appsFlyerConsent);
        getCurrencyIso4217Code().e().component2 = appsFlyerConsent;
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i = 2 % 2;
        AFf1zSDK copydefault = this.copydefault.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(new AFf1oSDK(this.copydefault, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i2 = AFLogger + 97;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void getCurrencyIso4217Code(String str) {
        int i = 2 % 2;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1xSDK aFh1xSDK = AFh1xSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFh1xSDK, sb.toString());
        int i2 = AFLogger + 103;
        d = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void component1() {
        int i = 2 % 2;
        int i2 = AFLogger + 9;
        d = i2 % 128;
        int i3 = i2 % 2;
        AFLogger.INSTANCE.w(AFh1xSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i4 = AFLogger + 37;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    class AFa1vSDK implements AFe1fSDK {
        @Override // com.appsflyer.internal.AFe1fSDK
        public final void getMediationNetwork(AFe1bSDK<?> aFe1bSDK) {
        }

        AFa1vSDK() {
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void AFAdRevenueData(AFe1bSDK<?> aFe1bSDK) {
            if (aFe1bSDK instanceof AFf1fSDK) {
                AFb1rSDK.this.getCurrencyIso4217Code().component4().AFAdRevenueData(((AFf1gSDK) aFe1bSDK).component3.component4);
            }
        }

        @Override // com.appsflyer.internal.AFe1fSDK
        public final void getRevenue(AFe1bSDK<?> aFe1bSDK, AFe1dSDK aFe1dSDK) {
            JSONObject mediationNetwork;
            AFg1mSDK AFAdRevenueData;
            if (aFe1bSDK instanceof AFf1gSDK) {
                AFf1gSDK aFf1gSDK = (AFf1gSDK) aFe1bSDK;
                boolean z = aFe1bSDK instanceof AFf1fSDK;
                if (z && AFAdRevenueData()) {
                    AFf1fSDK aFf1fSDK = (AFf1fSDK) aFe1bSDK;
                    if (aFf1fSDK.getMonetizationNetwork == AFe1dSDK.SUCCESS || aFf1fSDK.getMediationNetwork == 1) {
                        AFh1ySDK aFh1ySDK = new AFh1ySDK(aFf1fSDK, AFb1rSDK.this.getCurrencyIso4217Code().getMediationNetwork());
                        AFf1zSDK copydefault = AFb1rSDK.this.getCurrencyIso4217Code().copydefault();
                        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFh1ySDK));
                    }
                }
                if (aFe1dSDK == AFe1dSDK.SUCCESS) {
                    AFb1rSDK aFb1rSDK = AFb1rSDK.this;
                    aFb1rSDK.getCurrencyIso4217Code(aFb1rSDK.component3).getMonetizationNetwork("sentSuccessfully", "true");
                    if (!(aFe1bSDK instanceof AFf1cSDK) && (AFAdRevenueData = new AFg1lSDK(AFb1rSDK.this.component3).AFAdRevenueData()) != null && AFAdRevenueData.getMonetizationNetwork()) {
                        String str = AFAdRevenueData.getRevenue;
                        AFLogger.INSTANCE.d(AFh1xSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFg1lSDK.getCurrencyIso4217Code(str);
                    }
                    ResponseNetwork responseNetwork = ((AFf1pSDK) aFf1gSDK).areAllFieldsValid;
                    if (responseNetwork != null && (mediationNetwork = AFc1uSDK.getMediationNetwork((String) responseNetwork.getBody())) != null) {
                        AFb1rSDK.this.component2 = mediationNetwork.optBoolean("send_background", false);
                    }
                    if (z) {
                        AFb1rSDK.this.component1 = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(aFe1bSDK instanceof AFh1ySDK) || aFe1dSDK == AFe1dSDK.SUCCESS) {
                return;
            }
            AFh1zSDK aFh1zSDK = new AFh1zSDK(AFb1rSDK.this.getCurrencyIso4217Code());
            AFf1zSDK copydefault2 = AFb1rSDK.this.getCurrencyIso4217Code().copydefault();
            copydefault2.getRevenue.execute(copydefault2.new AnonymousClass3(aFh1zSDK));
        }

        private boolean AFAdRevenueData() {
            return AFb1rSDK.this.getRevenue != null;
        }
    }

    static void component4() {
        AFKeystoreWrapper = new char[]{34857, 34860, 34859, 34878, 34865, 34869, 34861, 34879, 34874};
        AFInAppEventType = -272398262;
        values = true;
        valueOf = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        getRevenue(new Object[]{this, pluginInfo}, 1301661614, -1301661608, System.identityHashCode(this));
    }

    public static String getMonetizationNetwork(AFd1pSDK aFd1pSDK, String str) {
        return (String) getRevenue(new Object[]{aFd1pSDK, str}, 983289703, -983289699, (int) System.currentTimeMillis());
    }

    final void getMonetizationNetwork(AFa1mSDK aFa1mSDK, AFh1jSDK aFh1jSDK) {
        getRevenue(new Object[]{this, aFa1mSDK, aFh1jSDK}, 1333283554, -1333283541, System.identityHashCode(this));
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, context, str, map}, 792609668, -792609665, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        getRevenue(new Object[]{this, aFAdRevenueData, map}, 1987114224, -1987114213, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        getRevenue(new Object[]{this, context, str, map, appsFlyerRequestListener}, -137295278, 137295296, System.identityHashCode(this));
    }

    public static String getMediationNetwork() {
        return (String) getRevenue(new Object[0], 510568030, -510568022, (int) System.currentTimeMillis());
    }

    private static void getMediationNetwork(Context context) {
        getRevenue(new Object[]{context}, 1305505597, -1305505583, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        getRevenue(new Object[]{this, context, str, appsFlyerRequestListener}, -1748763395, 1748763415, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        getRevenue(new Object[]{this, context}, -435213279, 435213301, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -1386095178, 1386095197, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, -1986104194, 1986104199, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        getRevenue(new Object[]{this, str}, 707678948, -707678936, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        return (String) getRevenue(new Object[]{this, context}, 1245072228, -1245072227, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        getRevenue(new Object[]{this, str}, 1106684981, -1106684979, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        getRevenue(new Object[]{this, str}, 1942330875, -1942330858, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        getRevenue(new Object[]{this, str}, -101172623, 101172638, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        getRevenue(new Object[]{this, Boolean.valueOf(z), context}, 1671169275, -1671169268, System.identityHashCode(this));
    }

    final void getCurrencyIso4217Code(Context context, String str) {
        getRevenue(new Object[]{this, context, str}, -1996805506, 1996805527, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        getRevenue(new Object[]{this, Boolean.valueOf(z)}, 667671800, -667671790, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(Intent intent, Context context) {
        getRevenue(new Object[]{this, intent, context}, 1062261262, -1062261246, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        getRevenue(new Object[]{this, deepLinkListener, Long.valueOf(j)}, 502105246, -502105246, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -2009374388, 2009374397, System.identityHashCode(this));
    }
}
