package com.yandex.mapkit.storage.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.storage.StorageErrorListener;
import com.yandex.mapkit.storage.StorageManager;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes9.dex */
public class StorageManagerBinding implements StorageManager {
    private final NativeObject nativeObject;
    protected Subscription<StorageErrorListener> storageErrorListenerSubscription = new Subscription<StorageErrorListener>() { // from class: com.yandex.mapkit.storage.internal.StorageManagerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(StorageErrorListener storageErrorListener) {
            return StorageManagerBinding.createStorageErrorListener(storageErrorListener);
        }
    };

    protected StorageManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createStorageErrorListener(StorageErrorListener storageErrorListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void addStorageErrorListener(@NonNull StorageErrorListener storageErrorListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void clear(@NonNull StorageManager.ClearListener clearListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void computeSize(@NonNull StorageManager.SizeListener sizeListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native boolean isValid();

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void maxTileStorageSize(@NonNull StorageManager.SizeListener sizeListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void removeStorageErrorListener(@NonNull StorageErrorListener storageErrorListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void resetMaxTileStorageSize(@NonNull StorageManager.SizeListener sizeListener);

    @Override // com.yandex.mapkit.storage.StorageManager
    public native void setMaxTileStorageSize(long j11, @NonNull StorageManager.SizeListener sizeListener);
}
