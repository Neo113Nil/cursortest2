package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadderCell;

import VD.a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.utils.CornersConfig;
import ru.ozon.app.android.marketing.utils.ExtensionsKt;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/progressLadderCell/SellerActionPreviewProgressLadderCellView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "leftIcon", "Lru/ozon/uni/android/atom/icon/IconView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "rightIcon", "linearLayout", "Landroid/widget/LinearLayout;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadderCell;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionPreviewProgressLadderCellView extends FrameLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final IconView leftIcon;

    @NotNull
    private final LinearLayout linearLayout;

    @NotNull
    private final IconView rightIcon;

    @NotNull
    private final TextAtomV2View title;
    public static final int $stable = 8;
    private static final int dp10 = UiExtKt.toPx(10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionPreviewProgressLadderCellView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.sellerActionPreview_ProgressLadderCell_LeftIcon);
        iconView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.leftIcon = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.sellerActionPreview_ProgressLadderCell_Title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        int i11 = dp10;
        layoutParams.setMarginStart(i11);
        textAtomV2View.setLayoutParams(layoutParams);
        this.title = textAtomV2View;
        IconView iconView2 = new IconView(context, null, 0, 6, null);
        iconView2.setId(R$id.sellerActionPreview_ProgressLadderCell_RightIcon);
        iconView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.rightIcon = iconView2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(i11, linearLayout.getPaddingTop(), i11, linearLayout.getPaddingBottom());
        linearLayout.addView(iconView);
        linearLayout.addView(textAtomV2View);
        linearLayout.addView(iconView2);
        this.linearLayout = linearLayout;
        setId(R$id.sellerActionPreview_ProgressLadderCell_Root);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5(SellerActionsPreviewVO.ProgressLadderCell progressLadderCell, Function1 function1, View view) {
        AtomAction action = progressLadderCell.getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    public final void bind(@NotNull SellerActionsPreviewVO.ProgressLadderCell item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        setBackgroundColor(styleParser.parseColor(this.context, item.getContainerBgColor(), UniColors.BG_PRIMARY.getResId()));
        setPadding(item.getHorizontalMargin(), getPaddingTop(), item.getHorizontalMargin(), getPaddingBottom());
        IconHolderKt.bindOrGone$default(this.leftIcon, item.getIconLeft(), null, 2, null);
        TextDTO title = item.getTitle();
        if (title != null) {
            TextHolderKt.bind$default(this.title, title, null, 2, null);
        }
        IconHolderKt.bindOrGone$default(this.rightIcon, item.getIconRight(), null, 2, null);
        this.linearLayout.setPadding(item.getHorizontalPadding(), item.getVerticalPadding(), item.getHorizontalPadding(), item.getCornersConfig() == CornersConfig.BOTTOM ? item.getVerticalPadding() : 0);
        this.linearLayout.setBackground(ExtensionsKt.createRoundRectShape$default(this.context, item.getCornerRadius(), item.getCornersConfig(), 0, styleParser.parseColor(this.context, item.getWidgetBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()), 4, null));
        setOnClickListener(new a(1, item, actionHandler));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}
