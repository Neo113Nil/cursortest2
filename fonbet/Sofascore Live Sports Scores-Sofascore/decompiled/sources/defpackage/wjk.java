package defpackage;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wjk {
    public final int a;
    public final Pattern b;
    public final Pattern c;
    public final Pattern d;

    public wjk(int i, Pattern pattern, Pattern pattern2, Pattern pattern3) {
        this.a = i;
        this.b = pattern;
        this.c = pattern2;
        this.d = pattern3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjk)) {
            return false;
        }
        wjk wjkVar = (wjk) obj;
        return this.a == wjkVar.a && Intrinsics.c(this.b, wjkVar.b) && Intrinsics.c(this.c, wjkVar.c) && Intrinsics.c(this.d, wjkVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Pattern pattern = this.b;
        int hashCode2 = (hashCode + (pattern == null ? 0 : pattern.hashCode())) * 31;
        Pattern pattern2 = this.c;
        int hashCode3 = (hashCode2 + (pattern2 == null ? 0 : pattern2.hashCode())) * 31;
        Pattern pattern3 = this.d;
        return hashCode3 + (pattern3 != null ? pattern3.hashCode() : 0);
    }

    public final String toString() {
        return "CompiledRule(place=" + this.a + ", keyRegex=" + this.b + ", keyNegativeRegex=" + this.c + ", valueRegex=" + this.d + ')';
    }
}
