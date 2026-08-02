package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.orderPrice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemePriceSectionTitleAdapterDelegateKt$flightSeatsSchemePriceSectionTitleAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<TextAtomView>> {
    public static final FlightSeatsSchemePriceSectionTitleAdapterDelegateKt$flightSeatsSchemePriceSectionTitleAdapterDelegate$1 INSTANCE = new FlightSeatsSchemePriceSectionTitleAdapterDelegateKt$flightSeatsSchemePriceSectionTitleAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.orderPrice.FlightSeatsSchemePriceSectionTitleAdapterDelegateKt$flightSeatsSchemePriceSectionTitleAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<TextAtomView> {
        final /* synthetic */ ViewGroup $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$parent = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextAtomView invoke() {
            q qVar = q.f64554a;
            d b11 = N.b(TextAtomView.class);
            Context context = this.$parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomView textAtomView = (TextAtomView) qVar.g(b11, context);
            textAtomView.setLayoutParams(new RecyclerView.p(-1, -2));
            return textAtomView;
        }
    }

    FlightSeatsSchemePriceSectionTitleAdapterDelegateKt$flightSeatsSchemePriceSectionTitleAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<TextAtomView> invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TypedViewBinding<>(new AnonymousClass1(parent));
    }
}
