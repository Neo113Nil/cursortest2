package ru.ozon.app.android.travel.molecules.view.starsBadge.v1;

import JC.c;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0015\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "leftIcon", "rightIcon", "", "bindIcons", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "getOrCreateLeftIconView", "()Landroid/widget/ImageView;", "getOrCreateRightIconView", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;", "badge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeVI;Lkotlin/jvm/functions/Function1;)V", "", "iconSize", "I", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp2", "dp4", "dp6", "", "cornerRadius", "F", "defaultBackgroundColor", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/GradientTextView;", "textView", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/GradientTextView;", "leftIconView", "Landroid/widget/ImageView;", "rightIconView", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StarsBadgeView extends LinearLayout {
    public static final int $stable = 8;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private final float cornerRadius;
    private final int defaultBackgroundColor;
    private final int dp2;
    private final int dp4;
    private final int dp6;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;
    private final int iconSize;
    private ImageView leftIconView;
    private ImageView rightIconView;

    @NotNull
    private final GradientTextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StarsBadgeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconSize = UiExtKt.toPx(16);
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        int margin2 = dimens$default.getMargin2();
        this.dp2 = margin2;
        int margin4 = dimens$default.getMargin4();
        this.dp4 = margin4;
        this.dp6 = dimens$default.getMargin6();
        float radius6 = dimens$default.getRadius6();
        this.cornerRadius = radius6;
        int resId = UniColors.BG_OZON_SECONDARY.getResId();
        this.defaultBackgroundColor = resId;
        GradientTextView gradientTextView = new GradientTextView(context);
        gradientTextView.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(margin2);
        gradientTextView.setLayoutParams(marginLayoutParams);
        this.textView = gradientTextView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        setOrientation(0);
        setGravity(16);
        setPadding(margin4, margin2, getPaddingRight(), margin2);
        gradientDrawable.setColor(context.getColor(resId));
        gradientDrawable.setCornerRadius(radius6);
        setBackground(gradientDrawable);
        setClipToOutline(true);
        addView(gradientTextView);
    }

    private final void bindIcons(String leftIcon, String rightIcon) {
        ImageView imageView = this.leftIconView;
        if (imageView != null) {
            imageView.setVisibility(leftIcon == null ? 8 : 0);
        }
        if (leftIcon != null) {
            ImageViewExtKt.load$default(getOrCreateLeftIconView(), leftIcon, null, null, null, null, false, null, 126, null);
        }
        ImageView imageView2 = this.rightIconView;
        if (imageView2 != null) {
            imageView2.setVisibility(rightIcon == null ? 8 : 0);
        }
        if (rightIcon != null) {
            ImageViewExtKt.load$default(getOrCreateRightIconView(), rightIcon, null, null, null, null, false, null, 126, null);
        }
        setPadding(getPaddingLeft(), getPaddingTop(), rightIcon == null ? this.dp6 : this.dp2, getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$2(StarsBadgeVI starsBadgeVI, Function1 function1, View view) {
        AtomAction common = starsBadgeVI.getCommon();
        if (common != null) {
            function1.invoke(common);
        }
    }

    private final ImageView getOrCreateLeftIconView() {
        ImageView imageView = this.leftIconView;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(View.generateViewId());
        int i11 = this.iconSize;
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
        this.leftIconView = imageView2;
        addView(imageView2, 0);
        return imageView2;
    }

    private final ImageView getOrCreateRightIconView() {
        ImageView imageView = this.rightIconView;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(View.generateViewId());
        int i11 = this.iconSize;
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
        this.rightIconView = imageView2;
        addView(imageView2);
        return imageView2;
    }

    public final void bindOrGone(StarsBadgeVI badge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (badge == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, badge.getBackgroundColor(), this.defaultBackgroundColor));
        bindIcons(badge.getLeftIcon(), badge.getRightIcon());
        this.textView.bind(badge);
        setOnClickListener(new c(2, badge, actionHandler));
    }
}
