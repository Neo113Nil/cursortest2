package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeExitRowViewV2;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeExitRowViewV2;", "parent", "Landroid/view/LayoutInflater;", "<unused var>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ExitAdapterDelegateKt$flightSeatsSchemeV2ExitAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<FlightSchemeExitRowViewV2>> {
    public static final FlightSeatsSchemeV2ExitAdapterDelegateKt$flightSeatsSchemeV2ExitAdapterDelegate$1 INSTANCE = new FlightSeatsSchemeV2ExitAdapterDelegateKt$flightSeatsSchemeV2ExitAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeExitRowViewV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSeatsSchemeV2ExitAdapterDelegateKt$flightSeatsSchemeV2ExitAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<FlightSchemeExitRowViewV2> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FlightSchemeExitRowViewV2 invoke() {
            Context context = this.$context;
            Intrinsics.f(context);
            FlightSchemeExitRowViewV2 flightSchemeExitRowViewV2 = new FlightSchemeExitRowViewV2(context);
            Context context2 = this.$context;
            flightSchemeExitRowViewV2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            Intrinsics.f(context2);
            flightSchemeExitRowViewV2.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
            return flightSchemeExitRowViewV2;
        }
    }

    FlightSeatsSchemeV2ExitAdapterDelegateKt$flightSeatsSchemeV2ExitAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<FlightSchemeExitRowViewV2> invoke(LayoutInflater parent, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(viewGroup, "<unused var>");
        return new TypedViewBinding<>(new AnonymousClass1(parent.getContext()));
    }
}
