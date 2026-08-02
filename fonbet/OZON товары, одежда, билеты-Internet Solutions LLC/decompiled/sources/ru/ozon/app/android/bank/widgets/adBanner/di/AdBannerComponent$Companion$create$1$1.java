package ru.ozon.app.android.bank.widgets.adBanner.di;

import Pc.a;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/bank/widgets/adBanner/di/AdBannerComponent$Companion$create$1$1", "Lru/ozon/app/android/bank/widgets/adBanner/di/AdBannerComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "LPc/a;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerComponent$Companion$create$1$1 implements AdBannerComponent {
    private final ActionComponentApi actionComponentApi;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final RetainComposerComponentApi retainComposerComponentApi;
    private final l tokenizedAnalytics;
    private final a<AdBannerViewModel> viewModelProvider;

    AdBannerComponent$Companion$create$1$1(C7475g c7475g) {
        RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.retainComposerComponentApi = retainComposerComponentApi;
        this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
        this.viewModelProvider = new XG.a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdBannerViewModel viewModelProvider$lambda$0(AdBannerComponent$Companion$create$1$1 adBannerComponent$Companion$create$1$1) {
        return new AdBannerViewModel(adBannerComponent$Companion$create$1$1.actionComponentApi.getActionRepository(), adBannerComponent$Companion$create$1$1.coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    @Override // ru.ozon.app.android.bank.widgets.adBanner.di.AdBannerComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.bank.widgets.adBanner.di.AdBannerComponent
    public a<AdBannerViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
