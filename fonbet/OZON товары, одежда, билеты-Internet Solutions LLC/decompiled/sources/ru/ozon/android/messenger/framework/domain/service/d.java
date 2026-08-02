package ru.ozon.android.messenger.framework.domain.service;

import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.z;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f88864b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(String str) {
        super(1);
        this.f88864b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        int i11;
        ru.ozon.android.messenger.framework.presentation.models.q qVar;
        ru.ozon.android.messenger.framework.presentation.models.s f7;
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        ListIterator<ru.ozon.android.messenger.framework.presentation.models.q> listIterator = updateBlocks.listIterator(updateBlocks.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i11 = -1;
                break;
            }
            ru.ozon.android.messenger.framework.presentation.models.s f11 = ru.ozon.android.messenger.framework.presentation.models.r.f(listIterator.previous());
            if (Intrinsics.d(f11 != null ? f11.getId() : null, this.f88864b)) {
                i11 = listIterator.nextIndex();
                break;
            }
        }
        if (i11 >= 0 && (f7 = ru.ozon.android.messenger.framework.presentation.models.r.f((qVar = updateBlocks.get(i11)))) != null) {
            updateBlocks.set(i11, ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, ru.ozon.android.messenger.framework.presentation.models.s.d(f7, null, null, null, 0.0d, false, false, 0, z.b.f91564a, 253439), 1));
        }
        return Unit.f71690a;
    }
}
