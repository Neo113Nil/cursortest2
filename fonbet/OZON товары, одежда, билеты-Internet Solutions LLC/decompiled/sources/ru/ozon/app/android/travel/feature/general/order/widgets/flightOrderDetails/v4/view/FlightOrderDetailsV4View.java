package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import Am.C2438a;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.presentation.FlightOrderDetailsV4VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.adapter.FlightOrderDetailsV4Adapter;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view.adapter.FlightOrderDetailsV4Decoration;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001d0!j\u0002`#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001a\u0010\u000f¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/FlightOrderDetailsV4View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp12", "dp16", "dpf24", "", "headerTitle", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getHeaderTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "headerTitle$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "headerSubTitle", "getHeaderSubTitle", "headerSubTitle$delegate", "segmentsAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/view/adapter/FlightOrderDetailsV4Adapter;", "segmentsRV", "Landroidx/recyclerview/widget/RecyclerView;", "infoText", "getInfoText", "infoText$delegate", "bind", "", "data", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v4/presentation/FlightOrderDetailsV4VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightOrderDetailsV4View.class, "headerTitle", "getHeaderTitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightOrderDetailsV4View.class, "headerSubTitle", "getHeaderSubTitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightOrderDetailsV4View.class, "infoText", "getInfoText()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final float dpf24;

    /* renamed from: headerSubTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate headerSubTitle;

    /* renamed from: headerTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate headerTitle;

    /* renamed from: infoText$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate infoText;

    @NotNull
    private final FlightOrderDetailsV4Adapter segmentsAdapter;

    @NotNull
    private final RecyclerView segmentsRV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV4View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = UiExtKt.toPx(2, context);
        int px = UiExtKt.toPx(12, context);
        this.dp12 = px;
        int px2 = UiExtKt.toPx(16, context);
        this.dp16 = px2;
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dpf24 = pxF;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.headerTitle = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new FlightOrderDetailsV4View$special$$inlined$preCreationViewPool$default$1(this), new FlightOrderDetailsV4View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.headerSubTitle = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightOrderDetailsV4View$special$$inlined$preCreationViewPool$default$3(this), new FlightOrderDetailsV4View$special$$inlined$preCreationViewPool$default$4(this));
        FlightOrderDetailsV4Adapter flightOrderDetailsV4Adapter = new FlightOrderDetailsV4Adapter();
        this.segmentsAdapter = flightOrderDetailsV4Adapter;
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(flightOrderDetailsV4Adapter);
        recyclerView.addItemDecoration(new FlightOrderDetailsV4Decoration(context));
        recyclerView.setNestedScrollingEnabled(false);
        this.segmentsRV = recyclerView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.infoText = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new FlightOrderDetailsV4View$special$$inlined$preCreationViewPool$default$5(this), new FlightOrderDetailsV4View$special$$inlined$preCreationViewPool$default$6(this));
        setPadding(px2, px2, px2, px2);
        setOrientation(1);
        addView(getHeaderTitle());
        addView(getHeaderSubTitle());
        addView(recyclerView);
        addView(getInfoText());
        setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(context, R$attr.layerFloor1), pxF));
    }

    private final TextAtomV2View getHeaderSubTitle() {
        return (TextAtomV2View) this.headerSubTitle.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getHeaderTitle() {
        return (TextAtomV2View) this.headerTitle.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getInfoText() {
        return (TextAtomV2View) this.infoText.getValue(this, $$delegatedProperties[2]);
    }

    public final void bind(@NotNull FlightOrderDetailsV4VO data, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bindOrGone$default(getHeaderTitle(), data.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getHeaderSubTitle(), data.getSubtitle(), null, 2, null);
        this.segmentsAdapter.setupActionHandler(actionHandler);
        this.segmentsAdapter.submitList(data.getSegmentParts());
        TextHolderKt.bindOrGone$default(getInfoText(), data.getInfo(), null, 2, null);
    }
}
