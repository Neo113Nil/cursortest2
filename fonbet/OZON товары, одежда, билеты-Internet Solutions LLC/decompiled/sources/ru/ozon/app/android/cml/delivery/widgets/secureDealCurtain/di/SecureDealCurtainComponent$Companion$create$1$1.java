package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.mapper.SecureDealButtonsMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.mapper.SecureDealCurtainAsyncUpdateMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.mapper.SecureDealModelMapper;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u00060!j\u0002`\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0018\u0010*\u001a\u00060&j\u0002`'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"ru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/di/SecureDealCurtainComponent$Companion$create$1$1", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/di/SecureDealCurtainComponent;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMapper;", "cellListMapper$delegate", "LSc/j;", "getCellListMapper", "()Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMapper;", "cellListMapper", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper$delegate", "getInputMapper", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealModelMapper;", "secureDealModelMapper$delegate", "getSecureDealModelMapper", "()Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealModelMapper;", "secureDealModelMapper", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealButtonsMapper;", "buttonsMapper$delegate", "getButtonsMapper", "()Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealButtonsMapper;", "buttonsMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "secureDealCurtainViewModel", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "getSecureDealCurtainViewModel", "()Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealCurtainComponent$Companion$create$1$1 implements SecureDealCurtainComponent {
    final /* synthetic */ CustomActionHandlersComponentApi $actionHandlersApi;
    final /* synthetic */ NavigationComponentApi $navigationComponentApi;
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;
    private final SecureDealCurtainViewModel secureDealCurtainViewModel;

    /* renamed from: cellListMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cellListMapper = k.b(SecureDealCurtainComponent$Companion$create$1$1$cellListMapper$2.INSTANCE);

    /* renamed from: inputMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j inputMapper = k.b(SecureDealCurtainComponent$Companion$create$1$1$inputMapper$2.INSTANCE);

    /* renamed from: secureDealModelMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j secureDealModelMapper = k.b(new SecureDealCurtainComponent$Companion$create$1$1$secureDealModelMapper$2(this));

    /* renamed from: buttonsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonsMapper = k.b(SecureDealCurtainComponent$Companion$create$1$1$buttonsMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(SecureDealCurtainComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    SecureDealCurtainComponent$Companion$create$1$1(ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi, CustomActionHandlersComponentApi customActionHandlersComponentApi, RetainComposerComponentApi retainComposerComponentApi, NavigationComponentApi navigationComponentApi) {
        this.$actionHandlersApi = customActionHandlersComponentApi;
        this.$retainComposerApi = retainComposerComponentApi;
        this.$navigationComponentApi = navigationComponentApi;
        this.secureDealCurtainViewModel = new SecureDealCurtainViewModel(composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), new SecureDealCurtainAsyncUpdateMapper(getCellListMapper(), getInputMapper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CmlCellListMapper getCellListMapper() {
        return (CmlCellListMapper) this.cellListMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputMoleculeMapper getInputMapper() {
        return (InputMoleculeMapper) this.inputMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public d getActionHandlersStoreFactory() {
        return this.$actionHandlersApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public SecureDealButtonsMapper getButtonsMapper() {
        return (SecureDealButtonsMapper) this.buttonsMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public g getOzonRouter() {
        return this.$navigationComponentApi.getOzonRouter();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public SecureDealCurtainViewModel getSecureDealCurtainViewModel() {
        return this.secureDealCurtainViewModel;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public SecureDealModelMapper getSecureDealModelMapper() {
        return (SecureDealModelMapper) this.secureDealModelMapper.getValue();
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent
    public l getTokenizedAnalytics() {
        return this.$retainComposerApi.getTokenizedAnalytics();
    }
}
