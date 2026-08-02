package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zvj {
    public final int[] a;
    public final List b;
    public final int c;
    public final List d;

    public zvj(int[] iArr, List list, int i, List list2) {
        iArr.getClass();
        list.getClass();
        this.a = iArr;
        this.b = list;
        this.c = i;
        this.d = list2;
        if (iArr.length == 0) {
            a70.p("originalPageOffsets cannot be empty when constructing TransformablePage");
            throw null;
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        list2.getClass();
        ogj.j(") is provided, it must be same length as data (size = ", "If originalIndices (size = ", list2.size(), list.size());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zvj.class != obj.getClass()) {
            return false;
        }
        zvj zvjVar = (zvj) obj;
        return Arrays.equals(this.a, zvjVar.a) && Intrinsics.c(this.b, zvjVar.b) && this.c == zvjVar.c && Intrinsics.c(this.d, zvjVar.d);
    }

    public final int hashCode() {
        int d = (dmi.d(Arrays.hashCode(this.a) * 31, 31, this.b) + this.c) * 31;
        List list = this.d;
        return d + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        sb.append(this.c);
        sb.append(", hintOriginalIndices=");
        return fc6.p(sb, this.d, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zvj(int i, List list) {
        this(new int[]{i}, list, i, null);
        list.getClass();
    }
}
