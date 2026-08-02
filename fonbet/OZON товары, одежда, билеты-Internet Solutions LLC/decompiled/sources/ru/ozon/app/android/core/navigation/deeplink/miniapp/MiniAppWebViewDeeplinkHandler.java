package ru.ozon.app.android.core.navigation.deeplink.miniapp;

import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import android.webkit.URLUtil;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.miniapp.MiniAppWebActivity;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/miniapp/MiniAppWebViewDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "", ImagesContract.URL, "formateUrl", "(Ljava/lang/String;)Ljava/lang/String;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MiniAppWebViewDeeplinkHandler implements a {
    private final String formateUrl(String url) {
        return !URLUtil.isNetworkUrl(url) ? Nk.a.b("http://", url) : url;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        String queryParameter;
        return (!d.d(route, "route", "miniapp") || (queryParameter = route.b().getQueryParameter(ImagesContract.URL)) == null || h.K(queryParameter)) ? false : true;
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String formateUrl = formateUrl(route.b().getQueryParameter(ImagesContract.URL));
        MiniAppWebActivity.Companion companion = MiniAppWebActivity.INSTANCE;
        if (formateUrl == null) {
            formateUrl = "";
        }
        return new C8880a(companion.startIntent(context, formateUrl));
    }
}
