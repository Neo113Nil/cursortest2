package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel;

import B90.c0;
import JG.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 D2\u00020\u0001:\u0001DB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010+¨\u0006E"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "backgroundColor", "", "setBackground", "(Ljava/lang/String;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "newItem", "bind", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;)V", "item", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onLongTapDown", "Lkotlin/jvm/functions/Function0;", "getOnLongTapDown", "()Lkotlin/jvm/functions/Function0;", "setOnLongTapDown", "(Lkotlin/jvm/functions/Function0;)V", "onLongTapUp", "getOnLongTapUp", "setOnLongTapUp", "dp4", "I", "dp12", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonV3View", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "wasUpActionHappened", "Z", "isLongTap", "onActionDownRunnable", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameView extends FrameLayout {

    @NotNull
    private final ButtonV3View buttonV3View;
    private final int dp12;
    private final int dp4;

    @NotNull
    private final ImageView imageView;
    private boolean isLongTap;
    private CarouselCardVO.Banner item;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Function0<Unit> onActionDownRunnable;
    private Function0<Unit> onLongTapDown;
    private Function0<Unit> onLongTapUp;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;
    private boolean wasUpActionHappened;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameView$Companion;", "", "<init>", "()V", "LONG_TAP_DELAY", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FrameView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(FrameView frameView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        CarouselCardVO.Banner banner = frameView.item;
        if (banner == null || (action = banner.getAction()) == null || (function1 = frameView.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void setBackground(String backgroundColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, backgroundColor, UniColors.BG_PRIMARY.getResId()));
    }

    public final void bind(@NotNull CarouselCardVO.Banner newItem) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        this.item = newItem;
        setBackground(newItem.getBackgroundColor());
        TextHolderKt.bind$default(this.titleView, newItem.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, newItem.getSubtitle(), null, 2, null);
        ImageViewExtKt.loadImageOrGone(this.imageView, newItem.getBackgroundImage());
        ButtonV3HolderKt.bindOrGone(this.buttonV3View, newItem.getButton(), this.onAction);
    }

    public final Function0<Unit> getOnLongTapDown() {
        return this.onLongTapDown;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i11 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        LayoutExtKt.layoutLeftTop(textAtomV2View, i11, marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        TextAtomV2View textAtomV2View2 = this.subtitleView;
        ViewGroup.LayoutParams layoutParams3 = textAtomV2View2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i12 = marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0;
        int bottom2 = this.titleView.getBottom();
        ViewGroup.LayoutParams layoutParams4 = textAtomV2View2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        LayoutExtKt.layoutLeftTop(textAtomV2View2, i12, bottom2 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0));
        LayoutExtKt.layoutLeftTop(this.imageView, 0, 0);
        ButtonV3View buttonV3View = this.buttonV3View;
        ViewGroup.LayoutParams layoutParams5 = buttonV3View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        int i13 = marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0;
        int measuredHeight = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams6 = buttonV3View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        LayoutExtKt.layoutLeftBottom(buttonV3View, i13, measuredHeight - (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.onLongTapDown == null || this.onLongTapUp == null) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction() & 255;
        if (action == 0) {
            this.wasUpActionHappened = false;
            this.isLongTap = false;
            postDelayed(new c0(this.onActionDownRunnable, 2), 150L);
            return true;
        }
        if (action != 1 && action != 3) {
            return super.onTouchEvent(event);
        }
        this.wasUpActionHappened = true;
        if (!this.isLongTap && action == 1) {
            performClick();
            return true;
        }
        Function0<Unit> function0 = this.onLongTapUp;
        if (function0 != null) {
            function0.invoke();
        }
        return true;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    public final void setOnLongTapDown(Function0<Unit> function0) {
        this.onLongTapDown = function0;
    }

    public final void setOnLongTapUp(Function0<Unit> function0) {
        this.onLongTapUp = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(12);
        this.dp12 = px2;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.f101arouselFrameImageView);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View.setId(R$id.f103arouselFrameTitle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(px2, px2, px2, 0);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View2.setId(R$id.f102arouselFrameSubtitle);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(px2, px, px2, 0);
        textAtomV2View2.setLayoutParams(layoutParams2);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View2;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i12, 0, 14, null);
        buttonV3View.setId(R$id.f100arouselFrameButton);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(px2, 0, px2, px2);
        buttonV3View.setLayoutParams(layoutParams3);
        this.buttonV3View = buttonV3View;
        this.onActionDownRunnable = new FrameView$onActionDownRunnable$1(this);
        addView(imageView);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(buttonV3View);
        setOnClickListener(new b(this, 5));
    }
}
