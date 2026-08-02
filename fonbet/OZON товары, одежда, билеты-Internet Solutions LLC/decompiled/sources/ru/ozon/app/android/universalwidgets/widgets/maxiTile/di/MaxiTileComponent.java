package ru.ozon.app.android.universalwidgets.widgets.maxiTile.di;

import Br.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.mapper.MaxiTileMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/di/MaxiTileComponent;", "Lhi/a;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/mapper/MaxiTileMapper;", "getMapper", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/mapper/MaxiTileMapper;", "mapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "getAddToCartButtonsBinder", "()Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "addToCartButtonsBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "getFrameBinder", "()Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MaxiTileComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/di/MaxiTileComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/di/MaxiTileComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MaxiTileComponent create$lambda$0(final C7475g c7475g) {
            return new MaxiTileComponent(c7475g) { // from class: ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileComponent$Companion$create$1$1
                private final AddToCartButtonsBinder addToCartButtonsBinder;
                private final CartServiceApi cartServiceApi;
                private final RetainComposerPerformanceComponentApi composerPerformanceComponentApi;
                private final FrameBinder frameBinder;
                private final MaxiTileMapper mapper;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;
                private final l tokenizedAnalytics;

                {
                    RetainComposerComponentApi retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.retainComponentApi = retainComposerComponentApi;
                    CartServiceApi cartServiceApi = (CartServiceApi) c7475g.getComponent(CartServiceApi.class);
                    this.cartServiceApi = cartServiceApi;
                    NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.networkComponentApi = networkComponentApi;
                    RetainComposerPerformanceComponentApi retainComposerPerformanceComponentApi = (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class);
                    this.composerPerformanceComponentApi = retainComposerPerformanceComponentApi;
                    this.mapper = new MaxiTileMapper();
                    this.tokenizedAnalytics = retainComposerComponentApi.getTokenizedAnalytics();
                    this.addToCartButtonsBinder = new AddToCartButtonsBinder(cartServiceApi.getCartService(), networkComponentApi.getFeatureChecker());
                    this.frameBinder = retainComposerPerformanceComponentApi.getFrameBinder();
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileComponent
                public AddToCartButtonsBinder getAddToCartButtonsBinder() {
                    return this.addToCartButtonsBinder;
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileComponent
                public FrameBinder getFrameBinder() {
                    return this.frameBinder;
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileComponent
                public MaxiTileMapper getMapper() {
                    return this.mapper;
                }

                @Override // ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileComponent
                public l getTokenizedAnalytics() {
                    return this.tokenizedAnalytics;
                }
            };
        }

        @NotNull
        public final C7473e<MaxiTileComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MaxiTileComponent.class), new d(storage, 1));
        }
    }

    @NotNull
    AddToCartButtonsBinder getAddToCartButtonsBinder();

    @NotNull
    FrameBinder getFrameBinder();

    @NotNull
    MaxiTileMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
