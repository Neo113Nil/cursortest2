package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class evc {
    public static final evc b;
    public final List a;

    static {
        new evc(b.j("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        b = new evc(b.j("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public evc(List list) {
        list.getClass();
        this.a = list;
        if (list.size() != 12) {
            a70.p("Month names must contain exactly 12 elements");
            throw null;
        }
        Iterator it = b.h(list).iterator();
        while (it.hasNext()) {
            int nextInt = ((l6a) it).nextInt();
            if (((CharSequence) this.a.get(nextInt)).length() <= 0) {
                a70.p("A month name can not be empty");
                throw null;
            }
            for (int i = 0; i < nextInt; i++) {
                if (Intrinsics.c(this.a.get(nextInt), this.a.get(i))) {
                    ogj.h(mz1.o(new StringBuilder("Month names must be unique, but '"), (String) this.a.get(nextInt), "' was repeated"));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof evc) {
            return Intrinsics.c(this.a, ((evc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return CollectionsKt.f0(this.a, ", ", "MonthNames(", ")", dvc.b, 24);
    }
}
