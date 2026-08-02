package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoCheckingOperatorMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api.VerificationEdoApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation.VerificationEdoCheckingOperatorViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"ru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/di/VerificationEdoCheckingOperatorComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/di/VerificationEdoCheckingOperatorComponent;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoApi;", "verificationApi$delegate", "LSc/j;", "getVerificationApi", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoApi;", "verificationApi", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepository;", "repository$delegate", "getRepository", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepository;", "repository", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoCheckingOperatorMapper;", "mapper", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoCheckingOperatorMapper;", "getMapper", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoCheckingOperatorMapper;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewModel;", "viewModel", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerificationEdoCheckingOperatorComponent$Companion$create$1$1 implements VerificationEdoCheckingOperatorComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: verificationApi$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j verificationApi = k.b(new VerificationEdoCheckingOperatorComponent$Companion$create$1$1$verificationApi$2(this));

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j repository = k.b(new VerificationEdoCheckingOperatorComponent$Companion$create$1$1$repository$2(this));
    private final VerificationEdoCheckingOperatorMapper mapper = new VerificationEdoCheckingOperatorMapper();

    VerificationEdoCheckingOperatorComponent$Companion$create$1$1(C7475g c7475g) {
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    private final VerificationEdoRepository getRepository() {
        return (VerificationEdoRepository) this.repository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerificationEdoApi getVerificationApi() {
        return (VerificationEdoApi) this.verificationApi.getValue();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.di.VerificationEdoCheckingOperatorComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.di.VerificationEdoCheckingOperatorComponent
    public VerificationEdoCheckingOperatorMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.di.VerificationEdoCheckingOperatorComponent
    public VerificationEdoCheckingOperatorViewModel getViewModel() {
        return new VerificationEdoCheckingOperatorViewModel(getRepository());
    }
}
