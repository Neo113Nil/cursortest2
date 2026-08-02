package ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WS.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.data.AvailablePromotionMapper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/di/AvailablePromotionComponent;", "Lhi/a;", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/data/AvailablePromotionMapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AvailablePromotionComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/di/AvailablePromotionComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/di/AvailablePromotionComponent;", "create", "()Lk20/e;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AvailablePromotionComponent create$lambda$0() {
            return new AvailablePromotionComponent() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.di.AvailablePromotionComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(AvailablePromotionComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(AvailablePromotionComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.di.AvailablePromotionComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.di.AvailablePromotionComponent
                public AvailablePromotionMapper getMapper() {
                    return (AvailablePromotionMapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<AvailablePromotionComponent> create() {
            return new C7473e<>(N.b(AvailablePromotionComponent.class), new a());
        }
    }

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    AvailablePromotionMapper getMapper();
}
