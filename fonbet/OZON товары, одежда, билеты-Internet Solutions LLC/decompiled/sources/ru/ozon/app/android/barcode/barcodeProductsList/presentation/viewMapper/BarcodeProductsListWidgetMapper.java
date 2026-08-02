package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper;

import A00.a;
import Sc.o;
import Tc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage.ActionType;
import ru.ozon.app.android.barcode.barcodeProductsList.actions.getProductsPage.GetProductsPageUpdateKey;
import ru.ozon.app.android.barcode.barcodeProductsList.data.BarcodeProductsListDTO;
import ru.ozon.app.android.barcode.barcodeProductsList.di.BarcodeProductsListComponent;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.BarcodeProductsListView;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.BarcodeProductsListVI;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.Item;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.delivery.customActionsHandlers.toggleProductList.ToggleProductListUpdateKey;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"R<\u0010'\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R,\u00103\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040+0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010*¨\u00064"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewMapper/BarcodeProductsListWidgetMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/barcode/barcodeProductsList/di/BarcodeProductsListComponent;", "Lru/ozon/app/android/barcode/barcodeProductsList/data/BarcodeProductsListDTO;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "<init>", "()V", "Lru/ozon/app/android/delivery/customActionsHandlers/toggleProductList/ToggleProductListUpdateKey;", "update", "oldItem", "onToggleUpdateReceived", "(Lru/ozon/app/android/delivery/customActionsHandlers/toggleProductList/ToggleProductListUpdateKey;Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/GetProductsPageUpdateKey;", "onGetProductUpdateReceived", "(Lru/ozon/app/android/barcode/barcodeProductsList/actions/getProductsPage/GetProductsPageUpdateKey;Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "clearIsScrollToButton", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "newItem", "", "getPayload", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeProductsListWidgetMapper extends WidgetViewMapper2<BarcodeProductsListComponent, BarcodeProductsListDTO, BarcodeProductsListVI> {

    @NotNull
    private final Function2<View, ComposerReferences, k<BarcodeProductsListVI>> holderProducer = new BarcodeProductsListWidgetMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ToggleProductListUpdateKey.class, GetProductsPageUpdateKey.class, ClearIsScrollToButtonUpdateKey.class);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.APPEND_PRODUCTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.REPLACE_PRODUCTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final BarcodeProductsListVI clearIsScrollToButton(BarcodeProductsListVI oldItem) {
        List<Item> items = oldItem.getItems();
        if ((items instanceof Collection) && items.isEmpty()) {
            return null;
        }
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (((Item) it.next()).getIsScrollToButton()) {
                List<Item> items2 = oldItem.getItems();
                ArrayList arrayList = new ArrayList(C7714v.z(items2, 10));
                for (Item item : items2) {
                    if (item.getIsScrollToButton()) {
                        item = Item.copy$default(item, 0L, null, null, false, 7, null);
                    }
                    arrayList.add(item);
                }
                return BarcodeProductsListVI.copy$default(oldItem, 0L, null, arrayList, null, null, null, false, null, 251, null);
            }
        }
        return null;
    }

    private final BarcodeProductsListVI onGetProductUpdateReceived(GetProductsPageUpdateKey update, BarcodeProductsListVI oldItem) {
        List<Item> items = oldItem.getItems();
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(String.valueOf(((Item) it.next()).getId()), update.getId())) {
                    List<Item> items2 = oldItem.getItems();
                    ArrayList arrayList = new ArrayList(C7714v.z(items2, 10));
                    for (Item item : items2) {
                        if (Intrinsics.d(String.valueOf(item.getId()), update.getId())) {
                            boolean z11 = update.getActionType() == ActionType.REPLACE_PRODUCTS;
                            b builder = C7714v.B();
                            int i11 = WhenMappings.$EnumSwitchMapping$0[update.getActionType().ordinal()];
                            if (i11 == 1) {
                                List<ProductListItem> products = item.getProducts();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : products) {
                                    if (!(obj instanceof ProductListItem.Status)) {
                                        if (obj instanceof ProductListItem.Product) {
                                            obj = ProductListItem.Product.copy$default((ProductListItem.Product) obj, 0L, null, null, null, null, null, null, true, 127, null);
                                        } else {
                                            if (!(obj instanceof ProductListItem.Button)) {
                                                throw new o();
                                            }
                                            obj = null;
                                        }
                                    }
                                    if (obj != null) {
                                        arrayList2.add(obj);
                                    }
                                }
                                builder.addAll(arrayList2);
                            } else {
                                if (i11 != 2) {
                                    throw new o();
                                }
                                List<ProductListItem> products2 = item.getProducts();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : products2) {
                                    if (obj2 instanceof ProductListItem.Status) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                builder.addAll(arrayList3);
                            }
                            builder.addAll(BarcodeProductsListMapperKt.mapToVI(update.getProducts(), String.valueOf(item.getId())));
                            builder.add(new ProductListItem.Button(item.getId(), BarcodeProductsListMapperKt.withIdInActionParams(update.getButton(), String.valueOf(item.getId()))));
                            Intrinsics.checkNotNullParameter(builder, "builder");
                            item = Item.copy$default(item, 0L, builder.B(), null, z11, 5, null);
                        }
                        arrayList.add(item);
                    }
                    return BarcodeProductsListVI.copy$default(oldItem, 0L, null, arrayList, null, null, null, false, null, 251, null);
                }
            }
        }
        return null;
    }

    private final BarcodeProductsListVI onToggleUpdateReceived(ToggleProductListUpdateKey update, BarcodeProductsListVI oldItem) {
        if (update.getId() != oldItem.getId()) {
            return null;
        }
        return BarcodeProductsListVI.copy$default(oldItem, 0L, null, null, null, null, null, !oldItem.getExpanded(), null, 191, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new BarcodeProductsListView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<BarcodeProductsListVI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<BarcodeProductsListDTO, d, List<BarcodeProductsListVI>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BarcodeProductsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return BarcodeProductsListComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull BarcodeProductsListVI oldItem, @NotNull BarcodeProductsListVI newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (newItem.getExpanded() != oldItem.getExpanded()) {
            return Boolean.valueOf(newItem.getExpanded());
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public BarcodeProductsListVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull BarcodeProductsListVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ToggleProductListUpdateKey) {
            return onToggleUpdateReceived((ToggleProductListUpdateKey) update, oldItem);
        }
        if (update instanceof GetProductsPageUpdateKey) {
            return onGetProductUpdateReceived((GetProductsPageUpdateKey) update, oldItem);
        }
        if (update instanceof ClearIsScrollToButtonUpdateKey) {
            return clearIsScrollToButton(oldItem);
        }
        return null;
    }
}
