package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class i5h extends f5h {
    public static Sequence f(Sequence sequence, int i) {
        sequence.getClass();
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof yc5 ? ((yc5) sequence).a(i) : new tc5(sequence, i, 0);
        }
        ogj.h(lnb.k(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static d38 g(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new d38(sequence, true, function1);
    }

    public static d38 h(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new d38(sequence, false, function1);
    }

    public static Object i(tsk tskVar) {
        usk uskVar = (usk) tskVar.iterator();
        if (uskVar.hasNext()) {
            return uskVar.next();
        }
        ogj.m("Sequence is empty.");
        return null;
    }

    public static Object j(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static n78 k(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new n78(sequence, function1, h5h.b);
    }

    public static String l(Sequence sequence, String str) {
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : sequence) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            cii.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object m(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            ogj.m("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static lwj n(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return new lwj(sequence, function1);
    }

    public static d38 o(Sequence sequence, Function1 function1) {
        sequence.getClass();
        function1.getClass();
        return h(new lwj(sequence, function1), new z1h(4));
    }

    public static Sequence p(Sequence sequence, int i) {
        if (i >= 0) {
            return i == 0 ? qm5.a : sequence instanceof yc5 ? ((yc5) sequence).b(i) : new tc5(sequence, i, 1);
        }
        ogj.h(lnb.k(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List q(Sequence sequence) {
        sequence.getClass();
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return km5.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return a.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList r(Sequence sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
