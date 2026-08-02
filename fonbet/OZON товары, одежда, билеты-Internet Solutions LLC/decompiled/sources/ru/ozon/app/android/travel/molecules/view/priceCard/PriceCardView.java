package ru.ozon.app.android.travel.molecules.view.priceCard;

import AD.b;
import Lc.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardVO;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015J\u0010\u0010\u001b\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001c\u001a\u00020\u0016H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp8", "price", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "subtitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/Function1;", "", "bind", "item", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "onAction", "bindOrGone", "setConstraints", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PriceCardView extends ConstraintLayout {
    private AtomAction action;
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp8;

    @NotNull
    private final IconView icon;

    @NotNull
    private final PriceAtomView price;

    @NotNull
    private final TextAtomV2View subtitle;

    public /* synthetic */ PriceCardView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$6(PriceCardView priceCardView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = priceCardView.action;
        if (atomAction == null || (function1 = priceCardView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void bind$default(PriceCardView priceCardView, PriceCardVO priceCardVO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        priceCardView.bind(priceCardVO, function1);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new PriceCardView$setConstraints$1(this));
    }

    public final void bind(@NotNull PriceCardVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        PriceCardVO.SettingsVO settings = item.getSettings();
        if (settings != null) {
            setPadding(settings.getLeftPadding(), settings.getTopPadding(), settings.getRightPadding(), settings.getBottomPadding());
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Float valueOf = Float.valueOf(0.0f);
        float[] fArr = new float[8];
        boolean z11 = false;
        for (int i11 = 0; i11 < 8; i11++) {
            PriceCardVO.SettingsVO settings2 = item.getSettings();
            fArr[i11] = settings2 != null ? settings2.getCornerRadius() : 0.0f;
        }
        float[] fArr2 = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            PriceCardVO.SettingsVO settings3 = item.getSettings();
            fArr2[i12] = settings3 != null ? settings3.getCornerRadius() : 0.0f;
        }
        ShapeDrawableWithBorder shapeDrawableWithBorder = new ShapeDrawableWithBorder(context, valueOf, fArr, fArr2);
        ShapeDrawableWithBorder.setFillColor$default(shapeDrawableWithBorder, item.getBackgroundColor(), 0, 2, null);
        setBackground(shapeDrawableWithBorder);
        PriceAtomHolderKt.bind$default(this.price, item.getPrice(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitle, item.getSubtitle(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.icon, item.getIcon(), null, 2, null);
        this.action = item.getAction();
        this.actionHandler = onAction;
        if (onAction != null && item.getAction() != null) {
            z11 = true;
        }
        setClickable(z11);
    }

    public final void bindOrGone(PriceCardVO item) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind$default(this, item, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceCardView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        q qVar = q.f64554a;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        if (priceAtomView == null) {
            context2 = context;
            priceAtomView = new PriceAtomView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        priceAtomView.setId(R$id.priceCardPrice);
        priceAtomView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(priceAtomView);
        this.price = priceAtomView;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        a.d(textAtomV2View, R$id.priceCardSubtitle, -2, -2, false);
        addView(g10);
        this.subtitle = textAtomV2View;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context2);
        iconView = iconView == null ? new IconView(context2, null, 0, 6, null) : iconView;
        iconView.setId(R$id.priceCardIcon);
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView);
        this.icon = iconView;
        setConstraints();
        setOnClickListener(new b(this, 13));
    }
}
