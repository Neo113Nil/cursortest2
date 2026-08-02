package ru.ozon.app.android.travel.feature.general.common.widgets.starsBalance.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsBalance.data.StarsBalanceDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsBalance.data.StarsBalanceMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsBalance.di.StarsBalanceComponent;
import ru.ozon.app.android.travel.molecules.view.starsBlock.StarsBalanceView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/presentation/StarsBalanceViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/data/StarsBalanceDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/presentation/StarsBalanceVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/di/StarsBalanceComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/di/StarsBalanceComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/presentation/StarsBalanceWidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/presentation/StarsBalanceWidgetViewHolder;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceView;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/data/StarsBalanceDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/di/StarsBalanceComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/data/StarsBalanceMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsBalance/data/StarsBalanceMapper;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StarsBalanceViewMapper extends g<StarsBalanceDTO, StarsBalanceVI> {

    @NotNull
    private final StarsBalanceComponent component;

    @NotNull
    private final StarsBalanceMapper mapper;

    public StarsBalanceViewMapper(@NotNull StarsBalanceComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new StarsBalanceMapper(component.getContext());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<StarsBalanceVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new StarsBalanceWidgetViewHolder((StarsBalanceView) view, this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public StarsBalanceView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StarsBalanceView starsBalanceView = new StarsBalanceView(context);
        starsBalanceView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return starsBalanceView;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StarsBalanceVI> map(@NotNull StarsBalanceDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
