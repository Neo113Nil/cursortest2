package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class a {
    public static final int d = 0;
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "PlayingState(isPlaying=" + this.a + ", isVisible=" + this.b + ", hasMore=" + this.c + ')';
    }

    public final a a(boolean z, boolean z2, boolean z3) {
        return new a(z, z2, z3);
    }

    public static /* synthetic */ a a(a aVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.b;
        }
        if ((i & 4) != 0) {
            z3 = aVar.c;
        }
        return aVar.a(z, z2, z3);
    }

    public /* synthetic */ a(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
