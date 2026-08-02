package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images;

import FM.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/adapter/images/ToursSearchResultItemImagesAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO$Image;", "Lkotlin/Function0;", "", "imageItemClickListener", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "position", "", "", "payloads", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function0;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultItemImagesAdapter extends AsyncListDifferDelegationAdapter<ToursSearchResultVO.HotelVO.Image> {

    @NotNull
    private final Function0<Unit> imageItemClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultItemImagesAdapter(@NotNull Function0<Unit> imageItemClickListener) {
        super(new i.d<ToursSearchResultVO.HotelVO.Image>() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images.ToursSearchResultItemImagesAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ToursSearchResultVO.HotelVO.Image oldItem, ToursSearchResultVO.HotelVO.Image newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ToursSearchResultVO.HotelVO.Image oldItem, ToursSearchResultVO.HotelVO.Image newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(imageItemClickListener, "imageItemClickListener");
        this.imageItemClickListener = imageItemClickListener;
        this.delegatesManager.addDelegate(R$id.toursSearchResultItemImageViewType, ToursSearchResultItemImageAdapterDelegateKt.toursSearchResultItemImageAdapterDelegate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ToursSearchResultItemImagesAdapter toursSearchResultItemImagesAdapter, View view) {
        toursSearchResultItemImagesAdapter.imageItemClickListener.invoke();
    }

    @Override // ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter, androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.onBindViewHolder(holder, position, payloads);
        holder.itemView.setOnClickListener(new a(this, 6));
    }
}
