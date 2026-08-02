package com.vk.core.apps;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;
import xsna.a68;
import xsna.b63;
import xsna.bpn0;
import xsna.cd3;
import xsna.j55;
import xsna.k55;
import xsna.ps0;
import xsna.qn6;
import xsna.t0f;
import xsna.tog;
import xsna.u0f;
import xsna.u94;
import xsna.ug9;
import xsna.v0f;
import xsna.v94;
import xsna.vg9;
import xsna.w94;
import xsna.z58;
import xsna.zg9;

/* compiled from: VkBuildConfig.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class a {
    public static volatile VKApplication a;
    public static volatile Bundle b;
    public static final bpn0 c = new bpn0(new tog(14));
    public static final bpn0 d = new bpn0(new v0f(15));
    public static final bpn0 e = new bpn0(new j55(19));
    public static final bpn0 f = new bpn0(new k55(17));
    public static final bpn0 g = new bpn0(new u94(17));
    public static final bpn0 h = new bpn0(new v94(18));
    public static final bpn0 i = new bpn0(new w94(22));
    public static final bpn0 j;
    public static final bpn0 k;
    public static final bpn0 l;
    public static final bpn0 m;
    public static final bpn0 n;
    public static final bpn0 o;
    public static final bpn0 p;
    public static final bpn0 q;

    static {
        new bpn0(new cd3(16));
        new bpn0(new z58(18));
        j = new bpn0(new a68(17));
        k = new bpn0(new ug9(17));
        l = new bpn0(new vg9(10));
        m = new bpn0(new qn6(12));
        new bpn0(new t0f(16));
        n = new bpn0(new ps0(14));
        o = new bpn0(new u0f(14));
        p = new bpn0(new zg9(16));
        q = new bpn0(new b63(19));
    }

    public static String a() {
        if (a == null || b == null) {
            throw new IllegalStateException("Please call init() method first");
        }
        return "com.vkontakte.android.permission.ACCESS_DATA" + ((String) p.getValue());
    }

    public static boolean b() {
        return ((Boolean) e.getValue()).booleanValue();
    }

    public static Object c(Object obj, String str) {
        if (a == null || b == null) {
            L.p("Please call init() method first, default value will be used.");
            return obj;
        }
        Bundle bundle = b;
        if (bundle == null) {
            bundle = null;
        }
        Object obj2 = bundle.get(str);
        Object obj3 = obj2 != null ? obj2 : null;
        return obj3 == null ? obj : obj3;
    }
}
