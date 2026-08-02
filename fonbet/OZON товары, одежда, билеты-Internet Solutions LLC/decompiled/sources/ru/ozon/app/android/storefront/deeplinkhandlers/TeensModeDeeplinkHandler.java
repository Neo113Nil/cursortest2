package ru.ozon.app.android.storefront.deeplinkhandlers;

import B0.C2454a;
import GZ.j;
import IZ.c;
import Lh.a;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8882c;
import pZ.h;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.navigation.interceptors.AtMostQaUserDestinationInterceptor;
import ru.ozon.app.android.push.OzonPushManager;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/TeensModeDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "Lru/ozon/app/android/push/OzonPushManager;", "ozonPushManager", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;", "atMostQaUserDestinationInterceptor", "<init>", "(Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;Lru/ozon/app/android/push/OzonPushManager;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/navigation/interceptors/AtMostQaUserDestinationInterceptor;)V", "Landroid/net/Uri;", "uri", "LpZ/h;", "setTeensMode", "(Landroid/net/Uri;)LpZ/h;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/c;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/c;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "Lru/ozon/app/android/push/OzonPushManager;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lxe/M;", "scope", "Lxe/M;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TeensModeDeeplinkHandler extends c {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final OzonPushManager ozonPushManager;

    @NotNull
    private final M scope;

    @NotNull
    private final TeensModeService teensModeService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeensModeDeeplinkHandler(@NotNull TeensModeService teensModeService, @NotNull OzonPushManager ozonPushManager, @NotNull ActionV2Repository actionV2Repository, @NotNull AtMostQaUserDestinationInterceptor atMostQaUserDestinationInterceptor) {
        super(atMostQaUserDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        Intrinsics.checkNotNullParameter(ozonPushManager, "ozonPushManager");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(atMostQaUserDestinationInterceptor, "atMostQaUserDestinationInterceptor");
        this.teensModeService = teensModeService;
        this.ozonPushManager = ozonPushManager;
        this.actionV2Repository = actionV2Repository;
        this.scope = CoroutineUtilsKt.getSafeScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h setTeensMode(Uri uri) {
        String queryParameter = uri.getQueryParameter("teensMode");
        if (queryParameter == null) {
            queryParameter = "off";
        }
        boolean equals = queryParameter.equals("on");
        C10727i.c(this.scope, null, null, new TeensModeDeeplinkHandler$setTeensMode$1(this, new ActionV2Request(C2454a.b("teensMode", queryParameter), "setTeensMode", false, 4, null), equals, null), 3);
        return new h(0);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(route.b().getScheme(), "ozontech") && a.f(route, "setTeensMode") && (queryParameter = route.b().getQueryParameter("teensMode")) != null && !kotlin.text.h.K(queryParameter);
    }

    @Override // IZ.a
    @NotNull
    public C8882c getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new C8882c(new TeensModeDeeplinkHandler$getDestination$1(this, route, null));
    }
}
