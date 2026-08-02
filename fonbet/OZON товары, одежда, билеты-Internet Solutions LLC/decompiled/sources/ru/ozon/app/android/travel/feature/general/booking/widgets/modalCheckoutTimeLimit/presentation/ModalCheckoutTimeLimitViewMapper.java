package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation;

import WZ.l;
import a00.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data.ModalCheckoutTimeLimitDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.di.ModalCheckoutTimeLimitComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.view.ModalCheckoutTimeLimitView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/di/ModalCheckoutTimeLimitComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/di/ModalCheckoutTimeLimitComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/presentation/ModalCheckoutTimeLimitVO;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/di/ModalCheckoutTimeLimitComponent;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCheckoutTimeLimitViewMapper extends g<ModalCheckoutTimeLimitDTO, ModalCheckoutTimeLimitVO> {

    @NotNull
    private final ModalCheckoutTimeLimitComponent component;

    public ModalCheckoutTimeLimitViewMapper(@NotNull ModalCheckoutTimeLimitComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<ModalCheckoutTimeLimitVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        l tokenizedAnalytics = this.component.getTokenizedAnalytics();
        v b02 = container.b0();
        final ModalCheckoutTimeLimitComponent modalCheckoutTimeLimitComponent = this.component;
        return new ModalCheckoutTimeLimitWidgetViewHolder((ModalCheckoutTimeLimitView) view, tokenizedAnalytics, (ModalCheckoutTimeLimitViewModel) ((w0) j.a(b02.a(), N.b(ModalCheckoutTimeLimitViewModel.class), new C(modalCheckoutTimeLimitComponent) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.presentation.ModalCheckoutTimeLimitViewMapper$createHolder$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((ModalCheckoutTimeLimitComponent) this.receiver).getViewModel();
            }
        }).getValue()));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ModalCheckoutTimeLimitView modalCheckoutTimeLimitView = new ModalCheckoutTimeLimitView(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context context2 = modalCheckoutTimeLimitView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = modalCheckoutTimeLimitView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        modalCheckoutTimeLimitView.setPadding(px, modalCheckoutTimeLimitView.getPaddingTop(), ResourceExtKt.toPx(56, context3) + px, modalCheckoutTimeLimitView.getPaddingBottom());
        modalCheckoutTimeLimitView.setLayoutParams(marginLayoutParams);
        return modalCheckoutTimeLimitView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull ModalCheckoutTimeLimitVO oldItem, @NotNull ModalCheckoutTimeLimitVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle()) || Intrinsics.d(oldItem.getTimerText(), newItem.getTimerText())) {
            return null;
        }
        return "modal_checkout_time_limit_empty_payload";
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ModalCheckoutTimeLimitVO> map(@NotNull ModalCheckoutTimeLimitDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
