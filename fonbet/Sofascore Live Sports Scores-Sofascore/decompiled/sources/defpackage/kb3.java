package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kb3 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ec3 f;
    public final Set g;

    public kb3(String str, Set set, Set set2, int i, int i2, ec3 ec3Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ec3Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static jb3 a(oif oifVar) {
        return new jb3(oifVar, new oif[0]);
    }

    public static jb3 b(Class cls) {
        return new jb3(cls, new Class[0]);
    }

    public static kb3 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oif.a(cls));
        for (Class cls2 : clsArr) {
            d2a.r(cls2, "Null interface");
            hashSet.add(oif.a(cls2));
        }
        return new kb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ib3(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
