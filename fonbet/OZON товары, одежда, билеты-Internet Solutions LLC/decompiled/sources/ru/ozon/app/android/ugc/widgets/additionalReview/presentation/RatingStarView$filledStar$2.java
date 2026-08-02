package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RatingStarView$filledStar$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RatingStarView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RatingStarView$filledStar$2(RatingStarView ratingStarView, Context context) {
        super(0);
        this.this$0 = ratingStarView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        int i11;
        i11 = this.this$0.iconStarRes;
        Context context = this.$context;
        Drawable a11 = C7232a.a(context, i11);
        if (a11 == null) {
            return null;
        }
        Drawable mutate = a11.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        androidx.core.graphics.drawable.a.i(mutate, ThemeExtKt.themeColor(context, R$attr.graphicRating));
        return a11;
    }
}
