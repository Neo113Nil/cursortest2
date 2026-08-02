package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di;

import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00182\u00060\u0001j\u0002`\u0002:\u0001\u0018R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryMapper;", "getDeliveryMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryMapper;", "deliveryMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewMapper/ReturnCreationGroupMapper;", "getDeliveryGroupMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewMapper/ReturnCreationGroupMapper;", "deliveryGroupMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewMapper/ReturnCreationItemMapper;", "getItemMapper", "()Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewMapper/ReturnCreationItemMapper;", "itemMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeliveryGroupComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/di/DeliveryGroupComponent;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DeliveryGroupComponent create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new DeliveryGroupComponent$Companion$create$1(storage);
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ReturnCreationGroupMapper getDeliveryGroupMapper();

    @NotNull
    ReturnCreationDeliveryMapper getDeliveryMapper();

    @NotNull
    ReturnCreationItemMapper getItemMapper();

    @NotNull
    PostRefreshHandlerFactory getPostRefreshHandlerFactory();
}
