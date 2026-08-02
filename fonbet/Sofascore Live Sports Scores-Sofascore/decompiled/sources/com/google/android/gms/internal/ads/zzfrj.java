package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import defpackage.mio;
import defpackage.wjn;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfrj implements Runnable {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static Boolean m;
    public final Context a;
    public final VersionInfoParcel b;
    public int e;
    public final zzdxx f;
    public final List g;
    public final zzcny h;
    public final zzfrn c = zzfrq.E();
    public String d = "";
    public boolean i = false;

    public zzfrj(Context context, VersionInfoParcel versionInfoParcel, zzdxx zzdxxVar, zzccd zzccdVar, zzcny zzcnyVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.f = zzdxxVar;
        this.h = zzcnyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ka)).booleanValue()) {
            this.g = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            mio mioVar = zzgxm.b;
            this.g = s.e;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (j) {
            try {
                Boolean bool = m;
                if (bool == null) {
                    if (((Boolean) zzbla.b.c()).booleanValue()) {
                        bool = Boolean.valueOf(Math.random() < ((Double) zzbla.a.c()).doubleValue());
                        m = bool;
                    } else {
                        bool = Boolean.FALSE;
                        m = bool;
                    }
                }
                booleanValue = bool.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(zzfqz zzfqzVar) {
        zzcgj.a.submit(new wjn(21, this, zzfqzVar));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] d;
        if (a()) {
            Object obj = k;
            synchronized (obj) {
                try {
                    if (((zzfrq) this.c.b).D() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfrn zzfrnVar = this.c;
                            d = ((zzfrq) zzfrnVar.o()).d();
                            zzfrnVar.n();
                            ((zzfrq) zzfrnVar.b).G();
                        }
                        zzeji zzejiVar = new zzeji((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ea), 60000, new HashMap(), d, CommonGatewayClient.HEADER_PROTOBUF);
                        Context context = this.a;
                        String str = this.b.afmaVersion;
                        Binder.getCallingUid();
                        new zzejk(context, str, null).zza(zzejiVar);
                    } catch (Exception e) {
                        if ((e instanceof zzefb) && ((zzefb) e).a == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().e("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
