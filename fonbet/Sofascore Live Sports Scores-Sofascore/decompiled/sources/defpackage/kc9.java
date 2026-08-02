package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kc9 extends mu2 {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // defpackage.yfb
    public final void cancelLoad() {
        this.k = true;
    }

    @Override // defpackage.yfb
    public final void load() {
        try {
            this.i.b(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    bArr = Arrays.copyOf(bArr, bArr.length + 16384);
                    this.j = bArr;
                }
                i = this.i.read(bArr, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
            qx9.w(this.i);
        } catch (Throwable th) {
            qx9.w(this.i);
            throw th;
        }
    }
}
