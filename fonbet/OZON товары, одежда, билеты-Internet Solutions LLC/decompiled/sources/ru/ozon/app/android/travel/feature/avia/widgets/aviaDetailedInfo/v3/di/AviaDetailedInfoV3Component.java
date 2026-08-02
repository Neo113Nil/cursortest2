package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di;

import Gm.a;
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
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3TabsMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.AviaDetailedInfoV3ViewModel;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/di/AviaDetailedInfoV3Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3TabsMapper;", "getAviaDetailedInfoV3TabsMapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3TabsMapper;", "aviaDetailedInfoV3TabsMapper", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3Mapper;", "getAviaDetailedInfoV3Mapper", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3Mapper;", "aviaDetailedInfoV3Mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "viewModel", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AviaDetailedInfoV3Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/di/AviaDetailedInfoV3Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/di/AviaDetailedInfoV3Component;", "create", "(Lk20/g;)Lk20/e;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AviaDetailedInfoV3Component create$lambda$0(final C7475g c7475g) {
            return new AviaDetailedInfoV3Component(c7475g) { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component$Companion$create$1$1

                /* renamed from: aviaDetailedInfoV3Mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j aviaDetailedInfoV3Mapper = k.b(AviaDetailedInfoV3Component$Companion$create$1$1$aviaDetailedInfoV3Mapper$2.INSTANCE);

                /* renamed from: aviaDetailedInfoV3TabsMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j aviaDetailedInfoV3TabsMapper = k.b(AviaDetailedInfoV3Component$Companion$create$1$1$aviaDetailedInfoV3TabsMapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component
                public AviaDetailedInfoV3Mapper getAviaDetailedInfoV3Mapper() {
                    return (AviaDetailedInfoV3Mapper) this.aviaDetailedInfoV3Mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component
                public AviaDetailedInfoV3TabsMapper getAviaDetailedInfoV3TabsMapper() {
                    return (AviaDetailedInfoV3TabsMapper) this.aviaDetailedInfoV3TabsMapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.di.AviaDetailedInfoV3Component
                public AviaDetailedInfoV3ViewModel getViewModel() {
                    return new AviaDetailedInfoV3ViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<AviaDetailedInfoV3Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AviaDetailedInfoV3Component.class), new a(storage, 11));
        }
    }

    @NotNull
    AviaDetailedInfoV3Mapper getAviaDetailedInfoV3Mapper();

    @NotNull
    AviaDetailedInfoV3TabsMapper getAviaDetailedInfoV3TabsMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    AviaDetailedInfoV3ViewModel getViewModel();
}
