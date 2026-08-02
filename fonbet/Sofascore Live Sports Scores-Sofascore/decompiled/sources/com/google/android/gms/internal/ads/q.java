package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbil;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.n72;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q implements zzhcv {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zzekj b;

    public q(zzekj zzekjVar, boolean z) {
        this.a = z;
        this.b = zzekjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(Object obj) {
        List<String> list;
        List asList;
        int i;
        zzbil.zzab.zzb zzbVar;
        zzbil.zzd.zza zzaVar;
        Bundle bundle = (Bundle) obj;
        zzekj zzekjVar = this.b;
        if (zzekjVar.a.zzx()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else {
            if (!(obj2 instanceof String[])) {
                list = Collections.EMPTY_LIST;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    switch (str.hashCode()) {
                        case -1396342996:
                            if (str.equals("banner")) {
                                zzaVar = zzbil.zzd.zza.BANNER;
                                break;
                            }
                            zzaVar = zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case -1052618729:
                            if (str.equals(IronSourceConstants.EVENTS_NATIVE)) {
                                zzaVar = zzbil.zzd.zza.NATIVE_APP_INSTALL;
                                break;
                            }
                            zzaVar = zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case -239580146:
                            if (str.equals("rewarded")) {
                                zzaVar = zzbil.zzd.zza.REWARD_BASED_VIDEO_AD;
                                break;
                            }
                            zzaVar = zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        case 604727084:
                            if (str.equals("interstitial")) {
                                zzaVar = zzbil.zzd.zza.INTERSTITIAL;
                                break;
                            }
                            zzaVar = zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                        default:
                            zzaVar = zzbil.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            break;
                    }
                    arrayList.add(zzaVar);
                }
                SparseArray sparseArray = zzekj.h;
                zzbil.zzaf.zzd zzdVar = (zzbil.zzaf.zzd) zzekj.h.get(zzfml.a(zzfml.a(bundle, U3.i.G), "network").getInt("active_network_state", -1), zzbil.zzaf.zzd.UNSPECIFIED);
                zzbil.zzab.zza E = zzbil.zzab.E();
                i = bundle.getInt("cnt", -2);
                int i2 = bundle.getInt("gnt", 0);
                if (i != -1) {
                    zzekjVar.g = zzbil.zzq.ENUM_TRUE;
                } else {
                    zzekjVar.g = zzbil.zzq.ENUM_FALSE;
                    if (i == 0) {
                        E.n();
                        ((zzbil.zzab) E.b).G(zzbil.zzab.zzc.CELL);
                    } else if (i != 1) {
                        E.n();
                        ((zzbil.zzab) E.b).G(zzbil.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
                    } else {
                        E.n();
                        ((zzbil.zzab) E.b).G(zzbil.zzab.zzc.WIFI);
                    }
                    switch (i2) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            zzbVar = zzbil.zzab.zzb.TWO_G;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            zzbVar = zzbil.zzab.zzb.THREE_G;
                            break;
                        case 13:
                            zzbVar = zzbil.zzab.zzb.LTE;
                            break;
                        default:
                            zzbVar = zzbil.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                            break;
                    }
                    E.n();
                    ((zzbil.zzab) E.b).D(zzbVar);
                }
                zzbil.zzab zzabVar = (zzbil.zzab) E.o();
                n72 n72Var = new n72();
                n72Var.b = this;
                n72Var.a = this.a;
                n72Var.c = arrayList;
                n72Var.d = zzabVar;
                n72Var.e = zzdVar;
                zzekjVar.b.a(n72Var);
            }
            asList = Arrays.asList((String[]) obj2);
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        list = Collections.unmodifiableList(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        SparseArray sparseArray2 = zzekj.h;
        zzbil.zzaf.zzd zzdVar2 = (zzbil.zzaf.zzd) zzekj.h.get(zzfml.a(zzfml.a(bundle, U3.i.G), "network").getInt("active_network_state", -1), zzbil.zzaf.zzd.UNSPECIFIED);
        zzbil.zzab.zza E2 = zzbil.zzab.E();
        i = bundle.getInt("cnt", -2);
        int i22 = bundle.getInt("gnt", 0);
        if (i != -1) {
        }
        zzbil.zzab zzabVar2 = (zzbil.zzab) E2.o();
        n72 n72Var2 = new n72();
        n72Var2.b = this;
        n72Var2.a = this.a;
        n72Var2.c = arrayList3;
        n72Var2.d = zzabVar2;
        n72Var2.e = zzdVar2;
        zzekjVar.b.a(n72Var2);
    }
}
