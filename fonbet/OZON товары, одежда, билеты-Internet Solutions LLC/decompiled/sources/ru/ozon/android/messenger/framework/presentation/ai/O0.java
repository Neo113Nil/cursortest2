package ru.ozon.android.messenger.framework.presentation.ai;

import Bl0.C2652m;
import J0.C3326o1;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class O0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f89318b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3326o1 f89319c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo f89320d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f89321e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f89322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(androidx.compose.ui.e eVar, C3326o1 c3326o1, AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, Function2 function2, Function1 function1, int i11) {
        super(2);
        this.f89318b = eVar;
        this.f89319c = c3326o1;
        this.f89320d = menuInfo;
        this.f89321e = function2;
        this.f89322f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(65);
        AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo = this.f89320d;
        P0.a(this.f89318b, this.f89319c, menuInfo, this.f89321e, this.f89322f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
