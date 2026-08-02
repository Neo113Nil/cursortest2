package ru.ozon.app.android.storefront.deeplinkhandlers;

import GZ.j;
import IZ.a;
import Kk.C3532b;
import NZ.h;
import android.content.Context;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/deeplinkhandlers/FashionTabOnboardingDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "tabConfigManager", "<init>", "(Lru/ozon/app/android/tabbar/data/TabConfigManager;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "", "tabId", "I", "", "tabUrl", "Ljava/lang/String;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FashionTabOnboardingDeeplinkHandler implements a {

    @NotNull
    private final TabConfigManager tabConfigManager;
    private final int tabId;

    @NotNull
    private final String tabUrl;
    public static final int $stable = 8;

    public FashionTabOnboardingDeeplinkHandler(@NotNull TabConfigManager tabConfigManager) {
        Intrinsics.checkNotNullParameter(tabConfigManager, "tabConfigManager");
        this.tabConfigManager = tabConfigManager;
        this.tabId = R$id.menu_boutique_tab;
        String uri = LinkGenerator.INSTANCE.apparelMainTabWithMiniappParam().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.tabUrl = uri;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        h tabNavigatorConfig;
        Map<Integer, String> b11;
        Intrinsics.checkNotNullParameter(route, "route");
        TabConfig inMemoryCachedConfig = this.tabConfigManager.getInMemoryCachedConfig("main");
        if (!((inMemoryCachedConfig == null || (tabNavigatorConfig = inMemoryCachedConfig.getTabNavigatorConfig()) == null || (b11 = tabNavigatorConfig.b()) == null) ? false : b11.containsKey(Integer.valueOf(this.tabId)))) {
            return false;
        }
        Uri b12 = route.b();
        return Intrinsics.d(b12.getAuthority(), "storefront") && C3532b.g(b12, "getPathSegments(...)", "onboarding_fashion");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.b().getQueryParameter(SelectionItemFormDTO.TITLE_FIELD_NAME);
        String queryParameter2 = route.b().getQueryParameter("description");
        String queryParameter3 = route.b().getQueryParameter("image");
        Intrinsics.checkNotNullExpressionValue("FashionTabOnboardingDialog", "getSimpleName(...)");
        return new C9992d(new c("FashionTabOnboardingDialog", FashionTabOnboardingDialog.INSTANCE.newInstance(this.tabId, this.tabUrl, queryParameter, queryParameter2, queryParameter3), null, false, false, null, false, false, false, 508, null), null, 2, 0 == true ? 1 : 0);
    }
}
