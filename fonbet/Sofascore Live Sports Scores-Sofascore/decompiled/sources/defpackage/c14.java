package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class c14 implements Serializable {
    public final int a;
    public final String b;
    public final List c;

    public c14(int i, String str, List list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c14 c14Var = (c14) obj;
        return this.a == c14Var.a && Intrinsics.c(this.b, c14Var.b) && Intrinsics.c(this.c, c14Var.c);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return this.c.hashCode() + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }
}
