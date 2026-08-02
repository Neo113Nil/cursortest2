package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.favorites.data.service.FavoritesServiceProvider;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoriteComposerActionExecutor;
import ru.ozon.app.android.favorites.domain.actionhandlers.FavoritesCustomActionHandlerInteractor;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3BodyMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3GradientHeaderMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3HeaderMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductImageBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammersProductInfoBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.core.OldHammersV3BodyMapper;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerProductImageBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammersProductInfoBinder;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ui.switchingbutton.delegates.RemoveFromFavoritesSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonAddToFavoriteActionDelegate;
import ru.ozon.app.android.ui.switchingbutton.delegates.SwitchingButtonComposerActionWithRedirectDelegate;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;

@Metadata(d1 = {"\u0000\u0081\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001f\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u001f\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0080\u0001"}, d2 = {"ru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3Component$Companion$create$1$1", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/di/HammersV3Component;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "retainComposerPerformanceComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerPerformanceComponentApi;", "Lru/ozon/app/android/ui/switchingbutton/di/SwitchingButtonComponentApi;", "switchingButtonComponentApi", "Lru/ozon/app/android/ui/switchingbutton/di/SwitchingButtonComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoriteComposerActionExecutor;", "favoriteActionExecutor$delegate", "LSc/j;", "getFavoriteActionExecutor", "()Lru/ozon/app/android/favorites/domain/actionhandlers/FavoriteComposerActionExecutor;", "favoriteActionExecutor", "Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "interactor$delegate", "getInteractor", "()Lru/ozon/app/android/favorites/domain/actionhandlers/FavoritesCustomActionHandlerInteractor;", "interactor", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;", "switchingButtonAddToFavoriteActionDelegate$delegate", "getSwitchingButtonAddToFavoriteActionDelegate", "()Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonAddToFavoriteActionDelegate;", "switchingButtonAddToFavoriteActionDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;", "unFavActionDelegate$delegate", "getUnFavActionDelegate", "()Lru/ozon/app/android/ui/switchingbutton/delegates/RemoveFromFavoritesSwitchingButtonDelegate;", "unFavActionDelegate", "Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;", "composerActionWithRedirectDelegate$delegate", "getComposerActionWithRedirectDelegate", "()Lru/ozon/app/android/ui/switchingbutton/delegates/SwitchingButtonComposerActionWithRedirectDelegate;", "composerActionWithRedirectDelegate", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "gradientHeaderMapper$delegate", "getGradientHeaderMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "gradientHeaderMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3HeaderMapper;", "headerMapper$delegate", "getHeaderMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3HeaderMapper;", "headerMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3BodyMapper;", "bodyMapper$delegate", "getBodyMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3BodyMapper;", "bodyMapper", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyMapper;", "oldBodyMapper$delegate", "getOldBodyMapper", "()Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyMapper;", "oldBodyMapper", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "buttonDelegate$delegate", "getButtonDelegate", "()Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "buttonDelegate", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductImageBinder;", "getImageBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammerProductImageBinder;", "imageBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerProductImageBinder;", "getOldImageBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerProductImageBinder;", "oldImageBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammersProductInfoBinder;", "getInfoBlockBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/binders/HammersProductInfoBinder;", "infoBlockBinder", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammersProductInfoBinder;", "getOldInfoBlockBinder", "()Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammersProductInfoBinder;", "oldInfoBlockBinder", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "getFavoriteManager", "()Lru/ozon/app/android/favorites/domain/favoritemanager/FavoriteManager;", "favoriteManager", "Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "getFavoritesServiceProvider", "()Lru/ozon/app/android/favorites/data/service/FavoritesServiceProvider;", "favoritesServiceProvider", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "getSwitchingButtonStateStorage", "()Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "switchingButtonStateStorage", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3Component$Companion$create$1$1 implements HammersV3Component {
    private final AccountComponentApi accountComponentApi;
    private final ActionComponentApi actionComponentApi;

    /* renamed from: bodyMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j bodyMapper;

    /* renamed from: buttonDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonDelegate;

    /* renamed from: composerActionWithRedirectDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j composerActionWithRedirectDelegate;
    private final Context context;
    private final ContextComponentDependencies contextComponentDependencies;

    /* renamed from: favoriteActionExecutor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j favoriteActionExecutor;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;

    /* renamed from: gradientHeaderMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j gradientHeaderMapper;

    /* renamed from: headerMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j headerMapper;

    /* renamed from: interactor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j interactor;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: oldBodyMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j oldBodyMapper;
    private final RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi;
    private final StorageComponentApi storageComponentApi;

    /* renamed from: switchingButtonAddToFavoriteActionDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j switchingButtonAddToFavoriteActionDelegate;
    private final SwitchingButtonComponentApi switchingButtonComponentApi;

    /* renamed from: unFavActionDelegate$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j unFavActionDelegate;

    HammersV3Component$Companion$create$1$1(C7475g c7475g) {
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.retainComposerPerformanceComponentApi = (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class);
        this.switchingButtonComponentApi = (SwitchingButtonComponentApi) c7475g.getComponent(SwitchingButtonComponentApi.class);
        this.favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.contextComponentDependencies = contextComponentDependencies;
        this.context = contextComponentDependencies.getContext();
        this.favoriteActionExecutor = k.b(new HammersV3Component$Companion$create$1$1$favoriteActionExecutor$2(this));
        this.interactor = k.b(new HammersV3Component$Companion$create$1$1$interactor$2(this));
        this.switchingButtonAddToFavoriteActionDelegate = k.b(new HammersV3Component$Companion$create$1$1$switchingButtonAddToFavoriteActionDelegate$2(this));
        this.unFavActionDelegate = k.b(new HammersV3Component$Companion$create$1$1$unFavActionDelegate$2(this));
        this.composerActionWithRedirectDelegate = k.b(new HammersV3Component$Companion$create$1$1$composerActionWithRedirectDelegate$2(this));
        this.gradientHeaderMapper = k.b(new HammersV3Component$Companion$create$1$1$gradientHeaderMapper$2(this));
        this.headerMapper = k.b(HammersV3Component$Companion$create$1$1$headerMapper$2.INSTANCE);
        this.bodyMapper = k.b(HammersV3Component$Companion$create$1$1$bodyMapper$2.INSTANCE);
        this.oldBodyMapper = k.b(HammersV3Component$Companion$create$1$1$oldBodyMapper$2.INSTANCE);
        this.buttonDelegate = k.b(new HammersV3Component$Companion$create$1$1$buttonDelegate$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Repository getActionV2Repository() {
        return this.actionComponentApi.getActionRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdultHandler getAdultHandler() {
        return this.accountComponentApi.getAdultHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwitchingButtonComposerActionWithRedirectDelegate getComposerActionWithRedirectDelegate() {
        return (SwitchingButtonComposerActionWithRedirectDelegate) this.composerActionWithRedirectDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoriteComposerActionExecutor getFavoriteActionExecutor() {
        return (FavoriteComposerActionExecutor) this.favoriteActionExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoriteManager getFavoriteManager() {
        return this.favoriteCoreComponentApi.getFavoriteManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoritesServiceProvider getFavoritesServiceProvider() {
        return this.favoriteCoreComponentApi.getFavoritesServiceProvider();
    }

    private final FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoritesCustomActionHandlerInteractor getInteractor() {
        return (FavoritesCustomActionHandlerInteractor) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwitchingButtonAddToFavoriteActionDelegate getSwitchingButtonAddToFavoriteActionDelegate() {
        return (SwitchingButtonAddToFavoriteActionDelegate) this.switchingButtonAddToFavoriteActionDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SwitchingButtonStateStorage getSwitchingButtonStateStorage() {
        return this.switchingButtonComponentApi.getSwitchingButtonStorage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoveFromFavoritesSwitchingButtonDelegate getUnFavActionDelegate() {
        return (RemoveFromFavoritesSwitchingButtonDelegate) this.unFavActionDelegate.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public HammersV3BodyMapper getBodyMapper() {
        return (HammersV3BodyMapper) this.bodyMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public SwitchingButtonDelegate getButtonDelegate() {
        return (SwitchingButtonDelegate) this.buttonDelegate.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public FrameBinder getFrameBinder() {
        return this.retainComposerPerformanceComponentApi.getFrameBinder();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public HammersV3GradientHeaderMapper getGradientHeaderMapper() {
        return (HammersV3GradientHeaderMapper) this.gradientHeaderMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public HammersV3HeaderMapper getHeaderMapper() {
        return (HammersV3HeaderMapper) this.headerMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public HammerProductImageBinder getImageBinder() {
        return new HammerProductImageBinder(getAdultHandler(), getFeatureChecker());
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public HammersProductInfoBinder getInfoBlockBinder() {
        return new HammersProductInfoBinder();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public OldHammersV3BodyMapper getOldBodyMapper() {
        return (OldHammersV3BodyMapper) this.oldBodyMapper.getValue();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public OldHammerProductImageBinder getOldImageBinder() {
        return new OldHammerProductImageBinder(getAdultHandler(), getFeatureChecker());
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public OldHammersProductInfoBinder getOldInfoBlockBinder() {
        return new OldHammersProductInfoBinder();
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di.HammersV3Component
    public StartupArgsService getStartupArgsService() {
        return this.storageComponentApi.getStartupArgsService();
    }
}
