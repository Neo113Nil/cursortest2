package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import A00.a;
import U7.d;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2DTO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2Mapper;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2NewStateUpdateKey;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2UpdatePayload;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010)\u001a\f\u0012\u0004\u0012\u00020\u00020'j\u0002`(2\n\u0010&\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b)\u0010*R2\u0010.\u001a\u001a\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040-0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020403028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010<\u001a\u000209*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0018\u0010@\u001a\u00020=*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewMapper;", "Lru/ozon/app/android/fresh/common/widgets/horizontalListWidget/AbstractHorizontalListViewMapper;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/di/NotificationCarouselV2Component;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2DTO;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "customize", "(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "oldItem", "onRefresh", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "Landroid/os/Parcelable;", "newScrollState", "onScrollStateSave", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Landroid/os/Parcelable;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "LA00/a$J$a;", "update", "handleCustomUpdates", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2NewStateUpdateKey;", "customSupportedUpdates", "Ljava/util/List;", "getCustomSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "getViewModel", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModel;", "viewModel", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "getExperimentalViewModel", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/NotificationCarouselV2ViewModelFF;", "experimentalViewModel", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/data/NotificationCarouselV2Mapper;", "mapper", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationCarouselV2ViewMapper extends AbstractHorizontalListViewMapper<NotificationCarouselV2Component, NotificationCarouselV2DTO, NotificationCarouselV2VO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<NotificationCarouselV2VO>> holderProducer = new NotificationCarouselV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<NotificationCarouselV2NewStateUpdateKey>> customSupportedUpdates = C7714v.a0(NotificationCarouselV2NewStateUpdateKey.class);

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationCarouselV2ViewModelFF getExperimentalViewModel(ComposerReferences composerReferences) {
        return (NotificationCarouselV2ViewModelFF) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewMapper$special$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                NotificationCarouselV2ViewModelFF viewModelExperimental = ((NotificationCarouselV2Component) NotificationCarouselV2ViewMapper.this.component()).getViewModelExperimental();
                Intrinsics.g(viewModelExperimental, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModelExperimental;
            }
        }).a(NotificationCarouselV2ViewModelFF.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationCarouselV2ViewModel getViewModel(ComposerReferences composerReferences) {
        return (NotificationCarouselV2ViewModel) new z0(composerReferences.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewMapper$special$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                NotificationCarouselV2ViewModel viewModel = ((NotificationCarouselV2Component) NotificationCarouselV2ViewMapper.this.component()).getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(NotificationCarouselV2ViewModel.class);
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper, ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull final ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        super.constructLayout(composerRootView, viewObject, references, viewItemHelper);
        d.c(references).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewMapper$constructLayout$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                NotificationCarouselV2ViewModel viewModel;
                Intrinsics.checkNotNullParameter(owner, "owner");
                viewModel = NotificationCarouselV2ViewMapper.this.getViewModel(references);
                viewModel.setShouldUpdateImmediately(true);
                references.getContainer().g().getLifecycle().e(this);
            }
        });
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public RecyclerView customize(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        recyclerView.setClipToPadding(false);
        recyclerView.setClipToOutline(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutAnimation(null);
        recyclerView.setBackgroundColor(a.getColor(recyclerView.getContext(), UniColors.BG_DARK_KEY.getResId()));
        return recyclerView;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public List<Class<NotificationCarouselV2NewStateUpdateKey>> getCustomSupportedUpdates() {
        return this.customSupportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NotificationCarouselV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NotificationCarouselV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return NotificationCarouselV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public NotificationCarouselV2Mapper getMapper() {
        return ((NotificationCarouselV2Component) component()).getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull NotificationCarouselV2VO oldItem, @NotNull NotificationCarouselV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (newItem.getItems().isEmpty()) {
            return C7714v.a0(NotificationCarouselV2UpdatePayload.RemoveWidget.INSTANCE);
        }
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getPaddings(), newItem.getPaddings())) {
            arrayList.add(NotificationCarouselV2UpdatePayload.PaddingsChanged.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getItems(), newItem.getItems())) {
            arrayList.add(NotificationCarouselV2UpdatePayload.ItemsChanged.INSTANCE);
        }
        if (oldItem.getUpdatePeriodSeconds() != newItem.getUpdatePeriodSeconds()) {
            arrayList.add(NotificationCarouselV2UpdatePayload.ScheduleTimeChanged.INSTANCE);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    public NotificationCarouselV2VO handleCustomUpdates(@NotNull a.J.InterfaceC0007a update, @NotNull NotificationCarouselV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof NotificationCarouselV2NewStateUpdateKey) {
            NotificationCarouselV2NewStateUpdateKey notificationCarouselV2NewStateUpdateKey = (NotificationCarouselV2NewStateUpdateKey) update;
            Long id2 = notificationCarouselV2NewStateUpdateKey.getId();
            long id3 = oldItem.getId();
            if (id2 != null && id2.longValue() == id3) {
                return notificationCarouselV2NewStateUpdateKey.getNewState();
            }
        }
        return oldItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public NotificationCarouselV2VO onRefresh(@NotNull NotificationCarouselV2VO oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return NotificationCarouselV2VO.copy$default(oldItem, 0L, null, 0L, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewMapper
    @NotNull
    public NotificationCarouselV2VO onScrollStateSave(@NotNull NotificationCarouselV2VO oldItem, @NotNull Parcelable newScrollState) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newScrollState, "newScrollState");
        return NotificationCarouselV2VO.copy$default(oldItem, 0L, null, 0L, null, null, newScrollState, 31, null);
    }
}
