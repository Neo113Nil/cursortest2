package ru.ozon.android.messenger.blocks.travelOrders;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.common.CornerRadius;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f86503b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f86504c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f86505d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CornerRadius f86506e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f86507f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f86508g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(a aVar, float f7, String str, CornerRadius cornerRadius, Function0<Unit> function0, int i11) {
        super(2);
        this.f86503b = aVar;
        this.f86504c = f7;
        this.f86505d = str;
        this.f86506e = cornerRadius;
        this.f86507f = function0;
        this.f86508g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f86508g | 1);
        CornerRadius cornerRadius = this.f86506e;
        Function0<Unit> function0 = this.f86507f;
        n.c(this.f86503b, this.f86504c, this.f86505d, cornerRadius, function0, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
