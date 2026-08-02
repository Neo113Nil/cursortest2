package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdtl;
import com.google.android.gms.internal.ads.zzejd;
import com.google.android.gms.internal.ads.zzejj;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgrh;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r0o(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Bundle bundle2;
        switch (this.a) {
            case 0:
                zzdtl zzdtlVar = (zzdtl) this.b;
                zzflo zzfloVar = (zzflo) this.c;
                zzfld zzfldVar = (zzfld) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (((Boolean) zzba.zzc().a(zzbjg.Z2)).booleanValue()) {
                    x5n.q("native-assets-loading-basic-start", zzdtlVar.d);
                }
                zzdqr zzdqrVar = new zzdqr();
                int optInt = jSONObject.optInt("template_id", -1);
                synchronized (zzdqrVar) {
                    zzdqrVar.a = optInt;
                }
                String optString = jSONObject.optString("custom_template_id");
                synchronized (zzdqrVar) {
                    zzdqrVar.u = optString;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
                String optString2 = optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null;
                synchronized (zzdqrVar) {
                    zzdqrVar.y = optString2;
                }
                zzflw zzflwVar = zzfloVar.a.a;
                if (!zzflwVar.h.contains(Integer.toString(zzdqrVar.q()))) {
                    int q = zzdqrVar.q();
                    throw new zzeqf(1, me4.g(q, "Invalid template ID: ", new StringBuilder(String.valueOf(q).length() + 21)));
                }
                if (zzdqrVar.q() == 3) {
                    if (zzdqrVar.g() == null) {
                        throw new zzeqf(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzflwVar.i.contains(zzdqrVar.g())) {
                        throw new zzeqf(1, "Unexpected custom template id in the response.");
                    }
                }
                double optDouble = jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d);
                synchronized (zzdqrVar) {
                    zzdqrVar.r = optDouble;
                }
                String optString3 = jSONObject.optString("headline", null);
                if (zzfldVar.M) {
                    zzt.zzc();
                    String zzB = zzs.zzB();
                    optString3 = wt3.m(zzB, " : ", new StringBuilder(fn0.c(3, zzB) + String.valueOf(optString3).length()), optString3);
                }
                zzdqrVar.o("headline", optString3);
                zzdqrVar.o("body", jSONObject.optString("body", null));
                zzdqrVar.o("call_to_action", jSONObject.optString("call_to_action", null));
                zzdqrVar.o("store", jSONObject.optString("store", null));
                zzdqrVar.o("price", jSONObject.optString("price", null));
                zzdqrVar.o(U3.i.F0, jSONObject.optString(U3.i.F0, null));
                return zzdqrVar;
            case 1:
                if (((Boolean) zzba.zzc().a(zzbjg.S2)).booleanValue() && (bundle = ((zzcbv) this.b).m) != null) {
                    bundle.putLong("http-response-ready", zzt.zzk().a());
                }
                return new zzejd((zzejj) ((zzfpp) this.c).c.get(), (JSONObject) ((zzfpp) this.d).c.get(), (zzcbx) ((zzfpp) this.e).c.get());
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (true) {
                    Object obj = this.c;
                    if (!it.hasNext()) {
                        if (((Boolean) zzba.zzc().a(zzbjg.S2)).booleanValue() && (bundle2 = (Bundle) this.d) != null) {
                            Bundle bundle3 = (Bundle) this.e;
                            long a = zzt.zzk().a();
                            if (obj instanceof Bundle) {
                                bundle2.putLong("client-signals-end", a);
                                bundle2.putBundle("client_sig_latency_key", bundle3);
                            } else {
                                bundle2.putLong("gms-signals-end", a);
                                bundle2.putBundle("gms_sig_latency_key", bundle3);
                            }
                        }
                        return obj;
                    }
                    zzfdg zzfdgVar = (zzfdg) ((ddb) it.next()).get();
                    if (zzfdgVar != null) {
                        zzfdgVar.zza(obj);
                    }
                }
                break;
            case 3:
                View view = (View) this.d;
                Activity activity = (Activity) this.e;
                qeo qeoVar = (qeo) this.b;
                Context context = (Context) this.c;
                zzgrh zzgrhVar = qeoVar.d;
                n72 b = qeoVar.a.b();
                if (b == null) {
                    zzgrhVar.b(15004);
                    return "";
                }
                String u = b.u(context, view, activity);
                if (u != null) {
                    return u;
                }
                zzgrhVar.b(15007);
                return "";
            case 4:
                qeo qeoVar2 = (qeo) this.b;
                Context context2 = (Context) this.c;
                String str = (String) this.d;
                View view2 = (View) this.e;
                zzgrh zzgrhVar2 = qeoVar2.d;
                n72 b2 = qeoVar2.a.b();
                if (b2 == null) {
                    zzgrhVar2.b(15004);
                    return "";
                }
                String w = b2.w(context2, str, view2, null);
                if (w != null) {
                    return w;
                }
                zzgrhVar2.b(15008);
                return "";
            case 5:
                View view3 = (View) this.d;
                Activity activity2 = (Activity) this.e;
                veo veoVar = (veo) this.b;
                Context context3 = (Context) this.c;
                HashMap hashMap = new HashMap();
                veoVar.f.f(20106, new g3g(veoVar, hashMap, context3, view3, activity2, 5, false));
                String g = veoVar.g(hashMap);
                hashMap.clear();
                return g;
            case 6:
                veo veoVar2 = (veo) this.b;
                Context context4 = (Context) this.c;
                String str2 = (String) this.d;
                View view4 = (View) this.e;
                HashMap hashMap2 = new HashMap();
                veoVar2.f.f(20106, new g3g(veoVar2, hashMap2, context4, view4, str2, 6, false));
                String g2 = veoVar2.g(hashMap2);
                hashMap2.clear();
                return g2;
            default:
                ((lfo) this.b).a.a((zzggt) this.c, (byte[]) this.d, (byte[]) this.e);
                return null;
        }
    }
}
