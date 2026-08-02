package ru.ozon.android.messenger.blocks.travelOrders;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<a, Unit> f86523b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f86524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    h(Function1<? super a, Unit> function1, a aVar) {
        super(0);
        this.f86523b = function1;
        this.f86524c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f86523b.invoke(this.f86524c);
        return Unit.f71690a;
    }
}
