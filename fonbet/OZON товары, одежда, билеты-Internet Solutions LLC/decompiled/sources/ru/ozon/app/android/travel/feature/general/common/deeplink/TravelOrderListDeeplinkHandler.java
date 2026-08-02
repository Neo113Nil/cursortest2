package ru.ozon.app.android.travel.feature.general.common.deeplink;

import C.J;
import CZ.g;
import IZ.a;
import OZ.e;
import Tc.j;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.network.longPolling.LongPollingPageComposerInterceptor;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.orderlist.configurators.OrderFiltersConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.QuestionsConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.travel.pageconfigurator.preCreation.configurator.TravelOrderListPreCreateConfigurator;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u000e*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u00020\u000e*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/deeplink/TravelOrderListDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/net/Uri;", "deeplink", "", "Ljava/lang/Class;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "getConfigurators", "(Landroid/net/Uri;)Ljava/util/Set;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "isTravelOrderList", "(Landroid/net/Uri;)Z", "isTravelReviewList", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelOrderListDeeplinkHandler implements a {
    private final Set<Class<? extends ComposerScreenConfig.PageConfigurator>> getConfigurators(Uri deeplink) {
        j builder = new j();
        builder.add(OrderFiltersConfigurator.class);
        builder.add(CreateAndPayConfigurator.class);
        builder.add(ReviewSuccessConfigurator.class);
        builder.add(QuestionsConfigurator.class);
        if (isTravelOrderList(deeplink)) {
            builder.add(TravelOrderListPreCreateConfigurator.class);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    private final boolean isTravelOrderList(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d(C7714v.K(pathSegments), "orderList");
    }

    private final boolean isTravelReviewList(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d(C7714v.K(pathSegments), "myReviewsList");
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull GZ.j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        List<String> pathSegments = b11.getPathSegments();
        if (!Intrinsics.d(b11.getAuthority(), "travel")) {
            return false;
        }
        Intrinsics.f(pathSegments);
        if (pathSegments.size() == 1) {
            return isTravelOrderList(b11) || isTravelReviewList(b11);
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull GZ.j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new g("travel", new e(R$id.menu_tickets, new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, null, null, 61, null), 0, 2, null), false, null, false, false, false, false, null, false, false, false, getConfigurators(route.b()), e0.h(LongPollingPageComposerInterceptor.class), null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16732156, null), a11, null, true, false, null, true, false, null, 436, null)));
    }
}
