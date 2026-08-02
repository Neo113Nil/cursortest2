package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.appsflyer.internal.i;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcjs;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g6n(zznt zzntVar, int i, zzgu zzguVar, Intent intent) {
        this.a = 4;
        this.e = zzntVar;
        this.d = i;
        this.b = zzguVar;
        this.c = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        int i2 = this.d;
        Object obj2 = this.b;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                String str = (String) obj2;
                okn oknVar = (okn) ((rfn) ((o4n) obj3).c).c.remove(str);
                if (oknVar == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("targetPackage", str);
                bundle.putInt(IronSourceConstants.EVENTS_ERROR_CODE, i2);
                bundle.putString("errorMessage", (String) obj);
                oknVar.b.onError(bundle);
                return;
            case 1:
                HashMap l = i.l("event", "precacheComplete");
                l.put("src", (String) obj2);
                l.put("cachedSrc", (String) obj);
                l.put("totalBytes", Integer.toString(i2));
                ((zzcjs) obj3).q(l);
                return;
            case 2:
                ((zzclx) obj3).N((View) obj2, (zzcef) obj, i2 - 1);
                return;
            case 3:
                lgo lgoVar = (lgo) obj3;
                ggo ggoVar = (ggo) obj2;
                zzgsw zzgswVar = (zzgsw) obj;
                String str2 = lgoVar.b;
                try {
                    u53 u53Var = lgoVar.a;
                    if (u53Var == null) {
                        throw null;
                    }
                    zzgrm zzgrmVar = (zzgrm) u53Var.i;
                    if (zzgrmVar == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str2);
                    bundle2.putInt("displayMode", i2);
                    String str3 = ggoVar.a;
                    if (!lgo.b(str3)) {
                        str3.getClass();
                        bundle2.putString("sessionToken", str3.trim());
                    }
                    String str4 = ggoVar.b;
                    if (!lgo.b(str4)) {
                        str4.getClass();
                        bundle2.putString("appId", str4.trim());
                    }
                    zzgrmVar.a1(bundle2, new kgo(lgoVar, zzgswVar));
                    return;
                } catch (RemoteException e) {
                    lgo.c.d(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), str2);
                    return;
                }
            case 4:
                zzgu zzguVar = (zzgu) obj2;
                Intent intent = (Intent) obj;
                Service service = ((zznt) obj3).a;
                zznp zznpVar = (zznp) service;
                if (zznpVar.a(i2)) {
                    zzguVar.o.b(Integer.valueOf(i2), "Local AppMeasurementService processed last upload request. StartId");
                    zzgu zzguVar2 = zzic.r(service, null, null, null).f;
                    zzic.m(zzguVar2);
                    zzguVar2.o.a("Completed wakeful intent.");
                    zznpVar.b(intent);
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                okn oknVar2 = (okn) ((rfn) obj3).c.get((String) obj2);
                if (oknVar2 == null || !oknVar2.a(i2) || runnable == null) {
                    return;
                }
                runnable.run();
                return;
        }
    }

    public /* synthetic */ g6n(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = obj2;
        this.d = i;
        this.c = obj3;
    }

    public /* synthetic */ g6n(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj2;
        this.c = obj3;
        this.d = i;
        this.e = obj;
    }
}
