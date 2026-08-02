package ru.ozon.app.android.ugc.core.deeplink;

import C.J;
import D40.d;
import GZ.j;
import IZ.a;
import android.content.Context;
import i10.h;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.ugc.core.configurator.TopAuthorsOnboardingConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/core/deeplink/TopAuthorsOnboardingDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "checkSocialAuthorsPage", "(LGZ/j;)Z", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopAuthorsOnboardingDeeplinkHandler implements a {
    private final boolean checkSocialAuthorsPage(j route) {
        return d.a(route) == 1 && Lh.a.f(route, "social") && Co.a.e(route, 0, "top-authors-onboarding");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return checkSocialAuthorsPage(route);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        h.c.a aVar = new h.c.a(a11, (String) null, (String) (0 == true ? 1 : 0), 14);
        Set h11 = e0.h(TopAuthorsOnboardingConfigurator.class);
        int m673constructorimpl = BackgroundColorAttr.m673constructorimpl(R$attr.bgDarkKey);
        return new ComposerFlowDestination(new ComposerScreenConfig(aVar, new ComposerScreenConfig.ToolbarConfig(0 == true ? 1 : 0, 0, 2, 0 == true ? 1 : 0), false, null, false, false, false, false, null, false, false, true, h11, null, null, BackgroundColorAttr.m672boximpl(m673constructorimpl), false, null, null, null, false, false, null, null, 16738236, null), a11, null, null, false, 28, null);
    }
}
