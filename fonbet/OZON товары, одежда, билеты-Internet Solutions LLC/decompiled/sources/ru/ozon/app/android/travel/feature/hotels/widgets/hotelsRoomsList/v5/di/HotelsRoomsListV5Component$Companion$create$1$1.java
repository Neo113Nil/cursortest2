package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5ButtonMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5LoaderMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5NotificationMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5RoomsMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data.HotelsRoomsListV5UpdaterMapper;
import ru.ozon.app.android.travel.utils.fontScaleProvider.FontScaleProvider;

@Metadata(d1 = {"\u0000i\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"ru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/di/HotelsRoomsListV5Component;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5LoaderMapper;", "loaderMapper$delegate", "LSc/j;", "getLoaderMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5LoaderMapper;", "loaderMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5NotificationMapper;", "notificationMapper$delegate", "getNotificationMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5NotificationMapper;", "notificationMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5RoomsMapper;", "roomsMapper$delegate", "getRoomsMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5RoomsMapper;", "roomsMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5ButtonMapper;", "buttonMapper$delegate", "getButtonMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5ButtonMapper;", "buttonMapper", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5UpdaterMapper;", "updaterMapper$delegate", "getUpdaterMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5UpdaterMapper;", "updaterMapper", "Lru/ozon/app/android/travel/utils/fontScaleProvider/FontScaleProvider;", "fontScaleProvider$delegate", "getFontScaleProvider", "()Lru/ozon/app/android/travel/utils/fontScaleProvider/FontScaleProvider;", "fontScaleProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5Component$Companion$create$1$1 implements HotelsRoomsListV5Component {
    private final ContextComponentDependencies contextComponentApi;
    private final CustomActionHandlersComponentApi customActionComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: loaderMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j loaderMapper = k.b(HotelsRoomsListV5Component$Companion$create$1$1$loaderMapper$2.INSTANCE);

    /* renamed from: notificationMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j notificationMapper = k.b(HotelsRoomsListV5Component$Companion$create$1$1$notificationMapper$2.INSTANCE);

    /* renamed from: roomsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j roomsMapper = k.b(new HotelsRoomsListV5Component$Companion$create$1$1$roomsMapper$2(this));

    /* renamed from: buttonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonMapper = k.b(HotelsRoomsListV5Component$Companion$create$1$1$buttonMapper$2.INSTANCE);

    /* renamed from: updaterMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j updaterMapper = k.b(HotelsRoomsListV5Component$Companion$create$1$1$updaterMapper$2.INSTANCE);

    /* renamed from: fontScaleProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j fontScaleProvider = k.b(new HotelsRoomsListV5Component$Companion$create$1$1$fontScaleProvider$2(this));

    HotelsRoomsListV5Component$Companion$create$1$1(C7475g c7475g) {
        this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.contextComponentApi = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public HotelsRoomsListV5ButtonMapper getButtonMapper() {
        return (HotelsRoomsListV5ButtonMapper) this.buttonMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public FontScaleProvider getFontScaleProvider() {
        return (FontScaleProvider) this.fontScaleProvider.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public HotelsRoomsListV5LoaderMapper getLoaderMapper() {
        return (HotelsRoomsListV5LoaderMapper) this.loaderMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public HotelsRoomsListV5NotificationMapper getNotificationMapper() {
        return (HotelsRoomsListV5NotificationMapper) this.notificationMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public HotelsRoomsListV5RoomsMapper getRoomsMapper() {
        return (HotelsRoomsListV5RoomsMapper) this.roomsMapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component
    public HotelsRoomsListV5UpdaterMapper getUpdaterMapper() {
        return (HotelsRoomsListV5UpdaterMapper) this.updaterMapper.getValue();
    }
}
