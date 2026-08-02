package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.priceList;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6969b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/priceList/PriceListVHV2;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "priceList", "", "isFlexLayout", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Z)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Z)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$PriceList;", "item", "", "bind", "(Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2$PriceList;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lhk0/b;", "atomsAdapter", "Lhk0/b;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceListVHV2 extends RecyclerView.C {

    @NotNull
    private final C6969b atomsAdapter;

    @NotNull
    private final RecyclerView priceList;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Function1<AtomItemViewHolder, Unit> initializerBlockForFlexLayout = PriceListVHV2$Companion$initializerBlockForFlexLayout$1.INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/priceList/PriceListVHV2$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private PriceListVHV2(RecyclerView recyclerView, boolean z11) {
        super(recyclerView);
        this.priceList = recyclerView;
        C6969b c6969b = new C6969b(new AtomItemViewHolderDelegate(z11 ? initializerBlockForFlexLayout : null, null, null, 6, null));
        recyclerView.setAdapter(c6969b);
        this.atomsAdapter = c6969b;
    }

    public final void bind(@NotNull DynamicElementVOV2.PriceList item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.atomsAdapter.submitList(item.getList());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PriceListVHV2(@NotNull Context context, boolean z11) {
        this(r0, z11);
        RecyclerView.o createLayoutManager;
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        recyclerView.setNestedScrollingEnabled(false);
        createLayoutManager = PriceListVHV2Kt.createLayoutManager(context, z11);
        recyclerView.setLayoutManager(createLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipChildren(false);
    }
}
