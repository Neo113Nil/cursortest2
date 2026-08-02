package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class RuggedRoad implements Serializable {
    private boolean inPoorCondition;
    private Subpolyline position;
    private boolean unpaved;

    public RuggedRoad(@NonNull Subpolyline subpolyline, boolean z11, boolean z12) {
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.position = subpolyline;
        this.unpaved = z11;
        this.inPoorCondition = z12;
    }

    public boolean getInPoorCondition() {
        return this.inPoorCondition;
    }

    @NonNull
    public Subpolyline getPosition() {
        return this.position;
    }

    public boolean getUnpaved() {
        return this.unpaved;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
        this.unpaved = archive.add(this.unpaved);
        this.inPoorCondition = archive.add(this.inPoorCondition);
    }

    public RuggedRoad() {
    }
}
