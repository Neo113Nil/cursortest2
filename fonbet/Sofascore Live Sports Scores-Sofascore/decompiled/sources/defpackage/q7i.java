package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q7i {
    public final Stage a;
    public final List b;

    public q7i(Stage stage, List list) {
        this.a = stage;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7i)) {
            return false;
        }
        q7i q7iVar = (q7i) obj;
        return this.a.equals(q7iVar.a) && Intrinsics.c(this.b, q7iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "StageConstructorItemData(stage=" + this.a + ", driverResults=" + this.b + ")";
    }
}
