package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qhd {
    public final Stage a;
    public final List b;

    public qhd(Stage stage, List list) {
        stage.getClass();
        list.getClass();
        this.a = stage;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhd)) {
            return false;
        }
        qhd qhdVar = (qhd) obj;
        return Intrinsics.c(this.a, qhdVar.a) && Intrinsics.c(this.b, qhdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Stages(stage=" + this.a + ", subStages=" + this.b + ")";
    }
}
