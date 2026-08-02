package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class el4 {
    public static final el4 b;
    public final List a;

    static {
        new el4(b.j("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        b = new el4(b.j("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public el4(List list) {
        list.getClass();
        this.a = list;
        if (list.size() != 7) {
            a70.p("Day of week names must contain exactly 7 elements");
            throw null;
        }
        Iterator it = b.h(list).iterator();
        while (it.hasNext()) {
            int nextInt = ((l6a) it).nextInt();
            if (((CharSequence) this.a.get(nextInt)).length() <= 0) {
                a70.p("A day-of-week name can not be empty");
                throw null;
            }
            for (int i = 0; i < nextInt; i++) {
                if (Intrinsics.c(this.a.get(nextInt), this.a.get(i))) {
                    ogj.h(mz1.o(new StringBuilder("Day-of-week names must be unique, but '"), (String) this.a.get(nextInt), "' was repeated"));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof el4) {
            return Intrinsics.c(this.a, ((el4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.f0(this.a, ", ", "DayOfWeekNames(", ")", dl4.b, 24);
    }
}
