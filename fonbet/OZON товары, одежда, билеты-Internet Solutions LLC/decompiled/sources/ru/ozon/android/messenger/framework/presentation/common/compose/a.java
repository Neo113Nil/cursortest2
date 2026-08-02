package ru.ozon.android.messenger.framework.presentation.common.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f90764b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f90765c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(e eVar, C4912a c4912a, int i11) {
        super(2);
        this.f90764b = eVar;
        this.f90765c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        C4912a c4912a = this.f90765c;
        b.a(this.f90764b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
