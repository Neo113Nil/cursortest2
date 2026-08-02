package ru.ozon.android.messenger.framework.domain.service;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class t extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.model.j f88941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(ru.ozon.android.messenger.framework.domain.model.j jVar) {
        super(1);
        this.f88941b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        ru.ozon.android.messenger.framework.domain.model.j jVar;
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = updateBlocks.iterator();
        int i11 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            jVar = this.f88941b;
            if (!hasNext) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it.next()), ru.ozon.android.messenger.framework.presentation.models.r.d(jVar.b()))) {
                break;
            }
            i11++;
        }
        if (i11 != -1) {
            updateBlocks.set(i11, jVar.b());
        }
        return Unit.f71690a;
    }
}
