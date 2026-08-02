package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function1<Z1.m, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.m> f90860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(InterfaceC3978p0<Z1.m> interfaceC3978p0) {
        super(1);
        this.f90860b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Z1.m mVar) {
        this.f90860b.setValue(Z1.m.a(mVar.g()));
        return Unit.f71690a;
    }
}
