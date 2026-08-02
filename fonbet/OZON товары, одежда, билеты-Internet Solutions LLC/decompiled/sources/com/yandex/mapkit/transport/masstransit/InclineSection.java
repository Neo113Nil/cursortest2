package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class InclineSection implements Serializable {
    private Subpolyline subpolyline;
    private InclineType type;

    public InclineSection(@NonNull InclineType inclineType, @NonNull Subpolyline subpolyline) {
        if (inclineType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"subpolyline\" cannot be null");
        }
        this.type = inclineType;
        this.subpolyline = subpolyline;
    }

    @NonNull
    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @NonNull
    public InclineType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (InclineType) archive.add((Archive) this.type, false, (Class<Archive>) InclineType.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public InclineSection() {
    }
}
