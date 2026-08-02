package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.A1;
import k1.C7456b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.InterfaceC8412e;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ A1<AbstractC7799Q> f91665b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f91666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(A1<? extends AbstractC7799Q> a12, float f7) {
        super(1);
        this.f91665b = a12;
        this.f91666c = f7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e drawBehind = interfaceC8412e;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        AbstractC7799Q value = this.f91665b.getValue();
        float v12 = drawBehind.v1(this.f91666c);
        InterfaceC8412e.I0(drawBehind, value, 0L, 0L, C7456b.a(v12, v12), 0.0f, null, 246);
        return Unit.f71690a;
    }
}
