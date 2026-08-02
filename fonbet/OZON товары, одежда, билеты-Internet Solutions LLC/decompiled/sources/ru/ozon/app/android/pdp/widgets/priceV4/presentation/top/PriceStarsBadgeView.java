package ru.ozon.app.android.pdp.widgets.priceV4.presentation.top;

import EE.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceStarsBadgeVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0015\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceStarsBadgeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "leftIcon", "rightIcon", "", "bindBadges", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/widget/ImageView;", "getOrCreateLeftIconView", "()Landroid/widget/ImageView;", "getOrCreateRightIconView", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;", "badge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceStarsBadgeVO;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/ShapeDrawable;", "badgeBg", "Landroid/graphics/drawable/ShapeDrawable;", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/GradientTextView;", "textView", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/GradientTextView;", "leftIconView", "Landroid/widget/ImageView;", "rightIconView", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceStarsBadgeView extends LinearLayout {
    private static final float BADGE_RADIUS;
    private static final int HORIZONTAL_PADDING;
    private static final int ICON_SIZE;
    private static final int VERTICAL_PADDING;
    private static final int defaultColor;

    @NotNull
    private final ShapeDrawable badgeBg;
    private ImageView leftIconView;
    private ImageView rightIconView;

    @NotNull
    private final GradientTextView textView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/presentation/top/PriceStarsBadgeView$Companion;", "", "<init>", "()V", "", "ICON_SIZE", "I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Dimens dimens = Dimens.INSTANCE;
        BADGE_RADIUS = dimens.getDPF_6();
        HORIZONTAL_PADDING = dimens.getDP_4();
        VERTICAL_PADDING = dimens.getDP_2();
        ICON_SIZE = dimens.getDP_16();
        defaultColor = UniColors.BG_OZON_SECONDARY.getResId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceStarsBadgeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeDrawable createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(context, BADGE_RADIUS, CornersConfig.ALL, defaultColor, 0, null, 24, null);
        this.badgeBg = createRoundRectShape$default;
        GradientTextView gradientTextView = new GradientTextView(context);
        gradientTextView.setId(R$id.priceStarsTv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(Dimens.INSTANCE.getDP_2());
        gradientTextView.setLayoutParams(layoutParams);
        this.textView = gradientTextView;
        setId(R$id.priceStarsBadge);
        setOrientation(0);
        setGravity(16);
        int i11 = HORIZONTAL_PADDING;
        int i12 = VERTICAL_PADDING;
        setPadding(i11, i12, i11, i12);
        setBackground(createRoundRectShape$default);
        setClipToOutline(true);
        addView(gradientTextView);
    }

    private final void bindBadges(String leftIcon, String rightIcon) {
        ImageView imageView = this.leftIconView;
        if (imageView != null) {
            imageView.setVisibility(leftIcon == null ? 8 : 0);
        }
        if (leftIcon != null) {
            ViewExtKt.loadIcon$default(getOrCreateLeftIconView(), leftIcon, null, null, 6, null);
        }
        ImageView imageView2 = this.rightIconView;
        if (imageView2 != null) {
            imageView2.setVisibility(rightIcon == null ? 8 : 0);
        }
        if (rightIcon != null) {
            ViewExtKt.loadIcon$default(getOrCreateRightIconView(), rightIcon, null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$3(PriceStarsBadgeVO priceStarsBadgeVO, Function1 function1, View view) {
        AtomAction atomAction;
        CommonControlSettings common = priceStarsBadgeVO.getCommon();
        if (common == null || (atomAction = common.toAtomAction()) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final ImageView getOrCreateLeftIconView() {
        ImageView imageView = this.leftIconView;
        if (imageView != null) {
            return imageView;
        }
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(R$id.priceStarsLeftIcon);
        int i11 = ICON_SIZE;
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
        imageView2.setId(R$id.priceStarsRightIcon);
        int i11 = ICON_SIZE;
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(i11, i11));
        this.rightIconView = imageView2;
        addView(imageView2);
        return imageView2;
    }

    public final void bindOrGone(PriceStarsBadgeVO badge, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (badge == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        Drawable background = getBackground();
        ShapeDrawable shapeDrawable = null;
        ShapeDrawable shapeDrawable2 = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable2 != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            styleParser.parseColor(context, badge.getBackgroundColor(), defaultColor);
            shapeDrawable = shapeDrawable2;
        }
        setBackground(shapeDrawable);
        bindBadges(badge.getLeftIcon(), badge.getRightIcon());
        this.textView.bind(badge);
        setOnClickListener(new a(0, badge, actionHandler));
    }
}
