package ru.ozon.app.android.composer.view.multiframebinder;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizerStub;", "Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "isFrameAvailable", "", "startFrameTime", "", "averageStepDuration", "offscreenOffsetPercent", "", "(JLjava/lang/Long;Ljava/lang/Float;)Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MultiFrameBinderOptimizerStub implements MultiFrameBinderOptimizer {
    @Override // ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer
    public boolean isFrameAvailable(long startFrameTime, Long averageStepDuration, Float offscreenOffsetPercent) {
        return true;
    }
}
