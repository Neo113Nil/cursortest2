package defpackage;

import com.appsflyer.internal.i;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t9b {
    public final int a;
    public final String b;

    public t9b(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9b)) {
            return false;
        }
        t9b t9bVar = (t9b) obj;
        return this.a == t9bVar.a && Intrinsics.c(this.b, t9bVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g(this.a, "LabelValue(labelResId=", ", value=", this.b, ")");
    }
}
