package ru.ozon.android.messenger.framework.data.remote.websocket;

import We.InterfaceC4865g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class N extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC4865g f87939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    N(InterfaceC4865g interfaceC4865g) {
        super(1);
        this.f87939b = interfaceC4865g;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f87939b.cancel();
        return Unit.f71690a;
    }
}
