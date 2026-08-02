package com.vk.superapp.api.dto.geo.matrix;

import xsna.epx;
import xsna.ojp0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zjh0;

/* compiled from: Properties.kt */
/* loaded from: classes6.dex */
public final class Properties {

    @pmi0("color")
    private final String color;

    @pmi0("contour")
    private final int contour;

    @pmi0("fill")
    private final String fill;

    @pmi0("fillColor")
    private final String fillColor;

    @pmi0("fillOpacity")
    private final double fillOpacity;

    @pmi0("opacity")
    private final double opacity;

    public Properties(String str, int i, String str2, String str3, double d, double d2) {
        this.color = str;
        this.contour = i;
        this.fill = str2;
        this.fillColor = str3;
        this.fillOpacity = d;
        this.opacity = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) obj;
        return epx.f(this.color, properties.color) && this.contour == properties.contour && epx.f(this.fill, properties.fill) && epx.f(this.fillColor, properties.fillColor) && Double.compare(this.fillOpacity, properties.fillOpacity) == 0 && Double.compare(this.opacity, properties.opacity) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.opacity) + zjh0.b(this.fillOpacity, urd0.a(urd0.a(shy.a(this.contour, this.color.hashCode() * 31, 31), 31, this.fill), 31, this.fillColor), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties(color=");
        sb.append(this.color);
        sb.append(", contour=");
        sb.append(this.contour);
        sb.append(", fill=");
        sb.append(this.fill);
        sb.append(", fillColor=");
        sb.append(this.fillColor);
        sb.append(", fillOpacity=");
        sb.append(this.fillOpacity);
        sb.append(", opacity=");
        return ojp0.a(sb, this.opacity, ')');
    }
}
