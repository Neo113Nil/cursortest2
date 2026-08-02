package org.maplibre.android.offline;

import Le0.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.utils.c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u000689:;<=J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u0085 ¢\u0006\u0004\b\u000b\u0010\fJF\u0010\u0015\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0083 ¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020 H\u0083 ¢\u0006\u0004\b!\u0010\"J0\u0010'\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020&H\u0083 ¢\u0006\u0004\b'\u0010(J(\u0010+\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020*H\u0083 ¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010-H\u0083 ¢\u0006\u0004\b.\u0010/J\u001a\u00100\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010-H\u0083 ¢\u0006\u0004\b0\u0010/J\u001a\u00101\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010-H\u0083 ¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010-H\u0083 ¢\u0006\u0004\b2\u0010/J\"\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010-H\u0083 ¢\u0006\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00028\u0002X\u0083D¢\u0006\u0006\n\u0004\b6\u00107¨\u0006>"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager;", "", "", "limit", "", "setOfflineMapboxTileCountLimit", "(J)V", "", "autopack", "runPackDatabaseAutomatically", "(Z)V", "finalize", "()V", "", ImagesContract.URL, "", "data", "modified", "expires", "etag", "mustRevalidate", "putResourceWithUrl", "(Ljava/lang/String;[BJJLjava/lang/String;Z)V", "Lorg/maplibre/android/storage/FileSource;", "fileSource", "initialize", "(Lorg/maplibre/android/storage/FileSource;)V", "Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;", "callback", "listOfflineRegions", "(Lorg/maplibre/android/storage/FileSource;Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;)V", "regionID", "Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "getOfflineRegion", "(Lorg/maplibre/android/storage/FileSource;JLorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;)V", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "definition", "metadata", "Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "createOfflineRegion", "(Lorg/maplibre/android/storage/FileSource;Lorg/maplibre/android/offline/OfflineRegionDefinition;[BLorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;)V", "path", "Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "mergeOfflineRegions", "(Lorg/maplibre/android/storage/FileSource;Ljava/lang/String;Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;)V", "Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "nativeResetDatabase", "(Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;)V", "nativePackDatabase", "nativeInvalidateAmbientCache", "nativeClearAmbientCache", "size", "nativeSetMaximumAmbientCacheSize", "(JLorg/maplibre/android/offline/OfflineManager$FileSourceCallback;)V", "nativePtr", "J", "ListOfflineRegionsCallback", "GetOfflineRegionCallback", "CreateOfflineRegionCallback", "MergeOfflineRegionsCallback", "FileSourceCallback", "a", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OfflineManager {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f79966c = new a();

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static OfflineManager f79967d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileSource f79968a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f79969b = new Handler(Looper.getMainLooper());

    @Keep
    private final long nativePtr;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "", "onCreate", "", "offlineRegion", "Lorg/maplibre/android/offline/OfflineRegion;", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CreateOfflineRegionCallback {
        void onCreate(@NotNull OfflineRegion offlineRegion);

        void onError(@NotNull String error);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "", "onSuccess", "", "onError", "message", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FileSourceCallback {
        void onError(@NotNull String message);

        void onSuccess();
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "", "onRegion", "", "offlineRegion", "Lorg/maplibre/android/offline/OfflineRegion;", "onRegionNotFound", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GetOfflineRegionCallback {
        void onError(@NotNull String error);

        void onRegion(@NotNull OfflineRegion offlineRegion);

        void onRegionNotFound();
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;", "", "onList", "", "offlineRegions", "", "Lorg/maplibre/android/offline/OfflineRegion;", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ListOfflineRegionsCallback {
        void onError(@NotNull String error);

        void onList(OfflineRegion[] offlineRegions);
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "", "onMerge", "", "offlineRegions", "", "Lorg/maplibre/android/offline/OfflineRegion;", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "onError", "error", "", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MergeOfflineRegionsCallback {
        void onError(@NotNull String error);

        void onMerge(OfflineRegion[] offlineRegions);
    }

    public static final class a {
    }

    static {
        org.maplibre.android.a.a();
    }

    public OfflineManager(Context context) {
        Context applicationContext = context.getApplicationContext();
        FileSource b11 = FileSource.b(applicationContext);
        this.f79968a = b11;
        initialize(b11);
        c.a(FileSource.c(applicationContext) + File.separator + "mbgl-cache.db");
    }

    @Keep
    private final native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition definition, byte[] metadata, CreateOfflineRegionCallback callback);

    @Keep
    private final native void getOfflineRegion(FileSource fileSource, long regionID, GetOfflineRegionCallback callback);

    @Keep
    private final native void initialize(FileSource fileSource);

    @Keep
    private final native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback callback);

    @Keep
    private final native void mergeOfflineRegions(FileSource fileSource, String path, MergeOfflineRegionsCallback callback);

    @Keep
    private final native void nativeClearAmbientCache(FileSourceCallback callback);

    @Keep
    private final native void nativeInvalidateAmbientCache(FileSourceCallback callback);

    @Keep
    private final native void nativePackDatabase(FileSourceCallback callback);

    @Keep
    private final native void nativeResetDatabase(FileSourceCallback callback);

    @Keep
    private final native void nativeSetMaximumAmbientCacheSize(long size, FileSourceCallback callback);

    public final void e(long j11, q qVar) {
        this.f79968a.activate();
        nativeSetMaximumAmbientCacheSize(j11, new b(this, qVar));
    }

    @Keep
    protected final native void finalize() throws Throwable;

    @Keep
    public final native void putResourceWithUrl(String url, byte[] data, long modified, long expires, String etag, boolean mustRevalidate);

    @Keep
    public final native void runPackDatabaseAutomatically(boolean autopack);

    @Keep
    public final native void setOfflineMapboxTileCountLimit(long limit);
}
