package com.vk.core.view.components.context.menu;

import com.vk.core.view.components.context.menu.VkContextMenu;
import xsna.epx;

/* compiled from: VkContextMenu.kt */
/* loaded from: classes17.dex */
public final class b {
    public final VkContextMenu.a a;

    public b(VkContextMenu.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LegacyItem(item=" + this.a + ')';
    }
}
