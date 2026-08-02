package ru.ozon.android.messenger.framework.presentation.search.composable;

import Bl0.C2652m;
import S0.A1;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91667b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f91668c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ A1<AbstractC7799Q> f91669d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f91670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(androidx.compose.ui.e eVar, float f7, A1 a12, int i11) {
        super(2);
        this.f91667b = eVar;
        this.f91668c = f7;
        this.f91669d = a12;
        this.f91670e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f91670e | 1);
        A1<AbstractC7799Q> a12 = this.f91669d;
        j.d(this.f91667b, this.f91668c, a12, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
