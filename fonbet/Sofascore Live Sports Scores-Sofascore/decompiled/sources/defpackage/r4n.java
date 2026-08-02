package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgwz;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r4n extends y5n implements Comparable {
    public final int e;
    public final boolean f;
    public final String g;
    public final zzaaq h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public r4n(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, boolean z, e5n e5nVar) {
        super(i, zzbgVar, i2);
        int i4;
        int i5;
        int hashCode;
        int i6;
        boolean z2;
        this.h = zzaaqVar;
        boolean z3 = zzaaqVar.z;
        zzgxm zzgxmVar = zzaaqVar.p;
        zzgxm zzgxmVar2 = zzaaqVar.l;
        int i7 = 1;
        int i8 = true != z3 ? 16 : 24;
        this.g = zzabc.j(this.d.d);
        this.i = zzng.d(i3, false);
        int i9 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i9 >= zzgxmVar2.size()) {
                i5 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            } else {
                i5 = zzabc.k(this.d, (String) zzgxmVar2.get(i9), false);
                if (i5 > 0) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        this.k = i9;
        this.j = i5;
        int i10 = this.d.f;
        this.l = (i10 == 0 || i10 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.m = zzabc.l(this.d, zzaaqVar.m);
        zzv zzvVar = this.d;
        int i11 = zzvVar.f;
        this.n = i11 == 0 || (i11 & 1) != 0;
        this.q = 1 == (zzvVar.e & 1);
        String str = zzvVar.o;
        this.x = str != null && ((hashCode = str.hashCode()) == -2123537834 ? str.equals(MimeTypes.AUDIO_E_AC3_JOC) : !(hashCode == 187078297 ? !str.equals("audio/ac4") : !(hashCode == 1504698186 && str.equals("audio/iamf"))));
        int i12 = zzvVar.H;
        this.r = i12;
        this.s = zzvVar.J;
        int i13 = zzvVar.j;
        this.t = i13;
        this.f = (i13 == -1 || i13 <= zzaaqVar.o) && (i12 == -1 || i12 <= zzaaqVar.n) && e5nVar.zza(zzvVar);
        String str2 = zzfm.a;
        String[] split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        for (int i14 = 0; i14 < split.length; i14++) {
            split[i14] = zzfm.q(split[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= split.length) {
                i6 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzabc.k(this.d, split[i15], false);
                if (i6 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.o = i15;
        this.p = i6;
        int i16 = 0;
        while (true) {
            if (i16 >= zzgxmVar.size()) {
                break;
            }
            String str3 = this.d.o;
            if (str3 != null && str3.equals(zzgxmVar.get(i16))) {
                i4 = i16;
                break;
            }
            i16++;
        }
        this.u = i4;
        this.v = (i3 & 384) == 128;
        this.w = (i3 & 64) == 64;
        zzaaq zzaaqVar2 = this.h;
        if (zzng.d(i3, zzaaqVar2.B) && ((z2 = this.f) || zzaaqVar2.y)) {
            zzaaqVar2.q.getClass();
            if (zzng.d(i3, false) && z2 && this.d.j != -1 && ((zzaaqVar2.C || !z) && (i8 & i3) != 0)) {
                i7 = 2;
            }
        } else {
            i7 = 0;
        }
        this.e = i7;
    }

    @Override // defpackage.y5n
    public final /* bridge */ /* synthetic */ boolean a(y5n y5nVar) {
        String str;
        int i;
        r4n r4nVar = (r4n) y5nVar;
        this.h.getClass();
        zzv zzvVar = this.d;
        int i2 = zzvVar.H;
        if (i2 == -1) {
            return false;
        }
        zzv zzvVar2 = r4nVar.d;
        return i2 == zzvVar2.H && (str = zzvVar.o) != null && TextUtils.equals(str, zzvVar2.o) && (i = zzvVar.J) != -1 && i == zzvVar2.J && this.v == r4nVar.v && this.w == r4nVar.w;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r4n r4nVar) {
        Comparator pjoVar;
        boolean z = this.i;
        boolean z2 = this.f;
        if (z2 && z) {
            pjoVar = zzabc.k;
        } else {
            gio gioVar = zzabc.k;
            gioVar.getClass();
            pjoVar = new pjo(gioVar);
        }
        zzgwz d = zzgwz.a.d(z, r4nVar.i);
        Integer valueOf = Integer.valueOf(this.k);
        Integer valueOf2 = Integer.valueOf(r4nVar.k);
        ijo.a.getClass();
        ojo ojoVar = ojo.a;
        zzgwz a = d.a(valueOf, valueOf2, ojoVar).b(this.j, r4nVar.j).b(this.l, r4nVar.l).a(Integer.valueOf(this.m), Integer.valueOf(r4nVar.m), ojoVar).d(this.q, r4nVar.q).d(this.n, r4nVar.n).a(Integer.valueOf(this.o), Integer.valueOf(r4nVar.o), ojoVar).b(this.p, r4nVar.p).d(z2, r4nVar.f).a(Integer.valueOf(this.u), Integer.valueOf(r4nVar.u), ojoVar);
        this.h.getClass();
        zzgwz a2 = a.d(this.v, r4nVar.v).d(this.w, r4nVar.w).d(this.x, r4nVar.x).a(Integer.valueOf(this.r), Integer.valueOf(r4nVar.r), pjoVar).a(Integer.valueOf(this.s), Integer.valueOf(r4nVar.s), pjoVar);
        if (Objects.equals(this.g, r4nVar.g)) {
            a2 = a2.a(Integer.valueOf(this.t), Integer.valueOf(r4nVar.t), pjoVar);
        }
        return a2.e();
    }

    @Override // defpackage.y5n
    public final int zza() {
        return this.e;
    }
}
