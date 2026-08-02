package defpackage;

import com.google.android.gms.internal.pal.zzacz;
import com.google.android.gms.internal.pal.zzadf;
import com.google.android.gms.internal.pal.zzadm;
import com.google.android.gms.internal.pal.zzadn;
import com.google.android.gms.internal.pal.zzafn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class man extends ran {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // defpackage.ran
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) sdn.g(obj, j);
        if (list instanceof zzadn) {
            unmodifiableList = ((zzadn) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof v9n) && (list instanceof zzadf)) {
                zzadf zzadfVar = (zzadf) list;
                if (zzadfVar.zzc()) {
                    zzadfVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        sdn.j(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ran
    public final void b(zzacz zzaczVar, Object obj, long j) {
        ArrayList arrayList;
        List list = (List) sdn.g(obj, j);
        int size = list.size();
        List list2 = (List) sdn.g(zzaczVar, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzadn ? new zzadm(size) : ((list2 instanceof v9n) && (list2 instanceof zzadf)) ? ((zzadf) list2).i(size) : new ArrayList(size);
            sdn.j(j, zzaczVar, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                sdn.j(j, zzaczVar, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof zzafn) {
                zzafn zzafnVar = (zzafn) list2;
                zzadm zzadmVar = new zzadm(zzafnVar.a.size() + size);
                zzadmVar.addAll(zzadmVar.b.size(), zzafnVar);
                sdn.j(j, zzaczVar, zzadmVar);
                arrayList = zzadmVar;
            } else if ((list2 instanceof v9n) && (list2 instanceof zzadf)) {
                zzadf zzadfVar = (zzadf) list2;
                if (!zzadfVar.zzc()) {
                    list2 = zzadfVar.i(list2.size() + size);
                    sdn.j(j, zzaczVar, list2);
                }
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
        sdn.j(j, zzaczVar, list);
    }
}
