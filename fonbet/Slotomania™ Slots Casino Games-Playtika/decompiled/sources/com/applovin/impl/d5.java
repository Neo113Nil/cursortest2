package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class d5 {
    private final com.applovin.impl.sdk.l a;
    private final Map b = new HashMap();
    private final Object c = new Object();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    private static class c {
        private final e5 a;
        private final long b;
        private final long c;

        /* synthetic */ c(e5 e5Var, long j, a aVar) {
            this(e5Var, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.c > this.b;
        }

        protected boolean a(Object obj) {
            return obj instanceof c;
        }

        public e5 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            e5 c = c();
            e5 c2 = cVar.c();
            return c != null ? c.equals(c2) : c2 == null;
        }

        public int hashCode() {
            long b = b();
            long a = a();
            e5 c = c();
            return ((((((int) (b ^ (b >>> 32))) + 59) * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (c == null ? 43 : c.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        private c(e5 e5Var, long j) {
            this.a = e5Var;
            this.b = j;
            this.c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.b;
        }

        public long a() {
            return this.c;
        }
    }

    public d5(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
    }

    public void a(e5 e5Var, f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        if (e5Var == null) {
            return;
        }
        long v = f5Var.v();
        if (v <= 0) {
            return;
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("SignalCacheManager", "Caching signal for: " + f5Var);
        }
        String a2 = a(f5Var, str, maxAdFormat);
        c cVar = new c(e5Var, v, null);
        synchronized (this.c) {
            this.b.put(a2, cVar);
        }
    }

    public e5 b(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        String a2 = a(f5Var, str, maxAdFormat);
        synchronized (this.c) {
            c cVar = (c) this.b.get(a2);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.b.remove(a2);
                return null;
            }
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("SignalCacheManager", "Returning cached signal for: " + f5Var);
            }
            return cVar.a;
        }
    }

    private String a(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        String c2 = f5Var.c();
        int i = a.a[f5Var.t().ordinal()];
        if (i != 1) {
            return i != 2 ? c2 : c2 + "_" + str;
        }
        return c2 + "_" + maxAdFormat.getLabel();
    }
}
