package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l73 {
    public final String a;
    public final r9k b;

    public l73(String str, r9k r9kVar) {
        str.getClass();
        this.a = str;
        this.b = r9kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l73)) {
            return false;
        }
        l73 l73Var = (l73) obj;
        return Intrinsics.c(this.a, l73Var.a) && this.b.equals(l73Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ComparisonPickerItemUiModel(key=" + this.a + ", label=" + this.b + ")";
    }
}
