package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i4i {
    public final Stage a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public i4i(Stage stage, boolean z, boolean z2, boolean z3) {
        stage.getClass();
        this.a = stage;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4i)) {
            return false;
        }
        i4i i4iVar = (i4i) obj;
        return Intrinsics.c(this.a, i4iVar.a) && this.b == i4iVar.b && this.c == i4iVar.c && this.d == i4iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageDetailsHeadFlags(stage=");
        sb.append(this.a);
        sb.append(", mediaHighlights=");
        sb.append(this.b);
        sb.append(", driverPerformance=");
        return w1l.i(", odds=", ")", sb, this.c, this.d);
    }
}
