package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.vertical;

import ET.a;
import a00.h;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.presentation.view.VerticalButtonWithInformationView;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data.ButtonWithInformationDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.data.ButtonWithInformationMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.di.ButtonWithInformationComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.ButtonWithInformationVO;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationIsVisibleViewModel;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/vertical/VerticalButtonWithInformationViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/di/ButtonWithInformationComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/vertical/VerticalButtonWithInformationWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/vertical/VerticalButtonWithInformationWidgetViewHolder;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/data/ButtonWithInformationMapper;", "mapper", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VerticalButtonWithInformationViewMapper extends OverlayWidgetScreenViewItemMapper2<ButtonWithInformationComponent, ButtonWithInformationDTO, ButtonWithInformationVO> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VerticalButtonWithInformationView verticalButtonWithInformationView = new VerticalButtonWithInformationView(context);
        verticalButtonWithInformationView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return verticalButtonWithInformationView;
    }

    private final ButtonWithInformationMapper getMapper() {
        return component().getMapper();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof ButtonWithInformationDTO)) {
            return false;
        }
        ButtonWithInformationDTO buttonWithInformationDTO = (ButtonWithInformationDTO) state;
        return buttonWithInformationDTO.isVerticalLayout() && buttonWithInformationDTO.getHasButton();
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ButtonWithInformationComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ButtonWithInformationComponent.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public VerticalButtonWithInformationWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        h a02 = container.a0();
        final ButtonWithInformationComponent component = component();
        return new VerticalButtonWithInformationWidgetViewHolder(container, (ButtonWithInformationIsVisibleViewModel) new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.vertical.VerticalButtonWithInformationViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonWithInformationIsVisibleViewModel viewModel = ButtonWithInformationComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(ButtonWithInformationIsVisibleViewModel.class), component().getCustomActionHandlersStoreFactory(), component().getHandlersInhibitor(), new a(5));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonWithInformationVO> map(@NotNull ButtonWithInformationDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
