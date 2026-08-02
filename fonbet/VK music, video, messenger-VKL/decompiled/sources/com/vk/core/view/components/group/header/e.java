package com.vk.core.view.components.group.header;

import xsna.epx;
import xsna.ho8;

/* compiled from: VkGroupHeader.kt */
/* loaded from: classes17.dex */
public final class e {
    public final String a;

    public e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Number(number="), this.a, ')');
    }
}
