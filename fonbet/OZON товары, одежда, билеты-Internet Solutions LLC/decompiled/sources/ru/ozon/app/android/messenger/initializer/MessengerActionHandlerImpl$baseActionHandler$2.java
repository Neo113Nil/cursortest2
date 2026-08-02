package ru.ozon.app.android.messenger.initializer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalytics;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MessengerActionHandlerImpl$baseActionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ MessengerActionHandlerImpl this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl$baseActionHandler$2$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
        final /* synthetic */ MessengerActionHandlerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MessengerActionHandlerImpl messengerActionHandlerImpl) {
            super(1);
            this.this$0 = messengerActionHandlerImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.sendAnalytics(it);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerActionHandlerImpl$baseActionHandler$2(MessengerActionHandlerImpl messengerActionHandlerImpl) {
        super(0);
        this.this$0 = messengerActionHandlerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ComposerNavigator composerNavigator;
        ActionUsageAnalytics actionUsageAnalytics;
        BaseActionHandler.Builder.Companion companion = BaseActionHandler.Builder.INSTANCE;
        composerNavigator = this.this$0.navigator;
        actionUsageAnalytics = this.this$0.actionUsageAnalytics;
        return companion.invoke(composerNavigator, new ActionUsageAnalyticsTracking.Directly(actionUsageAnalytics)).customAnalyticHandler(new AnonymousClass1(this.this$0)).buildHandler();
    }
}
