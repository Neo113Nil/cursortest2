package ru.ozon.app.android.apparel.navigation;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.miniapp.apparel.ApparelNavigation;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00052\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/apparel/navigation/ApparelFashionDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", "", "isRoot", "(Ljava/lang/String;)Z", "withoutMiniApp", "(Ljava/lang/String;)Ljava/lang/String;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApparelFashionDeeplinkHandler implements a {

    @NotNull
    private static final String brandzonTabUrl;

    static {
        String uri = ApparelNavigation.INSTANCE.apparelFashion().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        brandzonTabUrl = uri;
    }

    private final boolean isRoot(String str) {
        return Intrinsics.d(withoutMiniApp(PZ.a.b(str, false)), brandzonTabUrl);
    }

    private final String withoutMiniApp(String str) {
        String uri = UriExtKt.removeQueryParameter(Uri.parse(str), "miniapp").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "highlight") && C3531a.c(route, "getPathSegments(...)", "fashion-selection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean isRoot = isRoot(a11);
        ComposerTabFragmentDestination composerTabFragmentDestination = new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, !isRoot, null, null, null, null, 61, null), 0, 2, null), false, null, true, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777164, null), a11, R$id.menu_boutique_tab, null, false, isRoot, null, 88, null);
        return isRoot ? new OZ.a(composerTabFragmentDestination) : composerTabFragmentDestination;
    }
}
