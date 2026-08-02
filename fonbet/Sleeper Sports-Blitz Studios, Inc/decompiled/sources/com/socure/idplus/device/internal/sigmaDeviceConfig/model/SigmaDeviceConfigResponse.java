package com.socure.idplus.device.internal.sigmaDeviceConfig.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0016\u001a\u00020\u0014J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/SigmaDeviceConfigResponse;", "", "network", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Network;", "behavioral", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Behavioral;", "device", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Device;", "(Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Network;Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Behavioral;Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Device;)V", "getBehavioral", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Behavioral;", "getDevice", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Device;", "getNetwork", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Network;", "component1", "component2", "component3", "copy", "equals", "", "other", "hasValidResponse", "hashCode", "", "isBehaviorEnabled", "isNetworkAnalyzerEnabled", InAppPurchaseConstants.METHOD_TO_STRING, "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SigmaDeviceConfigResponse {

    @SerializedName("behavioral")
    private final Behavioral behavioral;

    @SerializedName("device")
    private final Device device;

    @SerializedName("network")
    private final Network network;

    public SigmaDeviceConfigResponse(Network network, Behavioral behavioral, Device device) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(behavioral, "behavioral");
        Intrinsics.checkNotNullParameter(device, "device");
        this.network = network;
        this.behavioral = behavioral;
        this.device = device;
    }

    public static /* synthetic */ SigmaDeviceConfigResponse copy$default(SigmaDeviceConfigResponse sigmaDeviceConfigResponse, Network network, Behavioral behavioral, Device device, int i, Object obj) {
        if ((i & 1) != 0) {
            network = sigmaDeviceConfigResponse.network;
        }
        if ((i & 2) != 0) {
            behavioral = sigmaDeviceConfigResponse.behavioral;
        }
        if ((i & 4) != 0) {
            device = sigmaDeviceConfigResponse.device;
        }
        return sigmaDeviceConfigResponse.copy(network, behavioral, device);
    }

    /* renamed from: component1, reason: from getter */
    public final Network getNetwork() {
        return this.network;
    }

    /* renamed from: component2, reason: from getter */
    public final Behavioral getBehavioral() {
        return this.behavioral;
    }

    /* renamed from: component3, reason: from getter */
    public final Device getDevice() {
        return this.device;
    }

    public final SigmaDeviceConfigResponse copy(Network network, Behavioral behavioral, Device device) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(behavioral, "behavioral");
        Intrinsics.checkNotNullParameter(device, "device");
        return new SigmaDeviceConfigResponse(network, behavioral, device);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigmaDeviceConfigResponse)) {
            return false;
        }
        SigmaDeviceConfigResponse sigmaDeviceConfigResponse = (SigmaDeviceConfigResponse) other;
        return Intrinsics.areEqual(this.network, sigmaDeviceConfigResponse.network) && Intrinsics.areEqual(this.behavioral, sigmaDeviceConfigResponse.behavioral) && Intrinsics.areEqual(this.device, sigmaDeviceConfigResponse.device);
    }

    public final Behavioral getBehavioral() {
        return this.behavioral;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Network getNetwork() {
        return this.network;
    }

    public final boolean hasValidResponse() {
        return (StringsKt.isBlank(this.device.getHost()) || StringsKt.isBlank(this.behavioral.getHost())) ? false : true;
    }

    public int hashCode() {
        return this.device.hashCode() + ((this.behavioral.hashCode() + (this.network.hashCode() * 31)) * 31);
    }

    public final boolean isBehaviorEnabled() {
        return this.behavioral.getFlags().getEnableBehavior();
    }

    public final boolean isNetworkAnalyzerEnabled() {
        return this.network.getFlags().getEnabled();
    }

    public String toString() {
        return "SigmaDeviceConfigResponse(network=" + this.network + ", behavioral=" + this.behavioral + ", device=" + this.device + ")";
    }
}
