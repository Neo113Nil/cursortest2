package com.yandex.mapkit;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ScreenRect implements Serializable {
    private ScreenPoint bottomRight;
    private ScreenPoint topLeft;

    public ScreenRect(@NonNull ScreenPoint screenPoint, @NonNull ScreenPoint screenPoint2) {
        if (screenPoint == null) {
            throw new IllegalArgumentException("Required field \"topLeft\" cannot be null");
        }
        if (screenPoint2 == null) {
            throw new IllegalArgumentException("Required field \"bottomRight\" cannot be null");
        }
        this.topLeft = screenPoint;
        this.bottomRight = screenPoint2;
    }

    @NonNull
    public ScreenPoint getBottomRight() {
        return this.bottomRight;
    }

    @NonNull
    public ScreenPoint getTopLeft() {
        return this.topLeft;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.topLeft = (ScreenPoint) archive.add((Archive) this.topLeft, false, (Class<Archive>) ScreenPoint.class);
        this.bottomRight = (ScreenPoint) archive.add((Archive) this.bottomRight, false, (Class<Archive>) ScreenPoint.class);
    }

    public ScreenRect() {
    }
}
