package ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "currentBackgroundColor", "", "baseBackgroundColor", "baseScrollColor", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;", "initialColor", "onClick", "Lkotlin/Function0;", "onScrollChanged", "isScrolledPastStatusBar", "", "applyBackgroundColor", "colorToken", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconWidgetView extends FrameLayout {
    private String baseBackgroundColor;
    private String baseScrollColor;
    private String currentBackgroundColor;

    @NotNull
    private final IconView iconView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconWidgetView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(iconView);
        this.iconView = iconView;
        setBackgroundColor(androidx.core.content.a.getColor(context, R.color.transparent));
    }

    private final void applyBackgroundColor(String colorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, colorToken, R.color.transparent));
    }

    public static /* synthetic */ void bind$default(IconWidgetView iconWidgetView, IconWidgetVO iconWidgetVO, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        iconWidgetView.bind(iconWidgetVO, str, function0);
    }

    public final void bind(@NotNull IconWidgetVO item, String initialColor, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.baseBackgroundColor = item.getBackgroundColor();
        this.baseScrollColor = item.getScrollColor();
        if (initialColor == null) {
            initialColor = item.getBackgroundColor();
        }
        if (!Intrinsics.d(initialColor, this.currentBackgroundColor)) {
            this.currentBackgroundColor = initialColor;
            applyBackgroundColor(initialColor);
        }
        int px = item.getTopPadding().getPx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px2 = ResourceExtKt.toPx(px, context);
        int px3 = item.getRightPadding().getPx();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px4 = ResourceExtKt.toPx(px3, context2);
        int px5 = item.getBottomPadding().getPx();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px6 = ResourceExtKt.toPx(px5, context3);
        int px7 = item.getLeftPadding().getPx();
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ViewExtKt.updatePadding(this, ResourceExtKt.toPx(px7, context4), px2, px4, px6);
        IconHolderKt.bind$default(this.iconView, item.getIcon(), null, 2, null);
        IconView iconView = this.iconView;
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = item.getAlignment();
        iconView.setLayoutParams(layoutParams2);
        ViewExtKt.setOnClickListenerThrottle$default(this.iconView, 0L, new IconWidgetView$bind$1$2(onClick), 1, null);
    }

    public final void onScrollChanged(boolean isScrolledPastStatusBar) {
        applyBackgroundColor(isScrolledPastStatusBar ? this.baseScrollColor : this.baseBackgroundColor);
    }
}
