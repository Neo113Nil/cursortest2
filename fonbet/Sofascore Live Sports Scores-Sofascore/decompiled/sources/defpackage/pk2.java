package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pk2 {
    public final r9k a;
    public final r9k b;
    public final Function1 c;
    public final Function1 d;
    public final boolean e;

    public pk2(r9k r9kVar, r9k r9kVar2, Function1 function1, Function1 function12) {
        r9kVar.getClass();
        r9kVar2.getClass();
        function1.getClass();
        function12.getClass();
        this.a = r9kVar;
        this.b = r9kVar2;
        this.c = function1;
        this.d = function12;
        q9k q9kVar = r9kVar2 instanceof q9k ? (q9k) r9kVar2 : null;
        boolean z = false;
        if (q9kVar != null && q9kVar.a == R.string.average_sofascore_rating) {
            z = true;
        }
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2)) {
            return false;
        }
        pk2 pk2Var = (pk2) obj;
        return Intrinsics.c(this.a, pk2Var.a) && Intrinsics.c(this.b, pk2Var.b) && Intrinsics.c(this.c, pk2Var.c) && Intrinsics.c(this.d, pk2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CareerStatisticsDisplayItem(labelUiText=" + this.a + ", descriptionUiText=" + this.b + ", value=" + this.c + ", comparableValue=" + this.d + ")";
    }
}
