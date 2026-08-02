package defpackage;

import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpg;
import com.ironsource.L6;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ono implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzht b;
    public final /* synthetic */ String c;

    public /* synthetic */ ono(zzht zzhtVar, String str, int i) {
        this.a = i;
        this.b = zzhtVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        zzht zzhtVar = this.b;
        switch (i) {
            case 0:
                return new zzu(new ono(zzhtVar, str, 1));
            case 1:
                hkn hknVar = zzhtVar.c.c;
                zzpg.U(hknVar);
                xjo U0 = hknVar.U0(str);
                HashMap hashMap = new HashMap();
                hashMap.put(L6.H, "android");
                hashMap.put("package_name", str);
                ((zzic) zzhtVar.b).d.W();
                hashMap.put("gmp_version", 161000L);
                if (U0 != null) {
                    String O = U0.O();
                    if (O != null) {
                        hashMap.put("app_version", O);
                    }
                    hashMap.put("app_version_int", Long.valueOf(U0.Q()));
                    hashMap.put("dynamite_version", Long.valueOf(U0.b()));
                }
                return hashMap;
            default:
                f0o f0oVar = new f0o(zzhtVar, str, false, 22);
                zzn zznVar = new zzn("internal.remoteConfig");
                zznVar.b.put("getValue", new cxo(zznVar, f0oVar));
                return zznVar;
        }
    }
}
