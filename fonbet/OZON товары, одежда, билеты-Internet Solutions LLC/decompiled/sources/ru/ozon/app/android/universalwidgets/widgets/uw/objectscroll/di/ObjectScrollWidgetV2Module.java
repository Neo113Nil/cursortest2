package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core.UniversalObjectScrollConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core.UniversalObjectScrollViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/di/ObjectScrollWidgetV2Module;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "universalObjectScrollConfig", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/core/UniversalObjectScrollConfig;", "universalObjectScrollViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/core/UniversalObjectScrollViewMapper;", "headerViewMapper", "Lru/ozon/app/android/common/header/core/HeaderViewMapper2;", "provideWidgets$universalwidgets_prodGoogleAllVendorsRelease", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ObjectScrollWidgetV2Module {
    @NotNull
    public final Set<Widget2> provideWidgets$universalwidgets_prodGoogleAllVendorsRelease(@NotNull UniversalObjectScrollConfig universalObjectScrollConfig, @NotNull UniversalObjectScrollViewMapper universalObjectScrollViewMapper, @NotNull HeaderViewMapper2 headerViewMapper) {
        Intrinsics.checkNotNullParameter(universalObjectScrollConfig, "universalObjectScrollConfig");
        Intrinsics.checkNotNullParameter(universalObjectScrollViewMapper, "universalObjectScrollViewMapper");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        return e0.h(new Widget2("uw", "objectScroll", universalObjectScrollConfig, new ViewMapper2[]{universalObjectScrollViewMapper, headerViewMapper}));
    }
}
