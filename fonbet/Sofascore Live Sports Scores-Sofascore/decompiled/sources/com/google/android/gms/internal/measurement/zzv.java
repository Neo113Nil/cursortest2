package com.google.android.gms.internal.measurement;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv extends zzai {
    public final zzz c;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.c = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        TreeMap treeMap;
        zzh.a(3, this.a, list);
        zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc();
        zzao zzaoVar = (zzao) list.get(1);
        zzaw zzawVar = zzgVar.b;
        zzao b = zzawVar.b(zzgVar, zzaoVar);
        if (!(b instanceof zzan)) {
            a70.p("Invalid callback type");
            return null;
        }
        zzao b2 = zzawVar.b(zzgVar, (zzao) list.get(2));
        if (!(b2 instanceof zzal)) {
            a70.p("Invalid callback params");
            return null;
        }
        zzal zzalVar = (zzal) b2;
        HashMap hashMap = zzalVar.a;
        if (!hashMap.containsKey("type")) {
            a70.p("Undefined rule type");
            return null;
        }
        String zzc = zzalVar.zzk("type").zzc();
        int g = hashMap.containsKey(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY) ? zzh.g(zzalVar.zzk(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zzd().doubleValue()) : 1000;
        zzan zzanVar = (zzan) b;
        zzz zzzVar = this.c;
        zzzVar.getClass();
        if ("create".equals(zzc)) {
            treeMap = zzzVar.b;
        } else {
            if (!"edit".equals(zzc)) {
                a70.r("Unknown callback type: ".concat(String.valueOf(zzc)));
                return null;
            }
            treeMap = zzzVar.a;
        }
        if (treeMap.containsKey(Integer.valueOf(g))) {
            g = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(g), zzanVar);
        return zzao.I7;
    }
}
