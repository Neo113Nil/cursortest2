package ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky;

import EL.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.e;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsItemBinding;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ItemComponent;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.ItemVI;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/sticky/ItemWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/di/ItemComponent;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemWidgetViewMapper extends OverlayWidgetScreenViewItemMapper2<ItemComponent, ItemDTO, ItemVI> {

    @NotNull
    private final r.a viewType = r.a.MULTIPLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(ReturnCreationReasonsItemBinding returnCreationReasonsItemBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstraintLayout constraintLayout = returnCreationReasonsItemBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemComponent widgetComponent$lambda$1(C7475g c7475g) {
        return ItemComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ItemDTO) && ((ItemDTO) state).isSticky();
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ItemVI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final ReturnCreationReasonsItemBinding inflate = ReturnCreationReasonsItemBinding.inflate(LayoutInflater.from(container.L()));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        PostRefreshHandlerFactory postRefreshHandlerFactory = component().getPostRefreshHandlerFactory();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        return new ItemViewHolder(container, inflate, PostRefreshHandlerFactory.create$default(postRefreshHandlerFactory, (ComposerReferences) V11, null, 2, null), new InterfaceC6068e() { // from class: QG.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$0;
                createHolder$lambda$0 = ItemWidgetViewMapper.createHolder$lambda$0(ReturnCreationReasonsItemBinding.this, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ItemComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ItemComponent.class), new a(storage, 3));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ItemVI> map(@NotNull ItemDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getItemMapper().invoke(state, info);
    }
}
