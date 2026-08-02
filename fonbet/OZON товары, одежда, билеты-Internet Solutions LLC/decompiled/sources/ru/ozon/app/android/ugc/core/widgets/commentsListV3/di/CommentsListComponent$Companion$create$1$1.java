package ru.ozon.app.android.ugc.core.widgets.commentsListV3.di;

import GZ.g;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.storefrontcommonwidgets.di.component.StorefrontCommonComponentApi;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsMapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsV3Mapper;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent$Companion$create$1$1;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsGateway;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.domain.CommentsRepository;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentsViewModelImpl;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000Á\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-R \u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u0002058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0018\u0010J\u001a\u00060Fj\u0002`G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020S0/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u00104R\u0014\u0010Y\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"ru/ozon/app/android/ugc/core/widgets/commentsListV3/di/CommentsListComponent$Companion$create$1$1", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/di/CommentsListComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "storefrontCommonComponentApi", "Lru/ozon/app/android/storefrontcommonwidgets/di/component/StorefrontCommonComponentApi;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsMapper;", "commentsMapper$delegate", "LSc/j;", "getCommentsMapper", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsMapper;", "commentsMapper", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3Mapper;", "commentsV3Mapper$delegate", "getCommentsV3Mapper", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsV3Mapper;", "commentsV3Mapper", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;", "commentsRepository$delegate", "getCommentsRepository", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsRepository;", "commentsRepository", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsGateway;", "commentsGateway$delegate", "getCommentsGateway", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/domain/CommentsGateway;", "commentsGateway", "LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/CommentsViewModelImpl;", "commentsViewModelProvider", "LPc/a;", "getCommentsViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "getSubscribeAuthorsIdStorage", "()Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "getSellerFavoriteService", "()Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "getUgcCachedActionsSharedViewModel", "ugcCachedActionsSharedViewModel", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "getTeensModeService", "()Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CommentsListComponent$Companion$create$1$1 implements CommentsListComponent {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final NavigationComponentApi navigationComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final StorefrontCommonComponentApi storefrontCommonComponentApi;

    /* renamed from: commentsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j commentsMapper = k.b(CommentsListComponent$Companion$create$1$1$commentsMapper$2.INSTANCE);

    /* renamed from: commentsV3Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j commentsV3Mapper = k.b(CommentsListComponent$Companion$create$1$1$commentsV3Mapper$2.INSTANCE);

    /* renamed from: commentsRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j commentsRepository = k.b(new CommentsListComponent$Companion$create$1$1$commentsRepository$2(this));

    /* renamed from: commentsGateway$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j commentsGateway = k.b(new CommentsListComponent$Companion$create$1$1$commentsGateway$2(this));
    private final a<CommentsViewModelImpl> commentsViewModelProvider = new a() { // from class: HU.b
        @Override // Pc.a
        public final Object get() {
            CommentsViewModelImpl commentsViewModelProvider$lambda$0;
            commentsViewModelProvider$lambda$0 = CommentsListComponent$Companion$create$1$1.commentsViewModelProvider$lambda$0(CommentsListComponent$Companion$create$1$1.this);
            return commentsViewModelProvider$lambda$0;
        }
    };

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(CommentsListComponent$Companion$create$1$1$mapper$2.INSTANCE);

    CommentsListComponent$Companion$create$1$1(C7475g c7475g) {
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
        this.storefrontCommonComponentApi = (StorefrontCommonComponentApi) c7475g.getComponent(StorefrontCommonComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UgcCachedActionsSharedViewModel _get_ugcCachedActionsSharedViewModel_$lambda$1() {
        return new UgcCachedActionsSharedViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommentsViewModelImpl commentsViewModelProvider$lambda$0(CommentsListComponent$Companion$create$1$1 commentsListComponent$Companion$create$1$1) {
        return new CommentsViewModelImpl(commentsListComponent$Companion$create$1$1.getCommentsGateway(), commentsListComponent$Companion$create$1$1.storageComponentApi.getAuthStateStorage(), commentsListComponent$Companion$create$1$1.getSubscribeAuthorsIdStorage());
    }

    private final CommentsGateway getCommentsGateway() {
        return (CommentsGateway) this.commentsGateway.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommentsMapper getCommentsMapper() {
        return (CommentsMapper) this.commentsMapper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommentsRepository getCommentsRepository() {
        return (CommentsRepository) this.commentsRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommentsV3Mapper getCommentsV3Mapper() {
        return (CommentsV3Mapper) this.commentsV3Mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public AppType getAppType() {
        return this.androidPlatformComponentDependencies.getAppType();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public a<CommentsViewModelImpl> getCommentsViewModelProvider() {
        return this.commentsViewModelProvider;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public CommentsListMapper getMapper() {
        return (CommentsListMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public g getOzonRouter() {
        return this.navigationComponentApi.getOzonRouter();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public SellerFavoriteService getSellerFavoriteService() {
        return this.accountComponentApi.getSellerFavoriteService();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public SubscribeAuthorsIdStorage getSubscribeAuthorsIdStorage() {
        return this.storageComponentApi.getSubscribeAuthorsIdStorage();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public TeensModeService getTeensModeService() {
        return this.storefrontCommonComponentApi.getTeensModeService();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent
    public a<UgcCachedActionsSharedViewModel> getUgcCachedActionsSharedViewModel() {
        return new HU.a(0);
    }
}
