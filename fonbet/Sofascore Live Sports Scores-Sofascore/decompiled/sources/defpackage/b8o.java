package defpackage;

import com.google.android.gms.internal.auth.zzfe;
import com.google.android.gms.internal.auth.zzff;
import com.google.android.gms.internal.auth.zzhe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b8o extends q8o {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // defpackage.q8o
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) omo.c(obj, j);
        if (list instanceof zzff) {
            unmodifiableList = ((zzff) list).zze();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        omo.g(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q8o
    public final void b(long j, Object obj, Object obj2) {
        ArrayList arrayList;
        List list = (List) omo.c(obj2, j);
        int size = list.size();
        List list2 = (List) omo.c(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzff ? new zzfe(size) : new ArrayList(size);
            omo.g(j, obj, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                omo.g(j, obj, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof zzhe) {
                zzhe zzheVar = (zzhe) list2;
                zzfe zzfeVar = new zzfe(zzheVar.size() + size);
                zzfeVar.addAll(zzfeVar.b.size(), zzheVar);
                omo.g(j, obj, zzfeVar);
                arrayList = zzfeVar;
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        omo.g(j, obj, list);
    }
}
