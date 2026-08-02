package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.ex10;
import xsna.f301;
import xsna.fx10;
import xsna.hr80;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzbq extends fx10.a {
    private static final o100 zzb = new o100("MRDiscoveryCallback", null);
    private final zzby zzf;
    private final Map zzd = Collections.synchronizedMap(new HashMap());
    private final LinkedHashSet zze = new LinkedHashSet();
    private final Set zzc = Collections.synchronizedSet(new LinkedHashSet());
    public final zzbn zza = new zzbn(this);

    public zzbq(Context context) {
        this.zzf = new zzby(context);
    }

    @Override // xsna.fx10.a
    public final void onRouteAdded(fx10 fx10Var, fx10.h hVar) {
        zzb.a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        zza(hVar, true);
    }

    @Override // xsna.fx10.a
    public final void onRouteChanged(fx10 fx10Var, fx10.h hVar) {
        zzb.a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        zza(hVar, true);
    }

    @Override // xsna.fx10.a
    public final void onRouteRemoved(fx10 fx10Var, fx10.h hVar) {
        zzb.a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        zza(hVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0190, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(fx10.h hVar, boolean z) {
        boolean z2;
        boolean remove;
        o100 o100Var = zzb;
        o100Var.a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), hVar);
        Map map = this.zzd;
        synchronized (map) {
            try {
                String valueOf = String.valueOf(map.keySet());
                StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                sb.append("appIdToRouteInfo has these appId route keys: ");
                sb.append(valueOf);
                o100Var.a(sb.toString(), new Object[0]);
                z2 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    zzbm zzbmVar = (zzbm) entry.getValue();
                    if (hVar.h(zzbmVar.zzb)) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb2.append("Adding/updating route for appId ");
                            sb2.append(str);
                            o100Var.a(sb2.toString(), new Object[0]);
                            remove = zzbmVar.zza.add(hVar);
                            if (!remove) {
                                String valueOf2 = String.valueOf(hVar);
                                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 32 + String.valueOf(str).length());
                                sb3.append("Route ");
                                sb3.append(valueOf2);
                                sb3.append(" already exists for appId ");
                                sb3.append(str);
                                o100Var.c(sb3.toString(), new Object[0]);
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb4.append("Removing route for appId ");
                            sb4.append(str);
                            o100Var.a(sb4.toString(), new Object[0]);
                            remove = zzbmVar.zza.remove(hVar);
                            if (!remove) {
                                String valueOf3 = String.valueOf(hVar);
                                StringBuilder sb5 = new StringBuilder(valueOf3.length() + 34 + String.valueOf(str).length());
                                sb5.append("Route ");
                                sb5.append(valueOf3);
                                sb5.append(" already removed from appId ");
                                sb5.append(str);
                                o100Var.c(sb5.toString(), new Object[0]);
                            }
                        }
                        z2 = remove;
                    }
                }
            } finally {
            }
        }
        if (z2) {
            zzb.a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.zzc) {
                try {
                    HashMap hashMap = new HashMap();
                    Map map2 = this.zzd;
                    synchronized (map2) {
                        for (String str2 : map2.keySet()) {
                            zzbm zzbmVar2 = (zzbm) map2.get(zzhb.zza(str2));
                            zzhz zzh = zzbmVar2 == null ? zzhz.zzh() : zzhz.zzj(zzbmVar2.zza);
                            if (!zzh.isEmpty()) {
                                hashMap.put(str2, zzh);
                            }
                        }
                    }
                    zzhy.zzb(hashMap.entrySet());
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((f301) it.next()).a();
                    }
                } finally {
                }
            }
        }
    }

    public final void zzb() {
        zzb.a("Stopping RouteDiscovery.", new Object[0]);
        this.zzd.clear();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.zzf.zzc(this);
        } else {
            new zzfk(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbq.this.zzc();
                }
            });
        }
    }

    public final void zzc() {
        this.zzf.zzc(this);
    }

    public final void zzd() {
        LinkedHashSet linkedHashSet = this.zze;
        o100 o100Var = zzb;
        int size = linkedHashSet.size();
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 33);
        sb.append("Starting RouteDiscovery with ");
        sb.append(size);
        sb.append(" IDs");
        o100Var.a(sb.toString(), new Object[0]);
        o100Var.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.zzd.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zze();
        } else {
            new zzfk(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbq.this.zze();
                }
            });
        }
    }

    public final void zze() {
        zzby zzbyVar = this.zzf;
        zzbyVar.zzc(this);
        LinkedHashSet linkedHashSet = this.zze;
        synchronized (linkedHashSet) {
            try {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String p = hr80.p(str);
                    if (p == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(p)) {
                        arrayList.add(p);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    ex10 ex10Var = new ex10(bundle, arrayList);
                    Map map = this.zzd;
                    if (((zzbm) map.get(str)) == null) {
                        map.put(str, new zzbm(ex10Var));
                    }
                    o100 o100Var = zzb;
                    String p2 = hr80.p(str);
                    StringBuilder sb = new StringBuilder(p2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(p2);
                    o100Var.a(sb.toString(), new Object[0]);
                    zzbyVar.zzb(ex10Var, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.zzd;
        zzb.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }

    public final void zzf(List list) {
        o100 o100Var = zzb;
        int size = list.size();
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("SetRouteDiscovery for ");
        sb.append(size);
        sb.append(" IDs");
        o100Var.a(sb.toString(), new Object[0]);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(zzhb.zza((String) it.next()));
        }
        Map map = this.zzd;
        o100Var.a("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
        HashMap hashMap = new HashMap();
        synchronized (map) {
            try {
                for (String str : linkedHashSet) {
                    zzbm zzbmVar = (zzbm) map.get(zzhb.zza(str));
                    if (zzbmVar != null) {
                        hashMap.put(str, zzbmVar);
                    }
                }
                map.clear();
                map.putAll(hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        o100Var.a("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
        LinkedHashSet linkedHashSet2 = this.zze;
        synchronized (linkedHashSet2) {
            linkedHashSet2.clear();
            linkedHashSet2.addAll(linkedHashSet);
        }
        zzd();
    }
}
