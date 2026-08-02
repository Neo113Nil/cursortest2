package s3;

import android.media.MediaCodec;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9589c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f98170a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f98171b;

    /* renamed from: c, reason: collision with root package name */
    public int f98172c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f98173d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f98174e;

    /* renamed from: f, reason: collision with root package name */
    public int f98175f;

    /* renamed from: g, reason: collision with root package name */
    public int f98176g;

    /* renamed from: h, reason: collision with root package name */
    public int f98177h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f98178i;

    /* renamed from: j, reason: collision with root package name */
    private final a f98179j;

    /* renamed from: s3.c$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f98180a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f98181b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f98180a = cryptoInfo;
        }

        static void a(a aVar, int i11, int i12) {
            MediaCodec.CryptoInfo.Pattern pattern = aVar.f98181b;
            pattern.set(i11, i12);
            aVar.f98180a.setPattern(pattern);
        }
    }

    public C9589c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f98178i = cryptoInfo;
        this.f98179j = new a(cryptoInfo);
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f98178i;
    }

    public final void b(int i11) {
        if (i11 == 0) {
            return;
        }
        if (this.f98173d == null) {
            int[] iArr = new int[1];
            this.f98173d = iArr;
            this.f98178i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f98173d;
        iArr2[0] = iArr2[0] + i11;
    }

    public final void c(int i11, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i12, int i13, int i14) {
        this.f98175f = i11;
        this.f98173d = iArr;
        this.f98174e = iArr2;
        this.f98171b = bArr;
        this.f98170a = bArr2;
        this.f98172c = i12;
        this.f98176g = i13;
        this.f98177h = i14;
        MediaCodec.CryptoInfo cryptoInfo = this.f98178i;
        cryptoInfo.numSubSamples = i11;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i12;
        a aVar = this.f98179j;
        aVar.getClass();
        a.a(aVar, i13, i14);
    }
}
