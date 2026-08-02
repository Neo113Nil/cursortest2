package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcelable;
import defpackage.ohn;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfnz {
    public final HashMap a = new HashMap();

    public final zzfny a(zzfnp zzfnpVar, Context context, zzfnh zzfnhVar, ohn ohnVar) {
        zzfnp zzfnpVar2;
        zzfns zzfnsVar;
        zzfns zzfnsVar2;
        HashMap hashMap = this.a;
        zzfny zzfnyVar = (zzfny) hashMap.get(zzfnpVar);
        if (zzfnyVar != null) {
            return zzfnyVar;
        }
        if (zzfnpVar == zzfnp.a) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.u7)).intValue();
            int intValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A7)).intValue();
            int intValue3 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C7)).intValue();
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E7);
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w7);
            zzfnsVar = new zzfns(context, zzfnpVar, intValue, intValue2, intValue3, str, str2);
            zzfnpVar2 = zzfnpVar;
        } else {
            zzfnpVar2 = zzfnpVar;
            if (zzfnpVar2 == zzfnp.b) {
                int intValue4 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v7)).intValue();
                int intValue5 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B7)).intValue();
                int intValue6 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D7)).intValue();
                String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F7);
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x7);
                zzfnsVar2 = new zzfns(context, zzfnpVar2, intValue4, intValue5, intValue6, str3, str4);
            } else if (zzfnpVar2 == zzfnp.c) {
                int intValue7 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I7)).intValue();
                int intValue8 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K7)).intValue();
                int intValue9 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L7)).intValue();
                String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G7);
                String str6 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H7);
                zzfnsVar2 = new zzfns(context, zzfnpVar2, intValue7, intValue8, intValue9, str5, str6);
            } else {
                Parcelable.Creator<zzfns> creator = zzfns.CREATOR;
                zzfnsVar = null;
            }
            zzfnsVar = zzfnsVar2;
        }
        r rVar = new r(zzfnsVar);
        zzfny zzfnyVar2 = new zzfny(rVar, new zzfoh(rVar, zzfnhVar, ohnVar));
        hashMap.put(zzfnpVar2, zzfnyVar2);
        return zzfnyVar2;
    }
}
