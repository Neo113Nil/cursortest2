package defpackage;

import com.appsflyer.internal.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l2h implements n2h {
    public final List a;

    public l2h(c7 c7Var) {
        c7Var.getClass();
        this.a = c7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2h) && Intrinsics.c(this.a, ((l2h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i.i("SaveReorder(reorderedItems=", ")", this.a);
    }
}
