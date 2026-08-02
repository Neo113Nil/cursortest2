package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view;

import D40.d;
import De.C2860c;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.mlkit_common.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u001bJ\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/PriceDetailsItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "nameTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "infoButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "barrier", "Landroidx/constraintlayout/widget/Barrier;", "priceTextView", "bonusBadge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "noteTextView", "detailsButton", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonView;", "extendedPriceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$PriceDetailItemVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createTextView", "id", "addChildren", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PriceDetailsItemView extends ConstraintLayout {

    @NotNull
    private final Barrier barrier;

    @NotNull
    private final BadgeView bonusBadge;

    @NotNull
    private final LinkButtonView detailsButton;
    private final int dp4;

    @NotNull
    private final PriceAtomView extendedPriceView;

    @NotNull
    private final IconButtonV3View infoButtonView;

    @NotNull
    private final TextAtomV2View nameTextView;

    @NotNull
    private final TextAtomV2View noteTextView;

    @NotNull
    private final TextAtomV2View priceTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceDetailsItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        TextAtomV2View createTextView = createTextView(9738);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41657u = 9744;
        bVar.f41603J = 2;
        bVar.f41598E = 0.0f;
        bVar.setMarginEnd(px);
        createTextView.setLayoutParams(bVar);
        this.nameTextView = createTextView;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, 9744, -2, -2);
        c11.f41636i = 9738;
        c11.f41642l = 9738;
        c11.f41655s = 9738;
        c11.f41657u = 9739;
        iconButtonV3View.setLayoutParams(c11);
        this.infoButtonView = iconButtonV3View;
        Barrier barrier = new Barrier(context);
        barrier.setId(9739);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{9740, 9741, 9745});
        barrier.f(5);
        this.barrier = barrier;
        TextAtomV2View createTextView2 = createTextView(9740);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41636i = 0;
        bVar2.f41658v = 0;
        createTextView2.setLayoutParams(bVar2);
        this.priceTextView = createTextView2;
        BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
        ConstraintLayout.b a11 = a.a(badgeView, 9741, -2, -2);
        a11.f41638j = 9740;
        a11.f41658v = 0;
        badgeView.setLayoutParams(a11);
        badgeView.setVisibility(8);
        this.bonusBadge = badgeView;
        TextAtomV2View createTextView3 = createTextView(9742);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41656t = 0;
        bVar3.f41658v = 9739;
        bVar3.f41638j = 9738;
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = px;
        createTextView3.setLayoutParams(bVar3);
        createTextView3.setVisibility(8);
        this.noteTextView = createTextView3;
        LinkButtonView linkButtonView = new LinkButtonView(context, null, 0, 0, 14, null);
        linkButtonView.setId(9743);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41656t = 0;
        bVar4.f41658v = 9739;
        bVar4.f41638j = 9742;
        bVar4.f41616W = true;
        bVar4.f41598E = 0.0f;
        linkButtonView.setLayoutParams(bVar4);
        linkButtonView.setVisibility(8);
        this.detailsButton = linkButtonView;
        PriceAtomView priceAtomView = (PriceAtomView) q.f64554a.i(N.b(PriceAtomView.class), context);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context, null, 0, 6, null) : priceAtomView;
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, 9745, -2, -2);
        b11.f41636i = 0;
        b11.f41658v = 0;
        priceAtomView.setLayoutParams(b11);
        this.extendedPriceView = priceAtomView;
        addChildren();
    }

    private final void addChildren() {
        addView(this.nameTextView);
        addView(this.infoButtonView);
        addView(this.barrier);
        addView(this.priceTextView);
        addView(this.bonusBadge);
        addView(this.noteTextView);
        addView(this.detailsButton);
        addView(this.extendedPriceView);
    }

    private final TextAtomV2View createTextView(int id2) {
        q qVar = q.f64554a;
        kotlin.reflect.d b11 = N.b(TextAtomV2View.class);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(b11, context);
        textAtomV2View.setId(id2);
        return textAtomV2View;
    }

    public final void bind(@NotNull HotelsBookTotalV2VO.PriceDetailItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.nameTextView, item.getName(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.infoButtonView, item.getInfoButton(), actionHandler);
        TextHolderKt.bindOrGone$default(this.priceTextView, item.getPrice(), null, 2, null);
        BadgeHolderKt.bindOrGone(this.bonusBadge, item.getBadge(), actionHandler);
        TextHolderKt.bindOrGone$default(this.noteTextView, item.getNote(), null, 2, null);
        this.detailsButton.bindOrGone(item.getDetailsButton(), actionHandler);
        PriceAtomHolderKt.bindOrGone$default(this.extendedPriceView, item.getExtendedPrice(), null, 2, null);
    }
}
