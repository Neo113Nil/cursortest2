package com.yandex.mapkit.geometry;

import B90.C2616s;
import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Polyline implements Serializable {
    private NativeObject nativeObject;
    private List<Point> points;
    private boolean points__is_initialized;

    public Polyline() {
        this.points__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::Polyline";
    }

    private native List<Point> getPoints__Native();

    private native NativeObject init(List<Point> list);

    @NonNull
    public synchronized List<Point> getPoints() {
        try {
            if (!this.points__is_initialized) {
                this.points = getPoints__Native();
                this.points__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.points;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            C2616s.f(Point.class, archive, getPoints(), false);
            return;
        }
        List<Point> d11 = G.d(Point.class, archive, this.points, false);
        this.points = d11;
        this.points__is_initialized = true;
        this.nativeObject = init(d11);
    }

    public Polyline(@NonNull List<Point> list) {
        this.points__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.points = list;
            this.points__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"points\" cannot be null");
    }

    private Polyline(NativeObject nativeObject) {
        this.points__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
