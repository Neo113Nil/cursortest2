package z;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6904e {

    /* renamed from: a, reason: collision with root package name */
    public int f68448a;

    /* renamed from: b, reason: collision with root package name */
    public int f68449b;

    /* renamed from: c, reason: collision with root package name */
    public int f68450c;

    @NotNull
    private int[] elements;

    public C6904e() {
        this(0, 1, null);
    }

    public final void a(int i10) {
        int[] iArr = this.elements;
        int i11 = this.f68449b;
        iArr[i11] = i10;
        int i12 = this.f68450c & (i11 + 1);
        this.f68449b = i12;
        if (i12 == this.f68448a) {
            c();
        }
    }

    public final void b() {
        this.f68449b = this.f68448a;
    }

    public final void c() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i10 = this.f68448a;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i12];
        ArraysKt.copyInto(iArr, iArr2, 0, i10, length);
        ArraysKt.copyInto(this.elements, iArr2, i11, 0, this.f68448a);
        this.elements = iArr2;
        this.f68448a = 0;
        this.f68449b = length;
        this.f68450c = i12 - 1;
    }

    public final boolean d() {
        return this.f68448a == this.f68449b;
    }

    public final int e() {
        int i10 = this.f68448a;
        if (i10 == this.f68449b) {
            C6905f c6905f = C6905f.f68451a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.elements[i10];
        this.f68448a = (i10 + 1) & this.f68450c;
        return i11;
    }

    public C6904e(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f68450c = i10 - 1;
        this.elements = new int[i10];
    }

    public /* synthetic */ C6904e(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }
}
