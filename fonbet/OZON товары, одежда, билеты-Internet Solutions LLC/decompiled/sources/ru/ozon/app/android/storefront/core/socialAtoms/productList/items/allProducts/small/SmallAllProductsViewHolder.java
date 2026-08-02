package ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.small;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.atoms.databinding.ViewSocialSmallAllProductsBinding;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsVO;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.AllProductsViewHolder;
import ru.ozon.uni.R$color;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/small/SmallAllProductsViewHolder;", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/AllProductsViewHolder;", "parent", "Landroid/view/ViewGroup;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "binding", "Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialSmallAllProductsBinding;", "titleView", "Landroid/widget/TextView;", "countView", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/storefront/core/atoms/databinding/ViewSocialSmallAllProductsBinding;Landroid/widget/TextView;Landroid/widget/TextView;)V", "background", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/small/SmallAllProductsBackgroundDrawable;", "onBind", "vo", "Lru/ozon/app/android/storefront/core/socialAtoms/productList/items/allProducts/AllProductsVO;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallAllProductsViewHolder extends AllProductsViewHolder {

    @NotNull
    private final SmallAllProductsBackgroundDrawable background;

    @NotNull
    private final TextView countView;

    @NotNull
    private final TextView titleView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SmallAllProductsViewHolder(ViewGroup viewGroup, Function1 function1, ViewSocialSmallAllProductsBinding viewSocialSmallAllProductsBinding, TextView textView, TextView textView2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, function1, r3, (i11 & 8) != 0 ? r3.titleView : textView, (i11 & 16) != 0 ? r3.countView : textView2);
        ViewSocialSmallAllProductsBinding inflate = (i11 & 4) != 0 ? ViewSocialSmallAllProductsBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false) : viewSocialSmallAllProductsBinding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder
    public void onBind(@NotNull AllProductsVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.titleView.setText(vo.getTitle());
        setSquareSize(this.countView, -2, false);
        this.countView.setText(coerceAtMostMaxCount(vo.getProductsCount()));
        final TextView textView = this.countView;
        G.a(textView, new Runnable() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.productList.items.allProducts.small.SmallAllProductsViewHolder$onBind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView2;
                int maxSquareSize;
                TextView textView3;
                SmallAllProductsBackgroundDrawable smallAllProductsBackgroundDrawable;
                SmallAllProductsViewHolder smallAllProductsViewHolder = this;
                textView2 = smallAllProductsViewHolder.countView;
                maxSquareSize = smallAllProductsViewHolder.getMaxSquareSize(textView2);
                SmallAllProductsViewHolder smallAllProductsViewHolder2 = this;
                textView3 = smallAllProductsViewHolder2.countView;
                AllProductsViewHolder.setSquareSize$default(smallAllProductsViewHolder2, textView3, maxSquareSize, false, 2, null);
                smallAllProductsBackgroundDrawable = this.background;
                smallAllProductsBackgroundDrawable.setTextWidth(maxSquareSize);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SmallAllProductsViewHolder(@NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull ViewSocialSmallAllProductsBinding binding, @NotNull TextView titleView, @NotNull TextView countView) {
        super(r2, onAction);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(titleView, "titleView");
        Intrinsics.checkNotNullParameter(countView, "countView");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.titleView = titleView;
        this.countView = countView;
        SmallAllProductsBackgroundDrawable smallAllProductsBackgroundDrawable = new SmallAllProductsBackgroundDrawable(binding.getConstraintLayout().getContext().getColor(R$color.oz_semantic_accent_feed_2), binding.getConstraintLayout().getContext().getColor(R$color.oz_semantic_accent_alert));
        this.background = smallAllProductsBackgroundDrawable;
        this.itemView.setBackground(smallAllProductsBackgroundDrawable);
    }
}
