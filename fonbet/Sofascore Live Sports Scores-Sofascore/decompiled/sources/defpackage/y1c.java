package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class y1c implements f2c {
    public final String a;
    public final String b;
    public final int c;

    public y1c(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1c)) {
            return false;
        }
        y1c y1cVar = (y1c) obj;
        return Intrinsics.c(this.a, y1cVar.a) && this.b.equals(y1cVar.b) && this.c == y1cVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + dmi.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return fc6.h(this.c, ")", mz1.s("OnNewsClick(url=", this.a, ", providerName=", this.b, ", newsId="));
    }
}
