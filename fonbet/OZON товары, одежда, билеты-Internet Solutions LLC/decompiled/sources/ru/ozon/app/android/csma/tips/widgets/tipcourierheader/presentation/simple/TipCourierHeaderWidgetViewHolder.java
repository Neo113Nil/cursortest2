package ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.simple;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.databinding.WidgetTipCourierHeaderLayoutBinding;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.TipCourierHeaderVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/simple/TipCourierHeaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierHeaderLayoutBinding;", "binding", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierHeaderLayoutBinding;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipCourierHeaderWidgetViewHolder extends k<TipCourierHeaderVO> {

    @NotNull
    private final WidgetTipCourierHeaderLayoutBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipCourierHeaderWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetTipCourierHeaderLayoutBinding bind = WidgetTipCourierHeaderLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TipCourierHeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetTipCourierHeaderLayoutBinding widgetTipCourierHeaderLayoutBinding = this.binding;
        ImageView iconIv = widgetTipCourierHeaderLayoutBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ThemeExtKt.semanticTint$default(iconIv, 0, 1, null);
        ImageView iconIv2 = widgetTipCourierHeaderLayoutBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv2, item.getIcon());
        widgetTipCourierHeaderLayoutBinding.titleTv.setText(item.getTitle());
        TextView subtextTv = widgetTipCourierHeaderLayoutBinding.subtextTv;
        Intrinsics.checkNotNullExpressionValue(subtextTv, "subtextTv");
        TextViewExtKt.setTextOrGone(subtextTv, item.getText());
    }
}
