package ru.ozon.app.android.atoms.v3.molecules.list.rv;

import Eb0.a;
import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.molecules.list.models.GalleryItem;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.holders.GalleryImageItemViewHolder;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.holders.GalleryImagesCountViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.common.StubImageLoader;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/rv/GalleryRecyclerViewAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "", "", "onPhotoClick", "onCounterClick", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/jvm/functions/Function1;", "getOnPhotoClick", "()Lkotlin/jvm/functions/Function1;", "setOnPhotoClick", "(Lkotlin/jvm/functions/Function1;)V", "getOnCounterClick", "setOnCounterClick", "Lru/ozon/uni/atoms/common/ImageLoader;", "imageLoader", "Lru/ozon/uni/atoms/common/ImageLoader;", "getImageLoader", "()Lru/ozon/uni/atoms/common/ImageLoader;", "setImageLoader", "(Lru/ozon/uni/atoms/common/ImageLoader;)V", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryRecyclerViewAdapter extends t<GalleryItem, RecyclerView.C> {

    @NotNull
    private ImageLoader imageLoader;

    @NotNull
    private Function1<? super Integer, Unit> onCounterClick;

    @NotNull
    private Function1<? super Integer, Unit> onPhotoClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryRecyclerViewAdapter(@NotNull Function1<? super Integer, Unit> onPhotoClick, @NotNull Function1<? super Integer, Unit> onCounterClick) {
        super(new i.d<GalleryItem>() { // from class: ru.ozon.app.android.atoms.v3.molecules.list.rv.GalleryRecyclerViewAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(GalleryItem oldItem, GalleryItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem == newItem;
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(GalleryItem oldItem, GalleryItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }
        });
        Intrinsics.checkNotNullParameter(onPhotoClick, "onPhotoClick");
        Intrinsics.checkNotNullParameter(onCounterClick, "onCounterClick");
        this.onPhotoClick = onPhotoClick;
        this.onCounterClick = onCounterClick;
        this.imageLoader = new StubImageLoader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$2$lambda$1(GalleryImageItemViewHolder galleryImageItemViewHolder, GalleryRecyclerViewAdapter galleryRecyclerViewAdapter, View view) {
        Integer valueOf = Integer.valueOf(galleryImageItemViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            galleryRecyclerViewAdapter.onPhotoClick.invoke(valueOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$5$lambda$4(GalleryImagesCountViewHolder galleryImagesCountViewHolder, GalleryRecyclerViewAdapter galleryRecyclerViewAdapter, View view) {
        Integer valueOf = Integer.valueOf(galleryImagesCountViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            galleryRecyclerViewAdapter.onCounterClick.invoke(valueOf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        GalleryItem item = getItem(position);
        if (item instanceof GalleryItem.GalleryImageCountItem) {
            return GalleryItem.GalleryImageCountItem.INSTANCE.getLAYOUT_ITEM_ID();
        }
        if (item instanceof GalleryItem.GalleryImageItem) {
            return GalleryItem.GalleryImageItem.INSTANCE.getLAYOUT_ITEM_ID();
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof GalleryImageItemViewHolder) {
            GalleryItem item = getItem(position);
            GalleryItem.GalleryImageItem galleryImageItem = item instanceof GalleryItem.GalleryImageItem ? (GalleryItem.GalleryImageItem) item : null;
            if (galleryImageItem != null) {
                ((GalleryImageItemViewHolder) holder).bind(galleryImageItem);
                return;
            }
            return;
        }
        if (holder instanceof GalleryImagesCountViewHolder) {
            GalleryItem item2 = getItem(position);
            GalleryItem.GalleryImageCountItem galleryImageCountItem = item2 instanceof GalleryItem.GalleryImageCountItem ? (GalleryItem.GalleryImageCountItem) item2 : null;
            if (galleryImageCountItem != null) {
                ((GalleryImagesCountViewHolder) holder).bind(galleryImageCountItem);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        GalleryItem.GalleryImageItem.Companion companion = GalleryItem.GalleryImageItem.INSTANCE;
        if (viewType == companion.getLAYOUT_ITEM_ID()) {
            GalleryImageItemViewHolder galleryImageItemViewHolder = new GalleryImageItemViewHolder(ViewGroupExtKt.inflate(parent, companion.getLAYOUT_ITEM_ID()), this.imageLoader);
            galleryImageItemViewHolder.getContainerView().setOnClickListener(new a(4, galleryImageItemViewHolder, this));
            return galleryImageItemViewHolder;
        }
        GalleryItem.GalleryImageCountItem.Companion companion2 = GalleryItem.GalleryImageCountItem.INSTANCE;
        if (viewType != companion2.getLAYOUT_ITEM_ID()) {
            throw new Exception("incorrect view type");
        }
        GalleryImagesCountViewHolder galleryImagesCountViewHolder = new GalleryImagesCountViewHolder(ViewGroupExtKt.inflate(parent, companion2.getLAYOUT_ITEM_ID()));
        galleryImagesCountViewHolder.getContainerView().setOnClickListener(new BE.a(2, galleryImagesCountViewHolder, this));
        return galleryImagesCountViewHolder;
    }

    public final void setImageLoader(@NotNull ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }
}
