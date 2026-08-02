package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import IZ.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.a;
import c90.InterfaceC5773a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import pZ.h;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u001b\u0010\u001c\u001a\u00020\u000b2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/FintechAutoTestDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "Landroid/net/Uri;", "deeplink", "", "", "paramNames", "", "isDelete", "(Landroid/net/Uri;Ljava/util/Set;)Z", "Landroid/content/Context;", "context", "", "delete", "(Landroid/content/Context;Landroid/net/Uri;)V", "LpZ/f;", "handle", "(Landroid/content/Context;Landroid/net/Uri;)LpZ/f;", "addFintechHeaders", "addFintechFeatures", "addMockFintechFeatures", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechAutoTestDeeplinkHandler extends c {

    @NotNull
    private static final List<String> authorityList = C7714v.b0("fintechExtraHeader", "fintechObTestingFeatures", "fintechFeaturesMock");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FintechAutoTestDeeplinkHandler(@NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
    }

    private final f addFintechFeatures(Context context, Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter("features");
        if (queryParameter != null && queryParameter.length() != 0) {
            InterfaceC5773a.f56817a.getClass();
            a.startActivity(context, InterfaceC5773a.C0860a.a(context, InterfaceC5773a.C0860a.d(queryParameter)), null);
        }
        return new h("Финтех фичи добавлены");
    }

    private final f addFintechHeaders(Context context, Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter("is-mobile-autotests");
        String queryParameter2 = deeplink.getQueryParameter("x-o3-test-name");
        String queryParameter3 = deeplink.getQueryParameter("host-name");
        if ((queryParameter != null && queryParameter.length() != 0) || ((queryParameter2 != null && queryParameter2.length() != 0) || (queryParameter3 != null && queryParameter3.length() != 0))) {
            InterfaceC5773a.f56817a.getClass();
            a.startActivity(context, InterfaceC5773a.C0860a.a(context, InterfaceC5773a.C0860a.b(queryParameter, queryParameter2, queryParameter3)), null);
        }
        return new h("Финтех хидеры добавлены");
    }

    private final f addMockFintechFeatures(Context context, Uri deeplink) {
        String queryParameter = deeplink.getQueryParameter("features");
        if (queryParameter != null && queryParameter.length() != 0) {
            InterfaceC5773a.f56817a.getClass();
            a.startActivity(context, InterfaceC5773a.C0860a.a(context, InterfaceC5773a.C0860a.c(queryParameter)), null);
        }
        return new h("Финтех фичи добавлены");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void delete(Context context, Uri deeplink) {
        Intent intent;
        String authority = deeplink.getAuthority();
        if (authority != null) {
            int hashCode = authority.hashCode();
            if (hashCode != 644652764) {
                if (hashCode != 1011222777) {
                    if (hashCode == 1967499048 && authority.equals("fintechFeaturesMock")) {
                        InterfaceC5773a.f56817a.getClass();
                        intent = InterfaceC5773a.C0860a.a(context, InterfaceC5773a.C0860a.f());
                    }
                } else if (authority.equals("fintechObTestingFeatures")) {
                    InterfaceC5773a.f56817a.getClass();
                    intent = InterfaceC5773a.C0860a.a(context, InterfaceC5773a.C0860a.g());
                }
            } else if (authority.equals("fintechExtraHeader")) {
                InterfaceC5773a.f56817a.getClass();
                intent = InterfaceC5773a.C0860a.a(context, InterfaceC5773a.C0860a.e());
            }
            if (intent == null) {
                a.startActivity(context, intent, null);
                return;
            }
            return;
        }
        intent = null;
        if (intent == null) {
        }
    }

    private final f handle(Context context, Uri deeplink) {
        String authority = deeplink.getAuthority();
        if (authority == null) {
            return null;
        }
        int hashCode = authority.hashCode();
        if (hashCode == 644652764) {
            if (authority.equals("fintechExtraHeader")) {
                return addFintechHeaders(context, deeplink);
            }
            return null;
        }
        if (hashCode == 1011222777) {
            if (authority.equals("fintechObTestingFeatures")) {
                return addFintechFeatures(context, deeplink);
            }
            return null;
        }
        if (hashCode == 1967499048 && authority.equals("fintechFeaturesMock")) {
            return addMockFintechFeatures(context, deeplink);
        }
        return null;
    }

    private final boolean isDelete(Uri deeplink, Set<String> paramNames) {
        if (paramNames.size() != 1 || !paramNames.contains("delete")) {
            return false;
        }
        String queryParameter = deeplink.getQueryParameter("delete");
        return queryParameter == null || queryParameter.length() == 0;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        if (!Intrinsics.d(b11.getScheme(), "ozontech") || !C7714v.A(authorityList, b11.getAuthority())) {
            return false;
        }
        Set<String> queryParameterNames = b11.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        return !queryParameterNames.isEmpty();
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        Set<String> queryParameterNames = b11.getQueryParameterNames();
        Intrinsics.f(queryParameterNames);
        if (!isDelete(b11, queryParameterNames)) {
            return handle(context, b11);
        }
        delete(context, b11);
        return null;
    }
}
