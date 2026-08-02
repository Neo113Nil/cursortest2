package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jvn;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzepe implements zzemw {
    public final Context a;
    public final zzdpa b;
    public final Executor c;

    public zzepe(Context context, zzdpa zzdpaVar, Executor executor) {
        this.a = context;
        this.b = zzdpaVar;
        this.c = executor;
    }

    public static final boolean c(zzflo zzfloVar, int i) {
        return zzfloVar.a.a.h.contains(Integer.toString(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0528  */
    @Override // com.google.android.gms.internal.ads.zzemw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmd zzfmdVar;
        zzfmu zzfmuVar;
        zzbwf zzbwfVar;
        zzbwj zzbwjVar;
        zzbwg zzbwgVar;
        zzdqr zzdqrVar;
        zzbwg zzbwgVar2;
        zzdqq zzdqqVar;
        zzbmo E4;
        View view;
        String readString;
        ArrayList readArrayList;
        String readString2;
        Bundle bundle;
        String readString3;
        View view2;
        IObjectWrapper S1;
        String readString4;
        String readString5;
        double readDouble;
        zzbmv E42;
        zzdqr zzdqrVar2;
        zzfmu zzfmuVar2 = (zzfmu) zzemtVar.b;
        zzbvx zzbvxVar = zzfmuVar2.a;
        try {
            zzbwf m = zzbvxVar.m();
            try {
                zzbwg zzP = zzbvxVar.zzP();
                try {
                    zzbwj e = zzbvxVar.e();
                    if (e != null && c(zzfloVar, 6)) {
                        zzdqrVar = zzdqr.l(e);
                    } else {
                        if (m == null || !c(zzfloVar, 6)) {
                            if (m == null || !c(zzfloVar, 2)) {
                                zzfmuVar = zzfmuVar2;
                                zzbwfVar = m;
                                zzbwjVar = e;
                                if (zzP != null && c(zzfloVar, 6)) {
                                    try {
                                        zzbwgVar2 = zzP;
                                        try {
                                            Parcel S12 = zzbwgVar2.S1(zzP.J(), 16);
                                            com.google.android.gms.ads.internal.client.zzea zza = com.google.android.gms.ads.internal.client.zzdz.zza(S12.readStrongBinder());
                                            S12.recycle();
                                            zzdqq zzdqqVar2 = zza == null ? null : new zzdqq(zza, null);
                                            Parcel S13 = zzbwgVar2.S1(zzbwgVar2.J(), 19);
                                            zzbmo E43 = zzbmn.E4(S13.readStrongBinder());
                                            S13.recycle();
                                            Parcel S14 = zzbwgVar2.S1(zzbwgVar2.J(), 15);
                                            IObjectWrapper S15 = IObjectWrapper.Stub.S1(S14.readStrongBinder());
                                            S14.recycle();
                                            View view3 = (View) zzdqr.n(S15);
                                            Parcel S16 = zzbwgVar2.S1(zzbwgVar2.J(), 2);
                                            String readString6 = S16.readString();
                                            S16.recycle();
                                            Parcel S17 = zzbwgVar2.S1(zzbwgVar2.J(), 3);
                                            ArrayList readArrayList2 = S17.readArrayList(zzbew.a);
                                            S17.recycle();
                                            Parcel S18 = zzbwgVar2.S1(zzbwgVar2.J(), 4);
                                            String readString7 = S18.readString();
                                            S18.recycle();
                                            Parcel S19 = zzbwgVar2.S1(zzbwgVar2.J(), 13);
                                            Bundle bundle2 = (Bundle) zzbew.b(S19, Bundle.CREATOR);
                                            S19.recycle();
                                            Parcel S110 = zzbwgVar2.S1(zzbwgVar2.J(), 6);
                                            String readString8 = S110.readString();
                                            S110.recycle();
                                            View view4 = (View) zzdqr.n(zzbwgVar2.zzu());
                                            Parcel S111 = zzbwgVar2.S1(zzbwgVar2.J(), 21);
                                            IObjectWrapper S112 = IObjectWrapper.Stub.S1(S111.readStrongBinder());
                                            S111.recycle();
                                            Parcel S113 = zzbwgVar2.S1(zzbwgVar2.J(), 5);
                                            zzbmv E44 = zzbmu.E4(S113.readStrongBinder());
                                            S113.recycle();
                                            Parcel S114 = zzbwgVar2.S1(zzbwgVar2.J(), 7);
                                            String readString9 = S114.readString();
                                            S114.recycle();
                                            zzdqrVar = zzdqr.m(zzdqqVar2, E43, view3, readString6, readArrayList2, readString7, bundle2, readString8, view4, S112, null, null, -1.0d, E44, readString9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        } catch (RemoteException e2) {
                                            e = e2;
                                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                                            zzo.zzj("Failed to get native ad assets from content ad mapper", e);
                                            zzdqrVar = null;
                                            zzbwgVar = zzbwgVar2;
                                            if (zzdqrVar != null) {
                                            }
                                            throw new zzeqf(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e3) {
                                        e = e3;
                                        zzbwgVar2 = zzP;
                                    }
                                    zzbwgVar = zzbwgVar2;
                                } else {
                                    if (zzP == null || !c(zzfloVar, 1)) {
                                        throw new zzeqf(1, "No native ad mappers");
                                    }
                                    try {
                                        Parcel S115 = zzP.S1(zzP.J(), 16);
                                        com.google.android.gms.ads.internal.client.zzea zza2 = com.google.android.gms.ads.internal.client.zzdz.zza(S115.readStrongBinder());
                                        S115.recycle();
                                        zzdqq zzdqqVar3 = zza2 == null ? null : new zzdqq(zza2, null);
                                        Parcel S116 = zzP.S1(zzP.J(), 19);
                                        zzbmo E45 = zzbmn.E4(S116.readStrongBinder());
                                        S116.recycle();
                                        Parcel S117 = zzP.S1(zzP.J(), 15);
                                        IObjectWrapper S118 = IObjectWrapper.Stub.S1(S117.readStrongBinder());
                                        S117.recycle();
                                        View view5 = (View) zzdqr.n(S118);
                                        Parcel S119 = zzP.S1(zzP.J(), 2);
                                        String readString10 = S119.readString();
                                        S119.recycle();
                                        Parcel S120 = zzP.S1(zzP.J(), 3);
                                        ArrayList readArrayList3 = S120.readArrayList(zzbew.a);
                                        S120.recycle();
                                        Parcel S121 = zzP.S1(zzP.J(), 4);
                                        String readString11 = S121.readString();
                                        S121.recycle();
                                        Parcel S122 = zzP.S1(zzP.J(), 13);
                                        Bundle bundle3 = (Bundle) zzbew.b(S122, Bundle.CREATOR);
                                        S122.recycle();
                                        Parcel S123 = zzP.S1(zzP.J(), 6);
                                        String readString12 = S123.readString();
                                        S123.recycle();
                                        View view6 = (View) zzdqr.n(zzP.zzu());
                                        Parcel S124 = zzP.S1(zzP.J(), 21);
                                        IObjectWrapper S125 = IObjectWrapper.Stub.S1(S124.readStrongBinder());
                                        S124.recycle();
                                        Parcel S126 = zzP.S1(zzP.J(), 7);
                                        String readString13 = S126.readString();
                                        S126.recycle();
                                        Parcel S127 = zzP.S1(zzP.J(), 5);
                                        zzbmv E46 = zzbmu.E4(S127.readStrongBinder());
                                        S127.recycle();
                                        zzdqr zzdqrVar3 = new zzdqr();
                                        zzbwgVar = zzP;
                                        try {
                                            zzdqrVar3.a = 1;
                                            zzdqrVar3.b = zzdqqVar3;
                                            zzdqrVar3.c = E45;
                                            zzdqrVar3.d = view5;
                                            zzdqrVar3.o("headline", readString10);
                                            zzdqrVar3.e = readArrayList3;
                                            zzdqrVar3.o("body", readString11);
                                            zzdqrVar3.h = bundle3;
                                            zzdqrVar3.o("call_to_action", readString12);
                                            zzdqrVar3.o = view6;
                                            zzdqrVar3.q = S125;
                                            zzdqrVar3.o(U3.i.F0, readString13);
                                            zzdqrVar3.t = E46;
                                            zzdqrVar = zzdqrVar3;
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                            zzo.zzj("Failed to get native ad from content ad mapper", e);
                                            zzdqrVar = null;
                                            if (zzdqrVar != null) {
                                            }
                                            throw new zzeqf(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e5) {
                                        e = e5;
                                        zzbwgVar = zzP;
                                    }
                                }
                            } else {
                                try {
                                    Parcel S128 = m.S1(m.J(), 17);
                                    com.google.android.gms.ads.internal.client.zzea zza3 = com.google.android.gms.ads.internal.client.zzdz.zza(S128.readStrongBinder());
                                    S128.recycle();
                                    zzdqqVar = zza3 == null ? null : new zzdqq(zza3, null);
                                    Parcel S129 = m.S1(m.J(), 19);
                                    E4 = zzbmn.E4(S129.readStrongBinder());
                                    S129.recycle();
                                    Parcel S130 = m.S1(m.J(), 18);
                                    IObjectWrapper S131 = IObjectWrapper.Stub.S1(S130.readStrongBinder());
                                    S130.recycle();
                                    view = (View) zzdqr.n(S131);
                                    Parcel S132 = m.S1(m.J(), 2);
                                    readString = S132.readString();
                                    S132.recycle();
                                    Parcel S133 = m.S1(m.J(), 3);
                                    readArrayList = S133.readArrayList(zzbew.a);
                                    S133.recycle();
                                    zzfmuVar = zzfmuVar2;
                                    try {
                                        Parcel S134 = m.S1(m.J(), 4);
                                        readString2 = S134.readString();
                                        S134.recycle();
                                        Parcel S135 = m.S1(m.J(), 15);
                                        bundle = (Bundle) zzbew.b(S135, Bundle.CREATOR);
                                        S135.recycle();
                                        zzbwjVar = e;
                                        try {
                                            Parcel S136 = m.S1(m.J(), 6);
                                            readString3 = S136.readString();
                                            S136.recycle();
                                            view2 = (View) zzdqr.n(m.D4());
                                            zzbwgVar = zzP;
                                            try {
                                                Parcel S137 = m.S1(m.J(), 21);
                                                S1 = IObjectWrapper.Stub.S1(S137.readStrongBinder());
                                                S137.recycle();
                                                Parcel S138 = m.S1(m.J(), 8);
                                                readString4 = S138.readString();
                                                S138.recycle();
                                                Parcel S139 = m.S1(m.J(), 9);
                                                readString5 = S139.readString();
                                                S139.recycle();
                                                Parcel S140 = m.S1(m.J(), 7);
                                                readDouble = S140.readDouble();
                                                S140.recycle();
                                                Parcel S141 = m.S1(m.J(), 5);
                                                E42 = zzbmu.E4(S141.readStrongBinder());
                                                S141.recycle();
                                                zzdqrVar2 = new zzdqr();
                                                zzbwfVar = m;
                                            } catch (RemoteException e6) {
                                                e = e6;
                                                zzbwfVar = m;
                                            }
                                        } catch (RemoteException e7) {
                                            e = e7;
                                            zzbwfVar = m;
                                            zzbwgVar = zzP;
                                        }
                                    } catch (RemoteException e8) {
                                        e = e8;
                                        zzbwfVar = m;
                                        zzbwgVar = zzP;
                                        zzbwjVar = e;
                                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                        zzo.zzj("Failed to get native ad from app install ad mapper", e);
                                        zzdqrVar = null;
                                        if (zzdqrVar != null) {
                                        }
                                        throw new zzeqf(1, "No corresponding native ad listener");
                                    }
                                } catch (RemoteException e9) {
                                    e = e9;
                                    zzfmuVar = zzfmuVar2;
                                }
                                try {
                                    zzdqrVar2.a = 2;
                                    zzdqrVar2.b = zzdqqVar;
                                    zzdqrVar2.c = E4;
                                    zzdqrVar2.d = view;
                                    zzdqrVar2.o("headline", readString);
                                    zzdqrVar2.e = readArrayList;
                                    zzdqrVar2.o("body", readString2);
                                    zzdqrVar2.h = bundle;
                                    zzdqrVar2.o("call_to_action", readString3);
                                    zzdqrVar2.o = view2;
                                    zzdqrVar2.q = S1;
                                    zzdqrVar2.o("store", readString4);
                                    zzdqrVar2.o("price", readString5);
                                    zzdqrVar2.r = readDouble;
                                    zzdqrVar2.s = E42;
                                    zzdqrVar = zzdqrVar2;
                                } catch (RemoteException e10) {
                                    e = e10;
                                    int i32 = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzj("Failed to get native ad from app install ad mapper", e);
                                    zzdqrVar = null;
                                    if (zzdqrVar != null) {
                                    }
                                    throw new zzeqf(1, "No corresponding native ad listener");
                                }
                            }
                            if (zzdqrVar != null) {
                                if (zzfloVar.a.a.h.contains(Integer.toString(zzdqrVar.q()))) {
                                    jvn d = this.b.d(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdrc(zzdqrVar), new zzdsv(zzbwgVar, zzbwfVar, zzbwjVar));
                                    ((zzeof) zzemtVar.c).F4(new zzeru((zzddn) d.d.zzb(), (zzdlu) d.f.zzb(), (zzdeh) d.e.zzb(), (zzdew) d.c.zzb(), (zzdfb) d.g.zzb(), (zzdit) d.a.U.zzb(), (zzdga) d.h.zzb(), (zzdms) d.i.zzb(), (zzdip) d.j.zzb(), (zzdec) d.k.zzb()));
                                    ((zzdeo) d.b.zzb()).n0(new zzctr(zzfmuVar), this.c);
                                    return d.d();
                                }
                            }
                            throw new zzeqf(1, "No corresponding native ad listener");
                        }
                        try {
                            Parcel S142 = m.S1(m.J(), 17);
                            com.google.android.gms.ads.internal.client.zzea zza4 = com.google.android.gms.ads.internal.client.zzdz.zza(S142.readStrongBinder());
                            S142.recycle();
                            zzdqq zzdqqVar4 = zza4 == null ? null : new zzdqq(zza4, null);
                            Parcel S143 = m.S1(m.J(), 19);
                            zzbmo E47 = zzbmn.E4(S143.readStrongBinder());
                            S143.recycle();
                            Parcel S144 = m.S1(m.J(), 18);
                            IObjectWrapper S145 = IObjectWrapper.Stub.S1(S144.readStrongBinder());
                            S144.recycle();
                            View view7 = (View) zzdqr.n(S145);
                            Parcel S146 = m.S1(m.J(), 2);
                            String readString14 = S146.readString();
                            S146.recycle();
                            Parcel S147 = m.S1(m.J(), 3);
                            ArrayList readArrayList4 = S147.readArrayList(zzbew.a);
                            S147.recycle();
                            Parcel S148 = m.S1(m.J(), 4);
                            String readString15 = S148.readString();
                            S148.recycle();
                            Parcel S149 = m.S1(m.J(), 15);
                            Bundle bundle4 = (Bundle) zzbew.b(S149, Bundle.CREATOR);
                            S149.recycle();
                            Parcel S150 = m.S1(m.J(), 6);
                            String readString16 = S150.readString();
                            S150.recycle();
                            View view8 = (View) zzdqr.n(m.D4());
                            Parcel S151 = m.S1(m.J(), 21);
                            IObjectWrapper S152 = IObjectWrapper.Stub.S1(S151.readStrongBinder());
                            S151.recycle();
                            Parcel S153 = m.S1(m.J(), 8);
                            String readString17 = S153.readString();
                            S153.recycle();
                            Parcel S154 = m.S1(m.J(), 9);
                            String readString18 = S154.readString();
                            S154.recycle();
                            Parcel S155 = m.S1(m.J(), 7);
                            double readDouble2 = S155.readDouble();
                            S155.recycle();
                            Parcel S156 = m.S1(m.J(), 5);
                            zzbmv E48 = zzbmu.E4(S156.readStrongBinder());
                            S156.recycle();
                            zzdqrVar = zzdqr.m(zzdqqVar4, E47, view7, readString14, readArrayList4, readString15, bundle4, readString16, view8, S152, readString17, readString18, readDouble2, E48, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } catch (RemoteException e11) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzj("Failed to get native ad assets from app install ad mapper", e11);
                            zzdqrVar = null;
                        }
                    }
                    zzfmuVar = zzfmuVar2;
                    zzbwfVar = m;
                    zzbwgVar = zzP;
                    zzbwjVar = e;
                    if (zzdqrVar != null) {
                    }
                    throw new zzeqf(1, "No corresponding native ad listener");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.b;
        zzflw zzflwVar = zzfloVar.a.a;
        String jSONObject = zzfldVar.v.toString();
        String zzm = zzbp.zzm(zzfldVar.s);
        Context context = this.a;
        zzbwa zzbwaVar = (zzbwa) zzemtVar.c;
        zzbmk zzbmkVar = zzflwVar.j;
        ArrayList arrayList = zzflwVar.h;
        try {
            zzfmuVar.a.W2(new ObjectWrapper(context), zzflwVar.d, jSONObject, zzm, zzbwaVar, zzbmkVar, arrayList);
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }
}
