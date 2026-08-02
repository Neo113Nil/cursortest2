package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzctf implements zzcsm {
    public final DeviceTierManager a;

    public zzctf(DeviceTierManager deviceTierManager) {
        this.a = deviceTierManager;
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final void a(JSONObject jSONObject) {
        DeviceTierManager.AdvertisedMemoryTier fromValue;
        DeviceTierManager.AvailableProcessorTier fromValue2;
        DeviceTierManager.AvailableMemoryTier fromValue3;
        boolean has = jSONObject.has("AvailableMemoryTier");
        DeviceTierManager deviceTierManager = this.a;
        if (has && (fromValue3 = DeviceTierManager.AvailableMemoryTier.fromValue(jSONObject.optInt("AvailableMemoryTier", -1))) != null) {
            deviceTierManager.setAvailableMemoryTier(fromValue3);
        }
        if (jSONObject.has("AvailableProcessorTier") && (fromValue2 = DeviceTierManager.AvailableProcessorTier.fromValue(jSONObject.optInt("AvailableProcessorTier", -1))) != null) {
            deviceTierManager.setAvailableProcessorTier(fromValue2);
        }
        if (!jSONObject.has("AdvertisedMemoryTier") || (fromValue = DeviceTierManager.AdvertisedMemoryTier.fromValue(jSONObject.optInt("AdvertisedMemoryTier", -1))) == null) {
            return;
        }
        deviceTierManager.setAdvertisedMemoryTier(fromValue);
    }
}
