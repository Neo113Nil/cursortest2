package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.header.presentation.a;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84169b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<a.C1458a> f84170c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, AtomActionDTO, Unit> f84171d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f84172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(androidx.compose.ui.e eVar, List list, Function2 function2, int i11) {
        super(2);
        this.f84169b = eVar;
        this.f84170c = list;
        this.f84171d = function2;
        this.f84172e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84172e | 1);
        Function2<AtomAction, AtomActionDTO, Unit> function2 = this.f84171d;
        o.c(this.f84169b, this.f84170c, function2, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
