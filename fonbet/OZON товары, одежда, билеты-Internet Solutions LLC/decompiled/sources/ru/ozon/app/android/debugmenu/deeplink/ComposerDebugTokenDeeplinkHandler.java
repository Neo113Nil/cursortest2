package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import IZ.c;
import Od0.e;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AtMostEmployeeUserDestinationInterceptor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u000e\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ComposerDebugTokenDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostEmployeeUserDestinationInterceptor;", "atMostEmployeeUserDestinationInterceptor", "LLd0/c;", "ozonLimbDiStore", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostEmployeeUserDestinationInterceptor;LLd0/c;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "currentDeeplink", "LOd0/e$b;", "mapToLimbDeeplink", "(LGZ/j;)LOd0/e$b;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LLd0/c;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerDebugTokenDeeplinkHandler extends c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Ld0.c ozonLimbDiStore;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ComposerDebugTokenDeeplinkHandler$Companion;", "", "<init>", "()V", "COMPOSER_DEBUG_MENU_AUTHORITY", "", "COMPOSER_DEBUG_TOKEN_QUERY_NAME", "COMPOSER_DEBUG_TOKEN_PATH", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerDebugTokenDeeplinkHandler(@NotNull AtMostEmployeeUserDestinationInterceptor atMostEmployeeUserDestinationInterceptor, @NotNull Ld0.c ozonLimbDiStore) {
        super(atMostEmployeeUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostEmployeeUserDestinationInterceptor, "atMostEmployeeUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        this.ozonLimbDiStore = ozonLimbDiStore;
    }

    private final e.b mapToLimbDeeplink(j currentDeeplink) {
        String queryParameter = currentDeeplink.b().getQueryParameter("token");
        if (queryParameter != null) {
            if (h.K(queryParameter)) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                Uri uri = new Uri.Builder().scheme("ozontech").authority("composerSDK").appendPath("debugToken").appendQueryParameter("token", queryParameter).build();
                Intrinsics.f(uri);
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new e.b.C0410b(uri);
            }
        }
        return null;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getScheme(), "ozontech") && Intrinsics.d(b11.getAuthority(), "composer_debug") && b11.getQueryParameterNames().contains("token");
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        e.b mapToLimbDeeplink = mapToLimbDeeplink(route);
        if (mapToLimbDeeplink != null) {
            this.ozonLimbDiStore.b().c(mapToLimbDeeplink);
        }
        f.Companion.getClass();
        return f.b.a();
    }
}
