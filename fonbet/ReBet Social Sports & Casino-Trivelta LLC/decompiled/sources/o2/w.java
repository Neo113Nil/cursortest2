package o2;

import e1.AbstractC4134a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f59283a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f59284b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f59285c;

    /* renamed from: d, reason: collision with root package name */
    public int f59286d;
    public byte[] nalData;

    public w(int i10, int i11) {
        this.f59283a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f59284b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i13 = this.f59286d;
            if (length < i13 + i12) {
                this.nalData = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.nalData, this.f59286d, i12);
            this.f59286d += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f59284b) {
            return false;
        }
        this.f59286d -= i10;
        this.f59284b = false;
        this.f59285c = true;
        return true;
    }

    public boolean c() {
        return this.f59285c;
    }

    public void d() {
        this.f59284b = false;
        this.f59285c = false;
    }

    public void e(int i10) {
        AbstractC4134a.g(!this.f59284b);
        boolean z10 = i10 == this.f59283a;
        this.f59284b = z10;
        if (z10) {
            this.f59286d = 3;
            this.f59285c = false;
        }
    }
}
