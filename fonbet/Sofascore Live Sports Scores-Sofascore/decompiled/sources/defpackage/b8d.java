package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b8d {
    public static final cz1 b;
    public static final cz1 c;
    public static final bz1 d;
    public static final bz1 e;
    public static final cz1 f;
    public static final bz1 g;
    public static final bz1 h;
    public static final cz1 i;
    public static final bz1 j;
    public static final bz1 k;
    public static final cz1 l;
    public static final bz1 m;
    public static final bz1 n;
    public static final cz1 o;
    public static final bz1 p;
    public static final bz1 q;
    public final boolean a;

    static {
        boolean z = false;
        b = new cz1(z, 2);
        int i2 = 4;
        c = new cz1(z, i2);
        boolean z2 = true;
        d = new bz1(z2, i2);
        e = new bz1(z2, 5);
        f = new cz1(z, 3);
        g = new bz1(z2, 6);
        h = new bz1(z2, 7);
        i = new cz1(z, 1);
        j = new bz1(z2, 2);
        k = new bz1(z2, 3);
        int i3 = 0;
        l = new cz1(z, i3);
        m = new bz1(z2, i3);
        n = new bz1(z2, 1);
        o = new cz1(z2, 5);
        p = new bz1(z2, 8);
        q = new bz1(z2, 9);
    }

    public b8d(boolean z) {
        this.a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
