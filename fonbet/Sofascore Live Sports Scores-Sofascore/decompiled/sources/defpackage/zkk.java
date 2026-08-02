package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zkk {
    public final hlk a;
    public final ykk b;

    public zkk(hlk hlkVar, ykk ykkVar) {
        this.a = hlkVar;
        this.b = ykkVar;
    }

    public final List a() {
        hlk hlkVar = this.a;
        if (hlkVar != null) {
            return hlkVar.d.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkk)) {
            return false;
        }
        zkk zkkVar = (zkk) obj;
        return Intrinsics.c(this.a, zkkVar.a) && Intrinsics.c(this.b, zkkVar.b);
    }

    public final int hashCode() {
        hlk hlkVar = this.a;
        int hashCode = (hlkVar == null ? 0 : hlkVar.hashCode()) * 31;
        ykk ykkVar = this.b;
        return hashCode + (ykkVar != null ? ykkVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "Creative(linear=" + this.a + ", companionAd=" + this.b + ')';
    }
}
