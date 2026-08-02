package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.comments;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentViewHolder$indicatorView$2 extends AbstractC7737t implements Function0<IndicatorView> {
    final /* synthetic */ CommentViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentViewHolder$indicatorView$2(CommentViewHolder commentViewHolder) {
        super(0);
        this.this$0 = commentViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IndicatorView invoke() {
        Context context;
        context = this.this$0.getContext();
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        indicatorView.setId(R$id.commentIndicator);
        return indicatorView;
    }
}
