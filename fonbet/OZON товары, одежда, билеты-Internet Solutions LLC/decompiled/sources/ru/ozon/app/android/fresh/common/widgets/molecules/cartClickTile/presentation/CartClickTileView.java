package ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation;

import B90.C2618u;
import Ez.ViewOnClickListenerC2979c;
import Lt.ViewOnClickListenerC3597a;
import WZ.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$id;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ=\u0010\u001e\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "cellInitViewIds", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/util/Set;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "cartClickTileVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "action", "setupImageSkuClickView", "(Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;Lkotlin/jvm/functions/Function1;Lru/ozon/uni/atoms/af/AtomAction;)V", "clickAction", "LWZ/t;", "sendClickAnalytics", "tokenizedEvent", "setupCurtainClickView", "(Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LWZ/t;)V", "setupCellView", "(Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;Lkotlin/jvm/functions/Function1;)V", "setupCourierButton", "bind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickView;", "imageSkuClickView", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickView;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Landroid/view/View;", "containerClickView", "Landroid/view/View;", "buttonClickView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "courierButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartClickTileView extends ConstraintLayout {

    @NotNull
    private final View buttonClickView;

    @NotNull
    private final CellView cellView;

    @NotNull
    private final View containerClickView;

    @NotNull
    private final ButtonV3View courierButtonView;

    @NotNull
    private final ImageSkuClickView imageSkuClickView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int IMAGE_SKU_CLICK_WIDTH = ResourceExtKt.toPx(60);
    private static final int IMAGE_SKU_CLICK_HEIGHT = ResourceExtKt.toPx(80);
    private static final int BUTTON_TOP_MARGIN = ResourceExtKt.toPx(10);
    private static final int BUTTON_BOTTOM_MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileView$Companion;", "", "<init>", "()V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CartClickTileView(Context context, AttributeSet attributeSet, int i11, Set set, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : set);
    }

    private final void setupCellView(CartClickTileVO cartClickTileVO, Function1<? super AtomAction, Unit> actionHandler) {
        CellHolderKt.bind(this.cellView, cartClickTileVO.getCell(), actionHandler);
        CellView cellView = this.cellView;
        ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(cartClickTileVO.getSpacers().getBetween(), 0, 0, 0);
        cellView.setLayoutParams(marginLayoutParams);
    }

    private final void setupCourierButton(CartClickTileVO cartClickTileVO, Function1<? super AtomAction, Unit> actionHandler) {
        ButtonV3View buttonV3View = this.courierButtonView;
        ButtonV3HolderKt.bindOrGone(buttonV3View, cartClickTileVO.getButton(), actionHandler);
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(cartClickTileVO.getSpacers().getHorizontal(), BUTTON_TOP_MARGIN, cartClickTileVO.getSpacers().getHorizontal(), BUTTON_BOTTOM_MARGIN);
        buttonV3View.setLayoutParams(marginLayoutParams);
        this.buttonClickView.setOnClickListener(new ViewOnClickListenerC2979c(buttonV3View, 13));
    }

    private final void setupCurtainClickView(AtomAction clickAction, Function1<? super AtomAction, Unit> actionHandler, Function1<? super t, Unit> sendClickAnalytics, t tokenizedEvent) {
        this.containerClickView.setOnClickListener(new ViewOnClickListenerC3597a(clickAction, actionHandler, sendClickAnalytics, tokenizedEvent));
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileView$setupCurtainClickView$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int paddingLeft = CartClickTileView.this.cellView.getRightBlock().getPaddingLeft() + CartClickTileView.this.cellView.getPaddingRight() + CartClickTileView.this.cellView.getRightBlock().getWidth();
                    View view2 = CartClickTileView.this.containerClickView;
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(0, 0, paddingLeft, 0);
                    view2.setLayoutParams(marginLayoutParams);
                }
            });
            return;
        }
        int paddingLeft = this.cellView.getRightBlock().getPaddingLeft() + this.cellView.getPaddingRight() + this.cellView.getRightBlock().getWidth();
        View view = this.containerClickView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, paddingLeft, 0);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCurtainClickView$lambda$18(Function1 function1, AtomAction atomAction, t tVar, Function1 function12, View view) {
        function1.invoke(atomAction);
        if (tVar != null) {
            function12.invoke(tVar);
        }
    }

    private final void setupImageSkuClickView(CartClickTileVO cartClickTileVO, Function1<? super AtomAction, Unit> actionHandler, AtomAction action) {
        ImageSkuClickView imageSkuClickView = this.imageSkuClickView;
        imageSkuClickView.bind(cartClickTileVO.getSkuImage(), actionHandler, action);
        ViewGroup.LayoutParams layoutParams = imageSkuClickView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(cartClickTileVO.getSpacers().getHorizontal(), 0, 0, 0);
        imageSkuClickView.setLayoutParams(marginLayoutParams);
    }

    public final void bind(@NotNull CartClickTileVO cartClickTileVO, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> sendClickAnalytics) {
        Intrinsics.checkNotNullParameter(cartClickTileVO, "cartClickTileVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(sendClickAnalytics, "sendClickAnalytics");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, cartClickTileVO.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        setupImageSkuClickView(cartClickTileVO, actionHandler, cartClickTileVO.getAction());
        setupCellView(cartClickTileVO, actionHandler);
        setupCourierButton(cartClickTileVO, actionHandler);
        setupCurtainClickView(cartClickTileVO.getAction(), actionHandler, sendClickAnalytics, cartClickTileVO.getTokenizedEvent());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartClickTileView(@NotNull Context context, AttributeSet attributeSet, int i11, Set<Integer> set) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageSkuClickView imageSkuClickView = new ImageSkuClickView(context, null, 0, 6, null);
        imageSkuClickView.setId(R$id.cartClickTileImageSkuClickView);
        ConstraintLayout.b bVar = new ConstraintLayout.b(IMAGE_SKU_CLICK_WIDTH, IMAGE_SKU_CLICK_HEIGHT);
        bVar.f41656t = 0;
        int i12 = R$id.cartClickTileCellView;
        bVar.f41636i = i12;
        bVar.f41642l = i12;
        imageSkuClickView.setLayoutParams(bVar);
        addView(imageSkuClickView);
        this.imageSkuClickView = imageSkuClickView;
        int i13 = 0;
        CellView cellView = new CellView(context, null, 0, i13, set, 14, null);
        cellView.setId(R$id.cartClickTileCellView);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41636i = 0;
        bVar2.f41658v = 0;
        bVar2.f41655s = R$id.cartClickTileImageSkuClickView;
        cellView.setLayoutParams(bVar2);
        addView(cellView);
        this.cellView = cellView;
        View view = new View(context);
        view.setId(R$id.cartClickTileCurtainClickView);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, 0);
        bVar3.f41656t = 0;
        bVar3.f41658v = 0;
        bVar3.f41636i = 0;
        bVar3.f41642l = R$id.cartClickTileCellView;
        view.setLayoutParams(bVar3);
        addView(view);
        this.containerClickView = view;
        View view2 = new View(context);
        view2.setId(R$id.cartClickTileButtonClickView);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, 0);
        bVar4.f41656t = 0;
        bVar4.f41658v = 0;
        bVar4.f41638j = R$id.cartClickTileCellView;
        bVar4.f41642l = 0;
        view2.setLayoutParams(bVar4);
        addView(view2);
        this.buttonClickView = view2;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, i13, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.cartClickTileButtonView, -1, -2);
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41638j = R$id.cartClickTileCellView;
        e11.f41642l = 0;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.courierButtonView = buttonV3View;
        setId(R$id.cartClickTileView);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }
}
