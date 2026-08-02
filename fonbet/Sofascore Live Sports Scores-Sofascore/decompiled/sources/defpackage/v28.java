package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v28 {
    public final String a;
    public final r9k b;

    public v28(String str, r9k r9kVar) {
        str.getClass();
        this.a = str;
        this.b = r9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v28)) {
            return false;
        }
        v28 v28Var = (v28) obj;
        return Intrinsics.c(this.a, v28Var.a) && this.b.equals(v28Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "FilterChipOptionUiModel(id=" + this.a + ", optionText=" + this.b + ", description=null)";
    }
}
