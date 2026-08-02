package ru.ozon.app.android.app.launch.handlers.interceptors;

import GZ.g;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.LinkGenerator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentsInterceptor;", "", "LGZ/g;", "ozonRouter", "", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentResolver;", "appLaunchArguments", "<init>", "(LGZ/g;Ljava/util/Set;)V", "Landroid/content/Intent;", "intent", "", "intercept", "(Landroid/content/Intent;)V", "LGZ/g;", "Ljava/util/Set;", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLaunchArgumentsInterceptor {

    @NotNull
    private final Set<AppLaunchArgumentResolver> appLaunchArguments;

    @NotNull
    private final g ozonRouter;

    /* JADX WARN: Multi-variable type inference failed */
    public AppLaunchArgumentsInterceptor(@NotNull g ozonRouter, @NotNull Set<? extends AppLaunchArgumentResolver> appLaunchArguments) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(appLaunchArguments, "appLaunchArguments");
        this.ozonRouter = ozonRouter;
        this.appLaunchArguments = appLaunchArguments;
    }

    public final void intercept(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Set<AppLaunchArgumentResolver> set = this.appLaunchArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((AppLaunchArgumentResolver) obj).canResolve(intent)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AppLaunchArgumentResolver) it.next()).resolveIntent(intent);
        }
        if (Intrinsics.d(intent.getStringExtra("TRACKER_TEST_MODE"), "ENABLED")) {
            g gVar = this.ozonRouter;
            String uri = LinkGenerator.INSTANCE.trackerTestMode(true).toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            g.a.a(gVar, uri, null, null, 6);
        }
    }
}
