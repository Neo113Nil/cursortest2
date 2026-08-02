package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.presentation.FlightOrderDetailsV3VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.view.adapter.FlightOrderDetailsV3Adapter;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v3.view.adapter.FlightOrderDetailsV3Decoration;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/FlightOrderDetailsV3View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "dpf16", "", "headerTitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "headerSubTitle", "segmentsAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/view/adapter/FlightOrderDetailsV3Adapter;", "segments", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "", "data", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v3/presentation/FlightOrderDetailsV3VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateMarginBeforeSegments", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV3View extends LinearLayout {
    private final int dp16;
    private final int dp8;
    private final float dpf16;

    @NotNull
    private final TextAtomV2View headerSubTitle;

    @NotNull
    private final TextAtomV2View headerTitle;

    @NotNull
    private final RecyclerView segments;

    @NotNull
    private final FlightOrderDetailsV3Adapter segmentsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV3View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dpf16 = pxF;
        q qVar = q.f64554a;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px2, px, px2, 0);
        textAtomV2View.setLayoutParams(layoutParams);
        addView(g10);
        this.headerTitle = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(px2, 0, px2, 0);
        textAtomV2View2.setLayoutParams(layoutParams2);
        addView(g11);
        this.headerSubTitle = textAtomV2View2;
        FlightOrderDetailsV3Adapter flightOrderDetailsV3Adapter = new FlightOrderDetailsV3Adapter();
        this.segmentsAdapter = flightOrderDetailsV3Adapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(flightOrderDetailsV3Adapter);
        recyclerView.addItemDecoration(new FlightOrderDetailsV3Decoration(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF));
        recyclerView.setPadding(px2, px2, px2, px2);
        addView(recyclerView);
        this.segments = recyclerView;
        setOrientation(1);
    }

    private final void updateMarginBeforeSegments(FlightOrderDetailsV3VO data) {
        if (data.getTitle() == null && data.getSubtitle() == null) {
            ViewExtensionsKt.safeUpdateMargins$default(this.segments, 0, null, null, null, 14, null);
        } else {
            ViewExtensionsKt.safeUpdateMargins$default(this.segments, Integer.valueOf(this.dp8), null, null, null, 14, null);
        }
    }

    public final void bind(@NotNull FlightOrderDetailsV3VO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone$default(this.headerTitle, data.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.headerSubTitle, data.getSubtitle(), null, 2, null);
        updateMarginBeforeSegments(data);
        this.segmentsAdapter.setupActionHandler(actionHandler);
        this.segmentsAdapter.submitList(data.getSegmentParts());
    }
}
