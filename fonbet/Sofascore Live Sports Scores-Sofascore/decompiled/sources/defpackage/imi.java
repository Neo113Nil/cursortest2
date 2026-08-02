package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class imi {
    public final String a;
    public final Function1 b;

    public imi(String str, Function1 function1) {
        this.a = str;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imi)) {
            return false;
        }
        imi imiVar = (imi) obj;
        return this.a.equals(imiVar.a) && this.b.equals(imiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestionEntryValidator(errorMessage=" + this.a + ", isValid=" + this.b + ")";
    }
}
