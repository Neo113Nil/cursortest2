package com.applovin.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class q0 {
    private static final a a = new a("Age Restricted User", b5.r);
    private static final a b = new a("Has User Consent", b5.q);
    private static final a c = new a("\"Do Not Sell\"", b5.s);

    public static class a {
        private final String a;
        private final b5 b;

        a(String str, b5 b5Var) {
            this.a = str;
            this.b = b5Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) c5.a(this.b, (Object) null, context);
            }
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to get value for key: " + this.b);
            return null;
        }

        public String a() {
            return this.a;
        }

        public String a(Context context) {
            Boolean b = b(context);
            return b != null ? b.toString() : "No value set";
        }
    }

    public static a a() {
        return c;
    }

    public static a b() {
        return b;
    }

    public static a c() {
        return a;
    }

    public static boolean a(boolean z, Context context) {
        return a(b5.s, Boolean.valueOf(z), context);
    }

    public static boolean b(boolean z, Context context) {
        return a(b5.q, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(b, context) + a(c, context);
    }

    private static boolean a(b5 b5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to update compliance value for key: " + b5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) c5.a(b5Var, (Object) null, context);
            c5.b(b5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
            if (lVar != null) {
                lVar.E().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.a + " - " + aVar.a(context);
    }
}
