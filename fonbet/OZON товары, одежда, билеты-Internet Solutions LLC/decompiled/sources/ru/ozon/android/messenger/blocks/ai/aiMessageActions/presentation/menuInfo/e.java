package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.menuInfo;

import a1.C4912a;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.AiMessageActionsDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import v0.G;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<G, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AiMessageActionsDTO.SourcesBadge.MenuInfo f84050b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<Map<String, MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> f84051c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo, Function2<? super Map<String, MessengerTrackingInfo>, ? super ru.ozon.android.messenger.framework.navigation.action.a, Unit> function2, Function1<? super Map<String, MessengerTrackingInfo>, Unit> function1) {
        super(1);
        this.f84050b = menuInfo;
        this.f84051c = function2;
        this.f84052d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(G g10) {
        G LazyColumn = g10;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        AiMessageActionsDTO.SourcesBadge.MenuInfo menuInfo = this.f84050b;
        List<AiMessageActionsDTO.SourcesBadge.MenuInfo.MenuItem> menuItems = menuInfo.getMenuItems();
        LazyColumn.a(menuItems.size(), null, new c(b.f84043b, menuItems), new C4912a(true, -632812321, new d(menuItems, menuInfo, this.f84051c, this.f84052d)));
        return Unit.f71690a;
    }
}
