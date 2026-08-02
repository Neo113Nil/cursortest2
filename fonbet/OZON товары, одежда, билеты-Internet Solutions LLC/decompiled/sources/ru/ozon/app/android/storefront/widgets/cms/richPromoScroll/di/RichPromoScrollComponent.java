package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.di;

import AB.b;
import Pc.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoViewModel;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.adapter.CatalogTileScrollItemsAdapterFactory;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/di/RichPromoScrollComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/adapter/CatalogTileScrollItemsAdapterFactory;", "getAdapterFactory", "()LPc/a;", "adapterFactory", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoViewModel;", "getRichPromoViewModelProvider", "richPromoViewModelProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RichPromoScrollComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/di/RichPromoScrollComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/di/RichPromoScrollComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RichPromoScrollComponent create$lambda$0(C7475g c7475g) {
            return new RichPromoScrollComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<RichPromoScrollComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(RichPromoScrollComponent.class), new b(storage, 17));
        }
    }

    @NotNull
    a<CatalogTileScrollItemsAdapterFactory> getAdapterFactory();

    @NotNull
    a<RichPromoViewModel> getRichPromoViewModelProvider();

    @NotNull
    l getTokenizedAnalytics();
}
