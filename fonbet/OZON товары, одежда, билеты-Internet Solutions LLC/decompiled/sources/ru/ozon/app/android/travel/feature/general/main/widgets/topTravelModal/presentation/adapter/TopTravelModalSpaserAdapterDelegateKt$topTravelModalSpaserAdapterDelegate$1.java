package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Landroid/view/View;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TopTravelModalSpaserAdapterDelegateKt$topTravelModalSpaserAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, View, TypedViewBinding<View>> {
    public static final TopTravelModalSpaserAdapterDelegateKt$topTravelModalSpaserAdapterDelegate$1 INSTANCE = new TopTravelModalSpaserAdapterDelegateKt$topTravelModalSpaserAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter.TopTravelModalSpaserAdapterDelegateKt$topTravelModalSpaserAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<View> {
        final /* synthetic */ View $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view) {
            super(0);
            this.$parent = view;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View view = new View(this.$parent.getContext());
            view.setLayoutParams(new RecyclerView.p(-1, -2));
            return view;
        }
    }

    TopTravelModalSpaserAdapterDelegateKt$topTravelModalSpaserAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<View> invoke(LayoutInflater layoutInflater, View parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TypedViewBinding<>(new AnonymousClass1(parent));
    }
}
