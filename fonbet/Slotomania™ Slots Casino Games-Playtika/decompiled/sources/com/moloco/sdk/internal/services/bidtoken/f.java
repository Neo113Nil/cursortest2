package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes8.dex */
public final class f {
    public static final int b = 0;
    public final boolean a;

    public f(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public String toString() {
        return "BidTokenConfig(dbtEnabled=" + this.a + ')';
    }

    public final f a(boolean z) {
        return new f(z);
    }

    public static /* synthetic */ f a(f fVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fVar.a;
        }
        return fVar.a(z);
    }
}
