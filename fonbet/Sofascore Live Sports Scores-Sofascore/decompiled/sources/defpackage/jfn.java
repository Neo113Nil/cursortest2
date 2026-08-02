package defpackage;

import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzac;
import com.google.android.gms.internal.consent_sdk.zzan;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzar;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzbr;
import com.google.android.gms.internal.consent_sdk.zzcp;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzcs;
import com.google.android.gms.internal.consent_sdk.zzf;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.consent_sdk.zzk;
import com.google.android.gms.internal.consent_sdk.zzm;
import com.google.android.gms.internal.consent_sdk.zzq;
import com.google.android.gms.internal.consent_sdk.zztg;
import com.google.android.gms.internal.consent_sdk.zzti;
import com.google.android.gms.internal.consent_sdk.zzx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jfn extends zza {
    public final jfn b = this;
    public final zzti c;
    public final zztg d;
    public final zztg e;
    public final zztg f;
    public final zztg g;
    public final zzap h;
    public final zztg i;
    public final zztg j;

    public jfn(Application application) {
        zzti zztiVar = new zzti(application);
        this.c = zztiVar;
        zztg a = zztg.a(new zzar(zztiVar));
        this.d = a;
        zztg a2 = zztg.a(ebn.a);
        this.e = a2;
        b1l b1lVar = new b1l(this, 3);
        int i = gkn.a;
        zztg a3 = zztg.a(new zzbr(b1lVar));
        this.f = a3;
        zzq zzqVar = new zzq(zztiVar, a);
        zztg a4 = zztg.a(new zzf());
        this.g = a4;
        zzap zzapVar = new zzap(a, zztg.a(new zzm(zztiVar, zztg.a(new zzan(zztiVar)))), zztiVar);
        this.h = zzapVar;
        zztg a5 = zztg.a(new zzcp(zztiVar));
        int i2 = gjn.a;
        zztg a6 = zztg.a(new zzcs(a2, a5, zztiVar));
        this.i = a6;
        zzac zzacVar = new zzac(a4, zzapVar, a, a6);
        int i3 = vjn.a;
        this.j = zztg.a(new zzk(a, new zzx(zztiVar, a2, a, a3, zzqVar, zzacVar, a4, a6), a3, a6));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzj b() {
        return (zzj) this.j.zzb();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzbq c() {
        return (zzbq) this.f.zzb();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzcr d() {
        return (zzcr) this.i.zzb();
    }
}
