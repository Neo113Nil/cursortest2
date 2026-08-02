package com.appsflyer.internal;

import defpackage.mz1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/appsflyer/internal/AFd1dSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFd1cSDK;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFd1cSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFKeystoreWrapper", "Ljava/lang/String;", "unregisterClient", "registerClient", "AFLogger", "d", "Lcom/appsflyer/internal/AFd1cSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFd1dSDK {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final String unregisterClient;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AFd1cSDK AFKeystoreWrapper;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @Nullable
    public final String AFLogger;

    public AFd1dSDK(@NotNull String str, @Nullable String str2, @NotNull AFd1cSDK aFd1cSDK) {
        str.getClass();
        aFd1cSDK.getClass();
        this.unregisterClient = str;
        this.AFLogger = str2;
        this.AFKeystoreWrapper = aFd1cSDK;
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFd1dSDK)) {
            return false;
        }
        AFd1dSDK aFd1dSDK = (AFd1dSDK) p0;
        return Intrinsics.c(this.unregisterClient, aFd1dSDK.unregisterClient) && Intrinsics.c(this.AFLogger, aFd1dSDK.AFLogger) && this.AFKeystoreWrapper == aFd1dSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        int hashCode = this.unregisterClient.hashCode() * 31;
        String str = this.AFLogger;
        return this.AFKeystoreWrapper.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.unregisterClient;
        String str2 = this.AFLogger;
        AFd1cSDK aFd1cSDK = this.AFKeystoreWrapper;
        StringBuilder s = mz1.s("HostMeta(name=", str, ", prefix=", str2, ", method=");
        s.append(aFd1cSDK);
        s.append(")");
        return s.toString();
    }
}
