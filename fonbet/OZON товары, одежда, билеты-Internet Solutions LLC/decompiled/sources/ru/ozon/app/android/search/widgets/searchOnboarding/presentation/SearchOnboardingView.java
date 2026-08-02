package ru.ozon.app.android.search.widgets.searchOnboarding.presentation;

import Au.d;
import Bi.b;
import CX.a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\"\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\"J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "backgroundColor", "defaultCellBackgroundColor", "tertiaryTint", "cellContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "closeView", "Landroid/widget/ImageView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "clickableArea", "Landroid/view/View;", "bindOrGone", "", "model", "Lru/ozon/app/android/search/widgets/searchOnboarding/presentation/SearchOnboardingVO;", "showOnboarding", "", "setListeners", "onCloseClick", "Lkotlin/Function0;", "onOpenClick", "bind", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchOnboardingView extends FrameLayout {
    private static final int containerRadius;
    private static final float containerRadiusF;
    private static final float defaultCellRadius;
    private static final int dp16;
    private static final int iconSize;
    private final int backgroundColor;

    @NotNull
    private final BadgeView badgeView;

    @NotNull
    private final ConstraintLayout cellContainer;

    @NotNull
    private final View clickableArea;

    @NotNull
    private final ImageView closeView;
    private final int defaultCellBackgroundColor;

    @NotNull
    private final Image imageView;
    private final int tertiaryTint;

    @NotNull
    private final TextAtomV2View titleView;
    public static final int $stable = 8;
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp10 = ResourceExtKt.toPx(10);
    private static final int dp12 = ResourceExtKt.toPx(12);

    static {
        int px = ResourceExtKt.toPx(16);
        dp16 = px;
        containerRadiusF = ResourceExtKt.toPxF(16);
        containerRadius = px;
        defaultCellRadius = ResourceExtKt.toPxF(20);
        iconSize = ResourceExtKt.toPx(36);
    }

    public /* synthetic */ SearchOnboardingView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void bind(SearchOnboardingVO model) {
        ImageHolderKt.bindOrGone$default(this.imageView, model.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.titleView, model.getTitle(), null, 2, null);
        BadgeHolderKt.bind$default(this.badgeView, model.getBadge(), (Function1) null, 2, (Object) null);
        ConstraintLayout constraintLayout = this.cellContainer;
        GradientDrawable gradientDrawable = new GradientDrawable();
        CornerRadius cornerRadius = model.getCornerRadius();
        gradientDrawable.setCornerRadius(cornerRadius != null ? ResourceExtKt.toPxF(cornerRadius.getPx()) : defaultCellRadius);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, model.getBackgroundColor());
        gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : this.defaultCellBackgroundColor);
        constraintLayout.setBackground(gradientDrawable);
    }

    public final void bindOrGone(@NotNull SearchOnboardingVO model, boolean showOnboarding) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!showOnboarding) {
            setVisibility(8);
            setLayoutParams(new ViewGroup.MarginLayoutParams(-1, 0));
        } else {
            setVisibility(0);
            setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            bind(model);
        }
    }

    public final void setListeners(@NotNull Function0<Unit> onCloseClick, @NotNull Function0<Unit> onOpenClick) {
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onOpenClick, "onOpenClick");
        this.closeView.setOnClickListener(new a(onCloseClick, 2));
        this.clickableArea.setOnClickListener(new d(onOpenClick, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchOnboardingView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.backgroundColor = themeColor;
        this.defaultCellBackgroundColor = ThemeExtKt.themeColor(context, R$attr.bgActionSecondary);
        int color = androidx.core.content.a.getColor(context, R$color.graphic_tertiary);
        this.tertiaryTint = color;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i13 = dp6;
        layoutParams.setMarginEnd(i13);
        layoutParams.setMarginStart(i13);
        int i14 = dp8;
        layoutParams.topMargin = i14;
        layoutParams.bottomMargin = i13;
        constraintLayout.setLayoutParams(layoutParams);
        int i15 = dp12;
        int i16 = dp10;
        constraintLayout.setPadding(i15, i16, i14, i16);
        this.cellContainer = constraintLayout;
        int i17 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i18 = 0;
        Image image = new Image(context, attributeSet2, i18, i17, defaultConstructorMarker);
        image.setId(R$id.searchOnboardingImage);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        image.setLayoutParams(bVar);
        this.imageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i18, i17, defaultConstructorMarker);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.searchOnboardingTitle, 0, -2);
        d11.f41655s = R$id.searchOnboardingImage;
        d11.f41657u = R$id.searchOnboardingBadge;
        d11.f41636i = 0;
        d11.f41642l = 0;
        textAtomV2View.setLayoutParams(d11);
        this.titleView = textAtomV2View;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.searchOnboardingClose);
        imageView.setImageResource(R$drawable.ic_s_cross);
        int i19 = iconSize;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(i19, i19);
        bVar2.f41658v = 0;
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        imageView.setPadding(i15, imageView.getPaddingTop(), i14, imageView.getPaddingBottom());
        imageView.setLayoutParams(bVar2);
        ThemeExtKt.tint(imageView, Integer.valueOf(color));
        this.closeView = imageView;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = com.google.android.gms.internal.mlkit_common.a.a(badgeView, R$id.searchOnboardingBadge, -2, -2);
        a11.f41657u = R$id.searchOnboardingClose;
        a11.f41636i = 0;
        a11.f41642l = 0;
        badgeView.setLayoutParams(a11);
        this.badgeView = badgeView;
        View view = new View(context);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, 0);
        bVar3.f41657u = R$id.searchOnboardingClose;
        bVar3.f41656t = 0;
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        view.setLayoutParams(bVar3);
        this.clickableArea = view;
        setId(R$id.searchOnboarding);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.search.widgets.searchOnboarding.presentation.SearchOnboardingView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, -SearchOnboardingView.containerRadius, view2.getWidth(), view2.getHeight(), SearchOnboardingView.containerRadiusF);
            }
        });
        setBackgroundColor(themeColor);
        setClipToOutline(true);
        addView(constraintLayout);
        constraintLayout.addView(image);
        constraintLayout.addView(textAtomV2View);
        constraintLayout.addView(badgeView);
        constraintLayout.addView(imageView);
        constraintLayout.addView(view);
    }
}
