package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/appsflyer/internal/AFg1cSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "unregisterClient", "Ljava/lang/String;", "d", "Ljava/lang/Boolean;", "AFKeystoreWrapper", "registerClient", "AFLogger", "e", "force", "w", com.mbridge.msdk.setting.i.a, "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFg1cSDK {

    @Nullable
    public Boolean AFKeystoreWrapper;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @Nullable
    public Boolean registerClient;

    /* renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Boolean unregisterClient;

    /* renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String force;

    /* renamed from: force, reason: from kotlin metadata */
    @Nullable
    public Boolean w;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> e;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @Nullable
    public Boolean AFLogger;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @Nullable
    public String d;

    public /* synthetic */ AFg1cSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? new HashMap() : map);
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFg1cSDK)) {
            return false;
        }
        AFg1cSDK aFg1cSDK = (AFg1cSDK) p0;
        return Intrinsics.c(this.d, aFg1cSDK.d) && Intrinsics.c(this.unregisterClient, aFg1cSDK.unregisterClient) && Intrinsics.c(this.AFKeystoreWrapper, aFg1cSDK.AFKeystoreWrapper) && Intrinsics.c(this.AFLogger, aFg1cSDK.AFLogger) && Intrinsics.c(this.registerClient, aFg1cSDK.registerClient) && Intrinsics.c(this.force, aFg1cSDK.force) && Intrinsics.c(this.w, aFg1cSDK.w) && Intrinsics.c(this.e, aFg1cSDK.e);
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.unregisterClient;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFKeystoreWrapper;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFLogger;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.registerClient;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.force;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.w;
        return this.e.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.d;
        Boolean bool = this.unregisterClient;
        Boolean bool2 = this.AFKeystoreWrapper;
        Boolean bool3 = this.AFLogger;
        Boolean bool4 = this.registerClient;
        String str2 = this.force;
        Boolean bool5 = this.w;
        Map<String, Object> map = this.e;
        StringBuilder sb = new StringBuilder("AdvertisingIdData(advertisingId=");
        sb.append(str);
        sb.append(", isLimited=");
        sb.append(bool);
        sb.append(", isEnabled=");
        i.q(sb, bool2, ", isGaidWithGps=", bool3, ", isGaidWithSamsungCloudDev=");
        sb.append(bool4);
        sb.append(", gaidError=");
        sb.append(str2);
        sb.append(", retry=");
        sb.append(bool5);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    private AFg1cSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        map.getClass();
        this.d = str;
        this.unregisterClient = bool;
        this.AFKeystoreWrapper = bool2;
        this.AFLogger = bool3;
        this.registerClient = bool4;
        this.force = str2;
        this.w = bool5;
        this.e = map;
    }

    public AFg1cSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
