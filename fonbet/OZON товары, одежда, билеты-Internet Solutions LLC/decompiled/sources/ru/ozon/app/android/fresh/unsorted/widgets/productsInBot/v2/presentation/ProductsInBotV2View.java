package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation;

import WZ.l;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.domain.ProductsInBotV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.recyclerview.ProductsInBotV2Adapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ£\u0001\u0010\u001a\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r26\u0010\u0013\u001a2\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00112\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u009b\u0001\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r26\u0010\u0013\u001a2\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u00112\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/ProductsInBotV2View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO$ItemVO;", "items", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "", "quantityActionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function2;", "setProduct", "removeProduct", "setupRecyclerAdapter", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lfd/n;LWZ/l;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/domain/ProductsInBotV2VO;Lkotlin/jvm/functions/Function1;Lfd/n;LWZ/l;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2Adapter;", "itemsAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v2/presentation/recyclerview/ProductsInBotV2Adapter;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductsInBotV2View extends LinearLayout {
    private ProductsInBotV2Adapter itemsAdapter;

    @NotNull
    private final RecyclerView recyclerView;

    public /* synthetic */ ProductsInBotV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setupRecyclerAdapter(List<ProductsInBotV2VO.ItemVO> items, Function1<? super AtomAction, Unit> actionHandler, InterfaceC6511n<? super Long, ? super Integer, ? super Function1<? super Integer, Unit>, ? extends Function1<? super AtomAction, Unit>> quantityActionHandler, l tokenizedAnalytics, Function2<? super Long, ? super Integer, Unit> setProduct, Function1<? super Long, Unit> removeProduct) {
        ProductsInBotV2Adapter productsInBotV2Adapter = new ProductsInBotV2Adapter(tokenizedAnalytics, actionHandler, quantityActionHandler, setProduct, removeProduct);
        this.itemsAdapter = productsInBotV2Adapter;
        this.recyclerView.setAdapter(productsInBotV2Adapter);
        ProductsInBotV2Adapter productsInBotV2Adapter2 = this.itemsAdapter;
        if (productsInBotV2Adapter2 != null) {
            productsInBotV2Adapter2.submitList(items);
        }
    }

    public final void bind(@NotNull ProductsInBotV2VO info, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super Long, ? super Integer, ? super Function1<? super Integer, Unit>, ? extends Function1<? super AtomAction, Unit>> quantityActionHandler, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Long, ? super Integer, Unit> setProduct, @NotNull Function1<? super Long, Unit> removeProduct) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(quantityActionHandler, "quantityActionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(setProduct, "setProduct");
        Intrinsics.checkNotNullParameter(removeProduct, "removeProduct");
        setupRecyclerAdapter(info.getItems(), actionHandler, quantityActionHandler, tokenizedAnalytics, setProduct, removeProduct);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInBotV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.items);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(recyclerView);
        this.recyclerView = recyclerView;
        setOrientation(1);
    }
}
