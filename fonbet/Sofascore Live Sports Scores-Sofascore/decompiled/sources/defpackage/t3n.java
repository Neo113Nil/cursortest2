package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import com.google.ads.interactivemedia.v3.impl.data.InstrumentationData;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzdcu;
import com.google.android.gms.internal.ads.zzejm;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzggt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t3n implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t3n(ArrayList arrayList, Bundle bundle, String str) {
        this.a = 6;
        this.b = arrayList;
        this.d = bundle;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((SharedPreferences) obj3).getBoolean((String) obj2, ((Boolean) obj).booleanValue()));
            case 1:
                return Integer.valueOf(((SharedPreferences) obj3).getInt((String) obj2, ((Integer) obj).intValue()));
            case 2:
                return Long.valueOf(((SharedPreferences) obj3).getLong((String) obj2, ((Long) obj).longValue()));
            case 3:
                return ((SharedPreferences) obj3).getString((String) obj2, (String) obj);
            case 4:
                zzdcu zzdcuVar = (zzdcu) obj3;
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = (Bundle) ((zzfpp) obj2).c.get();
                String str = (String) ((ddb) zzdcuVar.g.zzb()).get();
                boolean z = false;
                if (((Boolean) zzba.zzc().a(zzbjg.d8)).booleanValue() && zzdcuVar.j.zzx()) {
                    z = true;
                }
                boolean z2 = z;
                String str2 = zzdcuVar.h;
                PackageInfo packageInfo = zzdcuVar.f;
                ArrayList arrayList = zzdcuVar.e;
                String str3 = zzdcuVar.d;
                ApplicationInfo applicationInfo = zzdcuVar.c;
                return new zzcbv(bundle3, zzdcuVar.b, applicationInfo, str3, arrayList, packageInfo, str, str2, null, null, z2, zzdcuVar.k.g.matches((String) zzba.zzc().a(zzbjg.m4)), bundle2);
            case 5:
                zzcbx zzcbxVar = (zzcbx) ((zzfpp) obj3).c.get();
                if (((Boolean) zzba.zzc().a(zzbjg.S2)).booleanValue() && (bundle = ((zzcbv) obj2).m) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", zzcbxVar.j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", zzcbxVar.k);
                }
                return new zzejm((JSONObject) ((zzfpp) obj).c.get(), zzcbxVar);
            case 6:
                zzfcp zzfcpVar = zzfco.j;
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    ddb ddbVar = (ddb) it.next();
                    if (((JSONObject) ddbVar.get()) != null) {
                        jSONArray.put(ddbVar.get());
                    }
                }
                String str4 = (String) obj2;
                Bundle bundle4 = (Bundle) obj;
                if (jSONArray.length() != 0) {
                    return new zzfcp(jSONArray.toString(), bundle4, str4);
                }
                if (((Boolean) zzba.zzc().a(zzbjg.l5)).booleanValue()) {
                    return new zzfcp(new JSONArray().toString(), bundle4, str4);
                }
                return null;
            case 7:
                sro y = lto.y();
                y.b();
                ((lto) y.b).E();
                y.b();
                ((lto) y.b).z();
                y.b();
                ((lto) y.b).A();
                y.b();
                ((lto) y.b).B();
                Context context = (Context) obj3;
                b7p b7pVar = (b7p) obj2;
                if (Build.VERSION.SDK_INT < 30 && y9.u(context, null)) {
                    tep v = i4n.v();
                    v.b();
                    ((i4n) v.b).x();
                    i4n i4nVar = (i4n) v.c();
                    y.b();
                    ((lto) y.b).C(i4nVar);
                }
                try {
                    return new e2p(new cvo(context, b7pVar, (lto) y.c()));
                } catch (RuntimeException e) {
                    ((t6o) obj).d(InstrumentationData.Component.SPAM_MS_PARAMETER_LOADER, InstrumentationData.Method.SETUP_AD_SHIELD, e);
                    return u1p.a;
                }
            default:
                ((lfo) obj3).a.a((zzggt) obj2, null, (byte[]) obj);
                return null;
        }
    }

    public /* synthetic */ t3n(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
