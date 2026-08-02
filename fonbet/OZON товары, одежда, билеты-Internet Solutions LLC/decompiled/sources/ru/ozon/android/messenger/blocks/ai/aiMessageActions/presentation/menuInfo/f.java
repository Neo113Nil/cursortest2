package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84053b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo f84054c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84055d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84056e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(androidx.compose.ui.e eVar, AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, Function2 function2, Function1 function1, Function0 function0, int i11) {
        super(2);
        this.f84053b = eVar;
        this.f84054c = menuInfo;
        this.f84055d = function2;
        this.f84056e = function1;
        this.f84057f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo = this.f84054c;
        Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2 = this.f84055d;
        a.b(this.f84053b, menuInfo, function2, this.f84056e, this.f84057f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
