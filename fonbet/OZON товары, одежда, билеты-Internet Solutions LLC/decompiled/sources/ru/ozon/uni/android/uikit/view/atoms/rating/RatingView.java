package ru.ozon.uni.android.uikit.view.atoms.rating;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$layout;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.databinding.RatingViewUniBinding;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/uni/android/uikit/view/atoms/rating/RatingView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "rating", "", "setRating", "(F)V", "start", "top", "end", "bottom", "setMargin", "(IIII)V", "", "count", "setCount", "(Ljava/lang/String;)V", "starSize", "starsSeparation", "setRatingSize", "(FF)V", "Lru/ozon/uni/databinding/RatingViewUniBinding;", "binding", "Lru/ozon/uni/databinding/RatingViewUniBinding;", "getBinding", "()Lru/ozon/uni/databinding/RatingViewUniBinding;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RatingView extends LinearLayout implements AtomView {

    @NotNull
    private final RatingViewUniBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setMargin$default(RatingView ratingView, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 1;
        }
        if ((i15 & 2) != 0) {
            i12 = 0;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        ratingView.setMargin(i11, i12, i13, i14);
    }

    public final void setCount(String count) {
        if (count == null || count.length() == 0) {
            TextView ratingCountTv = this.binding.ratingCountTv;
            Intrinsics.checkNotNullExpressionValue(ratingCountTv, "ratingCountTv");
            ViewExtKt.gone(ratingCountTv);
        } else {
            TextView ratingCountTv2 = this.binding.ratingCountTv;
            Intrinsics.checkNotNullExpressionValue(ratingCountTv2, "ratingCountTv");
            ViewExtKt.show(ratingCountTv2);
            this.binding.ratingCountTv.setText(count);
        }
    }

    public final void setMargin(int start, int top, int end, int bottom) {
        VectorRatingBar ratingBar = this.binding.ratingBar;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "ratingBar");
        ViewGroup.LayoutParams layoutParams = ratingBar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(ResourceExtKt.toDp(start));
        marginLayoutParams.topMargin = ResourceExtKt.toDp(top);
        marginLayoutParams.setMarginEnd(ResourceExtKt.toDp(end));
        marginLayoutParams.bottomMargin = ResourceExtKt.toDp(bottom);
        ratingBar.setLayoutParams(marginLayoutParams);
    }

    public final void setRating(float rating) {
        this.binding.ratingBar.setRating(rating);
    }

    public final void setRatingSize(float starSize, float starsSeparation) {
        this.binding.ratingBar.setStarSize(starSize);
        this.binding.ratingBar.setStarsSeparation(starsSeparation);
    }

    public /* synthetic */ RatingView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(16);
        this.binding = RatingViewUniBinding.bind(View.inflate(context, R$layout.rating_view_uni, this));
    }
}
