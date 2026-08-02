package com.ironsource.sdk.controller;

import com.ironsource.C4015c5;
import com.ironsource.C4096ge;
import com.ironsource.C4157k4;
import com.ironsource.C4233o8;
import com.ironsource.C4322t8;
import com.ironsource.C4376w8;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class d {
    static final String h = "controllerSourceData";
    private static final String i = "next_";
    private static final String j = "fallback_";
    private static final String k = "controllerSourceCode";
    private long a;
    private int b;
    private c c;
    private EnumC1212d d = EnumC1212d.NONE;
    private String e;
    private String f;
    private C4015c5 g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(U3.a.j, Integer.valueOf(d.this.b));
            putOpt(d.k, Integer.valueOf(d.this.d.b()));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static /* synthetic */ class b {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC1212d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);

        private int a;

        EnumC1212d(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    public d(JSONObject jSONObject, String str, String str2, C4015c5 c4015c5) {
        int optInt = jSONObject.optInt(U3.a.j, -1);
        this.b = optInt;
        this.c = a(optInt);
        this.e = str;
        this.f = str2;
        this.g = c4015c5;
    }

    private void a(EnumC1212d enumC1212d) {
        C4233o8 a2 = new C4233o8().a(C4427z5.y, Integer.valueOf(this.b)).a(C4427z5.z, Integer.valueOf(enumC1212d.b()));
        if (this.a > 0) {
            a2.a(C4427z5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C4322t8.a(C4096ge.w, a2.a());
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    private void c() {
        try {
            C4376w8 g = g();
            if (g.exists()) {
                C4376w8 h2 = h();
                if (h2.exists()) {
                    h2.delete();
                }
                IronSourceStorageUtils.renameFile(g.getPath(), h2.getPath());
            }
        } catch (Exception e) {
            C4157k4.d().a(e);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C4376w8 h() {
        return new C4376w8(this.e, "fallback_mobileController.html");
    }

    private C4376w8 i() {
        return new C4376w8(this.e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C4233o8 a2 = new C4233o8().a(C4427z5.y, Integer.valueOf(this.b));
        if (this.a > 0) {
            a2.a(C4427z5.B, Long.valueOf(System.currentTimeMillis() - this.a));
        }
        C4322t8.a(C4096ge.x, a2.a());
    }

    public JSONObject f() throws JSONException {
        return new a();
    }

    public C4376w8 g() {
        return new C4376w8(this.e, U3.f);
    }

    public boolean k() {
        int i2 = b.a[this.c.ordinal()];
        if (i2 == 1) {
            e();
            a(new C4376w8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 2) {
            c();
            a(new C4376w8(this.e, SDKUtils.getFileName(this.f)));
            return false;
        }
        if (i2 == 3) {
            try {
                C4376w8 g = g();
                C4376w8 i3 = i();
                if (!i3.exists() && !g.exists()) {
                    a(new C4376w8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                if (!i3.exists() && g.exists()) {
                    EnumC1212d enumC1212d = EnumC1212d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.d = enumC1212d;
                    a(enumC1212d);
                    a(new C4376w8(this.e, i3.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC1212d enumC1212d2 = EnumC1212d.PREPARED_CONTROLLER_LOADED;
                    this.d = enumC1212d2;
                    a(enumC1212d2);
                    d();
                    a(new C4376w8(this.e, i3.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C4376w8(this.e, SDKUtils.getFileName(this.f)));
                    return false;
                }
                EnumC1212d enumC1212d3 = EnumC1212d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.d = enumC1212d3;
                a(enumC1212d3);
                a(new C4376w8(this.e, i3.getName()));
                return true;
            } catch (Exception e) {
                C4157k4.d().a(e);
            }
        }
        return false;
    }

    public boolean m() {
        return this.d != EnumC1212d.NONE;
    }

    private c a(int i2) {
        if (i2 == 1) {
            return c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
        }
        if (i2 != 2) {
            return c.FETCH_FROM_SERVER_NO_FALLBACK;
        }
        return c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL;
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC1212d enumC1212d = EnumC1212d.CONTROLLER_FROM_SERVER;
        this.d = enumC1212d;
        a(enumC1212d);
        runnable.run();
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC1212d enumC1212d = EnumC1212d.FALLBACK_CONTROLLER_RECOVERY;
            this.d = enumC1212d;
            a(enumC1212d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C4376w8 c4376w8) {
        if (this.g.c()) {
            return;
        }
        this.g.a(c4376w8, this.f);
    }

    public void a(C4233o8 c4233o8) {
        c4233o8.a(C4427z5.y, Integer.valueOf(this.b));
        C4322t8.a(C4096ge.v, c4233o8.a());
        this.a = System.currentTimeMillis();
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e) {
            C4157k4.d().a(e);
            return false;
        }
    }
}
