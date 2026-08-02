package defpackage;

import android.view.textclassifier.TextClassification;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b8j {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public b8j(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8j)) {
            return false;
        }
        b8j b8jVar = (b8j) obj;
        return Intrinsics.c(this.a, b8jVar.a) && pej.c(this.b, b8jVar.b) && Intrinsics.c(this.c, b8jVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = pej.c;
        return this.c.hashCode() + ljg.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) pej.i(this.b)) + ", textClassification=" + this.c + ')';
    }
}
