package ru.ozon.app.android.cabinet.deeplink;

import GZ.j;
import IZ.c;
import NZ.d;
import android.content.Context;
import android.net.Uri;
import androidx.appcompat.app.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.web.WebFragment;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/ProfilePointsDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "LpZ/f;", "getComposerDestination", "(LGZ/j;)LpZ/f;", "Landroid/content/Context;", "context", "", ImagesContract.URL, "getWebDestination", "(Landroid/content/Context;LGZ/j;Ljava/lang/String;)LpZ/f;", "parseUrl", "(LGZ/j;)Ljava/lang/String;", "parseDismissAndRedirectUrl", "", "removeBottomSheet", "(Landroid/content/Context;)V", "", "canHandle", "(LGZ/j;)Z", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfilePointsDeeplinkHandler extends c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cabinet/deeplink/ProfilePointsDeeplinkHandler$Companion;", "", "<init>", "()V", "HTTPS_SCHEME", "", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePointsDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    private final f getComposerDestination(j route) {
        String c11 = Kk.c.c(route, "toString(...)");
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(c11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1)), false, null, null, null, false, false, null, null, 16744446, null), c11, null, false, false, null, false, false, null, 508, null);
    }

    private final f getWebDestination(Context context, j route, String url) {
        removeBottomSheet(context);
        return new sZ.c(Kk.c.c(route, "toString(...)"), WebFragment.Companion.newInstance$default(WebFragment.INSTANCE, url, false, parseDismissAndRedirectUrl(route), false, true, false, true, false, false, false, false, false, 3080, null), null, true, false, null, false, false, false, CounterView.COUNTER_MAX_DEFAULT, null);
    }

    private final String parseDismissAndRedirectUrl(j route) {
        return route.b().getQueryParameter("dismissAndRedirectUrl");
    }

    private final String parseUrl(j route) {
        return route.b().getQueryParameter(ImagesContract.URL);
    }

    private final void removeBottomSheet(Context context) {
        G supportFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        G childFragmentManager;
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        g gVar = context instanceof g ? (g) context : null;
        if (gVar == null || (supportFragmentManager = gVar.getSupportFragmentManager()) == null || (r02 = supportFragmentManager.r0()) == null) {
            return;
        }
        ListIterator<ComponentCallbacksC5392m> listIterator = r02.listIterator(r02.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            ComponentCallbacksC5392m previous = listIterator.previous();
            if (previous instanceof d) {
                componentCallbacksC5392m = previous;
                break;
            }
        }
        ComponentCallbacksC5392m componentCallbacksC5392m2 = componentCallbacksC5392m;
        if (componentCallbacksC5392m2 == null || (childFragmentManager = componentCallbacksC5392m2.getChildFragmentManager()) == null) {
            return;
        }
        List<ComponentCallbacksC5392m> r03 = childFragmentManager.r0();
        Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
        for (ComponentCallbacksC5392m componentCallbacksC5392m3 : r03) {
            if (componentCallbacksC5392m3 instanceof BottomSheetComposerFragment) {
                Q p11 = childFragmentManager.p();
                p11.q(componentCallbacksC5392m3);
                p11.i();
            }
        }
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (!Intrinsics.d(b11.getAuthority(), "my")) {
            return false;
        }
        Intrinsics.f(pathSegments);
        return !pathSegments.isEmpty() && Intrinsics.d(C7714v.K(pathSegments), "points");
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String parseUrl = parseUrl(route);
        if (parseUrl == null || kotlin.text.h.K(parseUrl)) {
            return getComposerDestination(route);
        }
        if (Intrinsics.d(Uri.parse(parseUrl).getScheme(), "https")) {
            return getWebDestination(context, route, parseUrl);
        }
        return null;
    }
}
