package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Space;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3FinalPriceView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "infoIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "spacerView", "Landroid/widget/Space;", "priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "state", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "bind", "", "addViews", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3FinalPriceView extends LinearLayout {

    @NotNull
    private final IconView infoIconView;

    @NotNull
    private final PriceAtomView priceView;

    @NotNull
    private final Space spacerView;
    private HotelsBookTotalV3VO.Price.Final state;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3FinalPriceView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        this.textView = textAtomV2View;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        if (iconView == null) {
            context2 = context;
            iconView = new IconView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.infoIconView = iconView;
        Space space = new Space(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        this.spacerView = space;
        PriceAtomView priceAtomView = (PriceAtomView) qVar.i(N.b(PriceAtomView.class), context2);
        priceAtomView = priceAtomView == null ? new PriceAtomView(context2, null, 0, 6, null) : priceAtomView;
        priceAtomView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.priceView = priceAtomView;
        setOrientation(0);
        setGravity(16);
        addViews();
    }

    private final void addViews() {
        addView(this.textView);
        addView(this.infoIconView);
        addView(this.spacerView);
        addView(this.priceView);
    }

    public final void bind(@NotNull HotelsBookTotalV3VO.Price.Final state) {
        Intrinsics.checkNotNullParameter(state, "state");
        HotelsBookTotalV3VO.Price.Final r02 = this.state;
        if (!Intrinsics.d(r02 != null ? r02.getName() : null, state.getName())) {
            TextHolderKt.bind$default(this.textView, state.getName(), null, 2, null);
        }
        HotelsBookTotalV3VO.Price.Final r03 = this.state;
        if (!Intrinsics.d(r03 != null ? r03.getInfoIcon() : null, state.getInfoIcon())) {
            IconHolderKt.bindOrGone$default(this.infoIconView, state.getInfoIcon(), null, 2, null);
        }
        HotelsBookTotalV3VO.Price.Final r04 = this.state;
        if (!Intrinsics.d(r04 != null ? r04.getPrice() : null, state.getPrice())) {
            PriceAtomHolderKt.bind$default(this.priceView, state.getPrice(), null, 2, null);
        }
        this.state = state;
    }
}
