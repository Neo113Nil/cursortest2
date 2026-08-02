package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherServiceView;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherServiceView;", "<unused var>", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class BuyTogetherServiceAdapterDelegateKt$buyTogetherServiceAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<BuyTogetherServiceView>> {
    public static final BuyTogetherServiceAdapterDelegateKt$buyTogetherServiceAdapterDelegate$1 INSTANCE = new BuyTogetherServiceAdapterDelegateKt$buyTogetherServiceAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/view/BuyTogetherServiceView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.adapter.BuyTogetherServiceAdapterDelegateKt$buyTogetherServiceAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<BuyTogetherServiceView> {
        final /* synthetic */ ViewGroup $parent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$parent = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BuyTogetherServiceView invoke() {
            Context context = this.$parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BuyTogetherServiceView buyTogetherServiceView = new BuyTogetherServiceView(context);
            Context context2 = buyTogetherServiceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            buyTogetherServiceView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(232, context2), -2));
            Context context3 = buyTogetherServiceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int px = ResourceExtKt.toPx(8, context3);
            buyTogetherServiceView.setPadding(px, px, px, px);
            Context context4 = buyTogetherServiceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            buyTogetherServiceView.setRadius(ResourceExtKt.toPxF(12, context4));
            Context context5 = buyTogetherServiceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            buyTogetherServiceView.setBorderWidth(ResourceExtKt.toPxF(1, context5));
            Context context6 = buyTogetherServiceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            buyTogetherServiceView.setBorderColor(Integer.valueOf(ThemeExtKt.themeColor(context6, R$attr.graphicNeutral)));
            Context context7 = buyTogetherServiceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
            buyTogetherServiceView.setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context7, R$attr.bgActionSecondary), buyTogetherServiceView.getRadius()));
            return buyTogetherServiceView;
        }
    }

    BuyTogetherServiceAdapterDelegateKt$buyTogetherServiceAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<BuyTogetherServiceView> invoke(LayoutInflater layoutInflater, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new TypedViewBinding<>(new AnonymousClass1(parent));
    }
}
