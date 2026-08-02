package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ug8 {
    public final List a;

    public ug8(tg8... tg8VarArr) {
        if (tg8VarArr.length <= 0) {
            this.a = ph0.X(tg8VarArr);
        } else {
            tg8 tg8Var = tg8VarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ug8) {
            return Intrinsics.c(this.a, ((ug8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
