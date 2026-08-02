package ru.ozon.app.android.monetization.deeplink;

import B0.C2454a;
import GZ.j;
import IZ.a;
import K1.G;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.android.messenger.framework.data.p;
import ru.ozon.android.messenger.framework.presentation.messenger.e;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import sZ.c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/monetization/deeplink/BloggerChatsDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/navigation/handlers/DeeplinkHandler;", "LIb/a;", "Lru/ozon/android/messenger/api/a;", "messengerFeature", "<init>", "(LIb/a;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "Lru/ozon/app/android/navigation/newrouter/destinations/Destination;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LIb/a;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BloggerChatsDeeplinkHandler implements a {

    @NotNull
    private final Ib.a<ru.ozon.android.messenger.api.a> messengerFeature;

    public BloggerChatsDeeplinkHandler(@NotNull Ib.a<ru.ozon.android.messenger.api.a> messengerFeature) {
        Intrinsics.checkNotNullParameter(messengerFeature, "messengerFeature");
        this.messengerFeature = messengerFeature;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Set<String> queryParameterNames;
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (Intrinsics.d(b11.getAuthority(), "advBlogger")) {
            List<String> pathSegments = b11.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
            if (!pathSegments.isEmpty() && C2454a.h(b11, "trendChats", 0) && ((queryParameterNames = b11.getQueryParameterNames()) == null || queryParameterNames.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        c11 = this.messengerFeature.get().c(new f.c(new e(Boolean.TRUE)), p.ORIGINAL);
        return new c(G.b(route.b(), "MessengerFragment"), c11, null, false, false, null, false, false, false, 508, null);
    }
}
