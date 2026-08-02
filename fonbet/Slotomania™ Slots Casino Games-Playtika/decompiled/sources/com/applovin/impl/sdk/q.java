package com.applovin.impl.sdk;

import com.applovin.impl.a3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class q {
    private final p a;
    private final Map b = new HashMap(5);
    private final Object c = new Object();
    private final Map d = Collections.synchronizedMap(new HashMap(5));
    private final Map e = Collections.synchronizedMap(new HashMap(5));

    public static class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String b = b();
            String b2 = aVar.b();
            if (b != null ? !b.equals(b2) : b2 != null) {
                return false;
            }
            String a = a();
            String a2 = aVar.a();
            if (a != null ? !a.equals(a2) : a2 != null) {
                return false;
            }
            String c = c();
            String c2 = aVar.c();
            return c != null ? c.equals(c2) : c2 == null;
        }

        public int hashCode() {
            String b = b();
            int hashCode = b == null ? 43 : b.hashCode();
            String a = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a == null ? 43 : a.hashCode());
            String c = c();
            return (hashCode2 * 59) + (c != null ? c.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.b;
        }
    }

    q(l lVar) {
        this.a = lVar.Q();
    }

    public String a(String str) {
        return (String) this.e.get(str);
    }

    public void b(a3 a3Var) {
        this.d.put(a3Var.getAdUnitId(), a3Var.T());
    }

    public void c(a3 a3Var) {
        synchronized (this.c) {
            if (p.a()) {
                this.a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + a3Var);
            }
            this.b.put(a3Var.getAdUnitId(), new a(a3Var.C(), a3Var.c(), a3Var.getNetworkName()));
        }
        this.e.put(a3Var.getAdUnitId(), a3Var.T());
    }

    public void a(a3 a3Var) {
        synchronized (this.c) {
            String adUnitId = a3Var.getAdUnitId();
            a aVar = (a) this.b.get(adUnitId);
            if (aVar == null) {
                if (p.a()) {
                    this.a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (a3Var.C().equals(aVar.b())) {
                if (p.a()) {
                    this.a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.b.remove(adUnitId);
            } else if (p.a()) {
                this.a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + a3Var + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public String b(String str) {
        return (String) this.d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.c) {
            aVar = (a) this.b.get(str);
        }
        return aVar;
    }
}
