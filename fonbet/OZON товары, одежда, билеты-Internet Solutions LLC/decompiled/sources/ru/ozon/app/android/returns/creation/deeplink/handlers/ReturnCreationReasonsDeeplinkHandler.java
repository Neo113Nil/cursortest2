package ru.ozon.app.android.returns.creation.deeplink.handlers;

import GZ.j;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.pageconfigurators.ReturnCreationPhotoUpdatedConfigurator;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/deeplink/handlers/ReturnCreationReasonsDeeplinkHandler;", "Lru/ozon/app/android/returns/creation/deeplink/handlers/BaseReturnCreationDeeplinkHandler;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/returns/creation/pageconfigurators/ReturnCreationPhotoUpdatedConfigurator;", "configurators", "Ljava/util/Set;", "getConfigurators", "()Ljava/util/Set;", "", "backgroundColor", "I", "getBackgroundColor", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationReasonsDeeplinkHandler extends BaseReturnCreationDeeplinkHandler {

    @NotNull
    private final Context appContext;
    private final int backgroundColor;

    @NotNull
    private final Set<Class<ReturnCreationPhotoUpdatedConfigurator>> configurators;

    public ReturnCreationReasonsDeeplinkHandler(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.configurators = e0.h(ReturnCreationPhotoUpdatedConfigurator.class);
        this.backgroundColor = AppTokensProvider.Colors.INSTANCE.layerFloor0(appContext).getResId();
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (Intrinsics.d(b11.getAuthority(), "my")) {
            Intrinsics.f(pathSegments);
            if (Intrinsics.d(C7714v.Q(0, pathSegments), "returnCreation") && Intrinsics.d(C7714v.Q(1, pathSegments), "reasons") && !Intrinsics.d(C7714v.Q(2, pathSegments), "photo")) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.app.android.returns.creation.deeplink.handlers.BaseReturnCreationDeeplinkHandler
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // ru.ozon.app.android.returns.creation.deeplink.handlers.BaseReturnCreationDeeplinkHandler
    @NotNull
    public Set<Class<ReturnCreationPhotoUpdatedConfigurator>> getConfigurators() {
        return this.configurators;
    }
}
