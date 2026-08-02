package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.JsonWriter;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import com.ironsource.Wf;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzebi implements AppEventListener, zzdgv, com.google.android.gms.ads.internal.client.zza, zzddp, zzdej, zzdek, zzdfd, zzdds, zzfqj {
    public final List a;
    public final zzeaw b;
    public long c;

    public zzebi(zzeaw zzeawVar, zzcob zzcobVar) {
        this.b = zzeawVar;
        this.a = Collections.singletonList(zzcobVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void A(String str) {
        O(zzfqb.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void D(zzfqc zzfqcVar, String str, Throwable th) {
        O(zzfqb.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        O(zzddp.class, Wf.g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
        O(zzddp.class, Wf.c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void M(Context context) {
        O(zzdek.class, U3.i.u0, context);
    }

    public final void O(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.a;
        String concat = "Event-".concat(simpleName);
        zzeaw zzeawVar = this.b;
        zzeawVar.getClass();
        if (((Boolean) zzblj.a.c()).booleanValue()) {
            long a = zzeawVar.a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a);
                jsonWriter.name("source").value(concat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj = objArr[i];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh("AD-DBG ".concat(valueOf));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
        this.c = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        O(zzdgv.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
        O(zzddp.class, Wf.k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void c(Context context) {
        O(zzdek.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void h(zzfqc zzfqcVar, String str) {
        O(zzfqb.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        O(zzdds.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        O(zzdej.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
        O(zzddp.class, "onRewarded", zzcceVar, str, str2);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        O(com.google.android.gms.ads.internal.client.zza.class, Wf.f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        O(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void t(zzfqc zzfqcVar, String str) {
        O(zzfqb.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(Context context) {
        O(zzdek.class, U3.i.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        O(zzddp.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        O(zzddp.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        O(zzdfd.class, Wf.j, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
    }
}
