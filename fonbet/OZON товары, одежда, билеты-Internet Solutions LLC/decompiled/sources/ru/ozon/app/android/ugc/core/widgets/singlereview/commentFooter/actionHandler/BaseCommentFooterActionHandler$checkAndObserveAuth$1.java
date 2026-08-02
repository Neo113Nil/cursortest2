package ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.actionHandler.CommentFooterViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/commentFooter/actionHandler/CommentFooterViewModel$CommentEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseCommentFooterActionHandler$checkAndObserveAuth$1 extends AbstractC7737t implements Function1<CommentFooterViewModel.CommentEvent, Unit> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ BaseCommentFooterActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCommentFooterActionHandler$checkAndObserveAuth$1(BaseCommentFooterActionHandler baseCommentFooterActionHandler, CustomActionHandler.HandlerReferences handlerReferences) {
        super(1);
        this.this$0 = baseCommentFooterActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommentFooterViewModel.CommentEvent commentEvent) {
        invoke2(commentEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CommentFooterViewModel.CommentEvent commentEvent) {
        if (commentEvent instanceof CommentFooterViewModel.CommentEvent.CompleteAction) {
            this.this$0.completeAction(((CommentFooterViewModel.CommentEvent.CompleteAction) commentEvent).getAction(), this.$handlerRefs);
        } else {
            if (!Intrinsics.d(commentEvent, CommentFooterViewModel.CommentEvent.CallAuth.INSTANCE)) {
                throw new o();
            }
            ComposerNavigator navigator = this.$handlerRefs.getRefs().getNavigator();
            String uri = LinkGenerator.INSTANCE.auth().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
        }
    }
}
