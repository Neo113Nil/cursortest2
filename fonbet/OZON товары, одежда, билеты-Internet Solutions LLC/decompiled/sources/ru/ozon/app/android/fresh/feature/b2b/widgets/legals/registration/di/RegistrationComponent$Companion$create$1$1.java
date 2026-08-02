package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.RegistrationMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u00060\u001ej\u0002`\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/di/RegistrationComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/di/RegistrationComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "actionHandlersApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "getActionHandlersApi", "()Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationMapper;", "registrationMapper$delegate", "LSc/j;", "getRegistrationMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationMapper;", "registrationMapper", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "legalsApi$delegate", "getLegalsApi", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "legalsApi", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "repository$delegate", "getRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "repository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel;", "getRegistrationViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel;", "registrationViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RegistrationComponent$Companion$create$1$1 implements RegistrationComponent {
    private final CustomActionHandlersComponentApi actionHandlersApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: registrationMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j registrationMapper = k.b(RegistrationComponent$Companion$create$1$1$registrationMapper$2.INSTANCE);

    /* renamed from: legalsApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j legalsApi = k.b(new RegistrationComponent$Companion$create$1$1$legalsApi$2(this));

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j repository = k.b(new RegistrationComponent$Companion$create$1$1$repository$2(this));

    RegistrationComponent$Companion$create$1$1(C7475g c7475g) {
        this.actionHandlersApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LegalsApi getLegalsApi() {
        return (LegalsApi) this.legalsApi.getValue();
    }

    private final AddLegalRepository getRepository() {
        return (AddLegalRepository) this.repository.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.di.RegistrationComponent
    public d getActionHandlersStoreFactory() {
        return this.actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.di.RegistrationComponent
    public RegistrationMapper getRegistrationMapper() {
        return (RegistrationMapper) this.registrationMapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.di.RegistrationComponent
    public RegistrationViewModel getRegistrationViewModel() {
        return new RegistrationViewModel(getRepository());
    }
}
