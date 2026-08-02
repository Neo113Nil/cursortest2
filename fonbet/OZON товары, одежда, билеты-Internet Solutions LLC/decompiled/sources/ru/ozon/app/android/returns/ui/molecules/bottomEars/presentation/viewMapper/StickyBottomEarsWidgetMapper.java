package ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper;

import DV.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import fO.C6480a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.data.StickyBottomEarsDTO;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.di.StickyBottomEarsComponent;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewHolder.StickyBottomEarsViewHolder;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewItem.StickyBottomEarsVI;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewMapper/StickyBottomEarsWidgetMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/di/StickyBottomEarsComponent;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/data/StickyBottomEarsDTO;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewItem/StickyBottomEarsVI;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/returns/ui/molecules/bottomEars/data/StickyBottomEarsDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickyBottomEarsWidgetMapper extends OverlayWidgetScreenViewItemMapper2<StickyBottomEarsComponent, StickyBottomEarsDTO, StickyBottomEarsVI> {

    @NotNull
    private final r.a viewType = r.a.MULTIPLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout overlayContainer) {
        Intrinsics.checkNotNullParameter(overlayContainer, "overlayContainer");
        Context context = overlayContainer.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new IslandSeparatorView(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StickyBottomEarsComponent widgetComponent$lambda$1(C7475g c7475g) {
        return StickyBottomEarsComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof StickyBottomEarsDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<StickyBottomEarsVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new StickyBottomEarsViewHolder(container, new C6480a(2));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<StickyBottomEarsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(StickyBottomEarsComponent.class), new a(storage, 14));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<StickyBottomEarsVI> map(@NotNull StickyBottomEarsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
