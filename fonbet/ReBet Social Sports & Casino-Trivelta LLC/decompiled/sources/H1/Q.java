package H1;

import e1.AbstractC4134a;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final int f4359a;

    /* renamed from: b, reason: collision with root package name */
    public int f4360b;

    /* renamed from: c, reason: collision with root package name */
    public int f4361c;
    private final byte[] data;

    public Q(byte[] bArr) {
        this.data = bArr;
        this.f4359a = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f4360b;
        AbstractC4134a.g(i11 >= 0 && (i11 < (i10 = this.f4359a) || (i11 == i10 && this.f4361c == 0)));
    }

    public int b() {
        return (this.f4360b * 8) + this.f4361c;
    }

    public boolean c() {
        boolean z10 = (((this.data[this.f4360b] & UByte.MAX_VALUE) >> this.f4361c) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f4360b;
        int min = Math.min(i10, 8 - this.f4361c);
        int i12 = i11 + 1;
        int i13 = ((this.data[i11] & UByte.MAX_VALUE) >> this.f4361c) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.data[i12] & UByte.MAX_VALUE) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f4360b + i11;
        this.f4360b = i12;
        int i13 = this.f4361c + (i10 - (i11 * 8));
        this.f4361c = i13;
        if (i13 > 7) {
            this.f4360b = i12 + 1;
            this.f4361c = i13 - 8;
        }
        a();
    }
}
