package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.alternativePriceBlock;

import De.C2860c;
import F3.G;
import Im.a;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AlternativePriceBlockVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/alternativePriceBlock/AlternativePriceBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp6", "dp8", "titleTV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "milesBadgeBV", "Lru/ozon/uni/android/atom/badge/BadgeView;", "priceBadgeBV", "pricePV", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AlternativePriceBlockVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "addViews", "setConstraints", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativePriceBlockView extends ConstraintLayout {
    public static final int $stable;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final BadgeView milesBadgeBV;

    @NotNull
    private final BadgeView priceBadgeBV;

    @NotNull
    private final PriceAtomView pricePV;

    @NotNull
    private final TextAtomV2View titleTV;

    static {
        int i11 = PriceAtomView.$stable;
        int i12 = BadgeView.$stable;
        $stable = i11 | i12 | i12 | TextAtomV2View.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlternativePriceBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp6 = UiExtKt.toPx(6, context);
        this.dp8 = UiExtKt.toPx(8, context);
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.travelRailwaySeatSelectWithSchemeTitle, -2, -2);
        this.titleTV = textAtomV2View;
        BadgeView badgeView = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        a.c(badgeView, R$id.travelRailwaySeatSelectWithSchemeMilesBadge, -2, -2);
        this.milesBadgeBV = badgeView;
        BadgeView badgeView2 = (BadgeView) qVar.g(N.b(BadgeView.class), context);
        ConstraintLayout.b a11 = com.google.android.gms.internal.mlkit_common.a.a(badgeView2, R$id.travelRailwaySeatSelectWithSchemePriceBadge, -2, -2);
        a11.f41598E = 0.0f;
        badgeView2.setLayoutParams(a11);
        this.priceBadgeBV = badgeView2;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.travelRailwaySeatSelectWithSchemePrice, -2, -2);
        b11.f41616W = true;
        b11.f41598E = 1.0f;
        priceAtomView.setLayoutParams(b11);
        this.pricePV = priceAtomView;
        addViews();
        setConstraints();
    }

    private final void addViews() {
        addView(this.titleTV);
        addView(this.milesBadgeBV);
        addView(this.priceBadgeBV);
        addView(this.pricePV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new AlternativePriceBlockView$setConstraints$1(this));
    }

    public final void bind(@NotNull AlternativePriceBlockVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(this.titleTV, item.getTitle(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.milesBadgeBV, item.getMilesBadge(), actionHandler);
        BadgeHolderKt.bindOrGone(this.priceBadgeBV, item.getPriceBadge(), actionHandler);
        PriceAtomHolderKt.bind$default(this.pricePV, item.getPrice(), null, 2, null);
    }
}
