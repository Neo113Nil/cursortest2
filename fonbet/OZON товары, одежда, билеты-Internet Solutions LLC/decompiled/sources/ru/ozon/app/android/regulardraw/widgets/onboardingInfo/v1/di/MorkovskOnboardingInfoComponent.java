package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di;

import AH.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0013R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/di/MorkovskOnboardingInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "getMorkovskOnboardingDelegate", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "morkovskOnboardingDelegate", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MorkovskOnboardingInfoComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/di/MorkovskOnboardingInfoComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/di/MorkovskOnboardingInfoComponent;", "create", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskOnboardingInfoComponent create$lambda$0(final C7475g c7475g) {
            return new MorkovskOnboardingInfoComponent(c7475g) { // from class: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent$Companion$create$1$1
                private final ActionComponentApi actionComponentApi;
                private final MorkovskOnboardingComponentApi morkovskOnboardingComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComponentApi;

                {
                    this.morkovskOnboardingComponentApi = (MorkovskOnboardingComponentApi) c7475g.getComponent(MorkovskOnboardingComponentApi.class);
                    this.actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                    this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent
                public ActionV2Repository getActionV2Repository() {
                    return this.actionComponentApi.getActionRepository();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent
                public FeatureChecker getFeatureChecker() {
                    return this.networkComponentApi.getFeatureChecker();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent
                public MorkovskOnboardingDelegate getMorkovskOnboardingDelegate() {
                    return this.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
                }

                @Override // ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent
                public l getTokenizedAnalytics() {
                    return this.retainComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<MorkovskOnboardingInfoComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MorkovskOnboardingInfoComponent.class), new a(storage, 15));
        }
    }

    @NotNull
    ActionV2Repository getActionV2Repository();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    MorkovskOnboardingDelegate getMorkovskOnboardingDelegate();

    @NotNull
    l getTokenizedAnalytics();
}
