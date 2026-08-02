package defpackage;

import com.google.android.gms.internal.ads.zzafx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qgn extends zzafx implements vgn {
    public final long h;
    public final int i;
    public final int j;
    public final long k;

    public qgn(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = j == -1 ? -1L : j;
    }

    @Override // defpackage.vgn
    public final long a(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // defpackage.vgn
    public final long zzg() {
        return this.k;
    }

    @Override // defpackage.vgn
    public final int zzh() {
        return this.i;
    }
}
