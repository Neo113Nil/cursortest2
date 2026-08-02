package defpackage;

import android.app.UiModeManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i2o {
    public final p03 a;
    public d7n d;
    public final String g;
    public final ytn b = new ytn();
    public boolean e = false;
    public boolean f = false;
    public f0l c = new f0l(null);

    public i2o(fjg fjgVar, p03 p03Var, String str) {
        this.a = p03Var;
        this.g = str;
        WebView webView = (WebView) p03Var.c;
        d7n d7nVar = new d7n();
        d7nVar.a = System.nanoTime();
        d7nVar.b = 1;
        d7nVar.c = str;
        d7nVar.d = new f0l(null);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        d7nVar.d = new f0l(webView);
        this.d = d7nVar;
        tsn.c.a.add(this);
        d7n d7nVar2 = this.d;
        d7nVar2.getClass();
        nun nunVar = nun.a;
        WebView a = d7nVar2.a();
        String str2 = (String) d7nVar2.c;
        JSONObject jSONObject = new JSONObject();
        myn.b(jSONObject, "impressionOwner", rto.JAVASCRIPT);
        myn.b(jSONObject, "mediaEventsOwner", (rto) fjgVar.b);
        myn.b(jSONObject, "creativeType", g7o.DEFINED_BY_JAVASCRIPT);
        myn.b(jSONObject, "impressionType", cko.DEFINED_BY_JAVASCRIPT);
        myn.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(fjgVar.a));
        nunVar.a(a, "init", jSONObject, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        char c;
        String str;
        String str2;
        String str3;
        Iterator it;
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        ArrayList arrayList = tsn.c.b;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            avn a = avn.a();
            a.getClass();
            lsn lsnVar = lsn.d;
            lsnVar.c = a;
            lsnVar.a = true;
            boolean z2 = x5n.g().importance == 100 || lsnVar.a();
            lsnVar.b = z2;
            lsnVar.b(z2);
            j0o.f.getClass();
            j0o.b();
            rrn rrnVar = a.b;
            rrnVar.getClass();
            rrnVar.f.submit(new f2n(rrnVar, 27));
            rrnVar.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, rrnVar);
        }
        float f = avn.a().a;
        d7n d7nVar = this.d;
        d7nVar.getClass();
        nun.a.a(d7nVar.a(), "setDeviceVolume", Float.valueOf(f), (String) d7nVar.c);
        d7n d7nVar2 = this.d;
        Date date = esn.e.a;
        d7nVar2.b(date != null ? (Date) date.clone() : null);
        d7n d7nVar3 = this.d;
        d7nVar3.getClass();
        JSONObject jSONObject = new JSONObject();
        myn.b(jSONObject, "environment", "app");
        p03 p03Var = this.a;
        p03Var.getClass();
        myn.b(jSONObject, "adSessionType", cyn.JAVASCRIPT);
        JSONObject jSONObject2 = new JSONObject();
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        myn.b(jSONObject2, "deviceType", wt3.m(str4, "; ", new StringBuilder(String.valueOf(str4).length() + 2 + String.valueOf(str5).length()), str5));
        myn.b(jSONObject2, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        myn.b(jSONObject2, L6.F, U3.d);
        myn.b(jSONObject, "deviceInfo", jSONObject2);
        UiModeManager uiModeManager = bea.d;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                c = 2;
            } else if (currentModeType == 4) {
                c = 1;
            }
            if (c != 1) {
                str = "ctv";
            } else if (c == 2) {
                str = "mobile";
            } else {
                if (c != 3) {
                    throw null;
                }
                str = "other";
            }
            myn.b(jSONObject, "deviceCategory", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("clid");
            jSONArray.put("vlid");
            myn.b(jSONObject, "supports", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            ((kif) p03Var.b).getClass();
            myn.b(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "Google1");
            myn.b(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "3.39.0");
            myn.b(jSONObject, "omidNativeInfo", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            myn.b(jSONObject4, "libraryVersion", "1.5.2-google_20241009");
            myn.b(jSONObject4, "appId", gun.b.a.getApplicationContext().getPackageName());
            myn.b(jSONObject, "app", jSONObject4);
            str2 = (String) p03Var.f;
            if (str2 != null) {
                myn.b(jSONObject, "contentUrl", str2);
            }
            str3 = (String) p03Var.e;
            if (str3 != null) {
                myn.b(jSONObject, "customReferenceData", str3);
            }
            JSONObject jSONObject5 = new JSONObject();
            it = Collections.unmodifiableList((ArrayList) p03Var.d).iterator();
            if (!it.hasNext()) {
                throw lnb.i(it);
            }
            nun.a.a(d7nVar3.a(), "startSession", this.g, jSONObject, jSONObject5, null);
            return;
        }
        c = 3;
        if (c != 1) {
        }
        myn.b(jSONObject, "deviceCategory", str);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("clid");
        jSONArray2.put("vlid");
        myn.b(jSONObject, "supports", jSONArray2);
        JSONObject jSONObject32 = new JSONObject();
        ((kif) p03Var.b).getClass();
        myn.b(jSONObject32, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "Google1");
        myn.b(jSONObject32, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, "3.39.0");
        myn.b(jSONObject, "omidNativeInfo", jSONObject32);
        JSONObject jSONObject42 = new JSONObject();
        myn.b(jSONObject42, "libraryVersion", "1.5.2-google_20241009");
        myn.b(jSONObject42, "appId", gun.b.a.getApplicationContext().getPackageName());
        myn.b(jSONObject, "app", jSONObject42);
        str2 = (String) p03Var.f;
        if (str2 != null) {
        }
        str3 = (String) p03Var.e;
        if (str3 != null) {
        }
        JSONObject jSONObject52 = new JSONObject();
        it = Collections.unmodifiableList((ArrayList) p03Var.d).iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new f0l(view);
        d7n d7nVar = this.d;
        d7nVar.getClass();
        d7nVar.a = System.nanoTime();
        d7nVar.b = 1;
        Collection<i2o> unmodifiableCollection = Collections.unmodifiableCollection(tsn.c.a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (i2o i2oVar : unmodifiableCollection) {
            if (i2oVar != this && ((View) i2oVar.c.get()) == view) {
                i2oVar.c.clear();
            }
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        d7n d7nVar = this.d;
        d7nVar.getClass();
        nun.a.a(d7nVar.a(), "finishSession", (String) d7nVar.c);
        tsn tsnVar = tsn.c;
        ArrayList arrayList = tsnVar.a;
        ArrayList arrayList2 = tsnVar.b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            avn a = avn.a();
            a.getClass();
            j0o j0oVar = j0o.f;
            j0oVar.getClass();
            Handler handler = j0o.h;
            if (handler != null) {
                handler.removeCallbacks(j0o.j);
                j0o.h = null;
            }
            j0oVar.a.clear();
            j0o.g.post(new fsn(j0oVar, 21));
            lsn lsnVar = lsn.d;
            lsnVar.a = false;
            lsnVar.c = null;
            rrn rrnVar = a.b;
            rrnVar.b.getContentResolver().unregisterContentObserver(rrnVar);
        }
        ((f0l) this.d.d).clear();
        this.d = null;
    }
}
