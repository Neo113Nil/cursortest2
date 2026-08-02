package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.view;

import Am.C2438a;
import JE.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001e0\"j\u0002`$J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020\u001eH\u0002J\u0012\u0010*\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u001aH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/view/BonusExpirationRemainderView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cellView", "Lru/ozon/uni/android/cell/CellView;", "getCellView", "()Lru/ozon/uni/android/cell/CellView;", "cellView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "closeButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getCloseButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "closeButton$delegate", "backgroundDrawable", "Landroid/graphics/drawable/ColorDrawable;", "ripple", "Landroid/graphics/drawable/RippleDrawable;", "cellViewHitRect", "Landroid/graphics/Rect;", "horizontalMargin", "", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "setUp", "setUpChildren", "addChildren", "setUpCellView", "setUpCloseButton", "bindWidgetSettings", "settings", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "bindPaddings", "paddings", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO$PaddingsVO;", "bindCornerRadius", "radius", "", "bindCellMargins", "shouldAddMargins", "BonusExpirationViewOutlineProvider", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(BonusExpirationRemainderView.class, "cellView", "getCellView()Lru/ozon/uni/android/cell/CellView;", 0), C2438a.c(BonusExpirationRemainderView.class, "closeButton", "getCloseButton()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};
    public static final int $stable = 8;

    @NotNull
    private final ColorDrawable backgroundDrawable;

    /* renamed from: cellView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellView;

    @NotNull
    private final Rect cellViewHitRect;

    /* renamed from: closeButton$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate closeButton;
    private final int horizontalMargin;

    @NotNull
    private final RippleDrawable ripple;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/view/BonusExpirationRemainderView$BonusExpirationViewOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "radius", "", "<init>", "(F)V", "getRadius", "()F", "setRadius", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class BonusExpirationViewOutlineProvider extends ViewOutlineProvider {
        private float radius;

        public BonusExpirationViewOutlineProvider(float f7) {
            this.radius = f7;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            float f7 = this.radius;
            outline.setRoundRect(0, 0, width, height + ((int) f7), f7);
        }

        public final float getRadius() {
            return this.radius;
        }

        public final void setRadius(float f7) {
            this.radius = f7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusExpirationRemainderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.cellView = new PreCreationViewPoolDelegate(context2, N.b(CellView.class), new BonusExpirationRemainderView$special$$inlined$preCreationViewPool$default$1(this), new BonusExpirationRemainderView$special$$inlined$preCreationViewPool$default$2(context));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.closeButton = new PreCreationViewPoolDelegate(context3, N.b(IconButtonV3View.class), new BonusExpirationRemainderView$special$$inlined$preCreationViewPool$default$3(this), new BonusExpirationRemainderView$special$$inlined$preCreationViewPool$default$4(context));
        ColorDrawable colorDrawable = new ColorDrawable(context.getColor(R$color.bg_apparel_primary));
        this.backgroundDrawable = colorDrawable;
        this.ripple = new RippleDrawable(ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.colorControlHighlight)), colorDrawable, colorDrawable);
        this.cellViewHitRect = new Rect();
        this.horizontalMargin = UiExtKt.toPx(30, context);
        setUp();
        setUpChildren();
        addChildren();
    }

    private final void addChildren() {
        addView(getCellView());
        addView(getCloseButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(BonusExpirationRemainderVI bonusExpirationRemainderVI, Function1 function1, View view) {
        AtomAction clickAction = bonusExpirationRemainderVI.getClickAction();
        if (clickAction != null) {
            function1.invoke(clickAction);
        }
    }

    private final void bindCellMargins(boolean shouldAddMargins) {
        int i11 = shouldAddMargins ? this.horizontalMargin : 0;
        ViewGroup.LayoutParams layoutParams = getCellView().getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || layoutParams2.getMarginStart() == i11) {
            return;
        }
        layoutParams2.setMarginStart(i11);
        layoutParams2.setMarginEnd(i11);
        getCellView().setLayoutParams(layoutParams2);
    }

    private final void bindCornerRadius(float radius) {
        ViewOutlineProvider outlineProvider = getOutlineProvider();
        BonusExpirationViewOutlineProvider bonusExpirationViewOutlineProvider = outlineProvider instanceof BonusExpirationViewOutlineProvider ? (BonusExpirationViewOutlineProvider) outlineProvider : null;
        if (bonusExpirationViewOutlineProvider == null || bonusExpirationViewOutlineProvider.getRadius() == radius) {
            return;
        }
        bonusExpirationViewOutlineProvider.setRadius(radius);
        invalidateOutline();
    }

    private final void bindPaddings(TravelWidgetSettingsVO.PaddingsVO paddings) {
        if (getPaddingLeft() == paddings.getLeftPadding() && getPaddingTop() == paddings.getTopPadding() && getPaddingRight() == paddings.getRightPadding() && getPaddingBottom() == paddings.getBottomPadding()) {
            return;
        }
        setPadding(paddings.getLeftPadding(), paddings.getTopPadding(), paddings.getRightPadding(), paddings.getBottomPadding());
    }

    private final void bindWidgetSettings(TravelWidgetSettingsVO settings) {
        if (settings == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, settings.getBackgroundColor(), R$color.bg_apparel_primary);
        if (parseColor != this.backgroundDrawable.getColor()) {
            this.backgroundDrawable.setColor(parseColor);
            this.backgroundDrawable.invalidateSelf();
        }
        bindPaddings(settings.getPaddings());
        bindCornerRadius(settings.getCorners().getTopRadius());
    }

    private final CellView getCellView() {
        return (CellView) this.cellView.getValue(this, $$delegatedProperties[0]);
    }

    private final IconButtonV3View getCloseButton() {
        return (IconButtonV3View) this.closeButton.getValue(this, $$delegatedProperties[1]);
    }

    private final void setUp() {
        setBackground(this.ripple);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = UiExtKt.toPx(8, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = UiExtKt.toPx(12, context2);
        setPadding(px2, px, px2, px);
        setClipToOutline(true);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setOutlineProvider(new BonusExpirationViewOutlineProvider(ResourceExtKt.toPxF(16, context3)));
    }

    private final void setUpCellView() {
        CellView cellView = getCellView();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        cellView.setLayoutParams(layoutParams);
    }

    private final void setUpChildren() {
        setUpCellView();
        setUpCloseButton();
    }

    private final void setUpCloseButton() {
        IconButtonV3View closeButton = getCloseButton();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        closeButton.setLayoutParams(layoutParams);
    }

    public final void bind(@NotNull BonusExpirationRemainderVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bind$default(getCellView(), item.getCell(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(getCloseButton(), item.getCloseButton(), actionHandler);
        bindWidgetSettings(item.getWidgetSettings());
        bindCellMargins(item.getShouldAddMargins());
        setOnClickListener(new a(4, item, actionHandler));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 0) {
            getCellView().getHitRect(this.cellViewHitRect);
            if (this.cellViewHitRect.contains((int) ev.getX(), (int) ev.getY())) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }
}
