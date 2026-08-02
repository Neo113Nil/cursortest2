package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.di;

import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.data.AviaComplexSearchFormMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormViewModel;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0019\u001a\u00060\u0015j\u0002`\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/di/AviaComplexSearchFormComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/data/AviaComplexSearchFormMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LPc/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormViewModel;", "getViewModel", "()LPc/a;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AviaComplexSearchFormComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/di/AviaComplexSearchFormComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/di/AviaComplexSearchFormComponent;", "create", "(Lk20/g;)Lk20/e;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AviaComplexSearchFormComponent create$lambda$0(C7475g c7475g) {
            return new AviaComplexSearchFormComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<AviaComplexSearchFormComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AviaComplexSearchFormComponent.class), new BR.a(storage, 9));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    AviaComplexSearchFormMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    Pc.a<AviaComplexSearchFormViewModel> getViewModel();
}
