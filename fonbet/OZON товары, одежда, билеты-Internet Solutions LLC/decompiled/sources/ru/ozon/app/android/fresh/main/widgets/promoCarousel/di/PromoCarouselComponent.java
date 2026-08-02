package ru.ozon.app.android.fresh.main.widgets.promoCarousel.di;

import AQ.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.PromoCarouselBannerDecorator;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDTO;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u00060\tj\u0002`\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/di/PromoCarouselComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerDecorator;", "getDecorator", "()Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerDecorator;", "decorator", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PromoCarouselComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/di/PromoCarouselComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/di/PromoCarouselComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromoCarouselComponent create$lambda$0(final C7475g c7475g) {
            return new PromoCarouselComponent() { // from class: ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(PromoCarouselComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent
                public PromoCarouselBannerDecorator getDecorator() {
                    return new PromoCarouselBannerDecorator();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent
                public FeatureService getFeatureService() {
                    return ((NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class)).getFeatureService();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent
                public Function2<PromoCarouselDTO, d, List<PromoCarouselVO>> getMapper() {
                    return (Function2) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<PromoCarouselComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PromoCarouselComponent.class), new a(storage, 1));
        }
    }

    @NotNull
    PromoCarouselBannerDecorator getDecorator();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    Function2<PromoCarouselDTO, d, List<PromoCarouselVO>> getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
