package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.d0;
import defpackage.cw3;
import defpackage.fx5;
import defpackage.yd0;
import defpackage.zd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t {
    public final com.facebook.internal.c a;
    public final String b;
    public ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;

    public t(com.facebook.internal.c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    public final synchronized void a(e eVar) {
        if (cw3.a.contains(this)) {
            return;
        }
        try {
            eVar.getClass();
            if (this.c.size() + this.d.size() >= 1000) {
                this.e++;
            } else {
                this.c.add(eVar);
            }
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }

    public final synchronized void b(boolean z) {
        if (cw3.a.contains(this)) {
            return;
        }
        if (z) {
            try {
                this.c.addAll(this.d);
            } catch (Throwable th) {
                cw3.a(this, th);
                return;
            }
        }
        this.d.clear();
        this.e = 0;
    }

    public final synchronized List c() {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.c;
            this.c = new ArrayList();
            return arrayList;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    public final int d(d0 d0Var, Context context, boolean z, boolean z2) {
        t tVar;
        Throwable th;
        t tVar2;
        Throwable th2;
        if (cw3.a.contains(this)) {
            return 0;
        }
        try {
            try {
                synchronized (this) {
                    try {
                        int i = this.e;
                        fx5.b(this.c);
                        this.d.addAll(this.c);
                        this.c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = this.d.iterator();
                        while (it.hasNext()) {
                            try {
                                e eVar = (e) it.next();
                                if (!z && eVar.c) {
                                }
                                jSONArray.put(eVar.a);
                                jSONArray2.put(eVar.b);
                            } catch (Throwable th3) {
                                th2 = th3;
                                tVar2 = this;
                                throw th2;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            Unit unit = Unit.a;
                            e(d0Var, context, i, jSONArray, jSONArray2, z2);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th4) {
                            th = th4;
                            tVar = this;
                            cw3.a(tVar, th);
                            return 0;
                        }
                    } catch (Throwable th5) {
                        tVar2 = this;
                        th2 = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
                cw3.a(tVar, th);
                return 0;
            }
        } catch (Throwable th7) {
            th = th7;
            tVar = this;
            th = th;
            cw3.a(tVar, th);
            return 0;
        }
    }

    public final void e(d0 d0Var, Context context, int i, JSONArray jSONArray, JSONArray jSONArray2, boolean z) {
        JSONObject jSONObject;
        try {
            if (cw3.a.contains(this)) {
                return;
            }
            try {
                jSONObject = zd0.a(yd0.b, this.a, this.b, z, context);
                if (this.e > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            d0Var.c = jSONObject;
            Bundle bundle = d0Var.d;
            String jSONArray3 = jSONArray.toString();
            jSONArray3.getClass();
            bundle.putString("custom_events", jSONArray3);
            if (com.facebook.internal.q.b(com.facebook.internal.o.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            d0Var.e = jSONArray3;
            d0Var.d = bundle;
        } catch (Throwable th) {
            cw3.a(this, th);
        }
    }
}
