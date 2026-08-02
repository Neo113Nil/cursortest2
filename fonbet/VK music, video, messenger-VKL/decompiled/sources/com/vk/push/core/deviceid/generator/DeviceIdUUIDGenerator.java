package com.vk.push.core.deviceid.generator;

import com.vk.push.core.deviceid.DeviceIdGenerator;
import java.util.UUID;

/* compiled from: DeviceIdGenerator.kt */
/* loaded from: classes.dex */
public final class DeviceIdUUIDGenerator implements DeviceIdGenerator {
    @Override // com.vk.push.core.deviceid.DeviceIdGenerator
    public String generateDeviceId() {
        return UUID.randomUUID().toString();
    }
}
