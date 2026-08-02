package ru.ozon.app.android.pdp.widgets.isFavoriteProduct.core;

import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent;
import ru.ozon.app.android.pdp.widgets.isFavoriteProduct.data.IsFavoriteProductDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/WidgetImagePlaceholderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/data/IsFavoriteProductDTO;", "Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/IsFavoriteProductVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/EmptyViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/EmptyViewHolder;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/data/IsFavoriteProductDTO;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WidgetImagePlaceholderViewMapper extends OverlayWidgetScreenViewItemMapper2<WidgetImagePlaceholderComponent, IsFavoriteProductDTO, IsFavoriteProductVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        IsFavoriteProductDTO isFavoriteProductDTO = state instanceof IsFavoriteProductDTO ? (IsFavoriteProductDTO) state : null;
        if (isFavoriteProductDTO == null) {
            return false;
        }
        component().getWidgetImagePlaceholderAdapter().setFavoriteState(isFavoriteProductDTO.isFavorite());
        return false;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<WidgetImagePlaceholderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return WidgetImagePlaceholderComponent.INSTANCE.getInstance(storage);
    }

    @Override // c20.r
    @NotNull
    public EmptyViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new EmptyViewHolder();
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<IsFavoriteProductVO> map(@NotNull IsFavoriteProductDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return K.f71697a;
    }
}
