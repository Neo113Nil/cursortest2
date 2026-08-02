package ru.ozon.android.messenger.framework.presentation.search.composable;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.search.J;
import ru.ozon.android.messenger.framework.presentation.search.L;

/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f91690b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<J> f91691c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91692d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L f91693e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.blocks.chat.search.i, Unit> f91694f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f91695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(androidx.compose.ui.e eVar, List list, ru.ozon.android.messenger.framework.core.d dVar, L l11, Function1 function1, Function1 function12, int i11) {
        super(2);
        this.f91690b = eVar;
        this.f91691c = list;
        this.f91692d = dVar;
        this.f91693e = l11;
        this.f91694f = function1;
        this.f91695g = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(7);
        ru.ozon.android.messenger.framework.core.d dVar = this.f91692d;
        L l11 = this.f91693e;
        r.a(this.f91690b, this.f91691c, dVar, l11, this.f91694f, this.f91695g, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
