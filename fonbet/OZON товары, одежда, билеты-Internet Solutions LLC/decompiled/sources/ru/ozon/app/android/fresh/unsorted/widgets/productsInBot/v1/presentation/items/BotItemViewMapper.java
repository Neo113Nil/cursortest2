package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.items;

import A00.a;
import Xc.b;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.ProductsInBotQuantityUpdate;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data.ProductsInBotDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R.\u0010,\u001a\u0016\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/di/ProductsInBotComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotItemDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemVO;)Ljava/lang/Object;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/ProductsInBotQuantityUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LA00/a$J$a;", "updateConsumer", "getUpdateConsumer", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemMapper;", "mapper", "BotItemsPayloads", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotItemViewMapper extends WidgetViewMapper2<ProductsInBotComponent, ProductsInBotDTO.BotItemDTO, BotItemVO> {
    private final int layout = R$layout.layout_product_in_bot_item;

    @NotNull
    private final Function2<View, ComposerReferences, BotItemViewHolder> holderProducer = new BotItemViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<ProductsInBotQuantityUpdate>> supportedUpdates = C7714v.a0(ProductsInBotQuantityUpdate.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, BotItemVO, BotItemVO> updateConsumer = BotItemViewMapper$updateConsumer$1.INSTANCE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/items/BotItemViewMapper$BotItemsPayloads;", "", "<init>", "(Ljava/lang/String;I)V", "COUNT", "SELECT", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class BotItemsPayloads {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ BotItemsPayloads[] $VALUES;
        public static final BotItemsPayloads COUNT = new BotItemsPayloads("COUNT", 0);
        public static final BotItemsPayloads SELECT = new BotItemsPayloads("SELECT", 1);

        private static final /* synthetic */ BotItemsPayloads[] $values() {
            return new BotItemsPayloads[]{COUNT, SELECT};
        }

        static {
            BotItemsPayloads[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BotItemsPayloads(String str, int i11) {
        }

        public static BotItemsPayloads valueOf(String str) {
            return (BotItemsPayloads) Enum.valueOf(BotItemsPayloads.class, str);
        }

        public static BotItemsPayloads[] values() {
            return (BotItemsPayloads[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ProductsInBotDTO.BotItemDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, BotItemViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<ProductsInBotQuantityUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, BotItemVO, BotItemVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ProductsInBotComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ProductsInBotComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public BotItemMapper getMapper() {
        return component().getBotItemMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull BotItemVO oldItem, @NotNull BotItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.getIsSelected() != newItem.getIsSelected()) {
            arrayList.add(BotItemsPayloads.SELECT);
        }
        if (oldItem.getCurrentQuantity() != newItem.getCurrentQuantity()) {
            arrayList.add(BotItemsPayloads.COUNT);
        }
        return arrayList;
    }
}
