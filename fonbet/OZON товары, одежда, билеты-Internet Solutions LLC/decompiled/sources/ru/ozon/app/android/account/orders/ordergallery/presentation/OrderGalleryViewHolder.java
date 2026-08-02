package ru.ozon.app.android.account.orders.ordergallery.presentation;

import Vg.d;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetOrderGalleryBinding;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "downloaderViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetOrderGalleryBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/ordergallery/presentation/OrderGalleryVO;Ll20/d;)V", "LVg/d;", "Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter;", "adapter", "Lru/ozon/app/android/account/orders/ordergallery/presentation/ShipmentsAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderGalleryViewHolder extends k<OrderGalleryVO> {

    @NotNull
    private final ShipmentsAdapter adapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OrderGalleryViewHolder(@NotNull WidgetOrderGalleryBinding binding, @NotNull ComposerReferences composerReferences, @NotNull FileDownloaderViewModel downloaderViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(downloaderViewModel, "downloaderViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        ShipmentsAdapter shipmentsAdapter = new ShipmentsAdapter(composerReferences, this, downloaderViewModel, new OrderGalleryViewHolder$adapter$1(this));
        this.adapter = shipmentsAdapter;
        RecyclerView recyclerView = binding.shipmentsRv;
        new x().attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(shipmentsAdapter);
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderGalleryVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.submitList(C7714v.a0(item));
    }
}
