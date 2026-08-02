package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class H extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ F f88982b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.I f88983c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f88984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(F f7, kotlin.jvm.internal.I i11, String str) {
        super(1);
        this.f88982b = f7;
        this.f88983c = i11;
        this.f88984d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.delegates.o oVar;
        K k11;
        C9385b c9385b;
        List<ru.ozon.android.messenger.framework.presentation.models.q> updateBlocks = list;
        Intrinsics.checkNotNullParameter(updateBlocks, "$this$updateBlocks");
        Iterator<ru.ozon.android.messenger.framework.presentation.models.q> it = updateBlocks.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(it.next()), this.f88984d)) {
                break;
            }
            i11++;
        }
        Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            F f7 = this.f88982b;
            oVar = f7.f88965e;
            oVar.k(updateBlocks.get(intValue));
            updateBlocks.remove(intValue);
            k11 = f7.f88964d;
            int i12 = intValue - 1;
            k11.getClass();
            K.a(i12, intValue, updateBlocks);
            c9385b = f7.f88966f;
            c9385b.b(i12, intValue, updateBlocks);
            this.f88983c.f71783a = true;
        }
        return Unit.f71690a;
    }
}
