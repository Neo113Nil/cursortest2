package n3;

import j3.t;

/* renamed from: n3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8430c implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f76374a;

    public C8430c(int i11) {
        this.f76374a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8430c) && this.f76374a == ((C8430c) obj).f76374a;
    }

    public final int hashCode() {
        return this.f76374a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f76374a;
    }
}
