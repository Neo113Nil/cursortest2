package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.databinding.ItemReviewCommentInputBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentInputViewHolder$defaultArrowColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ CommentInputViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentInputViewHolder$defaultArrowColor$2(CommentInputViewHolder commentInputViewHolder) {
        super(0);
        this.this$0 = commentInputViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        ItemReviewCommentInputBinding itemReviewCommentInputBinding;
        StyleParser styleParser = StyleParser.INSTANCE;
        itemReviewCommentInputBinding = this.this$0.binding;
        Context context = itemReviewCommentInputBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return styleParser.parseColor(context, UniColors.GRAPHIC_QUATERNARY.getToken());
    }
}
