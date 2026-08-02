package defpackage;

import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pn8 implements oz7 {
    public static final List c = b.j(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public static final List d = b.j(2, 1, 0, 2, 1, 0, 2, 1, 0);
    public final l3 a;
    public final List b;

    public pn8() {
        List list = c;
        list.getClass();
        lw8 lw8Var = lhj.d;
        lw8Var.getClass();
        this.a = lw8Var;
        this.b = list;
    }

    @Override // defpackage.oz7
    public final wm8 a() {
        return new zh3(new k43(1, this.a.a(), gef.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 14), this.b);
    }

    @Override // defpackage.oz7
    public final v9e b() {
        l3 l3Var = this.a;
        return new v9e(a.c(new ajd(a.c(new fl3(l3Var.a(), l3Var.c())))), km5.a);
    }

    @Override // defpackage.oz7
    public final l3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof pn8;
    }

    public final int hashCode() {
        return 40;
    }
}
