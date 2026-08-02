package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.header.presentation.a f84142b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a f84143c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, AtomActionDTO, Unit> f84144d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<AtomActionDTO, Unit> f84145e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar, e.a aVar2, Function2 function2, Function1 function1, Function1 function12, int i11) {
        super(2);
        this.f84142b = aVar;
        this.f84143c = aVar2;
        this.f84144d = function2;
        this.f84145e = function1;
        this.f84146f = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        o.a(this.f84142b, this.f84143c, this.f84144d, this.f84145e, this.f84146f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
