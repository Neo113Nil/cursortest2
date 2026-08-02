package ru.ozon.app.android.ugc.deeplink;

import GZ.j;
import HY.b;
import IZ.a;
import J.d;
import Kk.c;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.utils.StringExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/NewReviewTestDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/navigations/destinations/ComposerFlowDestination;", "getDestination", "(Landroid/content/Context;LGZ/j;)Lru/ozon/app/android/composer/navigations/destinations/ComposerFlowDestination;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NewReviewTestDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "products") && D40.d.a(route) == 3 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && Co.a.e(route, 1, "review") && Co.a.e(route, 2, "new-test");
    }

    @Override // IZ.a
    @NotNull
    public ComposerFlowDestination getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        return new ComposerFlowDestination(new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, 1, false, false, null, null, 14155676, null), c.c(route, "toString(...)"), null, null, false, 28, null);
    }
}
