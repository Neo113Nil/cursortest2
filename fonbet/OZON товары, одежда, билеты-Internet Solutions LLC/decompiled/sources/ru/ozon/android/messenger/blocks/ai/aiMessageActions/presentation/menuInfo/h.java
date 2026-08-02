package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84060b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem f84061c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    h(Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2, AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem menuItem) {
        super(0);
        this.f84060b = function2;
        this.f84061c = menuItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem menuItem = this.f84061c;
        this.f84060b.invoke(menuItem.getTrackingInfo(), ru.ozon.android.messenger.framework.navigation.action.b.c(menuItem.getAction()));
        return Unit.f71690a;
    }
}
