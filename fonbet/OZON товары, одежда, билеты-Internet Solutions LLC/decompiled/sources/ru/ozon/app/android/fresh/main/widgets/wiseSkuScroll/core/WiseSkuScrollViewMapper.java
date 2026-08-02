package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core;

import A00.a;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R0\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000600j\u0002`1\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010/¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/core/WiseSkuScrollViewMapper;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewMapper;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/di/WiseSkuScrollComponent;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "Landroid/os/Parcelable;", "newScrollState", "onScrollStateSave", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "onRefresh", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "LA00/a$J$a;", "update", "handleCustomUpdates", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/core/WiseSkuScrollHeightUpdate;", "customSupportedUpdates", "Ljava/util/List;", "getCustomSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WiseSkuScrollViewMapper extends AbstractHorizontalListViewMapper<WiseSkuScrollComponent, WiseSkuScrollDTO, WiseSkuScrollVO> {

    @NotNull
    private final List<Class<WiseSkuScrollHeightUpdate>> customSupportedUpdates = C7714v.a0(WiseSkuScrollHeightUpdate.class);

    @NotNull
    private final Function2<View, ComposerReferences, WiseSkuScrollViewHolder> holderProducer = new WiseSkuScrollViewMapper$holderProducer$1(this);
    private final Void layout;

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper, ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PullableHorizontalRecyclerView pullableHorizontalRecyclerView = new PullableHorizontalRecyclerView(context, null, 0, 6, null);
        pullableHorizontalRecyclerView.setId(R$id.wiseSkuScrollRv);
        pullableHorizontalRecyclerView.setLayoutParams(new RecyclerView.p(-1, -2));
        pullableHorizontalRecyclerView.setNestedScrollingEnabled(false);
        pullableHorizontalRecyclerView.setClipToPadding(false);
        pullableHorizontalRecyclerView.setClipToOutline(false);
        pullableHorizontalRecyclerView.setItemAnimator(null);
        pullableHorizontalRecyclerView.setLayoutAnimation(null);
        return pullableHorizontalRecyclerView;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public List<Class<WiseSkuScrollHeightUpdate>> getCustomSupportedUpdates() {
        return this.customSupportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, WiseSkuScrollViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<WiseSkuScrollDTO, d, List<WiseSkuScrollVO>> getMapper() {
        return ((WiseSkuScrollComponent) component()).getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<WiseSkuScrollComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return WiseSkuScrollComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    public WiseSkuScrollVO handleCustomUpdates(@NotNull a.J.InterfaceC0007a update, @NotNull WiseSkuScrollVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof WiseSkuScrollHeightUpdate)) {
            return null;
        }
        WiseSkuScrollHeightUpdate wiseSkuScrollHeightUpdate = (WiseSkuScrollHeightUpdate) update;
        if (wiseSkuScrollHeightUpdate.getWidgetId() != oldItem.getId()) {
            return null;
        }
        WiseSkuScrollVO copy$default = WiseSkuScrollVO.copy$default(oldItem, 0L, null, null, null, null, null, 0L, 127, null);
        copy$default.setHeight(wiseSkuScrollHeightUpdate.getHeight());
        return copy$default;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public WiseSkuScrollVO onRefresh(@NotNull WiseSkuScrollVO oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        WiseSkuScrollVO copy$default = WiseSkuScrollVO.copy$default(oldItem, 0L, null, null, null, null, null, 0L, 127, null);
        copy$default.setLayoutManagerState(null);
        return copy$default;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public WiseSkuScrollVO onScrollStateSave(@NotNull WiseSkuScrollVO oldItem, @NotNull Parcelable newScrollState) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newScrollState, "newScrollState");
        WiseSkuScrollVO copy$default = WiseSkuScrollVO.copy$default(oldItem, 0L, null, null, null, null, null, 0L, 127, null);
        copy$default.setLayoutManagerState(newScrollState);
        return copy$default;
    }
}
