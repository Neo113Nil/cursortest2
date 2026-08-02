package ru.ozon.app.android.checkoutgeo.checkout.views.totalButton;

import D40.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.R$id;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonDTO;
import ru.ozon.app.android.uikit.view.shimmer.Shimmer;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.uikit.view.shimmer.UtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007H\u0014J6\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"J8\u0010.\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"J\b\u0010/\u001a\u00020\u000fH\u0002J\b\u00100\u001a\u00020\u000fH\u0002J\b\u00101\u001a\u00020\u000fH\u0002J\b\u00102\u001a\u00020\u000fH\u0002J\u001c\u00103\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0010\u00108\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*H\u0002J\b\u00109\u001a\u00020\u000fH\u0002J\b\u0010:\u001a\u00020\u000fH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006<"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "commonControls", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "defaultBgColor", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "titleSubtextView", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalTitleSubtextView;", "subtitleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "badgeView", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalBadgeView;", "startGuideline", "Landroidx/constraintlayout/widget/Guideline;", "endGuideline", "shimmerView", "Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "getShimmerView", "()Lru/ozon/app/android/uikit/view/shimmer/ShimmerFrameLayout;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "bind", "dto", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "onAction", "isSelectApp", "shimmeringIsActive", "bindOrGone", "addTitleSubtextView", "addSubtitleView", "addBadgeView", "addShimmerView", "setupBackground", "color", "", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "configureConstraints", "showHover", "hideHover", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes11.dex */
public final class TotalButtonView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final TotalBadgeView badgeView;
    private CommonControlSettings commonControls;
    private final int defaultBgColor;

    @NotNull
    private final Guideline endGuideline;

    @NotNull
    private final GradientDrawable foregroundDrawable;

    @NotNull
    private final ShimmerFrameLayout shimmerView;

    @NotNull
    private final Guideline startGuideline;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TotalTitleSubtextView titleSubtextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_6 = ResourceExtKt.toPx(6);
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_16 = ResourceExtKt.toPx(16);
    private static final int DP_56 = ResourceExtKt.toPx(56);
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(16);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonView$Companion;", "", "<init>", "()V", "", "DP_6", "I", "getDP_6", "()I", "", "DEFAULT_TITLE_HORIZONTAL_BIAS", "F", "NO_BADGE_TITLE_HORIZONTAL_BIAS", "FOREGROUND_OPACITY", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_6() {
            return TotalButtonView.DP_6;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TotalButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addBadgeView() {
        addView(this.badgeView);
        ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$addBadgeView$1(this));
    }

    private final void addShimmerView() {
        addView(this.shimmerView);
        ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$addShimmerView$1(this));
        this.shimmerView.setVisibility(8);
        this.shimmerView.setClickable(true);
        this.shimmerView.setBackgroundColor(getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()));
        this.shimmerView.setShimmer(new Shimmer.AlphaHighlightBuilder().setAutoStart(false).setDuration(1000L).setRepeatDelay(150L).setFixedWidth(ResourceExtKt.toPx(m.e.DEFAULT_DRAG_ANIMATION_DURATION)).setBaseAlpha(0.4f).setHighlightAlpha(0.9f).setIntensity(0.1f).setTilt(0.0f).setRepeatMode(1).setShape(Shimmer.Shape.LINEAR).build());
    }

    private final void addSubtitleView() {
        addView(this.subtitleView);
        ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$addSubtitleView$1(this));
    }

    private final void addTitleSubtextView() {
        addView(this.titleSubtextView);
        ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$addTitleSubtextView$1(this));
        TotalTitleSubtextView totalTitleSubtextView = this.titleSubtextView;
        ViewGroup.LayoutParams layoutParams = totalTitleSubtextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41603J = 1;
        bVar.f41604K = 2;
        totalTitleSubtextView.setLayoutParams(bVar);
    }

    private final void configureConstraints(TotalButtonDTO dto) {
        if (dto.getPriority() == TotalButtonDTO.ExpandPriority.TITLE) {
            ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$configureConstraints$1(this));
        } else {
            ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$configureConstraints$2(this));
        }
        if (dto.getBadge() == null) {
            ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$configureConstraints$3(this));
            TextAtomV2View textAtomV2View = this.subtitleView;
            ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41598E = 0.5f;
            textAtomV2View.setLayoutParams(bVar);
            return;
        }
        ConstraintLayoutExtKt.updateConstraints(this, new TotalButtonView$configureConstraints$5(this));
        TextAtomV2View textAtomV2View2 = this.subtitleView;
        ViewGroup.LayoutParams layoutParams2 = textAtomV2View2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(bVar2);
    }

    private final void hideHover() {
        setForeground(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setupBackground(String color, CornerRadius radius) {
        Color solid;
        UniGradient gradientByToken;
        if (color != null && (gradientByToken = TokensExtKt.getGradientByToken(color)) != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            solid = TokensExtKt.toGradient(gradientByToken, context);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context2, color);
        solid = new Color.Solid(parseColor != null ? parseColor.intValue() : this.defaultBgColor);
        solid.applyTo(this.backgroundDrawable);
        if (radius == null) {
            float cornerRadius = this.backgroundDrawable.getCornerRadius();
            float f7 = CORNER_RADIUS;
            if (cornerRadius == f7) {
                return;
            }
            this.backgroundDrawable.setCornerRadius(f7);
            return;
        }
        int px = radius.getPx();
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(px, context3);
        if (this.backgroundDrawable.getCornerRadius() == pxF) {
            return;
        }
        this.backgroundDrawable.setCornerRadius(pxF);
    }

    private final void showHover() {
        setForeground(this.foregroundDrawable);
    }

    public final void bind(@NotNull TotalButtonDTO dto, Function1<? super AtomAction, Unit> onAction, boolean isSelectApp, boolean shimmeringIsActive) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.commonControls = dto.getCommon();
        this.actionHandler = onAction;
        setupBackground(dto.getBackgroundColor(), dto.getButtonCornerRadius());
        this.titleSubtextView.bind(dto.getTitle(), dto.getTitleSubtext());
        TextHolderKt.bindOrGone$default(this.subtitleView, dto.getSubtitle(), null, 2, null);
        this.badgeView.bindOrGone(dto.getBadge(), isSelectApp);
        configureConstraints(dto);
        UtilsKt.setShimmering(this.shimmerView, shimmeringIsActive);
    }

    public final void bindOrGone(TotalButtonDTO dto, Function1<? super AtomAction, Unit> onAction, boolean isSelectApp, boolean shimmeringIsActive) {
        if (dto == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(dto, onAction, isSelectApp, shimmeringIsActive);
        }
    }

    @NotNull
    public final ShimmerFrameLayout getShimmerView() {
        return this.shimmerView;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec), 1073741824), View.MeasureSpec.makeMeasureSpec(DP_56, 1073741824));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AtomActionDTO action;
        Function1<? super AtomAction, Unit> function1;
        CommonControlSettings commonControlSettings = this.commonControls;
        if ((commonControlSettings != null ? commonControlSettings.getAction() : null) == null) {
            return true;
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            showHover();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            hideHover();
            CommonControlSettings commonControlSettings2 = this.commonControls;
            if (commonControlSettings2 != null && (action = commonControlSettings2.getAction()) != null) {
                CommonControlSettings commonControlSettings3 = this.commonControls;
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, commonControlSettings3 != null ? commonControlSettings3.getTrackingInfo() : null);
                if (atomAction != null && (function1 = this.actionHandler) != null) {
                    function1.invoke(atomAction);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            hideHover();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultBgColor = context.getColor(R$color.bg_action_primary);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(CORNER_RADIUS);
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setAlpha(26);
        gradientDrawable2.setColor(context.getColor(R$color.layer_floor_1));
        this.foregroundDrawable = gradientDrawable2;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TotalTitleSubtextView totalTitleSubtextView = new TotalTitleSubtextView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        totalTitleSubtextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        totalTitleSubtextView.setId(R$id.totalButtonViewTitleSubtextView);
        this.titleSubtextView = totalTitleSubtextView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setId(R$id.totalButtonViewSubtitleView);
        textAtomV2View.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View;
        TotalBadgeView totalBadgeView = new TotalBadgeView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        totalBadgeView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        totalBadgeView.setId(R$id.totalButtonViewBadgeView);
        this.badgeView = totalBadgeView;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.totalButtonViewStartGuideline, -2, -2);
        a11.f41615V = 1;
        a11.f41620a = DP_16;
        guideline.setLayoutParams(a11);
        this.startGuideline = guideline;
        Guideline guideline2 = new Guideline(context);
        ConstraintLayout.b a12 = a.a(guideline2, R$id.totalButtonViewEndGuideline, -2, -2);
        a12.f41615V = 1;
        a12.f41622b = DP_12;
        guideline2.setLayoutParams(a12);
        this.endGuideline = guideline2;
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context, null, 0, 0, 14, null);
        shimmerFrameLayout.setId(R$id.totalButtonViewShimmerView);
        shimmerFrameLayout.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.shimmerView = shimmerFrameLayout;
        setBackground(gradientDrawable);
        addView(guideline);
        addView(guideline2);
        addTitleSubtextView();
        addSubtitleView();
        addBadgeView();
        addShimmerView();
    }
}
