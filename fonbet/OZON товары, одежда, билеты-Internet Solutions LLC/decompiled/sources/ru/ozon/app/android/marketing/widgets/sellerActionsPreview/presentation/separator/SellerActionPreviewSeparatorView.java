package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.separator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/separator/SellerActionPreviewSeparatorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "separator", "Landroid/view/View;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Separator;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionPreviewSeparatorView extends FrameLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final View separator;
    public static final int $stable = 8;
    private static final int dp1 = UiExtKt.toPx(1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionPreviewSeparatorView(@NotNull Context context) {
        super(context);
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        View view = new View(context);
        view.setId(R$id.sellerActionPreview_Separator_View);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, dp1));
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (appTypeResolver.isSelect(context2)) {
            Context context3 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            color = ResourceExtKt.color(context3, UniColors.CLEAR_LIGHT_KEY_400.getResId());
        } else {
            Context context4 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            color = ResourceExtKt.color(context4, UniColors.BG_PRIMARY.getResId());
        }
        view.setBackgroundColor(color);
        this.separator = view;
        setId(R$id.sellerActionPreview_Separator_Root);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(view);
    }

    public final void bind(@NotNull SellerActionsPreviewVO.Separator item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setBackgroundColor(StyleParser.INSTANCE.parseColor(this.context, item.getContainerBgColor(), UniColors.BG_PRIMARY.getResId()));
        ViewExtKt.updatePadding$default(this, item.getHorizontalMargin(), 0, item.getHorizontalMargin(), 0, 10, null);
    }
}
