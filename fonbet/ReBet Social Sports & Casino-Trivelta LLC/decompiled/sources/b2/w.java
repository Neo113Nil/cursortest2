package b2;

import e1.AbstractC4134a;
import e1.Z;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final t f24973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24974b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24975c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24976d;
    public final int[] flags;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timestampsUs;

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        AbstractC4134a.a(iArr.length == jArr2.length);
        AbstractC4134a.a(jArr.length == jArr2.length);
        AbstractC4134a.a(iArr2.length == jArr2.length);
        this.f24973a = tVar;
        this.offsets = jArr;
        this.sizes = iArr;
        this.f24975c = i10;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.f24976d = j10;
        this.f24974b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public int a(long j10) {
        for (int h10 = Z.h(this.timestampsUs, j10, true, false); h10 >= 0; h10--) {
            if ((this.flags[h10] & 1) != 0) {
                return h10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int d10 = Z.d(this.timestampsUs, j10, true, false); d10 < this.timestampsUs.length; d10++) {
            if ((this.flags[d10] & 1) != 0) {
                return d10;
            }
        }
        return -1;
    }
}
