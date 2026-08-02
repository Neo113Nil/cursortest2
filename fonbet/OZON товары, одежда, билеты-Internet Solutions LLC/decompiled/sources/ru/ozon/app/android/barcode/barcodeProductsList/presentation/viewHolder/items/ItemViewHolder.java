package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items;

import Hm.a;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products.ProductsListAdapter;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.Item;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper.ClearIsScrollToButtonUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "scrollToButton", "()V", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/Item;", "item", "bind", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/Item;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "", "productsCornerRadius", "F", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsListAdapter;", "productsAdapter", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsListAdapter;", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemViewHolder extends RecyclerView.C {

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final ProductsListAdapter productsAdapter;
    private final float productsCornerRadius;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemViewHolder(@NotNull RecyclerView view, @NotNull AdultListDelegateProvider adultListDelegateProvider, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adultListDelegateProvider, "adultListDelegateProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.refs = refs;
        AppTokensProvider.CornerRadius cornerRadius = AppTokensProvider.CornerRadius.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float big = cornerRadius.big(context);
        this.productsCornerRadius = big;
        ProductsListAdapter productsListAdapter = new ProductsListAdapter(onAction, adultListDelegateProvider, refs);
        this.productsAdapter = productsListAdapter;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(big);
        this.gradientDrawable = gradientDrawable;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        view.setAdapter(productsListAdapter);
        view.setLayoutManager(new LinearLayoutManager(this.itemView.getContext()));
        view.setNestedScrollingEnabled(false);
        view.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2(Item item, ItemViewHolder itemViewHolder) {
        if (item.getIsScrollToButton()) {
            itemViewHolder.scrollToButton();
        }
    }

    private final void scrollToButton() {
        View view;
        if (this.refs.getContainer().g().getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
            int measuredHeight = this.view.getMeasuredHeight();
            RecyclerView recyclerView = this.view;
            recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight2 = this.view.getMeasuredHeight() - measuredHeight;
            ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
            if (c11 != null && (view = c11.getView()) != null) {
                C10183a.i(view).scrollBy(0, measuredHeight2);
            }
            this.refs.getController().update(ClearIsScrollToButtonUpdateKey.INSTANCE);
        }
    }

    public final void bind(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.productsAdapter.submitList(item.getProducts(), new a(0, item, this));
        GradientDrawable gradientDrawable = this.gradientDrawable;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            gradientDrawable.setColor(parseColor.intValue());
        }
        this.view.setBackground(gradientDrawable);
    }
}
