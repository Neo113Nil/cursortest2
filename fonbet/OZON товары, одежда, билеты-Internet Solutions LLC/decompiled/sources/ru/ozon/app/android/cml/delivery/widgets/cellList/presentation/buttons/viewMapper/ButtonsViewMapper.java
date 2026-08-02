package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewMapper;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.ButtonLoaderUpdateKey;
import ru.ozon.app.android.cml.delivery.actionHandler.cellList.updateKeys.ButtonsUpdateKey;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.buttons.ButtonsDTO;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.buttons.ButtonsMapperKt;
import ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewItem.ButtonWithLoader;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewItem.ButtonsVI;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!R<\u0010&\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040$j\b\u0012\u0004\u0012\u00020\u0004`%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R,\u00102\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040*0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010)¨\u00063"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewMapper/ButtonsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/di/CmlCellListComponent;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/buttons/ButtonsDTO;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;", "<init>", "()V", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/ButtonsUpdateKey;", "update", "oldItem", "handleButtonsUpdate", "(Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/ButtonsUpdateKey;Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;", "Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/ButtonLoaderUpdateKey;", "handleButtonLoaderUpdate", "(Lru/ozon/app/android/cml/delivery/actionHandler/cellList/updateKeys/ButtonLoaderUpdateKey;Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;)Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonsViewMapper extends WidgetViewMapper2<CmlCellListComponent, ButtonsDTO, ButtonsVI> {

    @NotNull
    private final Function2<View, ComposerReferences, k<ButtonsVI>> holderProducer = new ButtonsViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ButtonsUpdateKey.class, ButtonLoaderUpdateKey.class);

    private final ButtonsVI handleButtonLoaderUpdate(ButtonLoaderUpdateKey update, ButtonsVI oldItem) {
        List<ButtonWithLoader> buttons = oldItem.getButtons();
        if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(((ButtonWithLoader) it.next()).getId(), update.getId())) {
                    List<ButtonWithLoader> buttons2 = oldItem.getButtons();
                    ArrayList arrayList = new ArrayList(C7714v.z(buttons2, 10));
                    for (ButtonWithLoader buttonWithLoader : buttons2) {
                        ButtonWithLoader buttonWithLoader2 = !Intrinsics.d(buttonWithLoader.getId(), update.getId()) ? buttonWithLoader : null;
                        if (buttonWithLoader2 == null) {
                            buttonWithLoader2 = ButtonWithLoader.copy$default(buttonWithLoader, null, null, update.getIsLoading(), 3, null);
                        }
                        arrayList.add(buttonWithLoader2);
                    }
                    return ButtonsVI.copy$default(oldItem, 0L, arrayList, null, 5, null);
                }
            }
        }
        return null;
    }

    private final ButtonsVI handleButtonsUpdate(ButtonsUpdateKey update, ButtonsVI oldItem) {
        if (update.getItemId() != oldItem.getId()) {
            return null;
        }
        List<ButtonWithLoader> buttons = oldItem.getButtons();
        List<ButtonV3DTO> buttons2 = update.getButtons();
        Iterator<T> it = buttons.iterator();
        Iterator<T> it2 = buttons2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C7714v.z(buttons, 10), C7714v.z(buttons2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            ButtonWithLoader buttonWithLoader = (ButtonWithLoader) next;
            arrayList.add(new ButtonWithLoader(buttonWithLoader.getId(), ButtonsMapperKt.copyWithParams((ButtonV3DTO) it2.next(), "button_id", buttonWithLoader.getId()), false));
        }
        return ButtonsVI.copy$default(oldItem, 0L, arrayList, null, 5, null);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ButtonsDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ButtonsVI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ButtonsDTO, d, List<ButtonsVI>> getMapper() {
        return component().getButtonsMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CmlCellListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CmlCellListComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ButtonsVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ButtonsVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ButtonsUpdateKey) {
            return handleButtonsUpdate((ButtonsUpdateKey) update, oldItem);
        }
        if (update instanceof ButtonLoaderUpdateKey) {
            return handleButtonLoaderUpdate((ButtonLoaderUpdateKey) update, oldItem);
        }
        return null;
    }
}
