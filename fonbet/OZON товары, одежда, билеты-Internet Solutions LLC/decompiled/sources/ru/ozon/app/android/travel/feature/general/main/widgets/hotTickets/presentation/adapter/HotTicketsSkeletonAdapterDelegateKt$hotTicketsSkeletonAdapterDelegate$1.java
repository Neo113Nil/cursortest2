package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.databinding.ItemHotTicketsShimmerBinding;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/databinding/ItemHotTicketsShimmerBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotTicketsSkeletonAdapterDelegateKt$hotTicketsSkeletonAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, ItemHotTicketsShimmerBinding> {
    public static final HotTicketsSkeletonAdapterDelegateKt$hotTicketsSkeletonAdapterDelegate$1 INSTANCE = new HotTicketsSkeletonAdapterDelegateKt$hotTicketsSkeletonAdapterDelegate$1();

    HotTicketsSkeletonAdapterDelegateKt$hotTicketsSkeletonAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ItemHotTicketsShimmerBinding invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(root, "root");
        ItemHotTicketsShimmerBinding inflate = ItemHotTicketsShimmerBinding.inflate(layoutInflater, root, false);
        ConstraintLayoutWithBorder constraintLayoutWithBorder = inflate.hotTicketsSkeletonsRoot;
        Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        constraintLayoutWithBorder.setLayoutParams(new ViewGroup.LayoutParams(UiExtKt.toPx(320, context), -2));
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return inflate;
    }
}
