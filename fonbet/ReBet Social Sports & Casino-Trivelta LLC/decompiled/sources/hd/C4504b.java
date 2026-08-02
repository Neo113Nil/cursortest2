package hd;

/* renamed from: hd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4504b {

    /* renamed from: a, reason: collision with root package name */
    public int f47885a;

    /* renamed from: b, reason: collision with root package name */
    public int f47886b;

    /* renamed from: c, reason: collision with root package name */
    public int f47887c;

    public C4504b(int i10, int i11, int i12) {
        this.f47885a = i10;
        this.f47886b = i11;
        this.f47887c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C4504b c4504b = (C4504b) obj;
            if (this.f47885a == c4504b.f47885a && this.f47886b == c4504b.f47886b && this.f47887c == c4504b.f47887c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f47885a * 31) + this.f47886b) * 31) + this.f47887c;
    }
}
