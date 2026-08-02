package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeListViewMapper;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewMapper;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/di/ImageBadgeListDIComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "customize", "(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;", "oldItem", "onRefresh", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "Landroid/os/Parcelable;", "newScrollState", "onScrollStateSave", "(Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/domain/ImageBadgeListVO;", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/ImageBadgeListViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListMapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageBadgeListViewMapper extends AbstractHorizontalListViewMapper<ImageBadgeListDIComponent, ImageBadgeListDTO, ImageBadgeListVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ImageBadgeListViewHolder> holderProducer = new ImageBadgeListViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public RecyclerView customize(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setId(R$id.imageBadgeListRV);
        recyclerView.setClickable(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ImageBadgeListViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ImageBadgeListDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ImageBadgeListDIComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ImageBadgeListMapper getMapper() {
        return ((ImageBadgeListDIComponent) component()).getMapper();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public ImageBadgeListVO onRefresh(@NotNull ImageBadgeListVO oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return ImageBadgeListVO.copy$default(oldItem, 0L, null, null, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public ImageBadgeListVO onScrollStateSave(@NotNull ImageBadgeListVO oldItem, @NotNull Parcelable newScrollState) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newScrollState, "newScrollState");
        return ImageBadgeListVO.copy$default(oldItem, 0L, null, null, null, newScrollState, 15, null);
    }
}
