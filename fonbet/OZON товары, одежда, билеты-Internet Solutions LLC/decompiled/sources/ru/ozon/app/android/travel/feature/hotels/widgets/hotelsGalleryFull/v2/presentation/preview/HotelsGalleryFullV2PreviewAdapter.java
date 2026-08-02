package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.preview;

import WZ.t;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullDiffUtilItemCallback;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view.HotelsGalleryFullV2PreviewItemView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001cR.\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001f¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2VI$GalleryItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewViewHolder;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onClick", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Landroidx/lifecycle/J;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/preview/HotelsGalleryFullV2PreviewViewHolder;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function2;", "selectedItem", "I", "getSelectedItem", "()I", "setSelectedItem", "(I)V", "previewHeight", "previewWidth", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFullV2PreviewAdapter extends i<HotelsGalleryFullV2VI.GalleryItem, HotelsGalleryFullV2PreviewViewHolder> {

    @NotNull
    private final Function2<Integer, t, Unit> onClick;
    private final int previewHeight;
    private final int previewWidth;
    private int selectedItem;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HotelsGalleryFullV2PreviewAdapter(@NotNull Context context, @NotNull Function2<? super Integer, ? super t, Unit> onClick, @NotNull J lifecycleOwner) {
        super(new HotelsGalleryFullDiffUtilItemCallback(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onClick = onClick;
        this.selectedItem = -1;
        this.previewHeight = ResourceExtKt.toPx(64, context);
        this.previewWidth = ResourceExtKt.toPx(86, context);
    }

    public final int getSelectedItem() {
        return this.selectedItem;
    }

    public final void setSelectedItem(int i11) {
        this.selectedItem = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((HotelsGalleryFullV2PreviewViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public HotelsGalleryFullV2PreviewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsGalleryFullV2PreviewItemView hotelsGalleryFullV2PreviewItemView = new HotelsGalleryFullV2PreviewItemView(context);
        hotelsGalleryFullV2PreviewItemView.setLayoutParams(new ViewGroup.LayoutParams(this.previewWidth, this.previewHeight));
        return new HotelsGalleryFullV2PreviewViewHolder(hotelsGalleryFullV2PreviewItemView, this.onClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull HotelsGalleryFullV2PreviewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HotelsGalleryFullV2VI.GalleryItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    public void onBindViewHolder(@NotNull HotelsGalleryFullV2PreviewViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (!payloads.isEmpty()) {
            HotelsGalleryFullV2VI.GalleryItem item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            holder.bind(item, payloads);
            return;
        }
        super.onBindViewHolder((HotelsGalleryFullV2PreviewAdapter) holder, position, payloads);
    }
}
