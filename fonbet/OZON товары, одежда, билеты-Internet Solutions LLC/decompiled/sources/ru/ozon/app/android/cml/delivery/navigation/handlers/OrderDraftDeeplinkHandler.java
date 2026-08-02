package ru.ozon.app.android.cml.delivery.navigation.handlers;

import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import qZ.C9010b;
import ru.ozon.app.android.cml.delivery.configurators.AddNewCardConfigurator;
import ru.ozon.app.android.cml.delivery.configurators.EditOrderConfigurator;
import ru.ozon.app.android.cml.delivery.configurators.ParcelPhotoAddConfigurator;
import ru.ozon.app.android.cml.delivery.navigation.DeeplinkUtils;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFlowDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/navigation/handlers/OrderDraftDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDraftDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d(b11.getAuthority(), "delivery") && Intrinsics.d((String) C7714v.M(pathSegments), "orderDraft") && DeeplinkUtils.INSTANCE.isCmlMiniApp(b11);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        Tc.j builder = new Tc.j();
        builder.add(AddNewCardConfigurator.class);
        if (DeeplinkUtils.INSTANCE.isEditMode(route.b())) {
            builder.add(EditOrderConfigurator.class);
            builder.add(ParcelPhotoAddConfigurator.class);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.j b11 = builder.b();
        C9010b c9010b = new C9010b(FlowTag.C2C_ORDER, 14);
        String str = null;
        return new ComposerFlowDestination(new ComposerScreenConfig(new h.c.a(a11, str, str, 14), null, false, null, false, false, false, false, null, false, false, true, b11, null, Integer.valueOf(R$color.layer_floor_0), null, false, null, null, null, false, false, null, null, 16754622, null), a11, null, c9010b, false, 20, null);
    }
}
