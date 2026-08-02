package com.vk.core.view.components.group.header;

import xsna.gko;
import xsna.shy;
import xsna.x7g;

/* compiled from: VkGroupHeader.kt */
/* loaded from: classes17.dex */
public final class d {
    public final gko a;
    public final x7g b;

    public d(gko gkoVar, x7g x7gVar) {
        this.a = gkoVar;
        this.b = x7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b);
    }

    public final int hashCode() {
        return shy.a(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", iconTint=" + this.b + ", iconDescription=null)";
    }
}
