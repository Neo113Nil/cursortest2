package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalRefreshStateUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.events.HotelsBookTotalV3UiEvent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload.HotelsBookTotalV3Payload;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload.HotelsBookTotalV3PayloadManager;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.update.HotelsBookTotalV3Update;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3AsyncWidgetViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3View;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR(\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u001b0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/HotelsBookTotalV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/shared/HotelsBookTotalRefreshStateUpdate;", "update", "oldItem", "handleRefreshStateUpdate", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/shared/HotelsBookTotalRefreshStateUpdate;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "newItem", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3Payload;", "getPayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/di/HotelsBookTotalV3Component;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/HotelsBookTotalV3WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "getPayloadManager", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "payloadManager", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3AsyncWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3ViewMapper extends WidgetViewMapper<HotelsBookTotalV3DTO, HotelsBookTotalV3VO> {

    @NotNull
    private final HotelsBookTotalV3Component component;

    @NotNull
    private final Function2<View, ComposerReferences, HotelsBookTotalV3WidgetViewHolder> holderProducer;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public HotelsBookTotalV3ViewMapper(@NotNull HotelsBookTotalV3Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.b0(HotelsBookTotalV3Update.class, HotelsBookTotalRefreshStateUpdate.class, HotelsBookTotalIsLoadingUpdate.class);
        this.holderProducer = new HotelsBookTotalV3ViewMapper$holderProducer$1(this);
    }

    private final HotelsBookTotalV3PayloadManager getPayloadManager() {
        return this.component.getPayloadManager();
    }

    private final HotelsBookTotalV3VO handleRefreshStateUpdate(HotelsBookTotalRefreshStateUpdate update, HotelsBookTotalV3VO oldItem) {
        if (oldItem.getAsyncData() == null) {
            return null;
        }
        this.component.getUiEventsEmitter().sendEvent(new HotelsBookTotalV3UiEvent.Refresh(oldItem.getAsyncData(), update.getParams()));
        return null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsBookTotalV3View hotelsBookTotalV3View = new HotelsBookTotalV3View(context);
        hotelsBookTotalV3View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = hotelsBookTotalV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        hotelsBookTotalV3View.setPadding(px, px, px, px);
        Context context3 = hotelsBookTotalV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        hotelsBookTotalV3View.setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.layerFloor1));
        return hotelsBookTotalV3View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotelsBookTotalV3VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<HotelsBookTotalV3AsyncWidgetViewModel> getViewModelWidgetProvider() {
        return this.component.getAsyncViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsBookTotalV3DTO, d, List<HotelsBookTotalV3VO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<HotelsBookTotalV3Payload> getPayload(@NotNull HotelsBookTotalV3VO oldItem, @NotNull HotelsBookTotalV3VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return getPayloadManager().invoke(oldItem, newItem);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsBookTotalV3VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsBookTotalV3VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsBookTotalV3Update) {
            return ((HotelsBookTotalV3Update) update).getNewState();
        }
        if (update instanceof HotelsBookTotalIsLoadingUpdate) {
            return HotelsBookTotalV3VO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, null, ((HotelsBookTotalIsLoadingUpdate) update).getIsLoading(), null, 1535, null);
        }
        if (update instanceof HotelsBookTotalRefreshStateUpdate) {
            return handleRefreshStateUpdate((HotelsBookTotalRefreshStateUpdate) update, oldItem);
        }
        return null;
    }
}
