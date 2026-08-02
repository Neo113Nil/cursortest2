package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Span;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Panorama implements Serializable {
    private Direction direction;

    /* renamed from: id, reason: collision with root package name */
    private String f60742id;
    private Point point;
    private Span span;

    public Panorama(@NonNull String str, @NonNull Direction direction, @NonNull Span span, @NonNull Point point) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (direction == null) {
            throw new IllegalArgumentException("Required field \"direction\" cannot be null");
        }
        if (span == null) {
            throw new IllegalArgumentException("Required field \"span\" cannot be null");
        }
        if (point == null) {
            throw new IllegalArgumentException("Required field \"point\" cannot be null");
        }
        this.f60742id = str;
        this.direction = direction;
        this.span = span;
        this.point = point;
    }

    @NonNull
    public Direction getDirection() {
        return this.direction;
    }

    @NonNull
    public String getId() {
        return this.f60742id;
    }

    @NonNull
    public Point getPoint() {
        return this.point;
    }

    @NonNull
    public Span getSpan() {
        return this.span;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60742id = archive.add(this.f60742id, false);
        this.direction = (Direction) archive.add((Archive) this.direction, false, (Class<Archive>) Direction.class);
        this.span = (Span) archive.add((Archive) this.span, false, (Class<Archive>) Span.class);
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
    }

    public Panorama() {
    }
}
