package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewHolder;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view.AdvBannerV4PlainItemView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.rv.looped.LoopedAdapter;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\b\u0000\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010%\u001a\u00020\u00062\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\"\u0010+\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R6\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0016@WX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemAdapter;", "Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder;", "viewHolder", "Lkotlin/Function1;", "", "trackClick", "Lkotlin/Function0;", "trackViewAndImpression", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lxe/M;", "loadScope", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lxe/M;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "Landroid/content/Context;", "context", "createAdvBannerPlainItemView", "(Landroid/content/Context;)Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "", "viewType", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "holder", "item", "position", "onBind", "(Ljk0/j;Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;I)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lxe/M;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "bgColor", "I", "getBgColor", "()I", "setBgColor", "(I)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainItemAdapter extends LoopedAdapter<AdvBannerV4ItemVO> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int VIEW_MARGIN_PX = ResourceExtKt.toPx(4);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private int bgColor;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private List<AdvBannerV4ItemVO> items;

    @NotNull
    private final M loadScope;

    @NotNull
    private final Function1<AdvBannerV4ItemVO, Unit> trackClick;

    @NotNull
    private final Function0<Unit> trackViewAndImpression;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemAdapter$Companion;", "", "<init>", "()V", "VIEW_MARGIN_PX", "", "getVIEW_MARGIN_PX", "()I", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getVIEW_MARGIN_PX() {
            return AdvBannerV4PlainItemAdapter.VIEW_MARGIN_PX;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvBannerV4PlainItemAdapter(@NotNull AdvBannerV4PlainViewHolder viewHolder, @NotNull Function1<? super AdvBannerV4ItemVO, Unit> trackClick, @NotNull Function0<Unit> trackViewAndImpression, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull M loadScope, @NotNull FeatureChecker featureChecker) {
        super(viewHolder, 3);
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(trackClick, "trackClick");
        Intrinsics.checkNotNullParameter(trackViewAndImpression, "trackViewAndImpression");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.trackClick = trackClick;
        this.trackViewAndImpression = trackViewAndImpression;
        this.actionHandler = actionHandler;
        this.loadScope = loadScope;
        this.featureChecker = featureChecker;
        this.bgColor = R$color.layer_floor_1;
        this.items = K.f71697a;
    }

    private final AdvBannerV4PlainItemView createAdvBannerPlainItemView(Context context) {
        AdvBannerV4PlainItemView advBannerV4PlainItemView = (AdvBannerV4PlainItemView) q.f64554a.i(N.b(AdvBannerV4PlainItemView.class), context);
        return advBannerV4PlainItemView == null ? new AdvBannerV4PlainItemView(context, null, 0, 6, null) : advBannerV4PlainItemView;
    }

    private final AdvBannerV4PlainItemView createView(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdvBannerV4PlainItemView createAdvBannerPlainItemView = createAdvBannerPlainItemView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i11 = VIEW_MARGIN_PX;
        layoutParams.setMargins(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i11, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        createAdvBannerPlainItemView.setLayoutParams(layoutParams);
        return createAdvBannerPlainItemView;
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    @NotNull
    public List<AdvBannerV4ItemVO> getItems() {
        return this.items;
    }

    public final void setBgColor(int i11) {
        this.bgColor = i11;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void setItems(@NotNull List<AdvBannerV4ItemVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.d(this.items, value)) {
            return;
        }
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // ru.ozon.app.android.platform.rv.looped.LoopedAdapter
    public void onBind(@NotNull j holder, @NotNull AdvBannerV4ItemVO item, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ((AdvBannerV4PlainItemViewHolder) holder).bind(item, this.bgColor);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AdvBannerV4PlainItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AdvBannerV4PlainItemViewHolder(createView(parent), this.trackClick, this.trackViewAndImpression, this.actionHandler, this.loadScope, this.featureChecker);
    }
}
