package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewModel;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0011\u001a\u00060\rj\u0002`\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/promoOffer/di/PromoOfferComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/di/PromoOfferComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferMapper;", "mapper", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoOfferComponent$Companion$create$1$1 implements PromoOfferComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(PromoOfferComponent$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel;

    PromoOfferComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModel = k.b(new PromoOfferComponent$Companion$create$1$1$viewModel$2(c7475g, this));
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di.PromoOfferComponent
    public PromoOfferMapper getMapper() {
        return (PromoOfferMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di.PromoOfferComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.di.PromoOfferComponent
    public PromoOfferViewModel getViewModel() {
        return (PromoOfferViewModel) this.viewModel.getValue();
    }
}
