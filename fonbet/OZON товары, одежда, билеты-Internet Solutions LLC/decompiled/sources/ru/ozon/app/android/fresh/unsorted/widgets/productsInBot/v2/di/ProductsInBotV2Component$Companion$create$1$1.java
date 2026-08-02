package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.api.ProductsInBotV2Api;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2Mapper;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/di/ProductsInBotV2Component$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/di/ProductsInBotV2Component;", "LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2Mapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2Mapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2Component$Companion$create$1$1 implements ProductsInBotV2Component {
    final /* synthetic */ C7475g $storage;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(ProductsInBotV2Component$Companion$create$1$1$mapper$2.INSTANCE);
    private final a<ProductsInBotV2ViewModel> viewModelProvider;

    ProductsInBotV2Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.viewModelProvider = new Ix.a(c7475g, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductsInBotV2ViewModel viewModelProvider$lambda$0(C7475g c7475g) {
        Object create = ((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class)).getRetrofit().create(ProductsInBotV2Api.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new ProductsInBotV2ViewModel((ProductsInBotV2Api) create);
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2Component
    public ProductsInBotV2Mapper getMapper() {
        return (ProductsInBotV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2Component
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2Component
    public a<ProductsInBotV2ViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
