package ru.ozon.app.android.storefront.widgets.cms.di;

import Tc.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleConfig;
import ru.ozon.app.android.storefront.widgets.cms.navtitle.NavTitleViewMapper;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/di/CmsWidgetsV1DiModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "navTitleConfig", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleConfig;", "navTitleViewMapper", "Lru/ozon/app/android/storefront/widgets/cms/navtitle/NavTitleViewMapper;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CmsWidgetsV1DiModule {

    @NotNull
    public static final CmsWidgetsV1DiModule INSTANCE = new CmsWidgetsV1DiModule();

    private CmsWidgetsV1DiModule() {
    }

    @NotNull
    public final Set<Widget> provideWidget(@NotNull NavTitleConfig navTitleConfig, @NotNull NavTitleViewMapper navTitleViewMapper) {
        Intrinsics.checkNotNullParameter(navTitleConfig, "navTitleConfig");
        Intrinsics.checkNotNullParameter(navTitleViewMapper, "navTitleViewMapper");
        j builder = new j();
        List<Pair<String, String>> widgetNames = NavTitleConfig.INSTANCE.getWidgetNames();
        ArrayList arrayList = new ArrayList(C7714v.z(widgetNames, 10));
        Iterator<T> it = widgetNames.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(Boolean.valueOf(builder.add(new Widget((String) pair.a(), (String) pair.b(), navTitleConfig, new NavTitleViewMapper[]{navTitleViewMapper}))));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
