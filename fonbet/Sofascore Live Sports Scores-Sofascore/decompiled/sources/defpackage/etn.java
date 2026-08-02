package defpackage;

import com.appsflyer.internal.i;
import com.google.android.gms.internal.ads.zzcjy;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class etn implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ zzcjy j;

    public etn(zzcjy zzcjyVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = i3;
        this.i = i4;
        this.j = zzcjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap l = i.l("event", "precacheProgress");
        l.put("src", this.a);
        l.put("cachedSrc", this.b);
        l.put("bytesLoaded", Integer.toString(this.c));
        l.put("totalBytes", Integer.toString(this.d));
        l.put("bufferedDuration", Long.toString(this.e));
        l.put("totalDuration", Long.toString(this.f));
        l.put("cacheReady", true != this.g ? "0" : "1");
        l.put("playerCount", Integer.toString(this.h));
        l.put("playerPreparedCount", Integer.toString(this.i));
        this.j.q(l);
    }
}
