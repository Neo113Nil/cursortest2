package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentV3VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsVH;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\n\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R2\u0010\u000b\u001a \u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\n\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentV3ViewHolder;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsVH;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentV3View;", "view", "Lkotlin/Function1;", "", "replyTo", "Lkotlin/Function2;", "", "", "deleteComment", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentV3View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "onViewInVisibleBounds", "()V", "item", "bind", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;)V", "bindContent", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/commentV3/CommentV3View;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "LWZ/l;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentV3VO;", "onAction", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentV3ViewHolder extends CommentsVH<CommentV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function2<String, Map<String, String>, Unit> deleteComment;
    private CommentV3VO item;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final Function1<CommentV3VO, Unit> replyTo;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CommentV3View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommentV3ViewHolder(@NotNull CommentV3View view, @NotNull Function1<? super CommentV3VO, Unit> replyTo, @NotNull Function2<? super String, ? super Map<String, String>, Unit> deleteComment, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(replyTo, "replyTo");
        Intrinsics.checkNotNullParameter(deleteComment, "deleteComment");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.replyTo = replyTo;
        this.deleteComment = deleteComment;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onAction = new CommentV3ViewHolder$onAction$1(this);
    }

    public final void bindContent(@NotNull CommentV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bindContent(item.getItems(), this.onAction);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        CommentV3VO commentV3VO = this.item;
        if (commentV3VO == null || (tokenizedEvent = commentV3VO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, tokenizedEvent);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsVH
    public void bind(@NotNull CommentV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.view.bind(item, this.onAction);
    }
}
