package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children;

import Bi.a;
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
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3BonusesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "spacerView", "Landroid/widget/Space;", "amountView", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "state", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "bindOrGone", "", "addViews", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3BonusesView extends LinearLayout {

    @NotNull
    private final TextAtomV2View amountView;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final Space spacerView;
    private HotelsBookTotalV3VO.Bonuses state;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3BonusesView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-2, -2, textAtomV2View);
        this.textView = textAtomV2View;
        Space space = new Space(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        this.spacerView = space;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-2, -2, textAtomV2View2);
        this.amountView = textAtomV2View2;
        IconView iconView = (IconView) qVar.i(N.b(IconView.class), context);
        iconView = iconView == null ? new IconView(context, null, 0, 6, null) : iconView;
        iconView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.iconView = iconView;
        setOrientation(0);
        setGravity(16);
        addViews();
    }

    private final void addViews() {
        addView(this.textView);
        addView(this.spacerView);
        addView(this.amountView);
        addView(this.iconView);
    }

    public final void bindOrGone(HotelsBookTotalV3VO.Bonuses state) {
        setVisibility(state != null ? 0 : 8);
        if (state != null) {
            HotelsBookTotalV3VO.Bonuses bonuses = this.state;
            if (!Intrinsics.d(bonuses != null ? bonuses.getName() : null, state.getName())) {
                TextHolderKt.bind$default(this.textView, state.getName(), null, 2, null);
            }
            HotelsBookTotalV3VO.Bonuses bonuses2 = this.state;
            if (!Intrinsics.d(bonuses2 != null ? bonuses2.getAmount() : null, state.getAmount())) {
                TextHolderKt.bind$default(this.amountView, state.getAmount(), null, 2, null);
            }
            HotelsBookTotalV3VO.Bonuses bonuses3 = this.state;
            if (!Intrinsics.d(bonuses3 != null ? bonuses3.getIcon() : null, state.getIcon())) {
                IconHolderKt.bindOrGone$default(this.iconView, state.getIcon(), null, 2, null);
            }
        }
        this.state = state;
    }
}
