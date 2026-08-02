package ru.ozon.app.android.cart.di;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.installment.data.InstalmentWidgetCoreKt;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailWidgetConfig;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailWidgetViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/di/CartWidget2Module;", "", "<init>", "()V", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailWidgetConfig;", "config", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailWidgetViewMapper;", "viewMapper", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideMarketingDetailWidget", "(Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailWidgetConfig;Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailWidgetViewMapper;)Ljava/util/Set;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideComposeWidgets", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartWidget2Module {
    @NotNull
    public final Set<i> provideComposeWidgets(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return e0.h(InstalmentWidgetCoreKt.instalmentWidgetFactory(jsonDeserializer));
    }

    @NotNull
    public final Set<Widget2> provideMarketingDetailWidget(@NotNull MarketingDetailWidgetConfig config, @NotNull MarketingDetailWidgetViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        List<String> widget_verticals = MarketingDetailWidgetConfig.INSTANCE.getWIDGET_VERTICALS();
        ArrayList arrayList = new ArrayList(C7714v.z(widget_verticals, 10));
        Iterator<T> it = widget_verticals.iterator();
        while (it.hasNext()) {
            arrayList.add(new Widget2((String) it.next(), "marketingDetail", config, new ViewMapper2[]{viewMapper}));
        }
        return C7714v.Y0(arrayList);
    }
}
