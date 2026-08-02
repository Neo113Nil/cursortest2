package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di;

import BZ.f;
import CS.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.data.HotelsPageMapPreviewV2Mapper;
import ru.ozon.app.android.travel.map.di.TravelMapApi;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0019R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/di/HotelsPageMapPreviewV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/data/HotelsPageMapPreviewV2Mapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "getTravelGeoProviderStorage", "()Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProviderStorage", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "", "getMiniAppName", "()Ljava/lang/String;", "miniAppName", "Companion", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsPageMapPreviewV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/di/HotelsPageMapPreviewV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/di/HotelsPageMapPreviewV2Component;", "create", "(Lk20/g;)Lk20/e;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsPageMapPreviewV2Component create$lambda$0(final C7475g c7475g) {
            return new HotelsPageMapPreviewV2Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(HotelsPageMapPreviewV2Component$Companion$create$1$1$mapper$2.INSTANCE);
                private final String miniApp;
                private final RetainComposerComponentApi retainComposerComponentApi;
                private final TravelMapApi travelMapApi;

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.travelMapApi = (TravelMapApi) c7475g.getComponent(TravelMapApi.class);
                    this.miniApp = f.a(((NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class)).getMiniAppConfigHolder());
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component
                public HotelsPageMapPreviewV2Mapper getMapper() {
                    return (HotelsPageMapPreviewV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component
                /* renamed from: getMiniAppName, reason: from getter */
                public String getMiniApp() {
                    return this.miniApp;
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component
                public TravelGeoProvidersStorage getTravelGeoProviderStorage() {
                    return this.travelMapApi.getTravelGeoProviderStorage();
                }
            };
        }

        @NotNull
        public final C7473e<HotelsPageMapPreviewV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsPageMapPreviewV2Component.class), new a(storage, 2));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HotelsPageMapPreviewV2Mapper getMapper();

    @NotNull
    /* renamed from: getMiniAppName */
    String getMiniApp();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    TravelGeoProvidersStorage getTravelGeoProviderStorage();
}
