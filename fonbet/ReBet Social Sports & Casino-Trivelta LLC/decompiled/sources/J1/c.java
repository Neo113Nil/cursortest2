package J1;

import e1.J;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5899c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5900d;

    public c(int i10, int i11, int i12, int i13) {
        this.f5897a = i10;
        this.f5898b = i11;
        this.f5899c = i12;
        this.f5900d = i13;
    }

    public static c b(J j10) {
        int z10 = j10.z();
        j10.c0(8);
        int z11 = j10.z();
        int z12 = j10.z();
        j10.c0(4);
        int z13 = j10.z();
        j10.c0(12);
        return new c(z10, z11, z12, z13);
    }

    public boolean a() {
        return (this.f5898b & 16) == 16;
    }

    @Override // J1.a
    public int getType() {
        return 1751742049;
    }
}
