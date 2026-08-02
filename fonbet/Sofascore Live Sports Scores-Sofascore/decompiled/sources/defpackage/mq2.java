package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mq2 {
    public final String a;
    public final Set b;

    public mq2(String str, Set set) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq2)) {
            return false;
        }
        mq2 mq2Var = (mq2) obj;
        return Intrinsics.c(this.a, mq2Var.a) && Intrinsics.c(this.b, mq2Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.b;
        return hashCode + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TranslateLanguageData(language=" + this.a + ", excludedSet=" + this.b + ")";
    }
}
