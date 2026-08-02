package ru.ozon.app.android.storefront.widgets.naviBlocksV5.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.domain.flags.NaviBlocksV5ComposeEnabledFlag;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.data.NaviBlocksV5DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.di.NaviBlocksV5WidgetComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5WidgetViewHolder;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.view.NaviBlocksV5View;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocksV5ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "component", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/di/NaviBlocksV5WidgetComponent;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV5/di/NaviBlocksV5WidgetComponent;)V", "mapper", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocksV5Mapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocksV5Mapper;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5WidgetViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "canMap", "", "state", "", "createView", "parent", "Landroid/view/ViewGroup;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV5ViewMapper extends WidgetViewMapper<NaviBlocksV5DTO, NaviBlocksV5VO> {

    @NotNull
    private final NaviBlocksV5WidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, NaviBlocksV5WidgetViewHolder> holderProducer;

    public NaviBlocksV5ViewMapper(@NotNull NaviBlocksV5WidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new NaviBlocksV5ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof NaviBlocksV5DTO) && !this.component.getFeatureChecker().isEnabled(NaviBlocksV5ComposeEnabledFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new NaviBlocksV5View(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NaviBlocksV5VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NaviBlocksV5DTO, d, List<NaviBlocksV5VO>> getMapper() {
        return this.component.getMapper();
    }
}
