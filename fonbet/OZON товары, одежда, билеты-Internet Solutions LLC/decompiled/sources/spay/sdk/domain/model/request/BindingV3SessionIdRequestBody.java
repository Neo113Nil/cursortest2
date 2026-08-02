package spay.sdk.domain.model.request;

import C.o0;
import Lf.a;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lspay/sdk/domain/model/request/BindingV3SessionIdRequestBody;", "", "orderId", "", "bindingId", "deviceInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "getDeviceInfo", "getOrderId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BindingV3SessionIdRequestBody {

    @NotNull
    private final String bindingId;

    @NotNull
    private final String deviceInfo;

    @NotNull
    private final String orderId;

    public BindingV3SessionIdRequestBody(@NotNull String orderId, @NotNull String bindingId, @NotNull String deviceInfo) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.orderId = orderId;
        this.bindingId = bindingId;
        this.deviceInfo = deviceInfo;
    }

    public static /* synthetic */ BindingV3SessionIdRequestBody copy$default(BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bindingV3SessionIdRequestBody.orderId;
        }
        if ((i11 & 2) != 0) {
            str2 = bindingV3SessionIdRequestBody.bindingId;
        }
        if ((i11 & 4) != 0) {
            str3 = bindingV3SessionIdRequestBody.deviceInfo;
        }
        return bindingV3SessionIdRequestBody.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBindingId() {
        return this.bindingId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final BindingV3SessionIdRequestBody copy(@NotNull String orderId, @NotNull String bindingId, @NotNull String deviceInfo) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new BindingV3SessionIdRequestBody(orderId, bindingId, deviceInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingV3SessionIdRequestBody)) {
            return false;
        }
        BindingV3SessionIdRequestBody bindingV3SessionIdRequestBody = (BindingV3SessionIdRequestBody) other;
        return Intrinsics.d(this.orderId, bindingV3SessionIdRequestBody.orderId) && Intrinsics.d(this.bindingId, bindingV3SessionIdRequestBody.bindingId) && Intrinsics.d(this.deviceInfo, bindingV3SessionIdRequestBody.deviceInfo);
    }

    @NotNull
    public final String getBindingId() {
        return this.bindingId;
    }

    @NotNull
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        return this.deviceInfo.hashCode() + a.b0(this.orderId.hashCode() * 31, this.bindingId);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        String str2 = this.bindingId;
        return o0.c(C3660k.d("BindingV3SessionIdRequestBody(orderId=", str, ", bindingId=", str2, ", deviceInfo="), this.deviceInfo, ")");
    }
}
