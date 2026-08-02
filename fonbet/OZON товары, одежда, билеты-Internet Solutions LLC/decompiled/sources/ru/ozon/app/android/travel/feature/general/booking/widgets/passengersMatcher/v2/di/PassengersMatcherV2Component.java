package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di;

import EV.a;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data.PassengersMatcherV2ButtonMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data.PassengersMatcherV2Mapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/di/PassengersMatcherV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2Mapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2ButtonMapper;", "getButtonMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2ButtonMapper;", "buttonMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PassengersMatcherV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/di/PassengersMatcherV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/di/PassengersMatcherV2Component;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PassengersMatcherV2Component create$lambda$0(final C7475g c7475g) {
            return new PassengersMatcherV2Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component$Companion$create$1$1

                /* renamed from: buttonMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j buttonMapper = k.b(PassengersMatcherV2Component$Companion$create$1$1$buttonMapper$2.INSTANCE);
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.mapper = k.b(new PassengersMatcherV2Component$Companion$create$1$1$mapper$2(c7475g));
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component
                public PassengersMatcherV2ButtonMapper getButtonMapper() {
                    return (PassengersMatcherV2ButtonMapper) this.buttonMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component
                public PassengersMatcherV2Mapper getMapper() {
                    return (PassengersMatcherV2Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<PassengersMatcherV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PassengersMatcherV2Component.class), new a(storage, 4));
        }
    }

    @NotNull
    PassengersMatcherV2ButtonMapper getButtonMapper();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    PassengersMatcherV2Mapper getMapper();

    @NotNull
    l getTokenizedAnalytics();
}
