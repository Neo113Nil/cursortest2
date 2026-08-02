package ru.ozon.app.android.composer.view.multiframebinder;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/view/multiframebinder/MultiFrameBinderOptimizer;", "", "init", "", "context", "Landroid/content/Context;", "isFrameAvailable", "", "startFrameTime", "", "averageStepDuration", "offscreenOffsetPercent", "", "(JLjava/lang/Long;Ljava/lang/Float;)Z", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MultiFrameBinderOptimizer {
    void init(@NotNull Context context);

    boolean isFrameAvailable(long startFrameTime, Long averageStepDuration, Float offscreenOffsetPercent);
}
