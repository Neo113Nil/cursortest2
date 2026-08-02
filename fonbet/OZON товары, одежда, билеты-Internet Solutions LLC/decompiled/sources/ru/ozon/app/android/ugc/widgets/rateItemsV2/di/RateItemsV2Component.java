package ru.ozon.app.android.ugc.widgets.rateItemsV2.di;

import GZ.g;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.core.RateItemsV2Mapper;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2ViewModel;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000  2\u00060\u0001j\u0002`\u0002:\u0001 R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u00060\u0017j\u0002`\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/di/RateItemsV2Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LPc/a;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2ViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/core/RateItemsV2Mapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/core/RateItemsV2Mapper;", "mapper", "", "isTeenMode", "()Z", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RateItemsV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/di/RateItemsV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/di/RateItemsV2Component;", "create", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RateItemsV2Component create$lambda$0(C7475g c7475g) {
            return new RateItemsV2Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<RateItemsV2Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(RateItemsV2Component.class), new JI.a(storage, 5));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    RateItemsV2Mapper getMapper();

    @NotNull
    g getRouter();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    Pc.a<RateItemsV2ViewModel> getViewModelProvider();

    boolean isTeenMode();
}
