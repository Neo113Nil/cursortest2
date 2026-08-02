package com.yandex.mapkit.logo;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Padding implements Serializable {
    private int horizontalPadding;
    private int verticalPadding;

    public Padding(int i11, int i12) {
        this.horizontalPadding = i11;
        this.verticalPadding = i12;
    }

    public int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public int getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.horizontalPadding = archive.add(this.horizontalPadding);
        this.verticalPadding = archive.add(this.verticalPadding);
    }

    public Padding() {
    }
}
