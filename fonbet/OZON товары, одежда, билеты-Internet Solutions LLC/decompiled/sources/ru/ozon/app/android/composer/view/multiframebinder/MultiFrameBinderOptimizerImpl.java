package ru.ozon.app.android.composer.view.multiframebinder;

import Ig0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.SystemClock;
import android.view.Display;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizerImpl;", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "offscreenOffsetPercent", "", "isInForceBounds", "(Ljava/lang/Float;)Z", "Landroid/content/Context;", "context", "", "getDisplayFrameLimit", "(Landroid/content/Context;)J", "", "init", "(Landroid/content/Context;)V", "startFrameTime", "averageStepDuration", "isFrameAvailable", "(JLjava/lang/Long;Ljava/lang/Float;)Z", "frameLimit", "J", "defaultStepFrameLimitRatio$delegate", "LSc/j;", "getDefaultStepFrameLimitRatio", "()F", "defaultStepFrameLimitRatio", "minOffscreenOffsetPercent$delegate", "getMinOffscreenOffsetPercent", "minOffscreenOffsetPercent", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiFrameBinderOptimizerImpl implements MultiFrameBinderOptimizer {

    /* renamed from: defaultStepFrameLimitRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultStepFrameLimitRatio;
    private long frameLimit;

    /* renamed from: minOffscreenOffsetPercent$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j minOffscreenOffsetPercent;
    public static final int $stable = 8;

    public MultiFrameBinderOptimizerImpl(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.frameLimit = -1L;
        this.defaultStepFrameLimitRatio = k.b(new MultiFrameBinderOptimizerImpl$defaultStepFrameLimitRatio$2(featureService));
        this.minOffscreenOffsetPercent = LazyUtilsKt.unsafeLazy(new MultiFrameBinderOptimizerImpl$minOffscreenOffsetPercent$2(featureService));
    }

    private final float getDefaultStepFrameLimitRatio() {
        return ((Number) this.defaultStepFrameLimitRatio.getValue()).floatValue();
    }

    private final long getDisplayFrameLimit(Context context) {
        Display a11 = a.a(context);
        if (a11 == null) {
            return -1L;
        }
        return a.b(a11);
    }

    private final float getMinOffscreenOffsetPercent() {
        return ((Number) this.minOffscreenOffsetPercent.getValue()).floatValue();
    }

    private final boolean isInForceBounds(Float offscreenOffsetPercent) {
        return offscreenOffsetPercent != null && offscreenOffsetPercent.floatValue() < getMinOffscreenOffsetPercent();
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.frameLimit == -1) {
            this.frameLimit = getDisplayFrameLimit(context);
        }
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer
    public boolean isFrameAvailable(long startFrameTime, Long averageStepDuration, Float offscreenOffsetPercent) {
        if (this.frameLimit == -1 || isInForceBounds(offscreenOffsetPercent)) {
            return true;
        }
        return (averageStepDuration != null ? averageStepDuration.longValue() : (long) (((float) this.frameLimit) * getDefaultStepFrameLimitRatio())) < ((long) (((double) this.frameLimit) * 0.9d)) - (SystemClock.elapsedRealtimeNanos() - startFrameTime);
    }
}
