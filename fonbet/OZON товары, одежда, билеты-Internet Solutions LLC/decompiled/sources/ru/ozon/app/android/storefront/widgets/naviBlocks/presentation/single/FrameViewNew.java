package ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single;

import B90.g0;
import Cz.ViewOnClickListenerC2788a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 M2\u00020\u0001:\u0001MB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R*\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0016\u0010E\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00102R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010(R\u001d\u0010L\u001a\u0004\u0018\u00010G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameViewNew;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "newItem", "isRoundedCorners", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;Z)V", "item", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onLongTapDown", "Lkotlin/jvm/functions/Function0;", "getOnLongTapDown", "()Lkotlin/jvm/functions/Function0;", "setOnLongTapDown", "(Lkotlin/jvm/functions/Function0;)V", "onLongTapUp", "getOnLongTapUp", "setOnLongTapUp", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isRippleEnabled", "Z", "()Z", "setRippleEnabled", "(Z)V", "dp4", "I", "dp16", "defaultBackgroundColor", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "wasUpActionHappened", "isLongTap", "onActionDownRunnable", "Landroid/graphics/drawable/Drawable;", "bgDrawable$delegate", "LSc/j;", "getBgDrawable", "()Landroid/graphics/drawable/Drawable;", "bgDrawable", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameViewNew extends FrameLayout {

    @NotNull
    private final BadgeView badgeView;

    /* renamed from: bgDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgDrawable;
    private final int defaultBackgroundColor;
    private final int dp16;
    private final int dp4;

    @NotNull
    private final ImageView imageView;
    private boolean isLongTap;
    private boolean isRippleEnabled;
    private FrameVO item;
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameViewNew$Companion;", "", "<init>", "()V", "LONG_TAP_DELAY", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FrameViewNew(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(FrameViewNew frameViewNew, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        FrameVO frameVO = frameViewNew.item;
        if (frameVO == null || (action = frameVO.getAction()) == null || (function1 = frameViewNew.onAction) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final Drawable getBgDrawable() {
        return (Drawable) this.bgDrawable.getValue();
    }

    public final void bind(@NotNull FrameVO newItem, boolean isRoundedCorners) {
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (isRoundedCorners) {
            setBackground(getBgDrawable());
            Drawable background = getBackground();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, newItem.getBackgroundColor());
            background.setTint(parseColor != null ? parseColor.intValue() : this.defaultBackgroundColor);
        } else {
            setBackground(null);
        }
        this.item = newItem;
        TextHolderKt.bind$default(this.titleView, newItem.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleView, newItem.getSubtitle(), null, 2, null);
        ImageViewExtKt.load$default(this.imageView, newItem.getImage(), null, null, null, null, false, null, 126, null);
        BadgeView badgeView = this.badgeView;
        BadgeHolderKt.bindOrGone$default(badgeView, newItem.getBadge(), (Function1) null, 2, (Object) null);
        badgeView.setClickable(false);
    }

    public final Function0<Unit> getOnLongTapDown() {
        return this.onLongTapDown;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams layoutParams = this.titleView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int measuredHeight = this.titleView.getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = this.subtitleView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i11 = measuredHeight + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
        int i12 = bottom - top;
        ViewGroup.LayoutParams layoutParams3 = this.badgeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i13 = i12 - (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
        TextAtomV2View textAtomV2View = this.titleView;
        ViewGroup.LayoutParams layoutParams4 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i14 = marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams5 = textAtomV2View.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
        LayoutExtKt.layoutLeftTop(textAtomV2View, i14, marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
        TextAtomV2View textAtomV2View2 = this.subtitleView;
        ViewGroup.LayoutParams layoutParams6 = textAtomV2View2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
        LayoutExtKt.layoutLeftTop(textAtomV2View2, marginLayoutParams6 != null ? marginLayoutParams6.leftMargin : 0, i11);
        this.imageView.layout(0, 0, right - left, i12);
        BadgeView badgeView = this.badgeView;
        ViewGroup.LayoutParams layoutParams7 = badgeView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
        LayoutExtKt.layoutLeftTop(badgeView, marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0, i13 - badgeView.getMeasuredHeight());
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
            postDelayed(new g0(this.onActionDownRunnable, 10), 150L);
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

    public final void setRippleEnabled(boolean z11) {
        this.isRippleEnabled = z11;
        RippleDrawable rippleDrawable = null;
        if (z11) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
            rippleDrawable = new RippleDrawable(valueOf, null, new ColorDrawable(-1));
        }
        setForeground(rippleDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameViewNew(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(16);
        this.dp16 = px2;
        this.defaultBackgroundColor = ThemeExtKt.themeColor(context, R$attr.bgSecondary);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = px;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.imageView = imageView;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View.setId(R$id.frameTitleView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(px2, px2, px2, 0);
        textAtomV2View.setLayoutParams(layoutParams2);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        textAtomV2View2.setId(R$id.frameSubtitleView);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(px2, px, px2, 0);
        textAtomV2View2.setLayoutParams(layoutParams3);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View2;
        BadgeView badgeView = new BadgeView(context, attributeSet2, i12, 0, 14, null);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(px2, 0, px2, px2);
        badgeView.setLayoutParams(layoutParams4);
        this.badgeView = badgeView;
        this.onActionDownRunnable = new FrameViewNew$onActionDownRunnable$1(this);
        this.bgDrawable = LazyUtilsKt.unsafeLazy(new FrameViewNew$bgDrawable$2(context));
        addView(imageView);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(badgeView);
        setOnClickListener(new ViewOnClickListenerC2788a(this, 9));
    }
}
