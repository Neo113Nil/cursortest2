package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sm4 implements n55 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ e1d d;

    public sm4(Set set, Object obj, Set set2, e1d e1dVar) {
        this.a = set;
        this.b = obj;
        this.c = set2;
        this.d = e1dVar;
    }

    @Override // defpackage.n55
    public final void d() {
        Set set = this.a;
        Object obj = this.b;
        boolean remove = set.remove(obj);
        if (this.c.contains(obj) || !remove) {
            return;
        }
        List list = (List) this.d.getValue();
        if (!(list instanceof RandomAccess)) {
            Iterator it = CollectionsKt.B0(list).iterator();
            while (it.hasNext()) {
                ((f7d) it.next()).a.invoke(obj);
            }
            return;
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            ((f7d) list.get(size)).a.invoke(obj);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }
}
