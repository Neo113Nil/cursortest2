package ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.scrollable;

import android.view.View;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.creation.R$layout;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.di.ItemComponent;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.ItemMapper;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.ItemVI;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.scrollable.ScrollableItemWidgetViewMapper;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/scrollable/ScrollableItemWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/di/ItemComponent;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/scrollable/ScrollableItemViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemMapper;", "getMapper", "()Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemMapper;", "mapper", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollableItemWidgetViewMapper extends WidgetViewMapper2<ItemComponent, ItemDTO, ItemVI> {

    @NotNull
    private final Function2<View, ComposerReferences, ScrollableItemViewHolder> holderProducer = new ScrollableItemWidgetViewMapper$holderProducer$1(this);
    private final int layout = R$layout.return_creation_reasons_item;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ItemComponent widgetComponent$lambda$0(C7475g c7475g) {
        return ItemComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ItemDTO) && !((ItemDTO) state).isSticky();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ScrollableItemViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ItemComponent> widgetComponent(@NotNull final C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ItemComponent.class), new InterfaceC7469a() { // from class: PG.a
            @Override // k20.InterfaceC7469a
            public final InterfaceC6958a component() {
                ItemComponent widgetComponent$lambda$0;
                widgetComponent$lambda$0 = ScrollableItemWidgetViewMapper.widgetComponent$lambda$0(C7475g.this);
                return widgetComponent$lambda$0;
            }
        });
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ItemMapper getMapper() {
        return component().getItemMapper();
    }
}
