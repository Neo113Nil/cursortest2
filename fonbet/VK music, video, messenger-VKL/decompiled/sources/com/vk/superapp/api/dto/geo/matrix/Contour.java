package com.vk.superapp.api.dto.geo.matrix;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: Contour.kt */
/* loaded from: classes6.dex */
public final class Contour {

    @pmi0("color")
    private final String color;

    @pmi0("time")
    private final int time;

    public Contour(int i, String str) {
        this.time = i;
        this.color = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contour)) {
            return false;
        }
        Contour contour = (Contour) obj;
        return this.time == contour.time && epx.f(this.color, contour.color);
    }

    public final int hashCode() {
        return this.color.hashCode() + (Integer.hashCode(this.time) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contour(time=");
        sb.append(this.time);
        sb.append(", color=");
        return ho8.a(sb, this.color, ')');
    }
}
