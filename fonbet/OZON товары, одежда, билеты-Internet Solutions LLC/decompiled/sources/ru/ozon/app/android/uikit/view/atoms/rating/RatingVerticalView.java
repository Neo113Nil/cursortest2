package ru.ozon.app.android.uikit.view.atoms.rating;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.RatingVerticalViewBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/rating/RatingVerticalView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/uikit/databinding/RatingVerticalViewBinding;", "setRating", "", "rating", "", "setCount", "count", "", "setRatingSize", "starSize", "starsSeparation", "setStarsBottomPadding", "bottomPadding", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RatingVerticalView extends LinearLayout implements AtomView {

    @NotNull
    private final RatingVerticalViewBinding binding;

    public /* synthetic */ RatingVerticalView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
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

    public final void setRating(float rating) {
        this.binding.ratingBar.setRating(rating);
    }

    public final void setRatingSize(float starSize, float starsSeparation) {
        this.binding.ratingBar.setStarSize(starSize);
        this.binding.ratingBar.setStarsSeparation(starsSeparation);
    }

    public final void setStarsBottomPadding(int bottomPadding) {
        VectorRatingBar ratingBar = this.binding.ratingBar;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "ratingBar");
        ViewExtKt.updatePadding$default(ratingBar, 0, 0, 0, bottomPadding, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingVerticalView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(16);
        this.binding = RatingVerticalViewBinding.bind(View.inflate(context, R$layout.rating_vertical_view, this));
    }
}
