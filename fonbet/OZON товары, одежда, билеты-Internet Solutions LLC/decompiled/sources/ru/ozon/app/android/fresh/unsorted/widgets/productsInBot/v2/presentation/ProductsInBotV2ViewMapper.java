package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import A00.a;
import Tc.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.unsorted.R$plurals;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.ProductsInBotV2ButtonCounterUpdate;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.ProductsInBotV2QuantityUpdate;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.data.ProductsInBotV2DTO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2Component;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.RmsQuantitySelector;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\r*\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r*\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$2\n\u0010#\u001a\u00060!j\u0002`\"H\u0016¢\u0006\u0004\b%\u0010&R\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R,\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/di/ProductsInBotV2Component;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/data/ProductsInBotV2DTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "<init>", "()V", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "", "qty", "maxQty", "updateSelector", "(Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;II)Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "updateIncrease", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;II)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "updateDecrease", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "updateCheckbox", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "toggleChecked", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;)Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2Mapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2Mapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductsInBotV2ViewMapper extends WidgetViewMapper2<ProductsInBotV2Component, ProductsInBotV2DTO, ProductsInBotV2VO> {
    private final Void layout;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ProductsInBotV2ButtonCounterUpdate.class, ProductsInBotV2QuantityUpdate.class);

    @NotNull
    private final Function2<View, ComposerReferences, ProductsInBotV2ViewHolder> holderProducer = new ProductsInBotV2ViewMapper$holderProducer$1(this);

    private final RmsCheckbox toggleChecked(RmsCheckbox rmsCheckbox) {
        return RmsCheckbox.copy$default(rmsCheckbox, null, rmsCheckbox.getChecked() != null ? Boolean.valueOf(!r0.booleanValue()) : null, null, 5, null);
    }

    private final ProductsInBotV2VO.ItemVO updateCheckbox(ProductsInBotV2VO.ItemVO itemVO) {
        return ProductsInBotV2VO.ItemVO.copy$default(itemVO, toggleChecked(itemVO.getCheckbox()), 0L, null, null, null, null, null, null, null, null, false, 2046, null);
    }

    private final IconButtonV3DTO updateDecrease(IconButtonV3DTO iconButtonV3DTO, int i11, int i12) {
        return i11 == 1 ? IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, 16367, null) : (2 > i11 || i11 > i12) ? iconButtonV3DTO : IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, 16367, null);
    }

    private final IconButtonV3DTO updateIncrease(IconButtonV3DTO iconButtonV3DTO, int i11, int i12) {
        return (1 > i11 || i11 >= i12) ? i11 == i12 ? IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, 16367, null) : iconButtonV3DTO : IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, 16367, null);
    }

    private final RmsQuantitySelector updateSelector(RmsQuantitySelector rmsQuantitySelector, int i11, int i12) {
        return rmsQuantitySelector.copy(updateIncrease(rmsQuantitySelector.getIncrease(), i11, i12), updateDecrease(rmsQuantitySelector.getDecrease(), i11, i12), TextDTO.copy$default(rmsQuantitySelector.getQuantity(), new OzonSpannableString(String.valueOf(i11)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ProductsInBotV2View(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ProductsInBotV2ViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ProductsInBotV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ProductsInBotV2Component.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProductsInBotV2Mapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ProductsInBotV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ProductsInBotV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        int i11 = -1;
        int i12 = 0;
        if (update instanceof ProductsInBotV2QuantityUpdate) {
            Iterator<ProductsInBotV2VO.ItemVO> it = oldItem.getItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().getSkuId() == ((ProductsInBotV2QuantityUpdate) update).getSkuId()) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
            Integer maxQuantity = oldItem.getItems().get(i11).getMaxQuantity();
            if (maxQuantity != null) {
                int intValue = maxQuantity.intValue();
                b builder = C7714v.B();
                builder.addAll(oldItem.getItems());
                ProductsInBotV2VO.ItemVO itemVO = oldItem.getItems().get(i11);
                RmsQuantitySelector quantitySelector = oldItem.getItems().get(i11).getQuantitySelector();
                builder.set(i11, ProductsInBotV2VO.ItemVO.copy$default(itemVO, null, 0L, null, null, null, null, quantitySelector != null ? updateSelector(quantitySelector, ((ProductsInBotV2QuantityUpdate) update).getQty(), intValue) : null, null, null, null, false, 1983, null));
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                return ProductsInBotV2VO.copy$default(oldItem, 0L, builder.B(), null, null, 13, null);
            }
        } else if (update instanceof ProductsInBotV2ButtonCounterUpdate) {
            ProductsInBotV2ButtonCounterUpdate productsInBotV2ButtonCounterUpdate = (ProductsInBotV2ButtonCounterUpdate) update;
            String quantityString = StringProvider.getQuantityString(R$plurals.products_in_bot_v2_count_plural, productsInBotV2ButtonCounterUpdate.getItemsQty(), Integer.valueOf(productsInBotV2ButtonCounterUpdate.getItemsQty()));
            Iterator<ProductsInBotV2VO.ItemVO> it2 = oldItem.getItems().iterator();
            int i13 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().getSkuId() == productsInBotV2ButtonCounterUpdate.getSkuId()) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
            ProductsInBotV2VO.ItemVO updateCheckbox = updateCheckbox(oldItem.getItems().get(i11));
            ButtonV3DTO copy$default = ButtonV3DTO.copy$default(oldItem.getButton(), null, null, null, null, null, quantityString, Boolean.valueOf(productsInBotV2ButtonCounterUpdate.getItemsQty() == 0), null, null, null, null, null, null, null, null, null, null, 130975, null);
            b builder2 = C7714v.B();
            builder2.addAll(oldItem.getItems());
            builder2.set(i11, updateCheckbox);
            Intrinsics.checkNotNullParameter(builder2, "builder");
            return ProductsInBotV2VO.copy$default(oldItem, 0L, builder2.B(), copy$default, null, 9, null);
        }
        return null;
    }
}
