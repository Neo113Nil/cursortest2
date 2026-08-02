package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0012\u0010\n\u001a\u00020\u0006X\u0086\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0011\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "values", "()Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "AFInAppEventParameterName", "I", "valueOf", "Ljava/lang/String;", "AFInAppEventType", "AFKeystoreWrapper", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "AFa1uSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class AFd1fSDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    int values;

    @NotNull
    public final String AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    final String AFInAppEventParameterName;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1fSDK$AFa1uSDK;", "", "", "p0", "", "", "p1", "", "AFInAppEventType", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFd1fSDK;", "AFInAppEventParameterName", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1fSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1fSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AFd1fSDK AFInAppEventParameterName(@NotNull String p02) {
            Intrinsics.checkNotNullParameter(p02, "");
            List<String> m11 = kotlin.text.h.m(p02, new String[]{"\n"}, 0, 6);
            if (m11.size() == 4) {
                String str = null;
                String str2 = null;
                String str3 = null;
                Integer num = null;
                for (String str4 : m11) {
                    if (kotlin.text.h.e0(str4, "label=", false)) {
                        str = AFInAppEventParameterName(str4, "label=");
                    } else if (kotlin.text.h.e0(str4, "hashName=", false)) {
                        str2 = AFInAppEventParameterName(str4, "hashName=");
                    } else if (!kotlin.text.h.e0(str4, "stackTrace=", false)) {
                        if (!kotlin.text.h.e0(str4, "c=", false)) {
                            break;
                        }
                        String substring = str4.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "");
                        num = Integer.valueOf(Integer.parseInt(kotlin.text.h.z0(substring).toString()));
                    } else {
                        str3 = AFInAppEventParameterName(str4, "stackTrace=");
                    }
                }
                if (!AFInAppEventType(num, str, str2, str3)) {
                    Intrinsics.f(str);
                    Intrinsics.f(str2);
                    Intrinsics.f(str3);
                    Intrinsics.f(num);
                    return new AFd1fSDK(str, str2, str3, num.intValue());
                }
            }
            return null;
        }

        private static boolean AFInAppEventType(Integer p02, String... p12) {
            boolean z11 = p02 == null;
            int length = p12.length;
            for (int i11 = 0; i11 < 3; i11++) {
                String str = p12[i11];
                z11 = z11 || str == null || str.length() == 0;
            }
            return z11;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFInAppEventParameterName(String str, String str2) {
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            String obj = kotlin.text.h.z0(substring).toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }
    }

    public AFd1fSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFInAppEventType = str;
        this.AFInAppEventParameterName = str2;
        this.valueOf = str3;
        this.values = i11;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFd1fSDK)) {
            return false;
        }
        AFd1fSDK aFd1fSDK = (AFd1fSDK) p02;
        return Intrinsics.d(this.AFInAppEventType, aFd1fSDK.AFInAppEventType) && Intrinsics.d(this.AFInAppEventParameterName, aFd1fSDK.AFInAppEventParameterName) && Intrinsics.d(this.valueOf, aFd1fSDK.valueOf) && this.values == aFd1fSDK.values;
    }

    public final int hashCode() {
        return Integer.hashCode(this.values) + ((this.valueOf.hashCode() + ((this.AFInAppEventParameterName.hashCode() + (this.AFInAppEventType.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFd1fSDK(AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", valueOf=");
        sb2.append(this.valueOf);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(')');
        return sb2.toString();
    }

    @NotNull
    public final JSONObject values() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFInAppEventType);
        jSONObject.put("hash_name", this.AFInAppEventParameterName);
        jSONObject.put("st", this.valueOf);
        jSONObject.put("c", String.valueOf(this.values));
        return jSONObject;
    }

    public /* synthetic */ AFd1fSDK(String str, String str2, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? 1 : i11);
    }
}
