package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.dsCell;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.utils.ExtensionsKt;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/dsCell/SellerActionPreviewDsCellView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cell", "Lru/ozon/uni/android/cell/CellView;", "bind", "", "item", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionPreviewDsCellView extends FrameLayout {

    @NotNull
    private final CellView cell;

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionPreviewDsCellView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
        cellView.setId(R$id.sellerActionPreview_DsCell_Cell);
        cellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(cellView);
        this.cell = cellView;
        setId(R$id.sellerActionPreview_DsCell_Root);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public final void bind(@NotNull SellerActionsPreviewVO.DsCell item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        StyleParser styleParser = StyleParser.INSTANCE;
        setBackgroundColor(styleParser.parseColor(this.context, item.getContainerBgColor(), UniColors.BG_PRIMARY.getResId()));
        ViewExtKt.updatePadding$default(this, item.getHorizontalMargin(), 0, item.getHorizontalMargin(), 0, 10, null);
        this.cell.setBackground(ExtensionsKt.createRoundRectShape$default(this.context, item.getCornerRadius(), item.getCornersConfig(), 0, styleParser.parseColor(this.context, item.getWidgetBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()), 4, null));
        CellHolderKt.bind(this.cell, item.getCell(), actionHandler);
        ViewExtKt.updatePadding(this.cell, item.getHorizontalPadding(), item.getVerticalPadding(), item.getHorizontalPadding(), item.getVerticalPadding());
    }
}
