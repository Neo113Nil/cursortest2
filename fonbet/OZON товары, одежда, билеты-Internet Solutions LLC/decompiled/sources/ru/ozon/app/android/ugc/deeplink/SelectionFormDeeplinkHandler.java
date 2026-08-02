package ru.ozon.app.android.ugc.deeplink;

import C.J;
import GZ.j;
import IZ.c;
import J.d;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.StaticTeenModeConfigurator;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaPickerConfigurator;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/deeplink/SelectionFormDeeplinkHandler;", "LIZ/c;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionFormDeeplinkHandler extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        super(authDestinationInterceptor, null, 2, null);
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "selections") && Kk.d.c(route, "getPathSegments(...)", 0, DynamicElementDTO.FORM);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        C9010b c9010b = new C9010b(FlowTag.SELECTION_FORM, 14);
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        int resId = UniColors.LAYER_FLOOR_0.getResId();
        Class[] elements = {MediaPickerConfigurator.class, StaticTeenModeConfigurator.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ComposerFlowDestination(new ComposerScreenConfig(aVar, null, false, null, false, false, false, false, null, false, false, true, C7705l.j0(elements), null, Integer.valueOf(resId), null, false, null, null, 1, false, false, null, null, 14133148, null), a11, 9001, c9010b, false, 16, null);
    }
}
