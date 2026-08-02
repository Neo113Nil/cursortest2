package defpackage;

import com.appsflyer.internal.i;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcjs;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dtn implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ zzcjs k;

    public dtn(zzcjs zzcjsVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = z;
        this.i = i;
        this.j = i2;
        this.k = zzcjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap l = i.l("event", "precacheProgress");
        l.put("src", this.a);
        l.put("cachedSrc", this.b);
        l.put("bufferedDuration", Long.toString(this.c));
        l.put("totalDuration", Long.toString(this.d));
        if (((Boolean) zzba.zzc().a(zzbjg.G2)).booleanValue()) {
            l.put("qoeLoadedBytes", Long.toString(this.e));
            l.put("qoeCachedBytes", Long.toString(this.f));
            l.put("totalBytes", Long.toString(this.g));
            l.put("reportTime", Long.toString(zzt.zzk().a()));
        }
        l.put("cacheReady", true != this.h ? "0" : "1");
        l.put("playerCount", Integer.toString(this.i));
        l.put("playerPreparedCount", Integer.toString(this.j));
        this.k.q(l);
    }
}
