package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.button;

import AP.a;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.data.storage.utils.TravelPageStorageUtilsKt;
import ru.ozon.app.android.travel.feature.general.booking.R$layout;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data.PassengersMatcherV2ButtonMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.data.PassengersMatcherV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.di.PassengersMatcherV2Component;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/button/PassengersMatcherV2ButtonNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/di/PassengersMatcherV2Component;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/button/PassengersMatcherV2ButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2ButtonMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/data/PassengersMatcherV2ButtonMapper;", "mapper", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PassengersMatcherV2ButtonNoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<PassengersMatcherV2Component, PassengersMatcherV2DTO, PassengersMatcherV2ButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewGroupExtKt.inflate(parent, R$layout.widget_passengers_matcher_v2_button);
    }

    private final PassengersMatcherV2ButtonMapper getMapper() {
        return component().getButtonMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof PassengersMatcherV2DTO) && ((PassengersMatcherV2DTO) state).getLargeButton() != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PassengersMatcherV2ButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new PassengersMatcherV2ButtonWidgetViewHolder(container, component().getCustomActionHandlersStoreFactory(), TravelPageStorageUtilsKt.getTravelPageStorageHolder(container).getPageStorage(), new a(1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PassengersMatcherV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PassengersMatcherV2Component.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PassengersMatcherV2ButtonVO> map(@NotNull PassengersMatcherV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
