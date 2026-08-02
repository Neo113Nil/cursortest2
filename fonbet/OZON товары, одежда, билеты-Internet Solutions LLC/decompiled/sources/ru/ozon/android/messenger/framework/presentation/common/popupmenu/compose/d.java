package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f90822b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90823c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f90824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(androidx.compose.ui.e eVar, Function0 function0, int i11) {
        super(2);
        this.f90822b = eVar;
        this.f90823c = function0;
        this.f90824d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f90824d | 1);
        i.a(this.f90822b, this.f90823c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
