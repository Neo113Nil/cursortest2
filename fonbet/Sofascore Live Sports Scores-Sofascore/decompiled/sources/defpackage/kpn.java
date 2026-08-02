package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzcgj;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kpn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbum b;
    public final /* synthetic */ zzbul c;
    public final /* synthetic */ zzbtp d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ long f;

    public /* synthetic */ kpn(zzbum zzbumVar, zzbul zzbulVar, zzbtp zzbtpVar, ArrayList arrayList, long j, int i) {
        this.a = i;
        this.c = zzbulVar;
        this.d = zzbtpVar;
        this.e = arrayList;
        this.f = j;
        this.b = zzbumVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        final int i = 1;
        switch (this.a) {
            case 0:
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                zzbum zzbumVar = this.b;
                synchronized (zzbumVar.a) {
                    try {
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        zzbul zzbulVar = this.c;
                        if (zzbulVar.b.get() != -1 && zzbulVar.b.get() != 1) {
                            if (((Boolean) zzba.zzc().a(zzbjg.L8)).booleanValue()) {
                                zzbulVar.c("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                zzbulVar.b();
                            }
                            hsn hsnVar = zzcgj.f;
                            final zzbtp zzbtpVar = this.d;
                            final int i2 = 0;
                            hsnVar.execute(new Runnable() { // from class: jpn
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    int i3 = i2;
                                    zzbtp zzbtpVar2 = zzbtpVar;
                                    switch (i3) {
                                        case 0:
                                            zzbtpVar2.zzj();
                                            break;
                                        default:
                                            zzbtpVar2.zzj();
                                            break;
                                    }
                                }
                            });
                            String valueOf = String.valueOf(zzba.zzc().a(zzbjg.e));
                            int i3 = zzbulVar.b.get();
                            int i4 = zzbumVar.g;
                            ArrayList arrayList = this.e;
                            if (arrayList.isEmpty()) {
                                sb = ". Still waiting for the engine to be loaded";
                            } else {
                                String valueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                                sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb2.append(valueOf2);
                                sb = sb2.toString();
                            }
                            long a = zzt.zzk().a() - this.f;
                            StringBuilder sb3 = new StringBuilder(valueOf.length() + 107 + String.valueOf(i3).length() + 36 + String.valueOf(i4).length() + sb.length() + 39 + String.valueOf(a).length() + 26);
                            sb3.append("Could not finish the full JS engine loading in ");
                            sb3.append(valueOf);
                            sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb3.append(i3);
                            sb3.append(". Update status(fullLoadTimeout) is ");
                            sb3.append(i4);
                            sb3.append(sb);
                            sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb3.append(a);
                            sb3.append(" ms at timeout. Rejecting.");
                            zze.zza(sb3.toString());
                            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                zzbum zzbumVar2 = this.b;
                zzbul zzbulVar2 = this.c;
                final zzbtp zzbtpVar2 = this.d;
                ArrayList arrayList2 = this.e;
                long j = this.f;
                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (zzbumVar2.a) {
                    try {
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (zzbulVar2.b.get() != -1 && zzbulVar2.b.get() != 1) {
                            if (((Boolean) zzba.zzc().a(zzbjg.L8)).booleanValue()) {
                                zzbulVar2.c("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                zzbulVar2.b();
                            }
                            zzcgj.f.execute(new Runnable() { // from class: jpn
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    int i32 = i;
                                    zzbtp zzbtpVar22 = zzbtpVar2;
                                    switch (i32) {
                                        case 0:
                                            zzbtpVar22.zzj();
                                            break;
                                        default:
                                            zzbtpVar22.zzj();
                                            break;
                                    }
                                }
                            });
                            String valueOf3 = String.valueOf(zzba.zzc().a(zzbjg.d));
                            int i5 = zzbulVar2.b.get();
                            int i6 = zzbumVar2.g;
                            String valueOf4 = String.valueOf(arrayList2.get(0));
                            long a2 = zzt.zzk().a() - j;
                            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 94 + String.valueOf(i5).length() + 39 + String.valueOf(i6).length() + 57 + valueOf4.length() + 42 + String.valueOf(a2).length() + 15);
                            sb4.append("Could not receive /jsLoaded in ");
                            sb4.append(valueOf3);
                            sb4.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb4.append(i5);
                            sb4.append(". Update status(onEngLoadedTimeout) is ");
                            sb4.append(i6);
                            sb4.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb4.append(valueOf4);
                            sb4.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb4.append(a2);
                            sb4.append(" ms. Rejecting.");
                            zze.zza(sb4.toString());
                            zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
