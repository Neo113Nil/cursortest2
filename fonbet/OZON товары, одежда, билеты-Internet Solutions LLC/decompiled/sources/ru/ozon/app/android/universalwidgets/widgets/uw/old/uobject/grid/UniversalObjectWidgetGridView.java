package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeFrameLayoutDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001eH\u0016J\u0010\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u001a2\b\b\u0001\u0010$\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\u001aJ\u0010\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010\"J\u0010\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010\"J\u0015\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0002J.\u00100\u001a\u00020\u00152\b\b\u0001\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\bH\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\b\u00106\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectWidgetGridView;", "Landroid/widget/FrameLayout;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeDelegate;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageCornerRadius", "", "dp2", "dp4", "dp8", "imageView", "Landroid/widget/ImageView;", "contentLayout", "Landroid/widget/LinearLayout;", "titleView", "Landroidx/appcompat/widget/AppCompatTextView;", "subTitleView", "badgeDelegate", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "setAdvBadgeOrGone", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "loadImage", "image", "", "setTitleTextAppearance", "textStyle", "removeLetterSpacing", "setTitleOrGone", SelectionItemFormDTO.TITLE_FIELD_NAME, "setSubtitleOrGone", "subtitle", "setImageBackground", "isImageBackgroundHidden", "", "(Ljava/lang/Boolean;)V", "getRoundedCornersDrawable", "Landroid/graphics/drawable/GradientDrawable;", "buildTextView", "viewId", "maxLinesBound", "marginTop", "marginBottom", "updateTopMarginOfSubtitle", "updateBottomMarginOfTitle", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalObjectWidgetGridView extends FrameLayout implements AdvBadgeDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AdvBadgeFrameLayoutDelegate badgeDelegate;

    @NotNull
    private final LinearLayout contentLayout;
    private final int dp2;
    private final int dp4;
    private final int dp8;
    private final float imageCornerRadius;

    @NotNull
    private final ImageView imageView;
    private AppCompatTextView subTitleView;
    private AppCompatTextView titleView;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/UniversalObjectWidgetGridView$Companion;", "", "<init>", "()V", "TITLE_MAX_LINES", "", "SUBTITLE_MAX_LINES", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UniversalObjectWidgetGridView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AppCompatTextView buildTextView(int viewId, int maxLinesBound, int marginTop, int marginBottom) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(viewId);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = marginTop;
        layoutParams.bottomMargin = marginBottom;
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (maxLinesBound == 1) {
            appCompatTextView.setSingleLine();
        } else {
            appCompatTextView.setMaxLines(maxLinesBound);
        }
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_M);
        return appCompatTextView;
    }

    static /* synthetic */ AppCompatTextView buildTextView$default(UniversalObjectWidgetGridView universalObjectWidgetGridView, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return universalObjectWidgetGridView.buildTextView(i11, i12, i13, i14);
    }

    private final GradientDrawable getRoundedCornersDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.imageCornerRadius);
        gradientDrawable.setColor(-1);
        return gradientDrawable;
    }

    private final void updateBottomMarginOfTitle() {
        AppCompatTextView appCompatTextView = this.titleView;
        if (appCompatTextView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            AppCompatTextView appCompatTextView2 = this.subTitleView;
            layoutParams2.bottomMargin = (appCompatTextView2 == null || appCompatTextView2.getVisibility() != 0) ? this.dp8 : 0;
            appCompatTextView.setLayoutParams(layoutParams2);
        }
    }

    private final void updateTopMarginOfSubtitle() {
        AppCompatTextView appCompatTextView = this.subTitleView;
        if (appCompatTextView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            AppCompatTextView appCompatTextView2 = this.titleView;
            layoutParams2.topMargin = (appCompatTextView2 == null || appCompatTextView2.getVisibility() != 0) ? this.dp4 : this.dp2;
            appCompatTextView.setLayoutParams(layoutParams2);
        }
    }

    public final void loadImage(String image) {
        ImageViewExtKt.load$default(this.imageView, image, null, null, null, null, false, null, 126, null);
    }

    public final void removeLetterSpacing() {
        AppCompatTextView appCompatTextView = this.titleView;
        if (appCompatTextView != null) {
            appCompatTextView.setLetterSpacing(0.0f);
        }
        AppCompatTextView appCompatTextView2 = this.subTitleView;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setLetterSpacing(0.0f);
        }
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate
    public void setAdvBadgeOrGone(BadgeDTO badge, Function1<? super AtomAction, Unit> onAction) {
        this.badgeDelegate.setAdvBadgeOrGone(badge, onAction);
    }

    public final void setImageBackground(Boolean isImageBackgroundHidden) {
        boolean booleanValue = isImageBackgroundHidden != null ? isImageBackgroundHidden.booleanValue() : false;
        Drawable background = this.imageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            if (booleanValue) {
                gradientDrawable.setColor((ColorStateList) null);
            } else {
                gradientDrawable.setColor(-1);
            }
            gradientDrawable.setCornerRadius(this.imageCornerRadius);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setSubtitleOrGone(String subtitle) {
        UniversalObjectWidgetGridView universalObjectWidgetGridView;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2 = this.subTitleView;
        boolean z11 = appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0;
        AppCompatTextView appCompatTextView3 = this.subTitleView;
        if (appCompatTextView3 != null) {
            if (appCompatTextView3 != null) {
                appCompatTextView3.setText(subtitle);
                appCompatTextView3.setVisibility(subtitle != null ? 0 : 8);
            }
        } else if (subtitle != null) {
            universalObjectWidgetGridView = this;
            AppCompatTextView buildTextView$default = buildTextView$default(universalObjectWidgetGridView, R$id.uwGridSubtitleView, 2, 0, this.dp8, 4, null);
            buildTextView$default.setText(subtitle);
            universalObjectWidgetGridView.subTitleView = buildTextView$default;
            universalObjectWidgetGridView.contentLayout.addView(buildTextView$default);
            updateTopMarginOfSubtitle();
            appCompatTextView = universalObjectWidgetGridView.subTitleView;
            if (appCompatTextView != null) {
                if (z11 == (appCompatTextView.getVisibility() == 0)) {
                    return;
                }
            }
            updateBottomMarginOfTitle();
        }
        universalObjectWidgetGridView = this;
        updateTopMarginOfSubtitle();
        appCompatTextView = universalObjectWidgetGridView.subTitleView;
        if (appCompatTextView != null) {
        }
        updateBottomMarginOfTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleOrGone(String title) {
        UniversalObjectWidgetGridView universalObjectWidgetGridView;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2 = this.titleView;
        boolean z11 = appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0;
        AppCompatTextView appCompatTextView3 = this.titleView;
        if (appCompatTextView3 != null) {
            if (appCompatTextView3 != null) {
                appCompatTextView3.setText(title);
                appCompatTextView3.setVisibility(title != null ? 0 : 8);
            }
        } else if (title != null) {
            universalObjectWidgetGridView = this;
            AppCompatTextView buildTextView$default = buildTextView$default(universalObjectWidgetGridView, R$id.uwGridTitleView, 3, this.dp4, 0, 8, null);
            universalObjectWidgetGridView.titleView = buildTextView$default;
            if (buildTextView$default != null) {
                buildTextView$default.setText(title);
            }
            universalObjectWidgetGridView.contentLayout.addView(universalObjectWidgetGridView.titleView, 1);
            updateBottomMarginOfTitle();
            appCompatTextView = universalObjectWidgetGridView.titleView;
            if (appCompatTextView != null) {
                if (z11 == (appCompatTextView.getVisibility() == 0)) {
                    return;
                }
            }
            updateTopMarginOfSubtitle();
        }
        universalObjectWidgetGridView = this;
        updateBottomMarginOfTitle();
        appCompatTextView = universalObjectWidgetGridView.titleView;
        if (appCompatTextView != null) {
        }
        updateTopMarginOfSubtitle();
    }

    public final void setTitleTextAppearance(int textStyle) {
        AppCompatTextView appCompatTextView = this.titleView;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(textStyle);
        }
    }

    public /* synthetic */ UniversalObjectWidgetGridView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalObjectWidgetGridView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.imageCornerRadius = ResourceExtKt.toPxF(16);
        this.dp2 = ResourceExtKt.toPx(2);
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp8 = ResourceExtKt.toPx(8);
        SquareByWidthImageView squareByWidthImageView = new SquareByWidthImageView(context, null, 0, 6, null);
        squareByWidthImageView.setId(R$id.uwGridImageView);
        squareByWidthImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        squareByWidthImageView.setBackground(getRoundedCornersDrawable());
        squareByWidthImageView.setClipToOutline(true);
        this.imageView = squareByWidthImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.contentLayout = linearLayout;
        this.badgeDelegate = new AdvBadgeFrameLayoutDelegate(this, ResourceExtKt.toPx(8, context), null, 4, null);
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        setId(R$id.uwGridView);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setForeground(new RippleDrawable(valueOf, null, getRoundedCornersDrawable()));
        setBackground(new ColorDrawable(ThemeExtKt.themeColor(context, R$attr.layerFloor1)));
        setClickable(true);
        setFocusable(true);
        addView(linearLayout);
        linearLayout.addView(squareByWidthImageView);
    }
}
