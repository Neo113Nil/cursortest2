package ru.ozon.app.android.composer.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.flags.ComposerFrequencyLoadCheckerNonFatalFlag;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import x10.InterfaceC10645b;
import y00.AbstractC10819a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/view/ComposerNotificationController;", "Lx10/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Ly00/a$c;", "effect", "", "process", "(Ly00/a$c;)V", "Ly00/a$b;", "(Ly00/a$b;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerNotificationController implements InterfaceC10645b {

    @NotNull
    private final FeatureChecker featureChecker;

    public ComposerNotificationController(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
    }

    @Override // x10.InterfaceC10645b
    public void process(@NotNull AbstractC10819a.c effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
    }

    @Override // x10.InterfaceC10645b
    public void process(@NotNull AbstractC10819a.b effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (this.featureChecker.isEnabled(ComposerFrequencyLoadCheckerNonFatalFlag.INSTANCE)) {
            LoggerExtKt.sendNonFatal(effect.c(), new ComposerNotificationController$process$1(effect));
        }
    }
}
