package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.di.FlightSeatsSchemeComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.FlightSeatsSchemeViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.view.FlightSeatsSchemePassengersBlockView;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\"0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/di/FlightSeatsSchemeComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlightSeatsSchemePassengersBlockStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<FlightSeatsSchemeComponent, FlightSeatsSchemeDTO, FlightSeatsSchemeVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(FlightSeatsSchemeVO.class, HidePassengerBlockShimmerUpdateKey.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightSeatsSchemePassengersBlockView flightSeatsSchemePassengersBlockView = new FlightSeatsSchemePassengersBlockView(context);
        Context context2 = flightSeatsSchemePassengersBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(20, context2);
        flightSeatsSchemePassengersBlockView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context3 = flightSeatsSchemePassengersBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        flightSeatsSchemePassengersBlockView.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context3, R$attr.layerFloor1), 0.0f, 0.0f, pxF, pxF, 6, null));
        Context context4 = flightSeatsSchemePassengersBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context4);
        Context context5 = flightSeatsSchemePassengersBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        flightSeatsSchemePassengersBlockView.setPadding(0, px, 0, ResourceExtKt.toPx(16, context5));
        return flightSeatsSchemePassengersBlockView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<FlightSeatsSchemeVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        NM.a aVar = new NM.a(0);
        InterfaceC7851b M11 = container.M();
        v b02 = container.b0();
        final Pc.a<FlightSeatsSchemeViewModel> viewModelProvider = component().getViewModelProvider();
        w0 a11 = new z0(b02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockStickyViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FlightSeatsSchemeViewModel flightSeatsSchemeViewModel = (FlightSeatsSchemeViewModel) Pc.a.this.get();
                Intrinsics.g(flightSeatsSchemeViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return flightSeatsSchemeViewModel;
            }
        }).a(FlightSeatsSchemeViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new FlightSeatsSchemePassengersBlockWidgetViewHolder(container, aVar, M11, (FlightSeatsSchemeViewModel) a11, container.X());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FlightSeatsSchemeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FlightSeatsSchemeComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public FlightSeatsSchemeVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FlightSeatsSchemeVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof FlightSeatsSchemeVO) {
            return (FlightSeatsSchemeVO) update;
        }
        if (update instanceof HidePassengerBlockShimmerUpdateKey) {
            return FlightSeatsSchemeVO.copy$default(oldItem, 0L, null, null, false, null, null, false, 119, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<FlightSeatsSchemeVO> map(@NotNull FlightSeatsSchemeDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getFlightSeatsSchemeMapper().invoke(state, info);
    }
}
