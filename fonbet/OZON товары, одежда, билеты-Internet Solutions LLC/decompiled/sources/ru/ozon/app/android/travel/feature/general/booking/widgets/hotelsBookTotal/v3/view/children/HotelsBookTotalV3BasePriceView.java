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
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3BasePriceView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "spacerView", "Landroid/widget/Space;", "priceView", "state", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "bindOrGone", "", "addViews", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3BasePriceView extends LinearLayout {

    @NotNull
    private final TextAtomV2View priceView;

    @NotNull
    private final Space spacerView;
    private HotelsBookTotalV3VO.Price.Base state;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3BasePriceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        textAtomV2View.setLayoutParams(layoutParams);
        textAtomV2View.setTextIsSelectable(false);
        this.textView = textAtomV2View;
        Space space = new Space(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        space.setLayoutParams(layoutParams2);
        this.spacerView = space;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View2.setTextIsSelectable(false);
        this.priceView = textAtomV2View2;
        setOrientation(0);
        setGravity(16);
        addViews();
    }

    private final void addViews() {
        addView(this.textView);
        addView(this.spacerView);
        addView(this.priceView);
    }

    public final void bindOrGone(HotelsBookTotalV3VO.Price.Base state) {
        setVisibility(state != null ? 0 : 8);
        if (state != null) {
            HotelsBookTotalV3VO.Price.Base base = this.state;
            if (!Intrinsics.d(base != null ? base.getName() : null, state.getName())) {
                TextHolderKt.bind$default(this.textView, state.getName(), null, 2, null);
            }
            HotelsBookTotalV3VO.Price.Base base2 = this.state;
            if (!Intrinsics.d(base2 != null ? base2.getPrice() : null, state.getPrice())) {
                TextHolderKt.bind$default(this.priceView, state.getPrice(), null, 2, null);
            }
        }
        this.state = state;
    }
}
