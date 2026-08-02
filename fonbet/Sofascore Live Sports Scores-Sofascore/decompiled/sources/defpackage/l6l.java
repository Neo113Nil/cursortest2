package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l6l {
    public final k6l a;
    public final List b;
    public final int c;

    public l6l(k6l k6lVar, xbb xbbVar, int i) {
        xbbVar.getClass();
        this.a = k6lVar;
        this.b = xbbVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6l)) {
            return false;
        }
        l6l l6lVar = (l6l) obj;
        return this.a.equals(l6lVar.a) && Intrinsics.c(this.b, l6lVar.b) && this.c == l6lVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dmi.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagedWindow(page=");
        sb.append(this.a);
        sb.append(", pageOffsets=");
        sb.append(this.b);
        sb.append(", pageOffset=");
        return fc6.h(this.c, ")", sb);
    }
}
