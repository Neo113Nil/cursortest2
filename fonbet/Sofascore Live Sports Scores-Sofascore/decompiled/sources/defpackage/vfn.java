package defpackage;

import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vfn {
    public final ufn a;
    public final zzaht b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public vfn(int i, ufn ufnVar, zzaht zzahtVar) {
        int i2 = ufnVar.d;
        this.a = ufnVar;
        int a = ufnVar.a();
        boolean z = true;
        if (a != 1) {
            if (a == 2) {
                a = 2;
            } else {
                z = false;
            }
        }
        zzguk.a(z);
        int i3 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        this.e = zzfm.w(i2, ufnVar.b * 1000000, ufnVar.c, RoundingMode.DOWN);
        this.b = zzahtVar;
        this.d = a == 2 ? 1650720768 | i3 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final zzahi a(long j) {
        if (this.k == 0) {
            zzahl zzahlVar = new zzahl(0L, this.l);
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i = (int) (j / (this.e / this.f));
        int r = zzfm.r(this.n, i, true, true);
        if (this.n[r] == i) {
            zzahl b = b(r);
            return new zzahi(b, b);
        }
        zzahl b2 = b(r);
        int i2 = r + 1;
        return i2 < this.m.length ? new zzahi(b2, b(i2)) : new zzahi(b2, b2);
    }

    public final zzahl b(int i) {
        return new zzahl((this.e / this.f) * this.n[i], this.m[i]);
    }
}
