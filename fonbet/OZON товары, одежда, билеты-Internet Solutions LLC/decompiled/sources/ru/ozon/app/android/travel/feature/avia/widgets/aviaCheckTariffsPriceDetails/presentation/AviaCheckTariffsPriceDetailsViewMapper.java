package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation;

import A00.a;
import Vg.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.avia.shared.buttonSwitcher.ButtonWithInformationSwitcherViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.data.AviaCheckTariffsPriceDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view.AviaCheckTariffsPriceDetailsView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u001e0\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/di/AviaCheckTariffsPriceDetailsComponent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/data/AviaCheckTariffsPriceDetailsDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AviaCheckTariffsPriceDetailsViewMapper extends OverlayWidgetScreenViewItemMapper2<AviaCheckTariffsPriceDetailsComponent, AviaCheckTariffsPriceDetailsDTO, AviaCheckTariffsPriceDetailsVO> {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(AviaCheckTariffsPriceDetailsButtonUpdate.class);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AviaCheckTariffsPriceDetailsView aviaCheckTariffsPriceDetailsView = new AviaCheckTariffsPriceDetailsView(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context2 = aviaCheckTariffsPriceDetailsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        marginLayoutParams.topMargin = ResourceExtKt.toPx(8, context2);
        aviaCheckTariffsPriceDetailsView.setLayoutParams(marginLayoutParams);
        Context context3 = aviaCheckTariffsPriceDetailsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        aviaCheckTariffsPriceDetailsView.setElevation(ResourceExtKt.toPxF(6, context3));
        return aviaCheckTariffsPriceDetailsView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AviaCheckTariffsPriceDetailsVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        InterfaceC6068e interfaceC6068e = new InterfaceC6068e() { // from class: sM.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$2;
                createHolder$lambda$2 = AviaCheckTariffsPriceDetailsViewMapper.createHolder$lambda$2((LinearLayout) viewGroup);
                return createHolder$lambda$2;
            }
        };
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        v b02 = container.b0();
        final AviaCheckTariffsPriceDetailsComponent component = component();
        ButtonWithInformationSwitcherViewModel buttonWithInformationSwitcherViewModel = (ButtonWithInformationSwitcherViewModel) new z0(b02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ButtonWithInformationSwitcherViewModel buttonSwitcherViewModel = AviaCheckTariffsPriceDetailsComponent.this.getButtonSwitcherViewModel();
                Intrinsics.g(buttonSwitcherViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return buttonSwitcherViewModel;
            }
        }).a(ButtonWithInformationSwitcherViewModel.class);
        v b03 = container.b0();
        final AviaCheckTariffsPriceDetailsComponent component2 = component();
        return new AviaCheckTariffsPriceDetailsWidgetViewHolder(interfaceC6068e, customActionHandlersStoreFactory, container, buttonWithInformationSwitcherViewModel, (AviaCheckTariffsPriceDetailsViewModel) new z0(b03.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AviaCheckTariffsPriceDetailsViewModel viewModel = AviaCheckTariffsPriceDetailsComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AviaCheckTariffsPriceDetailsViewModel.class));
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
    public C7473e<AviaCheckTariffsPriceDetailsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AviaCheckTariffsPriceDetailsComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public AviaCheckTariffsPriceDetailsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AviaCheckTariffsPriceDetailsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof AviaCheckTariffsPriceDetailsButtonUpdate) {
            return AviaCheckTariffsPriceDetailsVO.copy$default(oldItem, 0L, null, null, null, null, null, false, ((AviaCheckTariffsPriceDetailsButtonUpdate) update).getShouldShowContinueButton(), 127, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AviaCheckTariffsPriceDetailsVO> map(@NotNull AviaCheckTariffsPriceDetailsDTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getAviaCheckTariffsPriceDetailsMapper().invoke(state, info);
    }
}
