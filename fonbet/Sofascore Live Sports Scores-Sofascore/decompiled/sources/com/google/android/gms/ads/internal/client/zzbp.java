package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnr;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbob;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbtc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbp extends zzbev implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        zzbnz zzbnxVar;
        zzbh zzbhVar = null;
        zzbtc zzbtcVar = null;
        zzbog zzbogVar = null;
        zzbod zzbodVar = null;
        zzcp zzcpVar = null;
        zzbnw zzbnwVar = null;
        zzbnt zzbntVar = null;
        zzbnq zzbnqVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                zzbew.e(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                zzbew.f(parcel);
                zzf(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    zzbnqVar = queryLocalInterface2 instanceof zzbnq ? (zzbnq) queryLocalInterface2 : new zzbno(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                }
                zzbew.f(parcel);
                zzg(zzbnqVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    zzbntVar = queryLocalInterface3 instanceof zzbnt ? (zzbnt) queryLocalInterface3 : new zzbnr(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                }
                zzbew.f(parcel);
                zzh(zzbntVar);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    zzbnxVar = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    zzbnxVar = queryLocalInterface4 instanceof zzbnz ? (zzbnz) queryLocalInterface4 : new zzbnx(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    zzbnwVar = queryLocalInterface5 instanceof zzbnw ? (zzbnw) queryLocalInterface5 : new zzbnu(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                }
                zzbew.f(parcel);
                zzi(readString, zzbnxVar, zzbnwVar);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbmk zzbmkVar = (zzbmk) zzbew.b(parcel, zzbmk.CREATOR);
                zzbew.f(parcel);
                zzj(zzbmkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = queryLocalInterface6 instanceof zzcp ? (zzcp) queryLocalInterface6 : new zzcp(readStrongBinder6);
                }
                zzbew.f(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    zzbodVar = queryLocalInterface7 instanceof zzbod ? (zzbod) queryLocalInterface7 : new zzbob(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                }
                zzr zzrVar = (zzr) zzbew.b(parcel, zzr.CREATOR);
                zzbew.f(parcel);
                zzk(zzbodVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbew.b(parcel, PublisherAdViewOptions.CREATOR);
                zzbew.f(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    zzbogVar = queryLocalInterface8 instanceof zzbog ? (zzbog) queryLocalInterface8 : new zzboe(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                }
                zzbew.f(parcel);
                zzm(zzbogVar);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbst zzbstVar = (zzbst) zzbew.b(parcel, zzbst.CREATOR);
                zzbew.f(parcel);
                zzn(zzbstVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    zzbtcVar = queryLocalInterface9 instanceof zzbtc ? (zzbtc) queryLocalInterface9 : new zzbta(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                }
                zzbew.f(parcel);
                zzo(zzbtcVar);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbew.b(parcel, AdManagerAdViewOptions.CREATOR);
                zzbew.f(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
