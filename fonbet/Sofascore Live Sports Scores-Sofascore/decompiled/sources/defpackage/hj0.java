package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hj0 {
    public static final hj0 a = new hj0();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof nt9) || !(obj2 instanceof nt9)) {
            return Intrinsics.c(obj, obj2);
        }
        nt9 nt9Var = (nt9) obj;
        nt9 nt9Var2 = (nt9) obj2;
        return Intrinsics.c(nt9Var.a, nt9Var2.a) && nt9Var.b.equals(nt9Var2.b) && Intrinsics.c(nt9Var.e, nt9Var2.e) && nt9Var.f.equals(nt9Var2.f) && Intrinsics.c(nt9Var.g, nt9Var2.g) && Intrinsics.c(nt9Var.s, nt9Var2.s) && nt9Var.t == nt9Var2.t && nt9Var.u == nt9Var2.u;
    }

    public final int b(Object obj) {
        if (!(obj instanceof nt9)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        nt9 nt9Var = (nt9) obj;
        int hashCode = (nt9Var.b.hashCode() + (nt9Var.a.hashCode() * 31)) * 31;
        String str = nt9Var.e;
        int g = dmi.g(nt9Var.f, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        String str2 = nt9Var.g;
        return nt9Var.u.hashCode() + ((nt9Var.t.hashCode() + ((nt9Var.s.hashCode() + ((g + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
