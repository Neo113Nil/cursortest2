package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ManeuverStyle implements Serializable {
    private ArrowManeuverStyle arrow;

    public ManeuverStyle(@NonNull ArrowManeuverStyle arrowManeuverStyle) {
        if (arrowManeuverStyle == null) {
            throw new IllegalArgumentException("Required field \"arrow\" cannot be null");
        }
        this.arrow = arrowManeuverStyle;
    }

    @NonNull
    public ArrowManeuverStyle getArrow() {
        return this.arrow;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.arrow = (ArrowManeuverStyle) archive.add((Archive) this.arrow, false, (Class<Archive>) ArrowManeuverStyle.class);
    }

    public ManeuverStyle() {
    }
}
