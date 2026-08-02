package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import xsna.zcl;

/* compiled from: AndroidStorageManager.kt */
/* loaded from: classes14.dex */
public final class AndroidStorageManager implements StorageManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    /* compiled from: AndroidStorageManager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(StorageManager.StorageType storageType, String str) {
        com.unity3d.services.core.device.StorageManager.addStorageLocation(storageType, str);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public Storage getStorage(StorageManager.StorageType storageType) {
        return com.unity3d.services.core.device.StorageManager.getStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(StorageManager.StorageType storageType) {
        return com.unity3d.services.core.device.StorageManager.hasStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(Context context) {
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(StorageManager.StorageType storageType) {
        com.unity3d.services.core.device.StorageManager.initStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(StorageManager.StorageType storageType) {
        com.unity3d.services.core.device.StorageManager.removeStorage(storageType);
    }
}
