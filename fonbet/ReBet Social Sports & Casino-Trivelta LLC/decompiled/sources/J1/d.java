package J1;

import e1.AbstractC4156x;
import e1.J;
import e1.Z;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5902b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5903c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5905e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5906f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5907g;

    public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f5901a = i10;
        this.f5902b = i11;
        this.f5903c = i12;
        this.f5904d = i13;
        this.f5905e = i14;
        this.f5906f = i15;
        this.f5907g = i16;
    }

    public static d c(J j10) {
        int z10 = j10.z();
        j10.c0(12);
        int z11 = j10.z();
        int z12 = j10.z();
        int z13 = j10.z();
        j10.c0(4);
        int z14 = j10.z();
        int z15 = j10.z();
        j10.c0(4);
        return new d(z10, z11, z12, z13, z14, z15, j10.z());
    }

    public long a() {
        return Z.p1(this.f5905e, this.f5903c * 1000000, this.f5904d);
    }

    public int b() {
        int i10 = this.f5901a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        AbstractC4156x.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f5901a));
        return -1;
    }

    @Override // J1.a
    public int getType() {
        return 1752331379;
    }
}
