package com.google.android.gms.internal.cast;

import defpackage.uxf;
import defpackage.wfp;
import defpackage.zfp;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqz extends zzyd implements zzzj {
    private static final zzqz zzm;
    private int zzb;
    private zzrp zzd;
    private long zze;
    private int zzf;
    private zzyl zzg;
    private zzyl zzh;
    private zzyl zzi;
    private zzyl zzj;
    private zzyl zzk;
    private int zzl;

    static {
        zzqz zzqzVar = new zzqz();
        zzm = zzqzVar;
        zzyd.g(zzqz.class, zzqzVar);
    }

    private zzqz() {
        wfp wfpVar = wfp.e;
        this.zzg = wfpVar;
        this.zzh = wfpVar;
        this.zzi = wfpVar;
        this.zzj = wfpVar;
        this.zzk = wfpVar;
    }

    public static zzqy n() {
        return (zzqy) zzm.d();
    }

    @Override // com.google.android.gms.internal.cast.zzyd
    public final Object i(int i, zzyd zzydVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zfp(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", uxf.C, "zzg", zzqx.class, "zzh", zzqt.class, "zzi", zzrd.class, "zzj", zzrb.class, "zzk", zzqv.class, "zzl"});
        }
        if (i2 == 3) {
            return new zzqz();
        }
        if (i2 == 4) {
            return new zzqy(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }

    public final /* synthetic */ void o(zzrp zzrpVar) {
        this.zzd = zzrpVar;
        this.zzb |= 1;
    }

    public final /* synthetic */ void p(long j) {
        this.zzb |= 2;
        this.zze = j;
    }

    public final void q(ArrayList arrayList) {
        zzyl zzylVar = this.zzg;
        if (!zzylVar.zza()) {
            int size = zzylVar.size();
            this.zzg = zzylVar.zzf(size + size);
        }
        zzwz.b(this.zzg, arrayList);
    }

    public final void r(ArrayList arrayList) {
        zzyl zzylVar = this.zzh;
        if (!zzylVar.zza()) {
            int size = zzylVar.size();
            this.zzh = zzylVar.zzf(size + size);
        }
        zzwz.b(this.zzh, arrayList);
    }

    public final void s(ArrayList arrayList) {
        zzyl zzylVar = this.zzi;
        if (!zzylVar.zza()) {
            int size = zzylVar.size();
            this.zzi = zzylVar.zzf(size + size);
        }
        zzwz.b(this.zzi, arrayList);
    }

    public final void v(ArrayList arrayList) {
        zzyl zzylVar = this.zzj;
        if (!zzylVar.zza()) {
            int size = zzylVar.size();
            this.zzj = zzylVar.zzf(size + size);
        }
        zzwz.b(this.zzj, arrayList);
    }

    public final void w(ArrayList arrayList) {
        zzyl zzylVar = this.zzk;
        if (!zzylVar.zza()) {
            int size = zzylVar.size();
            this.zzk = zzylVar.zzf(size + size);
        }
        zzwz.b(this.zzk, arrayList);
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 8;
        this.zzl = i;
    }
}
