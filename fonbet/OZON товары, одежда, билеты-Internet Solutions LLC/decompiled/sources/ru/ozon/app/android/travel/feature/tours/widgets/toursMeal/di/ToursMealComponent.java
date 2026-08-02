package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di;

import At.C2445a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealStickyBottomMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealStickyTopMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/di/ToursMealComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealMapper;", "getToursMealMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealMapper;", "toursMealMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealStickyBottomMapper;", "getToursMealStickyBottomMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealStickyBottomMapper;", "toursMealStickyBottomMapper", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealStickyTopMapper;", "getToursMealStickyTopMapper", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealStickyTopMapper;", "toursMealStickyTopMapper", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ToursMealComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/di/ToursMealComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/di/ToursMealComponent;", "create", "(Lk20/g;)Lk20/e;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ToursMealComponent create$lambda$0(final C7475g c7475g) {
            return new ToursMealComponent(c7475g) { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent$Companion$create$1$1
                private final RetainComposerComponentApi retainComponentApi;

                /* renamed from: toursMealMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j toursMealMapper = k.b(ToursMealComponent$Companion$create$1$1$toursMealMapper$2.INSTANCE);

                /* renamed from: toursMealStickyBottomMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j toursMealStickyBottomMapper = k.b(ToursMealComponent$Companion$create$1$1$toursMealStickyBottomMapper$2.INSTANCE);

                /* renamed from: toursMealStickyTopMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j toursMealStickyTopMapper = k.b(ToursMealComponent$Companion$create$1$1$toursMealStickyTopMapper$2.INSTANCE);

                {
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent
                public ToursMealMapper getToursMealMapper() {
                    return (ToursMealMapper) this.toursMealMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent
                public ToursMealStickyBottomMapper getToursMealStickyBottomMapper() {
                    return (ToursMealStickyBottomMapper) this.toursMealStickyBottomMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent
                public ToursMealStickyTopMapper getToursMealStickyTopMapper() {
                    return (ToursMealStickyTopMapper) this.toursMealStickyTopMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<ToursMealComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ToursMealComponent.class), new C2445a(storage, 3));
        }
    }

    @NotNull
    ToursMealMapper getToursMealMapper();

    @NotNull
    ToursMealStickyBottomMapper getToursMealStickyBottomMapper();

    @NotNull
    ToursMealStickyTopMapper getToursMealStickyTopMapper();
}
