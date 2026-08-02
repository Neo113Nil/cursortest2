package f1;

import b1.C2334C;

/* renamed from: f1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4226d implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46174a;

    public C4226d(int i10) {
        this.f46174a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4226d) && this.f46174a == ((C4226d) obj).f46174a;
    }

    public int hashCode() {
        return this.f46174a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f46174a;
    }
}
