package com.ironsource.sdk.controller;

import com.ironsource.B5;
import com.ironsource.C2396e5;
import com.ironsource.C2459he;
import com.ironsource.C2556n4;
import com.ironsource.C2614q8;
import com.ironsource.C2703v8;
import com.ironsource.C2757y8;
import com.ironsource.X3;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";
    private long a;
    private int b;
    private c c;
    private EnumC0219d d = EnumC0219d.NONE;
    private String e;
    private String f;
    private C2396e5 g;

    class a extends JSONObject {
        a() throws JSONException {
            putOpt(X3.a.j, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.b()));
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0219d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);

        private int a;

        EnumC0219d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    d(JSONObject jSONObject, String str, String str2, C2396e5 c2396e5) {
        int optInt = jSONObject.optInt(X3.a.j, -1);
        this.b = optInt;
        this.c = a(optInt);
        this.e = str;
        this.f = str2;
        this.g = c2396e5;
    }

    private c a(int i2) {
        return i2 != 1 ? i2 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            C2757y8 g = g();
            if (g.exists()) {
                C2757y8 h2 = h();
                if (h2.exists()) {
                    h2.delete();
                }
                IronSourceStorageUtils.renameFile(g.getPath(), h2.getPath());
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C2757y8 h() {
        return new C2757y8(this.e, "fallback_mobileController.html");
    }

    private C2757y8 i() {
        return new C2757y8(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C2614q8 a2 = new C2614q8().a(B5.y, Integer.valueOf(this.b));
        if (this.a > 0) {
            a2.a(B5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C2703v8.a(C2459he.x, a2.a());
    }

    JSONObject f() throws JSONException {
        return SafeIronSourceControllerBridge.com_ironsource_sdk_controller_d$a_jsonObjectInit(this);
    }

    C2757y8 g() {
        return new C2757y8(this.e, X3.f);
    }

    boolean k() {
        int i2 = b.a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new C2757y8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new C2757y8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                C2757y8 g = g();
                C2757y8 i3 = i();
                if (!i3.exists() && !g.exists()) {
                    a(new C2757y8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!i3.exists() && g.exists()) {
                    EnumC0219d enumC0219d = EnumC0219d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC0219d;
                    a(enumC0219d);
                    a(new C2757y8(this.e, i3.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0219d enumC0219d2 = EnumC0219d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC0219d2;
                    a(enumC0219d2);
                    d();
                    a(new C2757y8(this.e, i3.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C2757y8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                EnumC0219d enumC0219d3 = EnumC0219d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC0219d3;
                a(enumC0219d3);
                a(new C2757y8(this.e, i3.getName()));
                return true;
            } catch (Exception e) {
                C2556n4.d().a(e);
            }
        }
        return false;
    }

    boolean m() {
        return this.d != EnumC0219d.NONE;
    }

    void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0219d enumC0219d = EnumC0219d.CONTROLLER_FROM_SERVER;
        this.d = enumC0219d;
        a(enumC0219d);
        runnable.run();
    }

    void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC0219d enumC0219d = EnumC0219d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC0219d;
            a(enumC0219d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C2757y8 c2757y8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(c2757y8, this.f);
    }

    void a(C2614q8 c2614q8) {
        c2614q8.a(B5.y, Integer.valueOf(this.b));
        C2703v8.a(C2459he.v, c2614q8.a());
        this.a = System.currentTimeMillis();
    }

    private void a(EnumC0219d enumC0219d) {
        C2614q8 a2 = new C2614q8().a(B5.y, Integer.valueOf(this.b)).a(B5.z, Integer.valueOf(enumC0219d.b()));
        if (this.a > 0) {
            a2.a(B5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C2703v8.a(C2459he.w, a2.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return false;
        }
    }
}
