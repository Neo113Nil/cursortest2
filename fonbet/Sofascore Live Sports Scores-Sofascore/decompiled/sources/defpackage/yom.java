package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yom {
    public final String a;
    public final Float b;
    public final Float c;
    public final n7m d;

    public yom(@NotNull String str, @Nullable Float f, @Nullable Float f2, @NotNull n7m n7mVar) {
        str.getClass();
        n7mVar.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = n7mVar;
    }

    public static yom copy$default(yom yomVar, String str, Float f, Float f2, n7m n7mVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yomVar.a;
        }
        if ((i & 2) != 0) {
            f = yomVar.b;
        }
        if ((i & 4) != 0) {
            f2 = yomVar.c;
        }
        if ((i & 8) != 0) {
            n7mVar = yomVar.d;
        }
        yomVar.getClass();
        str.getClass();
        n7mVar.getClass();
        return new yom(str, f, f2, n7mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yom)) {
            return false;
        }
        yom yomVar = (yom) obj;
        return Intrinsics.c(this.a, yomVar.a) && Intrinsics.c(this.b, yomVar.b) && Intrinsics.c(this.c, yomVar.c) && this.d == yomVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Cacheable(url=" + this.a + ", bitRate=" + this.b + ", fileSize=" + this.c + ", mediaType=" + this.d + ')';
    }

    public /* synthetic */ yom(String str, Float f, Float f2, n7m n7mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, n7mVar);
    }
}
