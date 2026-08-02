package k1;

import android.media.MediaCodec;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f54098a;

    /* renamed from: b, reason: collision with root package name */
    public int f54099b;

    /* renamed from: c, reason: collision with root package name */
    public int f54100c;

    /* renamed from: d, reason: collision with root package name */
    public int f54101d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f54102e;

    /* renamed from: f, reason: collision with root package name */
    public final b f54103f;
    public byte[] iv;
    public byte[] key;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f54104a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f54105b;

        public final void b(int i10, int i11) {
            this.f54105b.set(i10, i11);
            this.f54104a.setPattern(this.f54105b);
        }

        public b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f54104a = cryptoInfo;
            this.f54105b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f54102e = cryptoInfo;
        this.f54103f = new b(cryptoInfo);
    }

    public MediaCodec.CryptoInfo a() {
        return this.f54102e;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            this.numBytesOfClearData = iArr;
            this.f54102e.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.numBytesOfClearData;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f54099b = i10;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.f54098a = i11;
        this.f54100c = i12;
        this.f54101d = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f54102e;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        ((b) AbstractC4134a.e(this.f54103f)).b(i12, i13);
    }
}
