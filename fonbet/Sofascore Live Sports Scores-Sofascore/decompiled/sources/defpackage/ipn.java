package defpackage;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ipn implements zzbqh {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzbul b;
    public final /* synthetic */ zzbtp c;
    public final /* synthetic */ zzbum d;

    public ipn(zzbum zzbumVar, long j, zzbul zzbulVar, zzbtp zzbtpVar) {
        this.a = j;
        this.b = zzbulVar;
        this.c = zzbtpVar;
        this.d = zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        long a = zzt.zzk().a() - this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(a);
        sb.append(" ms.");
        zze.zza(sb.toString());
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbum zzbumVar = this.d;
        synchronized (zzbumVar.a) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbul zzbulVar = this.b;
            if (zzbulVar.b.get() != -1 && zzbulVar.b.get() != 1) {
                zzbumVar.g = 0;
                zzbtp zzbtpVar = this.c;
                zzbtpVar.c0("/log", zzbqg.c);
                zzbtpVar.c0("/result", zzbqg.j);
                zzbulVar.a.zzc(zzbtpVar);
                zzbumVar.f = zzbulVar;
                zze.zza("Successfully loaded JS Engine.");
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
