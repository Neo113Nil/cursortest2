package ru.ozon.app.android.widgets.commonTextWidget.separator.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.commonTextWidget.separator.presentation.SeparatorView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorVO;", "Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView;", "containerView", "<init>", "(Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorVO;Ll20/d;)V", "Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView;", "getContainerView", "()Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorView;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorViewHolder extends k<SeparatorVO> {

    @NotNull
    private final SeparatorView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorViewHolder(@NotNull SeparatorView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SeparatorView separatorView = this.containerView;
        int height = item.getHeight();
        Context context = separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        separatorView.setFixedHeight(ResourceExtKt.toPx(height, context));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, item.getColor());
        separatorView.setColor(parseColor != null ? parseColor.intValue() : 0);
        int topCornerRadius = item.getTopCornerRadius();
        Context context3 = separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(topCornerRadius, context3);
        int bottomCornerRadius = item.getBottomCornerRadius();
        Context context4 = separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        separatorView.m1587setCornerRadiisRYz_WY(SeparatorView.CornerRadii.m1588constructorimpl(pxF, ResourceExtKt.toPxF(bottomCornerRadius, context4)));
        int leftPadding = item.getLeftPadding();
        Context context5 = separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        separatorView.setContentPaddingLeft(ResourceExtKt.toPx(leftPadding, context5));
        int rightPadding = item.getRightPadding();
        Context context6 = separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        separatorView.setContentPaddingRight(ResourceExtKt.toPx(rightPadding, context6));
    }
}
