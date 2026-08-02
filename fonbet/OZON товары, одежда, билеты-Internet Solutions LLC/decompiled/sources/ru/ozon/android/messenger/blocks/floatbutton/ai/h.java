package ru.ozon.android.messenger.blocks.floatbutton.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85180b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f85181c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A0.g f85182d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f85183e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f85184f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(androidx.compose.ui.e eVar, boolean z11, A0.g gVar, C4912a c4912a, int i11) {
        super(2);
        this.f85180b = eVar;
        this.f85181c = z11;
        this.f85182d = gVar;
        this.f85183e = c4912a;
        this.f85184f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85184f | 1);
        C4912a c4912a = this.f85183e;
        q.c(this.f85180b, this.f85181c, this.f85182d, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
