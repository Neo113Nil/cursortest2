package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di;

import AB.b;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data.ModalCheckoutTimeLimitMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data.ModalCheckoutTimeLimitTimerMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.ModalCheckoutTimeLimitViewModel;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0016\u001a\u00060\u0012j\u0002`\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/di/ModalCheckoutTimeLimitComponent;", "Lhi/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitTimerMapper;", "getTimerMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitTimerMapper;", "timerMapper", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ModalCheckoutTimeLimitComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/di/ModalCheckoutTimeLimitComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/di/ModalCheckoutTimeLimitComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ModalCheckoutTimeLimitComponent create$lambda$0(final C7475g c7475g) {
            return new ModalCheckoutTimeLimitComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent$Companion$create$1$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ModalCheckoutTimeLimitComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: timerMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j timerMapper = k.b(ModalCheckoutTimeLimitComponent$Companion$create$1$1$timerMapper$2.INSTANCE);

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent
                public ModalCheckoutTimeLimitMapper getMapper() {
                    return (ModalCheckoutTimeLimitMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent
                public ModalCheckoutTimeLimitTimerMapper getTimerMapper() {
                    return (ModalCheckoutTimeLimitTimerMapper) this.timerMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent
                public ModalCheckoutTimeLimitViewModel getViewModel() {
                    return new ModalCheckoutTimeLimitViewModel(getMapper());
                }
            };
        }

        @NotNull
        public final C7473e<ModalCheckoutTimeLimitComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ModalCheckoutTimeLimitComponent.class), new b(storage, 4));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ModalCheckoutTimeLimitMapper getMapper();

    @NotNull
    ModalCheckoutTimeLimitTimerMapper getTimerMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    ModalCheckoutTimeLimitViewModel getViewModel();
}
