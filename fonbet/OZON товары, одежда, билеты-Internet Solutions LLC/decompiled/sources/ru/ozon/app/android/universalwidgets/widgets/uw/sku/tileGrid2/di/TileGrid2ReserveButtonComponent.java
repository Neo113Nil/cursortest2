package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di;

import AV.a;
import Sc.InterfaceC4008j;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegateProvider;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.domain.wishlist.WishlistService;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2ReserveButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegateProvider;", "getFavoriteReserveButtonDelegateProvider", "()Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegateProvider;", "favoriteReserveButtonDelegateProvider", "LSc/j;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/domain/wishlist/WishlistService;", "getWishlistServiceLazy", "()LSc/j;", "wishlistServiceLazy", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2ReserveButtonComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2ReserveButtonComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2ReserveButtonComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TileGrid2ReserveButtonComponent create$lambda$0(final C7475g c7475g) {
            return new TileGrid2ReserveButtonComponent() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2ReserveButtonComponent$Companion$create$1$1
                private final InterfaceC4008j<WishlistService> wishlistServiceLazy;

                {
                    this.wishlistServiceLazy = LazyUtilsKt.unsafeLazy(new TileGrid2ReserveButtonComponent$Companion$create$1$1$wishlistServiceLazy$1(C7475g.this));
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2ReserveButtonComponent
                public FavoriteReserveButtonDelegateProvider getFavoriteReserveButtonDelegateProvider() {
                    return ((FavoriteComponentApi) C7475g.this.getComponent(FavoriteComponentApi.class)).getFavoriteReserveButtonDelegate();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2ReserveButtonComponent
                public FrameBinder getFrameBinder() {
                    return ((RetainComposerPerformanceComponentApi) C7475g.this.getComponent(RetainComposerPerformanceComponentApi.class)).getFrameBinder();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2ReserveButtonComponent
                public InterfaceC4008j<WishlistService> getWishlistServiceLazy() {
                    return this.wishlistServiceLazy;
                }
            };
        }

        @NotNull
        public final C7473e<TileGrid2ReserveButtonComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(TileGrid2ReserveButtonComponent.class), new a(storage, 11));
        }
    }

    @NotNull
    FavoriteReserveButtonDelegateProvider getFavoriteReserveButtonDelegateProvider();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    InterfaceC4008j<WishlistService> getWishlistServiceLazy();
}
