package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.actionHandlers.SaveUserTipsChooseActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CourierTipsViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ d $customActionHandlersStoreFactory;
    final /* synthetic */ OneTimePostRefreshHandler $oneTimePostRefreshHandler;
    final /* synthetic */ CourierTipsViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewHolder$actionHandler$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<AtomAction, Boolean> {
        AnonymousClass1(Object obj) {
            super(1, obj, OneTimePostRefreshHandler.class, "handle", "handle(Lru/ozon/uni/atoms/af/AtomAction;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AtomAction p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(((OneTimePostRefreshHandler) this.receiver).handle(p02));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation.CourierTipsViewHolder$actionHandler$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<c> {
        final /* synthetic */ d $customActionHandlersStoreFactory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(d dVar) {
            super(0);
            this.$customActionHandlersStoreFactory = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return this.$customActionHandlersStoreFactory.create(SaveUserTipsChooseActionHandler.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewHolder$actionHandler$2(CourierTipsViewHolder courierTipsViewHolder, OneTimePostRefreshHandler oneTimePostRefreshHandler, d dVar) {
        super(0);
        this.this$0 = courierTipsViewHolder;
        this.$oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        this.$customActionHandlersStoreFactory = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.refs;
        return new ActionHandler.Builder(composerReferences, this.this$0).onPreProcess(new AnonymousClass1(this.$oneTimePostRefreshHandler)).customActionHandlers(new AnonymousClass2(this.$customActionHandlersStoreFactory)).buildHandler();
    }
}
