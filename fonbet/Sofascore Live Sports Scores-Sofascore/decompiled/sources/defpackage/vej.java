package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class vej implements Serializable {

    @NotNull
    public static final uej Companion = new uej();
    public static final joa[] c = {ypa.a(ysa.b, new eej(1)), null};
    public final r9k a;
    public final String b;

    public /* synthetic */ vej(int i, r9k r9kVar, String str) {
        if (3 != (i & 3)) {
            oea.z(i, 3, tej.a.getDescriptor());
            throw null;
        }
        this.a = r9kVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vej)) {
            return false;
        }
        vej vejVar = (vej) obj;
        return Intrinsics.c(this.a, vejVar.a) && Intrinsics.c(this.b, vejVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextRow(title=" + this.a + ", text=" + this.b + ")";
    }

    public vej(q9k q9kVar, String str) {
        this.a = q9kVar;
        this.b = str;
    }
}
