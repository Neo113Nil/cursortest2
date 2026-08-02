package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class WayPoint implements Serializable {
    private NativeObject nativeObject;
    private Point position;
    private boolean position__is_initialized;
    private Point selectedArrivalPoint;
    private boolean selectedArrivalPoint__is_initialized;

    public WayPoint() {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::bicycle::WayPoint";
    }

    private native Point getPosition__Native();

    private native Point getSelectedArrivalPoint__Native();

    private native NativeObject init(Point point, Point point2);

    @NonNull
    public synchronized Point getPosition() {
        try {
            if (!this.position__is_initialized) {
                this.position = getPosition__Native();
                this.position__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.position;
    }

    public synchronized Point getSelectedArrivalPoint() {
        try {
            if (!this.selectedArrivalPoint__is_initialized) {
                this.selectedArrivalPoint = getSelectedArrivalPoint__Native();
                this.selectedArrivalPoint__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.selectedArrivalPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getPosition(), false, (Class<Archive>) Point.class);
            archive.add((Archive) getSelectedArrivalPoint(), true, (Class<Archive>) Point.class);
            return;
        }
        this.position = (Point) archive.add((Archive) this.position, false, (Class<Archive>) Point.class);
        this.position__is_initialized = true;
        Point point = (Point) archive.add((Archive) this.selectedArrivalPoint, true, (Class<Archive>) Point.class);
        this.selectedArrivalPoint = point;
        this.selectedArrivalPoint__is_initialized = true;
        this.nativeObject = init(this.position, point);
    }

    public WayPoint(@NonNull Point point, Point point2) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        if (point != null) {
            this.nativeObject = init(point, point2);
            this.position = point;
            this.position__is_initialized = true;
            this.selectedArrivalPoint = point2;
            this.selectedArrivalPoint__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"position\" cannot be null");
    }

    private WayPoint(NativeObject nativeObject) {
        this.position__is_initialized = false;
        this.selectedArrivalPoint__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
