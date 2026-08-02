package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rb2 extends OutputStream {
    public final /* synthetic */ int a;

    public /* synthetic */ rb2(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
        }
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                z1a.A(i, i2 + i, bArr.length);
                break;
            default:
                bArr.getClass();
                zzguk.k(i, i2 + i, bArr.length);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                break;
            default:
                bArr.getClass();
                break;
        }
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
    }
}
