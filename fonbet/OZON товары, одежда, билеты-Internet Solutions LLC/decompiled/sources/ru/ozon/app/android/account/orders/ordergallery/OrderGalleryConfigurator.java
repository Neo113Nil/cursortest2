package ru.ozon.app.android.account.orders.ordergallery;

import Pc.a;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cs_orders.R$string;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/account/orders/ordergallery/OrderGalleryConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "provider", "<init>", "(LPc/a;)V", "", "showLoading", "", "(Z)V", "showDefaultErrorSnackBar", "()V", "showSnackBar", "onComposerInitialized", "LPc/a;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderGalleryConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<FileDownloaderViewModel> provider;

    public OrderGalleryConfigurator(@NotNull a<FileDownloaderViewModel> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDefaultErrorSnackBar() {
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().j());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, 3000L, null, getContainer().g(), 46, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(boolean showLoading) {
        InterfaceC7851b controller;
        InterfaceC7851b controller2;
        if (showLoading) {
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller2 = references.getController()) == null) {
                return;
            }
            controller2.e(new l.a.C1079a(0L, null, 3));
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (controller = references2.getController()) == null) {
            return;
        }
        controller.hideLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSnackBar() {
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().j());
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.error_order_gallery_no_archive_program)), null, null, null, null, null, null, null, null, null, null, 3000L, null, null, getContainer().g(), 57338, null).show();
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        SingleLiveEvent<FileDownloaderViewModel.Action> singleAction;
        ConfiguratorReferences references = getReferences();
        Intrinsics.f(references);
        FileDownloaderViewModel fileDownloaderViewModel = (FileDownloaderViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.account.orders.ordergallery.OrderGalleryConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = OrderGalleryConfigurator.this.provider;
                FileDownloaderViewModel fileDownloaderViewModel2 = (FileDownloaderViewModel) aVar.get();
                Intrinsics.g(fileDownloaderViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return fileDownloaderViewModel2;
            }
        }).a(FileDownloaderViewModel.class);
        if (fileDownloaderViewModel == null || (singleAction = fileDownloaderViewModel.getSingleAction()) == null) {
            return;
        }
        singleAction.observe(getOwner(), new OrderGalleryConfigurator$sam$androidx_lifecycle_Observer$0(new OrderGalleryConfigurator$onComposerInitialized$1(this)));
    }
}
