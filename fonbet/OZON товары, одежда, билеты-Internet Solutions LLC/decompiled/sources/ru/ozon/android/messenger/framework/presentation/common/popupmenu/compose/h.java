package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f90839b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f90840c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f90841d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f90842e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90843f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f90844g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(n nVar, float f7, float f11, long j11, Function0<Unit> function0, int i11) {
        super(2);
        this.f90839b = nVar;
        this.f90840c = f7;
        this.f90841d = f11;
        this.f90842e = j11;
        this.f90843f = function0;
        this.f90844g = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f90844g | 1);
        long j11 = this.f90842e;
        Function0<Unit> function0 = this.f90843f;
        i.d(this.f90839b, this.f90840c, this.f90841d, j11, function0, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
