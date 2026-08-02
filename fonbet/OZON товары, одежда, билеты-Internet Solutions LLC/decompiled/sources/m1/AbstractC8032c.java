package m1;

import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8032c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f73935a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73936b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73937c;

    public AbstractC8032c(int i11, long j11, String str) {
        this.f73935a = str;
        this.f73936b = j11;
        this.f73937c = i11;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i11 < -1 || i11 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    @NotNull
    public abstract float[] a(@NotNull float[] fArr);

    public final int b() {
        int i11 = C8031b.f73934e;
        return (int) (this.f73936b >> 32);
    }

    public final int c() {
        return this.f73937c;
    }

    public abstract float d(int i11);

    public abstract float e(int i11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC8032c abstractC8032c = (AbstractC8032c) obj;
        if (this.f73937c == abstractC8032c.f73937c && Intrinsics.d(this.f73935a, abstractC8032c.f73935a)) {
            return C8031b.d(this.f73936b, abstractC8032c.f73936b);
        }
        return false;
    }

    public final long f() {
        return this.f73936b;
    }

    @NotNull
    public final String g() {
        return this.f73935a;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        int hashCode = this.f73935a.hashCode() * 31;
        int i11 = C8031b.f73934e;
        return Pk0.c.a(hashCode, 31, this.f73936b) + this.f73937c;
    }

    public long i(float f7, float f11, float f12) {
        float[] j11 = j(new float[]{f7, f11, f12});
        return (Float.floatToRawIntBits(j11[0]) << 32) | (Float.floatToRawIntBits(j11[1]) & 4294967295L);
    }

    @NotNull
    public abstract float[] j(@NotNull float[] fArr);

    public float k(float f7, float f11, float f12) {
        return j(new float[]{f7, f11, f12})[2];
    }

    public long l(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        int i11 = C8031b.f73934e;
        float[] fArr = new float[(int) (this.f73936b >> 32)];
        fArr[0] = f7;
        fArr[1] = f11;
        fArr[2] = f12;
        float[] a11 = a(fArr);
        return C7811b0.a(a11[0], a11[1], a11[2], f13, abstractC8032c);
    }

    @NotNull
    public final String toString() {
        return this.f73935a + " (id=" + this.f73937c + ", model=" + ((Object) C8031b.e(this.f73936b)) + ')';
    }
}
