package ru.ozon.android.messenger.framework.domain.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.v0;

/* loaded from: classes10.dex */
final class p extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f88930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(g gVar) {
        super(1);
        this.f88930b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        ArrayList e11 = this.f88930b.f88873b.e();
        ArrayList arrayList = new ArrayList(C7714v.z(e11, 10));
        Iterator it = e11.iterator();
        while (it.hasNext()) {
            arrayList.add(((v0) it.next()).c());
        }
        updateBlocks.removeAll(arrayList);
        return Unit.f71690a;
    }
}
