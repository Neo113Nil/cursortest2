package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.FlightOrderDetailsV2VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.presentation.adapter.FlightOrderDetailsV2Adapter;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/view/FlightOrderDetailsV2View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initView", "()V", "addViews", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/FlightOrderDetailsV2VO;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/FlightOrderDetailsV2Adapter;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$u;", "viewPool", "setUpRecyclerView", "(Lru/ozon/app/android/travel/feature/general/order/widgets/flightOrderDetails/v2/presentation/adapter/FlightOrderDetailsV2Adapter;Landroidx/recyclerview/widget/RecyclerView$u;)V", "", "dp4", "I", "", "dp8F", "F", "dp12", "dp12F", "dp16", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "title$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitle", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle$delegate", "getSubtitle", "subtitle", "Landroidx/recyclerview/widget/RecyclerView;", "segments", "Landroidx/recyclerview/widget/RecyclerView;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV2View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightOrderDetailsV2View.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0), C2438a.c(FlightOrderDetailsV2View.class, "subtitle", "getSubtitle()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", 0)};
    public static final int $stable = 8;
    private final int dp12;
    private final float dp12F;
    private final int dp16;
    private final int dp4;
    private final float dp8F;

    @NotNull
    private final RecyclerView segments;

    /* renamed from: subtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate subtitle;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp8F = ResourceExtKt.toPxF(8, context);
        int px = UiExtKt.toPx(12, context);
        this.dp12 = px;
        this.dp12F = ResourceExtKt.toPxF(12, context);
        this.dp16 = UiExtKt.toPx(16, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context2, N.b(TextAtomView.class), new FlightOrderDetailsV2View$special$$inlined$preCreationViewPool$default$1(this), new FlightOrderDetailsV2View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.subtitle = new PreCreationViewPoolDelegate(context3, N.b(TextAtomView.class), new FlightOrderDetailsV2View$special$$inlined$preCreationViewPool$default$3(this), new FlightOrderDetailsV2View$special$$inlined$preCreationViewPool$default$4(this));
        RecyclerView recyclerView = new RecyclerView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, px, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        this.segments = recyclerView;
        initView();
        addViews();
    }

    private final void addViews() {
        addView(getTitle());
        addView(getSubtitle());
        addView(this.segments);
    }

    private final TextAtomView getSubtitle() {
        return (TextAtomView) this.subtitle.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomView getTitle() {
        return (TextAtomView) this.title.getValue(this, $$delegatedProperties[0]);
    }

    private final void initView() {
        setOrientation(1);
        ViewExtensionsKt.applyRoundedOutline(this, getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()), this.dp12F);
        setElevation(this.dp8F);
        int i11 = this.dp16;
        setPadding(i11, i11, i11, i11);
    }

    public final void bind(@NotNull FlightOrderDetailsV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomHolderKt.bind$default(getTitle(), item.getTitle(), null, 2, null);
        TextAtomHolderKt.bind$default(getSubtitle(), item.getSubtitle(), null, 2, null);
    }

    public final void setUpRecyclerView(@NotNull FlightOrderDetailsV2Adapter adapter, @NotNull RecyclerView.u viewPool) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        RecyclerView recyclerView = this.segments;
        recyclerView.setAdapter(adapter);
        recyclerView.setRecycledViewPool(viewPool);
    }
}
