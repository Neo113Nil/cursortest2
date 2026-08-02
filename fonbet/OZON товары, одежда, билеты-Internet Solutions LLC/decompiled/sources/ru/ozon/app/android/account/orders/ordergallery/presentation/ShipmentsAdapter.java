package ru.ozon.app.android.account.orders.ordergallery.presentation;

import Vg.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.cs_orders.databinding.WidgetOrderGalleryShipmentItemBinding;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.recycler.decoration.SkipLastDividerItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\"\u0010\r\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter$ShipmentVH;", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "downloaderViewModel", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStoreProvider", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter$ShipmentVH;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter$ShipmentVH;I)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "Lkotlin/jvm/functions/Function0;", "ShipmentVH", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShipmentsAdapter extends t<OrderGalleryVO, ShipmentVH> {

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final Function0<c> customActionHandlersStoreProvider;

    @NotNull
    private final FileDownloaderViewModel downloaderViewModel;

    @NotNull
    private final k<OrderGalleryVO> widgetViewHolder;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter$ShipmentVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryShipmentItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "downloaderViewModel", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "widgetViewHolder", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStoreProvider", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryShipmentItemBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;Lru/ozon/composer/ui/widget/k;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "it", "", "onClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "shipmentVO", "bind", "(Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryShipmentItemBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter;", "adapter", "Lru/ozon/app/android/account/orders/ordergallery/presentation/PostingsAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShipmentVH extends RecyclerView.C {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;

        @NotNull
        private final PostingsAdapter adapter;

        @NotNull
        private final WidgetOrderGalleryShipmentItemBinding binding;

        @NotNull
        private final ComposerReferences composerReferences;

        @NotNull
        private final FileDownloaderViewModel downloaderViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShipmentVH(@NotNull WidgetOrderGalleryShipmentItemBinding binding, @NotNull ComposerReferences composerReferences, @NotNull FileDownloaderViewModel downloaderViewModel, @NotNull k<OrderGalleryVO> widgetViewHolder, @NotNull Function0<? extends c> customActionHandlersStoreProvider) {
            super(binding.getConstraintLayout());
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
            Intrinsics.checkNotNullParameter(downloaderViewModel, "downloaderViewModel");
            Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
            Intrinsics.checkNotNullParameter(customActionHandlersStoreProvider, "customActionHandlersStoreProvider");
            this.binding = binding;
            this.composerReferences = composerReferences;
            this.downloaderViewModel = downloaderViewModel;
            this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).onClick(new ShipmentsAdapter$ShipmentVH$actionHandler$1(this)).buildHandler();
            PostingsAdapter postingsAdapter = new PostingsAdapter(customActionHandlersStoreProvider, composerReferences, widgetViewHolder);
            this.adapter = postingsAdapter;
            RecyclerView recyclerView = binding.postingsRv;
            recyclerView.setAdapter(postingsAdapter);
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addItemDecoration(new SkipLastDividerItemDecoration(recyclerView.getContext(), 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClick(AtomAction.Click it) {
            String link = it.getLink();
            if (link != null) {
                RestrictionsUtilsKt.showRestriction$default(this.composerReferences, StringProvider.getString(R$string.order_gallery_password_of_archive), Integer.valueOf(R$drawable.ic_m_green_check), null, 4, null);
                r a11 = this.composerReferences.getContainer().a();
                if (a11 != null) {
                    FileDownloaderViewModel.downloadFile$default(this.downloaderViewModel, link, false, a11, false, null, 24, null);
                }
            }
        }

        public final void bind(@NotNull OrderGalleryVO shipmentVO) {
            Intrinsics.checkNotNullParameter(shipmentVO, "shipmentVO");
            this.binding.titleTv.setText(shipmentVO.getTitle());
            this.adapter.submitList(shipmentVO.getPostings());
            LargeButtonView downloadAllActionLBV = this.binding.downloadAllActionLBV;
            Intrinsics.checkNotNullExpressionValue(downloadAllActionLBV, "downloadAllActionLBV");
            LargeButtonHolderKt.bindOrGone(downloadAllActionLBV, shipmentVO.getDownloadAllAction(), this.actionHandler);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShipmentsAdapter(@NotNull ComposerReferences composerReferences, @NotNull k<OrderGalleryVO> widgetViewHolder, @NotNull FileDownloaderViewModel downloaderViewModel, @NotNull Function0<? extends c> customActionHandlersStoreProvider) {
        super(new ShipmentItemCallback());
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(downloaderViewModel, "downloaderViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreProvider, "customActionHandlersStoreProvider");
        this.composerReferences = composerReferences;
        this.widgetViewHolder = widgetViewHolder;
        this.downloaderViewModel = downloaderViewModel;
        this.customActionHandlersStoreProvider = customActionHandlersStoreProvider;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ShipmentVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        OrderGalleryVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ShipmentVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetOrderGalleryShipmentItemBinding inflate = WidgetOrderGalleryShipmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.f(inflate);
        return new ShipmentVH(inflate, this.composerReferences, this.downloaderViewModel, this.widgetViewHolder, this.customActionHandlersStoreProvider);
    }
}
