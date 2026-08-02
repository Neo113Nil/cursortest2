package ru.ozon.app.android.cart.master.di;

import Tc.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.emptyoverlay.presentation.EmptyOverlayViewMapper;
import ru.ozon.app.android.cart.master.data.MasterConfig;
import ru.ozon.app.android.cart.master.presentation.MasterViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cart/master/di/MasterWidgetModule;", "", "<init>", "()V", "provideMasterWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cart/master/data/MasterConfig;", "viewMapper", "Lru/ozon/app/android/cart/master/presentation/MasterViewMapper;", "emptyOverlayViewMapper", "Lru/ozon/app/android/cart/emptyoverlay/presentation/EmptyOverlayViewMapper;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasterWidgetModule {
    @NotNull
    public final Set<Widget2> provideMasterWidget(@NotNull MasterConfig config, @NotNull MasterViewMapper viewMapper, @NotNull EmptyOverlayViewMapper emptyOverlayViewMapper, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        Intrinsics.checkNotNullParameter(emptyOverlayViewMapper, "emptyOverlayViewMapper");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        List<String> widget_verticals = MasterConfig.INSTANCE.getWIDGET_VERTICALS();
        ArrayList arrayList = new ArrayList(C7714v.z(widget_verticals, 10));
        for (String str : widget_verticals) {
            b builder = C7714v.B();
            builder.add(viewMapper);
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            arrayList.add(new Widget2(str, "master", config, (ViewMapper2[]) builder.B().toArray(new ViewMapper2[0])));
        }
        return C7714v.Y0(arrayList);
    }
}
