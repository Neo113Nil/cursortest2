package ru.ozon.app.android.debugmenu.deeplink;

import GZ.j;
import IZ.c;
import Pc.a;
import android.content.Context;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSource;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ExtraHeaderDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "LPc/a;", "Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "extraHeadersDataSourceProvider", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;LPc/a;)V", "Landroid/net/Uri;", "deeplink", "", "", "paramNames", "", "isDelete", "(Landroid/net/Uri;Ljava/util/Set;)Z", "", "onDelete", "()V", "onAdd", "(Landroid/net/Uri;Ljava/util/Set;)V", "saveExtraHeaders", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LPc/a;", "kotlin.jvm.PlatformType", "getExtraHeadersDataSource", "()Lru/ozon/app/android/storage/extraHeaders/ExtraHeadersDataSource;", "extraHeadersDataSource", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraHeaderDeeplinkHandler extends c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final a<ExtraHeadersDataSource> extraHeadersDataSourceProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/debugmenu/deeplink/ExtraHeaderDeeplinkHandler$Companion;", "", "<init>", "()V", "AUTHORITY", "", "DELETE_PARAM_KEY", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraHeaderDeeplinkHandler(@NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor, @NotNull a<ExtraHeadersDataSource> extraHeadersDataSourceProvider) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        Intrinsics.checkNotNullParameter(extraHeadersDataSourceProvider, "extraHeadersDataSourceProvider");
        this.extraHeadersDataSourceProvider = extraHeadersDataSourceProvider;
    }

    private final ExtraHeadersDataSource getExtraHeadersDataSource() {
        return this.extraHeadersDataSourceProvider.get();
    }

    private final boolean isDelete(Uri deeplink, Set<String> paramNames) {
        if (paramNames.size() != 1 || !paramNames.contains("delete")) {
            return false;
        }
        String queryParameter = deeplink.getQueryParameter("delete");
        return queryParameter == null || queryParameter.length() == 0;
    }

    private final void onAdd(Uri deeplink, Set<String> paramNames) {
        saveExtraHeaders(deeplink, paramNames);
    }

    private final void onDelete() {
        getExtraHeadersDataSource().setExtraHeaders(U.c());
    }

    private final void saveExtraHeaders(Uri deeplink, Set<String> paramNames) {
        LinkedHashMap u11 = U.u(getExtraHeadersDataSource().getExtraHeaders());
        for (String str : paramNames) {
            String queryParameter = deeplink.getQueryParameter(str);
            if (queryParameter != null && queryParameter.length() != 0) {
                u11.put(str, queryParameter);
            }
        }
        getExtraHeadersDataSource().setExtraHeaders(u11);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getScheme(), "ozontech") && Intrinsics.d(b11.getAuthority(), "extraHeader") && b11.getQueryParameterNames().size() > 0;
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        Set<String> queryParameterNames = b11.getQueryParameterNames();
        Intrinsics.f(queryParameterNames);
        if (isDelete(b11, queryParameterNames)) {
            onDelete();
            return null;
        }
        onAdd(b11, queryParameterNames);
        return null;
    }
}
