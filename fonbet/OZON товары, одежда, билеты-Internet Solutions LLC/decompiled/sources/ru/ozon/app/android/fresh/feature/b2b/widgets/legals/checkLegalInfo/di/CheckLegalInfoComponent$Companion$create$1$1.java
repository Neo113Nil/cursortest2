package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.di.LegalsResultStateHolderComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/di/CheckLegalInfoComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/di/CheckLegalInfoComponent;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "legalsResultStateHolder$delegate", "LSc/j;", "getLegalsResultStateHolder", "()Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "legalsResultStateHolder", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoMapper;", "checkLegalInfoMapper$delegate", "getCheckLegalInfoMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoMapper;", "checkLegalInfoMapper", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/di/LegalsResultStateHolderComponentApi;", "legalsResultApi", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/di/LegalsResultStateHolderComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "legalsApi$delegate", "getLegalsApi", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "legalsApi", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "repository$delegate", "getRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "repository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel;", "getCheckLegalInfoViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel;", "checkLegalInfoViewModel", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckLegalInfoComponent$Companion$create$1$1 implements CheckLegalInfoComponent {
    private final LegalsResultStateHolderComponentApi legalsResultApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: legalsResultStateHolder$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j legalsResultStateHolder = k.b(new CheckLegalInfoComponent$Companion$create$1$1$legalsResultStateHolder$2(this));

    /* renamed from: checkLegalInfoMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j checkLegalInfoMapper = k.b(CheckLegalInfoComponent$Companion$create$1$1$checkLegalInfoMapper$2.INSTANCE);

    /* renamed from: legalsApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j legalsApi = k.b(new CheckLegalInfoComponent$Companion$create$1$1$legalsApi$2(this));

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j repository = k.b(new CheckLegalInfoComponent$Companion$create$1$1$repository$2(this));

    CheckLegalInfoComponent$Companion$create$1$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.legalsResultApi = (LegalsResultStateHolderComponentApi) c7475g.getComponent(LegalsResultStateHolderComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegalsApi getLegalsApi() {
        return (LegalsApi) this.legalsApi.getValue();
    }

    private final AddLegalRepository getRepository() {
        return (AddLegalRepository) this.repository.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.di.CheckLegalInfoComponent
    public CheckLegalInfoMapper getCheckLegalInfoMapper() {
        return (CheckLegalInfoMapper) this.checkLegalInfoMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.di.CheckLegalInfoComponent
    public CheckLegalInfoViewModel getCheckLegalInfoViewModel() {
        return new CheckLegalInfoViewModel(getLegalsResultStateHolder(), getRepository());
    }

    public LegalsResultStateHolder getLegalsResultStateHolder() {
        return (LegalsResultStateHolder) this.legalsResultStateHolder.getValue();
    }
}
