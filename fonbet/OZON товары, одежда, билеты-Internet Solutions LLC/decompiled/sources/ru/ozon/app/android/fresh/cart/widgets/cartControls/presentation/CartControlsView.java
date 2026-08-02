package ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniColorsSelect;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsVO;Lkotlin/jvm/functions/Function1;)V", "", "topCornerRadius", "bottomCornerRadius", "setCorners", "(FF)V", "bindOrGone", "Lru/ozon/uni/android/cell/CellView;", "selectionControlsView", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "binButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "moveItemsButtonView", "Landroid/graphics/drawable/GradientDrawable;", "contentBackground", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/widget/LinearLayout;", "contentContainer", "Landroid/widget/LinearLayout;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartControlsView extends FrameLayout {

    @NotNull
    private final IconButtonV3View binButtonView;

    @NotNull
    private final GradientDrawable contentBackground;

    @NotNull
    private final LinearLayout contentContainer;

    @NotNull
    private final IconButtonV3View moveItemsButtonView;

    @NotNull
    private final CellView selectionControlsView;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float cornerRadius = ResourceExtKt.toPxF(24);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/presentation/CartControlsView$Companion;", "", "<init>", "()V", "cornerRadius", "", "getCornerRadius", "()F", "BACKGROUND_LEVEL", "", "CORNERS_ARRAY_SIZE", "ZERO_CORNER_RADIUS", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCornerRadius() {
            return CartControlsView.cornerRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartControlsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        AttributeSet attributeSet = null;
        int i11 = 0;
        int i12 = 0;
        CellView cellView = new CellView(context, attributeSet, i11, i12, null, 30, null);
        cellView.setId(R$id.cartControlsSelectionControls);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        cellView.setLayoutParams(layoutParams);
        this.selectionControlsView = cellView;
        int i13 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, attributeSet, i11, i12, i13, defaultConstructorMarker);
        iconButtonV3View.setId(R$id.cartControlsBinButton);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(UiExtKt.toPx(8));
        iconButtonV3View.setLayoutParams(layoutParams2);
        this.binButtonView = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, attributeSet, i11, i12, i13, defaultConstructorMarker);
        iconButtonV3View2.setId(R$id.cartControlsMoveItemsButton);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(UiExtKt.toPx(8));
        iconButtonV3View2.setLayoutParams(layoutParams3);
        this.moveItemsButtonView = iconButtonV3View2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int color = a.getColor(context, UniColors.LAYER_FLOOR_1.getResId());
        gradientDrawable.setColors(new int[]{color, color});
        this.contentBackground = gradientDrawable;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.cartControlsContainer);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setClipToOutline(true);
        this.contentContainer = linearLayout;
        Drawable clipDrawable = new ClipDrawable(new ColorDrawable(a.getColor(context, UniColorsSelect.LAYER_FLOOR_0_INVERTED_SELECT.getResId())), 48, 2);
        clipDrawable.setLevel(5000);
        setBackground(clipDrawable);
        linearLayout.addView(cellView);
        linearLayout.addView(iconButtonV3View2);
        linearLayout.addView(iconButtonV3View);
        addView(linearLayout);
    }

    private final void bind(CartControlsVO item, Function1<? super AtomAction, Unit> onAction) {
        ViewExtKt.show(this);
        setCorners(item.getIsTopCornersRounded() ? cornerRadius : 0.0f, 0.0f);
        CellHolderKt.bindOrGone(this.selectionControlsView, item.getSelectionControls(), new CartControlsView$bind$1(this, onAction));
        this.selectionControlsView.getCenterBlock().setOnClickListener(new Gt.a(0, item, onAction));
        this.selectionControlsView.setCellHoverColor(0);
        IconButtonV3HolderKt.bindOrGone(this.moveItemsButtonView, item.getMoveItemsButton(), onAction);
        IconButtonV3HolderKt.bindOrGone(this.binButtonView, item.getBinButton(), onAction);
        this.contentContainer.setPadding(UiExtKt.toPx(item.getSpacers().getLeftPadding().getPx()), UiExtKt.toPx(item.getSpacers().getTopPadding().getPx()), UiExtKt.toPx(item.getSpacers().getRightPadding().getPx()), UiExtKt.toPx(item.getSpacers().getBottomPadding().getPx()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$10(CartControlsVO cartControlsVO, Function1 function1, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings common = cartControlsVO.getSelectionControls().getCommon();
        if (common == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, cartControlsVO.getSelectionControls().getTrackingInfo())) == null || function1 == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bindOrGone(CartControlsVO item, Function1<? super AtomAction, Unit> onAction) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            bind(item, onAction);
        }
    }

    public final void setCorners(float topCornerRadius, float bottomCornerRadius) {
        float[] fArr = new float[8];
        int i11 = 0;
        while (i11 < 8) {
            fArr[i11] = i11 < 4 ? topCornerRadius : bottomCornerRadius;
            i11++;
        }
        this.contentBackground.setCornerRadii(fArr);
    }
}
