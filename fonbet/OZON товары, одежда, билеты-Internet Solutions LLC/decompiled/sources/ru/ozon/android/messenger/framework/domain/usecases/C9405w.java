package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9405w extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f89145b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9402t f89146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9405w(ru.ozon.android.messenger.framework.presentation.models.q qVar, C9402t c9402t) {
        super(1);
        this.f89145b = qVar;
        this.f89146c = c9402t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        ru.ozon.android.messenger.framework.presentation.models.q qVar;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o oVar;
        K k11;
        ru.ozon.android.messenger.framework.presentation.chatdetail.a aVar;
        C9385b c9385b;
        ru.ozon.android.messenger.framework.presentation.models.s f7;
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = updateBlocks.iterator();
        int i11 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            qVar = this.f89145b;
            if (!hasNext) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it.next()), ru.ozon.android.messenger.framework.presentation.models.r.d(qVar))) {
                break;
            }
            i11++;
        }
        Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            ru.ozon.android.messenger.framework.presentation.models.q old = updateBlocks.get(intValue);
            updateBlocks.set(intValue, qVar);
            C9402t c9402t = this.f89146c;
            oVar = c9402t.f89128c;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(qVar, "new");
            ru.ozon.android.messenger.framework.presentation.models.s f11 = ru.ozon.android.messenger.framework.presentation.models.r.f(qVar);
            if (f11 != null && f11.q() && (f7 = ru.ozon.android.messenger.framework.presentation.models.r.f(old)) != null && !f7.q()) {
                oVar.i(null, ru.ozon.android.messenger.framework.presentation.models.r.d(qVar));
            }
            k11 = c9402t.f89129d;
            int i12 = intValue - 1;
            int i13 = intValue + 1;
            k11.getClass();
            K.a(i12, i13, updateBlocks);
            aVar = c9402t.f89131f;
            if (aVar.c()) {
                c9385b = c9402t.f89130e;
                c9385b.b(i12, i13, updateBlocks);
            }
        }
        return Unit.f71690a;
    }
}
