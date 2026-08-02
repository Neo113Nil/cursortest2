package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.di.PassengersDirectoryV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.PassengersDirectoryV3ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.view.PassengersDirectoryV3InputView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/di/PassengersDirectoryV3Component;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputWidgetViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PassengersDirectoryV3InputNoUiViewMapper extends OverlayWidgetScreenViewItemMapper2<PassengersDirectoryV3Component, PassengersDirectoryV3DTO, PassengersDirectoryV3InputVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PassengersDirectoryV3InputView passengersDirectoryV3InputView = new PassengersDirectoryV3InputView(context);
        passengersDirectoryV3InputView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return passengersDirectoryV3InputView;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof PassengersDirectoryV3DTO) && ((PassengersDirectoryV3DTO) state).getSearchInput() != null;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PassengersDirectoryV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PassengersDirectoryV3Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public PassengersDirectoryV3InputWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        component();
        return new PassengersDirectoryV3InputWidgetViewHolder(container, (PassengersDirectoryV3ViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputNoUiViewMapper$createHolder$lambda$3$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PassengersDirectoryV3ViewModel passengersDirectoryV3ViewModel = PassengersDirectoryV3InputNoUiViewMapper.this.component().getPassengersDirectoryV3ViewModel();
                Intrinsics.g(passengersDirectoryV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return passengersDirectoryV3ViewModel;
            }
        }).a(PassengersDirectoryV3ViewModel.class), new MN.a(0));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PassengersDirectoryV3InputVO> map(@NotNull PassengersDirectoryV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getInputMapper().invoke(state, info);
    }
}
