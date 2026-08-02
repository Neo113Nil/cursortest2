package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TopTravelModalButtonAdapterDelegateKt$topTravelModalButtonAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, View, TypedViewBinding<ButtonV3View>> {
    public static final TopTravelModalButtonAdapterDelegateKt$topTravelModalButtonAdapterDelegate$1 INSTANCE = new TopTravelModalButtonAdapterDelegateKt$topTravelModalButtonAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter.TopTravelModalButtonAdapterDelegateKt$topTravelModalButtonAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<ButtonV3View> {
        final /* synthetic */ View $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view) {
            super(0);
            this.$parent = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ButtonV3View invoke() {
            ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), this.$parent.getContext());
            if (buttonV3View == null) {
                Context context = this.$parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
            }
            buttonV3View.setLayoutParams(new RecyclerView.p(-1, -2));
            return buttonV3View;
        }
    }

    TopTravelModalButtonAdapterDelegateKt$topTravelModalButtonAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<ButtonV3View> invoke(LayoutInflater layoutInflater, View parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TypedViewBinding<>(new AnonymousClass1(parent));
    }
}
