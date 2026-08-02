package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.internal.playcore_hsdp.zzf;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rfn implements v3p {
    public final Context a;
    public final i1k b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public o4n d;

    public rfn(Context context, Intent intent) {
        this.a = context;
        if (zzf.a(context)) {
            this.b = new i1k(context.getApplicationContext(), "HsdpService", intent, new kif(27));
        } else {
            a70.r("HSDP service is not available.");
            throw null;
        }
    }

    public static void b(rfn rfnVar, String str, int i, Runnable runnable) {
        ((Handler) ((zzg) rfnVar.b.b).zza()).post(new g6n(rfnVar, str, i, runnable, 5));
    }

    public final void a(String str, String str2, IBinder iBinder, int i, int i2, boolean z, eg9 eg9Var) {
        okn oknVar = (okn) this.c.putIfAbsent(str, new okn(str, eg9Var));
        if (oknVar != null) {
            oknVar.b = eg9Var;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i2);
        bundle.putString("sdkVersion", "2.0.0");
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z);
        this.b.k(new n2(19, this, str, str2, bundle, false));
    }
}
