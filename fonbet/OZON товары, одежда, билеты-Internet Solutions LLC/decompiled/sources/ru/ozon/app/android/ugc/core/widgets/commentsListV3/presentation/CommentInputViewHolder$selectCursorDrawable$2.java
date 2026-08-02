package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.databinding.ItemReviewCommentInputBinding;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentInputViewHolder$selectCursorDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ CommentInputViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentInputViewHolder$selectCursorDrawable$2(CommentInputViewHolder commentInputViewHolder) {
        super(0);
        this.this$0 = commentInputViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        CommentInputViewHolder.Companion companion;
        CommentInputViewHolder.Companion companion2;
        ItemReviewCommentInputBinding itemReviewCommentInputBinding;
        CommentInputViewHolder.Companion companion3;
        GradientDrawable gradientDrawable = new GradientDrawable();
        CommentInputViewHolder commentInputViewHolder = this.this$0;
        companion = CommentInputViewHolder.Companion;
        int cursorWidth = companion.getCursorWidth();
        companion2 = CommentInputViewHolder.Companion;
        gradientDrawable.setSize(cursorWidth, companion2.getCursorHeight());
        itemReviewCommentInputBinding = commentInputViewHolder.binding;
        Context context = itemReviewCommentInputBinding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion3 = CommentInputViewHolder.Companion;
        gradientDrawable.setColor(ResourceExtKt.color(context, companion3.getSELECT_CURSOR_COLOR()));
        return gradientDrawable;
    }
}
