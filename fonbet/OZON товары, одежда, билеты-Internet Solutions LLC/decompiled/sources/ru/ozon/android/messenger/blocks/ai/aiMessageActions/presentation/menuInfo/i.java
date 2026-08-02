package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem f84062b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f84063c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84064d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84065e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f84066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    i(AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem menuItem, boolean z11, Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2, Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1, int i11) {
        super(2);
        this.f84062b = menuItem;
        this.f84063c = z11;
        this.f84064d = function2;
        this.f84065e = function1;
        this.f84066f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f84066f | 1);
        Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2 = this.f84064d;
        Function1<Map<String, MessengerTrackingInfo>, Unit> function1 = this.f84065e;
        a.d(this.f84062b, this.f84063c, function2, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
