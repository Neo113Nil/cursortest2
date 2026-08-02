package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.source.c0;
import e1.Z;
import m1.O0;
import p1.C6036f;

/* loaded from: classes.dex */
public final class m implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.a f21079a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21081c;

    /* renamed from: d, reason: collision with root package name */
    public C6036f f21082d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21083e;
    private long[] eventTimesUs;

    /* renamed from: f, reason: collision with root package name */
    public int f21084f;

    /* renamed from: b, reason: collision with root package name */
    public final S1.c f21080b = new S1.c();

    /* renamed from: g, reason: collision with root package name */
    public long f21085g = -9223372036854775807L;

    public m(C6036f c6036f, androidx.media3.common.a aVar, boolean z10) {
        this.f21079a = aVar;
        this.f21082d = c6036f;
        this.eventTimesUs = c6036f.presentationTimesUs;
        e(c6036f, z10);
    }

    @Override // androidx.media3.exoplayer.source.c0
    public void a() {
    }

    public String b() {
        return this.f21082d.a();
    }

    @Override // androidx.media3.exoplayer.source.c0
    public boolean c() {
        return true;
    }

    public void d(long j10) {
        int d10 = Z.d(this.eventTimesUs, j10, true, false);
        this.f21084f = d10;
        if (!this.f21081c || d10 != this.eventTimesUs.length) {
            j10 = -9223372036854775807L;
        }
        this.f21085g = j10;
    }

    public void e(C6036f c6036f, boolean z10) {
        int i10 = this.f21084f;
        long j10 = i10 == 0 ? -9223372036854775807L : this.eventTimesUs[i10 - 1];
        this.f21081c = z10;
        this.f21082d = c6036f;
        long[] jArr = c6036f.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j11 = this.f21085g;
        if (j11 != -9223372036854775807L) {
            d(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f21084f = Z.d(jArr, j10, false, false);
        }
    }

    @Override // androidx.media3.exoplayer.source.c0
    public int q(long j10) {
        int max = Math.max(this.f21084f, Z.d(this.eventTimesUs, j10, true, false));
        int i10 = max - this.f21084f;
        this.f21084f = max;
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.c0
    public int s(O0 o02, k1.f fVar, int i10) {
        int i11 = this.f21084f;
        boolean z10 = i11 == this.eventTimesUs.length;
        if (z10 && !this.f21081c) {
            fVar.n(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f21083e) {
            o02.f56121b = this.f21079a;
            this.f21083e = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f21084f = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] a10 = this.f21080b.a(this.f21082d.events[i11]);
            fVar.p(a10.length);
            fVar.f54108d.put(a10);
        }
        fVar.f54110f = this.eventTimesUs[i11];
        fVar.n(1);
        return -4;
    }
}
