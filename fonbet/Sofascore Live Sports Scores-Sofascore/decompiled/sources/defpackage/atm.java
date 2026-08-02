package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class atm {
    public final String a;
    public final Float b;
    public final Float c;
    public final qrl d;

    public atm(@NotNull String str, @Nullable Float f, @Nullable Float f2, @Nullable qrl qrlVar) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = qrlVar;
    }

    public static atm copy$default(atm atmVar, String str, Float f, Float f2, qrl qrlVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = atmVar.a;
        }
        if ((i & 2) != 0) {
            f = atmVar.b;
        }
        if ((i & 4) != 0) {
            f2 = atmVar.c;
        }
        if ((i & 8) != 0) {
            qrlVar = atmVar.d;
        }
        atmVar.getClass();
        str.getClass();
        return new atm(str, f, f2, qrlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atm)) {
            return false;
        }
        atm atmVar = (atm) obj;
        return Intrinsics.c(this.a, atmVar.a) && Intrinsics.c(this.b, atmVar.b) && Intrinsics.c(this.c, atmVar.c) && Intrinsics.c(this.d, atmVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        qrl qrlVar = this.d;
        return hashCode3 + (qrlVar != null ? qrlVar.hashCode() : 0);
    }

    public final String toString() {
        return "RenditionsModel(url=" + this.a + ", bitRate=" + this.b + ", fileSize=" + this.c + ", aspectRatio=" + this.d + ')';
    }
}
