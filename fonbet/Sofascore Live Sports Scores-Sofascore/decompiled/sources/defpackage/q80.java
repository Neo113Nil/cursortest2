package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q80 implements CharSequence {
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        y3g y3gVar = yqg.a;
    }

    public q80(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                p80 p80Var = (p80) list.get(i);
                Object obj = p80Var.a;
                if (obj instanceof pwh) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(p80Var);
                } else if (obj instanceof g8e) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(p80Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List H0 = arrayList2 != null ? CollectionsKt.H0(arrayList2, new qe8(11)) : null;
        if (H0 == null || H0.isEmpty()) {
            return;
        }
        int i2 = ((p80) CollectionsKt.Y(H0)).c;
        tzc tzcVar = m6a.a;
        tzc tzcVar2 = new tzc(1);
        tzcVar2.a(i2);
        int size2 = H0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            p80 p80Var2 = (p80) H0.get(i3);
            while (true) {
                if (tzcVar2.b != 0) {
                    int d = tzcVar2.d();
                    int i4 = p80Var2.b;
                    int i5 = p80Var2.c;
                    if (i4 >= d) {
                        tzcVar2.e(tzcVar2.b - 1);
                    } else if (i5 > d) {
                        s3a.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + d);
                    }
                }
            }
            tzcVar2.a(p80Var2.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public final List a(int i) {
        ?? r0;
        List list = this.a;
        if (list != null) {
            r0 = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                p80 p80Var = (p80) obj;
                if ((p80Var.a instanceof gbb) && r80.b(0, i, p80Var.b, p80Var.c)) {
                    r0.add(obj);
                }
            }
        } else {
            r0 = km5.a;
        }
        r0.getClass();
        return r0;
    }

    public final q80 b(Function1 function1) {
        o80 o80Var = new o80(this);
        ArrayList arrayList = o80Var.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            p80 p80Var = (p80) function1.invoke(((n80) arrayList.get(i)).a(Integer.MIN_VALUE));
            arrayList.set(i, new n80(p80Var.a, p80Var.d, p80Var.b, p80Var.c));
        }
        return o80Var.h();
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q80 subSequence(int i, int i2) {
        if (!(i <= i2)) {
            s3a.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        q80 q80Var = r80.a;
        if (i > i2) {
            s3a.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                p80 p80Var = (p80) list.get(i3);
                int i4 = p80Var.b;
                int i5 = p80Var.c;
                if (r80.b(i, i2, i4, i5)) {
                    arrayList2.add(new p80(p80Var.a, p80Var.d, Math.max(i, p80Var.b) - i, Math.min(i2, i5) - i));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new q80(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q80)) {
            return false;
        }
        q80 q80Var = (q80) obj;
        return Intrinsics.c(this.b, q80Var.b) && Intrinsics.c(this.a, q80Var.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public q80(String str) {
        this(str, km5.a);
    }

    public q80(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
