package ru.ozon.android.messenger.blocks.floatbutton.ai;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85198b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f85199c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f85200d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> f85201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(androidx.compose.ui.e eVar, g gVar, Function0 function0, Function2 function2, int i11) {
        super(2);
        this.f85198b = eVar;
        this.f85199c = gVar;
        this.f85200d = function0;
        this.f85201e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        g gVar = this.f85199c;
        q.a(this.f85198b, gVar, this.f85200d, this.f85201e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
