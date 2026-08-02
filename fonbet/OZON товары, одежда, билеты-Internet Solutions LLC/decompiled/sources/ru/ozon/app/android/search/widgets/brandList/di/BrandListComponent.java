package ru.ozon.app.android.search.widgets.brandList.di;

import Du.C2881a;
import GZ.g;
import Pc.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.brandList.presentation.BrandListViewModel;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.v2.ComposeSisBrandFavoriteButtonDelegateFactory;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/di/BrandListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "getSisBrandFavoriteButtonDelegateFactory", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/v2/ComposeSisBrandFavoriteButtonDelegateFactory;", "sisBrandFavoriteButtonDelegateFactory", "LPc/a;", "Lru/ozon/app/android/search/widgets/brandList/presentation/BrandListViewModel;", "getViewModel", "()LPc/a;", "viewModel", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BrandListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/brandList/di/BrandListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/search/widgets/brandList/di/BrandListComponent;", "create", "(Lk20/g;)Lk20/e;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BrandListComponent create$lambda$0(C7475g c7475g) {
            return new BrandListComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<BrandListComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BrandListComponent.class), new C2881a(storage, 9));
        }
    }

    @NotNull
    g getRouter();

    @NotNull
    ComposeSisBrandFavoriteButtonDelegateFactory getSisBrandFavoriteButtonDelegateFactory();

    @NotNull
    a<BrandListViewModel> getViewModel();
}
