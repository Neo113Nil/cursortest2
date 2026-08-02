package Ui;

import org.spongycastle.asn1.C5936n;
import org.spongycastle.crypto.n;

/* loaded from: classes5.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f12304a;

    /* renamed from: b, reason: collision with root package name */
    public int f12305b;
    private byte[] extraInfo;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f12306z;

    public b(C5936n c5936n, int i10, byte[] bArr, byte[] bArr2) {
        this.f12304a = c5936n;
        this.f12305b = i10;
        this.f12306z = bArr;
        this.extraInfo = bArr2;
    }

    public C5936n a() {
        return this.f12304a;
    }

    public byte[] b() {
        return this.extraInfo;
    }

    public int c() {
        return this.f12305b;
    }

    public byte[] d() {
        return this.f12306z;
    }
}
