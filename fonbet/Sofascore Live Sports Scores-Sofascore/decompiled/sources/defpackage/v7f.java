package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes3.dex */
public final class v7f {

    @NotNull
    public static final u7f Companion = new u7f();
    public final int a;
    public final String b;

    public /* synthetic */ v7f(int i, int i2, String str) {
        if (3 != (i & 3)) {
            oea.z(i, 3, t7f.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7f)) {
            return false;
        }
        v7f v7fVar = (v7f) obj;
        return this.a == v7fVar.a && Intrinsics.c(this.b, v7fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return lnb.q(sb, this.b, ')');
    }

    public v7f(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
