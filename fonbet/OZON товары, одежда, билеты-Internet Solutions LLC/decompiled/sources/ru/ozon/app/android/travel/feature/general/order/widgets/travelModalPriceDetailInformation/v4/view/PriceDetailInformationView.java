package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.adapter.TravelModalPriceDetailInformationV4Adapter;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.adapter.TravelModalPriceDetailInformationV4Decoration;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/view/PriceDetailInformationView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/adapter/TravelModalPriceDetailInformationV4Adapter;", "priceSectionsAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/adapter/TravelModalPriceDetailInformationV4Adapter;", "", "dp16", "I", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroidx/recyclerview/widget/RecyclerView;", "priceSectionsRV", "Landroidx/recyclerview/widget/RecyclerView;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceDetailInformationView extends LinearLayout {
    private final int dp16;

    @NotNull
    private final TextAtomV2View header;

    @NotNull
    private final TravelModalPriceDetailInformationV4Adapter priceSectionsAdapter;

    @NotNull
    private final RecyclerView priceSectionsRV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceDetailInformationView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TravelModalPriceDetailInformationV4Adapter travelModalPriceDetailInformationV4Adapter = new TravelModalPriceDetailInformationV4Adapter();
        this.priceSectionsAdapter = travelModalPriceDetailInformationV4Adapter;
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = px;
        textAtomV2View.setLayoutParams(layoutParams);
        this.header = textAtomV2View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.priceSectionsRV = recyclerView;
        setOrientation(1);
        addView(textAtomV2View);
        addView(recyclerView);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setPadding(px, 0, px, px);
        recyclerView.setAdapter(travelModalPriceDetailInformationV4Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new TravelModalPriceDetailInformationV4Decoration(context));
    }

    public final void bind(@NotNull TravelModalPriceDetailInformationV4VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.header, item.getHeader(), null, 2, null);
        this.priceSectionsAdapter.submitList(item.getPriceSections());
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.priceSectionsRV.setRecycledViewPool(pool);
    }
}
