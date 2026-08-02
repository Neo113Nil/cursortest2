package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeRepositoryImpl;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.api.AddConsigneeApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewModel;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/di/AddConsigneeComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/di/AddConsigneeComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeApi;", "addConsigneeApi$delegate", "LSc/j;", "getAddConsigneeApi", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeApi;", "addConsigneeApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "locationComponentApi", "Lru/ozon/app/android/mapcommon/mapcommon/di/LocationComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepositoryImpl;", "addConsigneeRepository$delegate", "getAddConsigneeRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepositoryImpl;", "addConsigneeRepository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeMapper;", "mapper", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeViewModel;", "viewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddConsigneeComponent$Companion$create$1$1 implements AddConsigneeComponent {
    final /* synthetic */ C7475g $storage;
    private final LocationComponentApi locationComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: addConsigneeApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j addConsigneeApi = k.b(new AddConsigneeComponent$Companion$create$1$1$addConsigneeApi$2(this));

    /* renamed from: addConsigneeRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j addConsigneeRepository = k.b(new AddConsigneeComponent$Companion$create$1$1$addConsigneeRepository$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(AddConsigneeComponent$Companion$create$1$1$mapper$2.INSTANCE);

    AddConsigneeComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.locationComponentApi = (LocationComponentApi) c7475g.getComponent(LocationComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddConsigneeApi getAddConsigneeApi() {
        return (AddConsigneeApi) this.addConsigneeApi.getValue();
    }

    private final AddConsigneeRepositoryImpl getAddConsigneeRepository() {
        return (AddConsigneeRepositoryImpl) this.addConsigneeRepository.getValue();
    }

    private final RetainComposerComponentApi getRetainComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di.AddConsigneeComponent
    public AddConsigneeMapper getMapper() {
        return (AddConsigneeMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di.AddConsigneeComponent
    public l getTokenizedAnalytics() {
        return getRetainComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di.AddConsigneeComponent
    public AddConsigneeViewModel getViewModel() {
        return new AddConsigneeViewModel(getAddConsigneeRepository(), this.locationComponentApi.getOzonGeoProxyClient(), this.locationComponentApi.getAreaLocalStore());
    }
}
