package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di;

import Dl.C2876a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.data.AdvRefreshWithDelayMapper;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/di/AdvRefreshWithDelayComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/data/AdvRefreshWithDelayMapper;", "getMapper", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/data/AdvRefreshWithDelayMapper;", "mapper", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "getViewModel", "()Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewModel;", "viewModel", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdvRefreshWithDelayComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/di/AdvRefreshWithDelayComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/di/AdvRefreshWithDelayComponent;", "create", "()Lk20/e;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AdvRefreshWithDelayComponent create$lambda$0() {
            return new AdvRefreshWithDelayComponent() { // from class: ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di.AdvRefreshWithDelayComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(AdvRefreshWithDelayComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di.AdvRefreshWithDelayComponent
                public AdvRefreshWithDelayMapper getMapper() {
                    return (AdvRefreshWithDelayMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di.AdvRefreshWithDelayComponent
                public AdvRefreshWithDelayViewModel getViewModel() {
                    return new AdvRefreshWithDelayViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<AdvRefreshWithDelayComponent> create() {
            return new C7473e<>(N.b(AdvRefreshWithDelayComponent.class), new C2876a());
        }
    }

    @NotNull
    AdvRefreshWithDelayMapper getMapper();

    @NotNull
    AdvRefreshWithDelayViewModel getViewModel();
}
