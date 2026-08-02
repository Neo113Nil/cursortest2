package ru.ozon.app.android.storefront.widgets.shellNavBarTitle.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.flags.ShellNavTitleComposeWidgetEnabled;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.data.ShellNavTitleDTO;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.di.ShellNavTitleWidgetComponent;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleVO;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleView;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.presentation.ShellNavTitleViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/core/ShellNavTitleViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleVO;", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/di/ShellNavTitleWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/di/ShellNavTitleWidgetComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/presentation/ShellNavTitleViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/data/ShellNavTitleDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/shellNavBarTitle/di/ShellNavTitleWidgetComponent;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShellNavTitleViewMapper extends g<ShellNavTitleDTO, ShellNavTitleVO> {

    @NotNull
    private final ShellNavTitleWidgetComponent component;

    public ShellNavTitleViewMapper(@NotNull ShellNavTitleWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ShellNavTitleDTO) && !this.component.getFeatureChecker().isEnabled(ShellNavTitleComposeWidgetEnabled.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ShellNavTitleView shellNavTitleView = new ShellNavTitleView(context, null, 0, 6, null);
        shellNavTitleView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return shellNavTitleView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<ShellNavTitleVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new ShellNavTitleViewHolder((ShellNavTitleView) view, this.component.getTokenizedAnalytics());
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ShellNavTitleVO> map(@NotNull ShellNavTitleDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
