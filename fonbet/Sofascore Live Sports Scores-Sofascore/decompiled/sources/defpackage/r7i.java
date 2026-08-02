package defpackage;

import com.sofascore.model.mvvm.model.Stage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r7i {
    public final Stage a;
    public final ub5 b;

    public r7i(Stage stage, ub5 ub5Var) {
        this.a = stage;
        this.b = ub5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7i)) {
            return false;
        }
        r7i r7iVar = (r7i) obj;
        return this.a.equals(r7iVar.a) && this.b.equals(r7iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StageDriverItemData(stage=" + this.a + ", status=" + this.b + ")";
    }
}
