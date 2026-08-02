package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import A00.a;
import Vg.d;
import a00.h;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.travel.actionhandler.performActionsList.PerformActionsListUpdate;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEvent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.update.HotelsBookTotalV3Update;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3StickyVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R(\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f0%0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/HotelsBookTotalV3StickyViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerView;", "createView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/view/HotelsBookTotalV3StickyContainerView;", "Landroid/graphics/drawable/Drawable;", "produceBackground", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3StickyVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3StickyViewMapper extends r<HotelsBookTotalV3DTO, HotelsBookTotalV3StickyVO> {

    @NotNull
    private final HotelsBookTotalV3Component component;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public HotelsBookTotalV3StickyViewMapper(@NotNull HotelsBookTotalV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.b0(PerformActionsListUpdate.class, HotelsBookTotalIsLoadingUpdate.class, HotelsBookTotalV3Update.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HotelsBookTotalV3StickyContainerView createView(Context context) {
        HotelsBookTotalV3StickyContainerView hotelsBookTotalV3StickyContainerView = new HotelsBookTotalV3StickyContainerView(context);
        hotelsBookTotalV3StickyContainerView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        int px = ResourceExtKt.toPx(4, context);
        int px2 = ResourceExtKt.toPx(8, context);
        hotelsBookTotalV3StickyContainerView.setBackground(produceBackground(context));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        hotelsBookTotalV3StickyContainerView.setPadding(px2, px2, px2, px);
        hotelsBookTotalV3StickyContainerView.setLayoutParams(layoutParams);
        return hotelsBookTotalV3StickyContainerView;
    }

    private final Drawable produceBackground(Context context) {
        float pxF = ResourceExtKt.toPxF(20, context);
        int px = ResourceExtKt.toPx(-2, context);
        int px2 = ResourceExtKt.toPx(1, context);
        int color = context.getColor(UniColors.GRAPHIC_STROKE_STICKY.getResId());
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(themeColor);
        gradientDrawable.setStroke(px2, color);
        gradientDrawable.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f});
        return new InsetDrawable((Drawable) gradientDrawable, px, 0, px, px);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        HotelsBookTotalV3DTO hotelsBookTotalV3DTO = state instanceof HotelsBookTotalV3DTO ? (HotelsBookTotalV3DTO) state : null;
        return (hotelsBookTotalV3DTO != null ? hotelsBookTotalV3DTO.getStickyContainer() : null) != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<HotelsBookTotalV3StickyVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        h a02 = container.a0();
        final HotelsBookTotalV3Component hotelsBookTotalV3Component = this.component;
        HotelsBookTotalV3ViewModel hotelsBookTotalV3ViewModel = (HotelsBookTotalV3ViewModel) new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelsBookTotalV3ViewModel viewModel = HotelsBookTotalV3Component.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(HotelsBookTotalV3ViewModel.class);
        h a03 = container.a0();
        final HotelsBookTotalV3Component hotelsBookTotalV3Component2 = this.component;
        HotelsBookTotalV3StickyViewModel hotelsBookTotalV3StickyViewModel = (HotelsBookTotalV3StickyViewModel) new z0(a03.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HotelsBookTotalV3StickyViewModel stickyViewModel = HotelsBookTotalV3Component.this.getStickyViewModel();
                Intrinsics.g(stickyViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return stickyViewModel;
            }
        }).a(HotelsBookTotalV3StickyViewModel.class);
        hotelsBookTotalV3ViewModel.setUpStorage(TravelPageStorageUtilsKt.getTravelPageStorageHolder(container).getPageStorage());
        d customActionHandlersStoreFactory = this.component.getCustomActionHandlersStoreFactory();
        return new HotelsBookTotalV3StickyWidgetViewHolder(new HotelsBookTotalV3StickyViewMapper$createHolder$1(this, container), hotelsBookTotalV3ViewModel, hotelsBookTotalV3StickyViewModel, container, this.component.getUiEventsCollector(), customActionHandlersStoreFactory);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // c20.r, I00.d
    public HotelsBookTotalV3StickyVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsBookTotalV3StickyVO oldItem) {
        HotelsBookTotalV3StickyVO hotelsBookTotalV3StickyVO;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PerformActionsListUpdate) {
            this.component.getUiEventsEmitter().sendEvent(new HotelsBookTotalV3UiEvent.PerformActionsList(((PerformActionsListUpdate) update).getActionsWithDelay()));
            hotelsBookTotalV3StickyVO = oldItem;
        } else {
            if (update instanceof HotelsBookTotalIsLoadingUpdate) {
                return HotelsBookTotalV3StickyVO.copy$default(oldItem, 0L, null, null, ((HotelsBookTotalIsLoadingUpdate) update).getIsLoading(), 7, null);
            }
            hotelsBookTotalV3StickyVO = oldItem;
            if (update instanceof HotelsBookTotalV3Update) {
                return HotelsBookTotalV3StickyVO.copy$default(hotelsBookTotalV3StickyVO, 0L, null, null, ((HotelsBookTotalV3Update) update).getNewState().getIsLoading(), 7, null);
            }
        }
        return (HotelsBookTotalV3StickyVO) super.handleUpdate(update, (a.J.InterfaceC0007a) hotelsBookTotalV3StickyVO);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<HotelsBookTotalV3StickyVO> map(@NotNull HotelsBookTotalV3DTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getStickyMapper().invoke(state.getStickyContainer(), info);
    }
}
