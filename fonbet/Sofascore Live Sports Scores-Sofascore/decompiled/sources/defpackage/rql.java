package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rql {
    public final String a;
    public final Float b;

    public rql(@NotNull String str, @Nullable Float f) {
        str.getClass();
        this.a = str;
        this.b = f;
    }

    public static rql copy$default(rql rqlVar, String str, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rqlVar.a;
        }
        if ((i & 2) != 0) {
            f = rqlVar.b;
        }
        rqlVar.getClass();
        str.getClass();
        return new rql(str, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rql)) {
            return false;
        }
        rql rqlVar = (rql) obj;
        return Intrinsics.c(this.a, rqlVar.a) && Intrinsics.c(this.b, rqlVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "ClosedCaptionFileModel(url=" + this.a + ", fileSize=" + this.b + ')';
    }
}
