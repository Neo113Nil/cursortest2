package ru.ozon.android.messenger.blocks.floatbutton.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class p extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85202b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ A0.g f85203c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f85204d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f85205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(androidx.compose.ui.e eVar, A0.g gVar, long j11, int i11) {
        super(2);
        this.f85202b = eVar;
        this.f85203c = gVar;
        this.f85204d = j11;
        this.f85205e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85205e | 1);
        long j11 = this.f85204d;
        q.b(this.f85202b, this.f85203c, j11, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
