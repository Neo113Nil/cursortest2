package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chatGroups.grouplist.j;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.r;
import ru.ozon.android.messenger.framework.presentation.models.u;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function2<d.w.a, m, m> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f84725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(j jVar) {
        super(2);
        this.f84725b = jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final m invoke(d.w.a aVar, m mVar) {
        d.w.a update = aVar;
        m oldVO = mVar;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        boolean z11 = update instanceof j.b;
        j jVar = this.f84725b;
        if (z11) {
            j.b bVar = (j.b) update;
            if (!Intrinsics.d(oldVO.c(), bVar.a())) {
                List<q> b11 = oldVO.b();
                ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
                for (q qVar : b11) {
                    int i11 = r.f91458b;
                    Intrinsics.checkNotNullParameter(qVar, "<this>");
                    arrayList.add(q.a(qVar, C7714v.a0(j.r(jVar, (u) C7714v.K(qVar.b()), Intrinsics.d(r.d(qVar), bVar.a()))), null, 2));
                }
                return m.a(oldVO, arrayList, bVar.a(), 9);
            }
        } else {
            if (update instanceof j.a) {
                return m.a(oldVO, C7714v.q0(((j.a) update).a(), oldVO.b()), null, 13);
            }
            if (update instanceof j.c) {
                List<q> b12 = oldVO.b();
                ArrayList arrayList2 = new ArrayList(C7714v.z(b12, 10));
                for (q qVar2 : b12) {
                    j.c cVar = (j.c) update;
                    if (Intrinsics.d(r.d(qVar2), r.d(cVar.a()))) {
                        q a11 = cVar.a();
                        Intrinsics.checkNotNullParameter(a11, "<this>");
                        qVar2 = q.a(qVar2, C7714v.a0(j.r(jVar, (u) C7714v.K(a11.b()), Intrinsics.d(oldVO.c(), r.d(cVar.a())))), null, 2);
                    }
                    arrayList2.add(qVar2);
                }
                return m.a(oldVO, arrayList2, null, 13);
            }
        }
        return null;
    }
}
