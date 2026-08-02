package ed;

/* renamed from: ed.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4201a {

    /* renamed from: a, reason: collision with root package name */
    public final float f45930a;

    /* renamed from: b, reason: collision with root package name */
    public final float f45931b;

    /* renamed from: c, reason: collision with root package name */
    public final float f45932c;

    /* renamed from: d, reason: collision with root package name */
    public final float f45933d;

    public C4201a(float f10, float f11, float f12, float f13) {
        this.f45930a = f10;
        this.f45931b = f11;
        this.f45932c = f12;
        this.f45933d = f13;
    }

    public final float a() {
        return this.f45932c;
    }

    public final float b() {
        return this.f45933d;
    }

    public final float c() {
        return this.f45931b;
    }

    public final float d() {
        return this.f45930a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4201a)) {
            return false;
        }
        C4201a c4201a = (C4201a) obj;
        return Float.compare(this.f45930a, c4201a.f45930a) == 0 && Float.compare(this.f45931b, c4201a.f45931b) == 0 && Float.compare(this.f45932c, c4201a.f45932c) == 0 && Float.compare(this.f45933d, c4201a.f45933d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f45930a) * 31) + Float.hashCode(this.f45931b)) * 31) + Float.hashCode(this.f45932c)) * 31) + Float.hashCode(this.f45933d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f45930a + ", right=" + this.f45931b + ", bottom=" + this.f45932c + ", left=" + this.f45933d + ")";
    }
}
