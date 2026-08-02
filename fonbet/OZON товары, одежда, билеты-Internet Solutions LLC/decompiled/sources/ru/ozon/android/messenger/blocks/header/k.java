package ru.ozon.android.messenger.blocks.header;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f85306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f85307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f85308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(boolean z11, C4912a c4912a, int i11) {
        super(2);
        this.f85306b = z11;
        this.f85307c = c4912a;
        this.f85308d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f85308d | 1);
        C4912a c4912a = this.f85307c;
        l.b(this.f85306b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
