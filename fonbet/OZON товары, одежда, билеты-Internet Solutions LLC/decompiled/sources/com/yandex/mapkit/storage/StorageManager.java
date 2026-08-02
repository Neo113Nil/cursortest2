package com.yandex.mapkit.storage;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface StorageManager {

    public interface ClearListener {
        void onClearCompleted();
    }

    public interface SizeListener {
        void onError(@NonNull Error error);

        void onSuccess(Long l11);
    }

    void addStorageErrorListener(@NonNull StorageErrorListener storageErrorListener);

    void clear(@NonNull ClearListener clearListener);

    void computeSize(@NonNull SizeListener sizeListener);

    boolean isValid();

    void maxTileStorageSize(@NonNull SizeListener sizeListener);

    void removeStorageErrorListener(@NonNull StorageErrorListener storageErrorListener);

    void resetMaxTileStorageSize(@NonNull SizeListener sizeListener);

    void setMaxTileStorageSize(long j11, @NonNull SizeListener sizeListener);
}
