package ru.ozon.android.messenger.blocks.travelOrders;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f86535b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<a, Unit> f86536c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f86537d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f86538e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f86539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p pVar, Function1 function1, Function1 function12, androidx.compose.ui.e eVar, int i11) {
        super(2);
        this.f86535b = pVar;
        this.f86536c = function1;
        this.f86537d = function12;
        this.f86538e = eVar;
        this.f86539f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f86539f | 1);
        androidx.compose.ui.e eVar = this.f86538e;
        n.b(this.f86535b, this.f86536c, this.f86537d, eVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
