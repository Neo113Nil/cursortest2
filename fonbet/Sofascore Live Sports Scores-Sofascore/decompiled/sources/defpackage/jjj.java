package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jjj implements fm8 {
    public final r9k a;
    public final r9k b;
    public final int c;

    public jjj(r9k r9kVar, r9k r9kVar2, int i) {
        r9kVar2 = (i & 2) != 0 ? null : r9kVar2;
        int i2 = (i & 4) != 0 ? 3500 : 4000;
        this.a = r9kVar;
        this.b = r9kVar2;
        this.c = i2;
    }

    @Override // defpackage.fm8
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjj)) {
            return false;
        }
        jjj jjjVar = (jjj) obj;
        return this.a.equals(jjjVar.a) && Intrinsics.c(this.b, jjjVar.b) && this.c == jjjVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r9k r9kVar = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleCard(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", durationMilliseconds=");
        return fc6.h(this.c, ")", sb);
    }
}
