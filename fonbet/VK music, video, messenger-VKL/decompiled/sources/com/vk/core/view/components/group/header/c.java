package com.vk.core.view.components.group.header;

import com.vk.core.view.components.counter.VkCounter;
import xsna.epx;

/* compiled from: VkGroupHeader.kt */
/* loaded from: classes17.dex */
public final class c {
    public final int a;
    public final VkCounter.CounterAppearance b;
    public final VkCounter.Mode c;
    public final VkCounter.Size d;

    public c(int i, VkCounter.CounterAppearance counterAppearance, VkCounter.Mode mode, VkCounter.Size size) {
        this.a = i;
        this.b = counterAppearance;
        this.c = mode;
        this.d = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        VkCounter.CounterAppearance counterAppearance = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (counterAppearance == null ? 0 : counterAppearance.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Counter(count=" + this.a + ", appearance=" + this.b + ", mode=" + this.c + ", size=" + this.d + ')';
    }

    public /* synthetic */ c(int i, VkCounter.CounterAppearance.Appearance appearance, VkCounter.Mode mode, int i2) {
        this(i, (i2 & 2) != 0 ? null : appearance, (i2 & 4) != 0 ? VkCounter.Mode.Primary : mode, VkCounter.Size.Small);
    }
}
