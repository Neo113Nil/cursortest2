package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/action/ActionHandler$Builder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseReviewWidgetVH$actionHandlerBuilder$2 extends AbstractC7737t implements Function0<ActionHandler.Builder> {
    final /* synthetic */ HandlersInhibitor $handlersInhibitor;
    final /* synthetic */ BaseReviewWidgetVH<T> this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.BaseReviewWidgetVH$actionHandlerBuilder$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<AtomAction.Click, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, BaseReviewWidgetVH.class, "clickAction", "clickAction(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
            invoke2(click);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.Click p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((BaseReviewWidgetVH) this.receiver).clickAction(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseReviewWidgetVH$actionHandlerBuilder$2(BaseReviewWidgetVH<T> baseReviewWidgetVH, HandlersInhibitor handlersInhibitor) {
        super(0);
        this.this$0 = baseReviewWidgetVH;
        this.$handlersInhibitor = handlersInhibitor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ActionHandler.Builder invoke() {
        ComposerReferences composerReferences;
        composerReferences = ((BaseReviewWidgetVH) this.this$0).refs;
        return new ActionHandler.Builder(composerReferences, (k<?>) this.this$0).enableClickThrottling(this.$handlersInhibitor).onClick(new AnonymousClass1(this.this$0));
    }
}
