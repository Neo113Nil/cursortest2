package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fp5 {
    public final KClass a;
    public final Function1 b;
    public final Function1 c;
    public final tc3 d;

    public fp5(KClass kClass, Function1 function1, Function1 function12, tc3 tc3Var) {
        this.a = kClass;
        this.b = function1;
        this.c = function12;
        this.d = tc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fp5) {
            fp5 fp5Var = (fp5) obj;
            return Intrinsics.c(this.a, fp5Var.a) && this.b.equals(fp5Var.b) && this.c.equals(fp5Var.c) && this.d == fp5Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }
}
