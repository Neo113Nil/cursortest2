package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class DirectionSignStyle implements Serializable {
    private int bgColor;
    private int textColor;

    public DirectionSignStyle(int i11, int i12) {
        this.textColor = i11;
        this.bgColor = i12;
    }

    public int getBgColor() {
        return this.bgColor;
    }

    public int getTextColor() {
        return this.textColor;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.textColor = archive.add(this.textColor);
        this.bgColor = archive.add(this.bgColor);
    }

    public DirectionSignStyle() {
    }
}
