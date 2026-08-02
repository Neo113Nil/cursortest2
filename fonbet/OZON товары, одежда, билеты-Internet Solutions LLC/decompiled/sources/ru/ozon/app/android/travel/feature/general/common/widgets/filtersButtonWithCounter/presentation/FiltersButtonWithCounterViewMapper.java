package ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation;

import A00.a;
import Bw.C2676a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data.FiltersButtonWithCounterDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data.FiltersButtonWithCounterMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.di.FiltersButtonWithCounterComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation.FiltersButtonWithCounterVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/di/FiltersButtonWithCounterComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterMapper;", "mapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FiltersButtonWithCounterViewMapper extends WidgetViewMapper2<FiltersButtonWithCounterComponent, FiltersButtonWithCounterDTO, FiltersButtonWithCounterVO> {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, FiltersButtonWithCounterWidgetViewHolder> holderProducer = new FiltersButtonWithCounterViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<FiltersButtonWithCounterUpdate>> supportedUpdates = C7714v.a0(FiltersButtonWithCounterUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiltersButtonWithCounterComponent widgetComponent$lambda$3(C7475g c7475g) {
        return new FiltersButtonWithCounterComponent(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(44, context);
        frameLayout.setMinimumWidth(px);
        frameLayout.setMinimumHeight(px);
        frameLayout.setClipToOutline(true);
        Context context2 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        frameLayout.setOutlineProvider(new RoundedOutlineProvider(ResourceExtKt.toPxF(12, context2)));
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        TravelFiltersButtonView travelFiltersButtonView = new TravelFiltersButtonView(context3, null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        travelFiltersButtonView.setLayoutParams(layoutParams);
        travelFiltersButtonView.setCounterPosition(TravelFiltersButtonView.CounterPosition.RIGHT_TOP);
        frameLayout.addView(travelFiltersButtonView);
        return frameLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, FiltersButtonWithCounterWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<FiltersButtonWithCounterUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FiltersButtonWithCounterComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(FiltersButtonWithCounterComponent.class), new C2676a(storage, 2));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public FiltersButtonWithCounterMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public FiltersButtonWithCounterVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FiltersButtonWithCounterVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        AsyncActionVO asyncActionVO = null;
        if (!(update instanceof FiltersButtonWithCounterUpdate)) {
            return null;
        }
        FiltersButtonWithCounterUpdate filtersButtonWithCounterUpdate = (FiltersButtonWithCounterUpdate) update;
        FiltersButtonWithCounterVO.FiltersButtonWithCounterState state = filtersButtonWithCounterUpdate.getState();
        AsyncActionVO asyncAction = filtersButtonWithCounterUpdate.getState().getAsyncAction();
        if (asyncAction != null) {
            AsyncActionVO asyncAction2 = oldItem.getState().getAsyncAction();
            asyncActionVO = AsyncActionVO.copy$default(asyncAction, null, asyncAction2 != null ? asyncAction2.getAsyncData() : null, null, null, 13, null);
        }
        return FiltersButtonWithCounterVO.copy$default(oldItem, 0L, FiltersButtonWithCounterVO.FiltersButtonWithCounterState.copy$default(state, asyncActionVO, null, null, null, 14, null), 1, null);
    }
}
