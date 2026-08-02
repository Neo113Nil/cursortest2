package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.chatGroups.grouplist.j;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9496h extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9490b f90627b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90628c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90629d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.input.b f90630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9496h(C9490b c9490b, ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.presentation.models.q qVar2, ru.ozon.android.messenger.blocks.input.b bVar) {
        super(1);
        this.f90627b = c9490b;
        this.f90628c = qVar;
        this.f90629d = qVar2;
        this.f90630e = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
        boolean k11;
        List<ru.ozon.android.messenger.framework.presentation.models.q> k12;
        ru.ozon.android.messenger.framework.domain.usecases.B b11;
        ru.ozon.android.messenger.framework.presentation.chatlist.f oldState = fVar;
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        List<ru.ozon.android.messenger.framework.presentation.models.q> f7 = oldState.f();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f7.iterator();
        while (it.hasNext()) {
            List<ru.ozon.android.messenger.framework.presentation.models.u> b12 = ((ru.ozon.android.messenger.framework.presentation.models.q) it.next()).b();
            ArrayList arrayList2 = new ArrayList(C7714v.z(b12, 10));
            Iterator<T> it2 = b12.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ru.ozon.android.messenger.framework.presentation.models.u) it2.next()).c());
            }
            C7714v.p(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (next instanceof ru.ozon.android.messenger.blocks.cell.c) {
                arrayList3.add(next);
            }
        }
        ru.ozon.android.messenger.blocks.cell.c cVar = (ru.ozon.android.messenger.blocks.cell.c) C7714v.M(arrayList3);
        ru.ozon.android.messenger.framework.presentation.models.q qVar = this.f90628c;
        String d11 = ru.ozon.android.messenger.framework.presentation.models.r.d(qVar);
        C9490b c9490b = this.f90627b;
        k11 = c9490b.k(d11);
        if (k11) {
            k12 = ru.ozon.android.messenger.utils.b.f(oldState.k(), new C9497i(this.f90629d, this.f90628c, this.f90630e, c9490b, cVar != null ? Boolean.valueOf(cVar.a()) : null));
        } else {
            k12 = oldState.k();
        }
        ArrayList e11 = ru.ozon.android.messenger.utils.b.e(oldState.f(), qVar, new C9495g(qVar));
        b11 = c9490b.f90617c;
        ArrayList b13 = b11.b(new d.w(new j.c(qVar)), e11);
        Map<Integer, ru.ozon.android.messenger.framework.presentation.models.q> b14 = oldState.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.U.h(b14.size()));
        Iterator<T> it4 = b14.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            linkedHashMap.put(entry.getKey(), Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) entry.getValue()), ru.ozon.android.messenger.framework.presentation.models.r.d(qVar)) ? qVar : (ru.ozon.android.messenger.framework.presentation.models.q) entry.getValue());
        }
        return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(oldState, k12, b13, linkedHashMap, null, null, null, null, null, null, 2040);
    }
}
