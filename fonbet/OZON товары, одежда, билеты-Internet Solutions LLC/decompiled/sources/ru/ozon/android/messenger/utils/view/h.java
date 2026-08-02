package ru.ozon.android.messenger.utils.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f92006b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    h(Function1 function1) {
        super(1);
        this.f92006b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (intValue < 1) {
            intValue = 1;
        }
        this.f92006b.invoke(Integer.valueOf(intValue));
        return Unit.f71690a;
    }
}
