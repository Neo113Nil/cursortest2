package com.appsflyer.internal;

import defpackage.bf3;
import defpackage.dmi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFh1dSDK;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFLogger", "Ljava/lang/String;", "registerClient", "Z", "AFKeystoreWrapper", "Ljava/lang/Boolean;", "unregisterClient", "d", "e", com.mbridge.msdk.setting.i.a, "force", "v", "w"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFh1dSDK {

    @Nullable
    public final Boolean AFKeystoreWrapper;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public final String registerClient;

    /* renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String unregisterClient;

    /* renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String i;

    @Nullable
    public final String force;

    /* renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final Boolean v;

    /* renamed from: registerClient, reason: from kotlin metadata */
    public final boolean AFLogger;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @Nullable
    public final Boolean d;

    /* renamed from: v, reason: from kotlin metadata */
    @Nullable
    public final String w;

    public AFh1dSDK(@NotNull String str, boolean z, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool3) {
        str.getClass();
        this.registerClient = str;
        this.AFLogger = z;
        this.AFKeystoreWrapper = bool;
        this.d = bool2;
        this.unregisterClient = str2;
        this.i = str3;
        this.force = str4;
        this.w = str5;
        this.v = bool3;
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFh1dSDK)) {
            return false;
        }
        AFh1dSDK aFh1dSDK = (AFh1dSDK) p0;
        return Intrinsics.c(this.registerClient, aFh1dSDK.registerClient) && this.AFLogger == aFh1dSDK.AFLogger && Intrinsics.c(this.AFKeystoreWrapper, aFh1dSDK.AFKeystoreWrapper) && Intrinsics.c(this.d, aFh1dSDK.d) && Intrinsics.c(this.unregisterClient, aFh1dSDK.unregisterClient) && Intrinsics.c(this.i, aFh1dSDK.i) && Intrinsics.c(this.force, aFh1dSDK.force) && Intrinsics.c(this.w, aFh1dSDK.w) && Intrinsics.c(this.v, aFh1dSDK.v);
    }

    public final int hashCode() {
        int e = dmi.e(this.registerClient.hashCode() * 31, 31, this.AFLogger);
        Boolean bool = this.AFKeystoreWrapper;
        int hashCode = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.unregisterClient;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.force;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.w;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.v;
        return hashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.registerClient;
        boolean z = this.AFLogger;
        Boolean bool = this.AFKeystoreWrapper;
        Boolean bool2 = this.d;
        String str2 = this.unregisterClient;
        String str3 = this.i;
        String str4 = this.force;
        String str5 = this.w;
        Boolean bool3 = this.v;
        StringBuilder sb = new StringBuilder("NetworkTroubleshootingData(networkType=");
        sb.append(str);
        sb.append(", isVpnEnabled=");
        sb.append(z);
        sb.append(", hasInternetCapability=");
        i.q(sb, bool, ", hasValidatedCapability=", bool2, ", dataState=");
        bf3.v(sb, str2, ", vpnUnderlyingTransport=", str3, ", devicePrivateVpnAddress=");
        bf3.v(sb, str4, ", customDnsServerName=", str5, ", customDnsEnabled=");
        sb.append(bool3);
        sb.append(")");
        return sb.toString();
    }
}
