package defpackage;

import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzmd;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zznm;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzi;
import com.google.android.gms.internal.ads.zzzr;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rfp implements zzxm, zzxl {
    public final zzxm a;
    public final long b;
    public zzxl c;

    public rfp(zzxm zzxmVar, long j) {
        this.a = zzxmVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void a(long j) {
        this.a.a(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void c(zzzi zzziVar) {
        zzxl zzxlVar = this.c;
        zzxlVar.getClass();
        zzxlVar.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long d(long j) {
        zzxm zzxmVar = this.a;
        long j2 = this.b;
        return zzxmVar.d(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void e(zzxl zzxlVar, long j) {
        this.c = zzxlVar;
        this.a.e(this, j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean f(zzme zzmeVar) {
        long j = zzmeVar.a;
        zzmd zzmdVar = new zzmd();
        zzmdVar.b = zzmeVar.b;
        zzmdVar.c = zzmeVar.c;
        zzmdVar.a = j - this.b;
        return this.a.f(new zzme(zzmdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long g(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j) {
        zzzg[] zzzgVarArr2 = new zzzg[zzzgVarArr.length];
        int i = 0;
        while (true) {
            zzzg zzzgVar = null;
            if (i >= zzzgVarArr.length) {
                break;
            }
            ofp ofpVar = (ofp) zzzgVarArr[i];
            if (ofpVar != null) {
                zzzgVar = ofpVar.a;
            }
            zzzgVarArr2[i] = zzzgVar;
            i++;
        }
        long j2 = this.b;
        long g = this.a.g(zzabeVarArr, zArr, zzzgVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzzgVarArr.length; i2++) {
            zzzg zzzgVar2 = zzzgVarArr2[i2];
            if (zzzgVar2 == null) {
                zzzgVarArr[i2] = null;
            } else {
                zzzg zzzgVar3 = zzzgVarArr[i2];
                if (zzzgVar3 == null || ((ofp) zzzgVar3).a != zzzgVar2) {
                    zzzgVarArr[i2] = new ofp(zzzgVar2, j2);
                }
            }
        }
        return g + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long h(long j, zznm zznmVar) {
        zzxm zzxmVar = this.a;
        long j2 = this.b;
        return zzxmVar.h(j - j2, zznmVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void i(zzxm zzxmVar) {
        zzxl zzxlVar = this.c;
        zzxlVar.getClass();
        zzxlVar.i(this);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        long zzb = this.a.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        long zzc = this.a.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() {
        this.a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        return this.a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j) {
        this.a.zzq(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        long zzr = this.a.zzr();
        return zzr == C.TIME_UNSET ? C.TIME_UNSET : zzr + this.b;
    }
}
