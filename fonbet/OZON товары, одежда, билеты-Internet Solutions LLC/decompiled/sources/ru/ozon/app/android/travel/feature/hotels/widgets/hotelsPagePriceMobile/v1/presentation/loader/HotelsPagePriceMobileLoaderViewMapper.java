package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.presentation.loader;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.data.HotelsPagePriceMobileDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPagePriceMobile.v1.view.HotelsPagePriceMobileLoaderView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0006\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/loader/HotelsPagePriceMobileLoaderViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/presentation/loader/HotelsPagePriceMobileLoaderVI;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPagePriceMobile/v1/data/HotelsPagePriceMobileDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "", "canMap", "(Ljava/lang/Object;)Z", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPagePriceMobileLoaderViewMapper extends g<HotelsPagePriceMobileDTO, HotelsPagePriceMobileLoaderVI> {
    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HotelsPagePriceMobileDTO) && ((HotelsPagePriceMobileDTO) state).isSkeleton();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<HotelsPagePriceMobileLoaderVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new HotelsPagePriceMobileLoaderViewHolder(view);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new HotelsPagePriceMobileLoaderView(context);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsPagePriceMobileLoaderVI> map(@NotNull HotelsPagePriceMobileDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new HotelsPagePriceMobileLoaderVI(info.d().hashCode()));
    }
}
