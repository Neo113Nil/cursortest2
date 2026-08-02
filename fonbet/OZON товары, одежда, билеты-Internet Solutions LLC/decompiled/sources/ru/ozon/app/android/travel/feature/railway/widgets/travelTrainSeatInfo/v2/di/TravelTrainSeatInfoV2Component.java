package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.di;

import Ro.C3938a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.data.TravelTrainSeatInfoV2Mapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/di/TravelTrainSeatInfoV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/data/TravelTrainSeatInfoV2Mapper;", "mapper", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TravelTrainSeatInfoV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/di/TravelTrainSeatInfoV2Component$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainSeatInfo/v2/di/TravelTrainSeatInfoV2Component;", "create", "()Lk20/e;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TravelTrainSeatInfoV2Component create$lambda$0() {
            return new TravelTrainSeatInfoV2Component() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.di.TravelTrainSeatInfoV2Component$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(TravelTrainSeatInfoV2Component$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.di.TravelTrainSeatInfoV2Component
                public TravelTrainSeatInfoV2Mapper getMapper() {
                    return (TravelTrainSeatInfoV2Mapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<TravelTrainSeatInfoV2Component> create() {
            return new C7473e<>(N.b(TravelTrainSeatInfoV2Component.class), new C3938a(1));
        }
    }

    @NotNull
    TravelTrainSeatInfoV2Mapper getMapper();
}
