package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2PassengerTabView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<FlightSeatsSchemeV2PassengerTabView>> {
    public static final FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$1 INSTANCE = new FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<FlightSeatsSchemeV2PassengerTabView> {
        final /* synthetic */ ViewGroup $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$parent = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FlightSeatsSchemeV2PassengerTabView invoke() {
            Context context = this.$parent.getContext();
            Intrinsics.f(context);
            int px = ResourceExtKt.toPx(12, context);
            int px2 = ResourceExtKt.toPx(6, context);
            FlightSeatsSchemeV2PassengerTabView flightSeatsSchemeV2PassengerTabView = new FlightSeatsSchemeV2PassengerTabView(context);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            flightSeatsSchemeV2PassengerTabView.setForeground(androidx.core.content.a.getDrawable(context, typedValue.resourceId));
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            flightSeatsSchemeV2PassengerTabView.setPadding(px, px2, px, px2);
            flightSeatsSchemeV2PassengerTabView.setLayoutParams(layoutParams);
            return flightSeatsSchemeV2PassengerTabView;
        }
    }

    FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<FlightSeatsSchemeV2PassengerTabView> invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TypedViewBinding<>(new AnonymousClass1(parent));
    }
}
