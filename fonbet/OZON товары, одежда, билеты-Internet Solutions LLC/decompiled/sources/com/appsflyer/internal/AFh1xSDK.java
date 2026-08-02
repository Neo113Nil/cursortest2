package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001e\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFh1xSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "values", "Ljava/lang/String;", "AFInAppEventType", "AFLogger", "valueOf", "Ljava/lang/Boolean;", "AFKeystoreWrapper", "AFInAppEventParameterName", "unregisterClient", "", "registerClient", "Ljava/util/Map;", "e", "d", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFh1xSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public Boolean AFKeystoreWrapper;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public Boolean unregisterClient;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public Boolean AFInAppEventParameterName;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    public String values;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Boolean d;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> e;
    public Boolean valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    public String AFInAppEventType;

    public AFh1xSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFh1xSDK)) {
            return false;
        }
        AFh1xSDK aFh1xSDK = (AFh1xSDK) p02;
        return Intrinsics.d(this.AFInAppEventType, aFh1xSDK.AFInAppEventType) && Intrinsics.d(this.unregisterClient, aFh1xSDK.unregisterClient) && Intrinsics.d(this.valueOf, aFh1xSDK.valueOf) && Intrinsics.d(this.AFInAppEventParameterName, aFh1xSDK.AFInAppEventParameterName) && Intrinsics.d(this.AFKeystoreWrapper, aFh1xSDK.AFKeystoreWrapper) && Intrinsics.d(this.values, aFh1xSDK.values) && Intrinsics.d(this.d, aFh1xSDK.d) && Intrinsics.d(this.e, aFh1xSDK.e);
    }

    public final int hashCode() {
        String str = this.AFInAppEventType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.unregisterClient;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.valueOf;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFInAppEventParameterName;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.AFKeystoreWrapper;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.values;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.d;
        return this.e.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFh1xSDK(AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", unregisterClient=");
        sb2.append(this.unregisterClient);
        sb2.append(", valueOf=");
        sb2.append(this.valueOf);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", d=");
        sb2.append(this.d);
        sb2.append(", e=");
        sb2.append(this.e);
        sb2.append(')');
        return sb2.toString();
    }

    private AFh1xSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AFInAppEventType = str;
        this.unregisterClient = bool;
        this.valueOf = bool2;
        this.AFInAppEventParameterName = bool3;
        this.AFKeystoreWrapper = bool4;
        this.values = str2;
        this.d = bool5;
        this.e = map;
    }

    public /* synthetic */ AFh1xSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : bool3, (i11 & 16) != 0 ? null : bool4, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : bool5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new HashMap() : map);
    }
}
