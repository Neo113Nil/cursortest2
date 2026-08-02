package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfwc implements zzfvd {
    private static final zzfwc zza = new zzfwc();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzk = new zzfvy();
    private static final Runnable zzl = new zzfvz();
    private int zze;
    private long zzj;
    private final List zzd = new ArrayList();
    private final List zzf = new ArrayList();
    private final zzfvv zzh = new zzfvv();
    private final zzfvf zzg = new zzfvf();
    private final zzfvw zzi = new zzfvw(new zzfwf());

    zzfwc() {
    }

    public static zzfwc zzb() {
        return zza;
    }

    private final void zzk(View view, zzfve zzfveVar, JSONObject jSONObject, int i, boolean z) {
        zzfveVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zzl);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zza(View view, zzfve zzfveVar, JSONObject jSONObject, boolean z) {
        zzfvv zzfvvVar;
        int zzl2;
        boolean z2;
        zzfwc zzfwcVar;
        View view2;
        zzfve zzfveVar2;
        boolean z3;
        if (zzfvt.zza(view) != null || (zzl2 = (zzfvvVar = this.zzh).zzl(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfveVar.zza(view);
        zzfvo.zze(jSONObject, zza2);
        String zzg = zzfvvVar.zzg(view);
        if (zzg != null) {
            zzfvo.zzd(zza2, zzg);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzh.zzj(view)));
            } catch (JSONException e) {
                zzfvp.zza("Error with setting has window focus", e);
            }
            Boolean valueOf = Boolean.valueOf(this.zzh.zzk(zzg));
            if (valueOf.booleanValue()) {
                try {
                    zza2.put("isPipActive", valueOf);
                } catch (JSONException e2) {
                    zzfvp.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzh.zzf();
            zzfwcVar = this;
        } else {
            zzfvu zzi = zzfvvVar.zzi(view);
            if (zzi != null) {
                zzfuv zzb2 = zzi.zzb();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzc2 = zzi.zzc();
                int size = zzc2.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) zzc2.get(i));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zzb2.zzb());
                    zza2.put("friendlyObstructionPurpose", zzb2.zzc());
                    zza2.put("friendlyObstructionReason", zzb2.zzd());
                } catch (JSONException e3) {
                    zzfvp.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                zzfwcVar = this;
                view2 = view;
                zzfveVar2 = zzfveVar;
                z3 = true;
            } else {
                view2 = view;
                zzfveVar2 = zzfveVar;
                z3 = false;
                zzfwcVar = this;
            }
            zzfwcVar.zzk(view2, zzfveVar2, zza2, zzl2, z3);
        }
        zzfwcVar.zze++;
    }

    public final void zzc() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzk);
            zzc.postDelayed(zzl, 200L);
        }
    }

    public final void zzd() {
        zzl();
        this.zzd.clear();
        zzb.post(new zzfvx(this));
    }

    public final void zze() {
        zzl();
    }

    final /* synthetic */ void zzf() {
        zzfwc zzfwcVar;
        this.zze = 0;
        this.zzf.clear();
        for (zzfty zzftyVar : zzfus.zza().zzf()) {
        }
        this.zzj = System.nanoTime();
        zzfvv zzfvvVar = this.zzh;
        zzfvvVar.zzd();
        zzfvf zzfvfVar = this.zzg;
        long nanoTime = System.nanoTime();
        zzfve zza2 = zzfvfVar.zza();
        if (zzfvvVar.zzb().size() > 0) {
            Iterator it = zzfvvVar.zzb().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zzh = zzfvvVar.zzh(str);
                zzfve zzb2 = zzfvfVar.zzb();
                String zzc2 = zzfvvVar.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza4 = zzb2.zza(zzh);
                    zzfvo.zzd(zza4, str);
                    try {
                        zza4.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfvp.zza("Error with setting not visible reason", e);
                    }
                    zzfvo.zze(zza3, zza4);
                }
                zzfvo.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.zzi.zzb(zza3, hashSet, nanoTime);
            }
        }
        zzfvv zzfvvVar2 = this.zzh;
        if (zzfvvVar2.zza().size() > 0) {
            JSONObject zza5 = zza2.zza(null);
            zzfwcVar = this;
            zzfwcVar.zzk(null, zza2, zza5, 1, false);
            zzfvo.zzf(zza5);
            zzfwcVar.zzi.zza(zza5, zzfvvVar2.zza(), nanoTime);
        } else {
            zzfwcVar = this;
            zzfwcVar.zzi.zzc();
        }
        zzfvvVar2.zze();
        long nanoTime2 = System.nanoTime() - zzfwcVar.zzj;
        List<zzfwb> list = zzfwcVar.zzd;
        if (list.size() > 0) {
            for (zzfwb zzfwbVar : list) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfwbVar.zzb();
                if (zzfwbVar instanceof zzfwa) {
                    ((zzfwa) zzfwbVar).zza();
                }
            }
        }
        zzfvc.zza().zzc();
    }

    final /* synthetic */ zzfvw zzh() {
        return this.zzi;
    }
}
