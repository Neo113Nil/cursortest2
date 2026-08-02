package ru.ozon.android.messenger.framework.presentation.chatlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function0<List<? extends ru.ozon.android.messenger.framework.presentation.models.e>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f90487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(f fVar) {
        super(0);
        this.f90487b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends ru.ozon.android.messenger.framework.presentation.models.e> invoke() {
        f fVar = this.f90487b;
        ArrayList f7 = ru.ozon.android.messenger.utils.b.f(fVar.k(), new g(fVar));
        ArrayList arrayList = new ArrayList();
        Iterator it = f7.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(((ru.ozon.android.messenger.framework.presentation.models.q) next).c() instanceof ru.ozon.android.messenger.framework.presentation.models.s)) {
                arrayList.add(next);
            }
        }
        return ru.ozon.android.messenger.framework.presentation.models.f.a(arrayList);
    }
}
