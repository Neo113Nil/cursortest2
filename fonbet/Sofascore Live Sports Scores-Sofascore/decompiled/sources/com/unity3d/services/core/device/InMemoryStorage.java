package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/unity3d/services/core/device/InMemoryStorage;", "Lcom/unity3d/services/core/device/Storage;", "<init>", "()V", "readStorage", "", "writeStorage", "clearStorage", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InMemoryStorage extends Storage {
    public InMemoryStorage() {
        super("", StorageManager.StorageType.MEMORY);
    }

    @Override // com.unity3d.services.core.device.Storage
    public synchronized boolean clearStorage() {
        clearData();
        return true;
    }

    @Override // com.unity3d.services.core.device.Storage
    public synchronized boolean readStorage() {
        return true;
    }

    @Override // com.unity3d.services.core.device.Storage
    public synchronized boolean writeStorage() {
        return true;
    }
}
