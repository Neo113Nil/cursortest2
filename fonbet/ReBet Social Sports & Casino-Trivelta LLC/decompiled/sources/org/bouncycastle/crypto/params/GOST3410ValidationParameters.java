package org.bouncycastle.crypto.params;

/* loaded from: classes5.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c, reason: collision with root package name */
    private int f61796c;
    private long cL;

    /* renamed from: x0, reason: collision with root package name */
    private int f61797x0;
    private long x0L;

    public GOST3410ValidationParameters(int i10, int i11) {
        this.f61797x0 = i10;
        this.f61796c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f61796c == this.f61796c && gOST3410ValidationParameters.f61797x0 == this.f61797x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f61796c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f61797x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i10 = this.f61797x0 ^ this.f61796c;
        long j10 = this.x0L;
        int i11 = (i10 ^ ((int) j10)) ^ ((int) (j10 >> 32));
        long j11 = this.cL;
        return (i11 ^ ((int) j11)) ^ ((int) (j11 >> 32));
    }

    public GOST3410ValidationParameters(long j10, long j11) {
        this.x0L = j10;
        this.cL = j11;
    }
}
