package com.applovin.impl.sdk;

import com.applovin.impl.a3;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h {
    private final Map a = new HashMap();
    private final Object b = new Object();
    private final Map c = new HashMap();
    private final Object d = new Object();

    public static class b {
        private long a;
        private final JSONObject b;
        private final ArrayDeque c;

        public String b() {
            return JsonUtils.getString(this.b, "bcode", "");
        }

        public c c() {
            return (c) this.c.getLast();
        }

        public String toString() {
            return "AdInfo{states='" + this.c.toString() + "', adUnitId='" + a("ad_unit_id") + "', format='" + a("ad_format") + "', adapterName='" + a(BrandSafetyEvent.ad) + "', adapterClass='" + a("adapter_class") + "', adapterVersion='" + a("adapter_version") + "', bCode='" + b() + "', creativeId='" + a("creative_id") + "', updated=" + this.a + AbstractJsonLexerKt.END_OBJ;
        }

        private b(a3 a3Var, c cVar) {
            JSONObject jSONObject = new JSONObject();
            this.b = jSONObject;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c = arrayDeque;
            a(cVar);
            JsonUtils.putString(jSONObject, "ad_unit_id", a3Var.getAdUnitId());
            JsonUtils.putString(jSONObject, "ad_format", a3Var.getFormat().getLabel());
            JsonUtils.putString(jSONObject, BrandSafetyEvent.ad, a3Var.c());
            JsonUtils.putString(jSONObject, "adapter_class", a3Var.b());
            JsonUtils.putString(jSONObject, "adapter_version", a3Var.A());
            JsonUtils.putString(jSONObject, "bcode", a3Var.C());
            JsonUtils.putString(jSONObject, "creative_id", a3Var.getCreativeId());
            JsonUtils.putString(jSONObject, "operation", arrayDeque.toString());
        }

        public JSONObject a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.a = System.currentTimeMillis();
            this.c.add(cVar);
            JsonUtils.putString(this.b, "operation", cVar.toString());
        }

        private String a(String str) {
            return JsonUtils.getString(this.b, str, "");
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");

        private final String a;

        c(String str) {
            this.a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public h() {
        a();
    }

    private Set b(c cVar) {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = new HashSet(a(cVar));
        }
        return hashSet;
    }

    public void a(a3 a3Var, c cVar) {
        synchronized (this.d) {
            String C = a3Var.C();
            b bVar = (b) this.c.get(C);
            if (bVar == null) {
                if (cVar == c.DESTROY) {
                    return;
                }
                bVar = new b(a3Var, cVar);
                this.c.put(C, bVar);
            } else if (bVar.c() == cVar) {
                return;
            } else {
                bVar.a(cVar);
            }
            if (cVar == c.DESTROY) {
                this.c.remove(C);
            }
            a(bVar, cVar);
        }
    }

    public void a() {
        synchronized (this.b) {
            for (c cVar : c.values()) {
                this.a.put(cVar, new HashSet());
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.b) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a((c) it.next()).add(dVar);
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.b) {
            Iterator it = this.a.keySet().iterator();
            while (it.hasNext()) {
                a((c) it.next()).remove(dVar);
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.b) {
            Set set = (Set) this.a.get(cVar);
            if (m1.a(set)) {
                return set;
            }
            return new HashSet();
        }
    }

    private void a(b bVar, c cVar) {
        Iterator it = b(cVar).iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(bVar);
        }
    }
}
