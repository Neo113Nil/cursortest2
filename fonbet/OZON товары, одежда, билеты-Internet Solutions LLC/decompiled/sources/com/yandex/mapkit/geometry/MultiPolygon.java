package com.yandex.mapkit.geometry;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class MultiPolygon implements Serializable {
    private NativeObject nativeObject;
    private List<Polygon> polygons;
    private boolean polygons__is_initialized;

    public MultiPolygon() {
        this.polygons__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::MultiPolygon";
    }

    private native List<Polygon> getPolygons__Native();

    private native NativeObject init(List<Polygon> list);

    @NonNull
    public synchronized List<Polygon> getPolygons() {
        try {
            if (!this.polygons__is_initialized) {
                this.polygons = getPolygons__Native();
                this.polygons__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.polygons;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(Polygon.class, archive, getPolygons(), false);
            return;
        }
        List<Polygon> d11 = G.d(Polygon.class, archive, this.polygons, false);
        this.polygons = d11;
        this.polygons__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public MultiPolygon(@NonNull List<Polygon> list) {
        this.polygons__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.polygons = list;
            this.polygons__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"polygons\" cannot be null");
    }

    private MultiPolygon(NativeObject nativeObject) {
        this.polygons__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
