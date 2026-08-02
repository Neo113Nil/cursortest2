package defpackage;

import com.blaze.blazesdk.style.shared.models.BlazeDp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h7m {
    public final Float a;
    public final Float b;
    public final BlazeDp c;
    public final BlazeDp d;

    public h7m(@Nullable Float f, @Nullable Float f2, @Nullable BlazeDp blazeDp, @Nullable BlazeDp blazeDp2) {
        this.a = f;
        this.b = f2;
        this.c = blazeDp;
        this.d = blazeDp2;
    }

    public static h7m copy$default(h7m h7mVar, Float f, Float f2, BlazeDp blazeDp, BlazeDp blazeDp2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = h7mVar.a;
        }
        if ((i & 2) != 0) {
            f2 = h7mVar.b;
        }
        if ((i & 4) != 0) {
            blazeDp = h7mVar.c;
        }
        if ((i & 8) != 0) {
            blazeDp2 = h7mVar.d;
        }
        h7mVar.getClass();
        return new h7m(f, f2, blazeDp, blazeDp2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7m)) {
            return false;
        }
        h7m h7mVar = (h7m) obj;
        return Intrinsics.c(this.a, h7mVar.a) && Intrinsics.c(this.b, h7mVar.b) && Intrinsics.c(this.c, h7mVar.c) && Intrinsics.c(this.d, h7mVar.d);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        BlazeDp blazeDp = this.c;
        int hashCode3 = (hashCode2 + (blazeDp == null ? 0 : blazeDp.hashCode())) * 31;
        BlazeDp blazeDp2 = this.d;
        return hashCode3 + (blazeDp2 != null ? blazeDp2.hashCode() : 0);
    }

    public final String toString() {
        return "InteractionSize(widthRatio=" + this.a + ", heightRatio=" + this.b + ", absoluteWidth=" + this.c + ", absoluteHeight=" + this.d + ')';
    }
}
