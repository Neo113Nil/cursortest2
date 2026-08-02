package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.b5;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.l6;
import com.applovin.impl.m1;
import com.applovin.impl.m3;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f {
    private final l a;
    private final p b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final Set d = new HashSet();
    private final Object e = new Object();
    private final JSONArray f = new JSONArray();
    private final LinkedHashMap g = new LinkedHashMap();
    private final Object h = new Object();
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private final Object k = new Object();
    private List l;

    public f(l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
    }

    public void a(Activity activity) {
        if (this.c.compareAndSet(false, true)) {
            String str = (String) this.a.a(b5.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<m3> a = a(JsonUtils.getJSONArray(jSONObject, this.a.u0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.l = a;
                    for (m3 m3Var : a) {
                        this.i.put(m3Var.b(), m3Var);
                    }
                    long parseLong = StringUtils.parseLong(this.a.p0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    m5 m5Var = new m5(a, activity, this.a);
                    if (parseLong > 0) {
                        this.a.s0().a(m5Var, f6.b.MEDIATION, parseLong);
                    } else {
                        this.a.s0().a(m5Var);
                    }
                } catch (JSONException e) {
                    if (p.a()) {
                        this.b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                    m1.a((Throwable) e);
                }
            }
        }
    }

    public JSONArray b() {
        JSONArray shallowCopy;
        synchronized (this.h) {
            shallowCopy = JsonUtils.shallowCopy(this.f);
        }
        return shallowCopy;
    }

    public boolean c() {
        return this.c.get();
    }

    private void c(m3 m3Var) {
        String b = m3Var.b();
        synchronized (this.e) {
            if (this.d.contains(b)) {
                return;
            }
            this.d.add(b);
            this.a.R().d(f2.d0, h2.a(m3Var));
        }
    }

    boolean b(m3 m3Var) {
        boolean containsKey;
        synchronized (this.h) {
            containsKey = this.g.containsKey(m3Var.b());
        }
        return containsKey;
    }

    public u4 a(m3 m3Var, Activity activity) {
        m3 a = a(m3Var);
        if (a == null) {
            return u4.a("AdapterInitialization:" + m3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String b = m3Var.b();
        synchronized (this.k) {
            u4 u4Var = (u4) this.j.get(b);
            if (u4Var != null) {
                boolean z = true;
                boolean z2 = a.q() && u4Var.e();
                if (!((Boolean) this.a.a(z4.Y6)).booleanValue() || !u4Var.a()) {
                    z = false;
                }
                if (!z2 && !z) {
                    return u4Var;
                }
            }
            final u4 u4Var2 = new u4("AdapterInitialization:" + m3Var.c());
            this.j.put(b, u4Var2);
            h a2 = this.a.V().a(a);
            if (a2 == null) {
                u4Var2.a("Adapter implementation not found");
                return u4Var2;
            }
            if (p.a()) {
                this.b.d("MediationAdapterInitializationManager", "Initializing adapter " + a);
            }
            c(a);
            a2.a(MaxAdapterParametersImpl.a(a), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.f$$ExternalSyntheticLambda0
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                    f.a(u4.this, initializationStatus, str);
                }
            });
            l6.a(a.m(), u4Var2, "The adapter (" + m3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.a);
            return u4Var2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(u4 u4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                u4Var.a(str);
                return;
            } else {
                u4Var.b(initializationStatus);
                return;
            }
        }
        m1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        u4Var.a("Adapter reported INITIALIZING");
    }

    private m3 a(m3 m3Var) {
        List<m3> list;
        if (((Boolean) this.a.a(t3.I8)).booleanValue()) {
            m3 m3Var2 = (m3) this.i.get(m3Var.b());
            return m3Var2 != null ? m3Var2 : m3Var;
        }
        if (!this.a.u0().c() || (list = this.l) == null) {
            return m3Var;
        }
        for (m3 m3Var3 : list) {
            if (m3Var3.b().equals(m3Var.b())) {
                return m3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.h) {
            num = (Integer) this.g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.h) {
            hashSet = new HashSet(this.g.keySet());
        }
        return hashSet;
    }

    void a(m3 m3Var, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean b;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.h) {
            b = b(m3Var);
            if (!b) {
                this.g.put(m3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, m3Var.b());
                JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                JsonUtils.putLong(jSONObject, "init_time_ms", j);
                JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                this.f.put(jSONObject);
            }
        }
        if (b) {
            return;
        }
        this.a.a(m3Var);
        this.a.Z().processAdapterInitializationPostback(m3Var, j, initializationStatus, str);
        this.a.u().a(initializationStatus, m3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new m3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.h) {
            this.g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.a.u().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
