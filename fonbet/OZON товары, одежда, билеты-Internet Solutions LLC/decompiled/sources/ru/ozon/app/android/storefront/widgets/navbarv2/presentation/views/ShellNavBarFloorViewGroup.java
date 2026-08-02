package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.views;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.navBar.v2.NavbarIconVO;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo.ShellNavBarHorizontalPaddings;
import ru.ozon.app.android.storefrontcommonwidgets.redesignedsearchbar.RedesignedSearchBarInterface;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 J2\u00020\u0001:\u0003JKLB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0014J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J0\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0014J\u0012\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0007H\u0016J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u000200H\u0016J\u000e\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u0017J\u0016\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0010J\u0006\u00106\u001a\u00020!J\"\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u0001092\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010;J\"\u0010<\u001a\u00020!2\u0006\u0010/\u001a\u0002002\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>J\u0010\u0010@\u001a\u00020!2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0018\u0010A\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0002J\b\u0010B\u001a\u00020!H\u0002J\u0018\u0010C\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\b\u0010@\u001a\u00020!H\u0002J\b\u0010D\u001a\u00020\u0007H\u0002J\b\u0010E\u001a\u00020\u0007H\u0002J\b\u0010F\u001a\u00020\u0014H\u0002J \u0010G\u001a\u00020\u000b2\u0006\u00108\u001a\u0002092\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010;H\u0002J\f\u0010H\u001a\u00020\u0007*\u00020\rH\u0002J$\u0010I\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010/\u001a\u000200H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "defaultView", "Landroid/view/View;", "rightViews", "", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup$ViewData;", "horizontalPaddings", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;", "isRedesignedSearchBar", "", "isSearchBar", "currentGravity", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup$Gravity;", "rightViewsWidth", "backButtonWidth", "minimumHeight", "generateLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "lp", "checkLayoutParams", "layoutParams", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "left", "top", "right", "bottom", "removeView", "view", "setMinimumHeight", "minHeight", "setAlpha", "alpha", "", "setGravity", "gravity", "setView", "index", "viewData", "setRedesignedSearchBar", "setBackButtonView", "dto", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "trackClick", "Lkotlin/Function0;", "updateBackButtonOnScroll", "startColor", "", "endColor", "resolvePaddings", "measureChild", "layoutDefaultView", "getDefaultViewUsedWidth", "getDefaultLeftPadding", "getDefaultRightPadding", "isRedesignedSearch", "createBackButton", "getHorizontalTop", "generateIconColor", "Companion", "Gravity", "ViewData", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarFloorViewGroup extends ViewGroup {
    private IconButtonV3View backButtonView;
    private int backButtonWidth;

    @NotNull
    private Gravity currentGravity;
    private View defaultView;
    private ShellNavBarHorizontalPaddings horizontalPaddings;
    private boolean isRedesignedSearchBar;
    private boolean isSearchBar;
    private int minimumHeight;

    @NotNull
    private final List<ViewData> rightViews;
    private int rightViewsWidth;
    public static final int $stable = 8;
    private static final int defaultPadding = UiExtKt.toPx(Paddings.PADDING_500.getPx());
    private static final int defaultSearchBarRedesignPadding = UiExtKt.toPx(Paddings.PADDING_300.getPx());
    private static final int sidePaddingForIcon = UiExtKt.toPx(Paddings.PADDING_250.getPx());
    private static final int intermediateMargin = UiExtKt.toPx(8);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup$Gravity;", "", "<init>", "(Ljava/lang/String;I)V", "START", "CENTER", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gravity {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Gravity[] $VALUES;
        public static final Gravity START = new Gravity("START", 0);
        public static final Gravity CENTER = new Gravity("CENTER", 1);

        private static final /* synthetic */ Gravity[] $values() {
            return new Gravity[]{START, CENTER};
        }

        static {
            Gravity[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Gravity(String str, int i11) {
        }

        public static Gravity valueOf(String str) {
            return (Gravity) Enum.valueOf(Gravity.class, str);
        }

        public static Gravity[] values() {
            return (Gravity[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/views/ShellNavBarFloorViewGroup$ViewData;", "", "", "placeholderKey", "Landroid/view/View;", "view", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "viewObject", "<init>", "(Ljava/lang/String;Landroid/view/View;Ll20/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholderKey", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Ll20/c;", "getViewObject", "()Ll20/c;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewData {

        @NotNull
        private final String placeholderKey;

        @NotNull
        private final View view;

        @NotNull
        private final c viewObject;

        public ViewData(@NotNull String placeholderKey, @NotNull View view, @NotNull c viewObject) {
            Intrinsics.checkNotNullParameter(placeholderKey, "placeholderKey");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewObject, "viewObject");
            this.placeholderKey = placeholderKey;
            this.view = view;
            this.viewObject = viewObject;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewData)) {
                return false;
            }
            ViewData viewData = (ViewData) other;
            return Intrinsics.d(this.placeholderKey, viewData.placeholderKey) && Intrinsics.d(this.view, viewData.view) && Intrinsics.d(this.viewObject, viewData.viewObject);
        }

        @NotNull
        public final String getPlaceholderKey() {
            return this.placeholderKey;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        @NotNull
        public final c getViewObject() {
            return this.viewObject;
        }

        public int hashCode() {
            return this.viewObject.hashCode() + ((this.view.hashCode() + (this.placeholderKey.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "ViewData(placeholderKey=" + this.placeholderKey + ", view=" + this.view + ", viewObject=" + this.viewObject + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gravity.values().length];
            try {
                iArr[Gravity.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gravity.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ShellNavBarFloorViewGroup(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final IconButtonV3View createBackButton(IconButtonV3DTO dto, Function0<Unit> trackClick) {
        IconButtonV3View iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), getContext());
        if (iconButtonV3View2 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        } else {
            iconButtonV3View = iconButtonV3View2;
        }
        iconButtonV3View.setId(R$id.backButton);
        iconButtonV3View.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        IconButtonV3HolderKt.bind$default(iconButtonV3View, dto, null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(iconButtonV3View, 0L, new ShellNavBarFloorViewGroup$createBackButton$1$1(trackClick, iconButtonV3View), 1, null);
        return iconButtonV3View;
    }

    private final int generateIconColor(String startColor, String endColor, float alpha) {
        if (startColor == null && endColor == null) {
            return UniColors.GRAPHIC_TERTIARY.getResId();
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UniColors uniColors = UniColors.GRAPHIC_TERTIARY;
        int parseColor = styleParser.parseColor(context, startColor, uniColors.getResId());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return androidx.core.graphics.c.b(alpha, styleParser.parseColor(context2, endColor, uniColors.getResId()), parseColor);
    }

    private final int getDefaultLeftPadding() {
        return (this.backButtonView != null || isRedesignedSearch()) ? sidePaddingForIcon : defaultPadding;
    }

    private final int getDefaultRightPadding() {
        ViewData viewData = (ViewData) C7714v.Z(this.rightViews);
        return (((viewData != null ? viewData.getViewObject() : null) instanceof NavbarIconVO) || this.backButtonView != null) ? sidePaddingForIcon : isRedesignedSearch() ? defaultSearchBarRedesignPadding : defaultPadding;
    }

    private final int getDefaultViewUsedWidth(int rightViewsWidth, int backButtonWidth) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.currentGravity.ordinal()];
        if (i11 == 1) {
            return rightViewsWidth + backButtonWidth;
        }
        if (i11 == 2) {
            return Math.max(rightViewsWidth, backButtonWidth) * 2;
        }
        throw new o();
    }

    private final int getHorizontalTop(View view) {
        if (view.getParent() == null) {
            return 0;
        }
        ViewParent parent = view.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return (((ViewGroup) parent).getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
    }

    private final boolean isRedesignedSearch() {
        return this.isSearchBar && this.isRedesignedSearchBar;
    }

    private final void layoutDefaultView() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.currentGravity.ordinal()];
        if (i11 == 1) {
            IconButtonV3View iconButtonV3View = this.backButtonView;
            int right = iconButtonV3View != null ? iconButtonV3View.getRight() + intermediateMargin : getPaddingLeft();
            View view = this.defaultView;
            int horizontalTop = view != null ? getHorizontalTop(view) : 0;
            View view2 = this.defaultView;
            if (view2 != null) {
                LayoutExtKt.layoutLeftTop(view2, right, horizontalTop);
                return;
            }
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        int measuredWidth = getMeasuredWidth() / 2;
        View view3 = this.defaultView;
        int measuredWidth2 = measuredWidth - ((view3 != null ? view3.getMeasuredWidth() : 0) / 2);
        View view4 = this.defaultView;
        if (view4 != null) {
            LayoutExtKt.layoutLeftTop(view4, measuredWidth2, view4 != null ? getHorizontalTop(view4) : 0);
        }
    }

    private final int measureChild(int widthMeasureSpec, int heightMeasureSpec) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (ViewData viewData : this.rightViews) {
            measureChildWithMargins(viewData.getView(), widthMeasureSpec, 0, heightMeasureSpec, 0);
            i13 = Math.max(i13, viewData.getView().getMeasuredHeight());
            i12 += viewData.getView().getMeasuredWidth();
        }
        this.rightViewsWidth = i12;
        if (i12 != 0) {
            this.rightViewsWidth = i12 + intermediateMargin;
        }
        IconButtonV3View iconButtonV3View = this.backButtonView;
        if (iconButtonV3View != null) {
            measureChildWithMargins(iconButtonV3View, widthMeasureSpec, 0, heightMeasureSpec, 0);
            i13 = Math.max(i13, iconButtonV3View.getMeasuredHeight());
            i11 = iconButtonV3View.getMeasuredWidth() + intermediateMargin;
        }
        this.backButtonWidth = i11;
        View view = this.defaultView;
        if (view == null) {
            return i13;
        }
        measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(widthMeasureSpec), 1073741824), getDefaultViewUsedWidth(this.rightViewsWidth, this.backButtonWidth), heightMeasureSpec, 0);
        return Math.max(i13, view.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setBackButtonView$default(ShellNavBarFloorViewGroup shellNavBarFloorViewGroup, IconButtonV3DTO iconButtonV3DTO, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        shellNavBarFloorViewGroup.setBackButtonView(iconButtonV3DTO, function0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return new ViewGroup.MarginLayoutParams(lp);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        IconButtonV3View iconButtonV3View = this.backButtonView;
        if (iconButtonV3View != null) {
            int paddingLeft = getPaddingLeft();
            IconButtonV3View iconButtonV3View2 = this.backButtonView;
            LayoutExtKt.layoutLeftTop(iconButtonV3View, paddingLeft, iconButtonV3View2 != null ? getHorizontalTop(iconButtonV3View2) : 0);
        }
        layoutDefaultView();
        List<ViewData> v11 = C7714v.v(this.rightViews);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        for (ViewData viewData : v11) {
            LayoutExtKt.layoutLeftTop(viewData.getView(), measuredWidth - viewData.getView().getMeasuredWidth(), getHorizontalTop(viewData.getView()));
            measuredWidth -= viewData.getView().getMeasuredWidth();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        resolvePaddings();
        int paddingTop = getPaddingTop() + getPaddingBottom() + measureChild(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((mode == Integer.MIN_VALUE || mode == 0) ? Math.max(0, this.minimumHeight) : paddingTop, paddingTop), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Intrinsics.d(this.defaultView, view)) {
            this.defaultView = null;
            return;
        }
        if (Intrinsics.d(this.backButtonView, view)) {
            this.backButtonView = null;
            return;
        }
        for (ViewData viewData : C7714v.z0(this.rightViews)) {
            if (Intrinsics.d(viewData.getView(), view)) {
                this.rightViews.remove(viewData);
            }
        }
    }

    public final void resolvePaddings(ShellNavBarHorizontalPaddings horizontalPaddings) {
        this.horizontalPaddings = horizontalPaddings;
    }

    @Override // android.view.View
    public void setAlpha(float alpha) {
        super.setAlpha(alpha);
        setVisibility((alpha > 0.05f ? 1 : (alpha == 0.05f ? 0 : -1)) < 0 ? 4 : 0);
    }

    public final void setBackButtonView(IconButtonV3DTO dto, Function0<Unit> trackClick) {
        if (dto == null) {
            removeView(this.backButtonView);
            this.backButtonView = null;
        } else {
            if (this.backButtonView != null) {
                return;
            }
            IconButtonV3View createBackButton = createBackButton(dto, trackClick);
            this.backButtonView = createBackButton;
            addView(createBackButton);
        }
    }

    public final void setGravity(@NotNull Gravity gravity) {
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        if (this.currentGravity == gravity) {
            return;
        }
        this.currentGravity = gravity;
        requestLayout();
    }

    @Override // android.view.View
    public void setMinimumHeight(int minHeight) {
        this.minimumHeight = minHeight;
    }

    public final void setRedesignedSearchBar() {
        this.isRedesignedSearchBar = true;
    }

    public final void setView(int index, @NotNull ViewData viewData) {
        Intrinsics.checkNotNullParameter(viewData, "viewData");
        this.isSearchBar = viewData.getView() instanceof RedesignedSearchBarInterface;
        if (h.A(viewData.getPlaceholderKey(), "Default", false)) {
            this.defaultView = viewData.getView();
            addView(viewData.getView());
        } else if (h.A(viewData.getPlaceholderKey(), "Right", false)) {
            this.rightViews.add(index, viewData);
            addView(viewData.getView());
        }
    }

    public final void updateBackButtonOnScroll(float alpha, String startColor, String endColor) {
        IconButtonV3View iconButtonV3View = this.backButtonView;
        if (iconButtonV3View == null) {
            return;
        }
        if (alpha <= 0.6f) {
            alpha = 0.0f;
        }
        if (iconButtonV3View != null) {
            iconButtonV3View.setIconColor(generateIconColor(startColor, endColor, alpha));
        }
        IconButtonV3View iconButtonV3View2 = this.backButtonView;
        if (iconButtonV3View2 != null) {
            iconButtonV3View2.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShellNavBarFloorViewGroup(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rightViews = new ArrayList();
        this.currentGravity = Gravity.START;
    }

    private final void resolvePaddings() {
        Paddings rightPadding;
        Paddings leftPadding;
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings = this.horizontalPaddings;
        int defaultLeftPadding = (shellNavBarHorizontalPaddings == null || (leftPadding = shellNavBarHorizontalPaddings.getLeftPadding()) == null) ? getDefaultLeftPadding() : UiExtKt.toPx(leftPadding.getPx());
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings2 = this.horizontalPaddings;
        int defaultRightPadding = (shellNavBarHorizontalPaddings2 == null || (rightPadding = shellNavBarHorizontalPaddings2.getRightPadding()) == null) ? getDefaultRightPadding() : UiExtKt.toPx(rightPadding.getPx());
        if (defaultLeftPadding == getPaddingLeft() && defaultRightPadding == getPaddingRight()) {
            return;
        }
        setPadding(defaultLeftPadding, 0, defaultRightPadding, 0);
    }
}
