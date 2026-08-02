package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoViewModel;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogTileScrollItemsAdapterFactory;
import zK.b;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/storefront/widgets/cms/richPromoScroll/di/RichPromoScrollComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/di/RichPromoScrollComponent;", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoViewModel;", "richPromoViewModelProvider", "LPc/a;", "getRichPromoViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/core/RichPromoScrollMapper;", "mapper", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogTileScrollItemsAdapterFactory;", "adapterFactory", "getAdapterFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichPromoScrollComponent$Companion$create$1$1 implements RichPromoScrollComponent {
    final /* synthetic */ C7475g $storage;
    private final a<RichPromoViewModel> richPromoViewModelProvider = new zK.a();

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(RichPromoScrollComponent$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<CatalogTileScrollItemsAdapterFactory> adapterFactory = new b();

    RichPromoScrollComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTileScrollItemsAdapterFactory adapterFactory$lambda$1() {
        return new CatalogTileScrollItemsAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RichPromoViewModel richPromoViewModelProvider$lambda$0() {
        return new RichPromoViewModel();
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.di.RichPromoScrollComponent
    public a<CatalogTileScrollItemsAdapterFactory> getAdapterFactory() {
        return this.adapterFactory;
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.di.RichPromoScrollComponent
    public a<RichPromoViewModel> getRichPromoViewModelProvider() {
        return this.richPromoViewModelProvider;
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.di.RichPromoScrollComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
