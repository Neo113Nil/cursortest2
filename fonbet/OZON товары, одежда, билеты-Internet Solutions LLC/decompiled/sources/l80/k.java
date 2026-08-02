package l80;

import B90.C2606h;
import Q90.n;
import android.os.Build;
import android.window.SplashScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w2.C10411b;

/* loaded from: classes3.dex */
public final class k {
    public static final void a(@NotNull f fVar, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull S80.b fintechNavigation, @NotNull n ultraManager) {
        SplashScreen splashScreen;
        SplashScreen splashScreen2;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(ultraManager, "ultraManager");
        if (!fintechSettings.c() || Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (ultraManager.d()) {
            Integer splashUltraTheme = fintechSettings.getSplashUltraTheme();
            if (splashUltraTheme != null) {
                splashScreen2 = fVar.getSplashScreen();
                splashScreen2.setSplashScreenTheme(splashUltraTheme.intValue());
            }
        } else {
            Integer splashTheme = fintechSettings.getSplashTheme();
            if (splashTheme != null) {
                splashScreen = fVar.getSplashScreen();
                splashScreen.setSplashScreenTheme(splashTheme.intValue());
            }
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        C10411b c10411b = new C10411b(fVar);
        C10411b.a(c10411b);
        c10411b.b(new C2606h(fintechNavigation, 5));
    }
}
