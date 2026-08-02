package ru.ozon.android.messenger.framework.presentation.search.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91671b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f91672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f91671b = eVar;
        this.f91672c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f91672c | 1);
        j.e(this.f91671b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
