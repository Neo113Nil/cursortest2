package ru.ozon.app.android.returns.list.deeplink;

import GZ.j;
import Kk.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.returns.common.deeplink.BaseReturnDeeplinkHandler;
import ru.ozon.app.android.returns.list.configurator.ReturnListUpdateConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/list/deeplink/ReturnListDeeplinkHandler;", "Lru/ozon/app/android/returns/common/deeplink/BaseReturnDeeplinkHandler;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "", "HANDLED_PATHS", "Ljava/util/Set;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnListDeeplinkHandler extends BaseReturnDeeplinkHandler {

    @NotNull
    private final Set<String> HANDLED_PATHS;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnListDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        String[] elements = {"returns", "returnableItems", "returnBarcode"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.HANDLED_PATHS = C7705l.j0(elements);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (!Intrinsics.d(b11.getAuthority(), "my")) {
            return false;
        }
        Set<String> set = this.HANDLED_PATHS;
        Intrinsics.f(pathSegments);
        return C7714v.A(set, C7714v.M(pathSegments));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        boolean isNormalizeNavigationStack = isNormalizeNavigationStack(route.b());
        String c11 = c.c(route, "toString(...)");
        return createDestination(c11, new ComposerScreenConfig(new h.c.a(c11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, e0.i(ReturnListUpdateConfigurator.class, isNormalizeNavigationStack ? ReturnListNormalizeBackStackConfigurator.class : null), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor0)), false, null, null, null, false, false, null, null, 16740318, null), isNormalizeNavigationStack);
    }
}
