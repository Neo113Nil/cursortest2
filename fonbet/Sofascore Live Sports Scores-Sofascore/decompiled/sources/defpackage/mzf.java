package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mzf extends ozf implements jd4 {
    public final d1h f;

    public mzf(b bVar, hv9 hv9Var, d1h d1hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(bVar, hv9Var, d1hVar, arrayList, arrayList2, arrayList3);
        this.f = d1hVar;
    }

    @Override // defpackage.ozf
    public final String a() {
        return null;
    }

    @Override // defpackage.ozf
    public final jlf c() {
        return null;
    }

    @Override // defpackage.jd4
    public final long e(long j, long j2) {
        return this.f.e(j, j2);
    }

    @Override // defpackage.jd4
    public final long g(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override // defpackage.jd4
    public final long getTimeUs(long j) {
        return this.f.g(j);
    }

    @Override // defpackage.jd4
    public final long h(long j, long j2) {
        d1h d1hVar = this.f;
        if (d1hVar.f != null) {
            return C.TIME_UNSET;
        }
        long b = d1hVar.b(j, j2) + d1hVar.c(j, j2);
        return (d1hVar.e(b, j) + d1hVar.g(b)) - d1hVar.i;
    }

    @Override // defpackage.jd4
    public final jlf i(long j) {
        return this.f.h(this, j);
    }

    @Override // defpackage.jd4
    public final long j(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override // defpackage.jd4
    public final long l(long j) {
        return this.f.d(j);
    }

    @Override // defpackage.jd4
    public final boolean n() {
        return this.f.i();
    }

    @Override // defpackage.jd4
    public final long p() {
        return this.f.d;
    }

    @Override // defpackage.jd4
    public final long q(long j, long j2) {
        return this.f.b(j, j2);
    }

    @Override // defpackage.ozf
    public final jd4 b() {
        return this;
    }
}
