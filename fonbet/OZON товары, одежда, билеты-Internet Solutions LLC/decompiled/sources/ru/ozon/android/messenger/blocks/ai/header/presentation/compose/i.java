package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84159b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f84160c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f84161d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f84162e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f84163f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f84164g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(androidx.compose.ui.e eVar, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, float f7, float f11, int i11) {
        super(2);
        this.f84159b = eVar;
        this.f84160c = c4912a;
        this.f84161d = c4912a2;
        this.f84162e = c4912a3;
        this.f84163f = f7;
        this.f84164g = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(3511);
        C4912a c4912a = this.f84160c;
        C4912a c4912a2 = this.f84161d;
        C4912a c4912a3 = this.f84162e;
        o.b(this.f84159b, c4912a, c4912a2, c4912a3, this.f84163f, this.f84164g, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
