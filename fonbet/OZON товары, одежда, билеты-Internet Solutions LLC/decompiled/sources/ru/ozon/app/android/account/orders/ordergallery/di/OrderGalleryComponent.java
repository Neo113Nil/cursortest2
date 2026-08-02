package ru.ozon.app.android.account.orders.ordergallery.di;

import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/di/OrderGalleryComponent;", "Lhi/a;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "getDownloaderViewModel", "()Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "downloaderViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrderGalleryComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/di/OrderGalleryComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/account/orders/ordergallery/di/OrderGalleryComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/ordergallery/di/OrderGalleryComponent;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final OrderGalleryComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new OrderGalleryComponent(storage) { // from class: ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryComponent$Companion$create$1
                private final CustomActionHandlersComponentApi customActionHandlerComponentApi;
                private final PdfFileComponentApi pdfFileComponentApi;

                {
                    this.pdfFileComponentApi = (PdfFileComponentApi) storage.getComponent(PdfFileComponentApi.class);
                    this.customActionHandlerComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlerComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.account.orders.ordergallery.di.OrderGalleryComponent
                public FileDownloaderViewModel getDownloaderViewModel() {
                    return this.pdfFileComponentApi.getFileDownloaderViewModel();
                }
            };
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FileDownloaderViewModel getDownloaderViewModel();
}
