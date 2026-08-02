package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class DirectionSignIcon implements Serializable {
    private DirectionSignImage image;
    private DirectionSignStyle style;

    public DirectionSignIcon(@NonNull DirectionSignImage directionSignImage, @NonNull DirectionSignStyle directionSignStyle) {
        if (directionSignImage == null) {
            throw new IllegalArgumentException("Required field \"image\" cannot be null");
        }
        if (directionSignStyle == null) {
            throw new IllegalArgumentException("Required field \"style\" cannot be null");
        }
        this.image = directionSignImage;
        this.style = directionSignStyle;
    }

    @NonNull
    public DirectionSignImage getImage() {
        return this.image;
    }

    @NonNull
    public DirectionSignStyle getStyle() {
        return this.style;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.image = (DirectionSignImage) archive.add((Archive) this.image, false, (Class<Archive>) DirectionSignImage.class);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignIcon() {
    }
}
