package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f5e {
    public static final f5e e;
    public final ArrayList a;
    public int b;
    public int c;
    public int d;

    static {
        List c = a.c(new zvj(0, km5.a));
        pfb pfbVar = pfb.c;
        pfb pfbVar2 = pfb.b;
        rfb rfbVar = new rfb(pfbVar, pfbVar2, pfbVar2);
        c.getClass();
        e = new f5e(new z3e(sfb.a, c, 0, 0, rfbVar, null));
    }

    public f5e(List list, int i, int i2) {
        list.getClass();
        this.a = new ArrayList(list);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((zvj) it.next()).b.size();
        }
        this.b = i3;
        this.c = i;
        this.d = i2;
    }

    public final tvk a(int i) {
        ArrayList arrayList;
        int i2 = i - this.c;
        int i3 = 0;
        while (true) {
            arrayList = this.a;
            if (i2 < ((zvj) arrayList.get(i3)).b.size() || i3 >= b.i(arrayList)) {
                break;
            }
            i2 -= ((zvj) arrayList.get(i3)).b.size();
            i3++;
        }
        zvj zvjVar = (zvj) arrayList.get(i3);
        int i4 = i - this.c;
        int f = ((f() - i) - this.d) - 1;
        int d = d();
        int e2 = e();
        int i5 = zvjVar.c;
        List list = zvjVar.d;
        if (list != null && b.h(list).d(i2)) {
            i2 = ((Number) list.get(i2)).intValue();
        }
        return new tvk(i5, i2, i4, f, d, e2);
    }

    public final Object b(int i) {
        if (i < 0 || i >= f()) {
            pvd.m(f(), lnb.t(i, "Index: ", ", Size: "));
            return null;
        }
        int i2 = i - this.c;
        if (i2 < 0 || i2 >= this.b) {
            return null;
        }
        return c(i2);
    }

    public final Object c(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((zvj) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((zvj) arrayList.get(i2)).b.get(i);
    }

    public final int d() {
        Integer valueOf;
        int[] iArr = ((zvj) CollectionsKt.Y(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i > i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf.getClass();
        return valueOf.intValue();
    }

    public final int e() {
        Integer valueOf;
        int[] iArr = ((zvj) CollectionsKt.h0(this.a)).a;
        iArr.getClass();
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    if (i < i3) {
                        i = i3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            valueOf = Integer.valueOf(i);
        }
        valueOf.getClass();
        return valueOf.intValue();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f5e)) {
            return false;
        }
        f5e f5eVar = (f5e) obj;
        return d() == f5eVar.d() && e() == f5eVar.e() && this.c == f5eVar.c && this.d == f5eVar.d && Intrinsics.c(this.a, f5eVar.a);
    }

    public final int f() {
        return this.c + this.b + this.d;
    }

    public final d7a g(e4e e4eVar) {
        e4eVar.getClass();
        boolean z = e4eVar instanceof z3e;
        ArrayList arrayList = this.a;
        if (!z) {
            if (!(e4eVar instanceof w3e)) {
                a70.r("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            IntRange intRange = new IntRange(0, 0, 1);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                zvj zvjVar = (zvj) it.next();
                int[] iArr = zvjVar.a;
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intRange.d(iArr[i2])) {
                        i += zvjVar.b.size();
                        it.remove();
                        break;
                    }
                    i2++;
                }
            }
            int i3 = this.b - i;
            this.b = i3;
            sfb sfbVar = sfb.b;
            int i4 = this.d;
            this.d = 0;
            return new h6e(this.c + i3, i, 0, i4);
        }
        z3e z3eVar = (z3e) e4eVar;
        List list = z3eVar.b;
        Iterator it2 = list.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += ((zvj) it2.next()).b.size();
        }
        int ordinal = z3eVar.a.ordinal();
        if (ordinal == 0) {
            a70.r("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (ordinal == 1) {
            int i6 = this.c;
            arrayList.addAll(0, list);
            this.b += i5;
            this.c = z3eVar.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                o13.v(((zvj) it3.next()).b, arrayList2);
            }
            return new j6e(arrayList2, this.c, i6);
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        int i7 = this.d;
        int i8 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += i5;
        this.d = z3eVar.d;
        int i9 = this.c + i8;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            o13.v(((zvj) it4.next()).b, arrayList3);
        }
        return new g6e(i9, arrayList3, this.d, i7);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.d * 31) + (this.c * 31) + (e() * 31) + (d() * 31);
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(c(i2));
        }
        String f0 = CollectionsKt.f0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        vxd.p(this.c, " placeholders), ", f0, ", (", sb);
        return fc6.h(this.d, " placeholders)]", sb);
    }

    public f5e(z3e z3eVar) {
        this(z3eVar.b, z3eVar.c, z3eVar.d);
    }
}
