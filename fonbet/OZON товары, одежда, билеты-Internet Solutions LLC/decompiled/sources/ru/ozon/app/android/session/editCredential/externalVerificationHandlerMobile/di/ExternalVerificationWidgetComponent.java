package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.core.PostMessageParser;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.data.ExternalVerificationHandlerMobileMapper;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationViewModel;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104R)\u0010<\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010707068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/di/ExternalVerificationWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "composerComponentApi", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "ozonIdComponentApi", "Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponent", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator$delegate", "LSc/j;", "getNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationHandlerMobileMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/data/ExternalVerificationHandlerMobileMapper;", "mapper", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/PostMessageParser;", "postMessageParser$delegate", "getPostMessageParser", "()Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/PostMessageParser;", "postMessageParser", "LOb0/a;", "ozonIdApi$delegate", "getOzonIdApi", "()LOb0/a;", "ozonIdApi", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository$delegate", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LGZ/g;", "ozonRouter$delegate", "getOzonRouter", "()LGZ/g;", "ozonRouter", "LPc/a;", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalVerificationWidgetComponent implements InterfaceC6958a {

    @NotNull
    private final ActionComponentApi actionComponent;

    /* renamed from: actionV2Repository$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionV2Repository;

    @NotNull
    private final ComposerComponentApi composerComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final NavigationComponentApi navigationComponentApi;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j navigator;

    @NotNull
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: ozonIdApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonIdApi;

    @NotNull
    private final NetworkOzonIdComponentApi ozonIdComponentApi;

    /* renamed from: ozonRouter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonRouter;

    /* renamed from: postMessageParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j postMessageParser;

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModelProvider;

    public ExternalVerificationWidgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.composerComponentApi = (ComposerComponentApi) storage.getComponent(ComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) storage.getComponent(NetworkComponentApi.class);
        this.ozonIdComponentApi = (NetworkOzonIdComponentApi) storage.getComponent(NetworkOzonIdComponentApi.class);
        this.actionComponent = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.navigationComponentApi = (NavigationComponentApi) storage.getComponent(NavigationComponentApi.class);
        this.navigator = k.b(new ExternalVerificationWidgetComponent$navigator$2(this));
        this.mapper = k.b(ExternalVerificationWidgetComponent$mapper$2.INSTANCE);
        this.postMessageParser = k.b(new ExternalVerificationWidgetComponent$postMessageParser$2(this));
        this.ozonIdApi = k.b(new ExternalVerificationWidgetComponent$ozonIdApi$2(this));
        this.actionV2Repository = k.b(new ExternalVerificationWidgetComponent$actionV2Repository$2(this));
        this.ozonRouter = k.b(new ExternalVerificationWidgetComponent$ozonRouter$2(this));
        this.viewModelProvider = k.b(new ExternalVerificationWidgetComponent$viewModelProvider$2(this));
    }

    @NotNull
    public final ActionV2Repository getActionV2Repository() {
        return (ActionV2Repository) this.actionV2Repository.getValue();
    }

    @NotNull
    public final ExternalVerificationHandlerMobileMapper getMapper() {
        return (ExternalVerificationHandlerMobileMapper) this.mapper.getValue();
    }

    @NotNull
    public final Ob0.a getOzonIdApi() {
        return (Ob0.a) this.ozonIdApi.getValue();
    }

    @NotNull
    public final g getOzonRouter() {
        return (g) this.ozonRouter.getValue();
    }

    @NotNull
    public final PostMessageParser getPostMessageParser() {
        return (PostMessageParser) this.postMessageParser.getValue();
    }

    @NotNull
    public final Pc.a<ExternalVerificationViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
