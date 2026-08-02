package com.vk.movika.tools.controls.seekbar;

import xsna.qlb0;

/* loaded from: classes3.dex */
public final class a0 {
    public final long a;

    public a0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qlb0.a(this.a, "Point(value=", ")");
    }
}
