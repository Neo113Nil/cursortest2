package ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation;

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
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.data.ScrollActionListDTO;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.data.ScrollActionListMapper;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.di.ScrollActionListComponent;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.domain.ScrollActionListVO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00182\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionListViewMapper;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewMapper;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/di/ScrollActionListComponent;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListDTO;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "customize", "(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;", "oldItem", "onRefresh", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;)Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "Landroid/os/Parcelable;", "newScrollState", "onScrollStateSave", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "newItem", "getPayload", "(Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;)Lru/ozon/app/android/fresh/main/widgets/scrollActionList/domain/ScrollActionListVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionListRootViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListMapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/scrollActionList/data/ScrollActionListMapper;", "mapper", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollActionListViewMapper extends AbstractHorizontalListViewMapper<ScrollActionListComponent, ScrollActionListDTO, ScrollActionListVO> {

    @NotNull
    private final Function2<View, ComposerReferences, ScrollActionListRootViewHolder> holderProducer = new ScrollActionListViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public RecyclerView customize(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setId(R$id.badgesRecyclerView);
        recyclerView.setClickable(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ScrollActionListRootViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ScrollActionListVO getPayload(@NotNull ScrollActionListVO oldItem, @NotNull ScrollActionListVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ScrollActionListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ScrollActionListComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ScrollActionListMapper getMapper() {
        return ((ScrollActionListComponent) component()).getMapper();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public ScrollActionListVO onRefresh(@NotNull ScrollActionListVO oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return ScrollActionListVO.copy$default(oldItem, 0L, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public ScrollActionListVO onScrollStateSave(@NotNull ScrollActionListVO oldItem, @NotNull Parcelable newScrollState) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newScrollState, "newScrollState");
        return ScrollActionListVO.copy$default(oldItem, 0L, null, null, null, null, newScrollState, 31, null);
    }
}
