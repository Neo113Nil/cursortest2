package ru.ozon.app.android.csma.tips.widgets.tipcourierproductphotos.presentation;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.tips.databinding.WidgetTipCourierProductPhotosBinding;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.app.android.uikit.view.recycler.decoration.EqualSpacingItemDecoration;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosViewHolder;", "Ld20/d;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosVO;", "Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierProductPhotosBinding;", "binding", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/csma/tips/databinding/WidgetTipCourierProductPhotosBinding;Ll10/i;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosVO;)V", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosAdapter;", "headerItemsAdapter", "Lru/ozon/app/android/csma/tips/widgets/tipcourierproductphotos/presentation/TipProductPhotosAdapter;", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TipProductPhotosViewHolder extends AbstractC6067d<TipProductPhotosVO> {

    @NotNull
    private final TipProductPhotosAdapter headerItemsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipProductPhotosViewHolder(@NotNull WidgetTipCourierProductPhotosBinding binding, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        TipProductPhotosAdapter tipProductPhotosAdapter = new TipProductPhotosAdapter();
        this.headerItemsAdapter = tipProductPhotosAdapter;
        RecyclerView recyclerView = binding.photosRv;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(tipProductPhotosAdapter);
        recyclerView.addItemDecoration(new EqualSpacingItemDecoration(recyclerView.getResources().getDimensionPixelSize(R$dimen.margin_extra_extra_small), false, 0, 6, null));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TipProductPhotosVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.headerItemsAdapter.submitList(item.getItems());
    }
}
