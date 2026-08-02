package ru.ozon.app.android.search.dialogsearchscreen.searchbar.view;

import Au.e;
import B3.D;
import D40.d;
import Hj.C3143a;
import Sc.InterfaceC4008j;
import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.filter.ActiveFilterIconView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u009d\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001$\b\u0001\u0018\u0000 v2\u00020\u0001:\u0001vB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\fJ\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u0019\u0010!\u001a\u00020\n*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020$2\b\b\u0002\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010,R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010,R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010,R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010,R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010,R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010,R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010,R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010,R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010,R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010,R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010,R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010LR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010T\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bT\u0010J\u001a\u0004\bU\u0010LR\u0017\u0010V\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010[\u001a\u00020Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010d\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bd\u0010W\u001a\u0004\be\u0010YR\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010k\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bk\u0010h\u001a\u0004\bl\u0010jR\u0017\u0010m\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bm\u0010h\u001a\u0004\bn\u0010jR\u0014\u0010o\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010hR\u001b\u0010u\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t¨\u0006w"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/view/DialogSearchBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "applyRedesign", "()V", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindRightButton", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lkotlin/jvm/functions/Function1;)V", "", "isVisible", "changeVisibilityGradientForEndInput", "(Z)V", "changeVisibilityGradientForMultilineInput", "isDisable", "changeSearchInputState", "isNeedToPlay", "playArrowAnimation", "hideFilters", "cancelArrowAnimation", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/ActiveFilterIconView;", "disabled", "disable", "(Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/ActiveFilterIconView;Z)V", "isRedesigned", "ru/ozon/app/android/search/dialogsearchscreen/searchbar/view/DialogSearchBarView$getViewOutlineProvider$1", "getViewOutlineProvider", "(Z)Lru/ozon/app/android/search/dialogsearchscreen/searchbar/view/DialogSearchBarView$getViewOutlineProvider$1;", "Landroid/animation/AnimatorSet;", "animatorSet", "Landroid/animation/AnimatorSet;", "Z", "inputBackgroundColor", "I", "tertiaryTint", "transparentBackground", "mainTextColor", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "topGradientDrawable", "bottomGradientDrawable", "iconSize", "redesignedIconSize", "gradientFiltersWidth", "gradientFiltersHeight", "searchInputPadding", "", "inputRadius", "F", "redesignedInputRadius", "iconMarginEnd", "dp4", "dp5", "dp3", "dp8", "dp10", "dp12", "Landroid/graphics/Paint;", "gradientPaint", "Landroid/graphics/Paint;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "arrowBackIcon", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getArrowBackIcon", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "rightButton", "getRightButton", "Landroid/widget/FrameLayout;", "rightButtonContainer", "Landroid/widget/FrameLayout;", "getRightButtonContainer", "()Landroid/widget/FrameLayout;", "clearIcon", "getClearIcon", "filterIcon", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/ActiveFilterIconView;", "getFilterIcon", "()Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/ActiveFilterIconView;", "Landroidx/appcompat/widget/AppCompatEditText;", "searchInput", "Landroidx/appcompat/widget/AppCompatEditText;", "getSearchInput", "()Landroidx/appcompat/widget/AppCompatEditText;", "Landroidx/recyclerview/widget/RecyclerView;", "filterTags", "Landroidx/recyclerview/widget/RecyclerView;", "getFilterTags", "()Landroidx/recyclerview/widget/RecyclerView;", "activeFilterIcon", "getActiveFilterIcon", "Landroid/view/View;", "gradientFiltersView", "Landroid/view/View;", "getGradientFiltersView", "()Landroid/view/View;", "bottomGradientMultilineInputView", "getBottomGradientMultilineInputView", "gradientInputView", "getGradientInputView", "topGradientMultilineInputView", "Landroid/animation/ObjectAnimator;", "indicatorAnimation$delegate", "LSc/j;", "getIndicatorAnimation", "()Landroid/animation/ObjectAnimator;", "indicatorAnimation", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchBarView extends ConstraintLayout {

    @NotNull
    private final ActiveFilterIconView activeFilterIcon;
    private AnimatorSet animatorSet;

    @NotNull
    private final IconButtonV3View arrowBackIcon;

    @NotNull
    private final GradientDrawable bottomGradientDrawable;

    @NotNull
    private final View bottomGradientMultilineInputView;

    @NotNull
    private final IconButtonV3View clearIcon;
    private final int dp10;
    private final int dp12;
    private final int dp3;
    private final int dp4;
    private final int dp5;
    private final int dp8;

    @NotNull
    private final ActiveFilterIconView filterIcon;

    @NotNull
    private final RecyclerView filterTags;

    @NotNull
    private final GradientDrawable gradientDrawable;
    private final int gradientFiltersHeight;

    @NotNull
    private final View gradientFiltersView;
    private final int gradientFiltersWidth;

    @NotNull
    private final View gradientInputView;

    @NotNull
    private final Paint gradientPaint;
    private final int iconMarginEnd;
    private final int iconSize;

    /* renamed from: indicatorAnimation$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j indicatorAnimation;
    private final int inputBackgroundColor;
    private final float inputRadius;
    private boolean isRedesigned;
    private final int mainTextColor;
    private final int redesignedIconSize;
    private final float redesignedInputRadius;

    @NotNull
    private final IconButtonV3View rightButton;

    @NotNull
    private final FrameLayout rightButtonContainer;

    @NotNull
    private final AppCompatEditText searchInput;
    private final int searchInputPadding;
    private final int tertiaryTint;

    @NotNull
    private final GradientDrawable topGradientDrawable;

    @NotNull
    private final View topGradientMultilineInputView;
    private final int transparentBackground;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int gradientHeight = ResourceExtKt.toPx(4);
    private static final int redesignedHorizontalPaddings = ResourceExtKt.toPx(8);
    private static final int redesignedBottomTapTagsPadding = ResourceExtKt.toPx(6);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/searchbar/view/DialogSearchBarView$Companion;", "", "<init>", "()V", "", "redesignedHorizontalPaddings", "I", "getRedesignedHorizontalPaddings", "()I", "redesignedBottomTapTagsPadding", "getRedesignedBottomTapTagsPadding", "MAX_LINES", "MAX_ROW", "", "ARROW_ANIMATION_DURATION", "J", "ARROW_ANIMATION_DELAY", "", "ICON_CHEVRON", "Ljava/lang/String;", "REDESIGN_ICON_CHEVRON", "ICON_CROSS", "REDESIGN_ICON_CROSS", "", "ENABLED_FILTERS_ALPHA", "F", "DISABLED_FILTERS_ALPHA", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getRedesignedBottomTapTagsPadding() {
            return DialogSearchBarView.redesignedBottomTapTagsPadding;
        }

        public final int getRedesignedHorizontalPaddings() {
            return DialogSearchBarView.redesignedHorizontalPaddings;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogSearchBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindRightButton$lambda$32(IconButtonV3DTO iconButtonV3DTO, Function1 function1, View view) {
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        if (iconButtonV3DTO == null || (common = iconButtonV3DTO.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, null)) == null || function1 == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public static /* synthetic */ void changeVisibilityGradientForEndInput$default(DialogSearchBarView dialogSearchBarView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        dialogSearchBarView.changeVisibilityGradientForEndInput(z11);
    }

    private final ObjectAnimator getIndicatorAnimation() {
        return (ObjectAnimator) this.indicatorAnimation.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView$getViewOutlineProvider$1] */
    private final DialogSearchBarView$getViewOutlineProvider$1 getViewOutlineProvider(final boolean isRedesigned) {
        return new ViewOutlineProvider() { // from class: ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView$getViewOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), isRedesigned ? this.redesignedInputRadius : this.inputRadius);
            }
        };
    }

    static /* synthetic */ DialogSearchBarView$getViewOutlineProvider$1 getViewOutlineProvider$default(DialogSearchBarView dialogSearchBarView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return dialogSearchBarView.getViewOutlineProvider(z11);
    }

    public final void applyRedesign() {
        int i11 = this.dp8;
        setPadding(0, i11, 0, i11);
        this.filterTags.setPadding(this.dp5, 0, this.gradientFiltersWidth, 0);
        IconButtonV3View iconButtonV3View = this.clearIcon;
        DrawableResource.Companion companion = DrawableResource.INSTANCE;
        iconButtonV3View.setIconDrawable(companion.fromToken("ic_m_cross_filled_compact"));
        this.arrowBackIcon.setIconDrawable(companion.fromToken("ic_m_chevron_left_filled"));
        IconButtonV3View iconButtonV3View2 = this.rightButton;
        ViewGroup.LayoutParams layoutParams = iconButtonV3View2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i12 = this.redesignedIconSize;
        ((ViewGroup.MarginLayoutParams) bVar).height = i12;
        ((ViewGroup.MarginLayoutParams) bVar).width = i12;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = this.dp4;
        iconButtonV3View2.setLayoutParams(bVar);
        FrameLayout frameLayout = this.rightButtonContainer;
        frameLayout.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        int i13 = this.dp4;
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = -i13;
        bVar2.setMarginEnd(i13);
        frameLayout.setLayoutParams(bVar2);
        setOutlineProvider(getViewOutlineProvider(true));
        this.isRedesigned = true;
    }

    public final void bindRightButton(IconButtonV3DTO dto, Function1<? super AtomAction, Unit> actionHandler) {
        IconButtonV3HolderKt.bindOrGone(this.rightButton, dto, actionHandler);
        if (!this.isRedesigned) {
            this.rightButtonContainer.setVisibility(8);
        } else {
            this.rightButtonContainer.setOnClickListener(new e(3, (Function1) actionHandler, (Object) dto));
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.dp4);
        }
    }

    public final void cancelArrowAnimation() {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void changeSearchInputState(boolean isDisable) {
        int i11 = isDisable ? this.tertiaryTint : this.mainTextColor;
        this.searchInput.setEnabled(!isDisable);
        this.searchInput.setTextColor(i11);
        this.clearIcon.setDisabled(isDisable);
        this.clearIcon.setEnabled(!isDisable);
        this.clearIcon.setBackColor(new Color.Solid(this.transparentBackground));
        disable(this.filterIcon, isDisable);
        disable(this.activeFilterIcon, isDisable);
    }

    public final void changeVisibilityGradientForEndInput(boolean isVisible) {
        this.gradientInputView.setVisibility(!this.searchInput.hasFocus() || isVisible ? 0 : 8);
    }

    public final void changeVisibilityGradientForMultilineInput() {
        boolean hasFocus = this.searchInput.hasFocus();
        this.topGradientMultilineInputView.setVisibility(hasFocus ? 0 : 8);
        this.bottomGradientMultilineInputView.setVisibility(hasFocus ? 0 : 8);
    }

    public final void disable(@NotNull ActiveFilterIconView activeFilterIconView, boolean z11) {
        Intrinsics.checkNotNullParameter(activeFilterIconView, "<this>");
        activeFilterIconView.setAlpha((z11 && activeFilterIconView.getVisibility() == 0) ? 0.5f : 1.0f);
        if (z11 && activeFilterIconView.getVisibility() == 0) {
            activeFilterIconView.disableIconButton();
        }
    }

    @NotNull
    public final ActiveFilterIconView getActiveFilterIcon() {
        return this.activeFilterIcon;
    }

    @NotNull
    public final IconButtonV3View getArrowBackIcon() {
        return this.arrowBackIcon;
    }

    @NotNull
    public final IconButtonV3View getClearIcon() {
        return this.clearIcon;
    }

    @NotNull
    public final ActiveFilterIconView getFilterIcon() {
        return this.filterIcon;
    }

    @NotNull
    public final RecyclerView getFilterTags() {
        return this.filterTags;
    }

    @NotNull
    public final AppCompatEditText getSearchInput() {
        return this.searchInput;
    }

    public final void hideFilters() {
        ViewExtKt.gone(this.filterTags);
        ViewExtKt.gone(this.filterIcon);
        ViewExtKt.gone(this.activeFilterIcon);
        ViewExtKt.gone(this.gradientFiltersView);
    }

    public final void playArrowAnimation(boolean isNeedToPlay) {
        if (!isNeedToPlay) {
            this.arrowBackIcon.setAlpha(1.0f);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(50L);
        animatorSet.play(getIndicatorAnimation());
        animatorSet.start();
        this.animatorSet = animatorSet;
    }

    public /* synthetic */ DialogSearchBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogSearchBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgPrimary);
        this.inputBackgroundColor = themeColor;
        int themeColor2 = ThemeExtKt.themeColor(context, R$attr.graphicTertiary);
        this.tertiaryTint = themeColor2;
        int color = a.getColor(context, R.color.transparent);
        this.transparentBackground = color;
        int themeColor3 = ThemeExtKt.themeColor(context, R$attr.textPrimary);
        this.mainTextColor = themeColor3;
        GradientDrawable b11 = D.b(0);
        b11.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        b11.setColors(new int[]{color, themeColor, themeColor});
        this.gradientDrawable = b11;
        GradientDrawable b12 = D.b(0);
        b12.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        b12.setColors(new int[]{color, color, themeColor, themeColor, themeColor});
        this.topGradientDrawable = b12;
        GradientDrawable b13 = D.b(0);
        b13.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        b13.setColors(new int[]{color, color, themeColor});
        this.bottomGradientDrawable = b13;
        int px = ResourceExtKt.toPx(32);
        this.iconSize = px;
        int px2 = ResourceExtKt.toPx(40);
        this.redesignedIconSize = px2;
        int px3 = ResourceExtKt.toPx(20);
        this.gradientFiltersWidth = px3;
        int px4 = ResourceExtKt.toPx(24);
        this.gradientFiltersHeight = px4;
        int px5 = ResourceExtKt.toPx(6);
        this.searchInputPadding = px5;
        this.inputRadius = ResourceExtKt.toPxF(12);
        this.redesignedInputRadius = ResourceExtKt.toPxF(16);
        int px6 = ResourceExtKt.toPx(4);
        this.iconMarginEnd = px6;
        int px7 = ResourceExtKt.toPx(4);
        this.dp4 = px7;
        this.dp5 = ResourceExtKt.toPx(5);
        int px8 = ResourceExtKt.toPx(3);
        this.dp3 = px8;
        int px9 = ResourceExtKt.toPx(8);
        this.dp8 = px9;
        int px10 = ResourceExtKt.toPx(10);
        this.dp10 = px10;
        int px11 = ResourceExtKt.toPx(12);
        this.dp12 = px11;
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(px, 0.0f, 0.0f, 0.0f, new int[]{themeColor, color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        this.gradientPaint = paint;
        int i12 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, i12, defaultConstructorMarker);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.arrowBackIv, px, px);
        c11.f41656t = 0;
        c11.f41636i = 0;
        c11.setMarginStart(px7);
        iconButtonV3View.setLayoutParams(c11);
        IconButtonV3DTO.Sizes sizes = IconButtonV3DTO.Sizes.SIZE_400;
        iconButtonV3View.setSize(sizes);
        DrawableResource.Companion companion = DrawableResource.INSTANCE;
        iconButtonV3View.setIconDrawable(companion.fromToken("ic_s_chevron_left_filled"));
        iconButtonV3View.setBackColor(new Color.Solid(themeColor));
        iconButtonV3View.setPadding(px9, px9, px9, px9);
        iconButtonV3View.setIconColor(themeColor2);
        iconButtonV3View.setAlpha(0.0f);
        this.arrowBackIcon = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, i12, defaultConstructorMarker);
        ConstraintLayout.b c12 = d.c(iconButtonV3View2, R$id.dialogRightButton, px, px);
        int i13 = R$id.dialogRightButtonContainer;
        c12.f41636i = i13;
        c12.f41658v = i13;
        c12.setMarginEnd(px6);
        c12.f41616W = true;
        c12.f41617X = true;
        iconButtonV3View2.setLayoutParams(c12);
        iconButtonV3View2.setVisibility(8);
        this.rightButton = iconButtonV3View2;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R$id.dialogRightButtonContainer);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px2, px2);
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41616W = true;
        bVar.f41617X = true;
        frameLayout.setLayoutParams(bVar);
        frameLayout.setVisibility(8);
        this.rightButtonContainer = frameLayout;
        int i14 = 0;
        IconButtonV3View iconButtonV3View3 = new IconButtonV3View(context, null, i14, 0, 14, defaultConstructorMarker);
        ConstraintLayout.b c13 = d.c(iconButtonV3View3, R$id.dialogClearIv, px, px);
        c13.f41636i = 0;
        c13.f41657u = iconButtonV3View2.getId();
        c13.setMarginEnd(px9);
        c13.f41595B = px6;
        iconButtonV3View3.setLayoutParams(c13);
        iconButtonV3View3.setVisibility(8);
        iconButtonV3View3.setSize(sizes);
        iconButtonV3View3.setBackColor(new Color.Solid(color));
        iconButtonV3View3.setIconDrawable(companion.fromToken("ic_s_cross_filled_compact"));
        iconButtonV3View3.setPadding(px9, px9, px9, px9);
        iconButtonV3View3.setIconColor(themeColor2);
        this.clearIcon = iconButtonV3View3;
        ActiveFilterIconView activeFilterIconView = new ActiveFilterIconView(context, null, i14, 6, null);
        activeFilterIconView.setId(R$id.dialogFilterIv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(px, px);
        bVar2.f41657u = iconButtonV3View3.getId();
        bVar2.f41636i = 0;
        bVar2.setMarginEnd(px6);
        activeFilterIconView.setLayoutParams(bVar2);
        activeFilterIconView.setBackgroundColor(themeColor);
        ViewExtKt.gone(activeFilterIconView);
        this.filterIcon = activeFilterIconView;
        AppCompatEditText appCompatEditText = new AppCompatEditText(context);
        appCompatEditText.setId(R$id.etSearch);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41655s = iconButtonV3View.getId();
        bVar3.f41636i = 0;
        bVar3.f41657u = activeFilterIconView.getId();
        bVar3.setMarginStart(px7);
        appCompatEditText.setLayoutParams(bVar3);
        appCompatEditText.setMaxLines(2);
        appCompatEditText.setGravity(8388627);
        appCompatEditText.setInputType(131072);
        appCompatEditText.setFocusableInTouchMode(true);
        appCompatEditText.setEllipsize(TextUtils.TruncateAt.END);
        appCompatEditText.setBackgroundColor(color);
        appCompatEditText.setTextAppearance(R$style.TextStyle_Body_L);
        appCompatEditText.setTextColor(themeColor3);
        appCompatEditText.setHintTextColor(themeColor2);
        appCompatEditText.setHorizontallyScrolling(false);
        appCompatEditText.setHint(StringProvider.getString(R$string.search_bar_mobile_find_on_ozon));
        appCompatEditText.setPadding(appCompatEditText.getPaddingLeft(), px5, appCompatEditText.getPaddingRight(), px5);
        this.searchInput = appCompatEditText;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.dialogFilterTags);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-1, -2);
        bVar4.f41638j = appCompatEditText.getId();
        bVar4.setMarginEnd(px + px6);
        recyclerView.setLayoutParams(bVar4);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(px10, 0, px3, 0);
        this.filterTags = recyclerView;
        ActiveFilterIconView activeFilterIconView2 = new ActiveFilterIconView(context, null, 0, 6, null);
        activeFilterIconView2.setId(R$id.dialogActiveFilterIv);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(px, px);
        bVar5.f41658v = 0;
        bVar5.f41636i = recyclerView.getId();
        bVar5.f41642l = recyclerView.getId();
        bVar5.setMarginEnd(px6);
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = -px9;
        activeFilterIconView2.setLayoutParams(bVar5);
        ViewExtKt.gone(activeFilterIconView2);
        this.activeFilterIcon = activeFilterIconView2;
        View view = new View(context);
        view.setBackground(b11);
        ConstraintLayout.b bVar6 = new ConstraintLayout.b(px3, px4);
        bVar6.f41636i = recyclerView.getId();
        bVar6.f41657u = activeFilterIconView2.getId();
        view.setLayoutParams(bVar6);
        ViewExtKt.gone(view);
        this.gradientFiltersView = view;
        View view2 = new View(context);
        view2.setBackground(b13);
        ConstraintLayout.b bVar7 = new ConstraintLayout.b(0, gradientHeight);
        bVar7.f41642l = appCompatEditText.getId();
        bVar7.f41655s = iconButtonV3View.getId();
        bVar7.f41657u = activeFilterIconView.getId();
        view2.setLayoutParams(bVar7);
        ViewExtKt.gone(view2);
        this.bottomGradientMultilineInputView = view2;
        View view3 = new View(context);
        view3.setId(R$id.gradientInputView);
        view3.setBackground(new Drawable() { // from class: ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView$gradientInputView$1$1
            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
                Paint paint2;
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Rect bounds = getBounds();
                paint2 = DialogSearchBarView.this.gradientPaint;
                canvas.drawRect(bounds, paint2);
            }

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return -3;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int alpha) {
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }
        });
        ConstraintLayout.b bVar8 = new ConstraintLayout.b(px, px);
        bVar8.f41636i = appCompatEditText.getId();
        bVar8.f41642l = appCompatEditText.getId();
        bVar8.f41657u = activeFilterIconView.getId();
        view3.setLayoutParams(bVar8);
        ViewExtKt.gone(view3);
        this.gradientInputView = view3;
        View view4 = new View(context);
        view4.setBackground(b12);
        ConstraintLayout.b bVar9 = new ConstraintLayout.b(0, px11);
        bVar9.f41636i = appCompatEditText.getId();
        bVar9.f41655s = iconButtonV3View.getId();
        bVar9.f41657u = activeFilterIconView.getId();
        view4.setLayoutParams(bVar9);
        ViewExtKt.gone(view4);
        this.topGradientMultilineInputView = view4;
        this.indicatorAnimation = LazyUtilsKt.unsafeLazy(new DialogSearchBarView$indicatorAnimation$2(this));
        setId(R$id.dialogSearchBarView);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setBackgroundColor(themeColor);
        setPadding(0, px8, 0, px8);
        setOutlineProvider(getViewOutlineProvider$default(this, false, 1, null));
        setClipToOutline(true);
        addView(appCompatEditText);
        addView(recyclerView);
        addView(iconButtonV3View);
        addView(activeFilterIconView);
        addView(iconButtonV3View2);
        addView(frameLayout);
        addView(iconButtonV3View3);
        addView(activeFilterIconView2);
        addView(view);
        addView(view3);
        addView(view4);
        addView(view2);
    }
}
