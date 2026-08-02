package ru.ozon.app.android.marketing.deeplink;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.a;
import Kk.C3531a;
import android.content.Context;
import i10.h;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabRequiredFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/marketing/deeplink/InfoDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoDeeplinkHandler implements a {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        if (r2.isEmpty() == false) goto L19;
     */
    @Override // IZ.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean canHandle(@NotNull j route) {
        boolean z11;
        Intrinsics.checkNotNullParameter(route, "route");
        List<String> pathSegments = route.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        List<String> list = pathSegments;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                Intrinsics.f(str);
                if (h.t(str, "start_onboarding", false)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (Lh.a.f(route, "info")) {
            if (C2860c.c(route, "getPathSegments(...)").isEmpty()) {
                Set<String> queryParameterNames = route.b().getQueryParameterNames();
                Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            }
            if (!C3531a.c(route, "getPathSegments(...)", "actions") && !C3531a.c(route, "getPathSegments(...)", "wanna-discount-terms") && !C3531a.c(route, "getPathSegments(...)", "wanna-discount") && !C3531a.c(route, "getPathSegments(...)", "nps") && !C3531a.c(route, "getPathSegments(...)", "npsRateServices") && !C3531a.c(route, "getPathSegments(...)", "npsResult") && !C3531a.c(route, "getPathSegments(...)", "searchtab") && !C3531a.c(route, "getPathSegments(...)", "rateapp_test") && !z11) {
                return true;
            }
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, null, null, 59, null), 0, 2, null);
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1));
        m682boximpl.getValue();
        return new ComposerTabRequiredFragmentDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, null, true, false, false, true, null, false, false, false, null, null, null, !AppTypeResolver.INSTANCE.isSelect(context) ? m682boximpl : null, false, null, null, null, false, false, null, null, 16744268, null), a11, null, false, null, false, 60, null);
    }
}
