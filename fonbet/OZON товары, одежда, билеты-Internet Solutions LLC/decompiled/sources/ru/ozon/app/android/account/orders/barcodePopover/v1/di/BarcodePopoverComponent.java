package ru.ozon.app.android.account.orders.barcodePopover.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcodePopover.v1.data.BarcodePopoverMapper;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewModel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/di/BarcodePopoverComponent;", "Lhi/a;", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;", "getViewModel", "()Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;", "viewModel", "Lru/ozon/app/android/account/orders/barcodePopover/v1/data/BarcodePopoverMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/barcodePopover/v1/data/BarcodePopoverMapper;", "mapper", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BarcodePopoverComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/di/BarcodePopoverComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/account/orders/barcodePopover/v1/di/BarcodePopoverComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/barcodePopover/v1/di/BarcodePopoverComponent;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final BarcodePopoverComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new BarcodePopoverComponent() { // from class: ru.ozon.app.android.account.orders.barcodePopover.v1.di.BarcodePopoverComponent$Companion$create$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(BarcodePopoverComponent$Companion$create$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.account.orders.barcodePopover.v1.di.BarcodePopoverComponent
                public BarcodePopoverMapper getMapper() {
                    return (BarcodePopoverMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.barcodePopover.v1.di.BarcodePopoverComponent
                public BarcodePopoverViewModel getViewModel() {
                    return new BarcodePopoverViewModel();
                }
            };
        }
    }

    @NotNull
    BarcodePopoverMapper getMapper();

    @NotNull
    BarcodePopoverViewModel getViewModel();
}
