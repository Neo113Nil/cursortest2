package ru.ozon.app.android.monetization.widgets.skuListCopy.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.flags.SkuListCopyComposeFlag;
import ru.ozon.app.android.monetization.widgets.skuListCopy.data.SkuListCopyDTO;
import ru.ozon.app.android.monetization.widgets.skuListCopy.di.SkuListCopyComponent;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListItemVI;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListItemViewGroup;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListItemViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/skuListCopy/core/SkuListItemViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/monetization/widgets/skuListCopy/data/SkuListCopyDTO;", "Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemVI;", "Lru/ozon/app/android/monetization/widgets/skuListCopy/di/SkuListCopyComponent;", "component", "<init>", "(Lru/ozon/app/android/monetization/widgets/skuListCopy/di/SkuListCopyComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/monetization/widgets/skuListCopy/data/SkuListCopyDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemViewGroup;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemViewGroup;", "Lru/ozon/app/android/monetization/widgets/skuListCopy/di/SkuListCopyComponent;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SkuListItemViewMapper extends g<SkuListCopyDTO, SkuListItemVI> {

    @NotNull
    private final SkuListCopyComponent component;

    public SkuListItemViewMapper(@NotNull SkuListCopyComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SkuListCopyDTO) && !this.component.getFeatureChecker().isEnabled(SkuListCopyComposeFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<SkuListItemVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new SkuListItemViewHolder((SkuListItemViewGroup) view, container, this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SkuListItemViewGroup createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new SkuListItemViewGroup(context, null, 0, 6, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SkuListItemVI> map(@NotNull SkuListCopyDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
