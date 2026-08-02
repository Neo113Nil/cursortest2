package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.v;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<h, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends m>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d<X4.a> f84698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d<X4.a> dVar) {
        super(2);
        this.f84698b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends m> invoke(h hVar, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        h state = hVar;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        ru.ozon.android.messenger.framework.data.remote.mapper.a n11 = d.n(this.f84698b);
        List<ItemDTO> a11 = state.a();
        n11.getClass();
        if (a11 == null) {
            a11 = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            q f7 = n11.f(null, (ItemDTO) it.next());
            if (f7 != null) {
                arrayList.add(f7);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            List<u> b11 = qVar.b();
            ArrayList arrayList3 = new ArrayList(C7714v.z(b11, 10));
            for (u uVar : b11) {
                ru.ozon.android.messenger.blocks.chatGroups.a aVar = (ru.ozon.android.messenger.blocks.chatGroups.a) v.b(uVar);
                if (aVar != null) {
                    uVar = u.a(uVar, ru.ozon.android.messenger.blocks.chatGroups.a.a(aVar, Intrinsics.d(state.b(), r.d(qVar)), 2031));
                }
                arrayList3.add(uVar);
            }
            arrayList2.add(q.a(qVar, arrayList3, null, 2));
        }
        return C7714v.a0(new m(blockId, arrayList2, state.b(), false));
    }
}
