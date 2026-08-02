package ru.ozon.app.android.ads.widgets.advPageStay.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\r\u001a\u00060\u0007j\u0002`\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/ads/widgets/advPageStay/di/AdvPageStayComponent$Companion$create$1", "Lru/ozon/app/android/ads/widgets/advPageStay/di/AdvPageStayComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics$delegate", "LSc/j;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewModel;", "getViewModel", "()Lru/ozon/app/android/ads/widgets/advPageStay/presentation/AdvPageStayViewModel;", "viewModel", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvPageStayComponent$Companion$create$1 implements AdvPageStayComponent {
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new AdvPageStayComponent$Companion$create$1$tokenizedAnalytics$2(this));

    AdvPageStayComponent$Companion$create$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
    }

    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return this.retainComposerComponentApi;
    }

    @Override // ru.ozon.app.android.ads.widgets.advPageStay.di.AdvPageStayComponent
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.ads.widgets.advPageStay.di.AdvPageStayComponent
    public AdvPageStayViewModel getViewModel() {
        return new AdvPageStayViewModel(getTokenizedAnalytics());
    }
}
