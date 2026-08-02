package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91097b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f91098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(androidx.compose.ui.e eVar, long j11, int i11) {
        super(2);
        this.f91097b = eVar;
        this.f91098c = j11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        p.a(this.f91097b, this.f91098c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
