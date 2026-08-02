package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.preview;

import Az.ViewOnClickListenerC2453a;
import WZ.t;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view.HotelsGalleryFullV2PreviewItemView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2PreviewItemView;", "view", "Lkotlin/Function2;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onClick", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2PreviewItemView;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;Ljava/util/List;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/view/HotelsGalleryFullV2PreviewItemView;", "boundData", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2PreviewViewHolder extends j {
    private HotelsGalleryFullV2VI.GalleryItem boundData;

    @NotNull
    private final HotelsGalleryFullV2PreviewItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFullV2PreviewViewHolder(@NotNull HotelsGalleryFullV2PreviewItemView view, @NotNull Function2<? super Integer, ? super t, Unit> onClick) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.view = view;
        this.itemView.setOnClickListener(new ViewOnClickListenerC2453a(5, onClick, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Function2 function2, HotelsGalleryFullV2PreviewViewHolder hotelsGalleryFullV2PreviewViewHolder, View view) {
        Integer valueOf = Integer.valueOf(hotelsGalleryFullV2PreviewViewHolder.getAdapterPosition());
        HotelsGalleryFullV2VI.GalleryItem galleryItem = hotelsGalleryFullV2PreviewViewHolder.boundData;
        function2.invoke(valueOf, galleryItem != null ? galleryItem.getTrackingInfo() : null);
    }

    public final void bind(@NotNull HotelsGalleryFullV2VI.GalleryItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        this.view.bind(item);
        this.view.updateSelection(item.getIsSelected());
    }

    public final void bind(@NotNull HotelsGalleryFullV2VI.GalleryItem item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        List<? extends Object> list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(it.next(), "payload_selection_changed")) {
                    this.boundData = item;
                    this.view.updateSelection(item.getIsSelected());
                    return;
                }
            }
        }
        bind(item);
    }
}
