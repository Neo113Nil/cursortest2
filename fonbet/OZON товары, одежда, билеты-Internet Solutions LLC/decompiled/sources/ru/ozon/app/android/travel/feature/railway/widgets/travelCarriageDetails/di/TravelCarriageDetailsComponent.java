package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.di;

import DI.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.data.TravelCarriageDetailsMapper;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00060\u0001j\u0002`\u0002:\u0001\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/di/TravelCarriageDetailsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsMapper;", "getTravelCarriageDetailsMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/data/TravelCarriageDetailsMapper;", "travelCarriageDetailsMapper", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TravelCarriageDetailsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/di/TravelCarriageDetailsComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/di/TravelCarriageDetailsComponent;", "create", "()Lk20/e;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TravelCarriageDetailsComponent create$lambda$0() {
            return new TravelCarriageDetailsComponent() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.di.TravelCarriageDetailsComponent$Companion$create$1$1

                /* renamed from: travelCarriageDetailsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j travelCarriageDetailsMapper = k.b(TravelCarriageDetailsComponent$Companion$create$1$1$travelCarriageDetailsMapper$2.INSTANCE);

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.di.TravelCarriageDetailsComponent
                public TravelCarriageDetailsMapper getTravelCarriageDetailsMapper() {
                    return (TravelCarriageDetailsMapper) this.travelCarriageDetailsMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<TravelCarriageDetailsComponent> create() {
            return new C7473e<>(N.b(TravelCarriageDetailsComponent.class), new a(1));
        }
    }

    @NotNull
    TravelCarriageDetailsMapper getTravelCarriageDetailsMapper();
}
