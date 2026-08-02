package ru.ozon.app.android.storefront.deeplinkhandlers;

import C.J;
import GZ.c;
import GZ.j;
import IZ.a;
import J.d;
import android.content.Context;
import android.net.Uri;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.utils.UriExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u0006*\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\bJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/HighlightBoutiqueDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "", "isBoutique", "(LGZ/j;)Z", "", "isRoot", "(Ljava/lang/String;)Z", "withoutMiniApp", "(Ljava/lang/String;)Ljava/lang/String;", "route", "canHandle", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HighlightBoutiqueDeeplinkHandler implements a {
    private final boolean isBoutique(j jVar) {
        List<String> pathSegments = jVar.b().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        return Intrinsics.d((String) C7714v.M(pathSegments), "ozon-fashion-1322701");
    }

    private final boolean isRoot(String str) {
        return Intrinsics.d(withoutMiniApp(PZ.a.b(str, false)), LinkGenerator.INSTANCE.boutiqueTab().toString());
    }

    private final String withoutMiniApp(String str) {
        String uri = UriExtKt.removeQueryParameter(Uri.parse(str), "miniapp").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "highlight") && isBoutique(route);
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean z11 = route.c() == c.EXTERNAL || isRoot(a11);
        int i11 = R$id.menu_boutique_tab;
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, !z11, null, null, null, null, 61, null), 0, 2, null);
        h.c.a aVar = new h.c.a(a11, (String) null, (String) null, 14);
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(R$color.layer_floor_1));
        m682boximpl.getValue();
        ComposerTabFragmentDestination composerTabFragmentDestination = new ComposerTabFragmentDestination(new ComposerScreenConfig(aVar, toolbarConfig, false, null, true, false, false, false, null, false, false, false, null, null, null, !AppTypeResolver.INSTANCE.isSelect(context) ? m682boximpl : null, false, null, null, null, false, false, null, null, 16744396, null), a11, i11, null, false, z11, null, 88, null);
        return isRoot(a11) ? new OZ.a(composerTabFragmentDestination) : composerTabFragmentDestination;
    }
}
