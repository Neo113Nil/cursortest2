package com.appsflyer.internal;

import Ij.C3261b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\r\u001a\u00020\nX\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0017X\u0097D¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\r\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFe1xSDK;", "Lcom/appsflyer/internal/AFd1oSDK;", "", "AFInAppEventParameterName", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1rSDK;", "AFLogger", "Lcom/appsflyer/internal/AFe1rSDK;", "()Lcom/appsflyer/internal/AFe1rSDK;", "values", "Lcom/appsflyer/internal/AFd1sSDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFd1sSDK;", "valueOf", "", "Z", "()Z", "AFInAppEventType", "()Ljava/lang/String;", "p0", "", "p1", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFd1sSDK;[BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AFe1xSDK extends AFd1oSDK {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public AFd1sSDK valueOf;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    private final AFe1rSDK values;

    /* renamed from: valueOf, reason: from kotlin metadata */
    private final boolean AFInAppEventType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1xSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr) {
        this(aFd1sSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    @NotNull
    /* renamed from: AFInAppEventParameterName, reason: from getter */
    public final AFe1rSDK getValues() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    @NotNull
    public final String AFKeystoreWrapper() {
        AFi1eSDK aFi1eSDK = new AFi1eSDK(this.valueOf, null, 2, null);
        StringBuilder e11 = C3261b.e(aFi1eSDK.AFInAppEventType.AFInAppEventType(AFi1eSDK.registerClient));
        e11.append(aFi1eSDK.AFKeystoreWrapper.AFInAppEventParameterName.valueOf.getPackageName());
        return e11.toString();
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    /* renamed from: valueOf, reason: from getter */
    public final boolean getAFInAppEventType() {
        return this.AFInAppEventType;
    }

    public /* synthetic */ AFe1xSDK(AFd1sSDK aFd1sSDK, byte[] bArr, Map map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, bArr, (i12 & 4) != 0 ? null : map, (i12 & 8) != 0 ? 2000 : i11);
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    @NotNull
    public final String AFInAppEventParameterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: ".concat(String.valueOf(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1xSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull byte[] bArr, Map<String, String> map, int i11) {
        super(bArr, map, i11);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.valueOf = aFd1sSDK;
        this.values = AFe1rSDK.OCTET_STREAM;
    }
}
