package ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cashbackPoints.presentation.CashbackPointsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointSingleBlockView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "backgroundRoundShape", "Landroid/graphics/drawable/ShapeDrawable;", "halfWidth", "", "titleV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleV", "bind", "", "block", "Lru/ozon/app/android/pdp/widgets/cashbackPoints/presentation/CashbackPointsVO$Block;", "isHalfWidth", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CashbackPointSingleBlockView extends LinearLayout {

    @NotNull
    private final ShapeDrawable backgroundRoundShape;
    private final int halfWidth;

    @NotNull
    private TextAtomV2View subtitleV;

    @NotNull
    private TextAtomV2View titleV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackPointSingleBlockView(@NotNull Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Dimens dimens = Dimens.INSTANCE;
        this.backgroundRoundShape = ContextExtKt.createRoundRectShape$default(context, dimens.getDPF_16(), CornersConfig.ALL, 0, 0, null, 28, null);
        this.halfWidth = (getResources().getDisplayMetrics().widthPixels / 2) - dimens.getDP_20();
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.cashbackPointTitleV);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View);
        this.titleV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.cashbackPointSubtitleV);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(textAtomV2View2);
        this.subtitleV = textAtomV2View2;
        setId(R$id.cashbackPointBlockV);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setPadding(dimens.getDP_16(), dimens.getDP_12(), dimens.getDP_16(), dimens.getDP_12());
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setGravity(17);
        setOrientation(1);
    }

    public static /* synthetic */ void bind$default(CashbackPointSingleBlockView cashbackPointSingleBlockView, CashbackPointsVO.Block block, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        cashbackPointSingleBlockView.bind(block, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r5 != (r2 != null ? r2.bottomMargin : 0)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull CashbackPointsVO.Block block, boolean isHalfWidth) {
        Intrinsics.checkNotNullParameter(block, "block");
        TextHolderKt.bind$default(this.titleV, block.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleV, block.getSubtitle(), null, 2, null);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            if (isHalfWidth) {
                marginLayoutParams.width = this.halfWidth;
            }
            marginLayoutParams.bottomMargin = block.getHasBottomMargin() ? Dimens.INSTANCE.getDP_8() : 0;
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            setLayoutParams(marginLayoutParams);
        }
        ShapeDrawable shapeDrawable = this.backgroundRoundShape;
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paint.setColor(ContextExtKt.parseColor(context, block.getBackgroundColor()));
        setBackground(shapeDrawable);
    }
}
