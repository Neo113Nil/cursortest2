package ru.ozon.app.android.storefront.deeplinkhandlers.onboarding;

import C.J;
import De.C2860c;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import i10.h;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import rZ.C9237b;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragment;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.R$color;
import sZ.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/onboarding/NewcomerOnboardingDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NewcomerOnboardingDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (d.d(route, "route", "info")) {
            List<String> c11 = C2860c.c(route, "getPathSegments(...)");
            if (!(c11 instanceof Collection) || !c11.isEmpty()) {
                for (String str : c11) {
                    Intrinsics.f(str);
                    if (h.t(str, "start_onboarding", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // IZ.a
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        FlowTag flowTag = FlowTag.START_ONBOARDING;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1));
        m682boximpl.getValue();
        return new C9237b(null, flowTag, new c(flowTag.name(), OnboardingFlowFragment.INSTANCE.newInstance(new C9010b(flowTag, 14)), null, false, false, null, false, false, false, 508, null), new ComposerFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, true, false, false, false, null, false, false, false, null, null, null, !AppTypeResolver.INSTANCE.isSelect(context) ? m682boximpl : null, false, null, null, null, false, false, null, null, 16744364, null), a11, null, false, false, null, false, false, null, 508, null), 1, null);
    }
}
