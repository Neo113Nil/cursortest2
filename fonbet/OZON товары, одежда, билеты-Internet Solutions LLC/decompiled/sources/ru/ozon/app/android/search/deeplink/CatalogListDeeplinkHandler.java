package ru.ozon.app.android.search.deeplink;

import C.J;
import GZ.j;
import IZ.a;
import J.d;
import Sc.InterfaceC4008j;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorResource;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/deeplink/CatalogListDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "Landroid/content/Context;", "context", "", "deeplink", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "(Landroid/content/Context;Ljava/lang/String;)Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "bgColorRes$delegate", "LSc/j;", "getBgColorRes", "()I", "bgColorRes", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CatalogListDeeplinkHandler implements a {

    /* renamed from: bgColorRes$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bgColorRes = LazyUtilsKt.unsafeLazy(CatalogListDeeplinkHandler$bgColorRes$2.INSTANCE);

    private final int getBgColorRes() {
        return ((Number) this.bgColorRes.getValue()).intValue();
    }

    private final ComposerScreenConfig getScreenConfig(Context context, String deeplink) {
        h.c.a aVar = new h.c.a(deeplink, (String) null, (String) null, 14);
        Integer valueOf = Integer.valueOf(getBgColorRes());
        AppTypeResolver appTypeResolver = AppTypeResolver.INSTANCE;
        ComposerScreenConfig.ToolbarConfig toolbarConfig = new ComposerScreenConfig.ToolbarConfig(new ComposerScreenConfig.ToolbarConfig.DefaultState(0, false, null, null, appTypeResolver.isSelect(context) ? valueOf : null, null, 47, null), 0, 2, null);
        BackgroundColorResource m682boximpl = BackgroundColorResource.m682boximpl(BackgroundColorResource.m683constructorimpl(getBgColorRes()));
        m682boximpl.getValue();
        return new ComposerScreenConfig(aVar, toolbarConfig, false, null, false, false, false, false, null, false, false, false, null, null, null, appTypeResolver.isSelect(context) ? m682boximpl : null, false, null, null, null, false, false, null, null, 16744444, null);
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "catalog_list");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        return new ComposerFragmentDestination(getScreenConfig(context, a11), a11, null, false, false, null, false, false, null, 508, null);
    }
}
