package com.vk.core.view.components.group.footer;

import com.vk.core.view.components.group.footer.VkGroupFooter;
import xsna.gko;

/* compiled from: VkGroupFooter.kt */
/* loaded from: classes17.dex */
public final class b implements VkGroupFooter.a {
    public final gko a;
    public final VkGroupFooter$Content$Loader$Size b;

    public b(gko gkoVar, VkGroupFooter$Content$Loader$Size vkGroupFooter$Content$Loader$Size) {
        this.a = gkoVar;
        this.b = vkGroupFooter$Content$Loader$Size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31;
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ", size=" + this.b + ", color=null)";
    }
}
