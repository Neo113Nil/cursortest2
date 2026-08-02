package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.children;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0014\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/children/HotelsBookTotalV3StarsBonusesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp8", "", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "starsBadge", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeView;", "state", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "bindOrGone", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StarsBonusesView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsBookTotalV3StarsBonusesView.class, "textView", "getTextView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    private final int dp8;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;

    @NotNull
    private final StarsBadgeView starsBadge;
    private HotelsBookTotalV3VO.StarsBonuses state;

    /* renamed from: textView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV3StarsBonusesView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dp8 = dimens$default.getMargin8();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.textView = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new HotelsBookTotalV3StarsBonusesView$special$$inlined$preCreationViewPool$default$1(this), new HotelsBookTotalV3StarsBonusesView$special$$inlined$preCreationViewPool$default$2(this));
        StarsBadgeView starsBadgeView = new StarsBadgeView(context);
        starsBadgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.starsBadge = starsBadgeView;
        setOrientation(0);
        setGravity(16);
        addViews();
    }

    private final void addViews() {
        addView(getTextView());
        addView(this.starsBadge);
    }

    private final TextAtomV2View getTextView() {
        return (TextAtomV2View) this.textView.getValue(this, $$delegatedProperties[0]);
    }

    public final void bindOrGone(HotelsBookTotalV3VO.StarsBonuses state, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setVisibility(state != null ? 0 : 8);
        if (state != null) {
            HotelsBookTotalV3VO.StarsBonuses starsBonuses = this.state;
            if (!Intrinsics.d(starsBonuses != null ? starsBonuses.getName() : null, state.getName())) {
                TextHolderKt.bind$default(getTextView(), state.getName(), null, 2, null);
            }
            HotelsBookTotalV3VO.StarsBonuses starsBonuses2 = this.state;
            if (!Intrinsics.d(starsBonuses2 != null ? starsBonuses2.getStarsBadge() : null, state.getStarsBadge())) {
                this.starsBadge.bindOrGone(state.getStarsBadge(), actionHandler);
            }
        }
        this.state = state;
    }
}
