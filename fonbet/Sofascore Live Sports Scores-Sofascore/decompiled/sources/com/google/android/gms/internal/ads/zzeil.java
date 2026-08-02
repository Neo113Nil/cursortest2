package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ewm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeil {
    public final Context a;
    public final zzhdi b;
    public final zzhdi c;
    public final zzinq d;
    public final VersionInfoParcel e;
    public final zzeaj f;

    public zzeil(Context context, zzhdi zzhdiVar, zzhdi zzhdiVar2, zzinq zzinqVar, VersionInfoParcel versionInfoParcel, ewm ewmVar, zzeaj zzeajVar) {
        this.a = context;
        this.b = zzhdiVar;
        this.c = zzhdiVar2;
        this.d = zzinqVar;
        this.e = versionInfoParcel;
        this.f = zzeajVar;
    }

    public final void a() {
        try {
            ((zzejg) this.d.zzb()).zzi(this.e.afmaVersion);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Uf)).booleanValue()) {
                zzeai a = this.f.a();
                a.b("action", "ptard");
                a.b("ptard", "l");
                a.c();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Vf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().d("Preconnect Local", e);
            }
        }
    }
}
