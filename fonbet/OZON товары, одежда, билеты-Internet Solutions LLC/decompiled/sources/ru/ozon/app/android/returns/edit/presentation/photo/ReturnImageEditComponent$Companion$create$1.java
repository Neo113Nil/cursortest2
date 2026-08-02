package ru.ozon.app.android.returns.edit.presentation.photo;

import KK.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.molecules.reason.ReasonRowMapper;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewMapper.TextAreaMapper;

@Metadata(d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\"\u001a\u00060\u001dj\u0002`\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R(\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"ru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditComponent$Companion$create$1", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewMapper/TextAreaMapper;", "textAreaMapper$delegate", "LSc/j;", "getTextAreaMapper", "()Lru/ozon/app/android/returns/ui/molecules/textarea/viewMapper/TextAreaMapper;", "textAreaMapper", "Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "reasonRowMapper$delegate", "getReasonRowMapper", "()Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "reasonRowMapper", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditMapper;", "returnImageEditMapper$delegate", "getReturnImageEditMapper", "()Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditMapper;", "returnImageEditMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory$delegate", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory$delegate", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "kotlin.jvm.PlatformType", "inputViewModelProvider", "LPc/a;", "getInputViewModelProvider", "()LPc/a;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnImageEditComponent$Companion$create$1 implements ReturnImageEditComponent {
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: textAreaMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j textAreaMapper = k.b(ReturnImageEditComponent$Companion$create$1$textAreaMapper$2.INSTANCE);

    /* renamed from: reasonRowMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j reasonRowMapper = k.b(new ReturnImageEditComponent$Companion$create$1$reasonRowMapper$2(this));

    /* renamed from: returnImageEditMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j returnImageEditMapper = k.b(new ReturnImageEditComponent$Companion$create$1$returnImageEditMapper$2(this));

    /* renamed from: postRefreshHandlerFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j postRefreshHandlerFactory = k.b(new ReturnImageEditComponent$Companion$create$1$postRefreshHandlerFactory$2(this));

    /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j customActionHandlersStoreFactory = k.b(new ReturnImageEditComponent$Companion$create$1$customActionHandlersStoreFactory$2(this));
    private final a<InputViewModel> inputViewModelProvider = new b(2);

    ReturnImageEditComponent$Companion$create$1(C7475g c7475g) {
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReasonRowMapper getReasonRowMapper() {
        return (ReasonRowMapper) this.reasonRowMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAreaMapper getTextAreaMapper() {
        return (TextAreaMapper) this.textAreaMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputViewModel inputViewModelProvider$lambda$0() {
        return new InputViewModel();
    }

    @Override // ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditComponent
    public d getCustomActionHandlersStoreFactory() {
        return (d) this.customActionHandlersStoreFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditComponent
    public a<InputViewModel> getInputViewModelProvider() {
        return this.inputViewModelProvider;
    }

    @Override // ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditComponent
    public PostRefreshHandlerFactory getPostRefreshHandlerFactory() {
        return (PostRefreshHandlerFactory) this.postRefreshHandlerFactory.getValue();
    }

    @Override // ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditComponent
    public ReturnImageEditMapper getReturnImageEditMapper() {
        return (ReturnImageEditMapper) this.returnImageEditMapper.getValue();
    }
}
