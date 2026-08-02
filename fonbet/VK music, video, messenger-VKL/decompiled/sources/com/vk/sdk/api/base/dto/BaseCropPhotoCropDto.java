package com.vk.sdk.api.base.dto;

import io.reactivex.rxjava3.subjects.b;
import xsna.bxj0;
import xsna.pmi0;

/* compiled from: BaseCropPhotoCropDto.kt */
/* loaded from: classes5.dex */
public final class BaseCropPhotoCropDto {

    @pmi0("x")
    private final float x;

    @pmi0("x2")
    private final float x2;

    @pmi0("y")
    private final float y;

    @pmi0("y2")
    private final float y2;

    public BaseCropPhotoCropDto(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.x2 = f3;
        this.y2 = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseCropPhotoCropDto)) {
            return false;
        }
        BaseCropPhotoCropDto baseCropPhotoCropDto = (BaseCropPhotoCropDto) obj;
        return Float.compare(this.x, baseCropPhotoCropDto.x) == 0 && Float.compare(this.y, baseCropPhotoCropDto.y) == 0 && Float.compare(this.x2, baseCropPhotoCropDto.x2) == 0 && Float.compare(this.y2, baseCropPhotoCropDto.y2) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y2) + b.a(this.x2, b.a(this.y, Float.hashCode(this.x) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.x2;
        float f4 = this.y2;
        StringBuilder a = bxj0.a("BaseCropPhotoCropDto(x=", f, ", y=", f2, ", x2=");
        a.append(f3);
        a.append(", y2=");
        a.append(f4);
        a.append(")");
        return a.toString();
    }
}
