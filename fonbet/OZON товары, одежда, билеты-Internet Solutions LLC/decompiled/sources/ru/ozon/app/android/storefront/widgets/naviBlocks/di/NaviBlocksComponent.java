package ru.ozon.app.android.storefront.widgets.naviBlocks.di;

import CS.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers.CarouselBlockTypeMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers.CoupleBlockTypeMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers.LastEmptyBlockTypeMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers.OneFrameBlockTypeMapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/di/NaviBlocksComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CoupleBlockTypeMapper;", "getCoupleBlockTypeMapper", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CoupleBlockTypeMapper;", "coupleBlockTypeMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/LastEmptyBlockTypeMapper;", "getLastEmptyBlockTypeMapper", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/LastEmptyBlockTypeMapper;", "lastEmptyBlockTypeMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CarouselBlockTypeMapper;", "getCarouselBlockTypeMapper", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CarouselBlockTypeMapper;", "carouselBlockTypeMapper", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/OneFrameBlockTypeMapper;", "getOneFrameBlockTypeMapper", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/OneFrameBlockTypeMapper;", "oneFrameBlockTypeMapper", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NaviBlocksComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/di/NaviBlocksComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/di/NaviBlocksComponent;", "create", "(Lk20/g;)Lk20/e;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NaviBlocksComponent create$lambda$0(final C7475g c7475g) {
            return new NaviBlocksComponent(c7475g) { // from class: ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent$Companion$create$1$1
                private final NetworkComponentApi networkComponentApi;

                /* renamed from: coupleBlockTypeMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j coupleBlockTypeMapper = k.b(NaviBlocksComponent$Companion$create$1$1$coupleBlockTypeMapper$2.INSTANCE);

                /* renamed from: lastEmptyBlockTypeMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j lastEmptyBlockTypeMapper = k.b(NaviBlocksComponent$Companion$create$1$1$lastEmptyBlockTypeMapper$2.INSTANCE);

                /* renamed from: carouselBlockTypeMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j carouselBlockTypeMapper = k.b(NaviBlocksComponent$Companion$create$1$1$carouselBlockTypeMapper$2.INSTANCE);

                /* renamed from: oneFrameBlockTypeMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j oneFrameBlockTypeMapper = k.b(NaviBlocksComponent$Companion$create$1$1$oneFrameBlockTypeMapper$2.INSTANCE);

                {
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                }

                @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent
                public CarouselBlockTypeMapper getCarouselBlockTypeMapper() {
                    return (CarouselBlockTypeMapper) this.carouselBlockTypeMapper.getValue();
                }

                @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent
                public CoupleBlockTypeMapper getCoupleBlockTypeMapper() {
                    return (CoupleBlockTypeMapper) this.coupleBlockTypeMapper.getValue();
                }

                @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent
                public LastEmptyBlockTypeMapper getLastEmptyBlockTypeMapper() {
                    return (LastEmptyBlockTypeMapper) this.lastEmptyBlockTypeMapper.getValue();
                }

                @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent
                public OneFrameBlockTypeMapper getOneFrameBlockTypeMapper() {
                    return (OneFrameBlockTypeMapper) this.oneFrameBlockTypeMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<NaviBlocksComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NaviBlocksComponent.class), new a(storage, 10));
        }
    }

    @NotNull
    CarouselBlockTypeMapper getCarouselBlockTypeMapper();

    @NotNull
    CoupleBlockTypeMapper getCoupleBlockTypeMapper();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    LastEmptyBlockTypeMapper getLastEmptyBlockTypeMapper();

    @NotNull
    OneFrameBlockTypeMapper getOneFrameBlockTypeMapper();
}
