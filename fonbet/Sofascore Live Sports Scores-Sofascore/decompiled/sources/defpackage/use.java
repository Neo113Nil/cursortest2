package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class use {
    public final List a;
    public final x2g b;

    public use(List list, x2g x2gVar) {
        x2gVar.getClass();
        this.a = list;
        this.b = x2gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof use)) {
            return false;
        }
        use useVar = (use) obj;
        return Intrinsics.c(this.a, useVar.a) && Intrinsics.c(this.b, useVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return (this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "PlayerMatchesPagingWrapper(transfers=" + this.a + ", matches=" + this.b + ", lastMatches=null)";
    }
}
