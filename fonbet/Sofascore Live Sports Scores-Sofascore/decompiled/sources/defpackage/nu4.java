package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nu4 {
    public final String a;
    public final sz8 b;

    public nu4(Set set, sz8 sz8Var) {
        this.a = b(set);
        this.b = sz8Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            nu0 nu0Var = (nu0) it.next();
            sb.append(nu0Var.a);
            sb.append('/');
            sb.append(nu0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        sz8 sz8Var = this.b;
        synchronized (((HashSet) sz8Var.b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) sz8Var.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ');
        synchronized (((HashSet) sz8Var.b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) sz8Var.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
