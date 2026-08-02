package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c7i implements e7i {
    public final Stage a;
    public final boolean b;

    public c7i(Stage stage, boolean z) {
        stage.getClass();
        this.a = stage;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7i)) {
            return false;
        }
        c7i c7iVar = (c7i) obj;
        return Intrinsics.c(this.a, c7iVar.a) && this.b == c7iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActiveStageItem(stage=" + this.a + ", hasNext=" + this.b + ")";
    }
}
