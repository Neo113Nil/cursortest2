package ru.ozon.app.android.initializers.logger;

import H00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.flags.ComposerEventErrorLogEnabled;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/initializers/logger/ComposerLoggingActionsInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "init", "", "ComposerErrorLogger", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerLoggingActionsInitializer implements ActionInitializer {

    @NotNull
    private final FeatureChecker featureChecker;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/logger/ComposerLoggingActionsInitializer$ComposerErrorLogger;", "LH00/b$a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "throwable", "", "logError", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ComposerErrorLogger implements b.a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static ComposerErrorLogger instance;

        @NotNull
        private final FeatureChecker featureChecker;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/initializers/logger/ComposerLoggingActionsInitializer$ComposerErrorLogger$Companion;", "", "<init>", "()V", "instance", "Lru/ozon/app/android/initializers/logger/ComposerLoggingActionsInitializer$ComposerErrorLogger;", "invoke", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ComposerErrorLogger invoke(@NotNull FeatureChecker featureChecker) {
                Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
                ComposerErrorLogger composerErrorLogger = ComposerErrorLogger.instance;
                if (composerErrorLogger != null) {
                    return composerErrorLogger;
                }
                ComposerErrorLogger composerErrorLogger2 = new ComposerErrorLogger(featureChecker, null);
                ComposerErrorLogger.instance = composerErrorLogger2;
                return composerErrorLogger2;
            }

            private Companion() {
            }
        }

        public /* synthetic */ ComposerErrorLogger(FeatureChecker featureChecker, DefaultConstructorMarker defaultConstructorMarker) {
            this(featureChecker);
        }

        @Override // H00.b.a
        public void logError(@NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (this.featureChecker.isEnabled(ComposerEventErrorLogEnabled.INSTANCE)) {
                LoggerExtKt.sendNonFatal$default(throwable, null, null, null, 14, null);
            }
        }

        private ComposerErrorLogger(FeatureChecker featureChecker) {
            this.featureChecker = featureChecker;
        }
    }

    public ComposerLoggingActionsInitializer(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        boolean z11;
        int i11 = b.f10449e;
        if (!this.featureChecker.isEnabled(ComposerEventErrorLogEnabled.INSTANCE)) {
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (!buildUtils.isDebug() && !buildUtils.isQaFlavor()) {
                z11 = false;
                b.d(z11);
                b.e(ComposerErrorLogger.INSTANCE.invoke(this.featureChecker));
            }
        }
        z11 = true;
        b.d(z11);
        b.e(ComposerErrorLogger.INSTANCE.invoke(this.featureChecker));
    }
}
