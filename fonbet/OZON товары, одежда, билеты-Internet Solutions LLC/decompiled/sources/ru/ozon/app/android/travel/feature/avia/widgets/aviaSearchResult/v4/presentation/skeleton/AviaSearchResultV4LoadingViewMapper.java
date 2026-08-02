package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import h20.InterfaceC6786a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di.AviaSearchResultV4Component;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateBottomButtonsView;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R0\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060+j\u0002`,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030$0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#R \u00104\u001a\u000e\u0012\n\b\u0001\u0012\u000600j\u0002`10/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/di/AviaSearchResultV4Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/di/AviaSearchResultV4Component;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/di/AviaSearchResultV4Component;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingViewMapper extends WidgetViewMapper<AviaSearchResultV4DTO, AviaSearchResultV4LoadingVO> {

    @NotNull
    private final AviaSearchResultV4Component component;

    @NotNull
    private final Function2<View, ComposerReferences, AviaSearchResultV4LoadingWidgetViewHolder> holderProducer;
    private final Integer layout;

    @NotNull
    private final List<Class<AviaSearchResultV4LoadingUpdate>> supportedUpdates;

    public AviaSearchResultV4LoadingViewMapper(@NotNull AviaSearchResultV4Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new AviaSearchResultV4LoadingViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.a0(AviaSearchResultV4LoadingUpdate.class);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof AviaSearchResultV4DTO) && ((AviaSearchResultV4DTO) state).getAsyncBehaviorType() != AviaSearchResultV4DTO.AsyncBehaviorType.NO_ACTION;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.f(context);
        int px = ResourceExtKt.toPx(16, context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        RecyclerViewExtensionsKt.addParentTouchesInterceptor(recyclerView, true);
        EmptyStateBottomButtonsView emptyStateBottomButtonsView = new EmptyStateBottomButtonsView(context);
        emptyStateBottomButtonsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        emptyStateBottomButtonsView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        emptyStateBottomButtonsView.setPadding(px, 0, px, px);
        frameLayout.addView(recyclerView);
        frameLayout.addView(emptyStateBottomButtonsView);
        return frameLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AviaSearchResultV4LoadingVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AviaSearchResultV4DTO, d, List<AviaSearchResultV4LoadingVO>> getMapper() {
        return this.component.getAviaSearchResultV4LoadingMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AviaSearchResultV4LoadingUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.component.getAviaSearchResultV4LoadingWidgetViewModel();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AviaSearchResultV4LoadingVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AviaSearchResultV4LoadingVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AviaSearchResultV4LoadingUpdate) {
            return AviaSearchResultV4LoadingVO.copy$default(oldItem, 0L, null, ((AviaSearchResultV4LoadingUpdate) update).getNewState(), 3, null);
        }
        return null;
    }
}
