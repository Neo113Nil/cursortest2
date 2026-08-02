package ru.ozon.android.messenger.blocks.chatlistheader.search;

import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84818b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84819c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<K> f84820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    k(Function0<Unit> function0, Function1<? super K, Unit> function1, InterfaceC3978p0<K> interfaceC3978p0) {
        super(0);
        this.f84818b = function0;
        this.f84819c = function1;
        this.f84820d = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84818b.invoke();
        InterfaceC3978p0<K> interfaceC3978p0 = this.f84820d;
        interfaceC3978p0.setValue(K.b(interfaceC3978p0.getValue(), "", 0L, 6));
        this.f84819c.invoke(interfaceC3978p0.getValue());
        return Unit.f71690a;
    }
}
