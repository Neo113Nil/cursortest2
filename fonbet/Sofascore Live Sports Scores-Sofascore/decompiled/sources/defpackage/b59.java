package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b59 {
    public static final byte[] f = {0, 0, 1};
    public static final byte[] g = {0, 0, 1};
    public static final byte[] h = {0, 0, 1};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public Object e;

    public b59(boolean z, int i, int i2, f4a f4aVar) {
        this.a = 3;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = f4aVar;
    }

    public void a(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    int i3 = i2 - i;
                    byte[] bArr2 = (byte[]) this.e;
                    int length = bArr2.length;
                    int i4 = this.c + i3;
                    if (length < i4) {
                        bArr2 = Arrays.copyOf(bArr2, i4 * 2);
                        this.e = bArr2;
                    }
                    System.arraycopy(bArr, i, bArr2, this.c, i3);
                    this.c += i3;
                    break;
                }
                break;
            default:
                if (this.b) {
                    int i5 = i2 - i;
                    byte[] bArr3 = (byte[]) this.e;
                    int length2 = bArr3.length;
                    int i6 = this.c + i5;
                    if (length2 < i6) {
                        bArr3 = Arrays.copyOf(bArr3, i6 * 2);
                        this.e = bArr3;
                    }
                    System.arraycopy(bArr, i, bArr3, this.c, i5);
                    this.c += i5;
                    break;
                }
                break;
        }
    }

    public void b(int i, int i2, byte[] bArr) {
        if (this.b) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArr2 = Arrays.copyOf(bArr2, i4 + i4);
                this.e = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, this.c, i3);
            this.c += i3;
        }
    }

    public /* synthetic */ b59(int i) {
        this.a = i;
    }
}
