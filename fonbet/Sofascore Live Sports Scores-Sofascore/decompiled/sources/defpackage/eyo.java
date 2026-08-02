package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzav;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzzr;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eyo {
    public static final zzxo t = new zzxo(new Object(), -1);
    public final zzbf a;
    public final zzxo b;
    public final long c;
    public final long d;
    public final int e;
    public final zzjn f;
    public final boolean g;
    public final zzzr h;
    public final zzabm i;
    public final List j;
    public final zzxo k;
    public final boolean l;
    public final int m;
    public final int n;
    public final zzav o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public eyo(zzbf zzbfVar, zzxo zzxoVar, long j, long j2, int i, zzjn zzjnVar, boolean z, zzzr zzzrVar, zzabm zzabmVar, List list, zzxo zzxoVar2, boolean z2, int i2, int i3, zzav zzavVar, long j3, long j4, long j5, long j6) {
        this.a = zzbfVar;
        this.b = zzxoVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = zzjnVar;
        this.g = z;
        this.h = zzzrVar;
        this.i = zzabmVar;
        this.j = list;
        this.k = zzxoVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = zzavVar;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.s = j6;
    }

    public static eyo a(zzabm zzabmVar) {
        uln ulnVar = zzbf.a;
        zzzr zzzrVar = zzzr.d;
        mio mioVar = zzgxm.b;
        s sVar = s.e;
        zzav zzavVar = zzav.d;
        zzxo zzxoVar = t;
        return new eyo(ulnVar, zzxoVar, C.TIME_UNSET, 0L, 1, null, false, zzzrVar, zzabmVar, sVar, zzxoVar, false, 1, 0, zzavVar, 0L, 0L, 0L, 0L);
    }

    public final eyo b(zzxo zzxoVar, long j, long j2, long j3, long j4, zzzr zzzrVar, zzabm zzabmVar, List list) {
        zzxo zzxoVar2 = this.k;
        boolean z = this.l;
        int i = this.m;
        int i2 = this.n;
        zzav zzavVar = this.o;
        long j5 = this.p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new eyo(this.a, zzxoVar, j2, j3, this.e, this.f, this.g, zzzrVar, zzabmVar, list, zzxoVar2, z, i, i2, zzavVar, j5, j4, j, elapsedRealtime);
    }

    public final eyo c(zzbf zzbfVar) {
        return new eyo(zzbfVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final eyo d(int i) {
        return new eyo(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final eyo e(zzjn zzjnVar) {
        return new eyo(this.a, this.b, this.c, this.d, this.e, zzjnVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final eyo f(boolean z) {
        return new eyo(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final eyo g(zzxo zzxoVar) {
        return new eyo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, zzxoVar, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    public final eyo h(int i, int i2, boolean z) {
        return new eyo(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.p, this.q, this.r, this.s);
    }

    public final boolean i() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
