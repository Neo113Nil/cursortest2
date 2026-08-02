package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di;

import AH.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2PollingMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2RoomMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.data.ToursRoomsListV2SkeletonMapper;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/di/ToursRoomsListV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2SkeletonMapper;", "getToursRoomsListV2SkeletonMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2SkeletonMapper;", "toursRoomsListV2SkeletonMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2RoomMapper;", "getToursRoomsListV2RoomMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2RoomMapper;", "toursRoomsListV2RoomMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2PollingMapper;", "getToursRoomsListV2PollingMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/data/ToursRoomsListV2PollingMapper;", "toursRoomsListV2PollingMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ToursRoomsListV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/di/ToursRoomsListV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/di/ToursRoomsListV2Component;", "create", "(Lk20/g;)Lk20/e;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ToursRoomsListV2Component create$lambda$0(final C7475g c7475g) {
            return new ToursRoomsListV2Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionComponentApi;
                private final RetainComposerComponentApi retainComponentApi;

                /* renamed from: toursRoomsListV2SkeletonMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j toursRoomsListV2SkeletonMapper = k.b(ToursRoomsListV2Component$Companion$create$1$1$toursRoomsListV2SkeletonMapper$2.INSTANCE);

                /* renamed from: toursRoomsListV2RoomMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j toursRoomsListV2RoomMapper = k.b(ToursRoomsListV2Component$Companion$create$1$1$toursRoomsListV2RoomMapper$2.INSTANCE);

                /* renamed from: toursRoomsListV2PollingMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j toursRoomsListV2PollingMapper = k.b(ToursRoomsListV2Component$Companion$create$1$1$toursRoomsListV2PollingMapper$2.INSTANCE);

                {
                    this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component
                public ToursRoomsListV2PollingMapper getToursRoomsListV2PollingMapper() {
                    return (ToursRoomsListV2PollingMapper) this.toursRoomsListV2PollingMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component
                public ToursRoomsListV2RoomMapper getToursRoomsListV2RoomMapper() {
                    return (ToursRoomsListV2RoomMapper) this.toursRoomsListV2RoomMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component
                public ToursRoomsListV2SkeletonMapper getToursRoomsListV2SkeletonMapper() {
                    return (ToursRoomsListV2SkeletonMapper) this.toursRoomsListV2SkeletonMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<ToursRoomsListV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ToursRoomsListV2Component.class), new a(storage, 7));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ToursRoomsListV2PollingMapper getToursRoomsListV2PollingMapper();

    @NotNull
    ToursRoomsListV2RoomMapper getToursRoomsListV2RoomMapper();

    @NotNull
    ToursRoomsListV2SkeletonMapper getToursRoomsListV2SkeletonMapper();
}
