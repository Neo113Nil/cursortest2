package ru.ozon.app.android.gallery.preview;

import Ej.b;
import Sc.o;
import Ve.C4636t5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.databinding.ItemGalleryPhoto360PreviewBinding;
import ru.ozon.app.android.gallery.databinding.ItemGalleryPhotoPreviewBinding;
import ru.ozon.app.android.gallery.databinding.ItemGalleryVideoPreviewBinding;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/gallery/preview/GalleryPreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/gallery/preview/PreviewViewHolder;", "", "Lru/ozon/app/android/gallery/ItemVO;", "list", "Lkotlin/Function0;", "", "selectedItem", "Lkotlin/Function1;", "", "onPreviewClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/gallery/preview/PreviewViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/gallery/preview/PreviewViewHolder;I)V", "getItemCount", "()I", "Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryPreviewAdapter extends RecyclerView.g<PreviewViewHolder> {

    @NotNull
    private final List<ItemVO> list;

    @NotNull
    private final Function1<Integer, Unit> onPreviewClick;

    @NotNull
    private final Function0<Integer> selectedItem;

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryPreviewAdapter(@NotNull List<? extends ItemVO> list, @NotNull Function0<Integer> selectedItem, @NotNull Function1<? super Integer, Unit> onPreviewClick) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(onPreviewClick, "onPreviewClick");
        this.list = list;
        this.selectedItem = selectedItem;
        this.onPreviewClick = onPreviewClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ItemVO itemVO = this.list.get(position);
        if (itemVO instanceof ItemVO.Image) {
            return 1;
        }
        if (itemVO instanceof ItemVO.Photo360) {
            return 2;
        }
        if (itemVO instanceof ItemVO.OzonVideo) {
            return 3;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PreviewViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        if (viewType == 1) {
            ItemGalleryPhotoPreviewBinding inflate = ItemGalleryPhotoPreviewBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new PhotoPreviewViewHolder(inflate, this.selectedItem, this.onPreviewClick);
        }
        if (viewType == 2) {
            ItemGalleryPhoto360PreviewBinding inflate2 = ItemGalleryPhoto360PreviewBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new Photo360PreviewViewHolder(inflate2, this.selectedItem, this.onPreviewClick);
        }
        if (viewType != 3) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType="));
        }
        ItemGalleryVideoPreviewBinding inflate3 = ItemGalleryVideoPreviewBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new VideoPreviewViewHolder(inflate3, this.selectedItem, this.onPreviewClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PreviewViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ItemVO itemVO = this.list.get(position);
        if (holder instanceof PhotoPreviewViewHolder) {
            Intrinsics.g(itemVO, "null cannot be cast to non-null type ru.ozon.app.android.gallery.ItemVO.Image");
            ((PhotoPreviewViewHolder) holder).bind((ItemVO.Image) itemVO);
        } else if (holder instanceof Photo360PreviewViewHolder) {
            Intrinsics.g(itemVO, "null cannot be cast to non-null type ru.ozon.app.android.gallery.ItemVO.Photo360");
            ((Photo360PreviewViewHolder) holder).bind((ItemVO.Photo360) itemVO);
        } else {
            if (!(holder instanceof VideoPreviewViewHolder)) {
                throw new o();
            }
            if (itemVO instanceof ItemVO.OzonVideo) {
                ((VideoPreviewViewHolder) holder).bind((ItemVO.OzonVideo) itemVO);
            }
        }
    }
}
