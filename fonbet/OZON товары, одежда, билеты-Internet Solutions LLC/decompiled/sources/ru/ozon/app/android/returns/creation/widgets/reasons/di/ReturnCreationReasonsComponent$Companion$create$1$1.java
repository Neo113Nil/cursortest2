package ru.ozon.app.android.returns.creation.widgets.reasons.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import android.content.Context;
import bH.C5601a;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.button.viewMapper.AddMoreButtonMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewMapper.HeaderMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper.ReasonMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\"\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R(\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"ru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsComponent$Companion$create$1$1", "Lru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewMapper/HeaderMapper;", "headerMapper$delegate", "LSc/j;", "getHeaderMapper", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewMapper/HeaderMapper;", "headerMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonMapper;", "reasonMapper$delegate", "getReasonMapper", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonMapper;", "reasonMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/button/viewMapper/AddMoreButtonMapper;", "addMoreButtonMapper$delegate", "getAddMoreButtonMapper", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/button/viewMapper/AddMoreButtonMapper;", "addMoreButtonMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "kotlin.jvm.PlatformType", "inputViewModelProvider", "LPc/a;", "getInputViewModelProvider", "()LPc/a;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationReasonsComponent$Companion$create$1$1 implements ReturnCreationReasonsComponent {

    /* renamed from: addMoreButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j addMoreButtonMapper;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory;

    /* renamed from: headerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j headerMapper;
    private final a<InputViewModel> inputViewModelProvider;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory;

    /* renamed from: reasonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reasonMapper;

    ReturnCreationReasonsComponent$Companion$create$1$1(Context context) {
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) dependencyStorage2.b(CustomActionHandlersComponentApi.class);
        this.headerMapper = k.b(ReturnCreationReasonsComponent$Companion$create$1$1$headerMapper$2.INSTANCE);
        this.reasonMapper = k.b(ReturnCreationReasonsComponent$Companion$create$1$1$reasonMapper$2.INSTANCE);
        this.addMoreButtonMapper = k.b(ReturnCreationReasonsComponent$Companion$create$1$1$addMoreButtonMapper$2.INSTANCE);
        this.postRefreshHandlerFactory = k.b(new ReturnCreationReasonsComponent$Companion$create$1$1$postRefreshHandlerFactory$2(this));
        this.customActionHandlersStoreFactory = k.b(new ReturnCreationReasonsComponent$Companion$create$1$1$customActionHandlersStoreFactory$2(this));
        this.inputViewModelProvider = new C5601a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputViewModel inputViewModelProvider$lambda$0() {
        return new InputViewModel();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent
    public AddMoreButtonMapper getAddMoreButtonMapper() {
        return (AddMoreButtonMapper) this.addMoreButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent
    public HeaderMapper getHeaderMapper() {
        return (HeaderMapper) this.headerMapper.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent
    public a<InputViewModel> getInputViewModelProvider() {
        return this.inputViewModelProvider;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent
    public ReasonMapper getReasonMapper() {
        return (ReasonMapper) this.reasonMapper.getValue();
    }
}
