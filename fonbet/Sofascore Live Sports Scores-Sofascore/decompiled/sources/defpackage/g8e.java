package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g8e implements m80 {
    public final int a;
    public final int b;
    public final long c;
    public final bdj d;
    public final aje e;
    public final r7b f;
    public final int g;
    public final int h;
    public final lej i;

    public g8e(int i, int i2, long j, bdj bdjVar, aje ajeVar, r7b r7bVar, int i3, int i4, lej lejVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bdjVar;
        this.e = ajeVar;
        this.f = r7bVar;
        this.g = i3;
        this.h = i4;
        this.i = lejVar;
        mfj[] mfjVarArr = lfj.b;
        if (lfj.a(j, lfj.c)) {
            return;
        }
        if (lfj.c(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        s3a.c("lineHeight can't be negative (" + lfj.c(j) + ')');
    }

    public final g8e a(g8e g8eVar) {
        return g8eVar == null ? this : h8e.a(this, g8eVar.a, g8eVar.b, g8eVar.c, g8eVar.d, g8eVar.e, g8eVar.f, g8eVar.g, g8eVar.h, g8eVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8e)) {
            return false;
        }
        g8e g8eVar = (g8e) obj;
        return this.a == g8eVar.a && this.b == g8eVar.b && lfj.a(this.c, g8eVar.c) && Intrinsics.c(this.d, g8eVar.d) && Intrinsics.c(this.e, g8eVar.e) && Intrinsics.c(this.f, g8eVar.f) && this.g == g8eVar.g && this.h == g8eVar.h && Intrinsics.c(this.i, g8eVar.i);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        mfj[] mfjVarArr = lfj.b;
        int c = ljg.c(a, 31, this.c);
        bdj bdjVar = this.d;
        int hashCode = (c + (bdjVar != null ? bdjVar.hashCode() : 0)) * 31;
        aje ajeVar = this.e;
        int hashCode2 = (hashCode + (ajeVar != null ? ajeVar.hashCode() : 0)) * 31;
        r7b r7bVar = this.f;
        int a2 = wv8.a(this.h, wv8.a(this.g, (hashCode2 + (r7bVar != null ? r7bVar.hashCode() : 0)) * 31, 31), 31);
        lej lejVar = this.i;
        return a2 + (lejVar != null ? lejVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) p7j.a(this.a)) + ", textDirection=" + ((Object) z8j.a(this.b)) + ", lineHeight=" + ((Object) lfj.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) l7b.a(this.g)) + ", hyphens=" + ((Object) ql9.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
