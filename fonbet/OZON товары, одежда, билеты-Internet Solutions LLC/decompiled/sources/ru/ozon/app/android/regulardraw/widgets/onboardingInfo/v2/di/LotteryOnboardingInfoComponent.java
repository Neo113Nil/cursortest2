package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di;

import BL.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoMapper;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 (2\u00060\u0001j\u0002`\u0002:\u0001(B\u0015\b\u0002\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/di/LotteryOnboardingInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "LUg/a;", "actionHandlerComponentApi$delegate", "LSc/j;", "getActionHandlerComponentApi", "()LUg/a;", "actionHandlerComponentApi", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "getOnboardingDelegate", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "prefetchProviderStorage$delegate", "getPrefetchProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "prefetchProviderStorage", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/core/LotteryOnboardingInfoMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/core/LotteryOnboardingInfoMapper;", "mapper", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository$delegate", "getActionV2Repository", "()Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LotteryOnboardingInfoComponent implements InterfaceC6958a {

    /* renamed from: actionHandlerComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandlerComponentApi;

    /* renamed from: actionV2Repository$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionV2Repository;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureChecker;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final MorkovskOnboardingDelegate onboardingDelegate;

    /* renamed from: prefetchProviderStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j prefetchProviderStorage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/di/LotteryOnboardingInfoComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/di/LotteryOnboardingInfoComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LotteryOnboardingInfoComponent getInstance$lambda$0(C7475g c7475g) {
            return new LotteryOnboardingInfoComponent(c7475g, null);
        }

        @NotNull
        public final C7473e<LotteryOnboardingInfoComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(LotteryOnboardingInfoComponent.class), new a(storage, 7));
        }

        private Companion() {
        }
    }

    public /* synthetic */ LotteryOnboardingInfoComponent(C7475g c7475g, DefaultConstructorMarker defaultConstructorMarker) {
        this(c7475g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetchInfoProviderStorage<LotteryOnboardingInfoVI.OnboardingStep> getPrefetchProviderStorage() {
        return (ImagePrefetchInfoProviderStorage) this.prefetchProviderStorage.getValue();
    }

    @NotNull
    public final Ug.a getActionHandlerComponentApi() {
        return (Ug.a) this.actionHandlerComponentApi.getValue();
    }

    @NotNull
    public final ActionV2Repository getActionV2Repository() {
        return (ActionV2Repository) this.actionV2Repository.getValue();
    }

    @NotNull
    public final FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @NotNull
    public final LotteryOnboardingInfoMapper getMapper() {
        return (LotteryOnboardingInfoMapper) this.mapper.getValue();
    }

    @NotNull
    public final MorkovskOnboardingDelegate getOnboardingDelegate() {
        return this.onboardingDelegate;
    }

    private LotteryOnboardingInfoComponent(C7475g c7475g) {
        this.actionHandlerComponentApi = k.b(new LotteryOnboardingInfoComponent$actionHandlerComponentApi$2(c7475g));
        this.onboardingDelegate = ((MorkovskOnboardingComponentApi) c7475g.getComponent(MorkovskOnboardingComponentApi.class)).getMorkovskOnboardingDelegate();
        this.prefetchProviderStorage = k.b(LotteryOnboardingInfoComponent$prefetchProviderStorage$2.INSTANCE);
        this.mapper = k.b(new LotteryOnboardingInfoComponent$mapper$2(c7475g, this));
        this.actionV2Repository = k.b(new LotteryOnboardingInfoComponent$actionV2Repository$2(c7475g));
        this.featureChecker = k.b(new LotteryOnboardingInfoComponent$featureChecker$2(c7475g));
    }
}
