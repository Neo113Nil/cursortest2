package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation;

import HQ.a;
import a00.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.data.ButtonWithInformationV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.di.ButtonWithInformationV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.view.ButtonWithInformationV2View;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationV2IsVisibleViewModel;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/ButtonWithInformationV2ViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/data/ButtonWithInformationV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/ButtonWithInformationV2VO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/di/ButtonWithInformationV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/di/ButtonWithInformationV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/data/ButtonWithInformationV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/ButtonWithInformationV2WidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/presentation/ButtonWithInformationV2WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v2/di/ButtonWithInformationV2Component;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWithInformationV2ViewMapper extends r<ButtonWithInformationV2DTO, ButtonWithInformationV2VO> {

    @NotNull
    private final ButtonWithInformationV2Component component;

    public ButtonWithInformationV2ViewMapper(@NotNull ButtonWithInformationV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonWithInformationV2View buttonWithInformationV2View = new ButtonWithInformationV2View(context);
        buttonWithInformationV2View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return buttonWithInformationV2View;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ButtonWithInformationV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        h a02 = container.a0();
        final ButtonWithInformationV2Component buttonWithInformationV2Component = this.component;
        return new ButtonWithInformationV2WidgetViewHolder(container, (ButtonWithInformationV2IsVisibleViewModel) new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonWithInformationV2IsVisibleViewModel viewModel = ButtonWithInformationV2Component.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(ButtonWithInformationV2IsVisibleViewModel.class), this.component.getCustomActionHandlersStoreFactory(), this.component.getHandlersInhibitor(), new a(3));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ButtonWithInformationV2VO> map(@NotNull ButtonWithInformationV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
