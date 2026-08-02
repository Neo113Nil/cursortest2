package com.appsflyer.internal;

import com.appsflyer.share.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFa1lSDK;", "", "", "p0", "Lcom/appsflyer/share/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/share/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AFKeystoreWrapper", "Z", "unregisterClient", "d", "Lcom/appsflyer/share/deeplink/DeepLink;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFa1lSDK {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final boolean unregisterClient;

    @Nullable
    public final DeepLink d;

    public /* synthetic */ AFa1lSDK(boolean z, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : deepLink);
    }

    public final boolean equals(@Nullable Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AFa1lSDK)) {
            return false;
        }
        AFa1lSDK aFa1lSDK = (AFa1lSDK) p0;
        return this.unregisterClient == aFa1lSDK.unregisterClient && Intrinsics.c(this.d, aFa1lSDK.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.unregisterClient) * 31;
        DeepLink deepLink = this.d;
        return hashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.unregisterClient + ", deepLink=" + this.d + ")";
    }

    public AFa1lSDK(boolean z, @Nullable DeepLink deepLink) {
        this.unregisterClient = z;
        this.d = deepLink;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFa1lSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
