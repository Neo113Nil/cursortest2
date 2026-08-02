package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v7m {
    public final ozf a;
    public final String b;

    public v7m(ozf ozfVar) {
        String str;
        ozfVar.getClass();
        this.a = ozfVar;
        hv9 hv9Var = ozfVar.b;
        hv9Var.getClass();
        o71 o71Var = (o71) CollectionsKt.firstOrNull(hv9Var);
        this.b = (o71Var == null || (str = o71Var.a) == null) ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7m) && Intrinsics.c(this.a, ((v7m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RepresentationInfo(representation=" + this.a + ')';
    }
}
