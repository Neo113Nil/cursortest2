package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.comment.presentation.CommentViewModel;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutcomposer/comment/presentation/CommentViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CommentWidgetVH$onAttach$1 extends AbstractC7737t implements Function1<CommentViewModel.Action, Unit> {
    final /* synthetic */ CommentWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentWidgetVH$onAttach$1(CommentWidgetVH commentWidgetVH) {
        super(1);
        this.this$0 = commentWidgetVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CommentViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CommentViewModel.Action action) {
        if (action instanceof CommentViewModel.Action.RedirectAndRefresh) {
            this.this$0.performRedirect(((CommentViewModel.Action.RedirectAndRefresh) action).getDeeplink());
        } else {
            if (!(action instanceof CommentViewModel.Action.Error)) {
                throw new o();
            }
            this.this$0.showError(((CommentViewModel.Action.Error) action).getMessage());
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }
}
