package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di;

import AT.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.regulardraw.di.RegularDrawDefaultComponent;
import ru.ozon.app.android.regulardraw.onboarding.lottery.LotteryForceShowOnboardingActionHandler;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.MorkovskMenuMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u000e\u001a\u00060\nj\u0002`\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/di/MorkovskMenuComponent;", "Lru/ozon/app/android/regulardraw/di/RegularDrawDefaultComponent;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/core/MorkovskMenuMapper;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/core/MorkovskMenuMapper;", "mapper", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "getStorage", "()Lk20/g;", "storage", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MorkovskMenuComponent extends RegularDrawDefaultComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/di/MorkovskMenuComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/di/MorkovskMenuComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskMenuComponent create$lambda$0(final C7475g c7475g) {
            return new MorkovskMenuComponent() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(MorkovskMenuComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;
                private final C7475g storage;

                {
                    this.networkComponentApi = (NetworkComponentApi) C7475g.this.getComponent(NetworkComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class);
                    this.storage = C7475g.this;
                }

                @Override // ru.ozon.app.android.regulardraw.di.RegularDrawDefaultComponent
                public c getDefaultActionHandlers() {
                    return UtilKt.getDefaultActionHandlers(C7475g.this, e0.h(LotteryForceShowOnboardingActionHandler.class));
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent
                public MorkovskMenuMapper getMapper() {
                    return (MorkovskMenuMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent
                public C7475g getStorage() {
                    return this.storage;
                }
            };
        }

        @NotNull
        public final C7473e<MorkovskMenuComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MorkovskMenuComponent.class), new a(storage, 7));
        }
    }

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    MorkovskMenuMapper getMapper();

    @NotNull
    C7475g getStorage();
}
