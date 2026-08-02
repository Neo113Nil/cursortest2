package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Space;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.TravelRailwaySearchResultsV4TrainVO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/view/TravelRailwaySearchResultsV4TypePriceView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "typeName", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTypeName", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "typeName$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "seatsCount", "getSeatsCount", "seatsCount$delegate", "space", "Landroid/widget/Space;", "typePrice", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "getTypePrice", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "typePrice$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySearchResults/v4/presentation/train/TravelRailwaySearchResultsV4TrainVO$CarriageTypeVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySearchResultsV4TypePriceView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TravelRailwaySearchResultsV4TypePriceView.class, "typeName", "getTypeName()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelRailwaySearchResultsV4TypePriceView.class, "seatsCount", "getSeatsCount()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TravelRailwaySearchResultsV4TypePriceView.class, "typePrice", "getTypePrice()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", 0)};
    public static final int $stable = 8;
    private final int dp4;

    /* renamed from: seatsCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate seatsCount;

    @NotNull
    private final Space space;

    /* renamed from: typeName$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate typeName;

    /* renamed from: typePrice$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate typePrice;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySearchResultsV4TypePriceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = UiExtKt.toPx(4, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.typeName = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$1(this), new TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.seatsCount = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$3(this), new TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$4());
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        this.space = space;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.typePrice = new PreCreationViewPoolDelegate(context4, N.b(PriceAtomView.class), new TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$5(this), new TravelRailwaySearchResultsV4TypePriceView$special$$inlined$preCreationViewPool$default$6(this));
        setOrientation(0);
        addView(getTypeName());
        addView(getSeatsCount());
        addView(space);
        addView(getTypePrice());
    }

    private final TextAtomV2View getSeatsCount() {
        return (TextAtomV2View) this.seatsCount.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTypeName() {
        return (TextAtomV2View) this.typeName.getValue(this, $$delegatedProperties[0]);
    }

    private final PriceAtomView getTypePrice() {
        return (PriceAtomView) this.typePrice.getValue(this, $$delegatedProperties[2]);
    }

    public final void bind(@NotNull TravelRailwaySearchResultsV4TrainVO.CarriageTypeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bind$default(getTypeName(), item.getTypeName(), null, 2, null);
        TextHolderKt.bind$default(getSeatsCount(), item.getSeatsCount(), null, 2, null);
        PriceAtomHolderKt.bindOrGone$default(getTypePrice(), item.getTypePrice(), null, 2, null);
    }
}
