package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.product.large;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.R$id;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/ProductListItemViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductVO;", "context", "Landroid/content/Context;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "largeProductView", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductView;", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/product/large/LargeProductView;)V", "onBind", "vo", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LargeProductViewHolder extends ProductListItemViewHolder<LargeProductVO> {

    @NotNull
    private final LargeProductView largeProductView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LargeProductViewHolder(Context context, Function1 function1, LargeProductView largeProductView, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, function1, largeProductView);
        Context context2;
        if ((i11 & 4) != 0) {
            context2 = context;
            largeProductView = new LargeProductView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder
    public void onBind(@NotNull LargeProductVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.largeProductView.setup(vo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeProductViewHolder(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull LargeProductView largeProductView) {
        super(largeProductView, R$id.largeProductListItem, onAction);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(largeProductView, "largeProductView");
        this.largeProductView = largeProductView;
    }
}
