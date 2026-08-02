package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l9f {
    public final String a;
    public final q9k b;

    public l9f(q9k q9kVar, String str) {
        this.a = str;
        this.b = q9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9f)) {
            return false;
        }
        l9f l9fVar = (l9f) obj;
        return Intrinsics.c(this.a, l9fVar.a) && this.b.equals(l9fVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ProfileEditorSummaryData(value=" + this.a + ", text=" + this.b + ")";
    }
}
