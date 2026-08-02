package defpackage;

import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgym;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zznm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzwy;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzxm;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzi;
import com.google.android.gms.internal.ads.zzzr;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jdp implements zzxm, zzxl {
    public final zzxm[] a;
    public final boolean[] b;
    public final IdentityHashMap c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public zzxl f;
    public zzzr g;
    public zzxm[] h;
    public zzwy i;

    public jdp(long[] jArr, zzxm... zzxmVarArr) {
        this.a = zzxmVarArr;
        mio mioVar = zzgxm.b;
        s sVar = s.e;
        this.i = new zzwy(sVar, sVar);
        this.c = new IdentityHashMap();
        this.h = new zzxm[0];
        this.b = new boolean[zzxmVarArr.length];
        for (int i = 0; i < zzxmVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new rfp(zzxmVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void a(long j) {
        this.i.a(j);
    }

    @Override // com.google.android.gms.internal.ads.zzzh
    public final /* bridge */ /* synthetic */ void c(zzzi zzziVar) {
        zzxl zzxlVar = this.f;
        zzxlVar.getClass();
        zzxlVar.c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long d(long j) {
        long d = this.h[0].d(j);
        int i = 1;
        while (true) {
            zzxm[] zzxmVarArr = this.h;
            if (i >= zzxmVarArr.length) {
                return d;
            }
            if (zzxmVarArr[i].d(d) != d) {
                a70.r("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void e(zzxl zzxlVar, long j) {
        this.f = zzxlVar;
        ArrayList arrayList = this.d;
        zzxm[] zzxmVarArr = this.a;
        Collections.addAll(arrayList, zzxmVarArr);
        for (zzxm zzxmVar : zzxmVarArr) {
            zzxmVar.e(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean f(zzme zzmeVar) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.f(zzmeVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzxm) arrayList.get(i)).f(zzmeVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long g(zzabe[] zzabeVarArr, boolean[] zArr, zzzg[] zzzgVarArr, boolean[] zArr2, long j) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = zzabeVarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = zzabeVarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            zzzg zzzgVar = zzzgVarArr[i2];
            Integer num = zzzgVar == null ? null : (Integer) identityHashMap.get(zzzgVar);
            iArr3[i2] = num == null ? -1 : num.intValue();
            zzabe zzabeVar = zzabeVarArr[i2];
            if (zzabeVar != null) {
                String str = zzabeVar.zza().b;
                iArr4[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        zzzg[] zzzgVarArr2 = new zzzg[length];
        zzzg[] zzzgVarArr3 = new zzzg[length];
        zzabe[] zzabeVarArr2 = new zzabe[length];
        zzxm[] zzxmVarArr = this.a;
        ArrayList arrayList = new ArrayList(zzxmVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzxmVarArr.length) {
            int i4 = i;
            while (i4 < zzabeVarArr.length) {
                zzzgVarArr3[i4] = iArr3[i4] == i3 ? zzzgVarArr[i4] : null;
                if (iArr4[i4] == i3) {
                    zzabe zzabeVar2 = zzabeVarArr[i4];
                    zzabeVar2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    zzbg zzbgVar = (zzbg) this.e.get(zzabeVar2.zza());
                    zzbgVar.getClass();
                    zzabeVarArr2[i4] = new gdp(zzabeVar2, zzbgVar);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    zzabeVarArr2[i4] = null;
                }
                i4++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            zzxm[] zzxmVarArr2 = zzxmVarArr;
            int i5 = i3;
            long g = zzxmVarArr[i3].g(zzabeVarArr2, zArr, zzzgVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = g;
            } else if (g != j2) {
                a70.r("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzabeVarArr.length; i6++) {
                if (iArr5[i6] == i5) {
                    zzzg zzzgVar2 = zzzgVarArr3[i6];
                    zzzgVar2.getClass();
                    zzzgVarArr2[i6] = zzzgVar2;
                    identityHashMap.put(zzzgVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr6[i6] == i5) {
                    zzguk.f(zzzgVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(zzxmVarArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzxmVarArr = zzxmVarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzzgVarArr2, i7, zzzgVarArr, i7, length);
        this.h = (zzxm[]) arrayList3.toArray(new zzxm[i7]);
        this.i = new zzwy(arrayList3, zzgym.b(arrayList3, ueo.f));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long h(long j, zznm zznmVar) {
        zzxm[] zzxmVarArr = this.h;
        return (zzxmVarArr.length > 0 ? zzxmVarArr[0] : this.a[0]).h(j, zznmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final void i(zzxm zzxmVar) {
        zzxm[] zzxmVarArr;
        ArrayList arrayList = this.d;
        arrayList.remove(zzxmVar);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                zzxmVarArr = this.a;
                if (i >= zzxmVarArr.length) {
                    break;
                }
                i2 += zzxmVarArr[i].zzn().a;
                i++;
            }
            zzbg[] zzbgVarArr = new zzbg[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < zzxmVarArr.length; i4++) {
                zzzr zzn = zzxmVarArr[i4].zzn();
                int i5 = zzn.a;
                int i6 = 0;
                while (i6 < i5) {
                    zzbg a = zzn.a(i6);
                    int i7 = a.a;
                    zzv[] zzvVarArr = new zzv[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        zzv zzvVar = a.d[i8];
                        zzvVar.getClass();
                        zzt zztVar = new zzt(zzvVar);
                        String str = zzvVar.a;
                        if (str == null) {
                            str = "";
                        }
                        zzxm[] zzxmVarArr2 = zzxmVarArr;
                        int i9 = i3;
                        StringBuilder sb = new StringBuilder(str.length() + fn0.a(i4, 1));
                        sb.append(i4);
                        sb.append(":");
                        sb.append(str);
                        zztVar.a = sb.toString();
                        String str2 = zzvVar.m;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(fn0.a(i4, 1) + str2.length());
                            sb2.append(i4);
                            sb2.append(":");
                            sb2.append(str2);
                            zztVar.l = sb2.toString();
                        }
                        zzvVarArr[i8] = new zzv(zztVar);
                        i8++;
                        zzxmVarArr = zzxmVarArr2;
                        i3 = i9;
                    }
                    zzxm[] zzxmVarArr3 = zzxmVarArr;
                    int i10 = i3;
                    String str3 = a.b;
                    StringBuilder sb3 = new StringBuilder(fn0.a(i4, 1) + String.valueOf(str3).length());
                    sb3.append(i4);
                    sb3.append(":");
                    sb3.append(str3);
                    zzbg zzbgVar = new zzbg(sb3.toString(), zzvVarArr);
                    this.e.put(zzbgVar, a);
                    i3 = i10 + 1;
                    zzbgVarArr[i10] = zzbgVar;
                    i6++;
                    zzxmVarArr = zzxmVarArr3;
                }
            }
            this.g = new zzzr(zzbgVarArr);
            zzxl zzxlVar = this.f;
            zzxlVar.getClass();
            zzxlVar.i(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        return this.i.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        return this.i.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return this.i.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm() {
        int i = 0;
        while (true) {
            zzxm[] zzxmVarArr = this.a;
            if (i >= zzxmVarArr.length) {
                return;
            }
            zzxmVarArr[i].zzm();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final zzzr zzn() {
        zzzr zzzrVar = this.g;
        zzzrVar.getClass();
        return zzzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(long j) {
        for (zzxm zzxmVar : this.h) {
            zzxmVar.zzq(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final long zzr() {
        long j = -9223372036854775807L;
        for (zzxm zzxmVar : this.h) {
            long zzr = zzxmVar.zzr();
            if (zzr != C.TIME_UNSET) {
                if (j == C.TIME_UNSET) {
                    for (zzxm zzxmVar2 : this.h) {
                        if (zzxmVar2 == zzxmVar) {
                            break;
                        }
                        if (zzxmVar2.d(zzr) != zzr) {
                            a70.r("Unexpected child seekToUs result.");
                            return 0L;
                        }
                    }
                    j = zzr;
                } else if (zzr != j) {
                    a70.r("Conflicting discontinuities.");
                    return 0L;
                }
            } else if (j != C.TIME_UNSET && zzxmVar.d(j) != j) {
                a70.r("Unexpected child seekToUs result.");
                return 0L;
            }
        }
        return j;
    }
}
