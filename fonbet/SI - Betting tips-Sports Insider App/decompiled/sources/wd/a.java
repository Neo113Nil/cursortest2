package wd;

import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f25234a;

    public a(int i5) {
        this.f25234a = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f25234a == ((a) obj).f25234a;
    }

    public final int hashCode() {
        return ((((-31217) + this.f25234a) * 31) + 16) * 31;
    }

    public final String toString() {
        return k.n(new StringBuilder("LEnum(w=-1, h=-2, mStart=16, mTop="), this.f25234a, ", mEnd=16, mBottom=0)");
    }
}
