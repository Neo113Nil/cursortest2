package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC2423fe;

/* loaded from: classes4.dex */
public class c7 implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final com.applovin.impl.sdk.l a;
    private final SharedPreferences b;
    private Integer c;
    private Integer d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public c7(com.applovin.impl.sdk.l lVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.l.p());
        this.b = defaultSharedPreferences;
        this.a = lVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.c = a(b5.u.a());
        this.d = a(b5.v.a());
        this.e = h();
        this.f = (String) c5.a(b5.x, (Object) null, defaultSharedPreferences, false);
        this.g = (String) c5.a(b5.y, (Object) null, defaultSharedPreferences, false);
        this.h = (String) c5.a(b5.z, (Object) null, defaultSharedPreferences, false);
        this.i = (String) c5.a(b5.B, (Object) null, defaultSharedPreferences, false);
        this.j = (String) c5.a(b5.D, (Object) null, defaultSharedPreferences, false);
        b(this.g);
    }

    private Integer h() {
        String a = b5.w.a();
        if (this.b.contains(a)) {
            Integer num = (Integer) c5.a(a, null, Integer.class, this.b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().b("TcfManager", "Integer value (" + num + ") for " + a + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l = (Long) c5.a(a, null, Long.class, this.b, false);
            if (l != null) {
                if (l.longValue() == 1 || l.longValue() == 0) {
                    return Integer.valueOf(l.intValue());
                }
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().b("TcfManager", "Long value (" + l + ") for " + a + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) c5.a(a, null, Boolean.class, this.b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) c5.a(a, null, String.class, this.b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().b("TcfManager", "String value (" + str + ") for " + a + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i) {
        return f7.a(i, this.g);
    }

    public boolean b() {
        return f7.a(this.g);
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return a7.a(this.c);
    }

    public Integer e() {
        return this.c;
    }

    public Integer f() {
        return this.d;
    }

    public Integer g() {
        return this.e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.c) + a("CMP SDK Version", this.d) + a(b5.w.a(), this.e) + a(b5.x.a(), this.f) + a(b5.y.a(), this.g);
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(b5.u.a())) {
            this.c = a(str);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.c);
            }
            this.a.S0();
            return;
        }
        if (str.equals(b5.v.a())) {
            this.d = a(str);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.d);
                return;
            }
            return;
        }
        if (str.equals(b5.w.a())) {
            this.e = h();
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.e);
                return;
            }
            return;
        }
        if (str.equals(b5.x.a())) {
            this.f = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f);
            }
            this.a.S0();
            return;
        }
        if (str.equals(b5.y.a())) {
            this.g = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.g);
            }
            b(this.g);
            return;
        }
        if (str.equals(b5.z.a())) {
            this.h = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.h);
                return;
            }
            return;
        }
        if (str.equals(b5.A.a())) {
            String str2 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(b5.B.a())) {
            this.i = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.i);
                return;
            }
            return;
        }
        if (str.equals(b5.C.a())) {
            String str3 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(b5.D.a())) {
            this.j = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    private Integer a(String str) {
        if (this.b.contains(str)) {
            Integer num = (Integer) c5.a(str, null, Integer.class, this.b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) c5.a(str, null, Long.class, this.b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) c5.a(str, null, String.class, this.b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public Boolean b(int i) {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i - 1));
    }

    public Boolean c(int i) {
        String str = this.j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i - 1));
    }

    public Boolean d(int i) {
        String str = this.h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i - 1));
    }

    private void b(String str) {
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean a = f7.a(InterfaceC2423fe.c.e, str);
        if (a != null) {
            if (a.booleanValue()) {
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                q0.b(true, com.applovin.impl.sdk.l.p());
            } else {
                this.a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.a.Q().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                q0.b(false, com.applovin.impl.sdk.l.p());
            }
            this.a.S0();
            return;
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    private String a(String str, Object obj) {
        return "\n" + str + " - " + (obj != null ? obj.toString() : "No value set");
    }
}
