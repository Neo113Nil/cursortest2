package androidx.media3.effect;

import android.content.Context;
import b1.C2368w;
import b1.InterfaceC2367v;
import e1.AbstractC4134a;
import l1.AbstractC5365k0;
import l1.Z0;

/* loaded from: classes.dex */
public final class m extends AbstractC5365k0 {
    private final Z0[] cachedFrames;

    /* renamed from: i, reason: collision with root package name */
    public int f20831i;

    public m(Context context, boolean z10) {
        super(context, 2, z10);
        this.cachedFrames = new Z0[2];
    }

    @Override // androidx.media3.effect.a, androidx.media3.effect.i
    public void c(InterfaceC2367v interfaceC2367v, C2368w c2368w, long j10) {
        AbstractC4134a.g(this.f20831i < 2);
        super.c(interfaceC2367v, c2368w, j10);
        Z0[] z0Arr = this.cachedFrames;
        int i10 = this.f20831i;
        this.f20831i = i10 + 1;
        z0Arr[i10] = new Z0((C2368w) AbstractC4134a.e(this.f20662a.j()), j10);
    }

    @Override // androidx.media3.effect.a, androidx.media3.effect.i
    public void flush() {
        this.f20831i = 0;
        super.flush();
    }

    @Override // androidx.media3.effect.a, androidx.media3.effect.i
    public void g() {
        for (int i10 = 0; i10 < this.f20831i; i10++) {
            super.m(this.cachedFrames[i10].f55483a);
        }
        this.f20831i = 0;
        super.g();
    }

    public long p() {
        if (q()) {
            return -9223372036854775807L;
        }
        return this.cachedFrames[0].f55484b;
    }

    public boolean q() {
        return this.f20831i == 0;
    }

    public void r(long j10) {
        int i10 = this.f20831i;
        if (i10 >= 2) {
            Z0[] z0Arr = this.cachedFrames;
            Z0 z02 = z0Arr[1];
            if (j10 < z02.f55484b) {
                return;
            }
            Z0 z03 = z0Arr[0];
            z0Arr[0] = z02;
            this.f20831i = i10 - 1;
            super.m(z03.f55483a);
        }
    }

    public void s() {
        if (q()) {
            return;
        }
        Z0 z02 = this.cachedFrames[0];
        k().d(z02.f55483a, z02.f55484b);
        if (this.f20831i > 1) {
            Z0 z03 = this.cachedFrames[1];
            k().d(z03.f55483a, z03.f55484b);
        }
    }

    @Override // androidx.media3.effect.a, androidx.media3.effect.i
    public void m(C2368w c2368w) {
    }
}
