package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84058b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem f84059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1, AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem menuItem) {
        super(0);
        this.f84058b = function1;
        this.f84059c = menuItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84058b.invoke(this.f84059c.getTrackingInfo());
        return Unit.f71690a;
    }
}
