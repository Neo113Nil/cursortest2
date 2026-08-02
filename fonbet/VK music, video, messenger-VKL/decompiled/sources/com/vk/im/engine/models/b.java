package com.vk.im.engine.models;

import xsna.vu5;

/* compiled from: ImDatabaseStatConfig.kt */
/* loaded from: classes.dex */
public final class b {
    public static final a c = new a();
    public static final b d = new b(-1.0f, Long.MAX_VALUE);
    public final float a;
    public final long b;

    /* compiled from: ImDatabaseStatConfig.kt */
    public static final class a {
    }

    public b(float f, long j) {
        this.a = f;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.a, bVar.a) == 0 && this.b == bVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImDatabaseStatConfig(sampleRate=");
        sb.append(this.a);
        sb.append(", elapsedTimeThresholdMs=");
        return vu5.a(')', this.b, sb);
    }
}
