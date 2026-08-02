package ru.ozon.uni.android.atom.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.controls.common.ButtonImageView;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u009b\u00012\u00020\u00012\u00020\u0002:\u0002\u009b\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010\u0013R*\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010%R*\u00105\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\"R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00106\u001a\u0004\bB\u00108\"\u0004\bC\u0010\"R.\u0010D\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010J\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u00106\u001a\u0004\bK\u00108\"\u0004\bL\u0010\"R*\u0010M\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u00106\u001a\u0004\bN\u00108\"\u0004\bO\u0010\"R\"\u0010P\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u00108\"\u0004\bR\u0010\"R,\u0010V\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u00110T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR*\u0010[\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u00106\u001a\u0004\b\\\u00108\"\u0004\b]\u0010\"R$\u0010_\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR.\u0010r\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010E\u001a\u0004\bs\u0010G\"\u0004\bt\u0010IR.\u0010u\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010E\u001a\u0004\bv\u0010G\"\u0004\bw\u0010IR.\u0010y\u001a\u0004\u0018\u00010x2\b\u0010)\u001a\u0004\u0018\u00010x8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010ER\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010ER\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u00101R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R/\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010)\u001a\u0005\u0018\u00010\u008c\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R/\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010)\u001a\u0005\u0018\u00010\u008c\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u008e\u0001\"\u0006\b\u0093\u0001\u0010\u0090\u0001R/\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010)\u001a\u0005\u0018\u00010\u0095\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009c\u0001"}, d2 = {"Lru/ozon/uni/android/atom/tabs/TabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "constraintViews", "()V", "Landroidx/constraintlayout/widget/d;", "constraintTitle", "(Landroidx/constraintlayout/widget/d;)V", "constraintSubtitle", "(Landroidx/constraintlayout/widget/d;)Lkotlin/Unit;", "constraintIndicator", "constraintBadge", "constraintIcon", "createSubtitle", "createIndicator", "addBadge", "addIcon", "isSelected", "changeSelectedState", "(Z)V", "styleRes", "applyStyle", "(I)V", "setTabColors", "setShadowColor", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "style", "I", "getStyle", "()I", "setStyle", "tabSelected", "Z", "getTabSelected", "()Z", "setTabSelected", "Lkotlin/Function0;", "onSelectedListener", "Lkotlin/jvm/functions/Function0;", "getOnSelectedListener", "()Lkotlin/jvm/functions/Function0;", "setOnSelectedListener", "(Lkotlin/jvm/functions/Function0;)V", "hideSubtitle", "getHideSubtitle", "setHideSubtitle", "iconColor", "Ljava/lang/Integer;", "getIconColor", "()Ljava/lang/Integer;", "setIconColor", "(Ljava/lang/Integer;)V", "hasBadge", "getHasBadge$uni_release", "setHasBadge$uni_release", "hasIndicator", "getHasIndicator$uni_release", "setHasIndicator$uni_release", "isSelectionDisabled", "isSelectionDisabled$uni_release", "setSelectionDisabled$uni_release", "", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializers", "Ljava/util/Map;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "roundCorners", "getRoundCorners$uni_release", "setRoundCorners$uni_release", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadgeView$uni_release", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "setBadgeView$uni_release", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "indicatorView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "getIndicatorView$uni_release", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "setIndicatorView$uni_release", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;)V", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "subtitleView", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "iconView", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "titleColor", "getTitleColor", "setTitleColor", "subtitleColor", "getSubtitleColor", "setSubtitleColor", "Lru/ozon/uni/android/uikitsdk/Color;", "bgSelected", "Lru/ozon/uni/android/uikitsdk/Color;", "getBgSelected", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBgSelected", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "titleColorSelected", "subtitleColorSelected", "", "tabElevation", "F", "atomMargin", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "Lru/ozon/uni/android/atom/tabs/TabShadowOutlineProvider;", "tabOutlineProvider", "Lru/ozon/uni/android/atom/tabs/TabShadowOutlineProvider;", "", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "getSubtitle", "setSubtitle", "subtitle", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getIcon", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setIcon", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "icon", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabView extends ConstraintLayout implements AtomLocatableView {
    private final int atomMargin;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private BadgeView badgeView;
    private Color bgSelected;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private boolean hasBadge;
    private boolean hasIndicator;
    private boolean hideSubtitle;
    private Integer iconColor;
    private ButtonImageView iconView;
    private IndicatorView indicatorView;
    private boolean isSelectionDisabled;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;
    private Function0<Unit> onSelectedListener;
    private boolean roundCorners;
    private int style;
    private Integer subtitleColor;
    private Integer subtitleColorSelected;
    private ButtonTextView subtitleView;
    private final float tabElevation;

    @NotNull
    private final TabShadowOutlineProvider tabOutlineProvider;
    private boolean tabSelected;
    private Integer titleColor;
    private Integer titleColorSelected;

    @NotNull
    private final TextView titleView;
    public static final int $stable = 8;

    public /* synthetic */ TabView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Tab_Base : i12);
    }

    private final void addBadge() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        badgeView.setId(R$id.tabBadge);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(badgeView.getId()));
        if (function1 != null) {
            function1.invoke(badgeView);
        }
        addView(badgeView, new ConstraintLayout.b(0, -2));
        this.badgeView = badgeView;
        d dVar = new d();
        dVar.p(this);
        constraintBadge(dVar);
        dVar.f(this);
    }

    private final void addIcon() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonImageView buttonImageView = new ButtonImageView(context, null, 0, 6, null);
        buttonImageView.setId(R$id.tabIcon);
        buttonImageView.setIconColor(a.getColor(buttonImageView.getContext(), UniColors.GRAPHIC_TERTIARY.getResId()));
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonImageView.getId()));
        if (function1 != null) {
            function1.invoke(buttonImageView);
        }
        int px = UiExtKt.toPx(20);
        addView(buttonImageView, new ConstraintLayout.b(px, px));
        this.iconView = buttonImageView;
        d dVar = new d();
        dVar.p(this);
        constraintIcon(dVar);
        dVar.f(this);
    }

    private final void applyStyle(int styleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(styleRes, R$styleable.TabView);
        Intrinsics.f(obtainStyledAttributes);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBgSelected(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.TabView_backgroundSelectedGradient, R$styleable.TabView_backgroundSelected, -1));
        setTitleColor(Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_titleTextColor, -1)));
        setSubtitleColor(Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_subtitleTextColor, -1)));
        this.titleColorSelected = Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_titleTextColorSelected, -1));
        this.subtitleColorSelected = Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_subtitleTextColorSelected, -1));
        if (styleRes == R$style.Tab_Accent) {
            setHideSubtitle(true);
        }
        setTabColors(this.tabSelected);
        obtainStyledAttributes.recycle();
    }

    private final void changeSelectedState(boolean isSelected) {
        Function0<Unit> function0;
        setSelected(isSelected);
        setTabColors(isSelected);
        if (!isSelected || (function0 = this.onSelectedListener) == null) {
            return;
        }
        function0.invoke();
    }

    private final Unit constraintBadge(d dVar) {
        BadgeView badgeView = this.badgeView;
        if (badgeView == null) {
            return null;
        }
        int id2 = badgeView.getId();
        ConstraintSetExtKt.constraintVerticallyRelativeTo(dVar, id2, R$id.tabTitle);
        ConstraintSetExtKt.addToPackedHorizontalChain$default(dVar, id2, 0, this.titleView.getId(), 2, null);
        dVar.e0(id2, 7, this.atomMargin);
        dVar.y(id2, UiExtKt.toPx(20));
        dVar.v(id2, 1);
        return Unit.f71690a;
    }

    private final Unit constraintIcon(d dVar) {
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView == null) {
            return null;
        }
        int id2 = buttonImageView.getId();
        ConstraintSetExtKt.constraintVerticallyRelativeTo(dVar, id2, R$id.tabTitle);
        ConstraintSetExtKt.addToPackedHorizontalChain$default(dVar, id2, 0, this.titleView.getId(), 2, null);
        dVar.e0(id2, 7, this.atomMargin);
        return Unit.f71690a;
    }

    private final Unit constraintIndicator(d dVar) {
        IndicatorView indicatorView = this.indicatorView;
        if (indicatorView == null) {
            return null;
        }
        int id2 = indicatorView.getId();
        ConstraintSetExtKt.constraintVerticallyRelativeTo(dVar, id2, R$id.tabTitle);
        ConstraintSetExtKt.addToPackedHorizontalChain$default(dVar, id2, this.titleView.getId(), 0, 4, null);
        dVar.e0(id2, 6, this.atomMargin);
        return Unit.f71690a;
    }

    private final Unit constraintSubtitle(d dVar) {
        ButtonTextView buttonTextView = this.subtitleView;
        if (buttonTextView == null) {
            return null;
        }
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, buttonTextView.getId(), this.titleView.getId());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, buttonTextView.getId());
        dVar.l(buttonTextView.getId());
        dVar.C(buttonTextView.getId(), true);
        dVar.c0(0.5f, buttonTextView.getId());
        return Unit.f71690a;
    }

    private final void constraintTitle(d dVar) {
        int id2 = this.titleView.getId();
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, id2, 0);
        dVar.C(id2, true);
        ConstraintSetExtKt.addToPackedHorizontalChain$default(dVar, id2, 0, 0, 6, null);
    }

    private final void constraintViews() {
        d dVar = new d();
        dVar.p(this);
        constraintTitle(dVar);
        constraintBadge(dVar);
        constraintIcon(dVar);
        constraintIndicator(dVar);
        constraintSubtitle(dVar);
        dVar.f(this);
    }

    private final void createIndicator() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IndicatorView indicatorView = new IndicatorView(context, null, 0, 0, 14, null);
        indicatorView.setId(R$id.tabIndicator);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(indicatorView.getId()));
        if (function1 != null) {
            function1.invoke(indicatorView);
        }
        addView(indicatorView, new ConstraintLayout.b(-2, -2));
        this.indicatorView = indicatorView;
        d dVar = new d();
        dVar.p(this);
        constraintIndicator(dVar);
        dVar.f(this);
    }

    private final void createSubtitle() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, ru.ozon.uni.core.R$style.OzonTextAppearance_Body_300xsmall);
        buttonTextView.setGravity(1);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(buttonTextView.getId()));
        if (function1 != null) {
            function1.invoke(buttonTextView);
        }
        addView(buttonTextView, new ConstraintLayout.b(0, -2));
        this.subtitleView = buttonTextView;
        d dVar = new d();
        dVar.p(this);
        constraintSubtitle(dVar);
        dVar.f(this);
    }

    private final void setShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            int shadowColor = this.tabOutlineProvider.getShadowColor();
            setOutlineAmbientShadowColor(shadowColor);
            setOutlineSpotShadowColor(shadowColor);
        }
    }

    private final void setTabColors(boolean isSelected) {
        if (isSelected && this.style == R$style.Tab_Base) {
            setOutlineProvider(this.tabOutlineProvider);
            setElevation(this.tabElevation);
        } else {
            setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            setElevation(0.0f);
        }
        if (isSelected) {
            Color color = this.bgSelected;
            if (color != null) {
                color.applyTo(this.backgroundDrawable);
            }
        } else {
            this.backgroundDrawable.setColor(0);
        }
        Integer num = isSelected ? this.titleColorSelected : this.titleColor;
        if (num != null) {
            this.titleView.setTextColor(num.intValue());
        }
        Integer num2 = isSelected ? this.subtitleColorSelected : this.subtitleColor;
        if (num2 != null) {
            int intValue = num2.intValue();
            ButtonTextView buttonTextView = this.subtitleView;
            if (buttonTextView != null) {
                buttonTextView.setTextColor(intValue);
            }
        }
    }

    /* renamed from: getBadgeView$uni_release, reason: from getter */
    public final BadgeView getBadgeView() {
        return this.badgeView;
    }

    /* renamed from: getIndicatorView$uni_release, reason: from getter */
    public final IndicatorView getIndicatorView() {
        return this.indicatorView;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.tabSelected) {
            return true;
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            setForeground(this.foregroundDrawable);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            setForeground(null);
            if (!this.isSelectionDisabled) {
                setTabSelected(true);
            }
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            setForeground(null);
        }
        return true;
    }

    public final void setBgSelected(Color color) {
        this.bgSelected = color;
        setTabColors(this.tabSelected);
    }

    public final void setHasBadge$uni_release(boolean z11) {
        this.hasBadge = z11;
        if (z11 && this.badgeView == null) {
            addBadge();
            ButtonImageView buttonImageView = this.iconView;
            if (buttonImageView != null) {
                buttonImageView.setVisibility(!this.hasBadge ? 0 : 8);
            }
        }
    }

    public final void setHasIndicator$uni_release(boolean z11) {
        this.hasIndicator = z11;
        if (z11 && this.indicatorView == null) {
            createIndicator();
        }
    }

    public final void setHideSubtitle(boolean z11) {
        this.hideSubtitle = z11;
        ButtonTextView buttonTextView = this.subtitleView;
        if (buttonTextView != null) {
            buttonTextView.setVisibility(!z11 ? 0 : 8);
        }
    }

    public final void setIcon(DrawableResource drawableResource) {
        if (this.iconView == null && drawableResource != null && !this.hasBadge) {
            addIcon();
        }
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView != null) {
            buttonImageView.setDrawableResource(drawableResource);
            buttonImageView.setVisibility(!this.hasBadge ? 0 : 8);
        }
    }

    public final void setIconColor(Integer num) {
        this.iconColor = num;
        if (num != null) {
            int intValue = num.intValue();
            ButtonImageView buttonImageView = this.iconView;
            if (buttonImageView != null) {
                buttonImageView.setIconColor(intValue);
            }
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(R$id.tabTitle));
        if (function1 != null) {
            function1.invoke(this.titleView);
        }
    }

    public final void setOnSelectedListener(Function0<Unit> function0) {
        this.onSelectedListener = function0;
    }

    public final void setRoundCorners$uni_release(boolean z11) {
        this.roundCorners = z11;
        this.backgroundDrawable.setCornerRadius(UiExtKt.toPxF(z11 ? 19 : 14));
    }

    public final void setSelectionDisabled$uni_release(boolean z11) {
        this.isSelectionDisabled = z11;
    }

    public final void setStyle(int i11) {
        this.style = i11;
        applyStyle(i11);
    }

    public final void setSubtitle(CharSequence charSequence) {
        if (this.subtitleView == null && charSequence != null && charSequence.length() != 0) {
            createSubtitle();
        }
        ButtonTextView buttonTextView = this.subtitleView;
        if (buttonTextView != null) {
            buttonTextView.setVisibility(!this.hideSubtitle && charSequence != null && charSequence.length() != 0 ? 0 : 8);
            buttonTextView.setText(charSequence);
        }
    }

    public final void setSubtitleColor(Integer num) {
        this.subtitleColor = num;
        this.subtitleColorSelected = num;
        setTabColors(this.tabSelected);
    }

    public final void setTabSelected(boolean z11) {
        this.tabSelected = z11;
        changeSelectedState(z11);
    }

    public final void setTitle(CharSequence charSequence) {
        this.titleView.setText(charSequence);
    }

    public final void setTitleColor(Integer num) {
        this.titleColor = num;
        this.titleColorSelected = num;
        setTabColors(this.tabSelected);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "tabView";
        this.style = R$style.Tab_Base;
        this.hideSubtitle = true;
        this.locatorInitializers = U.j(new Pair(Integer.valueOf(R$id.tabTitle), new TabView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.tabSubtitle), new TabView$locatorInitializers$2(this)), new Pair(Integer.valueOf(R$id.tabIndicator), new TabView$locatorInitializers$3(this)), new Pair(Integer.valueOf(R$id.tabBadge), new TabView$locatorInitializers$4(this)), new Pair(Integer.valueOf(R$id.tabIcon), new TabView$locatorInitializers$5(this)));
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        buttonTextView.setId(R$id.tabTitle);
        TextViewExtKt.applyStyle(buttonTextView, context, ru.ozon.uni.core.R$style.OzonTextAppearance_Body_500medium);
        this.titleView = buttonTextView;
        this.roundCorners = UniGlobalConfigKt.getRoundCornersFlag(context);
        this.tabElevation = UiExtKt.toPxF(4);
        this.atomMargin = UiExtKt.toPx(4);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(this.roundCorners ? 19 : 14));
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(a.getColor(context, UniColors.LAYER_OVERLAY_PARANJA.getResId()));
        gradientDrawable2.setCornerRadius(UiExtKt.toPxF(this.roundCorners ? 19 : 14));
        this.foregroundDrawable = gradientDrawable2;
        this.tabOutlineProvider = new TabShadowOutlineProvider(this.roundCorners ? 19 : 14);
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabView, i11, i12);
        setTitleColor(Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_titleTextColor, -1)));
        setSubtitleColor(Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_subtitleTextColor, -1)));
        this.titleColorSelected = Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_titleTextColorSelected, -1));
        this.subtitleColorSelected = Integer.valueOf(obtainStyledAttributes.getColor(R$styleable.TabView_subtitleTextColorSelected, -1));
        setBgSelected(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.TabView_backgroundSelectedGradient, R$styleable.TabView_backgroundSelected, -1));
        obtainStyledAttributes.recycle();
        setBackground(gradientDrawable);
        setContentDescription(getLocatorTag());
        int px = UiExtKt.toPx(8);
        setPadding(px, px, px, px);
        addView(buttonTextView, -2, -2);
        constraintViews();
        setShadowColor();
        setTabColors(this.tabSelected);
    }
}
