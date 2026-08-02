package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import Ej.b;
import Sc.o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullViewImageMiniatureBinding;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullViewUgcMiniatureBinding;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullViewVideoMiniatureBinding;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature.GalleryFullView360MiniatureBackground;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullViewMiniatureAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;", "Lkotlin/Function0;", "", "selectedItem", "Lkotlin/Function1;", "", "onClick", "", "isSelect", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;I)V", "getItemCount", "()I", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Z", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "viewData", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "getViewData", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;", "setViewData", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO;)V", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryFullViewMiniatureAdapter extends RecyclerView.g<BaseGalleryViewMiniatureViewHolder> {
    private final boolean isSelect;

    @NotNull
    private final Function1<Integer, Unit> onClick;

    @NotNull
    private final Function0<Integer> selectedItem;
    private GalleryFullViewVO viewData;
    public static final int $stable = 8;
    private static final float selectBgItemRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
    private static final int selectBgItemColor = UniColors.BRAND_SELECT_SELECT_BLUE_200.getResId();

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryFullViewMiniatureAdapter(@NotNull Function0<Integer> selectedItem, @NotNull Function1<? super Integer, Unit> onClick, boolean z11) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.selectedItem = selectedItem;
        this.onClick = onClick;
        this.isSelect = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        List<GalleryFullViewVO.GalleryItemVO> items;
        GalleryFullViewVO galleryFullViewVO = this.viewData;
        if (galleryFullViewVO == null || (items = galleryFullViewVO.getItems()) == null) {
            return 0;
        }
        return items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        List<GalleryFullViewVO.GalleryItemVO> items;
        GalleryFullViewVO galleryFullViewVO = this.viewData;
        GalleryFullViewVO.GalleryItemVO galleryItemVO = (galleryFullViewVO == null || (items = galleryFullViewVO.getItems()) == null) ? null : (GalleryFullViewVO.GalleryItemVO) C7714v.Q(position, items);
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Image) {
            return 1;
        }
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Photo360) {
            return 2;
        }
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Ugc) {
            return 4;
        }
        if (galleryItemVO instanceof GalleryFullViewVO.GalleryItemVO.Video) {
            return 3;
        }
        if (galleryItemVO == null) {
            throw new IllegalStateException("unknown view type");
        }
        throw new o();
    }

    public final void setViewData(GalleryFullViewVO galleryFullViewVO) {
        this.viewData = galleryFullViewVO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseGalleryViewMiniatureViewHolder holder, int position) {
        List<GalleryFullViewVO.GalleryItemVO> items;
        Intrinsics.checkNotNullParameter(holder, "holder");
        GalleryFullViewVO galleryFullViewVO = this.viewData;
        GalleryFullViewVO.GalleryItemVO galleryItemVO = (galleryFullViewVO == null || (items = galleryFullViewVO.getItems()) == null) ? null : (GalleryFullViewVO.GalleryItemVO) C7714v.Q(position, items);
        if (holder instanceof ImageGalleryFullViewMiniatureViewHolder) {
            ImageGalleryFullViewMiniatureViewHolder imageGalleryFullViewMiniatureViewHolder = (ImageGalleryFullViewMiniatureViewHolder) holder;
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Image");
            GalleryFullViewVO.GalleryItemVO.Image image = (GalleryFullViewVO.GalleryItemVO.Image) galleryItemVO;
            GalleryFullViewVO galleryFullViewVO2 = this.viewData;
            imageGalleryFullViewMiniatureViewHolder.bind(image, galleryFullViewVO2 != null ? galleryFullViewVO2.getMiniItemsRatio() : null);
            return;
        }
        if (holder instanceof VideoGalleryFullViewMiniatureHolder) {
            VideoGalleryFullViewMiniatureHolder videoGalleryFullViewMiniatureHolder = (VideoGalleryFullViewMiniatureHolder) holder;
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Video");
            GalleryFullViewVO.GalleryItemVO.Video video = (GalleryFullViewVO.GalleryItemVO.Video) galleryItemVO;
            GalleryFullViewVO galleryFullViewVO3 = this.viewData;
            videoGalleryFullViewMiniatureHolder.bind(video, galleryFullViewVO3 != null ? galleryFullViewVO3.getMiniItemsRatio() : null);
            return;
        }
        if (holder instanceof UgcGalleryFullViewMiniatureViewHolder) {
            UgcGalleryFullViewMiniatureViewHolder ugcGalleryFullViewMiniatureViewHolder = (UgcGalleryFullViewMiniatureViewHolder) holder;
            Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Ugc");
            GalleryFullViewVO.GalleryItemVO.Ugc ugc = (GalleryFullViewVO.GalleryItemVO.Ugc) galleryItemVO;
            GalleryFullViewVO galleryFullViewVO4 = this.viewData;
            ugcGalleryFullViewMiniatureViewHolder.bind(ugc, galleryFullViewVO4 != null ? galleryFullViewVO4.getMiniItemsRatio() : null);
            return;
        }
        if (!(holder instanceof GalleryFullView360MiniatureViewHolder)) {
            throw new o();
        }
        GalleryFullView360MiniatureViewHolder galleryFullView360MiniatureViewHolder = (GalleryFullView360MiniatureViewHolder) holder;
        Intrinsics.g(galleryItemVO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO.GalleryItemVO.Photo360");
        GalleryFullViewVO.GalleryItemVO.Photo360 photo360 = (GalleryFullViewVO.GalleryItemVO.Photo360) galleryItemVO;
        GalleryFullViewVO galleryFullViewVO5 = this.viewData;
        galleryFullView360MiniatureViewHolder.bind(photo360, galleryFullViewVO5 != null ? galleryFullViewVO5.getMiniItemsRatio() : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseGalleryViewMiniatureViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            ItemGalleryFullViewImageMiniatureBinding inflate = ItemGalleryFullViewImageMiniatureBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            if (this.isSelect) {
                inflate.previewGroup.setRadius(selectBgItemRadius);
                inflate.previewGroup.setStrokeColor(inflate.getConstraintLayout().getContext().getColor(selectBgItemColor));
            }
            Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
            return new ImageGalleryFullViewMiniatureViewHolder(inflate, this.selectedItem, this.onClick);
        }
        if (viewType == 2) {
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setId(R$id.miniature360Iv);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            GalleryFullView360MiniatureBackground.Companion companion = GalleryFullView360MiniatureBackground.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView.setBackground(companion.create(context, this.isSelect));
            return new GalleryFullView360MiniatureViewHolder(imageView, this.selectedItem, this.onClick);
        }
        if (viewType != 3) {
            if (viewType != 4) {
                throw new IllegalArgumentException(b.a(viewType, "Unknown viewType="));
            }
            ItemGalleryFullViewUgcMiniatureBinding inflate2 = ItemGalleryFullViewUgcMiniatureBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new UgcGalleryFullViewMiniatureViewHolder(inflate2, this.selectedItem, this.onClick);
        }
        ItemGalleryFullViewVideoMiniatureBinding inflate3 = ItemGalleryFullViewVideoMiniatureBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        if (this.isSelect) {
            inflate3.previewGroup.setRadius(selectBgItemRadius);
            inflate3.previewGroup.setStrokeColor(inflate3.getConstraintLayout().getContext().getColor(selectBgItemColor));
        }
        Intrinsics.checkNotNullExpressionValue(inflate3, "apply(...)");
        return new VideoGalleryFullViewMiniatureHolder(inflate3, this.selectedItem, this.onClick);
    }
}
