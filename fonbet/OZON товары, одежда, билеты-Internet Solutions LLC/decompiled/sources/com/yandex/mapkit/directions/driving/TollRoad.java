package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class TollRoad implements Serializable {
    private Subpolyline position;

    public TollRoad(@NonNull Subpolyline subpolyline) {
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = subpolyline;
    }

    @NonNull
    public Subpolyline getPosition() {
        return this.position;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
    }

    public TollRoad() {
    }
}
