package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeContentRowViewV2;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContentRowViewV2;", "parent", "Landroid/view/LayoutInflater;", "<unused var>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<FlightSchemeContentRowViewV2>> {
    public static final FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$1 INSTANCE = new FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContentRowViewV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<FlightSchemeContentRowViewV2> {
        final /* synthetic */ Context $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$content = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FlightSchemeContentRowViewV2 invoke() {
            Context context = this.$content;
            Intrinsics.f(context);
            FlightSchemeContentRowViewV2 flightSchemeContentRowViewV2 = new FlightSchemeContentRowViewV2(context);
            Context context2 = this.$content;
            flightSchemeContentRowViewV2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            flightSchemeContentRowViewV2.setClipChildren(false);
            flightSchemeContentRowViewV2.setClipToPadding(false);
            Intrinsics.f(context2);
            flightSchemeContentRowViewV2.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
            return flightSchemeContentRowViewV2;
        }
    }

    FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<FlightSchemeContentRowViewV2> invoke(LayoutInflater parent, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(viewGroup, "<unused var>");
        return new TypedViewBinding<>(new AnonymousClass1(parent.getContext()));
    }
}
