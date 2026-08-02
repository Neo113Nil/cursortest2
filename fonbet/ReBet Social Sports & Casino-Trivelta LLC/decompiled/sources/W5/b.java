package W5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f13003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13005c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13006d;

    /* renamed from: e, reason: collision with root package name */
    public final double f13007e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13008f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13009g;

    /* renamed from: h, reason: collision with root package name */
    public final double f13010h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13011i;

    public b(int i10, int i11, int i12, int i13, double d10, int i14, int i15, double d11, int i16) {
        this.f13003a = i10;
        this.f13004b = i11;
        this.f13005c = i12;
        this.f13006d = i13;
        this.f13007e = d10;
        this.f13008f = i14;
        this.f13009g = i15;
        this.f13010h = d11;
        this.f13011i = i16;
    }

    public final double a() {
        return this.f13010h;
    }

    public final int b() {
        return this.f13005c;
    }

    public final int c() {
        return this.f13006d;
    }

    public final int d() {
        return this.f13004b;
    }

    public final int e() {
        return this.f13011i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13003a == bVar.f13003a && this.f13004b == bVar.f13004b && this.f13005c == bVar.f13005c && this.f13006d == bVar.f13006d && Double.compare(this.f13007e, bVar.f13007e) == 0 && this.f13008f == bVar.f13008f && this.f13009g == bVar.f13009g && Double.compare(this.f13010h, bVar.f13010h) == 0 && this.f13011i == bVar.f13011i;
    }

    public final double f() {
        return this.f13007e;
    }

    public final int g() {
        return this.f13009g;
    }

    public final int h() {
        return this.f13008f;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f13003a) * 31) + Integer.hashCode(this.f13004b)) * 31) + Integer.hashCode(this.f13005c)) * 31) + Integer.hashCode(this.f13006d)) * 31) + Double.hashCode(this.f13007e)) * 31) + Integer.hashCode(this.f13008f)) * 31) + Integer.hashCode(this.f13009g)) * 31) + Double.hashCode(this.f13010h)) * 31) + Integer.hashCode(this.f13011i);
    }

    public final int i() {
        return this.f13003a;
    }

    public String toString() {
        return "FrameDiffOptions(workSize=" + this.f13003a + ", dHashWidth=" + this.f13004b + ", dHashHeight=" + this.f13005c + ", dHashMaxSame=" + this.f13006d + ", ssimMinSame=" + this.f13007e + ", tiles=" + this.f13008f + ", tileMadThreshold=" + this.f13009g + ", changedTilesMaxRatio=" + this.f13010h + ", minVotesForSame=" + this.f13011i + ")";
    }

    public /* synthetic */ b(int i10, int i11, int i12, int i13, double d10, int i14, int i15, double d11, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 64 : i10, (i17 & 2) != 0 ? 9 : i11, (i17 & 4) != 0 ? 8 : i12, (i17 & 8) != 0 ? 1 : i13, (i17 & 16) != 0 ? 0.999d : d10, (i17 & 32) != 0 ? 16 : i14, (i17 & 64) != 0 ? 4 : i15, (i17 & 128) != 0 ? 0.005d : d11, (i17 & 256) != 0 ? 3 : i16);
    }
}
