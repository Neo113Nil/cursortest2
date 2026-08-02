package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.fn0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfnw implements zzfnv {
    public final Object[] a;

    public zzfnw(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, int i, String str2, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzmVar.zzb));
        }
        if (hashSet.contains(HandleInvocationsFromAdViewer.KEY_EXTRAS)) {
            arrayList.add(a(zzmVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzmVar.zzc.getString("npa"));
        }
        if (hashSet.contains(InneractiveMediationDefs.KEY_GENDER)) {
            arrayList.add(Integer.valueOf(zzmVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = zzmVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzmVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzmVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzmVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzmVar.zzi);
        }
        if (hashSet.contains("location")) {
            Location location = zzmVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzmVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(zzmVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(zzmVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzmVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzmVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzmVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzmVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzmVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzmVar.zzu);
        }
        if (hashSet.contains(U3.i.n)) {
            if (zzxVar != null) {
                arrayList.add(Integer.valueOf(zzxVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfnw) {
            return Arrays.equals(this.a, ((zzfnw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = this.a;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(hashCode).length() + 10 + String.valueOf(arrays).length() + 1);
        fn0.s(hashCode, "[PoolKey#", " ", arrays, sb);
        sb.append(U3.j.e);
        return sb.toString();
    }
}
