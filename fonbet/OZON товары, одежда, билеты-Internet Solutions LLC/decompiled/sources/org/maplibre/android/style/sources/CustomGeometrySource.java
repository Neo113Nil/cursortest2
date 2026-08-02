package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002%&J$\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0083 ¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0083 ¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0083 ¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001c\u0010\u0017J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0003¢\u0006\u0004\b \u0010\u001fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006H\u0085 ¢\u0006\u0004\b$\u0010\u001f¨\u0006'"}, d2 = {"Lorg/maplibre/android/style/sources/CustomGeometrySource;", "Lorg/maplibre/android/style/sources/Source;", "", "sourceId", "", "options", "", "initialize", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "filter", "Lorg/maplibre/geojson/Feature;", "querySourceFeatures", "([Ljava/lang/Object;)[Lorg/maplibre/geojson/Feature;", "", "z", "x", "y", "Lorg/maplibre/geojson/FeatureCollection;", "data", "nativeSetTileData", "(IIILorg/maplibre/geojson/FeatureCollection;)V", "nativeInvalidateTile", "(III)V", "Lorg/maplibre/android/geometry/LatLngBounds;", "bounds", "nativeInvalidateBounds", "(Lorg/maplibre/android/geometry/LatLngBounds;)V", "fetchTile", "cancelTile", "startThreads", "()V", "releaseThreads", "", "isCancelled", "(III)Z", "finalize", "b", "a", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomGeometrySource extends Source {

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f79987a;

        public a(@NotNull b id2, CustomGeometrySource customGeometrySource, AtomicBoolean atomicBoolean) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f79987a = id2;
            new WeakReference(customGeometrySource);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !a.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f79987a, ((a) obj).f79987a);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intrinsics.f(null);
            throw null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f79988a;

        /* renamed from: b, reason: collision with root package name */
        private int f79989b;

        /* renamed from: c, reason: collision with root package name */
        private int f79990c;

        public b(int i11, int i12, int i13) {
            this.f79988a = i11;
            this.f79989b = i12;
            this.f79990c = i13;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass()) && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f79988a == bVar.f79988a && this.f79989b == bVar.f79989b && this.f79990c == bVar.f79990c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new int[]{this.f79988a, this.f79989b, this.f79990c});
        }
    }

    static {
        new AtomicInteger();
    }

    @Keep
    private final void cancelTile(int z11, int x11, int y11) {
        throw null;
    }

    @Keep
    private final void fetchTile(int z11, int x11, int y11) {
        new a(new b(z11, x11, y11), this, new AtomicBoolean(false));
        throw null;
    }

    @Keep
    private final native void initialize(String sourceId, Object options);

    @Keep
    private final boolean isCancelled(int z11, int x11, int y11) {
        throw null;
    }

    @Keep
    private final native void nativeInvalidateBounds(LatLngBounds bounds);

    @Keep
    private final native void nativeInvalidateTile(int z11, int x11, int y11);

    @Keep
    private final native void nativeSetTileData(int z11, int x11, int y11, FeatureCollection data);

    @Keep
    private final native Feature[] querySourceFeatures(Object[] filter);

    @Keep
    private final void releaseThreads() {
        throw null;
    }

    @Keep
    private final void startThreads() {
        throw null;
    }

    @Keep
    protected final native void finalize() throws Throwable;
}
