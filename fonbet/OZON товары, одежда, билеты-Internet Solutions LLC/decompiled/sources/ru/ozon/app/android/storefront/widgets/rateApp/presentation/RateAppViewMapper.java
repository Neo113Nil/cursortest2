package ru.ozon.app.android.storefront.widgets.rateApp.presentation;

import JL.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.flags.RateAppComposeEnabledFlag;
import ru.ozon.app.android.storefront.databinding.WidgetNewRateAppBinding;
import ru.ozon.app.android.storefront.widgets.rateApp.data.RateAppDTO;
import ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppViewMapper;", "Lc20/r;", "Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent;)V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/rateApp/di/RateAppWidgetComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateAppViewMapper extends r<RateAppDTO, RateAppVO> {

    @NotNull
    private final RateAppWidgetComponent component;

    @NotNull
    private final r.a viewType;

    public RateAppViewMapper(@NotNull RateAppWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout root = WidgetNewRateAppBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).root;
        Intrinsics.checkNotNullExpressionValue(root, "root");
        return root;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (!(state instanceof RateAppDTO) || RateAppViewHolder.INSTANCE.isDismissed() || this.component.getFeatureChecker().isEnabled(RateAppComposeEnabledFlag.INSTANCE)) ? false : true;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<RateAppVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new RateAppViewHolder(container, this.component.getAppStoreInfoProvider().retrieveStoreName(), this.component.getCustomActionHandlersStoreFactory(), new b(0));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<RateAppVO> map(@NotNull RateAppDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
