package ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.overlay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.databinding.WidgetTipCourierHeaderFullScreenLayoutBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.TipCourierHeaderVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/overlay/TipCourierHeaderOverlayWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderVO;", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierHeaderFullScreenLayoutBinding;", "binding", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "swipeRefreshLayout", "<init>", "(Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierHeaderFullScreenLayoutBinding;Landroid/view/ViewGroup;Landroid/view/View;)V", "", "addView", "()V", "removeView", "item", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderVO;)V", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierHeaderFullScreenLayoutBinding;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "metricView", "getMetricView", "()Landroid/view/View;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierHeaderOverlayWidgetViewHolder extends AbstractC6065b<TipCourierHeaderVO> {

    @NotNull
    private final WidgetTipCourierHeaderFullScreenLayoutBinding binding;

    @NotNull
    private final View metricView;
    private final ViewGroup parent;
    private final View swipeRefreshLayout;

    public TipCourierHeaderOverlayWidgetViewHolder(@NotNull WidgetTipCourierHeaderFullScreenLayoutBinding binding, ViewGroup viewGroup, View view) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.parent = viewGroup;
        this.swipeRefreshLayout = view;
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.metricView = constraintLayout;
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        View view = this.swipeRefreshLayout;
        if (view != null) {
            ViewExtKt.gone(view);
        }
        ViewGroup viewGroup = this.parent;
        if (viewGroup != null) {
            viewGroup.addView(this.binding.getConstraintLayout());
        }
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        View view = this.swipeRefreshLayout;
        if (view != null) {
            ViewExtKt.show(view);
        }
        ViewGroup viewGroup = this.parent;
        if (viewGroup != null) {
            viewGroup.removeView(this.binding.getConstraintLayout());
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TipCourierHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTipCourierHeaderFullScreenLayoutBinding widgetTipCourierHeaderFullScreenLayoutBinding = this.binding;
        ImageView iconIv = widgetTipCourierHeaderFullScreenLayoutBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ThemeExtKt.semanticTint$default(iconIv, 0, 1, null);
        ImageView iconIv2 = widgetTipCourierHeaderFullScreenLayoutBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv2, item.getIcon());
        widgetTipCourierHeaderFullScreenLayoutBinding.titleTv.setText(item.getTitle());
        TextView subtextTv = widgetTipCourierHeaderFullScreenLayoutBinding.subtextTv;
        Intrinsics.checkNotNullExpressionValue(subtextTv, "subtextTv");
        TextViewExtKt.setTextOrGone(subtextTv, item.getText());
    }
}
