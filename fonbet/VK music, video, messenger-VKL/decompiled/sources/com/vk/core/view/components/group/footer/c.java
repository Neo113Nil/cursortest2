package com.vk.core.view.components.group.footer;

import com.vk.core.view.components.group.footer.VkGroupFooter;

/* compiled from: VkGroupFooter.kt */
/* loaded from: classes17.dex */
public final class c implements VkGroupFooter.a {
    public final VkGroupFooter$Content$Loader$Size a;

    public c(VkGroupFooter$Content$Loader$Size vkGroupFooter$Content$Loader$Size) {
        this.a = vkGroupFooter$Content$Loader$Size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Spinner(size=" + this.a + ')';
    }
}
