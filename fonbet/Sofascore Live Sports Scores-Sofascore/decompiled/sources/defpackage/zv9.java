package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zv9 implements Serializable {
    public final Comparator a;
    public final Object[] b;

    public zv9(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    public Object readResolve() {
        yv9 yv9Var = new yv9(this.a);
        yv9Var.d(this.b);
        return yv9Var.i();
    }
}
