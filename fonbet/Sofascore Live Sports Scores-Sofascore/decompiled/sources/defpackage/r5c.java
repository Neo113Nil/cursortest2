package defpackage;

import com.sofascore.model.newNetwork.Highlight;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r5c implements g6c {
    public final Highlight a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Integer e;
    public final boolean f;

    public /* synthetic */ r5c(Highlight highlight, boolean z, boolean z2, int i, Integer num, int i2) {
        this(highlight, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : num, (i2 & 32) == 0);
    }

    public static r5c a(r5c r5cVar, boolean z, int i, int i2) {
        Highlight highlight = r5cVar.a;
        boolean z2 = r5cVar.b;
        if ((i2 & 4) != 0) {
            z = r5cVar.c;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            i = r5cVar.d;
        }
        Integer num = r5cVar.e;
        boolean z4 = r5cVar.f;
        r5cVar.getClass();
        highlight.getClass();
        return new r5c(highlight, z2, z3, i, num, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5c)) {
            return false;
        }
        r5c r5cVar = (r5c) obj;
        return Intrinsics.c(this.a, r5cVar.a) && this.b == r5cVar.b && this.c == r5cVar.c && this.d == r5cVar.d && Intrinsics.c(this.e, r5cVar.e) && this.f == r5cVar.f;
    }

    public final int hashCode() {
        int a = wv8.a(this.d, dmi.e(dmi.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "HighlightItem(highlight=" + this.a + ", isFeedHighlight=" + this.b + ", isPlaying=" + this.c + ", index=" + this.d + ", postId=" + this.e + ", isStage=" + this.f + ")";
    }

    public r5c(Highlight highlight, boolean z, boolean z2, int i, Integer num, boolean z3) {
        highlight.getClass();
        this.a = highlight;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = num;
        this.f = z3;
    }
}
