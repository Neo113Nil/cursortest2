package com.vk.movika.sdk.android.defaultplayer.container;

/* loaded from: classes3.dex */
public final class c {
    public final h a;

    public c(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FactoryItem(factory=" + this.a + ", priority=1.0)";
    }
}
