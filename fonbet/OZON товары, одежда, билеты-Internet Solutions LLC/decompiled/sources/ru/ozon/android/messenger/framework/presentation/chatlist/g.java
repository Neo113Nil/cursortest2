package ru.ozon.android.messenger.framework.presentation.chatlist;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<List<ru.ozon.android.messenger.framework.presentation.models.q>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f90486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar) {
        super(1);
        this.f90486b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<ru.ozon.android.messenger.framework.presentation.models.q> list) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> transform = list;
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        for (Map.Entry<Integer, ru.ozon.android.messenger.framework.presentation.models.q> entry : this.f90486b.b().entrySet()) {
            int intValue = entry.getKey().intValue();
            ru.ozon.android.messenger.framework.presentation.models.q value = entry.getValue();
            if (intValue >= 0 && intValue <= transform.size()) {
                if (intValue == transform.size()) {
                    transform.add(value);
                } else if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d(transform.get(intValue)), ru.ozon.android.messenger.framework.presentation.models.r.d(value))) {
                    transform.set(intValue, value);
                } else {
                    transform.add(intValue, value);
                }
            }
        }
        return Unit.f71690a;
    }
}
