package ru.ozon.app.android.ugc.core.deeplink;

import GZ.j;
import HY.b;
import IZ.a;
import J.d;
import Kk.c;
import android.content.Context;
import android.os.Bundle;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.commentsList.CommentsListConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;
import ru.ozon.app.android.utils.StringExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/SingleReviewDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleReviewDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "review") && D40.d.a(route) == 1 && StringExtKt.isDigital((String) b.a(route, 0, "get(...)")) && route.b().getQueryParameterNames().isEmpty();
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Object obj = route.e().get("activateCommentField");
        String str = null;
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        String c11 = c.c(route, "toString(...)");
        h.c.a aVar = new h.c.a(c11, str, str, 14);
        Class[] elements = {CommentsListConfigurator.class, ReviewConfigurator.class, ReviewSuccessConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ComposerScreenConfig composerScreenConfig = new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, null, null, false, null, null, 16, false, false, null, null, 16246782, null);
        ComposerFragment composerFragment = new ComposerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_COMPOSER_SCREEN_CONFIG", composerScreenConfig);
        bundle.putBoolean("activateCommentField", bool != null ? bool.booleanValue() : false);
        Unit unit = Unit.f71690a;
        composerFragment.setArguments(bundle);
        return new sZ.c(c11, composerFragment, 9001, false, false, null, false, false, false, 504, null);
    }
}
