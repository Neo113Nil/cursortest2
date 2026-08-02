package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.molecules.button.data.CmlButtonMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationAsyncUpdateMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper.PersonalInfoVerificationStickyButtonMapper;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;

@Metadata(d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010$R\u0018\u0010*\u001a\u00060&j\u0002`'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"ru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent$Companion$create$1$1", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/di/PersonalInfoVerificationComponent;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper$delegate", "LSc/j;", "getInputMapper", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "cmlButtonMapper$delegate", "getCmlButtonMapper", "()Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "cmlButtonMapper", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;", "asyncUpdateMapper$delegate", "getAsyncUpdateMapper", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;", "asyncUpdateMapper", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationMapper;", "personalInfoMapper$delegate", "getPersonalInfoMapper", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationMapper;", "personalInfoMapper", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationStickyButtonMapper;", "stickyButtonMapper$delegate", "getStickyButtonMapper", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationStickyButtonMapper;", "stickyButtonMapper", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "personalInfoVerificationViewModel$delegate", "getPersonalInfoVerificationViewModel", "()Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "personalInfoVerificationViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationComponent$Companion$create$1$1 implements PersonalInfoVerificationComponent {
    final /* synthetic */ CustomActionHandlersComponentApi $actionHandlersApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;

    /* renamed from: personalInfoVerificationViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j personalInfoVerificationViewModel;

    /* renamed from: inputMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j inputMapper = k.b(PersonalInfoVerificationComponent$Companion$create$1$1$inputMapper$2.INSTANCE);

    /* renamed from: cmlButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cmlButtonMapper = k.b(PersonalInfoVerificationComponent$Companion$create$1$1$cmlButtonMapper$2.INSTANCE);

    /* renamed from: asyncUpdateMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j asyncUpdateMapper = k.b(new PersonalInfoVerificationComponent$Companion$create$1$1$asyncUpdateMapper$2(this));

    /* renamed from: personalInfoMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j personalInfoMapper = k.b(new PersonalInfoVerificationComponent$Companion$create$1$1$personalInfoMapper$2(this));

    /* renamed from: stickyButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j stickyButtonMapper = k.b(new PersonalInfoVerificationComponent$Companion$create$1$1$stickyButtonMapper$2(this));

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(PersonalInfoVerificationComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    PersonalInfoVerificationComponent$Companion$create$1$1(ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi) {
        this.$actionHandlersApi = customActionHandlersComponentApi;
        this.$retainComposerApi = retainComposerComponentApi;
        this.personalInfoVerificationViewModel = k.b(new PersonalInfoVerificationComponent$Companion$create$1$1$personalInfoVerificationViewModel$2(composerWidgetAsyncComponentApi, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalInfoVerificationAsyncUpdateMapper getAsyncUpdateMapper() {
        return (PersonalInfoVerificationAsyncUpdateMapper) this.asyncUpdateMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CmlButtonMapper getCmlButtonMapper() {
        return (CmlButtonMapper) this.cmlButtonMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputMoleculeMapper getInputMapper() {
        return (InputMoleculeMapper) this.inputMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent
    public d getActionHandlersStoreFactory() {
        return this.$actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent
    public PersonalInfoVerificationMapper getPersonalInfoMapper() {
        return (PersonalInfoVerificationMapper) this.personalInfoMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent
    public PersonalInfoVerificationViewModel getPersonalInfoVerificationViewModel() {
        return (PersonalInfoVerificationViewModel) this.personalInfoVerificationViewModel.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent
    public PersonalInfoVerificationStickyButtonMapper getStickyButtonMapper() {
        return (PersonalInfoVerificationStickyButtonMapper) this.stickyButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }
}
