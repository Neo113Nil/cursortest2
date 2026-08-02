package ru.ozon.app.android.returns.creation.widgets.itemInfo.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.ItemMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/itemInfo/di/ItemComponent$Companion$create$1", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/di/ItemComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemMapper;", "itemMapper$delegate", "LSc/j;", "getItemMapper", "()Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemMapper;", "itemMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemComponent$Companion$create$1 implements ItemComponent {
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: itemMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j itemMapper = k.b(ItemComponent$Companion$create$1$itemMapper$2.INSTANCE);

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory = k.b(new ItemComponent$Companion$create$1$postRefreshHandlerFactory$2(this));

    ItemComponent$Companion$create$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ItemComponent
    public ItemMapper getItemMapper() {
        return (ItemMapper) this.itemMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ItemComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }
}
