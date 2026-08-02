package com.applovin.impl;

import io.sentry.cache.EnvelopeCache;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class u3 {
    private static final Set c = new HashSet();
    private static final Map d = new HashMap();
    public static final u3 e;
    public static final u3 f;
    public static final u3 g;
    private String a;
    private Set b;

    public enum a {
        SESSION(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
        INSTALL("install");

        private final String a;

        a(String str) {
            this.a = str;
        }

        public String b() {
            return this.a;
        }
    }

    public interface b {
        Object a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        e = a("ars", aVar, a.INSTALL);
        f = a("ar", aVar);
        g = a("ttdasi_ms", aVar);
    }

    private u3(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    protected boolean a(Object obj) {
        return obj instanceof u3;
    }

    public Set b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        if (!u3Var.a(this)) {
            return false;
        }
        String a2 = a();
        String a3 = u3Var.a();
        if (a2 != null ? !a2.equals(a3) : a3 != null) {
            return false;
        }
        Set b2 = b();
        Set b3 = u3Var.b();
        return b2 != null ? b2.equals(b3) : b3 == null;
    }

    public int hashCode() {
        String a2 = a();
        int hashCode = a2 == null ? 43 : a2.hashCode();
        Set b2 = b();
        return ((hashCode + 59) * 59) + (b2 != null ? b2.hashCode() : 43);
    }

    public String toString() {
        return this.a;
    }

    public String a() {
        return this.a;
    }

    private static u3 a(String str, a... aVarArr) {
        Set set = c;
        if (!set.contains(str)) {
            u3 u3Var = new u3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            d.put(str, u3Var);
            return u3Var;
        }
        throw new IllegalArgumentException("Key has already been used: " + str);
    }

    public boolean a(a aVar) {
        return this.b.contains(aVar);
    }

    public static u3 a(String str) {
        return (u3) d.get(str);
    }
}
