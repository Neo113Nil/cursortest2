package defpackage;

import com.google.android.gms.internal.ads.zzbe;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzxo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g2p {
    public final String a;
    public int b;
    public long c;
    public final zzxo d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zzpy g;

    public g2p(zzpy zzpyVar, String str, int i, zzxo zzxoVar) {
        this.g = zzpyVar;
        this.a = str;
        this.b = i;
        this.c = zzxoVar == null ? -1L : zzxoVar.d;
        if (zzxoVar == null || !zzxoVar.b()) {
            return;
        }
        this.d = zzxoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.a()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(zzbf zzbfVar, zzbf zzbfVar2) {
        zzxo zzxoVar;
        int i = this.b;
        if (i < zzbfVar.a()) {
            zzpy zzpyVar = this.g;
            zzbe zzbeVar = zzpyVar.a;
            zzbfVar.b(i, zzbeVar, 0L);
            for (int i2 = zzbeVar.k; i2 <= zzbeVar.l; i2++) {
                int e = zzbfVar2.e(zzbfVar.f(i2));
                if (e != -1) {
                    i = zzbfVar2.d(e, zzpyVar.b, false).c;
                    break;
                }
            }
            i = -1;
        }
        this.b = i;
        return i != -1 && ((zzxoVar = this.d) == null || zzbfVar2.e(zzxoVar.a) != -1);
    }

    public final boolean b(zznr zznrVar) {
        zzxo zzxoVar = zznrVar.d;
        if (zzxoVar == null) {
            return this.b != zznrVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        long j2 = zzxoVar.d;
        if (j2 > j) {
            return true;
        }
        zzxo zzxoVar2 = this.d;
        if (zzxoVar2 == null) {
            return false;
        }
        zzbf zzbfVar = zznrVar.b;
        int e = zzbfVar.e(zzxoVar.a);
        int e2 = zzbfVar.e(zzxoVar2.a);
        long j3 = zzxoVar2.d;
        int i = zzxoVar2.b;
        if (j2 < j3 || e < e2) {
            return false;
        }
        if (e > e2) {
            return true;
        }
        if (!zzxoVar.b()) {
            int i2 = zzxoVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = zzxoVar.b;
        int i4 = zzxoVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > zzxoVar2.c;
        }
        return true;
    }
}
