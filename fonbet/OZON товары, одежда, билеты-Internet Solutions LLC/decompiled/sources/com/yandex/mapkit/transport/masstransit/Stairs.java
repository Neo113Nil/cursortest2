package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Stairs implements Serializable {
    private StairsDirection direction;
    private boolean hasRamp;

    public Stairs(@NonNull StairsDirection stairsDirection, boolean z11) {
        if (stairsDirection == null) {
            throw new IllegalArgumentException("Required field \"direction\" cannot be null");
        }
        this.direction = stairsDirection;
        this.hasRamp = z11;
    }

    @NonNull
    public StairsDirection getDirection() {
        return this.direction;
    }

    public boolean getHasRamp() {
        return this.hasRamp;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.direction = (StairsDirection) archive.add((Archive) this.direction, false, (Class<Archive>) StairsDirection.class);
        this.hasRamp = archive.add(this.hasRamp);
    }

    public Stairs() {
    }
}
