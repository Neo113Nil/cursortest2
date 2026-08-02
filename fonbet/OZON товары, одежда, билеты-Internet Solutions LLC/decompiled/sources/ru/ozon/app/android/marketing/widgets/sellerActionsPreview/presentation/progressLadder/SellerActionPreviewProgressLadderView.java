package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder;

import ED.a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.utils.CornersConfig;
import ru.ozon.app.android.marketing.utils.ExtensionsKt;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.seller.molecule.progressLadder.presentation.ProgressLadderView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadder/SellerActionPreviewProgressLadderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "progressLadderView", "Lru/ozon/app/android/seller/molecule/progressLadder/presentation/ProgressLadderView;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionPreviewProgressLadderView extends FrameLayout {

    @NotNull
    private final ProgressLadderView progressLadderView;
    public static final int $stable = 8;
    private static final int dp10 = UiExtKt.toPx(10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionPreviewProgressLadderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressLadderView progressLadderView = new ProgressLadderView(context);
        progressLadderView.setId(R$id.sellerActionPreview_ProgressLadder_Cell);
        progressLadderView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        int i11 = dp10;
        progressLadderView.setPadding(i11, progressLadderView.getPaddingTop(), i11, progressLadderView.getPaddingBottom());
        addView(progressLadderView);
        this.progressLadderView = progressLadderView;
        setId(R$id.sellerActionPreview_ProgressLadder_Root);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(SellerActionsPreviewVO.ProgressLadder progressLadder, Function1 function1, View view) {
        AtomAction action = progressLadder.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    public final void bind(@NotNull SellerActionsPreviewVO.ProgressLadder item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getContainerBgColor(), UniColors.BG_PRIMARY.getResId()));
        setPadding(item.getHorizontalMargin(), getPaddingTop(), item.getHorizontalMargin(), getPaddingBottom());
        ProgressLadderView progressLadderView = this.progressLadderView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float cornerRadius = item.getCornerRadius();
        CornersConfig cornersConfig = item.getCornersConfig();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        progressLadderView.setBackground(ExtensionsKt.createRoundRectShape$default(context2, cornerRadius, cornersConfig, 0, styleParser.parseColor(context3, item.getWidgetBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()), 4, null));
        this.progressLadderView.setPadding(item.getHorizontalPadding(), item.getVerticalPadding(), item.getHorizontalPadding(), item.getVerticalPadding());
        this.progressLadderView.bind(item.getProgressLadder());
        setOnClickListener(new a(1, item, actionHandler));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}
