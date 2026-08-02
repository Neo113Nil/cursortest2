package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.badges.delegate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelTrainRouteDetailsBadgesAdapterDelegateKt$travelTrainRouteDetailsBadgesAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<InfoBadgeView>> {
    public static final TravelTrainRouteDetailsBadgesAdapterDelegateKt$travelTrainRouteDetailsBadgesAdapterDelegate$1 INSTANCE = new TravelTrainRouteDetailsBadgesAdapterDelegateKt$travelTrainRouteDetailsBadgesAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/molecules/view/infoBadge/InfoBadgeView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.badges.delegate.TravelTrainRouteDetailsBadgesAdapterDelegateKt$travelTrainRouteDetailsBadgesAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<InfoBadgeView> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InfoBadgeView invoke() {
            Context context = this.$root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InfoBadgeView infoBadgeView = new InfoBadgeView(context, null, 0, 0, 14, null);
            FlexboxLayoutManager.b bVar = new FlexboxLayoutManager.b(-2, -2);
            Context context2 = infoBadgeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = ResourceExtKt.toPx(10, context2);
            Context context3 = infoBadgeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = ResourceExtKt.toPx(8, context3);
            infoBadgeView.setLayoutParams(bVar);
            return infoBadgeView;
        }
    }

    TravelTrainRouteDetailsBadgesAdapterDelegateKt$travelTrainRouteDetailsBadgesAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<InfoBadgeView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
