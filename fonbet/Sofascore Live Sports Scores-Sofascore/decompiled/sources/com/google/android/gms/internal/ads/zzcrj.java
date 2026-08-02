package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzfr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbmc;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcrj;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfnb;
import defpackage.a6o;
import defpackage.fsn;
import defpackage.hsn;
import defpackage.inn;
import defpackage.nkn;
import defpackage.r1o;
import defpackage.wjn;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcrj extends com.google.android.gms.ads.internal.client.zzcx {
    public final Context a;
    public final VersionInfoParcel b;
    public final zzdya c;
    public final zzems d;
    public final zzesu e;
    public final zzecu f;
    public final zzcer g;
    public final zzdyf h;
    public final zzedp i;
    public final zzbmb j;
    public final zzfrj k;
    public final zzfms l;
    public final zzdaw m;
    public final zzeaj n;
    public final zzeew o;
    public boolean p = false;
    public final Long q = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    public zzcrj(Context context, VersionInfoParcel versionInfoParcel, zzdya zzdyaVar, zzems zzemsVar, zzesu zzesuVar, zzecu zzecuVar, zzcer zzcerVar, zzdyf zzdyfVar, zzedp zzedpVar, zzbmb zzbmbVar, zzfrj zzfrjVar, zzfms zzfmsVar, zzdaw zzdawVar, zzeaj zzeajVar, zzeew zzeewVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = zzdyaVar;
        this.d = zzemsVar;
        this.e = zzesuVar;
        this.f = zzecuVar;
        this.g = zzcerVar;
        this.h = zzdyfVar;
        this.i = zzedpVar;
        this.j = zzbmbVar;
        this.k = zzfrjVar;
        this.l = zzfmsVar;
        this.m = zzdawVar;
        this.n = zzeajVar;
        this.o = zzeewVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zze() {
        if (this.p) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        Context context = this.a;
        zzbjg.a(context);
        com.google.android.gms.ads.internal.zzt.zzh().b(context, this.b, this.n);
        this.m.a();
        com.google.android.gms.ads.internal.zzt.zzj().a(context);
        final int i2 = 1;
        this.p = true;
        this.f.a();
        zzesu zzesuVar = this.e;
        zzesuVar.getClass();
        final int i3 = 2;
        com.google.android.gms.ads.internal.zzt.zzh().g().zzk(new a6o(zzesuVar, 2));
        final int i4 = 0;
        zzesuVar.f.execute(new a6o(zzesuVar, 0));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d5)).booleanValue()) {
            zzdyf zzdyfVar = this.h;
            if (!zzdyfVar.f.getAndSet(true)) {
                com.google.android.gms.ads.internal.zzt.zzh().g().zzk(new r1o(zzdyfVar, 0));
            }
            zzdyfVar.c.execute(new r1o(zzdyfVar, 2));
        }
        this.i.a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue()) {
            final int i5 = 3;
            zzcgj.a.execute(new Runnable(this) { // from class: nvn
                public final /* synthetic */ zzcrj b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String b;
                    int i6 = i5;
                    zzcrj zzcrjVar = this.b;
                    switch (i6) {
                        case 0:
                            zzfnb.a(zzcrjVar.a, true);
                            break;
                        case 1:
                            zzbkf zzn = zzt.zzn();
                            Context context2 = zzcrjVar.a;
                            zzeaj zzeajVar = zzcrjVar.n;
                            if (!zzn.b.getAndSet(true)) {
                                zzn.c = context2;
                                zzn.d = zzeajVar;
                                if (zzn.f == null && context2 != null && (b = ba4.b(context2)) != null && !b.equals(context2.getPackageName())) {
                                    ba4.a(context2, b, zzn);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zzcau zzcauVar = new zzcau();
                            zzbmb zzbmbVar = zzcrjVar.j;
                            zzbmbVar.getClass();
                            try {
                                zzbmc zzbmcVar = (zzbmc) zzs.zza(zzbmbVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", wkf.b);
                                Parcel J = zzbmcVar.J();
                                zzbew.e(J, zzcauVar);
                                zzbmcVar.Z1(J, 1);
                                break;
                            } catch (RemoteException e) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                return;
                            }
                        default:
                            if (zzt.zzh().g().zzJ()) {
                                if (!zzt.zzo().zze(zzcrjVar.a, zzt.zzh().g().zzL(), zzcrjVar.b.afmaVersion)) {
                                    zzt.zzh().g().zzK(false);
                                    zzt.zzh().g().zzM("");
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cc)).booleanValue()) {
            zzcgj.a.execute(new Runnable(this) { // from class: nvn
                public final /* synthetic */ zzcrj b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String b;
                    int i6 = i3;
                    zzcrj zzcrjVar = this.b;
                    switch (i6) {
                        case 0:
                            zzfnb.a(zzcrjVar.a, true);
                            break;
                        case 1:
                            zzbkf zzn = zzt.zzn();
                            Context context2 = zzcrjVar.a;
                            zzeaj zzeajVar = zzcrjVar.n;
                            if (!zzn.b.getAndSet(true)) {
                                zzn.c = context2;
                                zzn.d = zzeajVar;
                                if (zzn.f == null && context2 != null && (b = ba4.b(context2)) != null && !b.equals(context2.getPackageName())) {
                                    ba4.a(context2, b, zzn);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zzcau zzcauVar = new zzcau();
                            zzbmb zzbmbVar = zzcrjVar.j;
                            zzbmbVar.getClass();
                            try {
                                zzbmc zzbmcVar = (zzbmc) zzs.zza(zzbmbVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", wkf.b);
                                Parcel J = zzbmcVar.J();
                                zzbew.e(J, zzcauVar);
                                zzbmcVar.Z1(J, 1);
                                break;
                            } catch (RemoteException e) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                return;
                            }
                        default:
                            if (zzt.zzh().g().zzJ()) {
                                if (!zzt.zzo().zze(zzcrjVar.a, zzt.zzh().g().zzL(), zzcrjVar.b.afmaVersion)) {
                                    zzt.zzh().g().zzK(false);
                                    zzt.zzh().g().zzM("");
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a4)).booleanValue()) {
            zzcgj.a.execute(new Runnable(this) { // from class: nvn
                public final /* synthetic */ zzcrj b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String b;
                    int i6 = i4;
                    zzcrj zzcrjVar = this.b;
                    switch (i6) {
                        case 0:
                            zzfnb.a(zzcrjVar.a, true);
                            break;
                        case 1:
                            zzbkf zzn = zzt.zzn();
                            Context context2 = zzcrjVar.a;
                            zzeaj zzeajVar = zzcrjVar.n;
                            if (!zzn.b.getAndSet(true)) {
                                zzn.c = context2;
                                zzn.d = zzeajVar;
                                if (zzn.f == null && context2 != null && (b = ba4.b(context2)) != null && !b.equals(context2.getPackageName())) {
                                    ba4.a(context2, b, zzn);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            zzcau zzcauVar = new zzcau();
                            zzbmb zzbmbVar = zzcrjVar.j;
                            zzbmbVar.getClass();
                            try {
                                zzbmc zzbmcVar = (zzbmc) zzs.zza(zzbmbVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", wkf.b);
                                Parcel J = zzbmcVar.J();
                                zzbew.e(J, zzcauVar);
                                zzbmcVar.Z1(J, 1);
                                break;
                            } catch (RemoteException e) {
                                zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                return;
                            } catch (zzr e2) {
                                zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                return;
                            }
                        default:
                            if (zzt.zzh().g().zzJ()) {
                                if (!zzt.zzo().zze(zzcrjVar.a, zzt.zzh().g().zzL(), zzcrjVar.b.afmaVersion)) {
                                    zzt.zzh().g().zzK(false);
                                    zzt.zzh().g().zzM("");
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I5)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J5)).booleanValue()) {
                zzcgj.a.execute(new Runnable(this) { // from class: nvn
                    public final /* synthetic */ zzcrj b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b;
                        int i6 = i2;
                        zzcrj zzcrjVar = this.b;
                        switch (i6) {
                            case 0:
                                zzfnb.a(zzcrjVar.a, true);
                                break;
                            case 1:
                                zzbkf zzn = zzt.zzn();
                                Context context2 = zzcrjVar.a;
                                zzeaj zzeajVar = zzcrjVar.n;
                                if (!zzn.b.getAndSet(true)) {
                                    zzn.c = context2;
                                    zzn.d = zzeajVar;
                                    if (zzn.f == null && context2 != null && (b = ba4.b(context2)) != null && !b.equals(context2.getPackageName())) {
                                        ba4.a(context2, b, zzn);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                zzcau zzcauVar = new zzcau();
                                zzbmb zzbmbVar = zzcrjVar.j;
                                zzbmbVar.getClass();
                                try {
                                    zzbmc zzbmcVar = (zzbmc) zzs.zza(zzbmbVar.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", wkf.b);
                                    Parcel J = zzbmcVar.J();
                                    zzbew.e(J, zzcauVar);
                                    zzbmcVar.Z1(J, 1);
                                    break;
                                } catch (RemoteException e) {
                                    zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
                                    return;
                                } catch (zzr e2) {
                                    zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
                                    return;
                                }
                            default:
                                if (zzt.zzh().g().zzJ()) {
                                    if (!zzt.zzo().zze(zzcrjVar.a, zzt.zzh().g().zzL(), zzcrjVar.b.afmaVersion)) {
                                        zzt.zzh().g().zzK(false);
                                        zzt.zzh().g().zzM("");
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.X5)).booleanValue()) {
            zzeew zzeewVar = this.o;
            hsn hsnVar = zzcgj.f;
            Objects.requireNonNull(zzeewVar);
            hsnVar.execute(new fsn(zzeewVar, 10));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzg(String str) {
        Context context = this.a;
        zzbjg.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b5)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.b, str, null, this.k, null, null, this.i.f());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzh(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.b.afmaVersion);
            zzatVar.zzb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.google.android.gms.ads.internal.client.zzcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(String str, IObjectWrapper iObjectWrapper) {
        String zzr;
        String str2;
        wjn wjnVar;
        Context context = this.a;
        zzbjg.a(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i5)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzr = com.google.android.gms.ads.internal.util.zzs.zzr(context);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("NonagonMobileAdsSettingManager_AppId", e);
            }
            boolean z = true;
            str2 = true != TextUtils.isEmpty(zzr) ? str : zzr;
            if (TextUtils.isEmpty(str2)) {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b5)).booleanValue();
                inn innVar = zzbjg.I1;
                boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                    wjnVar = new wjn(8, this, (Runnable) ObjectWrapper.Z1(iObjectWrapper));
                } else {
                    wjnVar = null;
                    z = booleanValue2;
                }
                wjn wjnVar2 = wjnVar;
                if (z) {
                    com.google.android.gms.ads.internal.zzt.zzl().zza(this.a, this.b, str2, wjnVar2, this.k, this.n, this.q, this.i.f());
                    return;
                }
                return;
            }
            return;
        }
        zzr = "";
        boolean z2 = true;
        if (true != TextUtils.isEmpty(zzr)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() {
        return this.b.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) {
        this.e.b(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbvu zzbvuVar) {
        this.l.b(zzbvuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbso zzbsoVar) {
        zzecu zzecuVar = this.f;
        zzecuVar.getClass();
        zzecuVar.e.addListener(new nkn(zzecuVar, zzbsoVar, false, 16), zzecuVar.j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() {
        return this.f.b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) {
        zzcer zzcerVar = this.g;
        Context context = this.a;
        zzcerVar.getClass();
        zzcek a = zzces.b(context).a();
        a.b.a(-1, a.a.a());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.h1)).booleanValue() && zzcerVar.a(context) && zzcer.g(context)) {
            synchronized (zzcerVar.j) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
        this.f.q = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) {
        this.i.e(zzdkVar, zzedo.b);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) {
        try {
            zzgdk.a(this.a).b(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Wa)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().g = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzw() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.m3)).booleanValue()) {
            zzbur zzr = com.google.android.gms.ads.internal.zzt.zzr();
            synchronized (zzr.a) {
                try {
                    zzbva zzbvaVar = zzr.c;
                    if (zzbvaVar != null) {
                        zzbum zzbumVar = zzbvaVar.a;
                        zzbul zzbulVar = zzbumVar.f;
                        if (zzbulVar != null) {
                            zzbulVar.f();
                            zzbumVar.f = null;
                        }
                        zzr.c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n3)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzd();
            }
        }
    }
}
