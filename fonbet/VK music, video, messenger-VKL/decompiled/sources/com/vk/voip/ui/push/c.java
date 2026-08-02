package com.vk.voip.ui.push;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.b6m;
import xsna.c5g;
import xsna.dz2;
import xsna.e43;
import xsna.izs;
import xsna.k8s;
import xsna.kvf;
import xsna.m8f0;
import xsna.ogr;
import xsna.rfr;
import xsna.rq;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sq;
import xsna.tfx;
import xsna.vg20;
import xsna.wh50;
import xsna.yfb;
import xsna.ysw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(ysw yswVar, String str, UserId userId, JSONObject jSONObject, String str2) {
        this.c = yswVar;
        this.d = str;
        this.f = userId;
        this.g = jSONObject;
        this.e = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ysw yswVar = (ysw) this.c;
                String str = (String) this.d;
                UserId userId = (UserId) this.f;
                JSONObject jSONObject = (JSONObject) this.g;
                String str2 = (String) this.e;
                String str3 = (String) obj;
                vg20 vg20Var = yswVar.a;
                Context context = e43.a;
                String b = context != null ? b6m.b(context) : m8f0.a();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("push", jSONObject);
                Preference.a.getClass();
                jSONObject2.put("multiacc_enabled", Preference.x());
                List<UserId> g = yswVar.b.g();
                ArrayList arrayList = new ArrayList(c5g.u(g, 10));
                Iterator<T> it = g.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((UserId) it.next()).b));
                }
                jSONObject2.put("profiles", kvf.a(arrayList));
                jSONObject2.put("device_id", b);
                jSONObject2.put("voip_token", str3);
                String jSONObject3 = jSONObject2.toString();
                vg20Var.getClass();
                tfx tfxVar = new tfx("messages.callReceived", new rq(17), new sq(16));
                tfx.o(tfxVar, "call_id", str, 0, 0, 12);
                if (userId != null) {
                    tfx.n(tfxVar, "caller_id", userId, 0L, 0L, 12);
                }
                if (jSONObject3 != null) {
                    tfx.o(tfxVar, "log_payload", jSONObject3, 0, 0, 12);
                }
                dz2 x = yfb.x(tfxVar);
                if (str2 != null) {
                    x.l = str2;
                    x.m = null;
                }
                return rsg0.Z(x);
            default:
                wh50 wh50Var = (wh50) this.c;
                ogr ogrVar = (ogr) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                wh50 wh50Var3 = (wh50) this.f;
                wh50 wh50Var4 = (wh50) this.g;
                k8s k8sVar = (k8s) obj;
                k8sVar.a(new rfr.a(wh50Var, ogrVar, wh50Var2));
                k8sVar.a(new rfr.b(wh50Var3, wh50Var4));
                return s3q0.a;
        }
    }

    public /* synthetic */ c(wh50 wh50Var, ogr ogrVar, wh50 wh50Var2, wh50 wh50Var3, wh50 wh50Var4) {
        this.c = wh50Var;
        this.d = ogrVar;
        this.e = wh50Var2;
        this.f = wh50Var3;
        this.g = wh50Var4;
    }
}
