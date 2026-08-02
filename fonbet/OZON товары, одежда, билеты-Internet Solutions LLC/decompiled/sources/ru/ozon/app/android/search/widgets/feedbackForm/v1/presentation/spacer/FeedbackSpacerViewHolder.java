package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.spacer;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.navigationblocks.presentation.DrawableExtKt;
import ru.ozon.app.android.search.databinding.FeedbackSpacerBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/spacer/FeedbackSpacerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/spacer/FeedbackSpacerVO;", "Lru/ozon/app/android/search/databinding/FeedbackSpacerBinding;", "binding", "<init>", "(Lru/ozon/app/android/search/databinding/FeedbackSpacerBinding;)V", "item", "Landroid/graphics/drawable/GradientDrawable;", "getBackground", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/spacer/FeedbackSpacerVO;)Landroid/graphics/drawable/GradientDrawable;", "", "updatePaddings", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/spacer/FeedbackSpacerVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/spacer/FeedbackSpacerVO;Ll20/d;)V", "Lru/ozon/app/android/search/databinding/FeedbackSpacerBinding;", "", "verticalPadding", "I", "", "defaultCornerRadius", "F", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackSpacerViewHolder extends k<FeedbackSpacerVO> {

    @NotNull
    private final FeedbackSpacerBinding binding;
    private final float defaultCornerRadius;
    private final int verticalPadding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeedbackSpacerViewHolder(@NotNull FeedbackSpacerBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.verticalPadding = ResourceExtKt.toPx(8);
    }

    private final GradientDrawable getBackground(FeedbackSpacerVO item) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(ThemeExtKt.themeColor(getContext(), R$attr.bgSecondary)));
        gradientDrawable.setCornerRadii(DrawableExtKt.createCornerRadii(item.getTopCornerRadius(), item.getTopCornerRadius(), item.getBottomCornerRadius(), item.getBottomCornerRadius()));
        return gradientDrawable;
    }

    private final void updatePaddings(FeedbackSpacerVO item) {
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        if (item.getBottomCornerRadius() == this.defaultCornerRadius) {
            Intrinsics.f(constraintLayout);
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), this.verticalPadding, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        } else if (item.getTopCornerRadius() == this.defaultCornerRadius) {
            Intrinsics.f(constraintLayout);
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), this.verticalPadding);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackSpacerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.view.setBackground(getBackground(item));
        updatePaddings(item);
    }
}
