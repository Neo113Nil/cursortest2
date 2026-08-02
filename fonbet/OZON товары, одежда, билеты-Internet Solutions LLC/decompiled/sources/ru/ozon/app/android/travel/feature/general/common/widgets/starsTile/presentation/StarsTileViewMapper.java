package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation;

import Tc.b;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.data.StarsTileDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.data.StarsTileMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.di.StarsTileComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.view.StarsTileView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/di/StarsTileComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/di/StarsTileComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;)Ljava/lang/Object;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/data/StarsTileMapper;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StarsTileViewMapper extends g<StarsTileDTO, StarsTileVI> {

    @NotNull
    private final StarsTileMapper mapper;

    public StarsTileViewMapper(@NotNull StarsTileComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.mapper = new StarsTileMapper(component.getContext());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<StarsTileVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new StarsTileViewHolder((StarsTileView) view, container.X());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StarsTileView starsTileView = new StarsTileView(context);
        starsTileView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return starsTileView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull StarsTileVI oldItem, @NotNull StarsTileVI newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        b builder = C7714v.B();
        if (!Intrinsics.d(oldItem.getFirstBlock(), newItem.getFirstBlock())) {
            builder.add(StarsTilePayload.FIRST_BLOCK);
        }
        if (!Intrinsics.d(oldItem.getSecondBlock(), newItem.getSecondBlock())) {
            builder.add(StarsTilePayload.SECOND_BLOCK);
        }
        if (!Intrinsics.d(oldItem.getBackgroundColor(), newItem.getBackgroundColor())) {
            builder.add(StarsTilePayload.BACKGROUND);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StarsTileVI> map(@NotNull StarsTileDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }
}
