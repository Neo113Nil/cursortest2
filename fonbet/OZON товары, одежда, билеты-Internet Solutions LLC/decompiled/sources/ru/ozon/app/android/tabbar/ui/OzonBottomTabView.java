package ru.ozon.app.android.tabbar.ui;

import B5.v;
import H5.e;
import P5.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.graphics.drawable.a;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.OzonBottomTabView;
import ru.ozon.app.android.tabbar.ui.model.TabIconColor;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0015J\u0019\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\t2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u00103\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u001cJ\u0017\u00107\u001a\u00020\t2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010\u0015J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010\u001cJ\u000f\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010\u0015J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010\u001cJ\u0017\u0010?\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010\u001cJ\u0017\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010\u0015J\u0017\u0010E\u001a\u00020\t2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bE\u0010CJ\u000f\u0010F\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010\u0015J\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bN\u0010\u0015J\u001b\u0010Q\u001a\u00020\t*\u00020O2\u0006\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010\u0015J\u000f\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R$\u0010!\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010#R\"\u0010e\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\be\u0010g\"\u0004\bh\u0010iR\u001a\u0010k\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR*\u0010p\u001a\u00020G2\u0006\u0010o\u001a\u00020G8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010JR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u001b\u0010\u007f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001e\u0010\u0082\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010|\u001a\u0005\b\u0081\u0001\u0010~R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\\R\u001e\u0010\u0085\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010|\u001a\u0005\b\u0084\u0001\u0010~R\u0016\u0010\u0086\u0001\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\\R\u0018\u0010\u0087\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010fR\u0019\u0010\u0088\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Lru/ozon/app/android/tabbar/ui/OzonBottomTabView;", "Lru/ozon/app/android/tabbar/ui/BaseOzonBottomTabView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "()V", "", "label", "setLabel", "(Ljava/lang/CharSequence;)V", "resId", "setLabelTextAppearance", "(I)V", "Landroid/content/res/ColorStateList;", "colorStateList", "setLabelColor", "(Landroid/content/res/ColorStateList;)V", "animationId", "setAnimation", "(Ljava/lang/Integer;)V", "cancelAnimation", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "badgeDescription", "bindBadge", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;)V", "removeBadge", "(Ljava/lang/String;)V", "getBadgeData", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "mode", "setLabelVisibility", "Landroid/view/MenuItem;", "menuItem", "setChecked", "(Landroid/view/MenuItem;)V", "playAnimationIfExists", "badgeVerticalOffset", "setBadgeTopOffset", "setRegularIconTab", "color", "tintAnimationIcon", "setAnimatedTab", "Landroidx/constraintlayout/widget/d;", "constraintSet", "initIconViewParams", "(Landroidx/constraintlayout/widget/d;)V", "applyAnimatedIconViewParams", "initLabelViewParams", "updateLabelColor", "Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "iconTabColor", "updateIconColor", "(Lru/ozon/app/android/tabbar/ui/model/TabIconColor;)V", "", "getColorState", "()[I", "updateBadgePosition", "Landroid/view/View;", "margin", "setTopMargin", "(Landroid/view/View;I)V", "addCircleRipple", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "getOrCreateBadge", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "badgeView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "currentBadgeData", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "iconSize", "I", "iconLabeledTopMargin", "checkedState", "[I", "uncheckedState", "Ljava/lang/Integer;", "getAnimationId", "()Ljava/lang/Integer;", "setAnimationId", "isAnimationCompleted", "Z", "()Z", "setAnimationCompleted", "(Z)V", "Lcom/airbnb/lottie/LottieAnimationView;", "animatedIconView", "Lcom/airbnb/lottie/LottieAnimationView;", "getAnimatedIconView", "()Lcom/airbnb/lottie/LottieAnimationView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "iconColor", "Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "getIconColor", "()Lru/ozon/app/android/tabbar/ui/model/TabIconColor;", "setIconColor", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "labelView", "Landroid/widget/TextView;", "badgeVerticalOffsetForVisibleLabel$delegate", "LSc/j;", "getBadgeVerticalOffsetForVisibleLabel", "()I", "badgeVerticalOffsetForVisibleLabel", "badgeVerticalOffsetForHiddenLabel$delegate", "getBadgeVerticalOffsetForHiddenLabel", "badgeVerticalOffsetForHiddenLabel", "badgeHorizontalOffset$delegate", "getBadgeHorizontalOffset", "badgeHorizontalOffset", "maxTabWidth", "isChecked", "labelColorStateList", "Landroid/content/res/ColorStateList;", "originalIconDrawable", "Landroid/graphics/drawable/Drawable;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonBottomTabView extends BaseOzonBottomTabView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final LottieAnimationView animatedIconView;
    private Integer animationId;

    /* renamed from: badgeHorizontalOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeHorizontalOffset;
    private int badgeVerticalOffset;

    /* renamed from: badgeVerticalOffsetForHiddenLabel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeVerticalOffsetForHiddenLabel;

    /* renamed from: badgeVerticalOffsetForVisibleLabel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j badgeVerticalOffsetForVisibleLabel;
    private IndicatorView badgeView;

    @NotNull
    private final int[] checkedState;
    private IndicatorDTO currentBadgeData;

    @NotNull
    private TabIconColor iconColor;
    private final int iconLabeledTopMargin;
    private final int iconSize;

    @NotNull
    private final ImageView iconView;
    private boolean isAnimationCompleted;
    private boolean isChecked;

    @NotNull
    private ColorStateList labelColorStateList;

    @NotNull
    private final TextView labelView;
    private final int maxTabWidth;
    private Drawable originalIconDrawable;

    @NotNull
    private final int[] uncheckedState;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/tabbar/ui/OzonBottomTabView$Companion;", "", "<init>", "()V", "ICON_UNLABELED_TOP_MARGIN", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonBottomTabView(@NotNull Context context) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconSize = ResourceExtKt.toPx(24);
        this.iconLabeledTopMargin = ResourceExtKt.toPx(4.5d);
        this.checkedState = new int[]{R.attr.state_checked};
        this.uncheckedState = new int[0];
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        lottieAnimationView.setRepeatCount(0);
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.animatedIconView = lottieAnimationView;
        ColorStateList valueOf = ColorStateList.valueOf(-16777216);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        this.iconColor = new TabIconColor(valueOf);
        ImageView imageView = new ImageView(getContext());
        this.iconView = imageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.labelView = appCompatTextView;
        n nVar = n.NONE;
        this.badgeVerticalOffsetForVisibleLabel = k.a(nVar, OzonBottomTabView$badgeVerticalOffsetForVisibleLabel$2.INSTANCE);
        this.badgeVerticalOffsetForHiddenLabel = k.a(nVar, OzonBottomTabView$badgeVerticalOffsetForHiddenLabel$2.INSTANCE);
        this.badgeVerticalOffset = -1;
        this.badgeHorizontalOffset = k.a(nVar, OzonBottomTabView$badgeHorizontalOffset$2.INSTANCE);
        this.maxTabWidth = ResourceExtKt.toPx(168);
        ColorStateList valueOf2 = ColorStateList.valueOf(-16777216);
        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
        this.labelColorStateList = valueOf2;
        setClickable(true);
        addCircleRipple();
        setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        addView(imageView);
        addView(getAnimatedIconView());
        addView(appCompatTextView);
        imageView.setId(ru.ozon.app.android.tabbar.R$id.tab_icon);
        appCompatTextView.setId(ru.ozon.app.android.tabbar.R$id.tab_label);
        getAnimatedIconView().setId(ru.ozon.app.android.tabbar.R$id.tab_icon_animated);
        d dVar = new d();
        dVar.p(this);
        initIconViewParams(dVar);
        initLabelViewParams(dVar);
        dVar.f(this);
    }

    private final void addCircleRipple() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    private final void applyAnimatedIconViewParams() {
        LottieAnimationView animatedIconView = getAnimatedIconView();
        int i11 = this.iconSize;
        animatedIconView.setLayoutParams(new ConstraintLayout.b(i11, i11));
        d dVar = new d();
        dVar.p(this);
        dVar.s(getAnimatedIconView().getId(), 3, this.iconView.getId(), 3);
        dVar.s(getAnimatedIconView().getId(), 4, this.iconView.getId(), 4);
        dVar.s(getAnimatedIconView().getId(), 6, this.iconView.getId(), 6);
        dVar.s(getAnimatedIconView().getId(), 7, this.iconView.getId(), 7);
        dVar.f(this);
    }

    private final int getBadgeHorizontalOffset() {
        return ((Number) this.badgeHorizontalOffset.getValue()).intValue();
    }

    private final int getBadgeVerticalOffsetForHiddenLabel() {
        return ((Number) this.badgeVerticalOffsetForHiddenLabel.getValue()).intValue();
    }

    private final int getBadgeVerticalOffsetForVisibleLabel() {
        return ((Number) this.badgeVerticalOffsetForVisibleLabel.getValue()).intValue();
    }

    private final int[] getColorState() {
        return this.isChecked ? this.checkedState : this.uncheckedState;
    }

    private final IndicatorView getOrCreateBadge() {
        IndicatorView indicatorView = this.badgeView;
        if (indicatorView != null) {
            return indicatorView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IndicatorView indicatorView2 = new IndicatorView(context, null, 0, 0, 14, null);
        addView(indicatorView2);
        indicatorView2.setId(ru.ozon.app.android.tabbar.R$id.tab_badge);
        indicatorView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        d dVar = new d();
        dVar.p(this);
        dVar.s(indicatorView2.getId(), 3, 0, 3);
        dVar.s(indicatorView2.getId(), 6, 0, 6);
        dVar.f(this);
        this.badgeView = indicatorView2;
        return indicatorView2;
    }

    private final void initIconViewParams(d constraintSet) {
        ImageView imageView = this.iconView;
        int i11 = this.iconSize;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i11, i11);
        constraintSet.s(imageView.getId(), 3, 0, 3);
        constraintSet.s(imageView.getId(), 6, 0, 6);
        constraintSet.s(imageView.getId(), 7, 0, 7);
        setTopMargin(imageView, this.iconLabeledTopMargin);
        imageView.setLayoutParams(bVar);
    }

    private final void initLabelViewParams(d constraintSet) {
        TextView textView = this.labelView;
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        constraintSet.s(textView.getId(), 3, this.iconView.getId(), 4);
        constraintSet.s(textView.getId(), 6, 0, 6);
        constraintSet.s(textView.getId(), 7, 0, 7);
    }

    private final void setAnimatedTab(int animationId) {
        setAnimationCompleted(false);
        getAnimatedIconView().setVisibility(0);
        getAnimatedIconView().addAnimatorListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.tabbar.ui.OzonBottomTabView$setAnimatedTab$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                OzonBottomTabView.this.setRegularIconTab();
                OzonBottomTabView.this.setAnimationCompleted(true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                OzonBottomTabView.this.setRegularIconTab();
                OzonBottomTabView.this.setAnimationCompleted(true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                ImageView imageView;
                Intrinsics.checkNotNullParameter(animation, "animation");
                imageView = OzonBottomTabView.this.iconView;
                imageView.setVisibility(4);
            }
        });
        getAnimatedIconView().setAnimation(animationId);
        applyAnimatedIconViewParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRegularIconTab() {
        getAnimatedIconView().setVisibility(8);
        this.iconView.setVisibility(0);
    }

    private final void setTopMargin(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.b) layoutParams)).topMargin = i11;
    }

    private final void tintAnimationIcon(final int color) {
        getAnimatedIconView().addValueCallback(new e("**"), (e) v.f2780F, (P5.e<e>) new P5.e() { // from class: aM.e
            @Override // P5.e
            public final ColorFilter a(P5.b bVar) {
                ColorFilter tintAnimationIcon$lambda$3;
                tintAnimationIcon$lambda$3 = OzonBottomTabView.tintAnimationIcon$lambda$3(color, bVar);
                return tintAnimationIcon$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorFilter tintAnimationIcon$lambda$3(int i11, b bVar) {
        return new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
    }

    private final void updateBadgePosition() {
        IndicatorView indicatorView = this.badgeView;
        if (indicatorView == null || indicatorView.getMeasuredWidth() == 0) {
            return;
        }
        int i11 = this.badgeVerticalOffset;
        if (i11 == -1) {
            i11 = ViewExtKt.isVisible(this.labelView) ? getBadgeVerticalOffsetForVisibleLabel() : getBadgeVerticalOffsetForHiddenLabel();
        }
        indicatorView.setTranslationX(indicatorView.getMeasuredWidth() <= (getMeasuredWidth() / 2) - getBadgeHorizontalOffset() ? r2 + getBadgeHorizontalOffset() : getMeasuredWidth() - indicatorView.getMeasuredWidth());
        indicatorView.setTranslationY(i11);
    }

    private final void updateIconColor(TabIconColor iconTabColor) {
        int[] colorState = getColorState();
        ImageView imageView = this.iconView;
        ColorStateList colorTintList = iconTabColor.getColorTintList();
        if (!(this.originalIconDrawable instanceof VectorDrawable)) {
            colorTintList = null;
        }
        imageView.setImageTintList(colorTintList);
        this.iconView.setImageState(colorState, false);
        this.iconView.setImageDrawable(this.originalIconDrawable);
    }

    private final void updateLabelColor() {
        this.labelView.setTextColor(this.labelColorStateList.getColorForState(getColorState(), -16777216));
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void bindBadge(@NotNull IndicatorDTO indicator, String badgeDescription) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        IndicatorView orCreateBadge = getOrCreateBadge();
        this.currentBadgeData = indicator;
        orCreateBadge.setVisibility(0);
        orCreateBadge.setContentDescription(badgeDescription);
        IndicatorHolderKt.bind$default(orCreateBadge, indicator, null, 2, null);
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void cancelAnimation() {
        getAnimatedIconView().cancelAnimation();
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    @NotNull
    public LottieAnimationView getAnimatedIconView() {
        return this.animatedIconView;
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public Integer getAnimationId() {
        return this.animationId;
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    /* renamed from: getBadgeData, reason: from getter */
    public IndicatorDTO getCurrentBadgeData() {
        return this.currentBadgeData;
    }

    @NotNull
    public TabIconColor getIconColor() {
        return this.iconColor;
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    /* renamed from: isAnimationCompleted, reason: from getter */
    public boolean getIsAnimationCompleted() {
        return this.isAnimationCompleted;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        cancelAnimation();
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        updateBadgePosition();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.maxTabWidth < View.MeasureSpec.getSize(widthMeasureSpec)) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.maxTabWidth, View.MeasureSpec.getMode(widthMeasureSpec));
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void playAnimationIfExists() {
        Integer animationId = getAnimationId();
        if (animationId == null) {
            setRegularIconTab();
        } else {
            setAnimatedTab(animationId.intValue());
            getAnimatedIconView().playAnimation();
        }
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void removeBadge(String badgeDescription) {
        this.currentBadgeData = null;
        IndicatorView indicatorView = this.badgeView;
        if (indicatorView != null) {
            indicatorView.setVisibility(8);
            indicatorView.setContentDescription(badgeDescription);
        }
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setAnimation(Integer animationId) {
        setAnimationId(animationId);
    }

    public void setAnimationCompleted(boolean z11) {
        this.isAnimationCompleted = z11;
    }

    public void setAnimationId(Integer num) {
        this.animationId = num;
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setBadgeTopOffset(int badgeVerticalOffset) {
        this.badgeVerticalOffset = badgeVerticalOffset;
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setChecked(@NotNull MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (this.isChecked == menuItem.isChecked()) {
            return;
        }
        boolean isChecked = menuItem.isChecked();
        this.isChecked = isChecked;
        setSelected(isChecked);
        updateLabelColor();
        updateIconColor(getIconColor());
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setIcon(Drawable iconDrawable) {
        Drawable drawable;
        Drawable newDrawable;
        if (iconDrawable == this.originalIconDrawable) {
            return;
        }
        this.originalIconDrawable = iconDrawable;
        if (iconDrawable instanceof VectorDrawable) {
            Drawable.ConstantState constantState = ((VectorDrawable) iconDrawable).getConstantState();
            if (constantState != null && (newDrawable = constantState.newDrawable()) != null) {
                iconDrawable = newDrawable;
            }
            drawable = iconDrawable.mutate();
            a.j(drawable, getIconColor().getColorTintList());
        } else {
            drawable = null;
        }
        this.iconView.setImageDrawable(drawable);
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setIconColor(@NotNull TabIconColor value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.iconColor = value;
        tintAnimationIcon(value.getUncheckedColor(this.uncheckedState));
        updateIconColor(value);
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setLabel(@NotNull CharSequence label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.labelView.setText(label);
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setLabelColor(@NotNull ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(colorStateList, "colorStateList");
        this.labelColorStateList = colorStateList;
        updateLabelColor();
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setLabelTextAppearance(int resId) {
        this.labelView.setTextAppearance(resId);
    }

    @Override // ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView
    public void setLabelVisibility(int mode) {
        int i11 = 0;
        boolean z11 = mode == 1;
        d dVar = new d();
        dVar.p(this);
        if (z11) {
            ConstraintSetExtKt.clearBottom(dVar, this.iconView.getId());
            i11 = this.iconLabeledTopMargin;
        } else {
            dVar.s(this.iconView.getId(), 4, 0, 4);
        }
        dVar.f(this);
        setTopMargin(this.iconView, i11);
        ViewExtKt.showOrGone(this.labelView, Boolean.valueOf(z11));
    }
}
