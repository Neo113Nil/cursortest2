package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcck;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzcpa;
import com.google.android.gms.internal.ads.zzcrj;
import com.google.android.gms.internal.ads.zzdrk;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeby;
import com.google.android.gms.internal.ads.zzeem;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzetb;
import com.google.android.gms.internal.ads.zzete;
import com.google.android.gms.internal.ads.zzeua;
import com.google.android.gms.internal.ads.zzeub;
import com.google.android.gms.internal.ads.zzfhd;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzfhl;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfiw;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzfud;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;
import com.google.android.gms.internal.ads.zzioe;
import defpackage.dvn;
import defpackage.dzn;
import defpackage.f6o;
import defpackage.qpn;
import defpackage.t8o;
import defpackage.uun;
import defpackage.x6k;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ClientApi extends zzcn {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zza(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        uun uunVar = zzcob.c(context, zzbvuVar, i).c;
        context.getClass();
        zzrVar.getClass();
        str.getClass();
        zzinx a = zzinx.a(context);
        zzinx a2 = zzinx.a(zzrVar);
        zzinv a3 = zzinv.a(new zzeub(uunVar.o));
        zzinv a4 = zzinv.a(f6o.a);
        zzinv a5 = zzinv.a(dzn.a);
        zzinv zzinvVar = uunVar.d;
        zzinx zzinxVar = uunVar.L;
        int i2 = t8o.a;
        zzfhq zzfhqVar = (zzfhq) zzinv.a(new zzfhr(zzinvVar, a3, a4, a5, a, a2, zzinxVar)).zzb();
        zzeua zzeuaVar = (zzeua) a3.zzb();
        zzinv zzinvVar2 = uunVar.o;
        VersionInfoParcel versionInfoParcel = uunVar.b.a;
        zzioe.a(versionInfoParcel);
        return new zzete(context, zzrVar, str, zzfhqVar, zzeuaVar, versionInfoParcel, (zzeaj) zzinvVar2.zzb());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        qpn j = zzcob.c(context, zzbvuVar, i).j();
        context.getClass();
        j.c = context;
        zzrVar.getClass();
        j.e = zzrVar;
        j.i(str);
        return j.c().a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzc(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        return new zzetb(zzcob.c(context, zzbvuVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmz zzd(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdrm((FrameLayout) ObjectWrapper.Z1(iObjectWrapper), (FrameLayout) ObjectWrapper.Z1(iObjectWrapper2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcck zze(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        x6k m = zzcob.c(context, zzbvuVar, i).m();
        m.F(context);
        return (zzfla) ((zzinv) m.B().b).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzt zzf(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.Z1(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new zzw(activity) : new zzag(activity) : new zzac(activity, zza) : new zzaj(activity) : new zzai(activity) : new zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzg(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return (zzfud) zzcob.c((Context) ObjectWrapper.Z1(iObjectWrapper), zzbvuVar, i).K.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzh(IObjectWrapper iObjectWrapper, int i) {
        return (zzcrj) zzcob.c((Context) ObjectWrapper.Z1(iObjectWrapper), null, i).J.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @Deprecated
    public final zzbu zzi(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.Z1(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbne zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdrk((View) ObjectWrapper.Z1(iObjectWrapper), (HashMap) ObjectWrapper.Z1(iObjectWrapper2), (HashMap) ObjectWrapper.Z1(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcda zzk(IObjectWrapper iObjectWrapper, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        x6k m = zzcob.c(context, zzbvuVar, i).m();
        m.F(context);
        m.c = str;
        return m.B().q();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzl(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbvu zzbvuVar, int i) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        uun uunVar = zzcob.c(context, zzbvuVar, i).c;
        str.getClass();
        context.getClass();
        zzinx a = zzinx.a(context);
        zzinx a2 = zzinx.a(str);
        zzinv zzinvVar = uunVar.N0;
        zzfiw zzfiwVar = new zzfiw(zzinvVar, uunVar.O0, a);
        zzinv a3 = zzinv.a(new zzfhd(zzinvVar));
        zzinv zzinvVar2 = uunVar.d;
        zzinx zzinxVar = uunVar.L;
        int i2 = t8o.a;
        zzcpa zzcpaVar = uunVar.j;
        return (zzfhk) zzinv.a(new zzfhl(zzinxVar, a, a2, zzinv.a(new zzfhf(a, zzinvVar2, zzinxVar, zzfiwVar, a3, zzcpaVar)), a3, zzcpaVar, uunVar.o)).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcfe zzm(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return (zzap) zzcob.c((Context) ObjectWrapper.Z1(iObjectWrapper), zzbvuVar, i).V.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzm zzn(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return (zzelp) zzcob.c((Context) ObjectWrapper.Z1(iObjectWrapper), zzbvuVar, i).R.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbrl zzo(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i, zzbri zzbriVar) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        uun uunVar = zzcob.c(context, zzbvuVar, i).c;
        context.getClass();
        zzbriVar.getClass();
        return (zzeby) new dvn(uunVar, context, zzbriVar).e.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzp(IObjectWrapper iObjectWrapper, zzbvu zzbvuVar, int i) {
        return (zzeem) zzcob.c((Context) ObjectWrapper.Z1(iObjectWrapper), zzbvuVar, i).D.zzb();
    }
}
