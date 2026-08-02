package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iwk {
    public final int a;
    public final r9k b;
    public final int c;

    public iwk(int i, r9k r9kVar, int i2) {
        r9kVar.getClass();
        this.a = i;
        this.b = r9kVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwk)) {
            return false;
        }
        iwk iwkVar = (iwk) obj;
        return this.a == iwkVar.a && Intrinsics.c(this.b, iwkVar.b) && this.c == iwkVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisibleDateHeader(headerIndex=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.b);
        sb.append(", offsetPx=");
        return fc6.h(this.c, ")", sb);
    }
}
