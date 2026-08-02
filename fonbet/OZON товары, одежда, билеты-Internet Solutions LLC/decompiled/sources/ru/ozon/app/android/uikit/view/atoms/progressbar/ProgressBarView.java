package ru.ozon.app.android.uikit.view.atoms.progressbar;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.databinding.ProgressBarViewBinding;
import ru.ozon.app.android.uikit.view.progress.OzProgressBar;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$font;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/progressbar/ProgressBarView;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/uikit/databinding/ProgressBarViewBinding;", "setProgress", "", "text", "", "percent", "setProgressColor", "progressColor", "", "applyFont", "applyTextColor", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressBarView extends FrameLayout implements AtomView {

    @NotNull
    private final ProgressBarViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyFont(Context context) {
        Typeface e11 = g.e(R$font.onest_semibold, context);
        if (e11 != null) {
            this.binding.progressBarView.setTypeface(e11);
        }
    }

    private final void applyTextColor(Context context) {
        this.binding.progressBarView.setTextColor(ResourceExtKt.color(context, R$color.oz_semantic_bg_secondary));
    }

    public final void setProgress(@NotNull CharSequence text, int percent) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.binding.progressBarView.setText(text);
        this.binding.progressBarView.setProgress(percent);
    }

    public final void setProgressColor(String progressColor) {
        OzProgressBar ozProgressBar = this.binding.progressBarView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ozProgressBar.setFillColor(styleParser.parseColor(context, progressColor, StyleParser.OzColor.OZ_COLOR_GREEN_UI));
    }

    public /* synthetic */ ProgressBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ProgressBarViewBinding bind = ProgressBarViewBinding.bind(View.inflate(context, R$layout.progress_bar_view, this));
        this.binding = bind;
        bind.progressBarView.setBarColor(a.getColor(context, R$color.oz_gray_70));
        bind.progressBarView.setTextSize(ResourceExtKt.toPxF(12));
        bind.progressBarView.setCornerRadius(ResourceExtKt.toPx(8));
        applyFont(context);
        applyTextColor(context);
    }
}
