package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffBadge;
import ru.ozon.app.android.travel.molecules.view.starsBadge.v1.StarsBadgeView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0014J0\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014J*\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00180(J$\u0010*\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00180(H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/PriceWithMilesViewGroup;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dimensProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp4", "", "pricePav", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getPricePav", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "pricePav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "starsBadge", "Lru/ozon/app/android/travel/molecules/view/starsBadge/v1/StarsBadgeView;", "milesBv", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getMilesBv", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "milesBv$delegate", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "badge", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffBadge;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindBadge", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceWithMilesViewGroup extends ViewGroup {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(PriceWithMilesViewGroup.class, "pricePav", "getPricePav()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0), C2438a.c(PriceWithMilesViewGroup.class, "milesBv", "getMilesBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable;

    @NotNull
    private final DesignSystemDimensProvider dimensProvider;
    private final int dp4;

    /* renamed from: milesBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate milesBv;

    /* renamed from: pricePav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate pricePav;

    @NotNull
    private final StarsBadgeView starsBadge;

    static {
        int i11 = BadgeView.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i12 | StarsBadgeView.$stable | PriceAtomView.$stable | i12 | DesignSystemDimensProvider.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceWithMilesViewGroup(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dimensProvider = dimens$default;
        this.dp4 = dimens$default.getMargin4();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.pricePav = new PreCreationViewPoolDelegate(context2, N.b(PriceAtomView.class), new PriceWithMilesViewGroup$special$$inlined$preCreationViewPool$default$1(this), new PriceWithMilesViewGroup$special$$inlined$preCreationViewPool$default$2());
        StarsBadgeView starsBadgeView = new StarsBadgeView(context);
        starsBadgeView.setId(R$id.hotelsRoomsListV5StarsBv);
        starsBadgeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ViewExtKt.gone(starsBadgeView);
        this.starsBadge = starsBadgeView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.milesBv = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new PriceWithMilesViewGroup$special$$inlined$preCreationViewPool$default$3(this), new PriceWithMilesViewGroup$special$$inlined$preCreationViewPool$default$4());
        addView(getPricePav());
        addView(getMilesBv());
        addView(starsBadgeView);
    }

    private final void bindBadge(TariffBadge badge, Function1<? super AtomAction, Unit> onAction) {
        if (badge instanceof TariffBadge.MilesBadge) {
            ViewExtKt.gone(this.starsBadge);
            BadgeHolderKt.bindOrGone(getMilesBv(), ((TariffBadge.MilesBadge) badge).getMilesBadge(), onAction);
        } else if (badge instanceof TariffBadge.StarsBadge) {
            ViewExtKt.gone(getMilesBv());
            this.starsBadge.bindOrGone(((TariffBadge.StarsBadge) badge).getStarsBadge(), onAction);
        } else {
            if (!Intrinsics.d(badge, TariffBadge.None.INSTANCE)) {
                throw new o();
            }
            ViewExtKt.gone(this.starsBadge);
            ViewExtKt.gone(getMilesBv());
        }
    }

    private final BadgeView getMilesBv() {
        return (BadgeView) this.milesBv.getValue(this, $$delegatedProperties[1]);
    }

    private final PriceAtomView getPricePav() {
        return (PriceAtomView) this.pricePav.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull PriceDTO price, @NotNull TariffBadge badge, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        PriceAtomHolderKt.bind$default(getPricePav(), price, null, 2, null);
        bindBadge(badge, onAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        LayoutExtKt.layoutLeftTop(getPricePav(), getPaddingStart(), getPaddingTop());
        if (getMilesBv().getVisibility() == 0) {
            LayoutExtKt.layoutRightTop(getMilesBv(), measuredWidth, (measuredHeight - getMilesBv().getMeasuredHeight()) / 2);
        }
        if (this.starsBadge.getVisibility() == 0) {
            StarsBadgeView starsBadgeView = this.starsBadge;
            LayoutExtKt.layoutRightTop(starsBadgeView, measuredWidth, (measuredHeight - starsBadgeView.getMeasuredHeight()) / 2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChild(getMilesBv(), widthMeasureSpec, heightMeasureSpec);
        measureChild(this.starsBadge, widthMeasureSpec, heightMeasureSpec);
        Pair pair = getMilesBv().getVisibility() == 0 ? new Pair(Integer.valueOf(getMilesBv().getMeasuredWidth()), Integer.valueOf(getMilesBv().getMeasuredHeight())) : this.starsBadge.getVisibility() == 0 ? new Pair(Integer.valueOf(this.starsBadge.getMeasuredWidth()), Integer.valueOf(this.starsBadge.getMeasuredHeight())) : new Pair(0, 0);
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        getPricePav().measure(View.MeasureSpec.makeMeasureSpec((Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingStart()) - getPaddingEnd()) - intValue) - this.dp4, LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + Math.max(getPricePav().getMeasuredHeight(), intValue2), 1073741824));
    }
}
