package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature;

import Ck.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewUtils;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B%\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/BaseGalleryViewMiniatureViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "Lkotlin/Function1;", "", "", "onClick", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "", "ratio", "setAspectRatio", "(Ljava/lang/Double;)V", "miniItemsRatio", "bind", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/GalleryFullView360MiniatureViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/ImageGalleryFullViewMiniatureViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/UgcGalleryFullViewMiniatureViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/miniature/VideoGalleryFullViewMiniatureHolder;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseGalleryViewMiniatureViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<Integer, Unit> onClick;

    public /* synthetic */ BaseGalleryViewMiniatureViewHolder(View view, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(BaseGalleryViewMiniatureViewHolder baseGalleryViewMiniatureViewHolder, View view) {
        baseGalleryViewMiniatureViewHolder.onClick.invoke(Integer.valueOf(baseGalleryViewMiniatureViewHolder.getAdapterPosition()));
    }

    private final void setAspectRatio(Double ratio) {
        if (ratio == null || ratio.doubleValue() < 1.0d) {
            View view = this.itemView;
            GalleryFullViewUtils galleryFullViewUtils = GalleryFullViewUtils.INSTANCE;
            view.setLayoutParams(new ViewGroup.LayoutParams(galleryFullViewUtils.getMiniatureSizeMin(), galleryFullViewUtils.getMiniatureSizeMax()));
        } else if (ratio.doubleValue() == 1.0d) {
            View view2 = this.itemView;
            GalleryFullViewUtils galleryFullViewUtils2 = GalleryFullViewUtils.INSTANCE;
            view2.setLayoutParams(new ViewGroup.LayoutParams(galleryFullViewUtils2.getMiniatureSizeMin(), galleryFullViewUtils2.getMiniatureSizeMin()));
        } else if (ratio.doubleValue() > 1.0d) {
            View view3 = this.itemView;
            GalleryFullViewUtils galleryFullViewUtils3 = GalleryFullViewUtils.INSTANCE;
            view3.setLayoutParams(new ViewGroup.LayoutParams(galleryFullViewUtils3.getMiniatureSizeMax(), galleryFullViewUtils3.getMiniatureSizeMin()));
        }
    }

    public final void bind(Double miniItemsRatio) {
        setAspectRatio(miniItemsRatio);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BaseGalleryViewMiniatureViewHolder(View view, Function1<? super Integer, Unit> function1) {
        super(view);
        this.onClick = function1;
        view.setOnClickListener(new a(this, 2));
    }
}
