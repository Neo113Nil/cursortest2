package ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.adapter;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.C5470d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpGradientCouponView;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.model.PdpCouponItemListV2VO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010'\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\t0\t0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2Adapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2ItemViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/model/PdpCouponItemListV2VO;", "", "onHighlightClick", "onCouponApplyClick", "<init>", "(Landroidx/lifecycle/J;LWZ/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2ItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/marketing/widgets/pdpCouponListV2/presentation/adapter/PdpCouponListV2ItemViewHolder;I)V", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/d;", "kotlin.jvm.PlatformType", "asyncDiffer", "Landroidx/recyclerview/widget/d;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpCouponListV2Adapter extends LifecycleAdapter<PdpCouponListV2ItemViewHolder> {

    @NotNull
    private final C5470d<PdpCouponItemListV2VO> asyncDiffer;

    @NotNull
    private List<PdpCouponItemListV2VO> items;

    @NotNull
    private final Function1<PdpCouponItemListV2VO, Unit> onCouponApplyClick;

    @NotNull
    private final Function1<PdpCouponItemListV2VO, Unit> onHighlightClick;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;
    private static final int COUPON_HEIGHT = UiExtKt.toPx(48);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpCouponListV2Adapter(@NotNull J lifecycleOwner, @NotNull l tokenizedAnalytics, @NotNull Function1<? super PdpCouponItemListV2VO, Unit> onHighlightClick, @NotNull Function1<? super PdpCouponItemListV2VO, Unit> onCouponApplyClick) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onHighlightClick, "onHighlightClick");
        Intrinsics.checkNotNullParameter(onCouponApplyClick, "onCouponApplyClick");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onHighlightClick = onHighlightClick;
        this.onCouponApplyClick = onCouponApplyClick;
        this.items = K.f71697a;
        this.asyncDiffer = new C5470d<>(this, new PdpCouponListV2DiffUtilItemCallback());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.asyncDiffer.b().size();
    }

    public final void setItems(@NotNull List<PdpCouponItemListV2VO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        this.asyncDiffer.e(value, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PdpCouponListV2ItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PdpCouponListV2ItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PdpGradientCouponView pdpGradientCouponView = new PdpGradientCouponView(context, null, 0, 6, null);
        pdpGradientCouponView.setLayoutParams(new ViewGroup.LayoutParams(-1, COUPON_HEIGHT));
        return new PdpCouponListV2ItemViewHolder(pdpGradientCouponView, this.tokenizedAnalytics, this.onHighlightClick, this.onCouponApplyClick);
    }
}
