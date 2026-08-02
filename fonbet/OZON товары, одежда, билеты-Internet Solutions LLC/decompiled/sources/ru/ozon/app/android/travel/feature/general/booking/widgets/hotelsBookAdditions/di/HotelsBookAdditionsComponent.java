package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di;

import AN.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.data.HotelsBookAdditionsMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModelImpl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/di/HotelsBookAdditionsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/data/HotelsBookAdditionsMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel;", "viewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HotelsBookAdditionsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/di/HotelsBookAdditionsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/di/HotelsBookAdditionsComponent;", "create", "(Lk20/g;)Lk20/e;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final HotelsBookAdditionsComponent create$lambda$0(final C7475g c7475g) {
            return new HotelsBookAdditionsComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di.HotelsBookAdditionsComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(HotelsBookAdditionsComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di.HotelsBookAdditionsComponent
                public HotelsBookAdditionsMapper getMapper() {
                    return (HotelsBookAdditionsMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di.HotelsBookAdditionsComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di.HotelsBookAdditionsComponent
                public HotelsBookAdditionsViewModel getViewModel() {
                    return new HotelsBookAdditionsViewModelImpl();
                }
            };
        }

        @NotNull
        public final C7473e<HotelsBookAdditionsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(HotelsBookAdditionsComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    HotelsBookAdditionsMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    HotelsBookAdditionsViewModel getViewModel();
}
