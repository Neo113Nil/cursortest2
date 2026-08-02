package H;

import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f4272a;

    /* renamed from: b, reason: collision with root package name */
    public int f4273b;

    @NotNull
    private int[] handles;

    @NotNull
    private int[] values = new int[16];

    @NotNull
    private int[] index = new int[16];

    public e() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.handles = iArr;
    }

    public final int a(int i10) {
        c(this.f4272a + 1);
        int i11 = this.f4272a;
        this.f4272a = i11 + 1;
        int b10 = b();
        this.values[i11] = i10;
        this.index[i11] = b10;
        this.handles[b10] = i11;
        e(i11);
        return b10;
    }

    public final int b() {
        int length = this.handles.length;
        if (this.f4273b >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            ArraysKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i13 = this.f4273b;
        this.f4273b = this.handles[i13];
        return i13;
    }

    public final void c(int i10) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        ArraysKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt.copyInto$default(this.index, iArr3, 0, 0, 0, 14, (Object) null);
        this.values = iArr2;
        this.index = iArr3;
    }

    public final int d(int i10) {
        return this.f4272a > 0 ? this.values[0] : i10;
    }

    public final void e(int i10) {
        int[] iArr = this.values;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            f(i12, i10);
            i10 = i12;
        }
    }

    public final void f(int i10, int i11) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }
}
