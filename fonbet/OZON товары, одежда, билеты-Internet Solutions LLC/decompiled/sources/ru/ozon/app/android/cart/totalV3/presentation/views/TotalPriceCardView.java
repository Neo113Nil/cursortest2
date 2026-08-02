package ru.ozon.app.android.cart.totalV3.presentation.views;

import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ5\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010#J\u0012\u0010$\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0012\u0010'\u001a\u00020(2\b\b\u0001\u0010%\u001a\u00020\u0007H\u0002J\u0012\u0010)\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010+H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006-"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "priceAV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "textAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "dp2", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "bind", "priceCard", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;", "bindOrGone", "setupPaddings", "left", "top", "right", "bottom", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setupBackground", "color", "", "createBackground", "Landroid/graphics/drawable/Drawable;", "bindIcon", "iconWithPosition", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalPriceCardView extends ConstraintLayout {
    private AtomAction action;
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp2;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final PriceAtomView priceAV;

    @NotNull
    private final TextAtomV2View textAV;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float BACKGROUND_CORNER_RADIUS = ResourceExtKt.toPxF(12);

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.totalV3.presentation.views.TotalPriceCardView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Function1<AtomAction, Unit> actionHandler;
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction atomAction = TotalPriceCardView.this.action;
            if (atomAction == null || (actionHandler = TotalPriceCardView.this.getActionHandler()) == null) {
                return;
            }
            actionHandler.invoke(atomAction);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/views/TotalPriceCardView$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO.PositionVO.values().length];
            try {
                iArr[TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO.PositionVO.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO.PositionVO.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TotalPriceCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindIcon(TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO iconWithPosition) {
        IconHolderKt.bindOrGone$default(this.iconView, iconWithPosition != null ? iconWithPosition.getIcon() : null, null, 2, null);
        if (iconWithPosition == null || iconWithPosition.getIcon() == null) {
            return;
        }
        d dVar = new d();
        dVar.p(this);
        int i11 = WhenMappings.$EnumSwitchMapping$0[iconWithPosition.getPosition().ordinal()];
        if (i11 == 1) {
            ConstraintSetExtKt.startToStart$default(dVar, this.iconView.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.startToEnd(dVar, this.textAV.getId(), this.iconView.getId(), this.dp2);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            ConstraintSetExtKt.endToEnd$default(dVar, this.iconView.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToStart(dVar, this.textAV.getId(), this.iconView.getId(), this.dp2);
        }
        dVar.f(this);
    }

    private final Drawable createBackground(int color) {
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = BACKGROUND_CORNER_RADIUS;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(color);
        return shapeDrawable;
    }

    private final void setupBackground(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        setBackground(parseColor != null ? createBackground(parseColor.intValue()) : null);
    }

    private final void setupPaddings(Integer left, Integer top, Integer right, Integer bottom) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (left != null) {
            int intValue = left.intValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = ResourceExtKt.toPx(intValue, context);
        } else {
            i11 = 0;
        }
        if (top != null) {
            int intValue2 = top.intValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i12 = ResourceExtKt.toPx(intValue2, context2);
        } else {
            i12 = 0;
        }
        if (right != null) {
            int intValue3 = right.intValue();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            i13 = ResourceExtKt.toPx(intValue3, context3);
        } else {
            i13 = 0;
        }
        if (bottom != null) {
            int intValue4 = bottom.intValue();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            i14 = ResourceExtKt.toPx(intValue4, context4);
        } else {
            i14 = 0;
        }
        setPadding(i11, 0, i13, 0);
        d dVar = new d();
        dVar.p(this);
        dVar.e0(this.priceAV.getId(), 3, i12);
        dVar.e0(this.textAV.getId(), 4, i14);
        dVar.f(this);
    }

    public final void bind(@NotNull TotalVO.TotalItemVO.PriceBlockVO.PriceCardVO priceCard) {
        Intrinsics.checkNotNullParameter(priceCard, "priceCard");
        this.action = priceCard.getAction();
        setupBackground(priceCard.getBackgroundColor());
        setupPaddings(priceCard.getLeftPadding(), priceCard.getTopPadding(), priceCard.getRightPadding(), priceCard.getBottomPadding());
        PriceAtomHolderKt.bind$default(this.priceAV, priceCard.getPrice(), null, 2, null);
        TextHolderKt.bind$default(this.textAV, priceCard.getTextWithIcon().getText(), null, 2, null);
        bindIcon(priceCard.getTextWithIcon().getIconWithPosition());
    }

    public final void bindOrGone(TotalVO.TotalItemVO.PriceBlockVO.PriceCardVO priceCard) {
        if (priceCard == null) {
            ViewExtKt.gone(this);
        } else {
            bind(priceCard);
            ViewExtKt.show(this);
        }
    }

    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceCardView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        PriceAtomView priceAtomView = new PriceAtomView(context, null, 0, 6, null);
        priceAtomView.setId(View.generateViewId());
        this.priceAV = priceAtomView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        this.textAV = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        ViewExtKt.gone(iconView);
        this.iconView = iconView;
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        addView(priceAtomView, new ConstraintLayout.b(-2, -2));
        addView(textAtomV2View, new ConstraintLayout.b(-2, -2));
        addView(iconView, new ConstraintLayout.b(-2, -2));
        ViewExtKt.setOnClickListenerThrottle$default(this, 0L, new AnonymousClass1(), 1, null);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop$default(dVar, priceAtomView.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, textAtomV2View.getId(), priceAtomView.getId(), -px);
        ConstraintSetExtKt.bottomToBottom$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, iconView.getId(), textAtomV2View.getId(), px);
        ConstraintSetExtKt.topToTop$default(dVar, iconView.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, iconView.getId(), textAtomV2View.getId(), 0, 4, null);
        dVar.f(this);
    }
}
