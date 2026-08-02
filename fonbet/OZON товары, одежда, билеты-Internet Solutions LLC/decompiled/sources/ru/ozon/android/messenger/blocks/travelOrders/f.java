package ru.ozon.android.messenger.blocks.travelOrders;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f86511b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f86512c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e.a f86513d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(p pVar, ru.ozon.android.messenger.framework.navigation.controller.a aVar, e.a aVar2, int i11) {
        super(2);
        this.f86511b = pVar;
        this.f86512c = aVar;
        this.f86513d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        e.a aVar = this.f86513d;
        n.a(this.f86511b, this.f86512c, aVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
