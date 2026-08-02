package ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.AtomButtonUpdate;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.product.common.CommonProductWidgetDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.ProductWidgetVO;
import ru.ozon.app.android.fresh.main.widgets.product.common.events.OnAdultDialogSubmited;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductToOneMapper;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductVO;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00011B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R.\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/di/ScrollComponent;", "Lru/ozon/app/android/fresh/main/widgets/product/common/CommonProductWidgetDTO;", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "<init>", "()V", "Lru/ozon/app/android/common/events/AtomButtonUpdate;", "update", "oldVO", "updateProducts", "(Lru/ozon/app/android/common/events/AtomButtonUpdate;Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;)Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/widgets/product/scroll/presentation/ScrollWidgetViewHolder;", "holderProducer", "getHolderProducer", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductToOneMapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductToOneMapper;", "mapper", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollViewMapper extends WidgetViewMapper2<ScrollComponent, CommonProductWidgetDTO, ProductWidgetVO> {
    private final Void layout;
    private static final int PADDING_DEFAULT = UiExtKt.toPx(12);
    private static final int PADDING_BOTTOM = UiExtKt.toPx(6);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(AtomButtonUpdate.class, OnAdultDialogSubmited.class);

    @NotNull
    private final Function2<a.J.InterfaceC0007a, ProductWidgetVO, ProductWidgetVO> updateConsumer = new ScrollViewMapper$updateConsumer$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, ScrollWidgetViewHolder> holderProducer = new ScrollViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductWidgetVO updateProducts(AtomButtonUpdate update, ProductWidgetVO oldVO) {
        Long y02 = h.y0(update.getId());
        List<ProductVO> products = oldVO.getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        boolean z11 = false;
        for (ProductVO productVO : products) {
            long skuId = productVO.getSkuId();
            if (y02 != null && skuId == y02.longValue()) {
                productVO = ProductVO.copy$default(productVO, 0L, null, 0L, null, null, false, false, null, null, null, update.getAtom(), null, null, null, null, false, null, 130047, null);
                z11 = true;
            }
            arrayList.add(productVO);
        }
        if (z11) {
            return ProductWidgetVO.copy$default(oldVO, 0L, arrayList, null, 5, null);
        }
        return null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.productsRv);
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        int i11 = PADDING_DEFAULT;
        recyclerView.setPadding(i11, i11, i11, PADDING_BOTTOM);
        recyclerView.setLayoutParams(pVar);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, UniColors.LAYER_FLOOR_1.getResId()));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ScrollWidgetViewHolder> mo614getHolderProducer() {
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

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, ProductWidgetVO, ProductWidgetVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ScrollComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ScrollComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ProductToOneMapper getMapper() {
        return component().getProductMapper();
    }
}
