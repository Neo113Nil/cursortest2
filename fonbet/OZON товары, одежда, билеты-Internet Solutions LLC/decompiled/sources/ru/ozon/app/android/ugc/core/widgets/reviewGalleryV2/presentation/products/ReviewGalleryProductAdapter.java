package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import Ej.b;
import Sc.o;
import W10.c;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018Bk\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&J%\u0010,\u001a\u00020\u00052\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favDelegateFactory", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "", "widgetId", "", "isInBottomItems", "isFreshMiniApp", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Lkotlin/jvm/functions/Function0;LW10/c;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;JZZ)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductItemContentDTO;", "newItems", "Lru/ozon/composer/ui/widget/l;", "viewItem", "submitList", "(Ljava/util/List;Lru/ozon/composer/ui/widget/l;)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Lkotlin/jvm/functions/Function0;", "LW10/c;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "J", "Z", "items", "Ljava/util/List;", "Lru/ozon/composer/ui/widget/l;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewGalleryProductAdapter extends RecyclerView.g<RecyclerView.C> {
    private final Function1<AtomAction, Unit> actionHandler;
    private final l analytics;

    @NotNull
    private final ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder;

    @NotNull
    private final Function0<FavoriteProductV4Delegate> favDelegateFactory;
    private final boolean isFreshMiniApp;
    private final boolean isInBottomItems;

    @NotNull
    private List<? extends ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO> items;

    @NotNull
    private final c trackingData;
    private ru.ozon.composer.ui.widget.l viewItem;
    private final long widgetId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int BUTTON_HEIGHT = ResourceExtKt.toPx(54);
    private static final int PRODUCT_ITEM_WIDTH = ResourceExtKt.toPx(235);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ReviewGalleryProductAdapter$Companion;", "", "<init>", "()V", "", "VIEW_TYPE_BUTTON", "I", "VIEW_TYPE_PRODUCT_INFO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewGalleryProductAdapter(Function1<? super AtomAction, Unit> function1, l lVar, @NotNull Function0<? extends FavoriteProductV4Delegate> favDelegateFactory, @NotNull c trackingData, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder, long j11, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(favDelegateFactory, "favDelegateFactory");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
        this.actionHandler = function1;
        this.analytics = lVar;
        this.favDelegateFactory = favDelegateFactory;
        this.trackingData = trackingData;
        this.cartButtonContainerBinder = cartButtonContainerBinder;
        this.widgetId = j11;
        this.isInBottomItems = z11;
        this.isFreshMiniApp = z12;
        this.items = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO productItemContentDTO = this.items.get(position);
        if (productItemContentDTO instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ButtonItem) {
            return 0;
        }
        if (productItemContentDTO instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo) {
            return 1;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO productItemContentDTO = this.items.get(position);
        if (holder instanceof ButtonItemViewHolder) {
            Intrinsics.g(productItemContentDTO, "null cannot be cast to non-null type ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ButtonItem");
            ((ButtonItemViewHolder) holder).bind((ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ButtonItem) productItemContentDTO, this.actionHandler, this.analytics, Long.valueOf(this.widgetId));
        } else if (holder instanceof ProductInfoViewHolder) {
            Intrinsics.g(productItemContentDTO, "null cannot be cast to non-null type ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo");
            ((ProductInfoViewHolder) holder).bind((ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ProductInfo) productItemContentDTO, this.actionHandler, this.favDelegateFactory, this.viewItem, this.trackingData, this.cartButtonContainerBinder, this.analytics, Long.valueOf(this.widgetId));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ButtonItemView buttonItemView = new ButtonItemView(context, this.isInBottomItems);
            int i11 = BUTTON_HEIGHT;
            buttonItemView.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
            return new ButtonItemViewHolder(buttonItemView);
        }
        if (viewType != 1) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown view type: "));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ProductInfoView productInfoView = new ProductInfoView(context2, this.isFreshMiniApp);
        productInfoView.setLayoutParams(new ConstraintLayout.b(PRODUCT_ITEM_WIDTH, -2));
        return new ProductInfoViewHolder(productInfoView);
    }

    public final void submitList(@NotNull List<? extends ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO> newItems, ru.ozon.composer.ui.widget.l viewItem) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.viewItem = viewItem;
        this.items = newItems;
        notifyDataSetChanged();
    }
}
