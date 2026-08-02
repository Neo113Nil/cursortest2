package ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.view;

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
import ru.ozon.uni.android.atom.badge.BadgeView;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursFlightDetailsStageAdapterDelegateKt$toursFlightDetailsStageAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<BadgeView>> {
    public static final ToursFlightDetailsStageAdapterDelegateKt$toursFlightDetailsStageAdapterDelegate$1 INSTANCE = new ToursFlightDetailsStageAdapterDelegateKt$toursFlightDetailsStageAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/badge/BadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.view.ToursFlightDetailsStageAdapterDelegateKt$toursFlightDetailsStageAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<BadgeView> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BadgeView invoke() {
            q qVar = q.f64554a;
            d b11 = N.b(BadgeView.class);
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BadgeView badgeView = (BadgeView) qVar.g(b11, context);
            badgeView.setLayoutParams(new RecyclerView.p(-2, -2));
            return badgeView;
        }
    }

    ToursFlightDetailsStageAdapterDelegateKt$toursFlightDetailsStageAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<BadgeView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
