package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oio {
    public final Object a;
    public final Object b;
    public final Object c;

    public oio(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        StringBuilder sb = new StringBuilder(wt3.h(length, 33, length2, 5, length3) + 1 + valueOf4.length());
        bf3.v(sb, "Multiple entries with same key: ", valueOf, U3.j.b, valueOf2);
        return new IllegalArgumentException(fc6.o(sb, " and ", valueOf3, U3.j.b, valueOf4));
    }
}
