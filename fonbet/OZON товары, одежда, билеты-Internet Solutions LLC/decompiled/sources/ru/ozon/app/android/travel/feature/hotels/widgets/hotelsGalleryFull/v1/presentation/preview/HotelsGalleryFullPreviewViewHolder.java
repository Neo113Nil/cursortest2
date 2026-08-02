package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.preview;

import Bk0.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullVI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullPreviewItemView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\f\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/preview/HotelsGalleryFullPreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPreviewItemView;", "view", "Lkotlin/Function1;", "", "", "onClick", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPreviewItemView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullVI$GalleryItem;Ljava/util/List;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/view/HotelsGalleryFullPreviewItemView;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullPreviewViewHolder extends RecyclerView.C {

    @NotNull
    private final HotelsGalleryFullPreviewItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullPreviewViewHolder(@NotNull HotelsGalleryFullPreviewItemView view, @NotNull Function1<? super Integer, Unit> onClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.view = view;
        this.itemView.setOnClickListener(new a(4, onClick, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Function1 function1, HotelsGalleryFullPreviewViewHolder hotelsGalleryFullPreviewViewHolder, View view) {
        function1.invoke(Integer.valueOf(hotelsGalleryFullPreviewViewHolder.getAdapterPosition()));
    }

    public final void bind(@NotNull HotelsGalleryFullVI.GalleryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item);
        this.view.updateSelection(item.getIsSelected());
    }

    public final void bind(@NotNull HotelsGalleryFullVI.GalleryItem item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        List<? extends Object> list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(it.next(), "payload_selection_changed")) {
                    this.view.updateSelection(item.getIsSelected());
                    return;
                }
            }
        }
        bind(item);
    }
}
