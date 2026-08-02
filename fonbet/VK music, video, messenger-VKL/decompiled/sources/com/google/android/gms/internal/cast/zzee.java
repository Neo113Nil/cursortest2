package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ex10;
import xsna.hr80;
import xsna.o100;
import xsna.tj0;
import xsna.zn01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzee {

    @Nullable
    private static zzee zza;
    private static final o100 zzb = new o100("RemoteConnectionManager", null);
    private final CastOptions zzc;
    private final zzax zzd;
    private final zzby zze;
    private final zzeb zzh;
    private final Map zzi;
    private final Map zzj;

    @Nullable
    private final PowerManager zzk;
    private boolean zzn;
    private final Object zzl = new Object();
    private final Object zzm = new Object();
    private final Set zzg = tj0.c();
    private final zzed zzf = new zzed(this, null);

    private zzee(Context context, CastOptions castOptions, zzax zzaxVar, zzby zzbyVar) {
        this.zzc = castOptions;
        this.zze = zzbyVar;
        zzeb zzebVar = new zzeb(this, null);
        this.zzh = zzebVar;
        this.zzd = zzaxVar;
        zzaxVar.zzf(zzebVar);
        this.zzi = new ConcurrentHashMap();
        this.zzj = new ConcurrentHashMap();
        this.zzk = (PowerManager) context.getSystemService("power");
        new zzec(this, null);
    }

    public static zzee zza(Context context, CastOptions castOptions, zzax zzaxVar) {
        if (zza == null) {
            zza = new zzee(context, castOptions, zzaxVar, new zzby(context));
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final void zzg(CastDevice castDevice) {
        if (((zzea) this.zzj.remove(castDevice.i())) != null) {
            synchronized (this.zzl) {
                try {
                    Iterator it = this.zzg.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(zn01 zn01Var) {
        synchronized (this.zzm) {
            try {
                Iterator it = this.zzi.entrySet().iterator();
                if (it.hasNext()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzc() {
        synchronized (this.zzm) {
            try {
                for (zzdz zzdzVar : this.zzi.values()) {
                    boolean zze = this.zzd.zze();
                    PowerManager powerManager = this.zzk;
                    boolean z = false;
                    if (powerManager != null && !powerManager.isInteractive()) {
                        z = true;
                    }
                    zzdzVar.zza(zze, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzd() {
        synchronized (this.zzm) {
            try {
                Iterator it = this.zzi.values().iterator();
                if (it.hasNext()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        ex10 ex10Var;
        boolean isEmpty = this.zzg.isEmpty();
        if (this.zzd.zze() || isEmpty) {
            if (this.zzn) {
                this.zzn = false;
                zzb.a("Stopping RemoteConnectionManager discovery.", new Object[0]);
                this.zze.zzc(this.zzf);
                return;
            }
            return;
        }
        if (this.zzn) {
            return;
        }
        o100 o100Var = zzb;
        o100Var.a("Starting RemoteConnectionManager discovery.", new Object[0]);
        zzby zzbyVar = this.zze;
        zzed zzedVar = this.zzf;
        zzbyVar.zzc(zzedVar);
        String str = this.zzc.b;
        if (str.isEmpty()) {
            o100Var.a("Failed to create MediaRouteSelector. No target receiver app ID has been set.", new Object[0]);
            ex10Var = null;
        } else {
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
            ex10Var = new ex10(bundle, arrayList);
        }
        if (ex10Var == null) {
            o100Var.a("Skipping starting discovery. No target receiver app ID has been set.", new Object[0]);
            return;
        }
        this.zzn = true;
        o100Var.a("Adding mediaRouter callback for control category ".concat(String.valueOf(ex10Var.c())), new Object[0]);
        zzbyVar.zzb(ex10Var, zzedVar, 4);
    }

    public final void zzf(Bundle bundle) {
        CastDevice j;
        if (bundle == null || (j = CastDevice.j(bundle)) == null) {
            return;
        }
        String string = bundle.getString("com.google.android.gms.cast.EXTRA_RUNNING_RECEIVER_APP_ID");
        Map map = this.zzi;
        if (map.containsKey(j.i()) && ((zzdz) map.get(j.i())) != null) {
            throw null;
        }
        String str = this.zzc.b;
        if (string == null || str.isEmpty() || !string.equals(str)) {
            zzg(j);
            return;
        }
        Map map2 = this.zzj;
        if (map2.containsKey(j.i())) {
        } else {
            map2.put(j.i(), new zzea(j, string, null));
        }
        Set set = this.zzg;
        if (set.isEmpty()) {
            return;
        }
        synchronized (this.zzl) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Map zzi() {
        return this.zzi;
    }
}
