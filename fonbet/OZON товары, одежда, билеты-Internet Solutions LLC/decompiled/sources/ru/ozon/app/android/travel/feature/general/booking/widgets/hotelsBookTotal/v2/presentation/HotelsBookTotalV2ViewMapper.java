package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalRefreshStateUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.data.HotelsBookTotalV2Mapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.di.HotelsBookTotalV2Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.HotelsBookTotalV2View;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/di/HotelsBookTotalV2Component;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/data/HotelsBookTotalV2Mapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2WidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsBookTotalV2ViewMapper extends WidgetViewMapper2<HotelsBookTotalV2Component, HotelsBookTotalV2DTO, HotelsBookTotalV2VO> {

    @NotNull
    private final Function2<View, ComposerReferences, HotelsBookTotalV2WidgetViewHolder> holderProducer = new HotelsBookTotalV2ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(HotelsBookTotalV2Update.class, HotelsBookTotalRefreshStateUpdate.class, HotelsBookTotalIsLoadingUpdate.class);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsBookTotalV2View hotelsBookTotalV2View = new HotelsBookTotalV2View(context);
        hotelsBookTotalV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = hotelsBookTotalV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        hotelsBookTotalV2View.setPadding(px, px, px, px);
        Context context3 = hotelsBookTotalV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(24, context3);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context4 = hotelsBookTotalV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        hotelsBookTotalV2View.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context4, R$attr.layerFloor1), pxF, pxF, 0.0f, 0.0f, 24, null));
        return hotelsBookTotalV2View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HotelsBookTotalV2WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<HotelsBookTotalV2WidgetViewModel> getViewModelWidgetProvider() {
        return component().getWidgetViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsBookTotalV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsBookTotalV2Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public HotelsBookTotalV2Mapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull HotelsBookTotalV2VO oldItem, @NotNull HotelsBookTotalV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getState(), newItem.getState())) {
            arrayList.add(HotelsBookTotalV2Payload.STATE);
        }
        if (oldItem.getShouldFetchState() != newItem.getShouldFetchState()) {
            arrayList.add(HotelsBookTotalV2Payload.SHOULD_FETCH_STATE);
        }
        if (oldItem.getShouldShowLoader() != newItem.getShouldShowLoader()) {
            arrayList.add(HotelsBookTotalV2Payload.SHOULD_SHOW_LOADER);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsBookTotalV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsBookTotalV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsBookTotalV2Update) {
            HotelsBookTotalV2Update hotelsBookTotalV2Update = (HotelsBookTotalV2Update) update;
            return HotelsBookTotalV2VO.copy$default(oldItem, 0L, hotelsBookTotalV2Update.getNewState(), hotelsBookTotalV2Update.getShouldFetchState(), hotelsBookTotalV2Update.getShouldShowLoader(), null, 17, null);
        }
        if (update instanceof HotelsBookTotalRefreshStateUpdate) {
            return HotelsBookTotalV2VO.copy$default(oldItem, 0L, null, true, false, null, 27, null);
        }
        if (update instanceof HotelsBookTotalIsLoadingUpdate) {
            return HotelsBookTotalV2VO.copy$default(oldItem, 0L, null, false, ((HotelsBookTotalIsLoadingUpdate) update).getIsLoading(), null, 23, null);
        }
        return null;
    }
}
