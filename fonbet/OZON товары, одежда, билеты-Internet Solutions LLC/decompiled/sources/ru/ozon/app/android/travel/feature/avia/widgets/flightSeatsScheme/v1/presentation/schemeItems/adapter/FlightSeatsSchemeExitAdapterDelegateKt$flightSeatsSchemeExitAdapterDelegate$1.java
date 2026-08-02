package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeExitRowView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeExitRowView;", "parent", "Landroid/view/LayoutInflater;", "<unused var>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeExitAdapterDelegateKt$flightSeatsSchemeExitAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<FlightSchemeExitRowView>> {
    public static final FlightSeatsSchemeExitAdapterDelegateKt$flightSeatsSchemeExitAdapterDelegate$1 INSTANCE = new FlightSeatsSchemeExitAdapterDelegateKt$flightSeatsSchemeExitAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeExitRowView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSeatsSchemeExitAdapterDelegateKt$flightSeatsSchemeExitAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<FlightSchemeExitRowView> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FlightSchemeExitRowView invoke() {
            Context context = this.$context;
            Intrinsics.f(context);
            FlightSchemeExitRowView flightSchemeExitRowView = new FlightSchemeExitRowView(context);
            Context context2 = this.$context;
            flightSchemeExitRowView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Intrinsics.f(context2);
            flightSchemeExitRowView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
            return flightSchemeExitRowView;
        }
    }

    FlightSeatsSchemeExitAdapterDelegateKt$flightSeatsSchemeExitAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<FlightSchemeExitRowView> invoke(LayoutInflater parent, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(viewGroup, "<unused var>");
        return new TypedViewBinding<>(new AnonymousClass1(parent.getContext()));
    }
}
