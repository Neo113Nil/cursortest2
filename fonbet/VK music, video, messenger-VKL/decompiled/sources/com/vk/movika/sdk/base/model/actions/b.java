package com.vk.movika.sdk.base.model.actions;

/* loaded from: classes3.dex */
public final class b implements a {
    public final boolean a;

    public b(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || this.a != ((b) obj).a) {
            return false;
        }
        Object obj2 = Boolean.TRUE;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return Boolean.TRUE.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ContinuePlaybackAction(shouldOpenNow=" + this.a + ", isDetachContainer=" + Boolean.TRUE + ")";
    }
}
