package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k4m {
    public final boolean a;
    public final n7m b;
    public final d0h c;

    public k4m(boolean z, @NotNull n7m n7mVar, @NotNull d0h d0hVar) {
        n7mVar.getClass();
        d0hVar.getClass();
        this.a = z;
        this.b = n7mVar;
        this.c = d0hVar;
    }

    public static k4m copy$default(k4m k4mVar, boolean z, n7m n7mVar, d0h d0hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = k4mVar.a;
        }
        if ((i & 2) != 0) {
            n7mVar = k4mVar.b;
        }
        if ((i & 4) != 0) {
            d0hVar = k4mVar.c;
        }
        k4mVar.getClass();
        n7mVar.getClass();
        d0hVar.getClass();
        return new k4m(z, n7mVar, d0hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4m)) {
            return false;
        }
        k4m k4mVar = (k4m) obj;
        return this.a == k4mVar.a && this.b == k4mVar.b && Intrinsics.c(this.c, k4mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Config(loopVideos=" + this.a + ", dominantVideoType=" + this.b + ", seekParameters=" + this.c + ')';
    }
}
