package com.appsflyer.internal;

import android.util.Base64;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getMediationNetwork", "()Lorg/json/JSONObject;", "getMonetizationNetwork", "()Ljava/lang/String;", InAppPurchaseConstants.METHOD_TO_STRING, "getRevenue", "I", "getCurrencyIso4217Code", "Ljava/lang/String;", "AFAdRevenueData", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AFd1jSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public String getMediationNetwork;

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public String getRevenue;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    final String AFAdRevenueData;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    int getCurrencyIso4217Code;

    public AFd1jSDK(String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
        this.getMediationNetwork = str3;
        this.getCurrencyIso4217Code = i;
    }

    public /* synthetic */ AFd1jSDK(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 1 : i);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFd1jSDK$AFa1ySDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getMonetizationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1jSDK;", "getMediationNetwork", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1jSDK;", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1jSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AFd1jSDK getMediationNetwork(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            List<String> split$default = StringsKt.split$default((CharSequence) p0, new String[]{"\n"}, false, 0, 6, (Object) null);
            if (split$default.size() != 4) {
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            for (String str4 : split$default) {
                if (StringsKt.startsWith$default(str4, "label=", false, 2, (Object) null)) {
                    str = getRevenue(str4, "label=");
                } else if (StringsKt.startsWith$default(str4, "hashName=", false, 2, (Object) null)) {
                    str2 = getRevenue(str4, "hashName=");
                } else if (StringsKt.startsWith$default(str4, "stackTrace=", false, 2, (Object) null)) {
                    str3 = getRevenue(str4, "stackTrace=");
                } else {
                    if (!StringsKt.startsWith$default(str4, "c=", false, 2, (Object) null)) {
                        break;
                    }
                    String substring = str4.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    num = Integer.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) substring).toString()));
                }
            }
            if (getMonetizationNetwork(num, str, str2, str3)) {
                return null;
            }
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(str3);
            Intrinsics.checkNotNull(num);
            return new AFd1jSDK(str, str2, str3, num.intValue());
        }

        private static boolean getMonetizationNetwork(Integer p0, String... p1) {
            String str;
            boolean z = p0 == null;
            int length = p1.length;
            for (int i = 0; i < 3; i++) {
                z = z || (str = p1[i]) == null || str.length() == 0;
            }
            return z;
        }

        private static String getRevenue(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = StringsKt.trim((CharSequence) substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            byte[] bytes = obj.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, Charsets.UTF_8);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getMonetizationNetwork() {
        String str = this.getRevenue;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.AFAdRevenueData;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String encodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getMediationNetwork;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + encodeToString + "\nhashName=" + encodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.getCurrencyIso4217Code;
    }

    public final JSONObject getMediationNetwork() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ScionAnalytics.PARAM_LABEL, this.getRevenue);
        jSONObject.put("hash_name", this.AFAdRevenueData);
        jSONObject.put("st", this.getMediationNetwork);
        jSONObject.put("c", String.valueOf(this.getCurrencyIso4217Code));
        return jSONObject;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFd1jSDK)) {
            return false;
        }
        AFd1jSDK aFd1jSDK = (AFd1jSDK) p0;
        return Intrinsics.areEqual(this.getRevenue, aFd1jSDK.getRevenue) && Intrinsics.areEqual(this.AFAdRevenueData, aFd1jSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFd1jSDK.getMediationNetwork) && this.getCurrencyIso4217Code == aFd1jSDK.getCurrencyIso4217Code;
    }

    public final int hashCode() {
        return (((((this.getRevenue.hashCode() * 31) + this.AFAdRevenueData.hashCode()) * 31) + this.getMediationNetwork.hashCode()) * 31) + Integer.hashCode(this.getCurrencyIso4217Code);
    }

    public final String toString() {
        return "ExceptionInfo(label=" + this.getRevenue + ", hashName=" + this.AFAdRevenueData + ", stackTrace=" + this.getMediationNetwork + ", counter=" + this.getCurrencyIso4217Code + ")";
    }
}
