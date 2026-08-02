package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e59 {
    public static final byte[] g = {0, 0, 1};
    public static final byte[] h = {0, 0, 1};
    public static final byte[] i = {0, 0, 1};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public byte[] f;

    public void a(byte[] bArr, int i2, int i3) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    int i4 = i3 - i2;
                    byte[] bArr2 = this.f;
                    int length = bArr2.length;
                    int i5 = this.d + i4;
                    if (length < i5) {
                        bArr2 = Arrays.copyOf(bArr2, i5 * 2);
                        this.f = bArr2;
                    }
                    System.arraycopy(bArr, i2, bArr2, this.d, i4);
                    this.d += i4;
                    break;
                }
                break;
            default:
                if (this.b) {
                    int i6 = i3 - i2;
                    byte[] bArr3 = this.f;
                    int length2 = bArr3.length;
                    int i7 = this.d + i6;
                    if (length2 < i7) {
                        bArr3 = Arrays.copyOf(bArr3, i7 * 2);
                        this.f = bArr3;
                    }
                    System.arraycopy(bArr, i2, bArr3, this.d, i6);
                    this.d += i6;
                    break;
                }
                break;
        }
    }

    public void b(int i2, int i3, byte[] bArr) {
        if (this.b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f;
            int length = bArr2.length;
            int i5 = this.d + i4;
            if (length < i5) {
                bArr2 = Arrays.copyOf(bArr2, i5 + i5);
                this.f = bArr2;
            }
            System.arraycopy(bArr, i2, bArr2, this.d, i4);
            this.d += i4;
        }
    }
}
