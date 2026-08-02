package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFd1uSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFc1hSDK;[BLjava/util/Map;I)V", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFc1hSDK;", "AFKeystoreWrapper", "", "registerClient", "Z", "unregisterClient", "()Z", "AFLogger", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1pSDK;", com.mbridge.msdk.setting.i.a, "Lcom/appsflyer/internal/AFd1pSDK;", "()Lcom/appsflyer/internal/AFd1pSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1uSDK extends AFc1bSDK {

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AFc1hSDK AFKeystoreWrapper;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AFd1pSDK d;

    /* renamed from: registerClient, reason: from kotlin metadata */
    private final boolean unregisterClient;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFd1uSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull byte[] bArr) {
        this(aFc1hSDK, bArr, null, 0, 12, null);
        aFc1hSDK.getClass();
        bArr.getClass();
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NotNull
    public final String AFLogger() {
        return new AFj1ySDK(this.AFKeystoreWrapper).unregisterClient(String.format(Locale.US, AFj1ySDK.v, AppsFlyerLib.getInstance().getHostPrefix(), AFa1zSDK.d().getHostName()));
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NotNull
    public final String d(@NotNull String str) {
        return i.h(str, "[RD]: ", str);
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    @NotNull
    /* renamed from: registerClient, reason: from getter */
    public final AFd1pSDK getD() {
        return this.d;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    /* renamed from: unregisterClient, reason: from getter */
    public final boolean getUnregisterClient() {
        return this.unregisterClient;
    }

    public /* synthetic */ AFd1uSDK(AFc1hSDK aFc1hSDK, byte[] bArr, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1hSDK, bArr, (i2 & 4) != 0 ? null : map, (i2 & 8) != 0 ? 2000 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1uSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i) {
        super(bArr, map, i);
        aFc1hSDK.getClass();
        bArr.getClass();
        this.AFKeystoreWrapper = aFc1hSDK;
        this.d = AFd1pSDK.OCTET_STREAM;
    }
}
