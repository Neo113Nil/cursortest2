package defpackage;

import com.appsflyer.internal.i;
import com.google.android.gms.internal.ads.zzcjv;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ctn implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ zzcjv e;

    public ctn(zzcjv zzcjvVar, String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = zzcjvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap l = i.l("event", "precacheProgress");
        l.put("src", this.a);
        l.put("cachedSrc", this.b);
        l.put("bytesLoaded", Integer.toString(this.c));
        l.put("totalBytes", Integer.toString(this.d));
        l.put("cacheReady", "0");
        this.e.q(l);
    }
}
