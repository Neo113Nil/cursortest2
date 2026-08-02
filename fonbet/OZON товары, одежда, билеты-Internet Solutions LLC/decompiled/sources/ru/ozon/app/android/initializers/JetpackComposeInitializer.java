package ru.ozon.app.android.initializers;

import Gh.C3122b;
import Gh.c;
import Ib.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.warmer.compose.ComposeWarmupFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR#\u0010\u0013\u001a\n \u000e*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/initializers/JetpackComposeInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/content/Context;", "context", "LIb/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureCheckerLazy", "<init>", "(Landroid/content/Context;LIb/a;)V", "", "init", "()V", "Landroid/content/Context;", "LIb/a;", "kotlin.jvm.PlatformType", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LGh/b;", "composeWarmer$delegate", "getComposeWarmer", "()LGh/b;", "composeWarmer", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JetpackComposeInitializer implements ActionInitializer {

    /* renamed from: composeWarmer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j composeWarmer;

    @NotNull
    private final Context context;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureChecker;

    @NotNull
    private final a<FeatureChecker> featureCheckerLazy;

    public JetpackComposeInitializer(@NotNull Context context, @NotNull a<FeatureChecker> featureCheckerLazy) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureCheckerLazy, "featureCheckerLazy");
        this.context = context;
        this.featureCheckerLazy = featureCheckerLazy;
        this.featureChecker = LazyUtilsKt.unsafeLazy(new JetpackComposeInitializer$featureChecker$2(featureCheckerLazy));
        this.composeWarmer = LazyUtilsKt.unsafeLazy(JetpackComposeInitializer$composeWarmer$2.INSTANCE);
    }

    private final C3122b getComposeWarmer() {
        return (C3122b) this.composeWarmer.getValue();
    }

    private final FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        if (getFeatureChecker().isEnabled(ComposeWarmupFlag.INSTANCE)) {
            c.a(this.context, getComposeWarmer());
        }
    }
}
