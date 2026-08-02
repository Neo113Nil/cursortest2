package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import RI.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.c;
import androidx.core.widget.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarColors;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.storefront.navBar.NavBarPlaceholderColors;
import ru.ozon.app.android.storefrontcommonwidgets.redesignedsearchbar.RedesignedSearchBarInterface;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002abB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010'\u001a\u00020(J>\u0010)\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020(0+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020(0+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020(0+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020(0+J\u0016\u0010/\u001a\u00020(2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201J(\u00103\u001a\u00020(2\b\u00104\u001a\u0004\u0018\u0001052\u0016\b\u0002\u00106\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020(\u0018\u000107J\u000e\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020\fJ\u000e\u0010;\u001a\u00020(2\u0006\u0010:\u001a\u00020\fJ\u001a\u0010<\u001a\u00020(2\b\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0001\u0010?\u001a\u00020\bJ\u000e\u0010@\u001a\u00020(2\u0006\u0010:\u001a\u00020\fJ\u0010\u0010A\u001a\u00020(2\b\u0010B\u001a\u0004\u0018\u000101J\u0010\u0010C\u001a\u00020(2\b\b\u0001\u0010D\u001a\u00020\bJ\u0018\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010HJ\u0010\u0010I\u001a\u00020(2\b\b\u0001\u0010J\u001a\u00020\bJ\u0010\u0010K\u001a\u00020(2\b\b\u0001\u0010L\u001a\u00020\bJ\u000e\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020\u0010J\u000e\u0010O\u001a\u00020(2\u0006\u0010F\u001a\u00020\u0010J \u0010P\u001a\u00020(2\u0006\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u0001012\u0006\u0010T\u001a\u00020\fJ\b\u0010U\u001a\u00020(H\u0002J\u0014\u0010V\u001a\u00020(*\u00020W2\u0006\u0010X\u001a\u00020\fH\u0002J$\u0010Y\u001a\u00020(2\u0006\u0010F\u001a\u00020\u00102\b\u0010Z\u001a\u0004\u0018\u0001012\b\u0010[\u001a\u0004\u0018\u000101H\u0002J$\u0010\\\u001a\u00020(2\u0006\u0010F\u001a\u00020\u00102\b\u0010Z\u001a\u0004\u0018\u0001012\b\u0010[\u001a\u0004\u0018\u000101H\u0002J$\u0010]\u001a\u00020(2\u0006\u0010F\u001a\u00020\u00102\b\u0010Z\u001a\u0004\u0018\u0001012\b\u0010[\u001a\u0004\u0018\u000101H\u0002J\u0012\u0010^\u001a\u00020(2\b\b\u0001\u0010_\u001a\u00020\bH\u0002J\b\u0010`\u001a\u00020(H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/storefrontcommonwidgets/redesignedsearchbar/RedesignedSearchBarInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isRedesigned", "", "iconPadding", "redesignedIconPadding", "containerRadius", "", "redesignedContainerRadius", "iconSize", "redesignedLayoutHeight", "pdpSearchIconSize", "betweenIconsPadding", "aiIconMarginEnd", "searchTextPaddingLeft", "searchTextPaddingRight", "edgeIconsPadding", "defaultBackgroundColor", "pdpShapeDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "searchTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "pdpSearchIcon", "Landroid/widget/ImageView;", "scanItView", "rightButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "photoSearchView", "backgroundDrawable", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarView$CustomDrawable;", "applyRedesign", "", "setClickListeners", "onSearchTextClick", "Lkotlin/Function0;", "onScanItClick", "onPhotoSearchClick", "onPdpSearchClick", "setSearchTextWithHint", "newText", "", "newHint", "bindRightButton", "dto", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "showOrGoneScanItIcon", "show", "showOrGonePhotoSearchIcon", "showOrGonePdpSearchIcon", "pdpSearchButton", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "pdpBackgroundColor", "showOrGoneSearchCompoundDraw", "setBackgroundColor", "newBackgroundColor", "setSearchTextColor", "textColor", "updateColorsByScroll", "blendPercentage", "dynamicColors", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "setSearchHintColor", "hintColor", "setSearchIconsTint", "iconsTint", "setCornerRadius", "radius", "updateQueryTextColor", "updateColorsForSelect", "searchBarColors", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors;", "remoteColor", "isHomePage", "updateIconMargins", "updateEdgePadding", "Landroid/view/View;", "isEdge", "updateBackgroundColors", "startColor", "endColor", "updatePlaceholderTextColor", "updateTintColors", "setLoupeColor", "iconsColor", "updateSearchTextEndMargin", "Companion", "CustomDrawable", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarView extends FrameLayout implements RedesignedSearchBarInterface {
    private final int aiIconMarginEnd;

    @NotNull
    private CustomDrawable backgroundDrawable;
    private final int betweenIconsPadding;
    private final float containerRadius;
    private final int defaultBackgroundColor;
    private final int edgeIconsPadding;
    private final int iconPadding;
    private final int iconSize;
    private boolean isRedesigned;

    @NotNull
    private final ImageView pdpSearchIcon;
    private final int pdpSearchIconSize;

    @NotNull
    private final ShapeDrawable pdpShapeDrawable;

    @NotNull
    private final ImageView photoSearchView;
    private final float redesignedContainerRadius;
    private final int redesignedIconPadding;
    private final int redesignedLayoutHeight;

    @NotNull
    private final IconButtonV3View rightButton;

    @NotNull
    private final ImageView scanItView;
    private final int searchTextPaddingLeft;
    private final int searchTextPaddingRight;

    @NotNull
    private final AppCompatTextView searchTextView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarView$Companion;", "", "<init>", "()V", "DEFAULT_BACKGROUND_COLOR_NAME", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarView$CustomDrawable;", "", "color", "", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CustomDrawable {
        private String color;

        @NotNull
        private final GradientDrawable drawable;

        public CustomDrawable(String str, @NotNull GradientDrawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.color = str;
            this.drawable = drawable;
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final GradientDrawable getDrawable() {
            return this.drawable;
        }

        public final void setColor(String str) {
            this.color = str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setLoupeColor(int iconsColor) {
        k.d(this.searchTextView, ColorStateList.valueOf(iconsColor));
    }

    private final void updateBackgroundColors(float blendPercentage, String startColor, String endColor) {
        int themeColor;
        int themeColor2;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, startColor);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, R$attr.bgLightKey);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context3, endColor);
        if (parseColor2 != null) {
            themeColor2 = parseColor2.intValue();
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            themeColor2 = ThemeExtKt.themeColor(context4, R$attr.bgPrimary);
        }
        setBackgroundColor(String.valueOf(c.b(blendPercentage, themeColor2, themeColor)));
    }

    private final void updateEdgePadding(View view, boolean z11) {
        view.setPadding(z11 ? this.edgeIconsPadding : this.betweenIconsPadding, view.getPaddingTop(), z11 ? this.betweenIconsPadding : this.edgeIconsPadding, view.getPaddingBottom());
    }

    private final void updateIconMargins() {
        boolean z11 = true;
        boolean z12 = this.rightButton.getVisibility() == 0;
        boolean z13 = this.photoSearchView.getVisibility() == 0;
        ImageView imageView = this.scanItView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd((z13 ? this.iconSize : 0) + (z12 ? this.iconSize : 0));
        imageView.setLayoutParams(layoutParams2);
        ImageView imageView2 = this.photoSearchView;
        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.setMarginEnd(z12 ? this.iconSize : 0);
        imageView2.setLayoutParams(layoutParams4);
        ImageView imageView3 = this.scanItView;
        if (!z12 && !z13) {
            z11 = false;
        }
        updateEdgePadding(imageView3, z11);
        updateEdgePadding(this.photoSearchView, z12);
    }

    private final void updatePlaceholderTextColor(float blendPercentage, String startColor, String endColor) {
        int themeColor;
        int themeColor2;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, startColor);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, R$attr.graphicTertiaryOnLight);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context3, endColor);
        if (parseColor2 != null) {
            themeColor2 = parseColor2.intValue();
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            themeColor2 = ThemeExtKt.themeColor(context4, R$attr.textTertiary);
        }
        this.searchTextView.setHintTextColor(c.b(blendPercentage, themeColor2, themeColor));
    }

    private final void updateSearchTextEndMargin() {
        AppCompatTextView appCompatTextView = this.searchTextView;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i11 = this.scanItView.getVisibility() == 0 ? 1 : 0;
        if (this.rightButton.getVisibility() == 0) {
            i11++;
        }
        if (this.photoSearchView.getVisibility() == 0) {
            i11++;
        }
        if (this.pdpSearchIcon.getVisibility() == 0) {
            i11++;
        }
        layoutParams2.setMarginEnd(i11 * this.iconSize);
        appCompatTextView.setLayoutParams(layoutParams2);
    }

    private final void updateTintColors(float blendPercentage, String startColor, String endColor) {
        int themeColor;
        int themeColor2;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, startColor);
        if (parseColor != null) {
            themeColor = parseColor.intValue();
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            themeColor = ThemeExtKt.themeColor(context2, R$attr.graphicTertiaryOnLight);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Integer parseColor2 = styleParser.parseColor(context3, endColor);
        if (parseColor2 != null) {
            themeColor2 = parseColor2.intValue();
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            themeColor2 = ThemeExtKt.themeColor(context4, R$attr.graphicTertiary);
        }
        setSearchIconsTint(c.b(blendPercentage, themeColor2, themeColor));
    }

    public final void applyRedesign() {
        this.isRedesigned = true;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.redesignedLayoutHeight;
        setLayoutParams(layoutParams);
        this.backgroundDrawable.getDrawable().setCornerRadius(this.redesignedContainerRadius);
        ImageView imageView = this.scanItView;
        imageView.setImageResource(R$drawable.ic_m_barcode_alt_filled);
        int i11 = this.redesignedIconPadding;
        imageView.setPadding(i11, i11, i11, i11);
        ImageView imageView2 = this.photoSearchView;
        imageView2.setImageResource(R$drawable.ic_m_photo_filled);
        int i12 = this.redesignedIconPadding;
        imageView2.setPadding(i12, i12, i12, i12);
        IconButtonV3View iconButtonV3View = this.rightButton;
        ViewGroup.LayoutParams layoutParams2 = iconButtonV3View.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.setMarginEnd(this.aiIconMarginEnd);
        iconButtonV3View.setLayoutParams(layoutParams3);
    }

    public final void bindRightButton(IconButtonV3DTO dto, Function1<? super AtomAction, Unit> action) {
        IconButtonV3HolderKt.bindOrGone(this.rightButton, dto, action);
        updateSearchTextEndMargin();
        updateIconMargins();
    }

    public final void setBackgroundColor(String newBackgroundColor) {
        int i11;
        if (Intrinsics.d(newBackgroundColor, this.backgroundDrawable.getColor())) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, newBackgroundColor);
        if (parseColor == null) {
            parseColor = newBackgroundColor != null ? h.w0(newBackgroundColor) : null;
            if (parseColor == null) {
                i11 = this.defaultBackgroundColor;
                this.backgroundDrawable.setColor(newBackgroundColor);
                this.backgroundDrawable.getDrawable().setColor(i11);
            }
        }
        i11 = parseColor.intValue();
        this.backgroundDrawable.setColor(newBackgroundColor);
        this.backgroundDrawable.getDrawable().setColor(i11);
    }

    public final void setClickListeners(@NotNull final Function0<Unit> onSearchTextClick, @NotNull final Function0<Unit> onScanItClick, @NotNull final Function0<Unit> onPhotoSearchClick, @NotNull Function0<Unit> onPdpSearchClick) {
        Intrinsics.checkNotNullParameter(onSearchTextClick, "onSearchTextClick");
        Intrinsics.checkNotNullParameter(onScanItClick, "onScanItClick");
        Intrinsics.checkNotNullParameter(onPhotoSearchClick, "onPhotoSearchClick");
        Intrinsics.checkNotNullParameter(onPdpSearchClick, "onPdpSearchClick");
        this.searchTextView.setOnClickListener(new View.OnClickListener() { // from class: RI.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0.this.invoke();
            }
        });
        this.scanItView.setOnClickListener(new View.OnClickListener() { // from class: RI.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0.this.invoke();
            }
        });
        this.photoSearchView.setOnClickListener(new View.OnClickListener() { // from class: RI.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0.this.invoke();
            }
        });
        this.pdpSearchIcon.setOnClickListener(new d(onPdpSearchClick, 0));
    }

    public final void setCornerRadius(float radius) {
        this.backgroundDrawable.getDrawable().setCornerRadius(radius);
    }

    public final void setSearchHintColor(int hintColor) {
        this.searchTextView.setHintTextColor(hintColor);
    }

    public final void setSearchIconsTint(int iconsTint) {
        ThemeExtKt.tint(this.photoSearchView, Integer.valueOf(iconsTint));
        ThemeExtKt.tint(this.scanItView, Integer.valueOf(iconsTint));
        setLoupeColor(iconsTint);
    }

    public final void setSearchTextColor(int textColor) {
        this.searchTextView.setTextColor(textColor);
    }

    public final void setSearchTextWithHint(@NotNull String newText, @NotNull String newHint) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        Intrinsics.checkNotNullParameter(newHint, "newHint");
        AppCompatTextView appCompatTextView = this.searchTextView;
        if (!Intrinsics.d(appCompatTextView.getText(), newText)) {
            appCompatTextView.setText(newText);
        }
        if (Intrinsics.d(appCompatTextView.getHint(), newHint)) {
            return;
        }
        appCompatTextView.setHint(newHint);
    }

    public final void showOrGonePdpSearchIcon(SearchBarVO.SearchButton pdpSearchButton, int pdpBackgroundColor) {
        TestInfo testInfo;
        Icon icon;
        Icon icon2;
        boolean z11 = pdpSearchButton != null;
        boolean z12 = (this.pdpSearchIcon.getVisibility() == 0) != z11;
        this.pdpShapeDrawable.getPaint().setColor(pdpBackgroundColor);
        ImageView imageView = this.pdpSearchIcon;
        imageView.setVisibility(z11 ? 0 : 8);
        imageView.setBackground(this.pdpShapeDrawable);
        String str = null;
        ImageViewExtKt.load$default(imageView, (pdpSearchButton == null || (icon2 = pdpSearchButton.getIcon()) == null) ? null : icon2.getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, (pdpSearchButton == null || (icon = pdpSearchButton.getIcon()) == null) ? null : icon.getTintColor()));
        if (pdpSearchButton != null && (testInfo = pdpSearchButton.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        imageView.setContentDescription(str);
        if (z12) {
            updateSearchTextEndMargin();
        }
    }

    public final void showOrGonePhotoSearchIcon(boolean show) {
        if ((this.photoSearchView.getVisibility() == 0) != show) {
            this.photoSearchView.setVisibility(show ? 0 : 8);
            updateSearchTextEndMargin();
            updateIconMargins();
        }
    }

    public final void showOrGoneScanItIcon(boolean show) {
        if ((this.scanItView.getVisibility() == 0) != show) {
            this.scanItView.setVisibility(show ? 0 : 8);
            updateSearchTextEndMargin();
            updateIconMargins();
        }
    }

    public final void showOrGoneSearchCompoundDraw(boolean show) {
        if (show) {
            TextViewExtKt.setVectorDrawableStart(this.searchTextView, this.isRedesigned ? R$drawable.ic_m_search_filled_compact : R$drawable.ic_s_search_filled);
        } else {
            TextViewExtKt.clearVectorDrawables(this.searchTextView);
        }
    }

    public final void updateColorsByScroll(float blendPercentage, SearchBarDTO.DynamicOnScrollColors dynamicColors) {
        float f7 = blendPercentage <= 0.6f ? 0.0f : blendPercentage;
        updateBackgroundColors(blendPercentage, dynamicColors != null ? dynamicColors.getBackgroundColorExpanded() : null, dynamicColors != null ? dynamicColors.getBackgroundColorCollapsed() : null);
        updatePlaceholderTextColor(f7, dynamicColors != null ? dynamicColors.getPlaceholderTextColorExpanded() : null, dynamicColors != null ? dynamicColors.getPlaceholderTextColorCollapsed() : null);
        updateTintColors(f7, dynamicColors != null ? dynamicColors.getIconTintColorExpanded() : null, dynamicColors != null ? dynamicColors.getIconTintColorCollapsed() : null);
    }

    public final void updateColorsForSelect(@NotNull SearchBarColors searchBarColors, String remoteColor, boolean isHomePage) {
        Intrinsics.checkNotNullParameter(searchBarColors, "searchBarColors");
        String searchBarBackgroundColor = searchBarColors.getSearchBarBackgroundColor(remoteColor, isHomePage);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, searchBarBackgroundColor);
        if (parseColor != null) {
            this.backgroundDrawable.getDrawable().setColor(parseColor.intValue());
            setSearchHintColor(searchBarColors.getHintColor(isHomePage));
            setSearchIconsTint(searchBarColors.getIconColor(remoteColor, isHomePage));
        }
    }

    public final void updateQueryTextColor(float blendPercentage) {
        this.searchTextView.setTextColor(c.b(blendPercentage, getContext().getColor(UniColors.TEXT_PRIMARY.getResId()), getContext().getColor(UniColors.TEXT_PRIMARY_ON_DARK.getResId())));
    }

    public /* synthetic */ SearchBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12);
        this.iconPadding = px;
        this.redesignedIconPadding = ResourceExtKt.toPx(8);
        float pxF = ResourceExtKt.toPxF(12);
        this.containerRadius = pxF;
        this.redesignedContainerRadius = ResourceExtKt.toPxF(16);
        int px2 = ResourceExtKt.toPx(40);
        this.iconSize = px2;
        this.redesignedLayoutHeight = ResourceExtKt.toPx(48);
        int px3 = ResourceExtKt.toPx(28);
        this.pdpSearchIconSize = px3;
        int px4 = ResourceExtKt.toPx(4);
        this.betweenIconsPadding = px4;
        this.aiIconMarginEnd = ResourceExtKt.toPx(4);
        int px5 = ResourceExtKt.toPx(6);
        this.searchTextPaddingLeft = px5;
        int px6 = ResourceExtKt.toPx(10);
        this.searchTextPaddingRight = px6;
        this.edgeIconsPadding = ResourceExtKt.toPx(8);
        int themeColor = ThemeExtKt.themeColor(context, NavBarPlaceholderColors.BACKGROUND_SECONDARY.getValue());
        this.defaultBackgroundColor = themeColor;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.pdpShapeDrawable = shapeDrawable;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.searchTv);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMarginEnd(px2 * 2);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setCompoundDrawablePadding(ResourceExtKt.toPx(8));
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setGravity(8388627);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L);
        appCompatTextView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        appCompatTextView.setPadding(px5, appCompatTextView.getPaddingTop(), px6, appCompatTextView.getPaddingBottom());
        this.searchTextView = appCompatTextView;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.pdpSearchIv);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(shapeDrawable);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(px3, px3, 8388629));
        this.pdpSearchIcon = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(R$id.scanItIv);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(px2, px2, 8388629));
        imageView2.setImageResource(R$drawable.ic_s_barcode);
        imageView2.setPadding(px, px, px, px);
        this.scanItView = imageView2;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.rightButton);
        iconButtonV3View.setLayoutParams(new FrameLayout.LayoutParams(px2, px2, 8388629));
        iconButtonV3View.setPadding(px4, px4, px4, px4);
        this.rightButton = iconButtonV3View;
        ImageView imageView3 = new ImageView(context);
        imageView3.setId(R$id.photoSearchIv);
        imageView3.setLayoutParams(new FrameLayout.LayoutParams(px2, px2, 8388629));
        imageView3.setImageResource(R$drawable.ic_s_photo_filled);
        imageView3.setPadding(px, px, px, px);
        this.photoSearchView = imageView3;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(pxF);
        gradientDrawable.setColor(themeColor);
        Unit unit = Unit.f71690a;
        this.backgroundDrawable = new CustomDrawable("ozBGTetriary", gradientDrawable);
        setId(R$id.searchBarView);
        setLayoutParams(new ViewGroup.LayoutParams(-1, px2));
        setBackground(this.backgroundDrawable.getDrawable());
        setPadding(px4, getPaddingTop(), px4, getPaddingBottom());
        addView(appCompatTextView);
        addView(imageView2);
        addView(iconButtonV3View);
        addView(imageView3);
        addView(imageView);
    }
}
