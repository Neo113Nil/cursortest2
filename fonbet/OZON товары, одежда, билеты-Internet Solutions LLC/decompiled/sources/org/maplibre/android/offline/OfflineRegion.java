package org.maplibre.android.offline;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.MapLibre;
import org.maplibre.android.storage.FileSource;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0005()*+,B1\b\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0083 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0018H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001bH\u0083 ¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u001eH\u0083 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020!H\u0083 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rH\u0085 ¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0083D¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion;", "", "", "offlineRegionPtr", "Lorg/maplibre/android/storage/FileSource;", "fileSource", "idParam", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "definition", "", "metadata", "<init>", "(JLorg/maplibre/android/storage/FileSource;JLorg/maplibre/android/offline/OfflineRegionDefinition;[B)V", "", "initialize", "(JLorg/maplibre/android/storage/FileSource;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "callback", "setOfflineRegionObserver", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;)V", "", "offlineRegionDownloadState", "setOfflineRegionDownloadState", "(I)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "getOfflineRegionStatus", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;", "deleteOfflineRegion", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "updateOfflineRegionMetadata", "([BLorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;)V", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "invalidateOfflineRegion", "(Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;)V", "finalize", "()V", "nativePtr", "J", "OfflineRegionObserver", "OfflineRegionStatusCallback", "OfflineRegionDeleteCallback", "OfflineRegionInvalidateCallback", "OfflineRegionUpdateMetadataCallback", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OfflineRegion {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileSource f79970a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final OfflineRegionDefinition f79971b;

    @Keep
    private final long nativePtr;

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;", "", "onDelete", "", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(@NotNull String error);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "", "onInvalidate", "", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionInvalidateCallback {
        void onError(@NotNull String error);

        void onInvalidate();
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "", "onStatusChanged", "", "status", "Lorg/maplibre/android/offline/OfflineRegionStatus;", "onError", "error", "Lorg/maplibre/android/offline/OfflineRegionError;", "mapboxTileCountLimitExceeded", "limit", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long limit);

        void onError(@NotNull OfflineRegionError error);

        void onStatusChanged(@NotNull OfflineRegionStatus status);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "", "onStatus", "", "status", "Lorg/maplibre/android/offline/OfflineRegionStatus;", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionStatusCallback {
        void onError(String error);

        void onStatus(OfflineRegionStatus status);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "", "onUpdate", "", "metadata", "", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(@NotNull String error);

        void onUpdate(@NotNull byte[] metadata);
    }

    static {
        org.maplibre.android.a.a();
    }

    @Keep
    private OfflineRegion(long j11, FileSource fileSource, long j12, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        new Handler(Looper.getMainLooper());
        MapLibre.getApplicationContext();
        this.f79970a = fileSource;
        this.f79971b = offlineRegionDefinition;
        initialize(j11, fileSource);
    }

    @Keep
    private final native void deleteOfflineRegion(OfflineRegionDeleteCallback callback);

    @Keep
    private final native void getOfflineRegionStatus(OfflineRegionStatusCallback callback);

    @Keep
    private final native void initialize(long offlineRegionPtr, FileSource fileSource);

    @Keep
    private final native void invalidateOfflineRegion(OfflineRegionInvalidateCallback callback);

    @Keep
    private final native void setOfflineRegionDownloadState(int offlineRegionDownloadState);

    @Keep
    private final native void setOfflineRegionObserver(OfflineRegionObserver callback);

    @Keep
    private final native void updateOfflineRegionMetadata(byte[] metadata, OfflineRegionUpdateMetadataCallback callback);

    @Keep
    protected final native void finalize();
}
