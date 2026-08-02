package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import io.sentry.protocol.App;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class AFf1jSDK extends AFf1pSDK<Map<String, String>> {
    private final UUID AFInAppEventType;
    public AFa1tSDK component3;
    private final AFe1qSDK copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private String toString;

    public interface AFa1tSDK {
        void getMediationNetwork(Map<String, String> map);

        void getRevenue(String str);
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final long getMediationNetwork() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1jSDK(AFd1kSDK aFd1kSDK, UUID uuid, Uri uri) {
        super(AFf1wSDK.ONELINK, new AFf1wSDK[]{AFf1wSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        boolean z = false;
        this.copy = aFd1kSDK.AFAdRevenueData();
        this.AFInAppEventType = uuid;
        try {
            if (!AFc1rSDK.getMediationNetwork(uri.getHost()) && !AFc1rSDK.getMediationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.d()};
                    Object obj = AFa1vSDK.AFLogger.get(736790175);
                    if (obj == null) {
                        obj = ((Class) AFa1vSDK.AFAdRevenueData((char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionGroup(0L) + 237, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35)).getDeclaredConstructor(Uri.class, AFc1kSDK.class);
                        AFa1vSDK.AFLogger.put(736790175, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = AFa1vSDK.AFLogger.get(-1099281484);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) Color.alpha(0), 237 - Drawable.resolveOpacity(0, 0), Color.alpha(0) + 35)).getMethod("getRevenue", null);
                            AFa1vSDK.AFLogger.put(-1099281484, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = AFa1vSDK.AFLogger.get(-45556509);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1vSDK.AFAdRevenueData((char) (Process.myPid() >> 22), 273 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 50)).getMethod("getMediationNetwork", null);
                                AFa1vSDK.AFLogger.put(-45556509, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = AFa1vSDK.AFLogger.get(491419644);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1vSDK.AFAdRevenueData((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 272 - Color.red(0), 51 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod("getMonetizationNetwork", null);
                                    AFa1vSDK.AFLogger.put(491419644, obj4);
                                }
                                z = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.hashCode = split[1];
                                    this.copydefault = split[2];
                                    this.toString = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.equals = z;
    }

    public final boolean copy() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.copydefault) || this.hashCode.equals(App.TYPE)) ? false : true;
    }

    public final boolean equals() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFf1pSDK, com.appsflyer.internal.AFe1bSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFa1tSDK aFa1tSDK = this.component3;
        if (aFa1tSDK != null) {
            if (this.getMonetizationNetwork == AFe1dSDK.SUCCESS && ((AFf1pSDK) this).areAllFieldsValid != null) {
                aFa1tSDK.getMediationNetwork((Map) ((AFf1pSDK) this).areAllFieldsValid.getBody());
                return;
            }
            Throwable component4 = component4();
            if (component4 instanceof ParsingException) {
                if (((ParsingException) component4).getRawResponse().isSuccessful()) {
                    aFa1tSDK.getRevenue("Can't parse one link data");
                    return;
                } else {
                    String str = this.toString;
                    aFa1tSDK.getRevenue(str != null ? str : "Can't get OneLink data");
                    return;
                }
            }
            String str2 = this.toString;
            aFa1tSDK.getRevenue(str2 != null ? str2 : "Can't get OneLink data");
        }
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    protected final AFe1rSDK<Map<String, String>> getMonetizationNetwork(String str) {
        return this.copy.getRevenue(this.hashCode, this.copydefault, this.AFInAppEventType, str);
    }
}
