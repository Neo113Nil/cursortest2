package ru.ozon.app.android.pdp.widgets.badgeListV2.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.flags.PdpBadgeListV2ComposableEnabledFlag;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewFactory;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BadgeListV2DTO;
import ru.ozon.app.android.pdp.widgets.badgeListV2.di.BadgeListV2WidgetComponent;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2ItemDecorator;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2VO;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2WidgetPlaceholderViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/core/BadgeListV2WidgetPlaceholderViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/di/BadgeListV2WidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/di/BadgeListV2WidgetComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/di/BadgeListV2WidgetComponent;", "getComponent", "()Lru/ozon/app/android/pdp/widgets/badgeListV2/di/BadgeListV2WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "decoratorConfig", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2WidgetPlaceholderViewMapper extends g<BadgeListV2DTO, BadgeListV2VO> {

    @NotNull
    private final BadgeListV2WidgetComponent component;
    private BadgeListV2ItemDecorator.PaddingConfig decoratorConfig;

    public BadgeListV2WidgetPlaceholderViewMapper(@NotNull BadgeListV2WidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !this.component.getFeatureChecker().isEnabled(PdpBadgeListV2ComposableEnabledFlag.INSTANCE) && WidgetImagePlaceholderAdapter.canMapPlaceholderWidget$default(this.component.getWidgetImagePlaceholderAdapter(), "BadgeListV2Widget", state, false, 4, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public k<BadgeListV2VO> createHolder(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new BadgeListV2WidgetPlaceholderViewHolder((FrameLayout) view, this.component.getTokenizedAnalytics(), container, this.component.getWidgetImagePlaceholderAdapter(), this.decoratorConfig, this.component.getCustomActionHandlersFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetImagePlaceholderViewFactory widgetImagePlaceholderViewFactory = WidgetImagePlaceholderViewFactory.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return WidgetImagePlaceholderViewFactory.createView$default(widgetImagePlaceholderViewFactory, context, R$id.badgeListImagePlaceholderFl, R$id.badgeListImagePlaceholderIv, 0, 0, 24, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<BadgeListV2VO> map(@NotNull BadgeListV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        BadgeListV2Mapper mapper = this.component.getMapper();
        mapper.setDecorator(new BadgeListV2WidgetPlaceholderViewMapper$map$1$1(this));
        return mapper.invoke(state, info);
    }
}
