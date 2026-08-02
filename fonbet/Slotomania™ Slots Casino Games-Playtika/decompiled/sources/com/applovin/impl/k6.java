package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class k6 extends k5 {
    private final AppLovinAdLoadListener g;
    private final a h;

    private static final class a extends v7 {
        a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
            super(jSONObject, jSONObject2, lVar);
        }

        void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.b.add(q8Var);
        }
    }

    private static final class b extends k6 {
        private final String i;

        b(String str, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            this.i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            q8 b = b(this.i);
            if (b != null) {
                a(b);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to process XML: " + this.i);
            }
            c(this.i);
            a(w7.XML_PARSING);
        }
    }

    private static final class c extends k6 {
        private final JSONObject i;

        c(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            this.i = v7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "No VAST response received.");
                }
                a(w7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.a.a(z4.U4)).intValue()) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.c.b(this.b, "VAST response is over max length");
                    }
                    a(w7.XML_PARSING);
                    return;
                }
                q8 b = b(string);
                if (b != null) {
                    a(b);
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.b(this.b, "Unable to process XML: " + string);
                }
                c(string);
                a(w7.XML_PARSING);
            }
        }
    }

    private static final class d extends k6 {
        private final q8 i;

        d(q8 q8Var, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            if (q8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (v7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.i = q8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Processing VAST Wrapper response...");
            }
            a(this.i);
        }
    }

    k6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessVastResponse", lVar);
        if (v7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.g = appLovinAdLoadListener;
        this.h = (a) v7Var;
    }

    public static k6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new c(new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    protected q8 b(String str) {
        try {
            return r8.a(str, this.a);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Failed to process VAST response", th);
            }
            a(w7.XML_PARSING);
            this.a.E().a(this.b, th);
            return null;
        }
    }

    protected void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.a.a(z4.n5)), 1).iterator();
        while (it.hasNext()) {
            q8 b2 = b("<VAST>" + it.next() + "</VAST>");
            if (b2 != null) {
                this.h.a(b2);
            }
        }
    }

    public static k6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new b(str, new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    public static k6 a(q8 q8Var, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new d(q8Var, v7Var, appLovinAdLoadListener, lVar);
    }

    void a(q8 q8Var) {
        int d2 = this.h.d();
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Finished parsing XML at depth " + d2);
        }
        this.h.a(q8Var);
        if (d8.b(q8Var)) {
            int intValue = ((Integer) this.a.a(z4.V4)).intValue();
            if (d2 < intValue) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "VAST response is wrapper. Resolving...");
                }
                this.a.s0().a(new s6(this.h, this.g, this.a));
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Reached beyond max wrapper depth of " + intValue);
            }
            a(w7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (d8.a(q8Var)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "VAST response is inline. Rendering ad...");
            }
            this.a.s0().a(new n6(this.h, this.g, this.a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "VAST response is an error");
        }
        a(w7.NO_WRAPPER_RESPONSE);
    }

    void a(w7 w7Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.b(this.b, "Failed to process VAST response due to VAST error code " + w7Var);
        }
        d8.a(this.h, this.g, w7Var, -6, this.a);
    }
}
