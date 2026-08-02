package ru.ozon.app.android.composer.di.modules;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderAnalyticHelper;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizerImpl;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizerStub;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;
import ru.ozon.app.android.composer.view.multiframebinder.SingleFrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.flags.MultiFrameBindingEnabledFlag;
import ru.ozon.app.android.composer.view.multiframebinder.flags.MultiFrameOptimizerEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/di/modules/RetainComposerPerformanceModule;", "", "<init>", "()V", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "scrollStateListener", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderAnalyticHelper;", "analyticHelper", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "multiFrameBinderOptimizer", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "provideFrameBinder", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderAnalyticHelper;Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;)Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "provideScrollStateListener", "()Lru/ozon/app/android/composer/view/multiframebinder/ScrollStateListener;", "provideMultiFrameBinderOptimizer", "(Lru/ozon/app/android/network/abtool/FeatureService;)Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetainComposerPerformanceModule {

    @NotNull
    public static final RetainComposerPerformanceModule INSTANCE = new RetainComposerPerformanceModule();

    private RetainComposerPerformanceModule() {
    }

    @NotNull
    public final FrameBinder provideFrameBinder(@NotNull FeatureService featureService, @NotNull ScrollStateListener scrollStateListener, @NotNull MultiFrameBinderAnalyticHelper analyticHelper, @NotNull MultiFrameBinderOptimizer multiFrameBinderOptimizer) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(scrollStateListener, "scrollStateListener");
        Intrinsics.checkNotNullParameter(analyticHelper, "analyticHelper");
        Intrinsics.checkNotNullParameter(multiFrameBinderOptimizer, "multiFrameBinderOptimizer");
        return featureService.getBooleanKey(MultiFrameBindingEnabledFlag.INSTANCE) ? new MultiFrameBinder(scrollStateListener, analyticHelper, multiFrameBinderOptimizer, featureService) : new SingleFrameBinder();
    }

    @NotNull
    public final MultiFrameBinderOptimizer provideMultiFrameBinderOptimizer(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        return featureService.getBooleanKey(MultiFrameOptimizerEnabledFlag.INSTANCE) ? new MultiFrameBinderOptimizerImpl(featureService) : new MultiFrameBinderOptimizerStub();
    }

    @NotNull
    public final ScrollStateListener provideScrollStateListener() {
        return new ScrollStateListener();
    }
}
