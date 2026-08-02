package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l6h implements Serializable {
    public final boolean a;
    public final List b;

    public l6h(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6h)) {
            return false;
        }
        l6h l6hVar = (l6h) obj;
        return this.a == l6hVar.a && Intrinsics.c(this.b, l6hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Series(isFirstTeam=" + this.a + ", pointList=" + this.b + ")";
    }
}
