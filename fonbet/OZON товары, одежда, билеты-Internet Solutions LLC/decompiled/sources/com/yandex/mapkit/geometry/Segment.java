package com.yandex.mapkit.geometry;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Segment implements Serializable {
    private Point endPoint;
    private Point startPoint;

    public Segment(@NonNull Point point, @NonNull Point point2) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"startPoint\" cannot be null");
        }
        if (point2 == null) {
            throw new IllegalArgumentException("Required field \"endPoint\" cannot be null");
        }
        this.startPoint = point;
        this.endPoint = point2;
    }

    @NonNull
    public Point getEndPoint() {
        return this.endPoint;
    }

    @NonNull
    public Point getStartPoint() {
        return this.startPoint;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.startPoint = (Point) archive.add((Archive) this.startPoint, false, (Class<Archive>) Point.class);
        this.endPoint = (Point) archive.add((Archive) this.endPoint, false, (Class<Archive>) Point.class);
    }

    public Segment() {
    }
}
