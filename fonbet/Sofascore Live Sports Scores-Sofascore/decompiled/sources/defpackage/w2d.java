package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w2d {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public int f;

    public w2d(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = i;
                byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
                this.e = bArr;
                bArr[2] = 1;
                break;
            default:
                this.b = i;
                byte[] bArr2 = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
                this.e = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    int i3 = i2 - i;
                    byte[] bArr2 = (byte[]) this.e;
                    int length = bArr2.length;
                    int i4 = this.f + i3;
                    if (length < i4) {
                        bArr2 = Arrays.copyOf(bArr2, i4 * 2);
                        this.e = bArr2;
                    }
                    System.arraycopy(bArr, i, bArr2, this.f, i3);
                    this.f += i3;
                    break;
                }
                break;
            default:
                if (this.c) {
                    int i5 = i2 - i;
                    byte[] bArr3 = (byte[]) this.e;
                    int length2 = bArr3.length;
                    int i6 = this.f + i5;
                    if (length2 < i6) {
                        bArr3 = Arrays.copyOf(bArr3, i6 * 2);
                        this.e = bArr3;
                    }
                    System.arraycopy(bArr, i, bArr3, this.f, i5);
                    this.f += i5;
                    break;
                }
                break;
        }
    }

    public boolean b(int i) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    this.f -= i;
                    this.c = false;
                    this.d = true;
                    break;
                }
                break;
            default:
                if (this.c) {
                    this.f -= i;
                    this.c = false;
                    this.d = true;
                    break;
                }
                break;
        }
        return true;
    }

    public void c(int i) {
        this.c |= i > 0;
        this.b += i;
    }

    public void d() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.d = false;
                break;
            default:
                this.c = false;
                this.d = false;
                break;
        }
    }

    public void e(int i) {
        switch (this.a) {
            case 0:
                qx9.t(!this.c);
                boolean z = i == this.b;
                this.c = z;
                if (z) {
                    this.f = 3;
                    this.d = false;
                    break;
                }
                break;
            default:
                z1a.E(!this.c);
                boolean z2 = i == this.b;
                this.c = z2;
                if (z2) {
                    this.f = 3;
                    this.d = false;
                    break;
                }
                break;
        }
    }

    public w2d(fke fkeVar) {
        this.a = 2;
        this.e = fkeVar;
    }
}
