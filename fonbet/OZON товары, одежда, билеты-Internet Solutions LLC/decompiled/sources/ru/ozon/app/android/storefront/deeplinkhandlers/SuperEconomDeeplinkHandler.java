package ru.ozon.app.android.storefront.deeplinkhandlers;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/SuperEconomDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "superEconomTabUrl", "Ljava/lang/String;", "superEconomNewTabUrl", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuperEconomDeeplinkHandler implements a {

    @NotNull
    private final String superEconomNewTabUrl;

    @NotNull
    private final String superEconomTabUrl;

    public SuperEconomDeeplinkHandler() {
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = linkGenerator.superEconom().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.superEconomTabUrl = uri;
        String uri2 = linkGenerator.superEconomNew().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        this.superEconomNewTabUrl = uri2;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (d.d(route, "route", "highlight")) {
            return C3531a.c(route, "getPathSegments(...)", "populyarnye-tovary-1551703") || C3531a.c(route, "getPathSegments(...)", "tovary-narashvat-1789580");
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        String b11 = PZ.a.b(a11, false);
        boolean z11 = Intrinsics.d(b11, this.superEconomTabUrl) || Intrinsics.d(b11, this.superEconomNewTabUrl);
        int i11 = R$id.menu_super_econom_tab;
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1));
        m682boximpl.getValue();
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(aVar, null, false, null, true, false, false, false, null, false, false, false, null, null, null, !AppTypeResolver.INSTANCE.isSelect(context) ? m682boximpl : null, false, null, null, null, false, false, null, null, 16744430, null), a11, i11, null, false, z11, null, 88, null);
    }
}
