package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jrn {
    public final Object a;
    public final Object b;
    public final Object c;

    public jrn(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.b);
        return new IllegalArgumentException(wt3.m(String.valueOf(obj), U3.j.b, mz1.s("Multiple entries with same key: ", valueOf, U3.j.b, valueOf2, " and "), String.valueOf(this.c)));
    }
}
