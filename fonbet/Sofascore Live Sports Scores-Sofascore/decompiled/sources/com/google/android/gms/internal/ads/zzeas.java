package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import defpackage.hsn;
import defpackage.nkn;
import defpackage.vrn;
import defpackage.wjn;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzeas {
    public final HashMap a;
    public final Context b;
    public final hsn c;
    public final zzu d;
    public final boolean e;
    public final CsiUrlBuilder f;
    public final boolean g;
    public final AtomicBoolean h;
    public final AtomicReference i;

    public zzeas(hsn hsnVar, zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.a = new HashMap();
        this.h = new AtomicBoolean();
        this.i = new AtomicReference(new Bundle());
        this.c = hsnVar;
        this.d = zzuVar;
        this.e = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N2)).booleanValue();
        this.f = csiUrlBuilder;
        this.g = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a8)).booleanValue();
        this.b = context;
    }

    public final void a(Map map) {
        if (map == null || map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.h.getAndSet(true);
        AtomicReference atomicReference = this.i;
        if (!andSet) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.gc);
            atomicReference.set(com.google.android.gms.ads.internal.util.zzac.zzc(this.b, str, new vrn(this, str)));
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map) {
        if (map.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty paramMap.");
            return;
        }
        a(map);
        String generateUrl = this.f.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.e) {
            if (!parseBoolean || this.g) {
                this.c.execute(new nkn((zzeao) this, generateUrl, false, 15));
            }
        }
    }

    public final void c(AbstractMap abstractMap) {
        if (abstractMap.isEmpty()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd("Empty paramMap.");
            return;
        }
        a(abstractMap);
        String generateUrl = this.f.generateUrl(abstractMap);
        com.google.android.gms.ads.internal.util.zze.zza(generateUrl);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Xe)).booleanValue() || this.e) {
            this.c.execute(new wjn(13, (zzeao) this, generateUrl));
        }
    }
}
