package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Landroid/view/View;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2BottomAdapterDelegateKt$additionalLuggageV2BottomAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<View>> {
    final /* synthetic */ RoundedBackgroundProducer $backgroundProducer;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage.AdditionalLuggageV2BottomAdapterDelegateKt$additionalLuggageV2BottomAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<View> {
        final /* synthetic */ RoundedBackgroundProducer $backgroundProducer;
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup, RoundedBackgroundProducer roundedBackgroundProducer) {
            super(0);
            this.$root = viewGroup;
            this.$backgroundProducer = roundedBackgroundProducer;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View view = new View(this.$root.getContext());
            RoundedBackgroundProducer roundedBackgroundProducer = this.$backgroundProducer;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int px = ResourceExtKt.toPx(20, context);
            view.setLayoutParams(new RecyclerView.p(-1, px));
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            float f7 = px;
            view.setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, ThemeExtKt.themeColor(context2, R$attr.layerFloor1), 0.0f, 0.0f, f7, f7, 6, null));
            return view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2BottomAdapterDelegateKt$additionalLuggageV2BottomAdapterDelegate$1(RoundedBackgroundProducer roundedBackgroundProducer) {
        super(2);
        this.$backgroundProducer = roundedBackgroundProducer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<View> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root, this.$backgroundProducer));
    }
}
