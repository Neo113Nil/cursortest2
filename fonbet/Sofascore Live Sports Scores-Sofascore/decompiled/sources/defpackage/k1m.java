package defpackage;

import com.blaze.blazesdk.style.players.IPlayerCustomActionButton;
import com.blaze.blazesdk.style.players.IPlayerCustomStackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k1m {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public static ArrayList a(List list, List list2, w4m w4mVar) {
        list.getClass();
        list2.getClass();
        w4mVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            IPlayerCustomStackButton iPlayerCustomStackButton = next instanceof IPlayerCustomStackButton ? (IPlayerCustomStackButton) next : null;
            String id = iPlayerCustomStackButton != null ? iPlayerCustomStackButton.getId() : null;
            if (id != null) {
                arrayList.add(id);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if ((obj instanceof IPlayerCustomStackButton) && !arrayList.contains(((IPlayerCustomStackButton) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        int ordinal = w4mVar.ordinal();
        if (ordinal == 0) {
            return CollectionsKt.w0(list, arrayList2);
        }
        if (ordinal == 1) {
            return CollectionsKt.w0(arrayList2, list);
        }
        zzl.b();
        return null;
    }

    public static void b(List list) {
        list.getClass();
        if (list.size() > 2) {
            throw new IllegalArgumentException(("The maximum number of custom buttons allowed in the stack is 2, but provided " + list.size() + '.').toString());
        }
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((IPlayerCustomActionButton) it.next()).getCustomParams().getId());
        }
        if (CollectionsKt.W0(arrayList).size() == arrayList.size()) {
            return;
        }
        a70.p("Custom buttons stack order cannot contain elements with the same ID.");
    }
}
