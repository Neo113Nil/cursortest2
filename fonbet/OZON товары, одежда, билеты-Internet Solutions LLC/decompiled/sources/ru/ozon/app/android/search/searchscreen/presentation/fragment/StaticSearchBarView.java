package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.k;
import dL.ViewOnClickListenerC6128a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 I2\u00020\u0001:\u0002IJB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u0019J\u0017\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b#\u0010\u0015J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(¢\u0006\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010@\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\u0002018\u0006¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateSearchTextEndMargin", "()V", "applyRedesign", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "returnType", "setReturnKeyType", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;)V", "", "newHint", "setSearchHint", "(Ljava/lang/String;)V", "", "show", "showOrGoneScanItIcon", "(Z)V", "showOrGonePhotoSearchIcon", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "pdpSearchButton", "showOrGonePdpSearchIcon", "(Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;)V", "showOrGoneSearchCompoundDraw", "isActiveSearch", "setIconBackgroundColor", "newBackgroundColor", "setBackgroundColor", "", "radius", "setRoundCorners", "(F)V", "Lkotlin/Function0;", "onPhotoSearchClick", "setClickListeners", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors;", "searchBarColors", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/SearchBarColors;", "isRedesigned", "Z", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "pdpSearchIcon", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "scanItView", "photoSearchView", "Landroid/graphics/drawable/GradientDrawable;", "roundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView$CustomDrawable;", "backgroundDrawable", "Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView$CustomDrawable;", "selectCursorDrawable$delegate", "LSc/j;", "getSelectCursorDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "selectCursorDrawable", "Landroidx/appcompat/widget/AppCompatEditText;", "searchEditText", "Landroidx/appcompat/widget/AppCompatEditText;", "getSearchEditText", "()Landroidx/appcompat/widget/AppCompatEditText;", "clearSearchView", "getClearSearchView", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Companion", "CustomDrawable", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StaticSearchBarView extends FrameLayout {

    @NotNull
    private final CustomDrawable backgroundDrawable;

    @NotNull
    private final SmallIconButtonView clearSearchView;
    private boolean isRedesigned;

    @NotNull
    private final SmallIconButtonView pdpSearchIcon;

    @NotNull
    private final SmallIconButtonView photoSearchView;

    @NotNull
    private final GradientDrawable roundDrawable;

    @NotNull
    private final SmallIconButtonView scanItView;

    @NotNull
    private SearchBarColors searchBarColors;

    @NotNull
    private final AppCompatEditText searchEditText;

    /* renamed from: selectCursorDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectCursorDrawable;
    public static final int $stable = 8;
    private static final int iconPadding = ResourceExtKt.toPx(12);
    private static final float redesignedContainerRadius = ResourceExtKt.toPxF(16);
    private static final int horizontalPadding = ResourceExtKt.toPx(8);
    private static final int redesignedRightPadding = ResourceExtKt.toPx(4);
    private static final int redesignedIconPadding = ResourceExtKt.toPx(8);
    private static final int redesignedLayoutHeight = ResourceExtKt.toPx(48);
    private static final int iconSize = ResourceExtKt.toPx(40);
    private static final int pdpSearchIconSize = ResourceExtKt.toPx(28);
    private static final int clearSearchIconSize = ResourceExtKt.toPx(16);
    private static final int edgeIconsPadding = ResourceExtKt.toPx(8);
    private static final int clearSearchIconMarginEnd = ResourceExtKt.toPx(10);
    private static final int clearSearchIconRedesignedMarginEnd = ResourceExtKt.toPx(4);
    private static final int clearSearchIconRedesignedPaddings = ResourceExtKt.toPx(8);
    private static final int betweenIconsPadding = ResourceExtKt.toPx(4);
    private static final int searchTextPaddingLeft = ResourceExtKt.toPx(6);
    private static final int searchTextPaddingRight = ResourceExtKt.toPx(32);
    private static final int cursorHeight = ResourceExtKt.toPx(24);
    private static final int cursorWidth = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/fragment/StaticSearchBarView$CustomDrawable;", "", "color", "", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "<init>", "(Ljava/lang/String;Landroid/graphics/drawable/GradientDrawable;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public StaticSearchBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final GradientDrawable getSelectCursorDrawable() {
        return (GradientDrawable) this.selectCursorDrawable.getValue();
    }

    private final void updateSearchTextEndMargin() {
        AppCompatEditText appCompatEditText = this.searchEditText;
        ViewGroup.LayoutParams layoutParams = appCompatEditText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i11 = this.scanItView.getVisibility() == 0 ? 1 : 0;
        if (this.photoSearchView.getVisibility() == 0) {
            i11++;
        }
        if (this.pdpSearchIcon.getVisibility() == 0) {
            i11++;
        }
        layoutParams2.setMarginEnd(i11 * iconSize);
        appCompatEditText.setLayoutParams(layoutParams2);
    }

    public final void applyRedesign() {
        this.isRedesigned = true;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = redesignedLayoutHeight;
        setLayoutParams(layoutParams);
        this.roundDrawable.setCornerRadius(redesignedContainerRadius);
        setPadding(horizontalPadding, getPaddingTop(), redesignedRightPadding, getPaddingBottom());
        SmallIconButtonView smallIconButtonView = this.scanItView;
        smallIconButtonView.setImageResource(R$drawable.ic_m_barcode_alt_filled);
        int i11 = redesignedIconPadding;
        smallIconButtonView.setPadding(i11, i11, i11, i11);
        SmallIconButtonView smallIconButtonView2 = this.photoSearchView;
        smallIconButtonView2.setImageResource(R$drawable.ic_m_photo_filled);
        smallIconButtonView2.setPadding(i11, i11, i11, i11);
        SmallIconButtonView smallIconButtonView3 = this.clearSearchView;
        int i12 = iconSize;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i12, 8388629);
        layoutParams2.setMarginEnd(clearSearchIconRedesignedMarginEnd);
        smallIconButtonView3.setLayoutParams(layoutParams2);
        smallIconButtonView3.setImageResource(R$drawable.ic_m_cross_filled_compact);
        int i13 = clearSearchIconRedesignedPaddings;
        smallIconButtonView3.setPadding(i13, i13, i13, i13);
    }

    @NotNull
    public final SmallIconButtonView getClearSearchView() {
        return this.clearSearchView;
    }

    @NotNull
    public final AppCompatEditText getSearchEditText() {
        return this.searchEditText;
    }

    public final void setBackgroundColor(String newBackgroundColor) {
        if (Intrinsics.d(newBackgroundColor, this.backgroundDrawable.getColor())) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, newBackgroundColor);
        int intValue = parseColor != null ? parseColor.intValue() : this.searchBarColors.getDefaultBackground();
        this.backgroundDrawable.setColor(newBackgroundColor);
        this.backgroundDrawable.getDrawable().setColor(intValue);
    }

    public final void setClickListeners(@NotNull Function0<Unit> onPhotoSearchClick) {
        Intrinsics.checkNotNullParameter(onPhotoSearchClick, "onPhotoSearchClick");
        this.photoSearchView.setOnClickListener(new ViewOnClickListenerC6128a(onPhotoSearchClick, 1));
    }

    public final void setIconBackgroundColor(boolean isActiveSearch) {
        ThemeExtKt.tint(this.scanItView, Integer.valueOf(isActiveSearch ? this.searchBarColors.getDefaultBackground() : this.searchBarColors.getIcon()));
    }

    public final void setReturnKeyType(@NotNull SearchBarVO.ReturnKeyType returnType) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        this.searchEditText.setImeOptions(returnType == SearchBarVO.ReturnKeyType.DONE ? 6 : 3);
    }

    public final void setRoundCorners(float radius) {
        this.roundDrawable.setCornerRadius(radius);
    }

    public final void setSearchHint(@NotNull String newHint) {
        Intrinsics.checkNotNullParameter(newHint, "newHint");
        AppCompatEditText appCompatEditText = this.searchEditText;
        if (Intrinsics.d(appCompatEditText.getHint(), newHint)) {
            return;
        }
        appCompatEditText.setHint(newHint);
    }

    public final void showOrGonePdpSearchIcon(SearchBarVO.SearchButton pdpSearchButton) {
        TestInfo testInfo;
        Icon icon;
        Icon icon2;
        boolean z11 = pdpSearchButton != null;
        boolean z12 = (this.pdpSearchIcon.getVisibility() == 0) != z11;
        SmallIconButtonView smallIconButtonView = this.pdpSearchIcon;
        smallIconButtonView.setVisibility(z11 ? 0 : 8);
        String str = null;
        ImageViewExtKt.load$default(smallIconButtonView, (pdpSearchButton == null || (icon2 = pdpSearchButton.getIcon()) == null) ? null : icon2.getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = smallIconButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(smallIconButtonView, styleParser.parseColor(context, (pdpSearchButton == null || (icon = pdpSearchButton.getIcon()) == null) ? null : icon.getTintColor()));
        if (pdpSearchButton != null && (testInfo = pdpSearchButton.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        smallIconButtonView.setContentDescription(str);
        if (z12) {
            updateSearchTextEndMargin();
        }
    }

    public final void showOrGonePhotoSearchIcon(boolean show) {
        if ((this.photoSearchView.getVisibility() == 0) != show) {
            this.photoSearchView.setVisibility(show ? 0 : 8);
            updateSearchTextEndMargin();
            SmallIconButtonView smallIconButtonView = this.scanItView;
            ViewGroup.LayoutParams layoutParams = smallIconButtonView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(show ? iconSize : 0);
            smallIconButtonView.setLayoutParams(layoutParams2);
            smallIconButtonView.setPadding(show ? edgeIconsPadding : betweenIconsPadding, smallIconButtonView.getPaddingTop(), smallIconButtonView.getPaddingRight(), smallIconButtonView.getPaddingBottom());
        }
    }

    public final void showOrGoneScanItIcon(boolean show) {
        if ((this.scanItView.getVisibility() == 0) != show) {
            this.scanItView.setVisibility(show ? 0 : 8);
            updateSearchTextEndMargin();
        }
    }

    public final void showOrGoneSearchCompoundDraw(boolean show) {
        if (show) {
            TextViewExtKt.setVectorDrawableStart(this.searchEditText, this.isRedesigned ? R$drawable.ic_m_search_filled_compact : R$drawable.ic_s_search_filled);
        } else {
            TextViewExtKt.clearVectorDrawables(this.searchEditText);
        }
    }

    public /* synthetic */ StaticSearchBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticSearchBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.searchBarColors = new SearchBarColors(context);
        q qVar = q.f64554a;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) qVar.g(N.b(SmallIconButtonView.class), context);
        smallIconButtonView.setId(R$id.pdpSearchIv);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(this.searchBarColors.getPdpButtonBackground());
        smallIconButtonView.setScaleType(ImageView.ScaleType.CENTER);
        smallIconButtonView.setBackground(shapeDrawable);
        int i12 = pdpSearchIconSize;
        smallIconButtonView.setLayoutParams(new FrameLayout.LayoutParams(i12, i12, 8388629));
        this.pdpSearchIcon = smallIconButtonView;
        SmallIconButtonView smallIconButtonView2 = (SmallIconButtonView) qVar.g(N.b(SmallIconButtonView.class), context);
        smallIconButtonView2.setId(R$id.scanItIv);
        int i13 = iconSize;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i13, i13, 8388629);
        layoutParams.setMarginEnd(i13);
        smallIconButtonView2.setLayoutParams(layoutParams);
        smallIconButtonView2.setImageResource(R$drawable.ic_s_barcode);
        int i14 = iconPadding;
        smallIconButtonView2.setPadding(i14, i14, i14, i14);
        ThemeExtKt.tint(smallIconButtonView2, Integer.valueOf(this.searchBarColors.getIcon()));
        this.scanItView = smallIconButtonView2;
        SmallIconButtonView smallIconButtonView3 = (SmallIconButtonView) qVar.g(N.b(SmallIconButtonView.class), context);
        smallIconButtonView3.setId(R$id.photoSearchIv);
        smallIconButtonView3.setLayoutParams(new FrameLayout.LayoutParams(i13, i13, 8388629));
        smallIconButtonView3.setImageResource(R$drawable.ic_s_photo_filled);
        smallIconButtonView3.setPadding(i14, i14, i14, i14);
        ThemeExtKt.tint(smallIconButtonView3, Integer.valueOf(this.searchBarColors.getIcon()));
        this.photoSearchView = smallIconButtonView3;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.searchBarColors.getDefaultBackground());
        this.roundDrawable = gradientDrawable;
        CustomDrawable customDrawable = new CustomDrawable("ozbgprimaryinverse", gradientDrawable);
        this.backgroundDrawable = customDrawable;
        this.selectCursorDrawable = LazyUtilsKt.unsafeLazy(new StaticSearchBarView$selectCursorDrawable$2(this));
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setId(R$id.etSearch);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.setMarginEnd(i13 * 2);
        appCompatEditText.setLayoutParams(layoutParams2);
        appCompatEditText.setCompoundDrawablePadding(ResourceExtKt.toPx(12));
        appCompatEditText.setSingleLine(true);
        appCompatEditText.setGravity(8388627);
        appCompatEditText.setTextSize(ResourceExtKt.toSpF(16));
        appCompatEditText.setInputType(524289);
        appCompatEditText.setImeOptions(3);
        appCompatEditText.setFocusableInTouchMode(true);
        appCompatEditText.setEllipsize(TextUtils.TruncateAt.END);
        appCompatEditText.setBackgroundColor(0);
        if (Build.VERSION.SDK_INT >= 29) {
            appCompatEditText.setTextCursorDrawable(getSelectCursorDrawable());
        }
        appCompatEditText.setTextAppearance(R$style.TextStyle_Body_L);
        appCompatEditText.setTextColor(this.searchBarColors.getText());
        appCompatEditText.setHintTextColor(this.searchBarColors.getHintText());
        k.d(appCompatEditText, ColorStateList.valueOf(this.searchBarColors.getIcon()));
        appCompatEditText.setPadding(searchTextPaddingLeft, 0, searchTextPaddingRight, 0);
        this.searchEditText = appCompatEditText;
        SmallIconButtonView smallIconButtonView4 = (SmallIconButtonView) qVar.g(N.b(SmallIconButtonView.class), context);
        smallIconButtonView4.setId(R$id.ivClearSearch);
        int i15 = clearSearchIconSize;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i15, i15, 8388629);
        layoutParams3.setMarginEnd(clearSearchIconMarginEnd);
        smallIconButtonView4.setLayoutParams(layoutParams3);
        smallIconButtonView4.setImageResource(R$drawable.ic_s_cross);
        ThemeExtKt.tint(smallIconButtonView4, Integer.valueOf(this.searchBarColors.getClearSearchIcon()));
        this.clearSearchView = smallIconButtonView4;
        setId(R$id.searchBarView);
        setLayoutParams(new ViewGroup.LayoutParams(-1, i13));
        setBackground(customDrawable.getDrawable());
        int i16 = horizontalPadding;
        setPadding(i16, getPaddingTop(), i16, getPaddingBottom());
        addView(appCompatEditText);
        addView(smallIconButtonView4);
        addView(smallIconButtonView2);
        addView(smallIconButtonView3);
        addView(smallIconButtonView);
    }
}
