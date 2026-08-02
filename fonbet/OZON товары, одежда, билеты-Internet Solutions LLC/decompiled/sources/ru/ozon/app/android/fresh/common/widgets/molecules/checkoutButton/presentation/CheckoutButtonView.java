package ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation;

import Qo.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010*\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "buttonColor", "priceColor", "", "bindBackgroundColors", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/MotionEvent;", "event", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "LWZ/t;", "sendClickAnalytics", "bind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/drawable/GradientDrawable;", "buttonBackground", "Landroid/graphics/drawable/GradientDrawable;", "priceBackground", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView$delegate", "LSc/j;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "subtitleView$delegate", "getSubtitleView", "subtitleView", "Landroid/widget/LinearLayout;", "priceSection$delegate", "getPriceSection", "()Landroid/widget/LinearLayout;", "priceSection", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "priceView$delegate", "getPriceView", "priceView", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutButtonView extends ConstraintLayout {

    @NotNull
    private final GradientDrawable buttonBackground;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconView;

    @NotNull
    private final GradientDrawable priceBackground;

    /* renamed from: priceSection$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceSection;

    /* renamed from: priceView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j priceView;

    /* renamed from: subtitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j subtitleView;

    /* renamed from: titleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float buttonRadius = UiExtKt.toPxF(16);
    private static final float priceRadius = UiExtKt.toPxF(8);
    private static final int minButtonHeight = UiExtKt.toPx(56);
    private static final int priceVerticalPadding = UiExtKt.toPx(4);
    private static final int priceHorizontalPadding = UiExtKt.toPx(8);
    private static final int iconMargin = UiExtKt.toPx(6);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonView$Companion;", "", "<init>", "()V", "", "priceVerticalPadding", "I", "getPriceVerticalPadding", "()I", "priceHorizontalPadding", "getPriceHorizontalPadding", "iconMargin", "getIconMargin", "", "LEFT_BIAS", "F", "RIGHT_BIAS", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getIconMargin() {
            return CheckoutButtonView.iconMargin;
        }

        public final int getPriceHorizontalPadding() {
            return CheckoutButtonView.priceHorizontalPadding;
        }

        public final int getPriceVerticalPadding() {
            return CheckoutButtonView.priceVerticalPadding;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CheckoutButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(Function1 function1, CheckoutButtonVO checkoutButtonVO, Function1 function12, View view) {
        function1.invoke(checkoutButtonVO.getAction());
        t trackingInfo = checkoutButtonVO.getTrackingInfo();
        if (trackingInfo != null) {
            function12.invoke(trackingInfo);
        }
    }

    private final void bindBackgroundColors(String buttonColor, String priceColor) {
        Color.Gradient gradient;
        GradientDrawable.Orientation orientation;
        int[] colors;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, priceColor);
        if (parseColor != null) {
            int intValue = parseColor.intValue();
            this.priceBackground.setColors(new int[]{intValue, intValue});
            getPriceSection().setBackground(this.priceBackground);
        }
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(buttonColor);
        int[] iArr = null;
        if (gradientByToken != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gradient = TokensExtKt.toGradient(gradientByToken, context2);
        } else {
            gradient = null;
        }
        if (gradient == null || (colors = gradient.getColors()) == null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer parseColor2 = styleParser.parseColor(context3, buttonColor);
            if (parseColor2 != null) {
                int intValue2 = parseColor2.intValue();
                iArr = new int[]{intValue2, intValue2};
            }
        } else {
            iArr = colors;
        }
        if (iArr != null) {
            GradientDrawable gradientDrawable = this.buttonBackground;
            if (gradient == null || (orientation = gradient.getOrientation()) == null) {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation);
            this.buttonBackground.setColors(iArr);
            setBackground(this.buttonBackground);
        }
    }

    private final IconView getIconView() {
        return (IconView) this.iconView.getValue();
    }

    private final LinearLayout getPriceSection() {
        return (LinearLayout) this.priceSection.getValue();
    }

    private final TextAtomV2View getPriceView() {
        return (TextAtomV2View) this.priceView.getValue();
    }

    private final TextAtomV2View getSubtitleView() {
        return (TextAtomV2View) this.subtitleView.getValue();
    }

    private final TextAtomV2View getTitleView() {
        return (TextAtomV2View) this.titleView.getValue();
    }

    public final void bind(@NotNull CheckoutButtonVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super t, Unit> sendClickAnalytics) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(sendClickAnalytics, "sendClickAnalytics");
        TextHolderKt.bindOrGone(getTitleView(), item.getTitle(), actionHandler);
        TextHolderKt.bindOrGone(getSubtitleView(), item.getSubtitle(), actionHandler);
        IconHolderKt.bindOrGone(getIconView(), item.getPrice().getIcon(), actionHandler);
        TextHolderKt.bindOrGone(getPriceView(), item.getPrice().getText(), actionHandler);
        bindBackgroundColors(item.getBackgroundColor(), item.getPrice().getColor());
        setPadding(item.getSpacers().getLeft(), item.getSpacers().getTop(), item.getSpacers().getRight(), item.getSpacers().getBottom());
        setOnClickListener(new a(actionHandler, item, sendClickAnalytics, 1));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 1) {
            return performClick();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setCornerRadius(buttonRadius);
        this.buttonBackground = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(priceRadius);
        this.priceBackground = gradientDrawable2;
        this.titleView = k.b(new CheckoutButtonView$titleView$2(context, this));
        this.subtitleView = k.b(new CheckoutButtonView$subtitleView$2(context, this));
        this.priceSection = k.b(new CheckoutButtonView$priceSection$2(context, this));
        this.iconView = k.b(new CheckoutButtonView$iconView$2(context));
        this.priceView = k.b(new CheckoutButtonView$priceView$2(context));
        setMinHeight(minButtonHeight);
        setBackground(gradientDrawable);
        getPriceSection().setBackground(gradientDrawable2);
        getPriceSection().addView(getIconView(), 0);
        getPriceSection().addView(getPriceView(), 1);
    }
}
