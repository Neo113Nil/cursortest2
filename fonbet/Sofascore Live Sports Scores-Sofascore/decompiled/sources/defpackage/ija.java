package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ija {
    public static final ija c = new ija(null, null, 63);
    public final Function1 a;
    public final Function1 b;

    public ija(Function1 function1, Function1 function12, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function12 = (i & 16) != 0 ? null : function12;
        this.a = function1;
        this.b = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ija)) {
            return false;
        }
        ija ijaVar = (ija) obj;
        return this.a == ijaVar.a && this.b == ijaVar.b;
    }

    public final int hashCode() {
        Function1 function1 = this.a;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 923521;
        Function1 function12 = this.b;
        return (hashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
    }
}
