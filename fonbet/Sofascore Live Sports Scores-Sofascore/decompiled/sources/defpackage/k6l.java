package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class k6l {

    @NotNull
    public static final j6l Companion = new j6l();
    public static final joa[] e = {ypa.a(ysa.b, new g0l(14)), null, null, null};
    public final List a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ k6l(int i, List list, int i2, boolean z, boolean z2) {
        if (15 != (i & 15)) {
            oea.z(i, 15, i6l.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6l)) {
            return false;
        }
        k6l k6lVar = (k6l) obj;
        return Intrinsics.c(this.a, k6lVar.a) && this.b == k6lVar.b && this.c == k6lVar.c && this.d == k6lVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Page(visibleFavorites=");
        sb.append(this.a);
        sb.append(", index=");
        sb.append(this.b);
        sb.append(", hasPrevious=");
        return w1l.i(", hasNext=", ")", sb, this.c, this.d);
    }

    public k6l(ArrayList arrayList, int i, boolean z, boolean z2) {
        this.a = arrayList;
        this.b = i;
        this.c = z;
        this.d = z2;
    }
}
