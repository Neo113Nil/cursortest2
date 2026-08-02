package X1;

import e1.J;

/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f13381a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13382b;
    public final byte[] commandBytes;

    public a(long j10, byte[] bArr, long j11) {
        this.f13381a = j11;
        this.f13382b = j10;
        this.commandBytes = bArr;
    }

    public static a d(J j10, int i10, long j11) {
        long O10 = j10.O();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        j10.q(bArr, 0, i11);
        return new a(O10, bArr, j11);
    }

    @Override // X1.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f13381a + ", identifier= " + this.f13382b + " }";
    }
}
