package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h("stage")
@r5h
/* loaded from: classes6.dex */
public final class u6l implements v6l {

    @NotNull
    public static final t6l Companion = new t6l();
    public final Stage a;

    public /* synthetic */ u6l(int i, Stage stage) {
        if (1 == (i & 1)) {
            this.a = stage;
        } else {
            oea.z(i, 1, s6l.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6l) && Intrinsics.c(this.a, ((u6l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StageEntity(stage=" + this.a + ")";
    }

    public u6l(Stage stage) {
        this.a = stage;
    }
}
