package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.a3;
import com.applovin.impl.m3;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class g {
    private final l b;
    private final p c;
    private final Map a = Collections.synchronizedMap(new HashMap(16));
    private final Object d = new Object();
    private final Map e = new HashMap();
    private final Set f = new HashSet();
    private final Object g = new Object();
    private final Set h = new HashSet();

    private static class a {
        private final String a;
        private final String b;
        private final MaxAdFormat c;
        private final JSONObject d;

        a(String str, String str2, a3 a3Var, l lVar) {
            this.a = str;
            this.b = str2;
            JSONObject jSONObject = new JSONObject();
            this.d = jSONObject;
            JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (a3Var == null) {
                this.c = null;
            } else {
                this.c = a3Var.getFormat();
                JsonUtils.putString(jSONObject, "format", a3Var.getFormat().getLabel());
            }
        }

        JSONObject a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.c;
            MaxAdFormat maxAdFormat2 = aVar.c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.a + "', operationTag='" + this.b + "', format=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public g(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = lVar;
        this.c = lVar.Q();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.g) {
            arrayList = new ArrayList(this.h.size());
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a());
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.d) {
            HashSet hashSet = new HashSet(this.e.size());
            Iterator it = this.e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((Class) it.next()).getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    h a(m3 m3Var) {
        return a(m3Var, false);
    }

    h a(m3 m3Var, boolean z) {
        Class cls;
        h hVar;
        if (m3Var != null) {
            String c = m3Var.c();
            String b = m3Var.b();
            if (TextUtils.isEmpty(c)) {
                if (p.a()) {
                    this.c.b("MediationAdapterManager", "No adapter name provided for " + b + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(b)) {
                if (p.a()) {
                    this.c.b("MediationAdapterManager", "Unable to find default className for '" + c + "'");
                }
                return null;
            }
            if (z && (hVar = (h) this.a.get(b)) != null) {
                return hVar;
            }
            synchronized (this.d) {
                if (!this.f.contains(b)) {
                    if (this.e.containsKey(b)) {
                        cls = (Class) this.e.get(b);
                    } else {
                        Class a2 = a(b);
                        if (a2 == null) {
                            if (p.a()) {
                                this.c.k("MediationAdapterManager", "Adapter " + c + " could not be loaded, class " + b + " not found");
                            }
                            this.f.add(b);
                            return null;
                        }
                        cls = a2;
                    }
                    h a3 = a(m3Var, cls, z);
                    if (a3 != null) {
                        if (p.a()) {
                            this.c.a("MediationAdapterManager", "Loaded " + c);
                        }
                        this.e.put(b, cls);
                        if (z) {
                            this.a.put(m3Var.b(), a3);
                        }
                        return a3;
                    }
                    if (p.a()) {
                        this.c.b("MediationAdapterManager", "Failed to load " + c);
                    }
                    this.f.add(b);
                    return null;
                }
                if (p.a()) {
                    this.c.a("MediationAdapterManager", "Not attempting to load " + c + " due to prior errors");
                }
                return null;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, a3 a3Var) {
        synchronized (this.g) {
            this.b.Q();
            if (p.a()) {
                this.b.Q().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.h.add(new a(str, str2, a3Var, this.b));
        }
    }

    private h a(m3 m3Var, Class cls, boolean z) {
        try {
            return new h(m3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.b.A0()), z, this.b);
        } catch (Throwable th) {
            p.c("MediationAdapterManager", "Failed to load adapter: " + m3Var, th);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            p.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
