package ru.ozon.app.android.rfbs.deliverycomplain.presentation;

import AO.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.cs_orders.databinding.WidgetDeliveryComplainBinding;
import ru.ozon.app.android.rfbs.deliverycomplain.data.DeliveryComplainDTO;
import ru.ozon.app.android.rfbs.deliverycomplain.di.DeliveryComplainWidgetComponent;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.DeliveryComplainVO;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.MapperKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001d2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/DeliveryComplainOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/rfbs/deliverycomplain/di/DeliveryComplainWidgetComponent;", "Lru/ozon/app/android/rfbs/deliverycomplain/data/DeliveryComplainDTO;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/DeliveryComplainVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/rfbs/deliverycomplain/data/DeliveryComplainDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryComplainOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<DeliveryComplainWidgetComponent, DeliveryComplainDTO, DeliveryComplainVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int buttonMargin = UiExtKt.toPx(16);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/DeliveryComplainOverlayViewMapper$Companion;", "", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeliveryComplainWidgetComponent widgetComponent$lambda$3(C7475g c7475g) {
        return DeliveryComplainWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<DeliveryComplainVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        LargeButtonView largeButtonView = new LargeButtonView(L11, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = buttonMargin;
        marginLayoutParams.setMargins(i11, marginLayoutParams.topMargin, i11, i11);
        largeButtonView.setLayoutParams(marginLayoutParams);
        WidgetDeliveryComplainBinding inflate = WidgetDeliveryComplainBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new DeliveryComplainWidgetHolder(largeButtonView, inflate, container, component().getHandlersInhibitor(), (ComplainViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainOverlayViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ComplainViewModel viewModel = DeliveryComplainOverlayViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(ComplainViewModel.class));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryComplainWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(DeliveryComplainWidgetComponent.class), new a(storage, 2));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<DeliveryComplainVO> map(@NotNull DeliveryComplainDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(MapperKt.toVO(state));
    }
}
