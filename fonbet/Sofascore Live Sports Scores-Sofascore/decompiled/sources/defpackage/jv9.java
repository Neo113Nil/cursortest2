package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jv9 {
    public final Object a;
    public final Object b;
    public final Object c;

    public jv9(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.a;
        sb.append(obj);
        sb.append(U3.j.b);
        sb.append(this.b);
        sb.append(" and ");
        sb.append(obj);
        sb.append(U3.j.b);
        sb.append(this.c);
        return new IllegalArgumentException(sb.toString());
    }
}
