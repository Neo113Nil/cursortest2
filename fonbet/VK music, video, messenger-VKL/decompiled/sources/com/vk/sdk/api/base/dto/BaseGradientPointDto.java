package com.vk.sdk.api.base.dto;

import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;

/* compiled from: BaseGradientPointDto.kt */
/* loaded from: classes5.dex */
public final class BaseGradientPointDto {

    @pmi0("color")
    private final String color;

    @pmi0(X3.i.L)
    private final float position;

    public BaseGradientPointDto(String str, float f) {
        this.color = str;
        this.position = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseGradientPointDto)) {
            return false;
        }
        BaseGradientPointDto baseGradientPointDto = (BaseGradientPointDto) obj;
        return epx.f(this.color, baseGradientPointDto.color) && Float.compare(this.position, baseGradientPointDto.position) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.position) + (this.color.hashCode() * 31);
    }

    public final String toString() {
        return "BaseGradientPointDto(color=" + this.color + ", position=" + this.position + ")";
    }
}
