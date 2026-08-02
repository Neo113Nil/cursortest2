package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation;

import Pc.a;
import Vg.c;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.delegate.SkuScrollMultiFrameDelegateProvider;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.videocover.VideoTileDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0002\b\u00030\u0015j\u0006\u0012\u0002\b\u0003`\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020*2\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020*H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010>R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010?R \u0010\u0017\u001a\u000e\u0012\u0002\b\u00030\u0015j\u0006\u0012\u0002\b\u0003`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010AR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u0018\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010CR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010DR\"\u0010E\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR6\u0010N\u001a\b\u0012\u0004\u0012\u00020L0K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR&\u0010V\u001a\u00060Tj\u0002`U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductsAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LPc/a;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegateProvider;", "frameDelegateProvider", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "videoTileDelegate", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;LPc/a;Lkotlin/jvm/functions/Function1;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegateProvider;Lru/ozon/app/android/videocover/VideoTileDelegate;LVg/c;Lru/ozon/app/android/video/preload/PlayerPreloader;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;", "buildItemView", "(Landroid/content/Context;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/SkuScrollItemView;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductViewHolder;", "holderScroll", "position", "onBindViewHolder", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/presentation/ScrollProductViewHolder;I)V", "getItemViewType", "(I)I", "", "getItemId", "(I)J", "getItemCount", "()I", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "LPc/a;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/scroll/delegate/SkuScrollMultiFrameDelegateProvider;", "Lru/ozon/app/android/videocover/VideoTileDelegate;", "LVg/c;", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "widgetId", "J", "getWidgetId", "()J", "setWidgetId", "(J)V", "", "Lru/ozon/app/android/product/common/product/ProductVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "setWidgetInfo", "(Ll20/d;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScrollProductsAdapter extends LifecycleAdapter<ScrollProductViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AdultListDelegateProvider adultListDelegateProvider;

    @NotNull
    private final a<CartAtomBinder> cartAtomBinder;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final SkuScrollMultiFrameDelegateProvider frameDelegateProvider;

    @NotNull
    private List<ProductVO> items;

    @NotNull
    private final J lifecycleOwner;

    @NotNull
    private final PlayerPreloader playerPreloader;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoTileDelegate videoTileDelegate;
    private long widgetId;
    public d widgetInfo;

    @NotNull
    private final k<?> widgetViewHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollProductsAdapter(@NotNull ComposerReferences ref, @NotNull J lifecycleOwner, @NotNull AdultListDelegateProvider adultListDelegateProvider, @NotNull a<CartAtomBinder> cartAtomBinder, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, @NotNull k<?> widgetViewHolder, @NotNull SkuScrollMultiFrameDelegateProvider frameDelegateProvider, @NotNull VideoTileDelegate videoTileDelegate, @NotNull c customActionHandlersStore, @NotNull PlayerPreloader playerPreloader) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(frameDelegateProvider, "frameDelegateProvider");
        Intrinsics.checkNotNullParameter(videoTileDelegate, "videoTileDelegate");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        this.ref = ref;
        this.lifecycleOwner = lifecycleOwner;
        this.adultListDelegateProvider = adultListDelegateProvider;
        this.cartAtomBinder = cartAtomBinder;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.widgetViewHolder = widgetViewHolder;
        this.frameDelegateProvider = frameDelegateProvider;
        this.videoTileDelegate = videoTileDelegate;
        this.customActionHandlersStore = customActionHandlersStore;
        this.playerPreloader = playerPreloader;
        this.items = K.f71697a;
    }

    private final SkuScrollItemView buildItemView(Context context) {
        Context context2;
        SkuScrollItemView skuScrollItemView = (SkuScrollItemView) q.f64554a.i(N.b(SkuScrollItemView.class), context);
        if (skuScrollItemView == null) {
            context2 = context;
            skuScrollItemView = new SkuScrollItemView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        int px = ResourceExtKt.toPx(4, context2);
        skuScrollItemView.setPadding(px, px, px, ResourceExtKt.toPx(12, context2));
        skuScrollItemView.setLayoutParams(new RecyclerView.p(ResourceExtKt.toPx(124, context2), -1));
        skuScrollItemView.getOverlayTitle().setEmojiCompatEnabled(false);
        skuScrollItemView.getButtonSubtitle().setEmojiCompatEnabled(false);
        return skuScrollItemView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$layout.view_product;
    }

    @NotNull
    public final d getWidgetInfo() {
        d dVar = this.widgetInfo;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.n("widgetInfo");
        throw null;
    }

    public final void setItems(@NotNull List<ProductVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    public final void setWidgetId(long j11) {
        this.widgetId = j11;
    }

    public final void setWidgetInfo(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.widgetInfo = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ScrollProductViewHolder holderScroll, int position) {
        Intrinsics.checkNotNullParameter(holderScroll, "holderScroll");
        holderScroll.bind(this.items.get(position), getWidgetInfo());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ScrollProductViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SkuScrollItemView buildItemView = buildItemView(context);
        J j11 = this.lifecycleOwner;
        ComposerReferences composerReferences = this.ref;
        AdultListDelegate adultListDelegate = this.adultListDelegateProvider.get();
        CartAtomBinder cartAtomBinder = this.cartAtomBinder.get();
        Intrinsics.checkNotNullExpressionValue(cartAtomBinder, "get(...)");
        Function1<AtomAction, Unit> function1 = this.actionHandler;
        l lVar = this.tokenizedAnalytics;
        AdultHandler adultHandler = this.adultHandler;
        long j12 = this.widgetId;
        k<?> kVar = this.widgetViewHolder;
        SkuScrollMultiFrameDelegateProvider skuScrollMultiFrameDelegateProvider = this.frameDelegateProvider;
        FrameBinder frameBinder = this.ref.getFrameBinderProvider().get();
        Intrinsics.checkNotNullExpressionValue(frameBinder, "get(...)");
        return new ScrollProductViewHolder(buildItemView, j11, composerReferences, adultListDelegate, cartAtomBinder, function1, lVar, adultHandler, j12, kVar, skuScrollMultiFrameDelegateProvider.get(frameBinder, this.customActionHandlersStore), this.playerPreloader, this.videoTileDelegate);
    }
}
