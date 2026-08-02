package Lb;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final int f7107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7108b;
    private final int[] bits;

    /* renamed from: c, reason: collision with root package name */
    public final int f7109c;

    public b(int i10) {
        this(i10, i10);
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f7108b * (this.f7107a + 1));
        for (int i10 = 0; i10 < this.f7108b; i10++) {
            for (int i11 = 0; i11 < this.f7107a; i11++) {
                sb2.append(d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void b() {
        int length = this.bits.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.bits[i10] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f7107a, this.f7108b, this.f7109c, (int[]) this.bits.clone());
    }

    public boolean d(int i10, int i11) {
        return ((this.bits[(i11 * this.f7109c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int e() {
        return this.f7108b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7107a == bVar.f7107a && this.f7108b == bVar.f7108b && this.f7109c == bVar.f7109c && Arrays.equals(this.bits, bVar.bits);
    }

    public int f() {
        return this.f7107a;
    }

    public void g(int i10, int i11) {
        int i12 = (i11 * this.f7109c) + (i10 / 32);
        int[] iArr = this.bits;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void h(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f7108b || i14 > this.f7107a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f7109c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.bits;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public int hashCode() {
        int i10 = this.f7107a;
        return (((((((i10 * 31) + i10) * 31) + this.f7108b) * 31) + this.f7109c) * 31) + Arrays.hashCode(this.bits);
    }

    public String i(String str, String str2) {
        return a(str, str2, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    public String toString() {
        return i("X ", "  ");
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f7107a = i10;
        this.f7108b = i11;
        int i12 = (i10 + 31) / 32;
        this.f7109c = i12;
        this.bits = new int[i12 * i11];
    }

    public b(int i10, int i11, int i12, int[] iArr) {
        this.f7107a = i10;
        this.f7108b = i11;
        this.f7109c = i12;
        this.bits = iArr;
    }
}
