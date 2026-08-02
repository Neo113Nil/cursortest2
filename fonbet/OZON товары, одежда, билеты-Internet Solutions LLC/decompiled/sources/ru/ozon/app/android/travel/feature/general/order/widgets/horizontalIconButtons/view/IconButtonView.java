package ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.view;

import Jm0.a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.presentation.HorizontalIconButtonsVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u0002`\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/view/IconButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconIv", "Lru/ozon/uni/android/atom/icon/IconView;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "defaultBackground", "boundedData", "Lru/ozon/app/android/travel/feature/general/order/widgets/horizontalIconButtons/presentation/HorizontalIconButtonsVO$IconButtonVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "bind", "item", "addViews", "setupPaddings", "setupBackground", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconButtonView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private HorizontalIconButtonsVO.IconButtonVO boundedData;
    private final int defaultBackground;

    @NotNull
    private final IconView iconIv;

    @NotNull
    private final TextAtomV2View titleTav;

    public /* synthetic */ IconButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(IconButtonView iconButtonView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        HorizontalIconButtonsVO.IconButtonVO iconButtonVO = iconButtonView.boundedData;
        if (iconButtonVO == null || (action = iconButtonVO.getAction()) == null || (function1 = iconButtonView.actionHandler) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void addViews() {
        addView(this.iconIv);
        addView(this.titleTav);
    }

    private final void setupBackground() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(16, context);
        setBackground(new RoundedBackgroundProducer().produce(this.defaultBackground, pxF));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context2, R$attr.bgActionSecondary), pxF));
    }

    private final void setupPaddings() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px2 = ResourceExtKt.toPx(12, context2);
        setPadding(px2, px, px2, px);
    }

    public final void bind(@NotNull HorizontalIconButtonsVO.IconButtonVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Paint paint;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.boundedData = item;
        this.actionHandler = actionHandler;
        TextHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        IconHolderKt.bind$default(this.iconIv, item.getIcon(), null, 2, null);
        Drawable background = getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        paint.setColor(parseColor != null ? parseColor.intValue() : this.defaultBackground);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.iconIv = iconView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        textAtomV2View = textAtomV2View == null ? new TextAtomV2View(context, null, 0, 6, null) : textAtomV2View;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(4, context);
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTav = textAtomV2View;
        this.defaultBackground = ThemeExtKt.themeColor(context, R$attr.bgPrimary);
        setOrientation(1);
        setGravity(17);
        addViews();
        setupPaddings();
        setupBackground();
        setOnClickListener(new a(this, 4));
    }
}
